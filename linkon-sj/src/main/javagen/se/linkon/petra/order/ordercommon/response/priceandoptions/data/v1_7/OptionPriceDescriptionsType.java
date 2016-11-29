
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionPriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionPriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptionPriceDescription" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}OptionPriceDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionPriceDescriptionsType", propOrder = {
    "optionPriceDescription"
})
public class OptionPriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OptionPriceDescription")
    protected List<OptionPriceDescriptionType> optionPriceDescription;

    /**
     * Gets the value of the optionPriceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionPriceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionPriceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionPriceDescriptionType }
     * 
     * 
     */
    public List<OptionPriceDescriptionType> getOptionPriceDescription() {
        if (optionPriceDescription == null) {
            optionPriceDescription = new ArrayList<OptionPriceDescriptionType>();
        }
        return this.optionPriceDescription;
    }

    public boolean isSetOptionPriceDescription() {
        return ((this.optionPriceDescription!= null)&&(!this.optionPriceDescription.isEmpty()));
    }

    public void unsetOptionPriceDescription() {
        this.optionPriceDescription = null;
    }

}
