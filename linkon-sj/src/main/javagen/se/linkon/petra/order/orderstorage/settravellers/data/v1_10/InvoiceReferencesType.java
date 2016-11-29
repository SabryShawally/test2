
package se.linkon.petra.order.orderstorage.settravellers.data.v1_10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains five fields used by the customer for
 * 				invoice purposes.
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
 *         &lt;element name="ReferenceInformation1" type="{http://petra.linkon.se/commonelements/data/v4_6}InvoiceReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceInformation2" type="{http://petra.linkon.se/commonelements/data/v4_6}InvoiceReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceInformation3" type="{http://petra.linkon.se/commonelements/data/v4_6}InvoiceReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceInformation4" type="{http://petra.linkon.se/commonelements/data/v4_6}InvoiceReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceInformation5" type="{http://petra.linkon.se/commonelements/data/v4_6}InvoiceReferenceType" minOccurs="0"/&gt;
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
    "referenceInformation1",
    "referenceInformation2",
    "referenceInformation3",
    "referenceInformation4",
    "referenceInformation5"
})
public class InvoiceReferencesType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ReferenceInformation1")
    protected String referenceInformation1;
    @XmlElement(name = "ReferenceInformation2")
    protected String referenceInformation2;
    @XmlElement(name = "ReferenceInformation3")
    protected String referenceInformation3;
    @XmlElement(name = "ReferenceInformation4")
    protected String referenceInformation4;
    @XmlElement(name = "ReferenceInformation5")
    protected String referenceInformation5;

    /**
     * Gets the value of the referenceInformation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceInformation1() {
        return referenceInformation1;
    }

    /**
     * Sets the value of the referenceInformation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceInformation1(String value) {
        this.referenceInformation1 = value;
    }

    public boolean isSetReferenceInformation1() {
        return (this.referenceInformation1 != null);
    }

    /**
     * Gets the value of the referenceInformation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceInformation2() {
        return referenceInformation2;
    }

    /**
     * Sets the value of the referenceInformation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceInformation2(String value) {
        this.referenceInformation2 = value;
    }

    public boolean isSetReferenceInformation2() {
        return (this.referenceInformation2 != null);
    }

    /**
     * Gets the value of the referenceInformation3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceInformation3() {
        return referenceInformation3;
    }

    /**
     * Sets the value of the referenceInformation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceInformation3(String value) {
        this.referenceInformation3 = value;
    }

    public boolean isSetReferenceInformation3() {
        return (this.referenceInformation3 != null);
    }

    /**
     * Gets the value of the referenceInformation4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceInformation4() {
        return referenceInformation4;
    }

    /**
     * Sets the value of the referenceInformation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceInformation4(String value) {
        this.referenceInformation4 = value;
    }

    public boolean isSetReferenceInformation4() {
        return (this.referenceInformation4 != null);
    }

    /**
     * Gets the value of the referenceInformation5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceInformation5() {
        return referenceInformation5;
    }

    /**
     * Sets the value of the referenceInformation5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceInformation5(String value) {
        this.referenceInformation5 = value;
    }

    public boolean isSetReferenceInformation5() {
        return (this.referenceInformation5 != null);
    }

}
