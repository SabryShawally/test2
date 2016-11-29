
package se.linkon.petra.order.ordercommon.response.distributorreferences.data.v1_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a list of 5 invoice references.
 * 			
 * 
 * <p>Java class for InvoiceReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceReferencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}InvoiceReference" maxOccurs="5" minOccurs="5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceReferencesType", propOrder = {
    "invoiceReference"
})
public class InvoiceReferencesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "InvoiceReference", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected List<String> invoiceReference;

    /**
     * Gets the value of the invoiceReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvoiceReference() {
        if (invoiceReference == null) {
            invoiceReference = new ArrayList<String>();
        }
        return this.invoiceReference;
    }

    public boolean isSetInvoiceReference() {
        return ((this.invoiceReference!= null)&&(!this.invoiceReference.isEmpty()));
    }

    public void unsetInvoiceReference() {
        this.invoiceReference = null;
    }

}
