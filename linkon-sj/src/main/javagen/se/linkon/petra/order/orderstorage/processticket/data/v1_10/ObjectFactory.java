
package se.linkon.petra.order.orderstorage.processticket.data.v1_10;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.processticket.data.v1_10 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.processticket.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessTicketRequest }
     * 
     */
    public ProcessTicketRequest createProcessTicketRequest() {
        return new ProcessTicketRequest();
    }

    /**
     * Create an instance of {@link TearTicketType }
     * 
     */
    public TearTicketType createTearTicketType() {
        return new TearTicketType();
    }

    /**
     * Create an instance of {@link RevokTearTicketType }
     * 
     */
    public RevokTearTicketType createRevokTearTicketType() {
        return new RevokTearTicketType();
    }

    /**
     * Create an instance of {@link ProcessTicketResponse }
     * 
     */
    public ProcessTicketResponse createProcessTicketResponse() {
        return new ProcessTicketResponse();
    }

    /**
     * Create an instance of {@link OrderItemsType }
     * 
     */
    public OrderItemsType createOrderItemsType() {
        return new OrderItemsType();
    }

}
