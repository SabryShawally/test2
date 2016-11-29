
package se.linkon.petra.location.data.v1_5;

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
 *         &lt;element name="LocationQueries"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://petra.linkon.se/location/data/v1_5}LocationQuery" maxOccurs="10"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "locationQueries"
})
@XmlRootElement(name = "FindLocationsQuery")
public class FindLocationsQuery
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "LocationQueries", required = true)
    protected FindLocationsQuery.LocationQueries locationQueries;

    /**
     * Gets the value of the locationQueries property.
     * 
     * @return
     *     possible object is
     *     {@link FindLocationsQuery.LocationQueries }
     *     
     */
    public FindLocationsQuery.LocationQueries getLocationQueries() {
        return locationQueries;
    }

    /**
     * Sets the value of the locationQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindLocationsQuery.LocationQueries }
     *     
     */
    public void setLocationQueries(FindLocationsQuery.LocationQueries value) {
        this.locationQueries = value;
    }

    public boolean isSetLocationQueries() {
        return (this.locationQueries!= null);
    }


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
     *         &lt;element ref="{http://petra.linkon.se/location/data/v1_5}LocationQuery" maxOccurs="10"/&gt;
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
        "locationQuery"
    })
    public static class LocationQueries
        implements Serializable
    {

        private final static long serialVersionUID = 1234L;
        @XmlElement(name = "LocationQuery", required = true)
        protected List<LocationQueryType> locationQuery;

        /**
         * Gets the value of the locationQuery property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locationQuery property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocationQuery().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationQueryType }
         * 
         * 
         */
        public List<LocationQueryType> getLocationQuery() {
            if (locationQuery == null) {
                locationQuery = new ArrayList<LocationQueryType>();
            }
            return this.locationQuery;
        }

        public boolean isSetLocationQuery() {
            return ((this.locationQuery!= null)&&(!this.locationQuery.isEmpty()));
        }

        public void unsetLocationQuery() {
            this.locationQuery = null;
        }

    }

}
