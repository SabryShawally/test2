
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the lists of the different kinds of placement options.
 * 			
 * 
 * <p>Java class for PlacementOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlacementCharacteristicsList" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}PlacementCharacteristicsListType"/&gt;
 *         &lt;element name="PlacementOrientationList" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}PlacementOrientationListType"/&gt;
 *         &lt;element name="CompartmentList" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}CompartmentListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementOptionsType", propOrder = {
    "placementCharacteristicsList",
    "placementOrientationList",
    "compartmentList"
})
public class PlacementOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementCharacteristicsList", required = true)
    protected PlacementCharacteristicsListType placementCharacteristicsList;
    @XmlElement(name = "PlacementOrientationList", required = true)
    protected PlacementOrientationListType placementOrientationList;
    @XmlElement(name = "CompartmentList", required = true)
    protected CompartmentListType compartmentList;

    /**
     * Gets the value of the placementCharacteristicsList property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementCharacteristicsListType }
     *     
     */
    public PlacementCharacteristicsListType getPlacementCharacteristicsList() {
        return placementCharacteristicsList;
    }

    /**
     * Sets the value of the placementCharacteristicsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementCharacteristicsListType }
     *     
     */
    public void setPlacementCharacteristicsList(PlacementCharacteristicsListType value) {
        this.placementCharacteristicsList = value;
    }

    public boolean isSetPlacementCharacteristicsList() {
        return (this.placementCharacteristicsList!= null);
    }

    /**
     * Gets the value of the placementOrientationList property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementOrientationListType }
     *     
     */
    public PlacementOrientationListType getPlacementOrientationList() {
        return placementOrientationList;
    }

    /**
     * Sets the value of the placementOrientationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementOrientationListType }
     *     
     */
    public void setPlacementOrientationList(PlacementOrientationListType value) {
        this.placementOrientationList = value;
    }

    public boolean isSetPlacementOrientationList() {
        return (this.placementOrientationList!= null);
    }

    /**
     * Gets the value of the compartmentList property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentListType }
     *     
     */
    public CompartmentListType getCompartmentList() {
        return compartmentList;
    }

    /**
     * Sets the value of the compartmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentListType }
     *     
     */
    public void setCompartmentList(CompartmentListType value) {
        this.compartmentList = value;
    }

    public boolean isSetCompartmentList() {
        return (this.compartmentList!= null);
    }

}
