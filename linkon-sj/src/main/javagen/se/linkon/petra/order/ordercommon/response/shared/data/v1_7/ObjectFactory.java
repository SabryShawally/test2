
package se.linkon.petra.order.ordercommon.response.shared.data.v1_7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.order.ordercommon.response.shared.data.v1_7 package. 
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

    private final static QName _MembershipIdentification_QNAME = new QName("http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7", "MembershipIdentification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.order.ordercommon.response.shared.data.v1_7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InformationDescriptionsType }
     * 
     */
    public InformationDescriptionsType createInformationDescriptionsType() {
        return new InformationDescriptionsType();
    }

    /**
     * Create an instance of {@link MembershipIdentificationType }
     * 
     */
    public MembershipIdentificationType createMembershipIdentificationType() {
        return new MembershipIdentificationType();
    }

    /**
     * Create an instance of {@link FormOfIdentificationType }
     * 
     */
    public FormOfIdentificationType createFormOfIdentificationType() {
        return new FormOfIdentificationType();
    }

    /**
     * Create an instance of {@link ETicketCardType }
     * 
     */
    public ETicketCardType createETicketCardType() {
        return new ETicketCardType();
    }

    /**
     * Create an instance of {@link InformationTexts }
     * 
     */
    public InformationTexts createInformationTexts() {
        return new InformationTexts();
    }

    /**
     * Create an instance of {@link InformationDescriptionType }
     * 
     */
    public InformationDescriptionType createInformationDescriptionType() {
        return new InformationDescriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MembershipIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/order/ordercommon/response/shared/data/v1_7", name = "MembershipIdentification")
    public JAXBElement<MembershipIdentificationType> createMembershipIdentification(MembershipIdentificationType value) {
        return new JAXBElement<MembershipIdentificationType>(_MembershipIdentification_QNAME, MembershipIdentificationType.class, null, value);
    }

}
