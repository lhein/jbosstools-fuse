//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 02:37:57 PM EST 
//


package org.jboss.mapper.camel.spring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for failoverLoadBalancerDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="failoverLoadBalancerDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}loadBalancer">
 *       &lt;sequence>
 *         &lt;element name="exception" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roundRobin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maximumFailoverAttempts" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "failoverLoadBalancerDefinition", propOrder = {
    "exception"
})
public class FailoverLoadBalancerDefinition
    extends LoadBalancer
{

    protected List<String> exception;
    @XmlAttribute(name = "roundRobin")
    protected Boolean roundRobin;
    @XmlAttribute(name = "maximumFailoverAttempts")
    protected Integer maximumFailoverAttempts;

    /**
     * Gets the value of the exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getException() {
        if (exception == null) {
            exception = new ArrayList<String>();
        }
        return this.exception;
    }

    /**
     * Gets the value of the roundRobin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoundRobin() {
        return roundRobin;
    }

    /**
     * Sets the value of the roundRobin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoundRobin(Boolean value) {
        this.roundRobin = value;
    }

    /**
     * Gets the value of the maximumFailoverAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumFailoverAttempts() {
        return maximumFailoverAttempts;
    }

    /**
     * Sets the value of the maximumFailoverAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumFailoverAttempts(Integer value) {
        this.maximumFailoverAttempts = value;
    }

}
