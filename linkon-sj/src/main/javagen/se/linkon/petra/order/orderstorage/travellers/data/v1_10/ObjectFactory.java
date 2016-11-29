
package se.linkon.petra.order.orderstorage.travellers.data.v1_10;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.travellers.data.v1_10 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.travellers.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveTravellersRequest }
     * 
     */
    public RemoveTravellersRequest createRemoveTravellersRequest() {
        return new RemoveTravellersRequest();
    }

    /**
     * Create an instance of {@link OrderItemIdsSpecification }
     * 
     */
    public OrderItemIdsSpecification createOrderItemIdsSpecification() {
        return new OrderItemIdsSpecification();
    }

    /**
     * Create an instance of {@link TravellerNumbersSpecification }
     * 
     */
    public TravellerNumbersSpecification createTravellerNumbersSpecification() {
        return new TravellerNumbersSpecification();
    }

    /**
     * Create an instance of {@link RemoveTravellersResponse }
     * 
     */
    public RemoveTravellersResponse createRemoveTravellersResponse() {
        return new RemoveTravellersResponse();
    }

}
