
package se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7 package. 
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

    private final static QName _TotalPriceDescription_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7", "TotalPriceDescription");
    private final static QName _PriceAndOptionsDescription_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7", "PriceAndOptionsDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.ordercommon.response.priceandoptions.data.v1_7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TotalPriceDescriptionType }
     * 
     */
    public TotalPriceDescriptionType createTotalPriceDescriptionType() {
        return new TotalPriceDescriptionType();
    }

    /**
     * Create an instance of {@link PriceAndOptionsDescriptionType }
     * 
     */
    public PriceAndOptionsDescriptionType createPriceAndOptionsDescriptionType() {
        return new PriceAndOptionsDescriptionType();
    }

    /**
     * Create an instance of {@link DiscountCategoriesType }
     * 
     */
    public DiscountCategoriesType createDiscountCategoriesType() {
        return new DiscountCategoriesType();
    }

    /**
     * Create an instance of {@link DiscountCategoryType }
     * 
     */
    public DiscountCategoryType createDiscountCategoryType() {
        return new DiscountCategoryType();
    }

    /**
     * Create an instance of {@link DiscountsType }
     * 
     */
    public DiscountsType createDiscountsType() {
        return new DiscountsType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link PriceDetailsType }
     * 
     */
    public PriceDetailsType createPriceDetailsType() {
        return new PriceDetailsType();
    }

    /**
     * Create an instance of {@link ServiceProducerAmountDescriptionType }
     * 
     */
    public ServiceProducerAmountDescriptionType createServiceProducerAmountDescriptionType() {
        return new ServiceProducerAmountDescriptionType();
    }

    /**
     * Create an instance of {@link ItineraryServicePriceType }
     * 
     */
    public ItineraryServicePriceType createItineraryServicePriceType() {
        return new ItineraryServicePriceType();
    }

    /**
     * Create an instance of {@link PlacementPriceDescriptionsType }
     * 
     */
    public PlacementPriceDescriptionsType createPlacementPriceDescriptionsType() {
        return new PlacementPriceDescriptionsType();
    }

    /**
     * Create an instance of {@link PlacementPriceDescriptionType }
     * 
     */
    public PlacementPriceDescriptionType createPlacementPriceDescriptionType() {
        return new PlacementPriceDescriptionType();
    }

    /**
     * Create an instance of {@link OptionPriceDescriptionsType }
     * 
     */
    public OptionPriceDescriptionsType createOptionPriceDescriptionsType() {
        return new OptionPriceDescriptionsType();
    }

    /**
     * Create an instance of {@link OptionPriceDescriptionType }
     * 
     */
    public OptionPriceDescriptionType createOptionPriceDescriptionType() {
        return new OptionPriceDescriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalPriceDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7", name = "TotalPriceDescription")
    public JAXBElement<TotalPriceDescriptionType> createTotalPriceDescription(TotalPriceDescriptionType value) {
        return new JAXBElement<TotalPriceDescriptionType>(_TotalPriceDescription_QNAME, TotalPriceDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndOptionsDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/priceandoptions/data/v1_7", name = "PriceAndOptionsDescription")
    public JAXBElement<PriceAndOptionsDescriptionType> createPriceAndOptionsDescription(PriceAndOptionsDescriptionType value) {
        return new JAXBElement<PriceAndOptionsDescriptionType>(_PriceAndOptionsDescription_QNAME, PriceAndOptionsDescriptionType.class, null, value);
    }

}
