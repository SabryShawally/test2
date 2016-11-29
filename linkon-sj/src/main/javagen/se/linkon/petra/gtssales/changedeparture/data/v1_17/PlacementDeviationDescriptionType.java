
package se.linkon.petra.gtssales.changedeparture.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementDeviationDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementDeviationDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlacementDeviationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementDeviationDescriptionType", propOrder = {
    "placementDeviationCode"
})
public class PlacementDeviationDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementDeviationCode", required = true)
    protected String placementDeviationCode;

    /**
     * Gets the value of the placementDeviationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementDeviationCode() {
        return placementDeviationCode;
    }

    /**
     * Sets the value of the placementDeviationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementDeviationCode(String value) {
        this.placementDeviationCode = value;
    }

    public boolean isSetPlacementDeviationCode() {
        return (this.placementDeviationCode!= null);
    }

}
