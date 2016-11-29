
package se.linkon.petra.order.orderstorage.ordernotes.data.v1_10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All notes on order
 * 
 * <p>Java class for OrderNoteSpecifications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderNoteSpecifications"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}NoteRowText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderNoteSpecifications", propOrder = {
    "noteRowText"
})
public class OrderNoteSpecifications
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "NoteRowText", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected List<String> noteRowText;

    /**
     * Gets the value of the noteRowText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteRowText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteRowText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteRowText() {
        if (noteRowText == null) {
            noteRowText = new ArrayList<String>();
        }
        return this.noteRowText;
    }

    public boolean isSetNoteRowText() {
        return ((this.noteRowText!= null)&&(!this.noteRowText.isEmpty()));
    }

    public void unsetNoteRowText() {
        this.noteRowText = null;
    }

}
