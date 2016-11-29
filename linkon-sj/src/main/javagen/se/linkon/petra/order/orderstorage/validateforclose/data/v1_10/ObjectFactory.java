
package se.linkon.petra.order.orderstorage.validateforclose.data.v1_10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.validateforclose.data.v1_10 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateOrderForCloseRequest_QNAME = new QName("http://petra.linkon.se/order/orderstorage/validateforclose/data/v1_10", "ValidateOrderForCloseRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.validateforclose.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateOrderForCloseRequestType }
     * 
     */
    public ValidateOrderForCloseRequestType createValidateOrderForCloseRequestType() {
        return new ValidateOrderForCloseRequestType();
    }

    /**
     * Create an instance of {@link ValidateOrderForCloseResponse }
     * 
     */
    public ValidateOrderForCloseResponse createValidateOrderForCloseResponse() {
        return new ValidateOrderForCloseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateOrderForCloseRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/validateforclose/data/v1_10", name = "ValidateOrderForCloseRequest")
    public JAXBElement<ValidateOrderForCloseRequestType> createValidateOrderForCloseRequest(ValidateOrderForCloseRequestType value) {
        return new JAXBElement<ValidateOrderForCloseRequestType>(_ValidateOrderForCloseRequest_QNAME, ValidateOrderForCloseRequestType.class, null, value);
    }

}
