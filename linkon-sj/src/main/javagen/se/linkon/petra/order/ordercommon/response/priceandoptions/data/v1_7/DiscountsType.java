
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Discounts related to a discount category.
 * 			
 * 
 * <p>Java class for DiscountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountType" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}DiscountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountsType", propOrder = {
    "discountType"
})
public class DiscountsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DiscountType")
    protected List<DiscountType> discountType;

    /**
     * Gets the value of the discountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountType }
     * 
     * 
     */
    public List<DiscountType> getDiscountType() {
        if (discountType == null) {
            discountType = new ArrayList<DiscountType>();
        }
        return this.discountType;
    }

    public boolean isSetDiscountType() {
        return ((this.discountType!= null)&&(!this.discountType.isEmpty()));
    }

    public void unsetDiscountType() {
        this.discountType = null;
    }

}
