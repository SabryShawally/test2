
package se.linkon.petra.commoncomplexelements.data.v4_6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.commoncomplexelements.data.v4_6 package. 
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

    private final static QName _ExceptionData_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "ExceptionData");
    private final static QName _CallerPrincipal_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "CallerPrincipal");
    private final static QName _CodePlaintext_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "CodePlaintext");
    private final static QName _DynamicTextList_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "DynamicTextList");
    private final static QName _Money_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "Money");
    private final static QName _Permission_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "Permission");
    private final static QName _Permissions_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "Permissions");
    private final static QName _PriceVat_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "PriceVat");
    private final static QName _DateTime_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "DateTime");
    private final static QName _CardValidThru_QNAME = new QName("http://petra.linkon.se/commoncomplexelements/data/v4_6", "CardValidThru");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.commoncomplexelements.data.v4_6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceVatType }
     * 
     */
    public PriceVatType createPriceVatType() {
        return new PriceVatType();
    }

    /**
     * Create an instance of {@link ExceptionData }
     * 
     */
    public ExceptionData createExceptionData() {
        return new ExceptionData();
    }

    /**
     * Create an instance of {@link ClientInformation }
     * 
     */
    public ClientInformation createClientInformation() {
        return new ClientInformation();
    }

    /**
     * Create an instance of {@link CallerPrincipalType }
     * 
     */
    public CallerPrincipalType createCallerPrincipalType() {
        return new CallerPrincipalType();
    }

    /**
     * Create an instance of {@link ServerInformation }
     * 
     */
    public ServerInformation createServerInformation() {
        return new ServerInformation();
    }

    /**
     * Create an instance of {@link CodePlaintextType }
     * 
     */
    public CodePlaintextType createCodePlaintextType() {
        return new CodePlaintextType();
    }

    /**
     * Create an instance of {@link DynamicTextListType }
     * 
     */
    public DynamicTextListType createDynamicTextListType() {
        return new DynamicTextListType();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link PermissionType }
     * 
     */
    public PermissionType createPermissionType() {
        return new PermissionType();
    }

    /**
     * Create an instance of {@link PermissionsType }
     * 
     */
    public PermissionsType createPermissionsType() {
        return new PermissionsType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link CardValidThruType }
     * 
     */
    public CardValidThruType createCardValidThruType() {
        return new CardValidThruType();
    }

    /**
     * Create an instance of {@link CustomerAddressType }
     * 
     */
    public CustomerAddressType createCustomerAddressType() {
        return new CustomerAddressType();
    }

    /**
     * Create an instance of {@link CodeDescription }
     * 
     */
    public CodeDescription createCodeDescription() {
        return new CodeDescription();
    }

    /**
     * Create an instance of {@link SystemErrorInformationType }
     * 
     */
    public SystemErrorInformationType createSystemErrorInformationType() {
        return new SystemErrorInformationType();
    }

    /**
     * Create an instance of {@link TicketDistributionCodeType }
     * 
     */
    public TicketDistributionCodeType createTicketDistributionCodeType() {
        return new TicketDistributionCodeType();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "ExceptionData")
    public JAXBElement<ExceptionData> createExceptionData(ExceptionData value) {
        return new JAXBElement<ExceptionData>(_ExceptionData_QNAME, ExceptionData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallerPrincipalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "CallerPrincipal")
    public JAXBElement<CallerPrincipalType> createCallerPrincipal(CallerPrincipalType value) {
        return new JAXBElement<CallerPrincipalType>(_CallerPrincipal_QNAME, CallerPrincipalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodePlaintextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "CodePlaintext")
    public JAXBElement<CodePlaintextType> createCodePlaintext(CodePlaintextType value) {
        return new JAXBElement<CodePlaintextType>(_CodePlaintext_QNAME, CodePlaintextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicTextListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "DynamicTextList")
    public JAXBElement<DynamicTextListType> createDynamicTextList(DynamicTextListType value) {
        return new JAXBElement<DynamicTextListType>(_DynamicTextList_QNAME, DynamicTextListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "Money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "Permission")
    public JAXBElement<PermissionType> createPermission(PermissionType value) {
        return new JAXBElement<PermissionType>(_Permission_QNAME, PermissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermissionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "Permissions")
    public JAXBElement<PermissionsType> createPermissions(PermissionsType value) {
        return new JAXBElement<PermissionsType>(_Permissions_QNAME, PermissionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceVatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "PriceVat")
    public JAXBElement<PriceVatType> createPriceVat(PriceVatType value) {
        return new JAXBElement<PriceVatType>(_PriceVat_QNAME, PriceVatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "DateTime")
    public JAXBElement<DateTimeType> createDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_DateTime_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardValidThruType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commoncomplexelements/data/v4_6", name = "CardValidThru")
    public JAXBElement<CardValidThruType> createCardValidThru(CardValidThruType value) {
        return new JAXBElement<CardValidThruType>(_CardValidThru_QNAME, CardValidThruType.class, null, value);
    }

}
