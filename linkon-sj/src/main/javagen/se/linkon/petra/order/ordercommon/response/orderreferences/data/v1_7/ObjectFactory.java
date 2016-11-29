
package se.linkon.petra.order.ordercommon.response.orderreferences.data.v1_7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.ordercommon.response.orderreferences.data.v1_7 package. 
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

    private final static QName _Payer_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/orderreferences/data/v1_7", "Payer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.ordercommon.response.orderreferences.data.v1_7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayerType }
     * 
     */
    public PayerType createPayerType() {
        return new PayerType();
    }

    /**
     * Create an instance of {@link PayerReferenceType }
     * 
     */
    public PayerReferenceType createPayerReferenceType() {
        return new PayerReferenceType();
    }

    /**
     * Create an instance of {@link ReferenceAddressType }
     * 
     */
    public ReferenceAddressType createReferenceAddressType() {
        return new ReferenceAddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/orderreferences/data/v1_7", name = "Payer")
    public JAXBElement<PayerType> createPayer(PayerType value) {
        return new JAXBElement<PayerType>(_Payer_QNAME, PayerType.class, null, value);
    }

}
