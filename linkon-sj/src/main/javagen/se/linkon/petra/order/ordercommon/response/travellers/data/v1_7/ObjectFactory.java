
package se.linkon.petra.order.ordercommon.response.travellers.data.v1_7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.ordercommon.response.travellers.data.v1_7 package. 
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

    private final static QName _TravellersResponse_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7", "TravellersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.ordercommon.response.travellers.data.v1_7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TravellersResponseType }
     * 
     */
    public TravellersResponseType createTravellersResponseType() {
        return new TravellersResponseType();
    }

    /**
     * Create an instance of {@link TravellerDescriptionsType }
     * 
     */
    public TravellerDescriptionsType createTravellerDescriptionsType() {
        return new TravellerDescriptionsType();
    }

    /**
     * Create an instance of {@link TravellerDescriptionType }
     * 
     */
    public TravellerDescriptionType createTravellerDescriptionType() {
        return new TravellerDescriptionType();
    }

    /**
     * Create an instance of {@link FrequentTravellerDescriptionType }
     * 
     */
    public FrequentTravellerDescriptionType createFrequentTravellerDescriptionType() {
        return new FrequentTravellerDescriptionType();
    }

    /**
     * Create an instance of {@link TemporaryTravellerDescriptionType }
     * 
     */
    public TemporaryTravellerDescriptionType createTemporaryTravellerDescriptionType() {
        return new TemporaryTravellerDescriptionType();
    }

    /**
     * Create an instance of {@link OrderItemDescriptionsType }
     * 
     */
    public OrderItemDescriptionsType createOrderItemDescriptionsType() {
        return new OrderItemDescriptionsType();
    }

    /**
     * Create an instance of {@link OrderItemDescriptionType }
     * 
     */
    public OrderItemDescriptionType createOrderItemDescriptionType() {
        return new OrderItemDescriptionType();
    }

    /**
     * Create an instance of {@link InvoiceReferencesType }
     * 
     */
    public InvoiceReferencesType createInvoiceReferencesType() {
        return new InvoiceReferencesType();
    }

    /**
     * Create an instance of {@link TravellerConnectionsDescriptionType }
     * 
     */
    public TravellerConnectionsDescriptionType createTravellerConnectionsDescriptionType() {
        return new TravellerConnectionsDescriptionType();
    }

    /**
     * Create an instance of {@link NonFrequentTravellerNumbersType }
     * 
     */
    public NonFrequentTravellerNumbersType createNonFrequentTravellerNumbersType() {
        return new NonFrequentTravellerNumbersType();
    }

    /**
     * Create an instance of {@link NonFrequentTravellerNumberType }
     * 
     */
    public NonFrequentTravellerNumberType createNonFrequentTravellerNumberType() {
        return new NonFrequentTravellerNumberType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravellersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/travellers/data/v1_7", name = "TravellersResponse")
    public JAXBElement<TravellersResponseType> createTravellersResponse(TravellersResponseType value) {
        return new JAXBElement<TravellersResponseType>(_TravellersResponse_QNAME, TravellersResponseType.class, null, value);
    }

}
