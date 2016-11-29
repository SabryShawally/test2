
package se.linkon.petra.gtssales.seatavailability.detail.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.SeatAvailabilityGroupDetailType;


/**
 * <p>Java class for PlacementDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}SeatAvailabilityGroupDetail"/&gt;
 *         &lt;element name="TotalSeats" type="{http://petra.linkon.se/commonelements/data/v4_6}NonNegativeInt"/&gt;
 *         &lt;element name="Placement" type="{http://petra.linkon.se/gtssales/seatavailability/detail/data/v1_17}PlacementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementDescriptionType", propOrder = {
    "seatAvailabilityGroupDetail",
    "totalSeats",
    "placement"
})
public class PlacementDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SeatAvailabilityGroupDetail", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected SeatAvailabilityGroupDetailType seatAvailabilityGroupDetail;
    @XmlElement(name = "TotalSeats")
    protected int totalSeats;
    @XmlElement(name = "Placement", required = true)
    protected List<PlacementType> placement;

    /**
     * Gets the value of the seatAvailabilityGroupDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailabilityGroupDetailType }
     *     
     */
    public SeatAvailabilityGroupDetailType getSeatAvailabilityGroupDetail() {
        return seatAvailabilityGroupDetail;
    }

    /**
     * Sets the value of the seatAvailabilityGroupDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailabilityGroupDetailType }
     *     
     */
    public void setSeatAvailabilityGroupDetail(SeatAvailabilityGroupDetailType value) {
        this.seatAvailabilityGroupDetail = value;
    }

    public boolean isSetSeatAvailabilityGroupDetail() {
        return (this.seatAvailabilityGroupDetail!= null);
    }

    /**
     * Gets the value of the totalSeats property.
     * 
     */
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * Sets the value of the totalSeats property.
     * 
     */
    public void setTotalSeats(int value) {
        this.totalSeats = value;
    }

    public boolean isSetTotalSeats() {
        return true;
    }

    /**
     * Gets the value of the placement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacementType }
     * 
     * 
     */
    public List<PlacementType> getPlacement() {
        if (placement == null) {
            placement = new ArrayList<PlacementType>();
        }
        return this.placement;
    }

    public boolean isSetPlacement() {
        return ((this.placement!= null)&&(!this.placement.isEmpty()));
    }

    public void unsetPlacement() {
        this.placement = null;
    }

}
