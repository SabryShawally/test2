
package se.linkon.petra.order.orderstorage.validateforcancel.data.v1_10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.validateforcancel.data.v1_10 package. 
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

    private final static QName _ValidateOrderForCancelRequest_QNAME = new QName("http://petra.linkon.se/order/orderstorage/validateforcancel/data/v1_10", "ValidateOrderForCancelRequest");
    private final static QName _ValidateOrderForCancelResponse_QNAME = new QName("http://petra.linkon.se/order/orderstorage/validateforcancel/data/v1_10", "ValidateOrderForCancelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.validateforcancel.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateOrderForCancelRequestType }
     * 
     */
    public ValidateOrderForCancelRequestType createValidateOrderForCancelRequestType() {
        return new ValidateOrderForCancelRequestType();
    }

    /**
     * Create an instance of {@link ValidateOrderForCancelResponseType }
     * 
     */
    public ValidateOrderForCancelResponseType createValidateOrderForCancelResponseType() {
        return new ValidateOrderForCancelResponseType();
    }

    /**
     * Create an instance of {@link ValidForCancelOrderItemListType }
     * 
     */
    public ValidForCancelOrderItemListType createValidForCancelOrderItemListType() {
        return new ValidForCancelOrderItemListType();
    }

    /**
     * Create an instance of {@link ValidForCancelOrderItemType }
     * 
     */
    public ValidForCancelOrderItemType createValidForCancelOrderItemType() {
        return new ValidForCancelOrderItemType();
    }

    /**
     * Create an instance of {@link NotValidForCancelType }
     * 
     */
    public NotValidForCancelType createNotValidForCancelType() {
        return new NotValidForCancelType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateOrderForCancelRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/validateforcancel/data/v1_10", name = "ValidateOrderForCancelRequest")
    public JAXBElement<ValidateOrderForCancelRequestType> createValidateOrderForCancelRequest(ValidateOrderForCancelRequestType value) {
        return new JAXBElement<ValidateOrderForCancelRequestType>(_ValidateOrderForCancelRequest_QNAME, ValidateOrderForCancelRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateOrderForCancelResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/validateforcancel/data/v1_10", name = "ValidateOrderForCancelResponse")
    public JAXBElement<ValidateOrderForCancelResponseType> createValidateOrderForCancelResponse(ValidateOrderForCancelResponseType value) {
        return new JAXBElement<ValidateOrderForCancelResponseType>(_ValidateOrderForCancelResponse_QNAME, ValidateOrderForCancelResponseType.class, null, value);
    }

}
