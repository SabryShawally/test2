
package se.linkon.petra.gtssales.edittransport.data.v1_17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}FreeTextRow"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteType", propOrder = {
    "freeTextRow"
})
public class NoteType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "FreeTextRow", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String freeTextRow;

    /**
     * Gets the value of the freeTextRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeTextRow() {
        return freeTextRow;
    }

    /**
     * Sets the value of the freeTextRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeTextRow(String value) {
        this.freeTextRow = value;
    }

    public boolean isSetFreeTextRow() {
        return (this.freeTextRow!= null);
    }

}
