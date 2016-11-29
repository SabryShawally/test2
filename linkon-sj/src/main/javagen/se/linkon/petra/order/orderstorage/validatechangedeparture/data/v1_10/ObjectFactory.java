
package se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10 package. 
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

    private final static QName _ValidateChangeDepartureRequest_QNAME = new QName("http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10", "ValidateChangeDepartureRequest");
    private final static QName _ValidateChangeDepartureResponse_QNAME = new QName("http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10", "ValidateChangeDepartureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.orderstorage.validatechangedeparture.data.v1_10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateChangeDepartureRequestType }
     * 
     */
    public ValidateChangeDepartureRequestType createValidateChangeDepartureRequestType() {
        return new ValidateChangeDepartureRequestType();
    }

    /**
     * Create an instance of {@link ValidateChangeDepartureRequestType.OrderItems }
     * 
     */
    public ValidateChangeDepartureRequestType.OrderItems createValidateChangeDepartureRequestTypeOrderItems() {
        return new ValidateChangeDepartureRequestType.OrderItems();
    }

    /**
     * Create an instance of {@link ValidateChangeDepartureResponseType }
     * 
     */
    public ValidateChangeDepartureResponseType createValidateChangeDepartureResponseType() {
        return new ValidateChangeDepartureResponseType();
    }

    /**
     * Create an instance of {@link ValidForChangeDepartureOrderItemsType }
     * 
     */
    public ValidForChangeDepartureOrderItemsType createValidForChangeDepartureOrderItemsType() {
        return new ValidForChangeDepartureOrderItemsType();
    }

    /**
     * Create an instance of {@link ValidForChangeDepartureOrderItemType }
     * 
     */
    public ValidForChangeDepartureOrderItemType createValidForChangeDepartureOrderItemType() {
        return new ValidForChangeDepartureOrderItemType();
    }

    /**
     * Create an instance of {@link ValidForChangeDepartureType }
     * 
     */
    public ValidForChangeDepartureType createValidForChangeDepartureType() {
        return new ValidForChangeDepartureType();
    }

    /**
     * Create an instance of {@link ChangeDepartureDescriptionsType }
     * 
     */
    public ChangeDepartureDescriptionsType createChangeDepartureDescriptionsType() {
        return new ChangeDepartureDescriptionsType();
    }

    /**
     * Create an instance of {@link ChangeDepartureDescriptionType }
     * 
     */
    public ChangeDepartureDescriptionType createChangeDepartureDescriptionType() {
        return new ChangeDepartureDescriptionType();
    }

    /**
     * Create an instance of {@link SalesCategoryDescriptionType }
     * 
     */
    public SalesCategoryDescriptionType createSalesCategoryDescriptionType() {
        return new SalesCategoryDescriptionType();
    }

    /**
     * Create an instance of {@link PriceGroupDescriptionType }
     * 
     */
    public PriceGroupDescriptionType createPriceGroupDescriptionType() {
        return new PriceGroupDescriptionType();
    }

    /**
     * Create an instance of {@link NotValidForChangeDepartureTypes }
     * 
     */
    public NotValidForChangeDepartureTypes createNotValidForChangeDepartureTypes() {
        return new NotValidForChangeDepartureTypes();
    }

    /**
     * Create an instance of {@link NotValidForChangeDepartureType }
     * 
     */
    public NotValidForChangeDepartureType createNotValidForChangeDepartureType() {
        return new NotValidForChangeDepartureType();
    }

    /**
     * Create an instance of {@link ValidateChangeDepartureRequestType.OrderItems.OrderItem }
     * 
     */
    public ValidateChangeDepartureRequestType.OrderItems.OrderItem createValidateChangeDepartureRequestTypeOrderItemsOrderItem() {
        return new ValidateChangeDepartureRequestType.OrderItems.OrderItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateChangeDepartureRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10", name = "ValidateChangeDepartureRequest")
    public JAXBElement<ValidateChangeDepartureRequestType> createValidateChangeDepartureRequest(ValidateChangeDepartureRequestType value) {
        return new JAXBElement<ValidateChangeDepartureRequestType>(_ValidateChangeDepartureRequest_QNAME, ValidateChangeDepartureRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateChangeDepartureResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/orderstorage/validatechangedeparture/data/v1_10", name = "ValidateChangeDepartureResponse")
    public JAXBElement<ValidateChangeDepartureResponseType> createValidateChangeDepartureResponse(ValidateChangeDepartureResponseType value) {
        return new JAXBElement<ValidateChangeDepartureResponseType>(_ValidateChangeDepartureResponse_QNAME, ValidateChangeDepartureResponseType.class, null, value);
    }

}
