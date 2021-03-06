
package se.linkon.petra.gtssales.itinerarycharacteristics.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceLevelDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceLevelDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceLevelDetailType" type="{http://petra.linkon.se/gtssales/itinerarycharacteristics/data/v1_17}PriceLevelDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceLevelDetail", propOrder = {
    "priceLevelDetailType"
})
public class PriceLevelDetail
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceLevelDetailType", required = true)
    protected List<PriceLevelDetailType> priceLevelDetailType;

    /**
     * Gets the value of the priceLevelDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceLevelDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceLevelDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceLevelDetailType }
     * 
     * 
     */
    public List<PriceLevelDetailType> getPriceLevelDetailType() {
        if (priceLevelDetailType == null) {
            priceLevelDetailType = new ArrayList<PriceLevelDetailType>();
        }
        return this.priceLevelDetailType;
    }

    public boolean isSetPriceLevelDetailType() {
        return ((this.priceLevelDetailType!= null)&&(!this.priceLevelDetailType.isEmpty()));
    }

    public void unsetPriceLevelDetailType() {
        this.priceLevelDetailType = null;
    }

}
