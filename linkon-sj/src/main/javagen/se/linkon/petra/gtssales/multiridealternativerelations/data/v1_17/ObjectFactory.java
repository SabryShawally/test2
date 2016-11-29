
package se.linkon.petra.gtssales.multiridealternativerelations.data.v1_17;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.gtssales.multiridealternativerelations.data.v1_17 package. 
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

    private final static QName _MultiRideAlternativeRelationsSpecification_QNAME = new QName("http://petra.linkon.se/gtssales/multiridealternativerelations/data/v1_17", "MultiRideAlternativeRelationsSpecification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.gtssales.multiridealternativerelations.data.v1_17
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiRideAlternativeRelationsSpecification }
     * 
     */
    public MultiRideAlternativeRelationsSpecification createMultiRideAlternativeRelationsSpecification() {
        return new MultiRideAlternativeRelationsSpecification();
    }

    /**
     * Create an instance of {@link MultiRideAlternativeRelationsDescription }
     * 
     */
    public MultiRideAlternativeRelationsDescription createMultiRideAlternativeRelationsDescription() {
        return new MultiRideAlternativeRelationsDescription();
    }

    /**
     * Create an instance of {@link AlternativeRelationsDescriptionsType }
     * 
     */
    public AlternativeRelationsDescriptionsType createAlternativeRelationsDescriptionsType() {
        return new AlternativeRelationsDescriptionsType();
    }

    /**
     * Create an instance of {@link AlternativeRelationsDescriptionType }
     * 
     */
    public AlternativeRelationsDescriptionType createAlternativeRelationsDescriptionType() {
        return new AlternativeRelationsDescriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiRideAlternativeRelationsSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/gtssales/multiridealternativerelations/data/v1_17", name = "MultiRideAlternativeRelationsSpecification")
    public JAXBElement<MultiRideAlternativeRelationsSpecification> createMultiRideAlternativeRelationsSpecification(MultiRideAlternativeRelationsSpecification value) {
        return new JAXBElement<MultiRideAlternativeRelationsSpecification>(_MultiRideAlternativeRelationsSpecification_QNAME, MultiRideAlternativeRelationsSpecification.class, null, value);
    }

}
