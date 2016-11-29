
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MainPriceGroupsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MainPriceGroupsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainPriceGroup" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}MainPriceGroupType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainPriceGroupsType", propOrder = {
    "mainPriceGroup"
})
public class MainPriceGroupsType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "MainPriceGroup", required = true)
    protected List<MainPriceGroupType> mainPriceGroup;

    /**
     * Gets the value of the mainPriceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainPriceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainPriceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainPriceGroupType }
     * 
     * 
     */
    public List<MainPriceGroupType> getMainPriceGroup() {
        if (mainPriceGroup == null) {
            mainPriceGroup = new ArrayList<MainPriceGroupType>();
        }
        return this.mainPriceGroup;
    }

    public boolean isSetMainPriceGroup() {
        return ((this.mainPriceGroup!= null)&&(!this.mainPriceGroup.isEmpty()));
    }

    public void unsetMainPriceGroup() {
        this.mainPriceGroup = null;
    }

}
