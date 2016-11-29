
package se.linkon.petra.commoncomplexelements.data.v4_6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a permission
 * 
 * <p>Java class for PermissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}ProducerCode"/&gt;
 *         &lt;element ref="{http://petra.linkon.se/commonelements/data/v4_6}AccessLevel"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionType", propOrder = {
    "producerCode",
    "accessLevel"
})
public class PermissionType
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "ProducerCode", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    protected int producerCode;
    @XmlElement(name = "AccessLevel", namespace = "http://petra.linkon.se/commonelements/data/v4_6")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int accessLevel;

    /**
     * Gets the value of the producerCode property.
     * 
     */
    public int getProducerCode() {
        return producerCode;
    }

    /**
     * Sets the value of the producerCode property.
     * 
     */
    public void setProducerCode(int value) {
        this.producerCode = value;
    }

    public boolean isSetProducerCode() {
        return true;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     */
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     */
    public void setAccessLevel(int value) {
        this.accessLevel = value;
    }

    public boolean isSetAccessLevel() {
        return true;
    }

}
