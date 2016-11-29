
package se.linkon.petra.gtssales.passengercategories.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerCategoriesInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerCategoriesInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PassengerCategoryInformation" type="{http://petra.linkon.se/gtssales/passengercategories/data/v1_17}PassengerCategoryInformationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerCategoriesInformationType", propOrder = {
    "passengerCategoryInformation"
})
public class PassengerCategoriesInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PassengerCategoryInformation", required = true)
    protected List<PassengerCategoryInformationType> passengerCategoryInformation;

    /**
     * Gets the value of the passengerCategoryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCategoryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCategoryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryInformationType }
     * 
     * 
     */
    public List<PassengerCategoryInformationType> getPassengerCategoryInformation() {
        if (passengerCategoryInformation == null) {
            passengerCategoryInformation = new ArrayList<PassengerCategoryInformationType>();
        }
        return this.passengerCategoryInformation;
    }

    public boolean isSetPassengerCategoryInformation() {
        return ((this.passengerCategoryInformation!= null)&&(!this.passengerCategoryInformation.isEmpty()));
    }

    public void unsetPassengerCategoryInformation() {
        this.passengerCategoryInformation = null;
    }

}
