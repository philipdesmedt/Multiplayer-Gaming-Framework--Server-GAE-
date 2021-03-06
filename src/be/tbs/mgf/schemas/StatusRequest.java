//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.25 at 07:11:03 PM CET 
//


package be.tbs.mgf.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tbs.be/mgf/schemas}Request">
 *       &lt;sequence>
 *         &lt;element name="Player" type="{http://www.tbs.be/mgf/schemas}PlayerDescriptor"/>
 *         &lt;element name="Property" type="{http://www.tbs.be/mgf/schemas}StatusProperty"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "player",
    "property"
})
@XmlRootElement(name = "StatusRequest")
public class StatusRequest
    extends Request
{

    @XmlElement(name = "Player", required = true)
    protected PlayerDescriptor player;
    @XmlElement(name = "Property", required = true)
    protected StatusProperty property;

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerDescriptor }
     *     
     */
    public PlayerDescriptor getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerDescriptor }
     *     
     */
    public void setPlayer(PlayerDescriptor value) {
        this.player = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link StatusProperty }
     *     
     */
    public StatusProperty getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusProperty }
     *     
     */
    public void setProperty(StatusProperty value) {
        this.property = value;
    }

}
