
package se.linkon.petra.order.ordercommon.response.shared.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormOfIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ETicketCard" type="{http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7}ETicketCardType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfIdentificationType", propOrder = {
    "eTicketCard"
})
public class FormOfIdentificationType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ETicketCard", required = true)
    protected ETicketCardType eTicketCard;

    /**
     * Gets the value of the eTicketCard property.
     * 
     * @return
     *     possible object is
     *     {@link ETicketCardType }
     *     
     */
    public ETicketCardType getETicketCard() {
        return eTicketCard;
    }

    /**
     * Sets the value of the eTicketCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETicketCardType }
     *     
     */
    public void setETicketCard(ETicketCardType value) {
        this.eTicketCard = value;
    }

    public boolean isSetETicketCard() {
        return (this.eTicketCard!= null);
    }

}
