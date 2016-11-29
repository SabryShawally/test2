
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SmokingDepartmentDetailList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}SmokingDepartmentDetail" minOccurs="0"/&gt;
 *         &lt;element name="PlacementSpecificationList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}PlacementSpecificationDetail" minOccurs="0"/&gt;
 *         &lt;element name="PlacementOrientationList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}PlacementOrientationDetail" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentTypeList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}CompartmentTypeDetail" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentSizeList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}CompartmentSizeDetail" minOccurs="0"/&gt;
 *         &lt;element name="PriceLevelList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}PriceLevelDetail" minOccurs="0"/&gt;
 *         &lt;element name="TravelTypeList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}TravelTypeDetail" minOccurs="0"/&gt;
 *         &lt;element name="SectionTravelDocumentCodeInfoList" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}SectionTravelDocumentCodeDatas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "smokingDepartmentDetailList",
    "placementSpecificationList",
    "placementOrientationList",
    "compartmentTypeList",
    "compartmentSizeList",
    "priceLevelList",
    "travelTypeList",
    "sectionTravelDocumentCodeInfoList"
})
@XmlRootElement(name = "GetItineraryCharacteristicsResponse")
public class GetItineraryCharacteristicsResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SmokingDepartmentDetailList")
    protected SmokingDepartmentDetail smokingDepartmentDetailList;
    @XmlElement(name = "PlacementSpecificationList")
    protected PlacementSpecificationDetail placementSpecificationList;
    @XmlElement(name = "PlacementOrientationList")
    protected PlacementOrientationDetail placementOrientationList;
    @XmlElement(name = "CompartmentTypeList")
    protected CompartmentTypeDetail compartmentTypeList;
    @XmlElement(name = "CompartmentSizeList")
    protected CompartmentSizeDetail compartmentSizeList;
    @XmlElement(name = "PriceLevelList")
    protected PriceLevelDetail priceLevelList;
    @XmlElement(name = "TravelTypeList")
    protected TravelTypeDetail travelTypeList;
    @XmlElement(name = "SectionTravelDocumentCodeInfoList")
    protected SectionTravelDocumentCodeDatas sectionTravelDocumentCodeInfoList;

    /**
     * Gets the value of the smokingDepartmentDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link SmokingDepartmentDetail }
     *     
     */
    public SmokingDepartmentDetail getSmokingDepartmentDetailList() {
        return smokingDepartmentDetailList;
    }

    /**
     * Sets the value of the smokingDepartmentDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmokingDepartmentDetail }
     *     
     */
    public void setSmokingDepartmentDetailList(SmokingDepartmentDetail value) {
        this.smokingDepartmentDetailList = value;
    }

    public boolean isSetSmokingDepartmentDetailList() {
        return (this.smokingDepartmentDetailList!= null);
    }

    /**
     * Gets the value of the placementSpecificationList property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementSpecificationDetail }
     *     
     */
    public PlacementSpecificationDetail getPlacementSpecificationList() {
        return placementSpecificationList;
    }

    /**
     * Sets the value of the placementSpecificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementSpecificationDetail }
     *     
     */
    public void setPlacementSpecificationList(PlacementSpecificationDetail value) {
        this.placementSpecificationList = value;
    }

    public boolean isSetPlacementSpecificationList() {
        return (this.placementSpecificationList!= null);
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
     * Gets the value of the compartmentTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentTypeDetail }
     *     
     */
    public CompartmentTypeDetail getCompartmentTypeList() {
        return compartmentTypeList;
    }

    /**
     * Sets the value of the compartmentTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentTypeDetail }
     *     
     */
    public void setCompartmentTypeList(CompartmentTypeDetail value) {
        this.compartmentTypeList = value;
    }

    public boolean isSetCompartmentTypeList() {
        return (this.compartmentTypeList!= null);
    }

    /**
     * Gets the value of the compartmentSizeList property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentSizeDetail }
     *     
     */
    public CompartmentSizeDetail getCompartmentSizeList() {
        return compartmentSizeList;
    }

    /**
     * Sets the value of the compartmentSizeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentSizeDetail }
     *     
     */
    public void setCompartmentSizeList(CompartmentSizeDetail value) {
        this.compartmentSizeList = value;
    }

    public boolean isSetCompartmentSizeList() {
        return (this.compartmentSizeList!= null);
    }

    /**
     * Gets the value of the priceLevelList property.
     * 
     * @return
     *     possible object is
     *     {@link PriceLevelDetail }
     *     
     */
    public PriceLevelDetail getPriceLevelList() {
        return priceLevelList;
    }

    /**
     * Sets the value of the priceLevelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceLevelDetail }
     *     
     */
    public void setPriceLevelList(PriceLevelDetail value) {
        this.priceLevelList = value;
    }

    public boolean isSetPriceLevelList() {
        return (this.priceLevelList!= null);
    }

    /**
     * Gets the value of the travelTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTypeDetail }
     *     
     */
    public TravelTypeDetail getTravelTypeList() {
        return travelTypeList;
    }

    /**
     * Sets the value of the travelTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTypeDetail }
     *     
     */
    public void setTravelTypeList(TravelTypeDetail value) {
        this.travelTypeList = value;
    }

    public boolean isSetTravelTypeList() {
        return (this.travelTypeList!= null);
    }

    /**
     * Gets the value of the sectionTravelDocumentCodeInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link SectionTravelDocumentCodeDatas }
     *     
     */
    public SectionTravelDocumentCodeDatas getSectionTravelDocumentCodeInfoList() {
        return sectionTravelDocumentCodeInfoList;
    }

    /**
     * Sets the value of the sectionTravelDocumentCodeInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionTravelDocumentCodeDatas }
     *     
     */
    public void setSectionTravelDocumentCodeInfoList(SectionTravelDocumentCodeDatas value) {
        this.sectionTravelDocumentCodeInfoList = value;
    }

    public boolean isSetSectionTravelDocumentCodeInfoList() {
        return (this.sectionTravelDocumentCodeInfoList!= null);
    }

}
