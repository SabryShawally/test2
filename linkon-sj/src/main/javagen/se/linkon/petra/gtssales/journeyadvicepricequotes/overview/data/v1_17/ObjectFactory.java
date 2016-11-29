
package se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import se.linkon.petra.commonelements.data.v4_6.EmptyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17 package. 
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

    private final static QName _PriceGroupChoicesExist_QNAME = new QName("http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17", "PriceGroupChoicesExist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.gtssales.journeyadvicepricequotes.overview.data.v1_17
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetJourneyAdviceOverviewPriceQuotesSpecification }
     * 
     */
    public GetJourneyAdviceOverviewPriceQuotesSpecification createGetJourneyAdviceOverviewPriceQuotesSpecification() {
        return new GetJourneyAdviceOverviewPriceQuotesSpecification();
    }

    /**
     * Create an instance of {@link GetJourneyAdviceOverviewPriceQuotesDescription }
     * 
     */
    public GetJourneyAdviceOverviewPriceQuotesDescription createGetJourneyAdviceOverviewPriceQuotesDescription() {
        return new GetJourneyAdviceOverviewPriceQuotesDescription();
    }

    /**
     * Create an instance of {@link JourneyAdviceDescriptionsType }
     * 
     */
    public JourneyAdviceDescriptionsType createJourneyAdviceDescriptionsType() {
        return new JourneyAdviceDescriptionsType();
    }

    /**
     * Create an instance of {@link JourneyAdviceDescriptionType }
     * 
     */
    public JourneyAdviceDescriptionType createJourneyAdviceDescriptionType() {
        return new JourneyAdviceDescriptionType();
    }

    /**
     * Create an instance of {@link SalesCategoryDescriptionsType }
     * 
     */
    public SalesCategoryDescriptionsType createSalesCategoryDescriptionsType() {
        return new SalesCategoryDescriptionsType();
    }

    /**
     * Create an instance of {@link SalesCategoryDescriptionType }
     * 
     */
    public SalesCategoryDescriptionType createSalesCategoryDescriptionType() {
        return new SalesCategoryDescriptionType();
    }

    /**
     * Create an instance of {@link JourneyAdvicePriceDescriptionType }
     * 
     */
    public JourneyAdvicePriceDescriptionType createJourneyAdvicePriceDescriptionType() {
        return new JourneyAdvicePriceDescriptionType();
    }

    /**
     * Create an instance of {@link ItineraryPriceGroupChoicesType }
     * 
     */
    public ItineraryPriceGroupChoicesType createItineraryPriceGroupChoicesType() {
        return new ItineraryPriceGroupChoicesType();
    }

    /**
     * Create an instance of {@link ItineraryPriceGroupChoiceType }
     * 
     */
    public ItineraryPriceGroupChoiceType createItineraryPriceGroupChoiceType() {
        return new ItineraryPriceGroupChoiceType();
    }

    /**
     * Create an instance of {@link ConsumerItineraryDescriptionsType }
     * 
     */
    public ConsumerItineraryDescriptionsType createConsumerItineraryDescriptionsType() {
        return new ConsumerItineraryDescriptionsType();
    }

    /**
     * Create an instance of {@link ConsumerItineraryDescriptionType }
     * 
     */
    public ConsumerItineraryDescriptionType createConsumerItineraryDescriptionType() {
        return new ConsumerItineraryDescriptionType();
    }

    /**
     * Create an instance of {@link ConsumerDescriptionsType }
     * 
     */
    public ConsumerDescriptionsType createConsumerDescriptionsType() {
        return new ConsumerDescriptionsType();
    }

    /**
     * Create an instance of {@link ConsumerDescriptionType }
     * 
     */
    public ConsumerDescriptionType createConsumerDescriptionType() {
        return new ConsumerDescriptionType();
    }

    /**
     * Create an instance of {@link RequiredOptionsType }
     * 
     */
    public RequiredOptionsType createRequiredOptionsType() {
        return new RequiredOptionsType();
    }

    /**
     * Create an instance of {@link RequiredOptionType }
     * 
     */
    public RequiredOptionType createRequiredOptionType() {
        return new RequiredOptionType();
    }

    /**
     * Create an instance of {@link ConsumerSegmentDescriptionsType }
     * 
     */
    public ConsumerSegmentDescriptionsType createConsumerSegmentDescriptionsType() {
        return new ConsumerSegmentDescriptionsType();
    }

    /**
     * Create an instance of {@link ConsumerSegmentDescriptionType }
     * 
     */
    public ConsumerSegmentDescriptionType createConsumerSegmentDescriptionType() {
        return new ConsumerSegmentDescriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/gtssales/journeyadvicepricequotes/overview/data/v1_17", name = "PriceGroupChoicesExist")
    public JAXBElement<EmptyType> createPriceGroupChoicesExist(EmptyType value) {
        return new JAXBElement<EmptyType>(_PriceGroupChoicesExist_QNAME, EmptyType.class, null, value);
    }

}
