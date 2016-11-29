
package se.linkon.petra.location.data.v1_5;

import java.io.Serializable;
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
 *         &lt;element name="AllLocationsURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchableLocationsURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "allLocationsURL",
    "searchableLocationsURL"
})
@XmlRootElement(name = "LocationsURL")
public class LocationsURL
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "AllLocationsURL", required = true)
    protected String allLocationsURL;
    @XmlElement(name = "SearchableLocationsURL", required = true)
    protected String searchableLocationsURL;

    /**
     * Gets the value of the allLocationsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllLocationsURL() {
        return allLocationsURL;
    }

    /**
     * Sets the value of the allLocationsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllLocationsURL(String value) {
        this.allLocationsURL = value;
    }

    public boolean isSetAllLocationsURL() {
        return (this.allLocationsURL!= null);
    }

    /**
     * Gets the value of the searchableLocationsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchableLocationsURL() {
        return searchableLocationsURL;
    }

    /**
     * Sets the value of the searchableLocationsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchableLocationsURL(String value) {
        this.searchableLocationsURL = value;
    }

    public boolean isSetSearchableLocationsURL() {
        return (this.searchableLocationsURL!= null);
    }

}
