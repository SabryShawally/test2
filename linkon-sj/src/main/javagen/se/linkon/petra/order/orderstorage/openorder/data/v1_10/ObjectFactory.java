
package se.linkon.petra.order.orderstorage.openorder.data.v1_10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.openorder.data.v1_10 package. 
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

    private final static QName _OpenOrderSpecification_QNAME = new QName("http://petra.linkon.se/order/orderstorage/openorder/data/v1_10", "OpenOrderSpecification");
    private final static QName _OpenOrderDescription_QNAME = new QName("http://petra.linkon.se/order/orderstorage/openorder/data/v1_10", "OpenOrderDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.openorder.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpenOrderSpecification }
     * 
     */
    public OpenOrderSpecification createOpenOrderSpecification() {
        return new OpenOrderSpecification();
    }

    /**
     * Create an instance of {@link OpenOrderDescription }
     * 
     */
    public OpenOrderDescription createOpenOrderDescription() {
        return new OpenOrderDescription();
    }

    /**
     * Create an instance of {@link ValidateOrderAccessType }
     * 
     */
    public ValidateOrderAccessType createValidateOrderAccessType() {
        return new ValidateOrderAccessType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOrderSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/openorder/data/v1_10", name = "OpenOrderSpecification")
    public JAXBElement<OpenOrderSpecification> createOpenOrderSpecification(OpenOrderSpecification value) {
        return new JAXBElement<OpenOrderSpecification>(_OpenOrderSpecification_QNAME, OpenOrderSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOrderDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/openorder/data/v1_10", name = "OpenOrderDescription")
    public JAXBElement<OpenOrderDescription> createOpenOrderDescription(OpenOrderDescription value) {
        return new JAXBElement<OpenOrderDescription>(_OpenOrderDescription_QNAME, OpenOrderDescription.class, null, value);
    }

}
