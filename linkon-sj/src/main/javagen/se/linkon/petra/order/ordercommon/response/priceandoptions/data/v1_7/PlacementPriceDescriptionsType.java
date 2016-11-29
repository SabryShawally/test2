
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementPriceDescriptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementPriceDescriptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlacementPriceDescription" type="{http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7}PlacementPriceDescriptionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementPriceDescriptionsType", propOrder = {
    "placementPriceDescription"
})
public class PlacementPriceDescriptionsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "PlacementPriceDescription", required = true)
    protected List<PlacementPriceDescriptionType> placementPriceDescription;

    /**
     * Gets the value of the placementPriceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementPriceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacementPriceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacementPriceDescriptionType }
     * 
     * 
     */
    public List<PlacementPriceDescriptionType> getPlacementPriceDescription() {
        if (placementPriceDescription == null) {
            placementPriceDescription = new ArrayList<PlacementPriceDescriptionType>();
        }
        return this.placementPriceDescription;
    }

    public boolean isSetPlacementPriceDescription() {
        return ((this.placementPriceDescription!= null)&&(!this.placementPriceDescription.isEmpty()));
    }

    public void unsetPlacementPriceDescription() {
        this.placementPriceDescription = null;
    }

}
