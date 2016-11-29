
package se.linkon.petra.gtssales.journeyadvicepricequotes.detailed.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A journey advice part is a subset of the journey advice that has a set of common main price groups representing the possible choices for that part.
 * 
 * <p>Java class for JourneyAdvicePartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyAdvicePartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainPriceGroups" type="{http://petra.linkon.se/gtssales/journeyadvicepricequotes/detailed/data/v1_17}MainPriceGroupsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyAdvicePartType", propOrder = {
    "mainPriceGroups"
})
public class JourneyAdvicePartType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "MainPriceGroups", required = true)
    protected MainPriceGroupsType mainPriceGroups;

    /**
     * Gets the value of the mainPriceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link MainPriceGroupsType }
     *     
     */
    public MainPriceGroupsType getMainPriceGroups() {
        return mainPriceGroups;
    }

    /**
     * Sets the value of the mainPriceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPriceGroupsType }
     *     
     */
    public void setMainPriceGroups(MainPriceGroupsType value) {
        this.mainPriceGroups = value;
    }

    public boolean isSetMainPriceGroups() {
        return (this.mainPriceGroups!= null);
    }

}
