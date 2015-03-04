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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routeDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}processorDefinition">
 *       &lt;sequence>
 *         &lt;element ref="{http://camel.apache.org/schema/spring}from" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://camel.apache.org/schema/spring}aop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}aggregate"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}bean"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doCatch"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}when"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}choice"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}otherwise"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}convertBodyTo"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}delay"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}dynamicRouter"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}enrich"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}filter"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doFinally"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}idempotentConsumer"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}inOnly"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}inOut"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}intercept"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}interceptFrom"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}interceptToEndpoint"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}loadBalance"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}log"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}loop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}marshal"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}multicast"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}onCompletion"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}onException"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}pipeline"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}policy"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}pollEnrich"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}process"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}recipientList"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeHeaders"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeProperty"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}resequence"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}rollback"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}route"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}routingSlip"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}sample"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setBody"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setExchangePattern"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setFaultBody"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setOutHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setProperty"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}sort"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}split"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}stop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}threads"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}throttle"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}throwException"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}to"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}transacted"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}transform"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doTry"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}unmarshal"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}validate"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}wireTap"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}restBinding"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="autoStartup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorHandlerRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleFault" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageHistory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="routePolicyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shutdownRoute" type="{http://camel.apache.org/schema/spring}shutdownRoute" />
 *       &lt;attribute name="shutdownRunningTask" type="{http://camel.apache.org/schema/spring}shutdownRunningTask" />
 *       &lt;attribute name="startupOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="streamCache" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeDefinition", propOrder = {
    "from",
    "aopOrAggregateOrBean"
})
public class RouteDefinition
    extends ProcessorDefinition
{

    protected List<FromDefinition> from;
    @XmlElements({
        @XmlElement(name = "aop", type = AopDefinition.class),
        @XmlElement(name = "aggregate", type = AggregateDefinition.class),
        @XmlElement(name = "bean", type = BeanDefinition.class),
        @XmlElement(name = "doCatch", type = CatchDefinition.class),
        @XmlElement(name = "when", type = WhenDefinition.class),
        @XmlElement(name = "choice", type = ChoiceDefinition.class),
        @XmlElement(name = "otherwise", type = OtherwiseDefinition.class),
        @XmlElement(name = "convertBodyTo", type = ConvertBodyDefinition.class),
        @XmlElement(name = "delay", type = DelayDefinition.class),
        @XmlElement(name = "dynamicRouter", type = DynamicRouterDefinition.class),
        @XmlElement(name = "enrich", type = EnrichDefinition.class),
        @XmlElement(name = "filter", type = FilterDefinition.class),
        @XmlElement(name = "doFinally", type = FinallyDefinition.class),
        @XmlElement(name = "idempotentConsumer", type = IdempotentConsumerDefinition.class),
        @XmlElement(name = "inOnly", type = InOnlyDefinition.class),
        @XmlElement(name = "inOut", type = InOutDefinition.class),
        @XmlElement(name = "intercept", type = InterceptDefinition.class),
        @XmlElement(name = "interceptFrom", type = InterceptFromDefinition.class),
        @XmlElement(name = "interceptToEndpoint", type = InterceptSendToEndpointDefinition.class),
        @XmlElement(name = "loadBalance", type = LoadBalanceDefinition.class),
        @XmlElement(name = "log", type = LogDefinition.class),
        @XmlElement(name = "loop", type = LoopDefinition.class),
        @XmlElement(name = "marshal", type = MarshalDefinition.class),
        @XmlElement(name = "multicast", type = MulticastDefinition.class),
        @XmlElement(name = "onCompletion", type = OnCompletionDefinition.class),
        @XmlElement(name = "onException", type = OnExceptionDefinition.class),
        @XmlElement(name = "pipeline", type = PipelineDefinition.class),
        @XmlElement(name = "policy", type = PolicyDefinition.class),
        @XmlElement(name = "pollEnrich", type = PollEnrichDefinition.class),
        @XmlElement(name = "process", type = ProcessDefinition.class),
        @XmlElement(name = "recipientList", type = RecipientListDefinition.class),
        @XmlElement(name = "removeHeader", type = RemoveHeaderDefinition.class),
        @XmlElement(name = "removeHeaders", type = RemoveHeadersDefinition.class),
        @XmlElement(name = "removeProperty", type = RemovePropertyDefinition.class),
        @XmlElement(name = "resequence", type = ResequenceDefinition.class),
        @XmlElement(name = "rollback", type = RollbackDefinition.class),
        @XmlElement(name = "route", type = RouteDefinition.class),
        @XmlElement(name = "routingSlip", type = RoutingSlipDefinition.class),
        @XmlElement(name = "sample", type = SamplingDefinition.class),
        @XmlElement(name = "setBody", type = SetBodyDefinition.class),
        @XmlElement(name = "setExchangePattern", type = SetExchangePatternDefinition.class),
        @XmlElement(name = "setFaultBody", type = SetFaultBodyDefinition.class),
        @XmlElement(name = "setHeader", type = SetHeaderDefinition.class),
        @XmlElement(name = "setOutHeader", type = SetOutHeaderDefinition.class),
        @XmlElement(name = "setProperty", type = SetPropertyDefinition.class),
        @XmlElement(name = "sort", type = SortDefinition.class),
        @XmlElement(name = "split", type = SplitDefinition.class),
        @XmlElement(name = "stop", type = StopDefinition.class),
        @XmlElement(name = "threads", type = ThreadsDefinition.class),
        @XmlElement(name = "throttle", type = ThrottleDefinition.class),
        @XmlElement(name = "throwException", type = ThrowExceptionDefinition.class),
        @XmlElement(name = "to", type = ToDefinition.class),
        @XmlElement(name = "transacted", type = TransactedDefinition.class),
        @XmlElement(name = "transform", type = TransformDefinition.class),
        @XmlElement(name = "doTry", type = TryDefinition.class),
        @XmlElement(name = "unmarshal", type = UnmarshalDefinition.class),
        @XmlElement(name = "validate", type = ValidateDefinition.class),
        @XmlElement(name = "wireTap", type = WireTapDefinition.class),
        @XmlElement(name = "restBinding", type = RestBindingDefinition.class)
    })
    protected List<ProcessorDefinition> aopOrAggregateOrBean;
    @XmlAttribute(name = "autoStartup")
    protected String autoStartup;
    @XmlAttribute(name = "delayer")
    protected String delayer;
    @XmlAttribute(name = "errorHandlerRef")
    protected String errorHandlerRef;
    @XmlAttribute(name = "group")
    protected String group;
    @XmlAttribute(name = "handleFault")
    protected String handleFault;
    @XmlAttribute(name = "messageHistory")
    protected String messageHistory;
    @XmlAttribute(name = "rest")
    protected Boolean rest;
    @XmlAttribute(name = "routePolicyRef")
    protected String routePolicyRef;
    @XmlAttribute(name = "shutdownRoute")
    protected ShutdownRoute shutdownRoute;
    @XmlAttribute(name = "shutdownRunningTask")
    protected ShutdownRunningTask shutdownRunningTask;
    @XmlAttribute(name = "startupOrder")
    protected Integer startupOrder;
    @XmlAttribute(name = "streamCache")
    protected String streamCache;
    @XmlAttribute(name = "trace")
    protected String trace;

    /**
     * Gets the value of the from property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the from property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FromDefinition }
     * 
     * 
     */
    public List<FromDefinition> getFrom() {
        if (from == null) {
            from = new ArrayList<FromDefinition>();
        }
        return this.from;
    }

    /**
     * Gets the value of the aopOrAggregateOrBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aopOrAggregateOrBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAopOrAggregateOrBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AopDefinition }
     * {@link AggregateDefinition }
     * {@link BeanDefinition }
     * {@link CatchDefinition }
     * {@link WhenDefinition }
     * {@link ChoiceDefinition }
     * {@link OtherwiseDefinition }
     * {@link ConvertBodyDefinition }
     * {@link DelayDefinition }
     * {@link DynamicRouterDefinition }
     * {@link EnrichDefinition }
     * {@link FilterDefinition }
     * {@link FinallyDefinition }
     * {@link IdempotentConsumerDefinition }
     * {@link InOnlyDefinition }
     * {@link InOutDefinition }
     * {@link InterceptDefinition }
     * {@link InterceptFromDefinition }
     * {@link InterceptSendToEndpointDefinition }
     * {@link LoadBalanceDefinition }
     * {@link LogDefinition }
     * {@link LoopDefinition }
     * {@link MarshalDefinition }
     * {@link MulticastDefinition }
     * {@link OnCompletionDefinition }
     * {@link OnExceptionDefinition }
     * {@link PipelineDefinition }
     * {@link PolicyDefinition }
     * {@link PollEnrichDefinition }
     * {@link ProcessDefinition }
     * {@link RecipientListDefinition }
     * {@link RemoveHeaderDefinition }
     * {@link RemoveHeadersDefinition }
     * {@link RemovePropertyDefinition }
     * {@link ResequenceDefinition }
     * {@link RollbackDefinition }
     * {@link RouteDefinition }
     * {@link RoutingSlipDefinition }
     * {@link SamplingDefinition }
     * {@link SetBodyDefinition }
     * {@link SetExchangePatternDefinition }
     * {@link SetFaultBodyDefinition }
     * {@link SetHeaderDefinition }
     * {@link SetOutHeaderDefinition }
     * {@link SetPropertyDefinition }
     * {@link SortDefinition }
     * {@link SplitDefinition }
     * {@link StopDefinition }
     * {@link ThreadsDefinition }
     * {@link ThrottleDefinition }
     * {@link ThrowExceptionDefinition }
     * {@link ToDefinition }
     * {@link TransactedDefinition }
     * {@link TransformDefinition }
     * {@link TryDefinition }
     * {@link UnmarshalDefinition }
     * {@link ValidateDefinition }
     * {@link WireTapDefinition }
     * {@link RestBindingDefinition }
     * 
     * 
     */
    public List<ProcessorDefinition> getAopOrAggregateOrBean() {
        if (aopOrAggregateOrBean == null) {
            aopOrAggregateOrBean = new ArrayList<ProcessorDefinition>();
        }
        return this.aopOrAggregateOrBean;
    }

    /**
     * Gets the value of the autoStartup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoStartup() {
        return autoStartup;
    }

    /**
     * Sets the value of the autoStartup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoStartup(String value) {
        this.autoStartup = value;
    }

    /**
     * Gets the value of the delayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayer() {
        return delayer;
    }

    /**
     * Sets the value of the delayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayer(String value) {
        this.delayer = value;
    }

    /**
     * Gets the value of the errorHandlerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorHandlerRef() {
        return errorHandlerRef;
    }

    /**
     * Sets the value of the errorHandlerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorHandlerRef(String value) {
        this.errorHandlerRef = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the handleFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleFault() {
        return handleFault;
    }

    /**
     * Sets the value of the handleFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleFault(String value) {
        this.handleFault = value;
    }

    /**
     * Gets the value of the messageHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageHistory() {
        return messageHistory;
    }

    /**
     * Sets the value of the messageHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageHistory(String value) {
        this.messageHistory = value;
    }

    /**
     * Gets the value of the rest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRest() {
        return rest;
    }

    /**
     * Sets the value of the rest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRest(Boolean value) {
        this.rest = value;
    }

    /**
     * Gets the value of the routePolicyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePolicyRef() {
        return routePolicyRef;
    }

    /**
     * Sets the value of the routePolicyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePolicyRef(String value) {
        this.routePolicyRef = value;
    }

    /**
     * Gets the value of the shutdownRoute property.
     * 
     * @return
     *     possible object is
     *     {@link ShutdownRoute }
     *     
     */
    public ShutdownRoute getShutdownRoute() {
        return shutdownRoute;
    }

    /**
     * Sets the value of the shutdownRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShutdownRoute }
     *     
     */
    public void setShutdownRoute(ShutdownRoute value) {
        this.shutdownRoute = value;
    }

    /**
     * Gets the value of the shutdownRunningTask property.
     * 
     * @return
     *     possible object is
     *     {@link ShutdownRunningTask }
     *     
     */
    public ShutdownRunningTask getShutdownRunningTask() {
        return shutdownRunningTask;
    }

    /**
     * Sets the value of the shutdownRunningTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShutdownRunningTask }
     *     
     */
    public void setShutdownRunningTask(ShutdownRunningTask value) {
        this.shutdownRunningTask = value;
    }

    /**
     * Gets the value of the startupOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartupOrder() {
        return startupOrder;
    }

    /**
     * Sets the value of the startupOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartupOrder(Integer value) {
        this.startupOrder = value;
    }

    /**
     * Gets the value of the streamCache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamCache() {
        return streamCache;
    }

    /**
     * Sets the value of the streamCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamCache(String value) {
        this.streamCache = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrace(String value) {
        this.trace = value;
    }

}
