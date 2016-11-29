
package se.linkon.petra.order.ordercommon.response.distributorreferences.data.v1_7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.ordercommon.response.distributorreferences.data.v1_7 package. 
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

    private final static QName _TravelAgentInformation_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7", "TravelAgentInformation");
    private final static QName _InvoiceReferences_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7", "InvoiceReferences");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.ordercommon.response.distributorreferences.data.v1_7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TravelAgentInformationType }
     * 
     */
    public TravelAgentInformationType createTravelAgentInformationType() {
        return new TravelAgentInformationType();
    }

    /**
     * Create an instance of {@link InvoiceReferencesType }
     * 
     */
    public InvoiceReferencesType createInvoiceReferencesType() {
        return new InvoiceReferencesType();
    }

    /**
     * Create an instance of {@link CustomerAdressType }
     * 
     */
    public CustomerAdressType createCustomerAdressType() {
        return new CustomerAdressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgentInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7", name = "TravelAgentInformation")
    public JAXBElement<TravelAgentInformationType> createTravelAgentInformation(TravelAgentInformationType value) {
        return new JAXBElement<TravelAgentInformationType>(_TravelAgentInformation_QNAME, TravelAgentInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceReferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/distributorreferences/data/v1_7", name = "InvoiceReferences")
    public JAXBElement<InvoiceReferencesType> createInvoiceReferences(InvoiceReferencesType value) {
        return new JAXBElement<InvoiceReferencesType>(_InvoiceReferences_QNAME, InvoiceReferencesType.class, null, value);
    }

}
