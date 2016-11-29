
package se.linkon.petra.order.ordercommon.response.ordernotes.data.v1_7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.ordercommon.response.ordernotes.data.v1_7 package. 
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

    private final static QName _OrderNotes_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/ordernotes/data/v1_7", "OrderNotes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.ordercommon.response.ordernotes.data.v1_7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderNotesType }
     * 
     */
    public OrderNotesType createOrderNotesType() {
        return new OrderNotesType();
    }

    /**
     * Create an instance of {@link OrderNoteType }
     * 
     */
    public OrderNoteType createOrderNoteType() {
        return new OrderNoteType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderNotesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/ordernotes/data/v1_7", name = "OrderNotes")
    public JAXBElement<OrderNotesType> createOrderNotes(OrderNotesType value) {
        return new JAXBElement<OrderNotesType>(_OrderNotes_QNAME, OrderNotesType.class, null, value);
    }

}
