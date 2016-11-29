
package se.linkon.petra.gtssales.booktransport.data.v1_17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BookServiceDescriptions" type="{http://petra.linkon.se/gtssales/booktransport/data/v1_17}BookServiceDescription" maxOccurs="unbounded"/&gt;
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
    "bookServiceDescriptions"
})
@XmlRootElement(name = "BookSegmentDescription")
public class BookSegmentDescription
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "BookServiceDescriptions", required = true)
    protected List<BookServiceDescription> bookServiceDescriptions;

    /**
     * Gets the value of the bookServiceDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookServiceDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookServiceDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookServiceDescription }
     * 
     * 
     */
    public List<BookServiceDescription> getBookServiceDescriptions() {
        if (bookServiceDescriptions == null) {
            bookServiceDescriptions = new ArrayList<BookServiceDescription>();
        }
        return this.bookServiceDescriptions;
    }

    public boolean isSetBookServiceDescriptions() {
        return ((this.bookServiceDescriptions!= null)&&(!this.bookServiceDescriptions.isEmpty()));
    }

    public void unsetBookServiceDescriptions() {
        this.bookServiceDescriptions = null;
    }

}
