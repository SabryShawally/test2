
package se.linkon.petra.order.orderstorage.ordernotes.data.v1_10;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.ordernotes.data.v1_10 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.ordernotes.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetOrderNotesSpecification }
     * 
     */
    public SetOrderNotesSpecification createSetOrderNotesSpecification() {
        return new SetOrderNotesSpecification();
    }

    /**
     * Create an instance of {@link OrderNoteSpecifications }
     * 
     */
    public OrderNoteSpecifications createOrderNoteSpecifications() {
        return new OrderNoteSpecifications();
    }

    /**
     * Create an instance of {@link SetOrderNotesResponse }
     * 
     */
    public SetOrderNotesResponse createSetOrderNotesResponse() {
        return new SetOrderNotesResponse();
    }

}
