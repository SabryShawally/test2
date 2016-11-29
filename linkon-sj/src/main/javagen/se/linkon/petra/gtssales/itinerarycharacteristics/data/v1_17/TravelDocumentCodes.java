
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.StringCodeType;


/**
 * <p>Java class for TravelDocumentCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDocumentCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelDocument" type="{http://petra.linkon.se/commonelements/data/v4_6}StringCodeType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDocumentCodes", propOrder = {
    "travelDocument"
})
public class TravelDocumentCodes
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TravelDocument", required = true)
    protected List<StringCodeType> travelDocument;

    /**
     * Gets the value of the travelDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringCodeType }
     * 
     * 
     */
    public List<StringCodeType> getTravelDocument() {
        if (travelDocument == null) {
            travelDocument = new ArrayList<StringCodeType>();
        }
        return this.travelDocument;
    }

    public boolean isSetTravelDocument() {
        return ((this.travelDocument!= null)&&(!this.travelDocument.isEmpty()));
    }

    public void unsetTravelDocument() {
        this.travelDocument = null;
    }

}
