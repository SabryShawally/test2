
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * <p>Java class for PlacementPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SegmentReference"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PlacementPrice" type="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVatType"/&gt;
 *           &lt;element name="IncludedInServiceBasePrice" type="{http://petra.linkon.se/commonelements/data/v4_6}EmptyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementPriceDescriptionType", propOrder = {
    "segmentReference",
    "placementPrice",
    "includedInServiceBasePrice"
})
public class PlacementPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SegmentReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int segmentReference;
    @XmlElement(name = "PlacementPrice")
    protected PriceVatType placementPrice;
    @XmlElement(name = "IncludedInServiceBasePrice")
    protected EmptyType includedInServiceBasePrice;

    /**
     * Gets the value of the segmentReference property.
     * 
     */
    public int getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     */
    public void setSegmentReference(int value) {
        this.segmentReference = value;
    }

    public boolean isSetSegmentReference() {
        return true;
    }

    /**
     * Gets the value of the placementPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getPlacementPrice() {
        return placementPrice;
    }

    /**
     * Sets the value of the placementPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setPlacementPrice(PriceVatType value) {
        this.placementPrice = value;
    }

    public boolean isSetPlacementPrice() {
        return (this.placementPrice!= null);
    }

    /**
     * Gets the value of the includedInServiceBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIncludedInServiceBasePrice() {
        return includedInServiceBasePrice;
    }

    /**
     * Sets the value of the includedInServiceBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIncludedInServiceBasePrice(EmptyType value) {
        this.includedInServiceBasePrice = value;
    }

    public boolean isSetIncludedInServiceBasePrice() {
        return (this.includedInServiceBasePrice!= null);
    }

}
