
package se.linkon.petra.gtssales.detailedpricequote.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.PriceVatType;


/**
 * <p>Java class for PlacementPriceDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementPriceDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commoncomplexelements/data/v4_6}PriceVat"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementPriceDescriptionType", propOrder = {
    "priceVat"
})
public class PlacementPriceDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PriceVat", namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", required = true)
    protected PriceVatType priceVat;

    /**
     * Gets the value of the priceVat property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVatType }
     *     
     */
    public PriceVatType getPriceVat() {
        return priceVat;
    }

    /**
     * Sets the value of the priceVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVatType }
     *     
     */
    public void setPriceVat(PriceVatType value) {
        this.priceVat = value;
    }

    public boolean isSetPriceVat() {
        return (this.priceVat!= null);
    }

}
