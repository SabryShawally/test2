
package se.linkon.petra.gtssales.placementoptions.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The list of placement characteristics
 * 			
 * 
 * <p>Java class for PlacementCharacteristicsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementCharacteristicsListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Characteristics" type="{http://petra.linkon.se/gtssales/placementoptions/data/v1_17}CharacteristicsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementCharacteristicsListType", propOrder = {
    "characteristics"
})
public class PlacementCharacteristicsListType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Characteristics")
    protected List<CharacteristicsType> characteristics;

    /**
     * Gets the value of the characteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicsType }
     * 
     * 
     */
    public List<CharacteristicsType> getCharacteristics() {
        if (characteristics == null) {
            characteristics = new ArrayList<CharacteristicsType>();
        }
        return this.characteristics;
    }

    public boolean isSetCharacteristics() {
        return ((this.characteristics!= null)&&(!this.characteristics.isEmpty()));
    }

    public void unsetCharacteristics() {
        this.characteristics = null;
    }

}
