
package se.linkon.petra.gtssales.passengercategories.data.v1_17;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.gtssales.passengercategories.data.v1_17 package. 
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

    private final static QName _PassengerAgeRequiredCode_QNAME = new QName("http://petra.linkon.se/gtssales/passengercategories/data/v1_17", "PassengerAgeRequiredCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.gtssales.passengercategories.data.v1_17
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPassengerCategoriesRequest }
     * 
     */
    public GetPassengerCategoriesRequest createGetPassengerCategoriesRequest() {
        return new GetPassengerCategoriesRequest();
    }

    /**
     * Create an instance of {@link GetPassengerCategoriesResponse }
     * 
     */
    public GetPassengerCategoriesResponse createGetPassengerCategoriesResponse() {
        return new GetPassengerCategoriesResponse();
    }

    /**
     * Create an instance of {@link PassengerCategoriesInformationType }
     * 
     */
    public PassengerCategoriesInformationType createPassengerCategoriesInformationType() {
        return new PassengerCategoriesInformationType();
    }

    /**
     * Create an instance of {@link PassengerCategoryInformationType }
     * 
     */
    public PassengerCategoryInformationType createPassengerCategoryInformationType() {
        return new PassengerCategoryInformationType();
    }

    /**
     * Create an instance of {@link PassengerAgeRangeType }
     * 
     */
    public PassengerAgeRangeType createPassengerAgeRangeType() {
        return new PassengerAgeRangeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerAgeRequiredCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/gtssales/passengercategories/data/v1_17", name = "PassengerAgeRequiredCode")
    public JAXBElement<PassengerAgeRequiredCodeType> createPassengerAgeRequiredCode(PassengerAgeRequiredCodeType value) {
        return new JAXBElement<PassengerAgeRequiredCodeType>(_PassengerAgeRequiredCode_QNAME, PassengerAgeRequiredCodeType.class, null, value);
    }

}
