
package se.linkon.petra.gtssales.transportactions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditActionPlacementDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditActionPlacementDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditActionPlacementDescription" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}EditActionPlacementDescriptionType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PlacementOrientationList" type="{http://petra.linkon.se/gtssales/transportactions/data/v1_17}PlacementOrientationDetail" minOccurs="0"/&gt;
 *         &lt;element name="TotalSeats" type="{http://petra.linkon.se/commonelements/data/v4_6}NonNegativeInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditActionPlacementDescriptionsType", propOrder = {
    "editActionPlacementDescription",
    "placementOrientationList",
    "totalSeats"
})
public class EditActionPlacementDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "EditActionPlacementDescription", required = true)
    protected List<EditActionPlacementDescriptionType> editActionPlacementDescription;
    @XmlElement(name = "PlacementOrientationList")
    protected PlacementOrientationDetail placementOrientationList;
    @XmlElement(name = "TotalSeats")
    protected int totalSeats;

    /**
     * Gets the value of the editActionPlacementDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editActionPlacementDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditActionPlacementDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditActionPlacementDescriptionType }
     * 
     * 
     */
    public List<EditActionPlacementDescriptionType> getEditActionPlacementDescription() {
        if (editActionPlacementDescription == null) {
            editActionPlacementDescription = new ArrayList<EditActionPlacementDescriptionType>();
        }
        return this.editActionPlacementDescription;
    }

    public boolean isSetEditActionPlacementDescription() {
        return ((this.editActionPlacementDescription!= null)&&(!this.editActionPlacementDescription.isEmpty()));
    }

    public void unsetEditActionPlacementDescription() {
        this.editActionPlacementDescription = null;
    }

    /**
     * Gets the value of the placementOrientationList property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementOrientationDetail }
     *     
     */
    public PlacementOrientationDetail getPlacementOrientationList() {
        return placementOrientationList;
    }

    /**
     * Sets the value of the placementOrientationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementOrientationDetail }
     *     
     */
    public void setPlacementOrientationList(PlacementOrientationDetail value) {
        this.placementOrientationList = value;
    }

    public boolean isSetPlacementOrientationList() {
        return (this.placementOrientationList!= null);
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

}
