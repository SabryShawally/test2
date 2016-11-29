
package se.linkon.petra.order.orderstorage.distributor.data.v1_10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.distributor.data.v1_10 package. 
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

    private final static QName _TravelAgencyCustomerId_QNAME = new QName("http://petra.linkon.se/order/orderstorage/distributor/data/v1_10", "TravelAgencyCustomerId");
    private final static QName _PrintHandling_QNAME = new QName("http://petra.linkon.se/order/orderstorage/distributor/data/v1_10", "PrintHandling");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.distributor.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetDistributorReferencesRequest }
     * 
     */
    public SetDistributorReferencesRequest createSetDistributorReferencesRequest() {
        return new SetDistributorReferencesRequest();
    }

    /**
     * Create an instance of {@link TravelAgentInformationType }
     * 
     */
    public TravelAgentInformationType createTravelAgentInformationType() {
        return new TravelAgentInformationType();
    }

    /**
     * Create an instance of {@link SetDistributorReferencesResponse }
     * 
     */
    public SetDistributorReferencesResponse createSetDistributorReferencesResponse() {
        return new SetDistributorReferencesResponse();
    }

    /**
     * Create an instance of {@link CustomerAddressType }
     * 
     */
    public CustomerAddressType createCustomerAddressType() {
        return new CustomerAddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/distributor/data/v1_10", name = "TravelAgencyCustomerId")
    public JAXBElement<String> createTravelAgencyCustomerId(String value) {
        return new JAXBElement<String>(_TravelAgencyCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintHandlingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/distributor/data/v1_10", name = "PrintHandling")
    public JAXBElement<PrintHandlingType> createPrintHandling(PrintHandlingType value) {
        return new JAXBElement<PrintHandlingType>(_PrintHandling_QNAME, PrintHandlingType.class, null, value);
    }

}
