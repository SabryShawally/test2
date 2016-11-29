
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.TransportInformationType;


/**
 * <p>Java class for TransportInformationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportInformationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}TransportInformation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportInformationsType", propOrder = {
    "transportInformation"
})
public class TransportInformationsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "TransportInformation", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected List<TransportInformationType> transportInformation;

    /**
     * Gets the value of the transportInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportInformationType }
     * 
     * 
     */
    public List<TransportInformationType> getTransportInformation() {
        if (transportInformation == null) {
            transportInformation = new ArrayList<TransportInformationType>();
        }
        return this.transportInformation;
    }

    public boolean isSetTransportInformation() {
        return ((this.transportInformation!= null)&&(!this.transportInformation.isEmpty()));
    }

    public void unsetTransportInformation() {
        this.transportInformation = null;
    }

}
