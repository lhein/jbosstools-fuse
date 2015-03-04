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
 * <p>Java class for restDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}optionalIdentifiedDefinition">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://camel.apache.org/schema/spring}verb"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}delete"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}get"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}head"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}post"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}put"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="produces" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bindingMode" type="{http://camel.apache.org/schema/spring}restBindingMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restDefinition", propOrder = {
    "verbOrDeleteOrGet"
})
public class RestDefinition
    extends OptionalIdentifiedDefinition
{

    @XmlElements({
        @XmlElement(name = "verb"),
        @XmlElement(name = "delete", type = DeleteVerbDefinition.class),
        @XmlElement(name = "get", type = GetVerbDefinition.class),
        @XmlElement(name = "head", type = HeadVerbDefinition.class),
        @XmlElement(name = "post", type = PostVerbDefinition.class),
        @XmlElement(name = "put", type = PutVerbDefinition.class)
    })
    protected List<VerbDefinition> verbOrDeleteOrGet;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "consumes")
    protected String consumes;
    @XmlAttribute(name = "produces")
    protected String produces;
    @XmlAttribute(name = "bindingMode")
    protected RestBindingMode bindingMode;

    /**
     * Gets the value of the verbOrDeleteOrGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verbOrDeleteOrGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerbOrDeleteOrGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerbDefinition }
     * {@link DeleteVerbDefinition }
     * {@link GetVerbDefinition }
     * {@link HeadVerbDefinition }
     * {@link PostVerbDefinition }
     * {@link PutVerbDefinition }
     * 
     * 
     */
    public List<VerbDefinition> getVerbOrDeleteOrGet() {
        if (verbOrDeleteOrGet == null) {
            verbOrDeleteOrGet = new ArrayList<VerbDefinition>();
        }
        return this.verbOrDeleteOrGet;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the consumes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumes() {
        return consumes;
    }

    /**
     * Sets the value of the consumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumes(String value) {
        this.consumes = value;
    }

    /**
     * Gets the value of the produces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduces() {
        return produces;
    }

    /**
     * Sets the value of the produces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduces(String value) {
        this.produces = value;
    }

    /**
     * Gets the value of the bindingMode property.
     * 
     * @return
     *     possible object is
     *     {@link RestBindingMode }
     *     
     */
    public RestBindingMode getBindingMode() {
        return bindingMode;
    }

    /**
     * Sets the value of the bindingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestBindingMode }
     *     
     */
    public void setBindingMode(RestBindingMode value) {
        this.bindingMode = value;
    }

}
