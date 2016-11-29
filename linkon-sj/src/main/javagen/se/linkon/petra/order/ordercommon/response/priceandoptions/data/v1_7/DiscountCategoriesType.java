
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Discounts related to the order item.
 * 
 * <p>Java class for DiscountCategoriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountCategoriesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountCategory" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}DiscountCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountCategoriesType", propOrder = {
    "discountCategory"
})
public class DiscountCategoriesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DiscountCategory")
    protected List<DiscountCategoryType> discountCategory;

    /**
     * Gets the value of the discountCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCategoryType }
     * 
     * 
     */
    public List<DiscountCategoryType> getDiscountCategory() {
        if (discountCategory == null) {
            discountCategory = new ArrayList<DiscountCategoryType>();
        }
        return this.discountCategory;
    }

    public boolean isSetDiscountCategory() {
        return ((this.discountCategory!= null)&&(!this.discountCategory.isEmpty()));
    }

    public void unsetDiscountCategory() {
        this.discountCategory = null;
    }

}
