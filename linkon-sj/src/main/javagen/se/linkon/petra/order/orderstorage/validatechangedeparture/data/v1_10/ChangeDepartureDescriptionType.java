
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.ProductCodeType;


/**
 * Describes an allowed sales category for a product.
 * 				The sales category is identified by the sales category booking class
 * 				and flexibility.
 * 			
 * 
 * <p>Java class for ChangeDepartureDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeDepartureDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProductCode"/&gt;
 *         &lt;element name="SalesCategoryDescription" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}SalesCategoryDescriptionType"/&gt;
 *         &lt;element name="PriceGroupDescription" type="{http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10}PriceGroupDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeDepartureDescriptionType", propOrder = {
    "productCode",
    "salesCategoryDescription",
    "priceGroupDescription"
})
public class ChangeDepartureDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ProductCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected ProductCodeType productCode;
    @XmlElement(name = "SalesCategoryDescription", required = true)
    protected SalesCategoryDescriptionType salesCategoryDescription;
    @XmlElement(name = "PriceGroupDescription", required = true)
    protected PriceGroupDescriptionType priceGroupDescription;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeType }
     *     
     */
    public ProductCodeType getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeType }
     *     
     */
    public void setProductCode(ProductCodeType value) {
        this.productCode = value;
    }

    public boolean isSetProductCode() {
        return (this.productCode!= null);
    }

    /**
     * Gets the value of the salesCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SalesCategoryDescriptionType }
     *     
     */
    public SalesCategoryDescriptionType getSalesCategoryDescription() {
        return salesCategoryDescription;
    }

    /**
     * Sets the value of the salesCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesCategoryDescriptionType }
     *     
     */
    public void setSalesCategoryDescription(SalesCategoryDescriptionType value) {
        this.salesCategoryDescription = value;
    }

    public boolean isSetSalesCategoryDescription() {
        return (this.salesCategoryDescription!= null);
    }

    /**
     * Gets the value of the priceGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupDescriptionType }
     *     
     */
    public PriceGroupDescriptionType getPriceGroupDescription() {
        return priceGroupDescription;
    }

    /**
     * Sets the value of the priceGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupDescriptionType }
     *     
     */
    public void setPriceGroupDescription(PriceGroupDescriptionType value) {
        this.priceGroupDescription = value;
    }

    public boolean isSetPriceGroupDescription() {
        return (this.priceGroupDescription!= null);
    }

}
