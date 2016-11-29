
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element name="ItineraryDescription" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}ItineraryDescriptionType"/&gt;
 *         &lt;element name="PlacementDeviationDescriptions" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}PlacementDeviationDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="LostOptionsDescription" type="{http://petra.linkon.se/gtssales/changedeparture/data/v1_17}LostOptionsDescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDescriptionType", propOrder = {
    "orderItemId",
    "itineraryDescription",
    "placementDeviationDescriptions",
    "lostOptionsDescription"
})
public class OrderItemDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "ItineraryDescription", required = true)
    protected ItineraryDescriptionType itineraryDescription;
    @XmlElement(name = "PlacementDeviationDescriptions")
    protected PlacementDeviationDescriptionsType placementDeviationDescriptions;
    @XmlElement(name = "LostOptionsDescription")
    protected LostOptionsDescriptionType lostOptionsDescription;

    /**
     * Gets the value of the orderItemId property.
     * 
     */
    public int getOrderItemId() {
        return orderItemId;
    }

    /**
     * Sets the value of the orderItemId property.
     * 
     */
    public void setOrderItemId(int value) {
        this.orderItemId = value;
    }

    public boolean isSetOrderItemId() {
        return true;
    }

    /**
     * Gets the value of the itineraryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryDescriptionType }
     *     
     */
    public ItineraryDescriptionType getItineraryDescription() {
        return itineraryDescription;
    }

    /**
     * Sets the value of the itineraryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryDescriptionType }
     *     
     */
    public void setItineraryDescription(ItineraryDescriptionType value) {
        this.itineraryDescription = value;
    }

    public boolean isSetItineraryDescription() {
        return (this.itineraryDescription!= null);
    }

    /**
     * Gets the value of the placementDeviationDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementDeviationDescriptionsType }
     *     
     */
    public PlacementDeviationDescriptionsType getPlacementDeviationDescriptions() {
        return placementDeviationDescriptions;
    }

    /**
     * Sets the value of the placementDeviationDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementDeviationDescriptionsType }
     *     
     */
    public void setPlacementDeviationDescriptions(PlacementDeviationDescriptionsType value) {
        this.placementDeviationDescriptions = value;
    }

    public boolean isSetPlacementDeviationDescriptions() {
        return (this.placementDeviationDescriptions!= null);
    }

    /**
     * Gets the value of the lostOptionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LostOptionsDescriptionType }
     *     
     */
    public LostOptionsDescriptionType getLostOptionsDescription() {
        return lostOptionsDescription;
    }

    /**
     * Sets the value of the lostOptionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LostOptionsDescriptionType }
     *     
     */
    public void setLostOptionsDescription(LostOptionsDescriptionType value) {
        this.lostOptionsDescription = value;
    }

    public boolean isSetLostOptionsDescription() {
        return (this.lostOptionsDescription!= null);
    }

}
