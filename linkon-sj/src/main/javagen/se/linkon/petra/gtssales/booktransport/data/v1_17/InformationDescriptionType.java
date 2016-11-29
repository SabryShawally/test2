
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InformationCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InformationTexts" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}InformationTexts"/&gt;
 *         &lt;element name="ConflictedSalesOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationDescriptionType", propOrder = {
    "informationCategory",
    "informationTexts",
    "conflictedSalesOrderId"
})
public class InformationDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "InformationCategory", required = true)
    protected String informationCategory;
    @XmlElement(name = "InformationTexts", required = true)
    protected InformationTexts informationTexts;
    @XmlElement(name = "ConflictedSalesOrderId")
    protected String conflictedSalesOrderId;

    /**
     * Gets the value of the informationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationCategory() {
        return informationCategory;
    }

    /**
     * Sets the value of the informationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationCategory(String value) {
        this.informationCategory = value;
    }

    public boolean isSetInformationCategory() {
        return (this.informationCategory!= null);
    }

    /**
     * Gets the value of the informationTexts property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTexts }
     *     
     */
    public InformationTexts getInformationTexts() {
        return informationTexts;
    }

    /**
     * Sets the value of the informationTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTexts }
     *     
     */
    public void setInformationTexts(InformationTexts value) {
        this.informationTexts = value;
    }

    public boolean isSetInformationTexts() {
        return (this.informationTexts!= null);
    }

    /**
     * Gets the value of the conflictedSalesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictedSalesOrderId() {
        return conflictedSalesOrderId;
    }

    /**
     * Sets the value of the conflictedSalesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictedSalesOrderId(String value) {
        this.conflictedSalesOrderId = value;
    }

    public boolean isSetConflictedSalesOrderId() {
        return (this.conflictedSalesOrderId!= null);
    }

}
