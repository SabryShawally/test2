
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.ProductCodeType;


/**
 * <p>Java class for ProductCodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProductCode" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCodesType", propOrder = {
    "productCode"
})
public class ProductCodesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ProductCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected List<ProductCodeType> productCode;

    /**
     * Gets the value of the productCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCodeType }
     * 
     * 
     */
    public List<ProductCodeType> getProductCode() {
        if (productCode == null) {
            productCode = new ArrayList<ProductCodeType>();
        }
        return this.productCode;
    }

    public boolean isSetProductCode() {
        return ((this.productCode!= null)&&(!this.productCode.isEmpty()));
    }

    public void unsetProductCode() {
        this.productCode = null;
    }

}
