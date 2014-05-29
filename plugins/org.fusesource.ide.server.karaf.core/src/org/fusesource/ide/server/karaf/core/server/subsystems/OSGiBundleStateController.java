/*******************************************************************************
 * Copyright (c) 2014 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.fusesource.ide.server.karaf.core.server.subsystems;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.management.MBeanServerConnection;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import javax.management.openmbean.CompositeData;
import javax.management.openmbean.TabularData;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IServer;
import org.fusesource.ide.server.karaf.core.server.KarafServerDelegate;
import org.fusesource.ide.server.karaf.core.util.KarafUtils;
import org.jboss.ide.eclipse.as.wtp.core.server.behavior.AbstractSubsystemController;
import org.jboss.ide.eclipse.as.wtp.core.server.behavior.IModuleStateController;

/**
 * this module state controller uses the osgi.core framework mbean to query bundle states
 * 
 * @author lhein
 */
public class OSGiBundleStateController extends AbstractSubsystemController implements IModuleStateController{

	private static final String OSGI_FRAMEWORK_MBEAN = "osgi.core:type=framework,*";
	private static final String OSGI_BUNDLESTATE_MBEAN = "osgi.core:type=bundleState,*";

	protected JMXServiceURL url;
	protected JMXConnector jmxc;
	protected MBeanServerConnection mbsc;
	protected ObjectName objectNameBundleState;
	protected ObjectName objectNameFramework;
	
	/**
	 * connect to the given server via JMX
	 * 
	 * @param server
	 * @return
	 */
	protected boolean connect() {
		KarafServerDelegate del = (KarafServerDelegate)getServer().loadAdapter(KarafServerDelegate.class, new NullProgressMonitor());
		Map<String, Object> envMap = new HashMap<String, Object>();
		envMap.put("jmx.remote.credentials", new String[] { del.getUserName(), del.getPassword() });
		try {
			String conUrl = KarafUtils.getJMXConnectionURL(getServer());
			this.url = new JMXServiceURL(conUrl); 
			this.jmxc = JMXConnectorFactory.connect(this.url, envMap); 
			this.mbsc = this.jmxc.getMBeanServerConnection(); 	
			
			this.objectNameBundleState = new ObjectName(OSGI_BUNDLESTATE_MBEAN);
	    	this.objectNameFramework = new ObjectName(OSGI_FRAMEWORK_MBEAN);
	    	
	    	Set mbeans = mbsc.queryMBeans(this.objectNameBundleState, null);
	    	if (mbeans.size() != 1) {
		    	// no bundleState mbean found - can't handle the jmx connection
		    	return false;
		    } else {
		    	// remember the mbean
		    	Object oMbean = mbeans.iterator().next();
		    	if (oMbean instanceof ObjectInstance) {
		    		ObjectInstance oi = (ObjectInstance)oMbean;
		    		this.objectNameBundleState = oi.getObjectName();
		    	}
		    }
	    	mbeans = mbsc.queryMBeans(this.objectNameFramework, null); 	    
		    if (mbeans.size() != 1) {
		    	// no framework mbean found - can't handle the jmx connection
		    	return false;
		    } else {
		    	// remember the mbean
		    	Object oMbean = mbeans.iterator().next();
		    	if (oMbean instanceof ObjectInstance) {
		    		ObjectInstance oi = (ObjectInstance)oMbean;
		    		this.objectNameFramework = oi.getObjectName();
		    	}
		    }
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return false;
	}

	/**
	 * disconnect from the server
	 * 
	 * @param server
	 * @return
	 */
	protected boolean disconnect() {
		try {
			if (this.jmxc != null) {
				this.jmxc.close();
			}
			return true;
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			this.jmxc = null;
			this.mbsc = null;
			this.url = null;
		}
		return false;
	}
	
	/**
	 * queries the bundle id of the module deployed in the server
	 * 
	 * @param bundleSymbolicName	the symbolic name
	 * @param version				the version
	 * @return						the bundle id or -1 if not found
	 */
	protected long getBundleId(String bundleSymbolicName, String version) {
		try {
			TabularData tabData = (TabularData)mbsc.invoke(this.objectNameBundleState, "listBundles", null, null);
			final Collection<?> rows = tabData.values();
			for (Object row : rows) {
				if (row instanceof CompositeData) {
					CompositeData cd = (CompositeData) row;
					String bsn = cd.get("SymbolicName").toString();
					String id = cd.get("Identifier").toString();
					String ver = cd.get("Version").toString();
					if (version != null) {
						if (bsn.equals(bundleSymbolicName) && ver.equals(version)) {
							return Long.parseLong(id);
						}	
					} else {
						// if we don't have a version we take the first best
						if (bsn.equals(bundleSymbolicName)) {
							return Long.parseLong(id);
						}
					}
				}
			}
		} catch (Exception ex) {
			// ignore
		}
		return -1;
	}
	
	protected int getBundleStatus(long bundleId) {
		try {
			TabularData tabData = (TabularData)mbsc.invoke(this.objectNameBundleState, "listBundles", null, null);
			final Collection<?> rows = tabData.values();
			for (Object row : rows) {
				if (row instanceof CompositeData) {
					CompositeData cd = (CompositeData) row;
					String id = cd.get("Identifier").toString();
					String state = cd.get("State").toString();
					long longID = Long.parseLong(id); 
					if (bundleId == longID) {
						return OSGiBundleState.getStatusForString(state);
					}	
				}
			}
		} catch (Exception ex) {
			// ignore
		}
		return IServer.STATE_UNKNOWN;
	}
	
	@Override
	public boolean canRestartModule(IModule[] module) {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				int status = getBundleStatus(id);
				// restart is working for states STARTED and STOPPED
				return  status == IServer.STATE_STARTED ||
					    status == IServer.STATE_STOPPED;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	@Override
	public int startModule(IModule[] module, IProgressMonitor monitor)
			throws CoreException {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				this.mbsc.invoke(this.objectNameFramework, "startBundle", new Object[] { id }, new String[] { "long" });	
				return getBundleStatus(id);
			}			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}
		return IServer.STATE_UNKNOWN;
	}

