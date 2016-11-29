
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesCategoryFlexibilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesCategoryFlexibilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesCategoryFlexibility" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}SalesCategoryFlexibilityType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesCategoryFlexibilitiesType", propOrder = {
    "salesCategoryFlexibility"
})
public class SalesCategoryFlexibilitiesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesCategoryFlexibility", required = true)
    protected List<SalesCategoryFlexibilityType> salesCategoryFlexibility;

    /**
     * Gets the value of the salesCategoryFlexibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesCategoryFlexibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesCategoryFlexibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesCategoryFlexibilityType }
     * 
     * 
     */
    public List<SalesCategoryFlexibilityType> getSalesCategoryFlexibility() {
        if (salesCategoryFlexibility == null) {
            salesCategoryFlexibility = new ArrayList<SalesCategoryFlexibilityType>();
        }
        return this.salesCategoryFlexibility;
    }

    public boolean isSetSalesCategoryFlexibility() {
        return ((this.salesCategoryFlexibility!= null)&&(!this.salesCategoryFlexibility.isEmpty()));
    }

    public void unsetSalesCategoryFlexibility() {
        this.salesCategoryFlexibility = null;
    }

}
