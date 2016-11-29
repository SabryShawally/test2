
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commonelements.data.v4_6.StringCodeType;


/**
 * <p>Java class for CodeDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodeSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Codes" type="{http://petra.linkon.se/commonelements/data/v4_6}StringCodeType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeDescription", propOrder = {
    "codeName",
    "codeSuffix",
    "codes"
})
public class CodeDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "CodeName", required = true)
    protected String codeName;
    @XmlElement(name = "CodeSuffix", required = true)
    protected String codeSuffix;
    @XmlElement(name = "Codes", required = true)
    protected List<StringCodeType> codes;

    /**
     * Gets the value of the codeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * Sets the value of the codeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeName(String value) {
        this.codeName = value;
    }

    public boolean isSetCodeName() {
        return (this.codeName!= null);
    }

    /**
     * Gets the value of the codeSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSuffix() {
        return codeSuffix;
    }

    /**
     * Sets the value of the codeSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSuffix(String value) {
        this.codeSuffix = value;
    }

    public boolean isSetCodeSuffix() {
        return (this.codeSuffix!= null);
    }

    /**
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringCodeType }
     * 
     * 
     */
    public List<StringCodeType> getCodes() {
        if (codes == null) {
            codes = new ArrayList<StringCodeType>();
        }
        return this.codes;
    }

    public boolean isSetCodes() {
        return ((this.codes!= null)&&(!this.codes.isEmpty()));
    }

    public void unsetCodes() {
        this.codes = null;
    }

}