	@Override
	public int stopModule(IModule[] module, IProgressMonitor monitor)
			throws CoreException {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				this.mbsc.invoke(this.objectNameFramework, "stopBundle", new Object[] { id }, new String[] { "long" });	
				return getBundleStatus(id);
			}			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}
		return IServer.STATE_UNKNOWN;
	}

	@Override
	public int restartModule(IModule[] module, IProgressMonitor monitor)
			throws CoreException {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				this.mbsc.invoke(this.objectNameFramework, "updateBundle", new Object[] { id }, new String[] { "long" });	
				return getBundleStatus(id);
			}			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}
		return IServer.STATE_UNKNOWN;
	}

	@Override
	public int getModuleState(IModule[] module, IProgressMonitor monitor) {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				return getBundleStatus(id);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}
		return IServer.STATE_UNKNOWN;
	}

	@Override
	public boolean isModuleStarted(IModule[] module, IProgressMonitor monitor) {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				return getBundleStatus(id) == IServer.STATE_STARTED;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	@Override
	public void waitModuleStarted(IModule[] module, IProgressMonitor monitor) {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				while (getBundleStatus(id) != IServer.STATE_STARTED && !monitor.isCanceled()) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						break;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}		
	}

	@Override
	public void waitModuleStarted(IModule[] module, int maxDelay) {
		try {
			connect();
			String symbolicName = module[0].getProject().getName();
			String version = KarafUtils.getBundleVersion(module[0], null);
			long id = getBundleId(symbolicName, version);
			if (id != -1) {
				long timeWaited = 0L;
				// we take maxDelay as seconds 
				long sleepTime = Math.min(500L, maxDelay * 1000L); // convert to millis
				while (getBundleStatus(id) != IServer.STATE_STARTED && timeWaited <= maxDelay) {
					try {
						Thread.sleep(sleepTime);
						timeWaited += sleepTime;
					} catch (InterruptedException ex) {
						break;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
