
package se.linkon.petra.order.orderstorage.openorderforedit.data.v1_10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.openorderforedit.data.v1_10 package. 
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

    private final static QName _OpenOrderForEditRequest_QNAME = new QName("http://petra.linkon.se/order/orderstorage/openorderforedit/data/v1_10", "OpenOrderForEditRequest");
    private final static QName _OpenOrderForEditResponse_QNAME = new QName("http://petra.linkon.se/order/orderstorage/openorderforedit/data/v1_10", "OpenOrderForEditResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.openorderforedit.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpenOrderForEditRequest }
     * 
     */
    public OpenOrderForEditRequest createOpenOrderForEditRequest() {
        return new OpenOrderForEditRequest();
    }

    /**
     * Create an instance of {@link OpenOrderForEditResponse }
     * 
     */
    public OpenOrderForEditResponse createOpenOrderForEditResponse() {
        return new OpenOrderForEditResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOrderForEditRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/openorderforedit/data/v1_10", name = "OpenOrderForEditRequest")
    public JAXBElement<OpenOrderForEditRequest> createOpenOrderForEditRequest(OpenOrderForEditRequest value) {
        return new JAXBElement<OpenOrderForEditRequest>(_OpenOrderForEditRequest_QNAME, OpenOrderForEditRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOrderForEditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/openorderforedit/data/v1_10", name = "OpenOrderForEditResponse")
    public JAXBElement<OpenOrderForEditResponse> createOpenOrderForEditResponse(OpenOrderForEditResponse value) {
        return new JAXBElement<OpenOrderForEditResponse>(_OpenOrderForEditResponse_QNAME, OpenOrderForEditResponse.class, null, value);
    }

}
