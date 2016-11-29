
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SectionTravelDocumentCodeDatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionTravelDocumentCodeDatas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SectionTravelDocumentCodeData" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}SectionTravelDocumentCodeData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionTravelDocumentCodeDatas", propOrder = {
    "sectionTravelDocumentCodeData"
})
public class SectionTravelDocumentCodeDatas
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SectionTravelDocumentCodeData", required = true)
    protected List<SectionTravelDocumentCodeData> sectionTravelDocumentCodeData;

    /**
     * Gets the value of the sectionTravelDocumentCodeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionTravelDocumentCodeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionTravelDocumentCodeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionTravelDocumentCodeData }
     * 
     * 
     */
    public List<SectionTravelDocumentCodeData> getSectionTravelDocumentCodeData() {
        if (sectionTravelDocumentCodeData == null) {
            sectionTravelDocumentCodeData = new ArrayList<SectionTravelDocumentCodeData>();
        }
        return this.sectionTravelDocumentCodeData;
    }

    public boolean isSetSectionTravelDocumentCodeData() {
        return ((this.sectionTravelDocumentCodeData!= null)&&(!this.sectionTravelDocumentCodeData.isEmpty()));
    }

    public void unsetSectionTravelDocumentCodeData() {
        this.sectionTravelDocumentCodeData = null;
    }

}
