
package se.linkon.petra.gtssales.validcodes.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidCodeDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidCodeDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeListName" type="{http://petra.linkon.se/gtssales/validcodes/data/v1_17}CodeListNameType"/&gt;
 *         &lt;element name="Codes" type="{http://petra.linkon.se/gtssales/validcodes/data/v1_17}CodesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidCodeDescriptionType", propOrder = {
    "codeListName",
    "codes"
})
public class ValidCodeDescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CodeListName", required = true)
    @XmlSchemaType(name = "string")
    protected CodeListNameType codeListName;
    @XmlElement(name = "Codes")
    protected CodesType codes;

    /**
     * Gets the value of the codeListName property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListNameType }
     *     
     */
    public CodeListNameType getCodeListName() {
        return codeListName;
    }

    /**
     * Sets the value of the codeListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListNameType }
     *     
     */
    public void setCodeListName(CodeListNameType value) {
        this.codeListName = value;
    }

    public boolean isSetCodeListName() {
        return (this.codeListName!= null);
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link CodesType }
     *     
     */
    public CodesType getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesType }
     *     
     */
    public void setCodes(CodesType value) {
        this.codes = value;
    }

    public boolean isSetCodes() {
        return (this.codes!= null);
    }

}
