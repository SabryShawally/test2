
package se.linkon.petra.gtssales.pricegroups.data.v1_17;

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
 *         &lt;element name="PriceGroups" type="{http://petra.linkon.se/gtssales/pricegroups/data/v1_17}PriceGroupsType" minOccurs="0"/&gt;
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
    "priceGroups"
})
@XmlRootElement(name = "GetPriceGroupsDescription")
public class GetPriceGroupsDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceGroups")
    protected PriceGroupsType priceGroups;

    /**
     * Gets the value of the priceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupsType }
     *     
     */
    public PriceGroupsType getPriceGroups() {
        return priceGroups;
    }

    /**
     * Sets the value of the priceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupsType }
     *     
     */
    public void setPriceGroups(PriceGroupsType value) {
        this.priceGroups = value;
    }

    public boolean isSetPriceGroups() {
        return (this.priceGroups!= null);
    }

}
