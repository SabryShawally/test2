
package se.linkon.petra.order.ordercommon.response.ordernotes.data.v1_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderNoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderNoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}NoteDateTime"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}NoteRowNumber"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}NoteRowText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderNoteType", propOrder = {
    "noteDateTime",
    "noteRowNumber",
    "noteRowText"
})
public class OrderNoteType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "NoteDateTime", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar noteDateTime;
    @XmlElement(name = "NoteRowNumber", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "integer")
    protected int noteRowNumber;
    @XmlElement(name = "NoteRowText", namespace = "http://petra.linkon.se/commonelements/data/v4_6", required = true)
    protected String noteRowText;

    /**
     * Gets the value of the noteDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoteDateTime() {
        return noteDateTime;
    }

    /**
     * Sets the value of the noteDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoteDateTime(XMLGregorianCalendar value) {
        this.noteDateTime = value;
    }

    public boolean isSetNoteDateTime() {
        return (this.noteDateTime!= null);
    }

    /**
     * Gets the value of the noteRowNumber property.
     * 
     */
    public int getNoteRowNumber() {
        return noteRowNumber;
    }

    /**
     * Sets the value of the noteRowNumber property.
     * 
     */
    public void setNoteRowNumber(int value) {
        this.noteRowNumber = value;
    }

    public boolean isSetNoteRowNumber() {
        return true;
    }

    /**
     * Gets the value of the noteRowText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteRowText() {
        return noteRowText;
    }

    /**
     * Sets the value of the noteRowText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteRowText(String value) {
        this.noteRowText = value;
    }

    public boolean isSetNoteRowText() {
        return (this.noteRowText!= null);
    }

}
