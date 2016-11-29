
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesCategoryDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesCategoryDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesCategoryDescription" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17}SalesCategoryDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesCategoryDescriptionsType", propOrder = {
    "salesCategoryDescription"
})
public class SalesCategoryDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "SalesCategoryDescription", required = true)
    protected List<SalesCategoryDescriptionType> salesCategoryDescription;

    /**
     * Gets the value of the salesCategoryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesCategoryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesCategoryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesCategoryDescriptionType }
     * 
     * 
     */
    public List<SalesCategoryDescriptionType> getSalesCategoryDescription() {
        if (salesCategoryDescription == null) {
            salesCategoryDescription = new ArrayList<SalesCategoryDescriptionType>();
        }
        return this.salesCategoryDescription;
    }

    public boolean isSetSalesCategoryDescription() {
        return ((this.salesCategoryDescription!= null)&&(!this.salesCategoryDescription.isEmpty()));
    }

    public void unsetSalesCategoryDescription() {
        this.salesCategoryDescription = null;
    }

}
