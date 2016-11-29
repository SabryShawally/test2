
package se.linkon.petra.timetable.data.v2_7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import se.linkon.petra.commoncomplexelements.data.v4_6.ExceptionData;


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
 *         &lt;element ref="{http://petra.linkon.se/commoncomplexelements/data/v4_6}ExceptionData"/&gt;
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
    "exceptionData"
})
@XmlRootElement(name = "TimetableExceptionData")
public class TimetableExceptionData
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ExceptionData", namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", required = true)
    protected ExceptionData exceptionData;

    /**
     * Gets the value of the exceptionData property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionData }
     *     
     */
    public ExceptionData getExceptionData() {
        return exceptionData;
    }

    /**
     * Sets the value of the exceptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionData }
     *     
     */
    public void setExceptionData(ExceptionData value) {
        this.exceptionData = value;
    }

    public boolean isSetExceptionData() {
        return (this.exceptionData!= null);
    }

}
