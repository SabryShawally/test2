
package se.linkon.petra.order.orderstorage.moveorderitems.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}LastRetrievalDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastRetrievalDate"
})
@XmlRootElement(name = "MoveOrderItemsResponse")
public class MoveOrderItemsResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "LastRetrievalDate", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastRetrievalDate;

    /**
     * Gets the value of the lastRetrievalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRetrievalDate() {
        return lastRetrievalDate;
    }

    /**
     * Sets the value of the lastRetrievalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRetrievalDate(XMLGregorianCalendar value) {
        this.lastRetrievalDate = value;
    }

    public boolean isSetLastRetrievalDate() {
        return (this.lastRetrievalDate!= null);
    }

}
