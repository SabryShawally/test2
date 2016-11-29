
package se.linkon.petra.order.orderstorage.cancel.data.v1_10;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.cancel.data.v1_10 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.cancel.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelSpecification }
     * 
     */
    public CancelSpecification createCancelSpecification() {
        return new CancelSpecification();
    }

    /**
     * Create an instance of {@link CancelSpecification.OrderItems }
     * 
     */
    public CancelSpecification.OrderItems createCancelSpecificationOrderItems() {
        return new CancelSpecification.OrderItems();
    }

    /**
     * Create an instance of {@link CancelResponse }
     * 
     */
    public CancelResponse createCancelResponse() {
        return new CancelResponse();
    }

    /**
     * Create an instance of {@link CancelItemListType }
     * 
     */
    public CancelItemListType createCancelItemListType() {
        return new CancelItemListType();
    }

    /**
     * Create an instance of {@link CancelItemType }
     * 
     */
    public CancelItemType createCancelItemType() {
        return new CancelItemType();
    }

    /**
     * Create an instance of {@link CancelSpecification.OrderItems.OrderItem }
     * 
     */
    public CancelSpecification.OrderItems.OrderItem createCancelSpecificationOrderItemsOrderItem() {
        return new CancelSpecification.OrderItems.OrderItem();
    }

}
