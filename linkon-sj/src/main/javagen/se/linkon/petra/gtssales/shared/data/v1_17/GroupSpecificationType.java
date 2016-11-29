
package se.linkon.petra.gtssales.shared.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates that all consumers within an ItineraryServiceSpecification should be considered as one group of travellers (a group travel).
 * 
 * <p>Java class for GroupSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupReference" type="{http://petra.linkon.se/gtssales/shared/data/v1_17}GroupReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupSpecificationType", propOrder = {
    "groupReference"
})
public class GroupSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "GroupReference")
    protected String groupReference;

    /**
     * Gets the value of the groupReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupReference() {
        return groupReference;
    }

    /**
     * Sets the value of the groupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupReference(String value) {
        this.groupReference = value;
    }

    public boolean isSetGroupReference() {
        return (this.groupReference!= null);
    }

}
