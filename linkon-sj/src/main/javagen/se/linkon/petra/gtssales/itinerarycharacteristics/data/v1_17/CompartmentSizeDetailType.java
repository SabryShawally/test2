
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;
import se.linkon.petra.commonelements.data.v4_6.StringCodeType;


/**
 * <p>Java class for CompartmentSizeDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompartmentSizeDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultItem" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentSize" type="{http://petra.linkon.se/commonelements/data/v4_6}StringCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentSizeDetailType", propOrder = {
    "defaultItem",
    "compartmentSize"
})
public class CompartmentSizeDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DefaultItem")
    protected EmptyType defaultItem;
    @XmlElement(name = "CompartmentSize", required = true)
    protected StringCodeType compartmentSize;

    /**
     * Gets the value of the defaultItem property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getDefaultItem() {
        return defaultItem;
    }

    /**
     * Sets the value of the defaultItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setDefaultItem(EmptyType value) {
        this.defaultItem = value;
    }

    public boolean isSetDefaultItem() {
        return (this.defaultItem!= null);
    }

    /**
     * Gets the value of the compartmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link StringCodeType }
     *     
     */
    public StringCodeType getCompartmentSize() {
        return compartmentSize;
    }

    /**
     * Sets the value of the compartmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringCodeType }
     *     
     */
    public void setCompartmentSize(StringCodeType value) {
        this.compartmentSize = value;
    }

    public boolean isSetCompartmentSize() {
        return (this.compartmentSize!= null);
    }

}
