
package se.linkon.petra.gtssales.edittransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}OrderItemId"/&gt;
 *         &lt;element name="OptionSpecifications" type="{http://petra.linkon.se/gtssales/edittransport/data/v1_17}OptionSpecificationsType" minOccurs="0"/&gt;
 *         &lt;element name="SegmentSpecifications" type="{http://petra.linkon.se/gtssales/edittransport/data/v1_17}SegmentSpecificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemSpecificationType", propOrder = {
    "orderItemId",
    "optionSpecifications",
    "segmentSpecifications"
})
public class OrderItemSpecificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "OrderItemId", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int orderItemId;
    @XmlElement(name = "OptionSpecifications")
    protected OptionSpecificationsType optionSpecifications;
    @XmlElement(name = "SegmentSpecifications")
    protected SegmentSpecificationsType segmentSpecifications;

    /**
     * Gets the value of the orderItemId property.
     * 
     */
    public int getOrderItemId() {
        return orderItemId;
    }

    /**
     * Sets the value of the orderItemId property.
     * 
     */
    public void setOrderItemId(int value) {
        this.orderItemId = value;
    }

    public boolean isSetOrderItemId() {
        return true;
    }

    /**
     * Gets the value of the optionSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link OptionSpecificationsType }
     *     
     */
    public OptionSpecificationsType getOptionSpecifications() {
        return optionSpecifications;
    }

    /**
     * Sets the value of the optionSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSpecificationsType }
     *     
     */
    public void setOptionSpecifications(OptionSpecificationsType value) {
        this.optionSpecifications = value;
    }

    public boolean isSetOptionSpecifications() {
        return (this.optionSpecifications!= null);
    }

    /**
     * Gets the value of the segmentSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSpecificationsType }
     *     
     */
    public SegmentSpecificationsType getSegmentSpecifications() {
        return segmentSpecifications;
    }

    /**
     * Sets the value of the segmentSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSpecificationsType }
     *     
     */
    public void setSegmentSpecifications(SegmentSpecificationsType value) {
        this.segmentSpecifications = value;
    }

    public boolean isSetSegmentSpecifications() {
        return (this.segmentSpecifications!= null);
    }

}
