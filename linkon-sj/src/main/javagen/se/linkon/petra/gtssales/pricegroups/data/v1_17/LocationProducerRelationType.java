
package se.linkon.petra.gtssales.pricegroups.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the location producers.
 * 
 * <p>Java class for LocationProducerRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationProducerRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureProducer" type="{http://petra.linkon.se/commonelements/data/v4_6}ProducerCodeType"/&gt;
 *         &lt;element name="ArrivalProducer" type="{http://petra.linkon.se/commonelements/data/v4_6}ProducerCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationProducerRelationType", propOrder = {
    "departureProducer",
    "arrivalProducer"
})
public class LocationProducerRelationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "DepartureProducer")
    protected int departureProducer;
    @XmlElement(name = "ArrivalProducer")
    protected int arrivalProducer;

    /**
     * Gets the value of the departureProducer property.
     * 
     */
    public int getDepartureProducer() {
        return departureProducer;
    }

    /**
     * Sets the value of the departureProducer property.
     * 
     */
    public void setDepartureProducer(int value) {
        this.departureProducer = value;
    }

    public boolean isSetDepartureProducer() {
        return true;
    }

    /**
     * Gets the value of the arrivalProducer property.
     * 
     */
    public int getArrivalProducer() {
        return arrivalProducer;
    }

    /**
     * Sets the value of the arrivalProducer property.
     * 
     */
    public void setArrivalProducer(int value) {
        this.arrivalProducer = value;
    }

    public boolean isSetArrivalProducer() {
        return true;
    }

}
