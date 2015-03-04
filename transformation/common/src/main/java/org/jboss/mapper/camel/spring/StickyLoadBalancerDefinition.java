//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 02:37:57 PM EST 
//


package org.jboss.mapper.camel.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stickyLoadBalancerDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stickyLoadBalancerDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}loadBalancer">
 *       &lt;sequence>
 *         &lt;element name="correlationExpression" type="{http://camel.apache.org/schema/spring}expressionSubElementDefinition"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stickyLoadBalancerDefinition", propOrder = {
    "correlationExpression"
})
public class StickyLoadBalancerDefinition
    extends LoadBalancer
{

    @XmlElement(required = true)
    protected ExpressionSubElementDefinition correlationExpression;

    /**
     * Gets the value of the correlationExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public ExpressionSubElementDefinition getCorrelationExpression() {
        return correlationExpression;
    }

    /**
     * Sets the value of the correlationExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public void setCorrelationExpression(ExpressionSubElementDefinition value) {
        this.correlationExpression = value;
    }

}
