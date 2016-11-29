
package se.linkon.petra.commonelements.data.v4_6;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.linkon.petra.commonelements.data.v4_6 package. 
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

    private final static QName _SalesOrderId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesOrderId");
    private final static QName _OrderLockId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderLockId");
    private final static QName _AccessLevel_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AccessLevel");
    private final static QName _AccountProducer_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AccountProducer");
    private final static QName _AccountProducerName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AccountProducerName");
    private final static QName _AccountStatus_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AccountStatus");
    private final static QName _AdditionalEquipment_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AdditionalEquipment");
    private final static QName _AdditionalPaymentCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AdditionalPaymentCode");
    private final static QName _AddressType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AddressType");
    private final static QName _AllowedCredit_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AllowedCredit");
    private final static QName _AlternativeCreditCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "AlternativeCreditCode");
    private final static QName _ArrivalDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ArrivalDate");
    private final static QName _ArrivalDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ArrivalDateTime");
    private final static QName _ArrivalTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ArrivalTime");
    private final static QName _BatchId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BatchId");
    private final static QName _BirthDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BirthDate");
    private final static QName _BirthDateMandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BirthDateMandatory");
    private final static QName _BookingClass_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BookingClass");
    private final static QName _BookingDeviation_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BookingDeviation");
    private final static QName _BookingDialogNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BookingDialogNumber");
    private final static QName _BookingRule_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BookingRule");
    private final static QName _BookingService_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BookingService");
    private final static QName _BusinessArea_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "BusinessArea");
    private final static QName _Buyer_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Buyer");
    private final static QName _CancelDialogNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CancelDialogNumber");
    private final static QName _CancellationDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CancellationDate");
    private final static QName _CancellationDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CancellationDateTime");
    private final static QName _CancellationProducerCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CancellationProducerCode");
    private final static QName _CancellationTerminalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CancellationTerminalId");
    private final static QName _CancellationUserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CancellationUserId");
    private final static QName _CancelReasonCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CancelReasonCode");
    private final static QName _CardDataTransferenceDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardDataTransferenceDate");
    private final static QName _CardMandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardMandatory");
    private final static QName _CardNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardNumber");
    private final static QName _CardPin_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardPin");
    private final static QName _CardSystem_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardSystem");
    private final static QName _CardType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardType");
    private final static QName _CareOf_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CareOf");
    private final static QName _CarriageGroup_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CarriageGroup");
    private final static QName _CarriageGroupStartDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CarriageGroupStartDate");
    private final static QName _CarriageId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CarriageId");
    private final static QName _CarriageType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CarriageType");
    private final static QName _CarriageTypeNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CarriageTypeNumber");
    private final static QName _CashDiscountCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CashDiscountCode");
    private final static QName _CashJournalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CashJournalId");
    private final static QName _CatalogueListId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CatalogueListId");
    private final static QName _CatalogueListName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CatalogueListName");
    private final static QName _CheckInStartTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CheckInStartTime");
    private final static QName _ChildrenAges_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ChildrenAges");
    private final static QName _CityLongName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CityLongName");
    private final static QName _CityName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CityName");
    private final static QName _ClassId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ClassId");
    private final static QName _ClearCustomer_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ClearCustomer");
    private final static QName _CombinationDiscountNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CombinationDiscountNumber");
    private final static QName _Comments_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Comments");
    private final static QName _Commission_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Commission");
    private final static QName _CommunicationCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CommunicationCode");
    private final static QName _CompanyCustomerId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompanyCustomerId");
    private final static QName _CompanyForm_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompanyForm");
    private final static QName _CompanyName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompanyName");
    private final static QName _CompartmentCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompartmentCode");
    private final static QName _CompartmentNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompartmentNumber");
    private final static QName _CompartmentSize_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompartmentSize");
    private final static QName _CompleteTelephoneNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompleteTelephoneNumber");
    private final static QName _CompletionStatus_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompletionStatus");
    private final static QName _CompletionSystem_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompletionSystem");
    private final static QName _ComponentName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ComponentName");
    private final static QName _ComponentNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ComponentNumber");
    private final static QName _ComponentResult_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ComponentResult");
    private final static QName _ComponentSequenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ComponentSequenceNumber");
    private final static QName _ComponentType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ComponentType");
    private final static QName _ComponentEditAction_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ComponentEditAction");
    private final static QName _CompensationRule_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompensationRule");
    private final static QName _ConditionalPassengerCategory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ConditionalPassengerCategory");
    private final static QName _ContractCategory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractCategory");
    private final static QName _ContractNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractNumber");
    private final static QName _ContractPeriod_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractPeriod");
    private final static QName _ContractPeriodText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractPeriodText");
    private final static QName _ContractualCarrierCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractualCarrierCode");
    private final static QName _ContractualCarrierCodes_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractualCarrierCodes");
    private final static QName _ContractType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractType");
    private final static QName _ContractVersion_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractVersion");
    private final static QName _ContractVersionText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ContractVersionText");
    private final static QName _CookieId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CookieId");
    private final static QName _CostCenter_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CostCenter");
    private final static QName _CountedFare_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CountedFare");
    private final static QName _CountryCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CountryCode");
    private final static QName _CountryName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CountryName");
    private final static QName _CountryOfOrigin_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CountryOfOrigin");
    private final static QName _CountryOfOriginMandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CountryOfOriginMandatory");
    private final static QName _CreditAmount_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditAmount");
    private final static QName _ExtraInfo_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExtraInfo");
    private final static QName _ExtendedInfo_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExtendedInfo");
    private final static QName _CreditCashJournalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditCashJournalId");
    private final static QName _CreditCashierNoteNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditCashierNoteNumber");
    private final static QName _CardData_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardData");
    private final static QName _CreditCardData_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditCardData");
    private final static QName _CreditCardNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditCardNumber");
    private final static QName _CreditCardReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditCardReference");
    private final static QName _CreditDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditDate");
    private final static QName _CreditDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditDateTime");
    private final static QName _CreditingCreditCardSystem_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditingCreditCardSystem");
    private final static QName _CreditingPaymentCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditingPaymentCode");
    private final static QName _CreditingPaymentModelCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditingPaymentModelCode");
    private final static QName _CreditingCreditCardReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditingCreditCardReference");
    private final static QName _CreditPoints_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditPoints");
    private final static QName _CreditProducerCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditProducerCode");
    private final static QName _CreditReason_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditReason");
    private final static QName _CreditRuleCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditRuleCode");
    private final static QName _CreditTypeCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditTypeCode");
    private final static QName _CreditTerminalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditTerminalId");
    private final static QName _CreditUserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditUserId");
    private final static QName _CustomerAuthenticationLevel_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerAuthenticationLevel");
    private final static QName _CustomerCity_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerCity");
    private final static QName _CustomerCityName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerCityName");
    private final static QName _CustomerDiscountCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerDiscountCode");
    private final static QName _CustomerId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerId");
    private final static QName _CustomerName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerName");
    private final static QName _CustomerNote_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerNote");
    private final static QName _CustomerOrganisationNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerOrganisationNumber");
    private final static QName _CustomerPin_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerPin");
    private final static QName _CustomerPriority_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerPriority");
    private final static QName _CustomerRoleCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerRoleCode");
    private final static QName _CustomerStreet_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerStreet");
    private final static QName _CustomerStreetName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerStreetName");
    private final static QName _CustomerStreetNameExtra_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerStreetNameExtra");
    private final static QName _CustomerZip_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerZip");
    private final static QName _CustomerZipCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerZipCode");
    private final static QName _DateOfPrinting_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DateOfPrinting");
    private final static QName _DelayCompensationCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DelayCompensationCode");
    private final static QName _DepartureDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DepartureDate");
    private final static QName _DepartureDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DepartureDateTime");
    private final static QName _DepartureTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DepartureTime");
    private final static QName _Description_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Description");
    private final static QName _VariantDescription_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "VariantDescription");
    private final static QName _DialogNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DialogNumber");
    private final static QName _DialogText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DialogText");
    private final static QName _DiscountCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DiscountCode");
    private final static QName _DiscountType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DiscountType");
    private final static QName _TravelAgencyCustomerId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravelAgencyCustomerId");
    private final static QName _DistanceDiscountCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DistanceDiscountCode");
    private final static QName _DistributionAddressSequenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DistributionAddressSequenceNumber");
    private final static QName _DBDocCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DBDocCode");
    private final static QName _DBRestrictionCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DBRestrictionCode");
    private final static QName _DistributionCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DistributionCode");
    private final static QName _DistributionType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DistributionType");
    private final static QName _DistributionUserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DistributionUserId");
    private final static QName _DocumentName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DocumentName");
    private final static QName _DocumentPrintOutCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "DocumentPrintOutCode");
    private final static QName _EconomyTransactionSystem_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EconomyTransactionSystem");
    private final static QName _EditActionStatusCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EditActionStatusCode");
    private final static QName _EditCode1_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EditCode1");
    private final static QName _EditCode2_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EditCode2");
    private final static QName _EditedCustomerName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EditedCustomerName");
    private final static QName _ElectronicDistributionDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ElectronicDistributionDateTime");
    private final static QName _ElectronicDistributionTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ElectronicDistributionTime");
    private final static QName _ElectronicPrintOutCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ElectronicPrintOutCode");
    private final static QName _EmailAddress_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EmailAddress");
    private final static QName _EncryptedCardNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EncryptedCardNumber");
    private final static QName _EncryptionKeyId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EncryptionKeyId");
    private final static QName _ErrorCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ErrorCode");
    private final static QName _ErrorText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ErrorText");
    private final static QName _Establishment_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Establishment");
    private final static QName _EventType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EventType");
    private final static QName _ExceptionSeverity_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExceptionSeverity");
    private final static QName _ExternalContractNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExternalContractNumber");
    private final static QName _ExternalCustomerReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExternalCustomerReference");
    private final static QName _ExternalOfferCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExternalOfferCode");
    private final static QName _ExternalTicketText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExternalTicketText");
    private final static QName _ExpirationDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExpirationDate");
    private final static QName _ExpireDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExpireDate");
    private final static QName _ExchangeableMixable_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ExchangeableMixable");
    private final static QName _FareAvailability_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FareAvailability");
    private final static QName _FareCategory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FareCategory");
    private final static QName _FareType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FareType");
    private final static QName _FirmName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FirmName");
    private final static QName _FirstName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FirstName");
    private final static QName _FreeText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FreeText");
    private final static QName _FreeTextRow_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FreeTextRow");
    private final static QName _FreeTextRowNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FreeTextRowNumber");
    private final static QName _FromDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FromDate");
    private final static QName _FromDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FromDateTime");
    private final static QName _FromFareZone_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FromFareZone");
    private final static QName _FromOrderItemId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FromOrderItemId");
    private final static QName _FromTicketStockNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "FromTicketStockNumber");
    private final static QName _GLAccount_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "GLAccount");
    private final static QName _GroupReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "GroupReference");
    private final static QName _GuaranteeCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "GuaranteeCode");
    private final static QName _HaveEXTRows_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HaveEXTRows");
    private final static QName _HaveNMNRows_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HaveNMNRows");
    private final static QName _HaveSKKRow_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HaveSKKRow");
    private final static QName _HelpText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HelpText");
    private final static QName _HelpTextLong_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HelpTextLong");
    private final static QName _HotelChain_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HotelChain");
    private final static QName _HotelId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HotelId");
    private final static QName _HotelCustomerId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "HotelCustomerId");
    private final static QName _IATACode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "IATACode");
    private final static QName _IdRequirement_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "IdRequirement");
    private final static QName _InOutIndicator_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "InOutIndicator");
    private final static QName _InternationalSupplementCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "InternationalSupplementCode");
    private final static QName _InvoiceReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "InvoiceReference");
    private final static QName _IsMixable_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "IsMixable");
    private final static QName _ItineraryReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ItineraryReference");
    private final static QName _JourneyConnectionReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "JourneyConnectionReference");
    private final static QName _KpsBurnCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "KpsBurnCode");
    private final static QName _LanguageCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LanguageCode");
    private final static QName _LastActivityDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LastActivityDate");
    private final static QName _LastName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LastName");
    private final static QName _LastRetrievalDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LastRetrievalDate");
    private final static QName _LatestCancellationDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LatestCancellationDateTime");
    private final static QName _LocationCategory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationCategory");
    private final static QName _LocationMapReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationMapReference");
    private final static QName _LocationProducerCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationProducerCode");
    private final static QName _Logotype_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Logotype");
    private final static QName _LocationId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationId");
    private final static QName _LocationCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationCode");
    private final static QName _LocationNameShort_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationNameShort");
    private final static QName _LocationName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationName");
    private final static QName _LocationLongName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "LocationLongName");
    private final static QName _Mandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Mandatory");
    private final static QName _MarketSegmentTypeCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MarketSegmentTypeCode");
    private final static QName _MaskedCreditCardNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MaskedCreditCardNumber");
    private final static QName _MaxPriceRecalculateFactor_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MaxPriceRecalculateFactor");
    private final static QName _MembershipCardNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MembershipCardNumber");
    private final static QName _CardMeasure_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CardMeasure");
    private final static QName _MinPriceRecalculateFactor_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MinPriceRecalculateFactor");
    private final static QName _MobilePhone_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MobilePhone");
    private final static QName _ModifiedDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ModifiedDate");
    private final static QName _ModifiedReason_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ModifiedReason");
    private final static QName _MovedFromDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MovedFromDateTime");
    private final static QName _MovedToDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MovedToDateTime");
    private final static QName _MultiRideTicketNumberMandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MultiRideTicketNumberMandatory");
    private final static QName _NoteDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NoteDateTime");
    private final static QName _NoteRowNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NoteRowNumber");
    private final static QName _NoteRowText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NoteRowText");
    private final static QName _NotPrintable_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NotPrintable");
    private final static QName _NumberOf_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOf");
    private final static QName _NumberOfCountries_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfCountries");
    private final static QName _NumberOfStandardDiscounts_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfStandardDiscounts");
    private final static QName _NumberOfFailedLogins_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfFailedLogins");
    private final static QName _NumberOfLockedOrderItems_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfLockedOrderItems");
    private final static QName _NumberOfPassengersCategory1_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfPassengersCategory1");
    private final static QName _NumberOfPassengersCategory2_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfPassengersCategory2");
    private final static QName _NumberOfPassengersCategory3_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfPassengersCategory3");
    private final static QName _NumberOfPassengersCategory4_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfPassengersCategory4");
    private final static QName _NumberOfSeats_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfSeats");
    private final static QName _NumberOfStandard2Discounts_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfStandard2Discounts");
    private final static QName _OptionCategory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OptionCategory");
    private final static QName _OrderCreatorCustomerId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderCreatorCustomerId");
    private final static QName _OrderCreationDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderCreationDate");
    private final static QName _OrderChainCreditingCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderChainCreditingCode");
    private final static QName _OrderDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderDate");
    private final static QName _OrderDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderDateTime");
    private final static QName _OrderId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderId");
    private final static QName _OrderEvent_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderEvent");
    private final static QName _OrderIdReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderIdReference");
    private final static QName _OrderItemId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderItemId");
    private final static QName _OrderItemIdReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderItemIdReference");
    private final static QName _OrderItemMultipleId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderItemMultipleId");
    private final static QName _OrderItemStatus_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderItemStatus");
    private final static QName _OrderLockTimeout_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderLockTimeout");
    private final static QName _OrderNoteType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderNoteType");
    private final static QName _OrderNotification_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderNotification");
    private final static QName _OrderStatus_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderStatus");
    private final static QName _OrderTerminalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderTerminalId");
    private final static QName _OrganisationNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrganisationNumber");
    private final static QName _Partner_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Partner");
    private final static QName _PassengerAge_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassengerAge");
    private final static QName _PassengerCategory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassengerCategory");
    private final static QName _PassengerCategory1_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassengerCategory1");
    private final static QName _PassengerCategory2_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassengerCategory2");
    private final static QName _PassengerCategory3_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassengerCategory3");
    private final static QName _PassengerCategory4_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassengerCategory4");
    private final static QName _PassportMandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassportMandatory");
    private final static QName _PassportNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PassportNumber");
    private final static QName _PayerCustomerId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PayerCustomerId");
    private final static QName _PaymentCardReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentCardReference");
    private final static QName _PaymentCardSystem_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentCardSystem");
    private final static QName _PaymentCashJournalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentCashJournalId");
    private final static QName _PaymentCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentCode");
    private final static QName _PaymentDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentDateTime");
    private final static QName _PaymentDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentDate");
    private final static QName _PaymentFreeText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentFreeText");
    private final static QName _PaymentStatus_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentStatus");
    private final static QName _PaymentTerminalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentTerminalId");
    private final static QName _PaymentUserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentUserId");
    private final static QName _PayerAccount_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PayerAccount");
    private final static QName _PayerAccountMandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PayerAccountMandatory");
    private final static QName _PaymentConditions_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentConditions");
    private final static QName _PaymentNetAmount_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentNetAmount");
    private final static QName _CustomerCountryNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerCountryNumber");
    private final static QName _CustomerAreaNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerAreaNumber");
    private final static QName _CustomerSubscriberNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CustomerSubscriberNumber");
    private final static QName _PaymentModel_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentModel");
    private final static QName _PaymentModelCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PaymentModelCode");
    private final static QName _PinCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PinCode");
    private final static QName _PlacementCharacteristics_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementCharacteristics");
    private final static QName _PlacementDeviation_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementDeviation");
    private final static QName _PlacementDirection_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementDirection");
    private final static QName _PlacementNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementNumber");
    private final static QName _PlacementNumberInterval_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementNumberInterval");
    private final static QName _PlacementNumberType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementNumberType");
    private final static QName _PlacementOrientation_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementOrientation");
    private final static QName _PlacementSequenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementSequenceNumber");
    private final static QName _PlacementType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PlacementType");
    private final static QName _PreliminaryPaymentCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PreliminaryPaymentCode");
    private final static QName _PrintOutCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PrintOutCode");
    private final static QName _Points_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Points");
    private final static QName _PriceGroupCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PriceGroupCode");
    private final static QName _PriceGroupStatusCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PriceGroupStatusCode");
    private final static QName _PriceLevelCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PriceLevelCode");
    private final static QName _PriceRecalculateFactor_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PriceRecalculateFactor");
    private final static QName _PriceRecalculateModel_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PriceRecalculateModel");
    private final static QName _PriorityOrder_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PriorityOrder");
    private final static QName _OrderProducerCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "OrderProducerCode");
    private final static QName _ProducerCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ProducerCode");
    private final static QName _ProductCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ProductCode");
    private final static QName _ProductionDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ProductionDate");
    private final static QName _PromotionCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "PromotionCode");
    private final static QName _ProposedRetrievalDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ProposedRetrievalDate");
    private final static QName _ReceiptNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ReceiptNumber");
    private final static QName _ReferenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ReferenceNumber");
    private final static QName _RegionName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RegionName");
    private final static QName _RegisterDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RegisterDate");
    private final static QName _RegistrationNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RegistrationNumber");
    private final static QName _ReprintDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ReprintDateTime");
    private final static QName _RequestId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RequestId");
    private final static QName _RequisitionId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RequisitionId");
    private final static QName _RequisitionRequirement_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RequisitionRequirement");
    private final static QName _RestrictionCodeCredit_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RestrictionCodeCredit");
    private final static QName _RestrictionCodeCreditDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RestrictionCodeCreditDate");
    private final static QName _RestrictionType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RestrictionType");
    private final static QName _RetrievalDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RetrievalDateTime");
    private final static QName _RetrievalDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RetrievalDate");
    private final static QName _RoomTypeDescription_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RoomTypeDescription");
    private final static QName _RowMovedFromOrderId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RowMovedFromOrderId");
    private final static QName _RowMovedToOrderId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "RowMovedToOrderId");
    private final static QName _SalesOrderSequenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesOrderSequenceNumber");
    private final static QName _SeatAvailability_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailability");
    private final static QName _SeatAvailability1_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailability1");
    private final static QName _SeatAvailability2_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailability2");
    private final static QName _SeatAvailability3_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailability3");
    private final static QName _SeatAvailability4_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailability4");
    private final static QName _SeatAvailability5_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailability5");
    private final static QName _SeatAvailability6_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailability6");
    private final static QName _SeatAvailabilityGroupDetail_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailabilityGroupDetail");
    private final static QName _SeatAvailabilityGroupSummary_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SeatAvailabilityGroupSummary");
    private final static QName _SalesCategoryBookingClassCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesCategoryBookingClassCode");
    private final static QName _SalesCategoryFlexibilityCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesCategoryFlexibilityCode");
    private final static QName _SalesProducer_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesProducer");
    private final static QName _SaleStatus_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SaleStatus");
    private final static QName _SalesUnitOwner_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitOwner");
    private final static QName _SalesUnitOwnerNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitOwnerNumber");
    private final static QName _SalesUnitCategory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitCategory");
    private final static QName _SalesUnitId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitId");
    private final static QName _SalesUnitName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitName");
    private final static QName _SalesUnitSectionId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitSectionId");
    private final static QName _SalesUnitSectionName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitSectionName");
    private final static QName _Salutation_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Salutation");
    private final static QName _SatCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SatCode");
    private final static QName _SecrecyExist_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SecrecyExist");
    private final static QName _SegmentProducerCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SegmentProducerCode");
    private final static QName _SegmentReference_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SegmentReference");
    private final static QName _SubsegmentSequenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SubsegmentSequenceNumber");
    private final static QName _SellerName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SellerName");
    private final static QName _SenderAddress_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SenderAddress");
    private final static QName _SerialNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SerialNumber");
    private final static QName _Service_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Service");
    private final static QName _ServiceBrandAbbreviation_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceBrandAbbreviation");
    private final static QName _ServiceBrandCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceBrandCode");
    private final static QName _ServiceBrandName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceBrandName");
    private final static QName _ServiceId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceId");
    private final static QName _ServiceName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceName");
    private final static QName _ServiceLongName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceLongName");
    private final static QName _ServiceShortName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceShortName");
    private final static QName _ServiceNationality_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceNationality");
    private final static QName _ServiceSpecification_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceSpecification");
    private final static QName _ServiceVersion_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceVersion");
    private final static QName _ServicePresaleMax_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServicePresaleMax");
    private final static QName _ServicePresaleMin_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServicePresaleMin");
    private final static QName _ServiceProducerCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ServiceProducerCode");
    private final static QName _Sex_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Sex");
    private final static QName _Destination_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Destination");
    private final static QName _ShortCardName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ShortCardName");
    private final static QName _Signature_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Signature");
    private final static QName _SmokingDepartment_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SmokingDepartment");
    private final static QName _SocialSecurityNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SocialSecurityNumber");
    private final static QName _SpaceProperty_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SpaceProperty");
    private final static QName _SpacePropertyCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SpacePropertyCode");
    private final static QName _StandardDiscountCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "StandardDiscountCode");
    private final static QName _Standard2DiscountCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Standard2DiscountCode");
    private final static QName _StartDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "StartDate");
    private final static QName _StatisticalKilometer_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "StatisticalKilometer");
    private final static QName _SaleStatusInfo_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SaleStatusInfo");
    private final static QName _StreetLongName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "StreetLongName");
    private final static QName _StreetName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "StreetName");
    private final static QName _StreetNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "StreetNumber");
    private final static QName _Stylesheet_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Stylesheet");
    private final static QName _SubClassId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SubClassId");
    private final static QName _SuborderDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SuborderDate");
    private final static QName _SuborderOrderId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SuborderOrderId");
    private final static QName _SuborderOrderItemId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SuborderOrderItemId");
    private final static QName _Telephone_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Telephone");
    private final static QName _TemplateType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TemplateType");
    private final static QName _TariffUnit_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TariffUnit");
    private final static QName _SalesUnitKey_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "SalesUnitKey");
    private final static QName _TerminalId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TerminalId");
    private final static QName _TicketBarCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketBarCode");
    private final static QName _TicketCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketCode");
    private final static QName _TicketNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketNumber");
    private final static QName _TicketTeared_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketTeared");
    private final static QName _TicketTearedDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketTearedDateTime");
    private final static QName _TicketTearedUserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketTearedUserId");
    private final static QName _TicketTearedLocationId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketTearedLocationId");
    private final static QName _TicketType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketType");
    private final static QName _TicketUntearedDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketUntearedDateTime");
    private final static QName _TicketUntearedUserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketUntearedUserId");
    private final static QName _TimeUnit_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TimeUnit");
    private final static QName _TicketUntearedLocationId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TicketUntearedLocationId");
    private final static QName _Title_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Title");
    private final static QName _TotalNumberOfTickets_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TotalNumberOfTickets");
    private final static QName _ToDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ToDate");
    private final static QName _ToDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ToDateTime");
    private final static QName _ToFareZone_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ToFareZone");
    private final static QName _ToTicketStockNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ToTicketStockNumber");
    private final static QName _TransportId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TransportId");
    private final static QName _TransportInformation_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TransportInformation");
    private final static QName _TransportName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TransportName");
    private final static QName _TransportSegmentsOrigin_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TransportSegmentsOrigin");
    private final static QName _TravelDocumentCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravelDocumentCode");
    private final static QName _TravelLinkOrder_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravelLinkOrder");
    private final static QName _TravellerCustomerId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravellerCustomerId");
    private final static QName _TravellerFreeText_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravellerFreeText");
    private final static QName _TravellerMandatory_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravellerMandatory");
    private final static QName _TravellerNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravellerNumber");
    private final static QName _TravellerRestrictionCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravellerRestrictionCode");
    private final static QName _CompanyRestrictionCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CompanyRestrictionCode");
    private final static QName _TravellerSequenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravellerSequenceNumber");
    private final static QName _TravelDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravelDate");
    private final static QName _TravelMethodCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravelMethodCode");
    private final static QName _TravelRoute_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravelRoute");
    private final static QName _TravelType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TravelType");
    private final static QName _TypeOfCommunication_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TypeOfCommunication");
    private final static QName _TypeOfSpecification_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "TypeOfSpecification");
    private final static QName _UnlockUserAccountPassword_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UnlockUserAccountPassword");
    private final static QName _UpdateUserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UpdateUserId");
    private final static QName _UsedForVoucherCreationDate_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UsedForVoucherCreationDate");
    private final static QName _UsedNumberOfTickets_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UsedNumberOfTickets");
    private final static QName _UserAccountAlias_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UserAccountAlias");
    private final static QName _UserAccountId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UserAccountId");
    private final static QName _UserAccountPassword_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UserAccountPassword");
    private final static QName _UserId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UserId");
    private final static QName _UserName_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "UserName");
    private final static QName _ValidFrom_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ValidFrom");
    private final static QName _ValidTo_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ValidTo");
    private final static QName _ValidityCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ValidityCode");
    private final static QName _ValidityDescription_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ValidityDescription");
    private final static QName _ValidityTimeType_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ValidityTimeType");
    private final static QName _VariantNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "VariantNumber");
    private final static QName _VatMandatoryCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "VatMandatoryCode");
    private final static QName _ViaLocationSequenceNumber_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ViaLocationSequenceNumber");
    private final static QName _ZipCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "ZipCode");
    private final static QName _CurrencyCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CurrencyCode");
    private final static QName _MessageId_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "MessageId");
    private final static QName _CreditReasonCode_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "CreditReasonCode");
    private final static QName _EventDateTime_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "EventDateTime");
    private final static QName _NumberOfDiscounts_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "NumberOfDiscounts");
    private final static QName _Version_QNAME = new QName("http://petra.linkon.se/commonelements/data/v4_6", "Version");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.linkon.petra.commonelements.data.v4_6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmptyType }
     * 
     */
    public EmptyType createEmptyType() {
        return new EmptyType();
    }

    /**
     * Create an instance of {@link AdditionalPaymentCode2Type }
     * 
     */
    public AdditionalPaymentCode2Type createAdditionalPaymentCode2Type() {
        return new AdditionalPaymentCode2Type();
    }

    /**
     * Create an instance of {@link AddressTypeCodeType }
     * 
     */
    public AddressTypeCodeType createAddressTypeCodeType() {
        return new AddressTypeCodeType();
    }

    /**
     * Create an instance of {@link AlternativeCreditCodeType }
     * 
     */
    public AlternativeCreditCodeType createAlternativeCreditCodeType() {
        return new AlternativeCreditCodeType();
    }

    /**
     * Create an instance of {@link BookingClassType }
     * 
     */
    public BookingClassType createBookingClassType() {
        return new BookingClassType();
    }

    /**
     * Create an instance of {@link CardSystemType }
     * 
     */
    public CardSystemType createCardSystemType() {
        return new CardSystemType();
    }

    /**
     * Create an instance of {@link CardTypeType }
     * 
     */
    public CardTypeType createCardTypeType() {
        return new CardTypeType();
    }

    /**
     * Create an instance of {@link CompartmentCodeType }
     * 
     */
    public CompartmentCodeType createCompartmentCodeType() {
        return new CompartmentCodeType();
    }

    /**
     * Create an instance of {@link CompartmentSizeType }
     * 
     */
    public CompartmentSizeType createCompartmentSizeType() {
        return new CompartmentSizeType();
    }

    /**
     * Create an instance of {@link ComponentEditActionCodeType }
     * 
     */
    public ComponentEditActionCodeType createComponentEditActionCodeType() {
        return new ComponentEditActionCodeType();
    }

    /**
     * Create an instance of {@link PassengerCategoryType }
     * 
     */
    public PassengerCategoryType createPassengerCategoryType() {
        return new PassengerCategoryType();
    }

    /**
     * Create an instance of {@link CountryCodeType }
     * 
     */
    public CountryCodeType createCountryCodeType() {
        return new CountryCodeType();
    }

    /**
     * Create an instance of {@link CreditReasonType }
     * 
     */
    public CreditReasonType createCreditReasonType() {
        return new CreditReasonType();
    }

    /**
     * Create an instance of {@link CreditRuleCodeType }
     * 
     */
    public CreditRuleCodeType createCreditRuleCodeType() {
        return new CreditRuleCodeType();
    }

    /**
     * Create an instance of {@link DelayCompensationCodeType }
     * 
     */
    public DelayCompensationCodeType createDelayCompensationCodeType() {
        return new DelayCompensationCodeType();
    }

    /**
     * Create an instance of {@link DiscountCodeType }
     * 
     */
    public DiscountCodeType createDiscountCodeType() {
        return new DiscountCodeType();
    }

    /**
     * Create an instance of {@link DistributionCodeType }
     * 
     */
    public DistributionCodeType createDistributionCodeType() {
        return new DistributionCodeType();
    }

    /**
     * Create an instance of {@link FareTypeType }
     * 
     */
    public FareTypeType createFareTypeType() {
        return new FareTypeType();
    }

    /**
     * Create an instance of {@link CardMeasureType }
     * 
     */
    public CardMeasureType createCardMeasureType() {
        return new CardMeasureType();
    }

    /**
     * Create an instance of {@link OrderItemStatusCodeType }
     * 
     */
    public OrderItemStatusCodeType createOrderItemStatusCodeType() {
        return new OrderItemStatusCodeType();
    }

    /**
     * Create an instance of {@link OrderStatusCodeType }
     * 
     */
    public OrderStatusCodeType createOrderStatusCodeType() {
        return new OrderStatusCodeType();
    }

    /**
     * Create an instance of {@link PaymentCodeType }
     * 
     */
    public PaymentCodeType createPaymentCodeType() {
        return new PaymentCodeType();
    }

    /**
     * Create an instance of {@link PaymentStatusCodeType }
     * 
     */
    public PaymentStatusCodeType createPaymentStatusCodeType() {
        return new PaymentStatusCodeType();
    }

    /**
     * Create an instance of {@link PlacementCharacteristicsType }
     * 
     */
    public PlacementCharacteristicsType createPlacementCharacteristicsType() {
        return new PlacementCharacteristicsType();
    }

    /**
     * Create an instance of {@link PlacementDirectionCodeType }
     * 
     */
    public PlacementDirectionCodeType createPlacementDirectionCodeType() {
        return new PlacementDirectionCodeType();
    }

    /**
     * Create an instance of {@link PlacementOrientationType }
     * 
     */
    public PlacementOrientationType createPlacementOrientationType() {
        return new PlacementOrientationType();
    }

    /**
     * Create an instance of {@link PriceGroupCodeType }
     * 
     */
    public PriceGroupCodeType createPriceGroupCodeType() {
        return new PriceGroupCodeType();
    }

    /**
     * Create an instance of {@link PriceLevelCodeType }
     * 
     */
    public PriceLevelCodeType createPriceLevelCodeType() {
        return new PriceLevelCodeType();
    }

    /**
     * Create an instance of {@link ProductCodeType }
     * 
     */
    public ProductCodeType createProductCodeType() {
        return new ProductCodeType();
    }

    /**
     * Create an instance of {@link SeatAvailabilityGroupDetailType }
     * 
     */
    public SeatAvailabilityGroupDetailType createSeatAvailabilityGroupDetailType() {
        return new SeatAvailabilityGroupDetailType();
    }

    /**
     * Create an instance of {@link SeatAvailabilityGroupSummaryType }
     * 
     */
    public SeatAvailabilityGroupSummaryType createSeatAvailabilityGroupSummaryType() {
        return new SeatAvailabilityGroupSummaryType();
    }

    /**
     * Create an instance of {@link SalesCategoryBookingClassCodeType }
     * 
     */
    public SalesCategoryBookingClassCodeType createSalesCategoryBookingClassCodeType() {
        return new SalesCategoryBookingClassCodeType();
    }

    /**
     * Create an instance of {@link SalesCategoryFlexibilityCodeType }
     * 
     */
    public SalesCategoryFlexibilityCodeType createSalesCategoryFlexibilityCodeType() {
        return new SalesCategoryFlexibilityCodeType();
    }

    /**
     * Create an instance of {@link SalesStatusType }
     * 
     */
    public SalesStatusType createSalesStatusType() {
        return new SalesStatusType();
    }

    /**
     * Create an instance of {@link SegmentProducerCodeType }
     * 
     */
    public SegmentProducerCodeType createSegmentProducerCodeType() {
        return new SegmentProducerCodeType();
    }

    /**
     * Create an instance of {@link SmokingDepartmentCodeType }
     * 
     */
    public SmokingDepartmentCodeType createSmokingDepartmentCodeType() {
        return new SmokingDepartmentCodeType();
    }

    /**
     * Create an instance of {@link SpacePropertyCodeType }
     * 
     */
    public SpacePropertyCodeType createSpacePropertyCodeType() {
        return new SpacePropertyCodeType();
    }

    /**
     * Create an instance of {@link TicketTypeType }
     * 
     */
    public TicketTypeType createTicketTypeType() {
        return new TicketTypeType();
    }

    /**
     * Create an instance of {@link TransportInformationType }
     * 
     */
    public TransportInformationType createTransportInformationType() {
        return new TransportInformationType();
    }

    /**
     * Create an instance of {@link TravelMethodCodeType }
     * 
     */
    public TravelMethodCodeType createTravelMethodCodeType() {
        return new TravelMethodCodeType();
    }

    /**
     * Create an instance of {@link TravelTypeType }
     * 
     */
    public TravelTypeType createTravelTypeType() {
        return new TravelTypeType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link NonNegativeIntCodeType }
     * 
     */
    public NonNegativeIntCodeType createNonNegativeIntCodeType() {
        return new NonNegativeIntCodeType();
    }

    /**
     * Create an instance of {@link StringCodeType }
     * 
     */
    public StringCodeType createStringCodeType() {
        return new StringCodeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesOrderId")
    public JAXBElement<String> createSalesOrderId(String value) {
        return new JAXBElement<String>(_SalesOrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderLockId")
    public JAXBElement<String> createOrderLockId(String value) {
        return new JAXBElement<String>(_OrderLockId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AccessLevel")
    public JAXBElement<Integer> createAccessLevel(Integer value) {
        return new JAXBElement<Integer>(_AccessLevel_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AccountProducer")
    public JAXBElement<Integer> createAccountProducer(Integer value) {
        return new JAXBElement<Integer>(_AccountProducer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AccountProducerName")
    public JAXBElement<String> createAccountProducerName(String value) {
        return new JAXBElement<String>(_AccountProducerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AccountStatus")
    public JAXBElement<AccountStatusType> createAccountStatus(AccountStatusType value) {
        return new JAXBElement<AccountStatusType>(_AccountStatus_QNAME, AccountStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AdditionalEquipment")
    public JAXBElement<String> createAdditionalEquipment(String value) {
        return new JAXBElement<String>(_AdditionalEquipment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalPaymentCode2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AdditionalPaymentCode")
    public JAXBElement<AdditionalPaymentCode2Type> createAdditionalPaymentCode(AdditionalPaymentCode2Type value) {
        return new JAXBElement<AdditionalPaymentCode2Type>(_AdditionalPaymentCode_QNAME, AdditionalPaymentCode2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressTypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AddressType")
    public JAXBElement<AddressTypeCodeType> createAddressType(AddressTypeCodeType value) {
        return new JAXBElement<AddressTypeCodeType>(_AddressType_QNAME, AddressTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AllowedCredit")
    public JAXBElement<String> createAllowedCredit(String value) {
        return new JAXBElement<String>(_AllowedCredit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternativeCreditCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "AlternativeCreditCode")
    public JAXBElement<AlternativeCreditCodeType> createAlternativeCreditCode(AlternativeCreditCodeType value) {
        return new JAXBElement<AlternativeCreditCodeType>(_AlternativeCreditCode_QNAME, AlternativeCreditCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ArrivalDate")
    public JAXBElement<XMLGregorianCalendar> createArrivalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ArrivalDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ArrivalDateTime")
    public JAXBElement<XMLGregorianCalendar> createArrivalDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ArrivalDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ArrivalTime")
    public JAXBElement<XMLGregorianCalendar> createArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ArrivalTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BatchId")
    public JAXBElement<Integer> createBatchId(Integer value) {
        return new JAXBElement<Integer>(_BatchId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BirthDate")
    public JAXBElement<XMLGregorianCalendar> createBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BirthDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BirthDateMandatory")
    public JAXBElement<String> createBirthDateMandatory(String value) {
        return new JAXBElement<String>(_BirthDateMandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BookingClass")
    public JAXBElement<BookingClassType> createBookingClass(BookingClassType value) {
        return new JAXBElement<BookingClassType>(_BookingClass_QNAME, BookingClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingDeviationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BookingDeviation")
    public JAXBElement<BookingDeviationType> createBookingDeviation(BookingDeviationType value) {
        return new JAXBElement<BookingDeviationType>(_BookingDeviation_QNAME, BookingDeviationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BookingDialogNumber")
    public JAXBElement<Integer> createBookingDialogNumber(Integer value) {
        return new JAXBElement<Integer>(_BookingDialogNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BookingRule")
    public JAXBElement<BookingRuleType> createBookingRule(BookingRuleType value) {
        return new JAXBElement<BookingRuleType>(_BookingRule_QNAME, BookingRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BookingService")
    public JAXBElement<String> createBookingService(String value) {
        return new JAXBElement<String>(_BookingService_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "BusinessArea")
    public JAXBElement<String> createBusinessArea(String value) {
        return new JAXBElement<String>(_BusinessArea_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Buyer")
    public JAXBElement<String> createBuyer(String value) {
        return new JAXBElement<String>(_Buyer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CancelDialogNumber")
    public JAXBElement<Integer> createCancelDialogNumber(Integer value) {
        return new JAXBElement<Integer>(_CancelDialogNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CancellationDate")
    public JAXBElement<XMLGregorianCalendar> createCancellationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CancellationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CancellationDateTime")
    public JAXBElement<XMLGregorianCalendar> createCancellationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CancellationDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CancellationProducerCode")
    public JAXBElement<Integer> createCancellationProducerCode(Integer value) {
        return new JAXBElement<Integer>(_CancellationProducerCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CancellationTerminalId")
    public JAXBElement<String> createCancellationTerminalId(String value) {
        return new JAXBElement<String>(_CancellationTerminalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CancellationUserId")
    public JAXBElement<String> createCancellationUserId(String value) {
        return new JAXBElement<String>(_CancellationUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CancelReasonCode")
    public JAXBElement<String> createCancelReasonCode(String value) {
        return new JAXBElement<String>(_CancelReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardDataTransferenceDate")
    public JAXBElement<XMLGregorianCalendar> createCardDataTransferenceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CardDataTransferenceDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardMandatory")
    public JAXBElement<String> createCardMandatory(String value) {
        return new JAXBElement<String>(_CardMandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardNumber")
    public JAXBElement<String> createCardNumber(String value) {
        return new JAXBElement<String>(_CardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardPin")
    public JAXBElement<String> createCardPin(String value) {
        return new JAXBElement<String>(_CardPin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardSystem")
    public JAXBElement<CardSystemType> createCardSystem(CardSystemType value) {
        return new JAXBElement<CardSystemType>(_CardSystem_QNAME, CardSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardType")
    public JAXBElement<CardTypeType> createCardType(CardTypeType value) {
        return new JAXBElement<CardTypeType>(_CardType_QNAME, CardTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CareOf")
    public JAXBElement<String> createCareOf(String value) {
        return new JAXBElement<String>(_CareOf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CarriageGroup")
    public JAXBElement<Integer> createCarriageGroup(Integer value) {
        return new JAXBElement<Integer>(_CarriageGroup_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CarriageGroupStartDate")
    public JAXBElement<XMLGregorianCalendar> createCarriageGroupStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CarriageGroupStartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CarriageId")
    public JAXBElement<String> createCarriageId(String value) {
        return new JAXBElement<String>(_CarriageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CarriageType")
    public JAXBElement<String> createCarriageType(String value) {
        return new JAXBElement<String>(_CarriageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CarriageTypeNumber")
    public JAXBElement<Integer> createCarriageTypeNumber(Integer value) {
        return new JAXBElement<Integer>(_CarriageTypeNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CashDiscountCode")
    public JAXBElement<String> createCashDiscountCode(String value) {
        return new JAXBElement<String>(_CashDiscountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CashJournalId")
    public JAXBElement<Integer> createCashJournalId(Integer value) {
        return new JAXBElement<Integer>(_CashJournalId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CatalogueListId")
    public JAXBElement<String> createCatalogueListId(String value) {
        return new JAXBElement<String>(_CatalogueListId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CatalogueListName")
    public JAXBElement<String> createCatalogueListName(String value) {
        return new JAXBElement<String>(_CatalogueListName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CheckInStartTime")
    public JAXBElement<XMLGregorianCalendar> createCheckInStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CheckInStartTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ChildrenAges")
    public JAXBElement<String> createChildrenAges(String value) {
        return new JAXBElement<String>(_ChildrenAges_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CityLongName")
    public JAXBElement<String> createCityLongName(String value) {
        return new JAXBElement<String>(_CityLongName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CityName")
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ClassId")
    public JAXBElement<String> createClassId(String value) {
        return new JAXBElement<String>(_ClassId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearCustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ClearCustomer")
    public JAXBElement<ClearCustomerType> createClearCustomer(ClearCustomerType value) {
        return new JAXBElement<ClearCustomerType>(_ClearCustomer_QNAME, ClearCustomerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CombinationDiscountNumber")
    public JAXBElement<Integer> createCombinationDiscountNumber(Integer value) {
        return new JAXBElement<Integer>(_CombinationDiscountNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Comments")
    public JAXBElement<String> createComments(String value) {
        return new JAXBElement<String>(_Comments_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Commission")
    public JAXBElement<String> createCommission(String value) {
        return new JAXBElement<String>(_Commission_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CommunicationCode")
    public JAXBElement<String> createCommunicationCode(String value) {
        return new JAXBElement<String>(_CommunicationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompanyCustomerId")
    public JAXBElement<String> createCompanyCustomerId(String value) {
        return new JAXBElement<String>(_CompanyCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompanyForm")
    public JAXBElement<String> createCompanyForm(String value) {
        return new JAXBElement<String>(_CompanyForm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompanyName")
    public JAXBElement<String> createCompanyName(String value) {
        return new JAXBElement<String>(_CompanyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompartmentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompartmentCode")
    public JAXBElement<CompartmentCodeType> createCompartmentCode(CompartmentCodeType value) {
        return new JAXBElement<CompartmentCodeType>(_CompartmentCode_QNAME, CompartmentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompartmentNumber")
    public JAXBElement<String> createCompartmentNumber(String value) {
        return new JAXBElement<String>(_CompartmentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompartmentSizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompartmentSize")
    public JAXBElement<CompartmentSizeType> createCompartmentSize(CompartmentSizeType value) {
        return new JAXBElement<CompartmentSizeType>(_CompartmentSize_QNAME, CompartmentSizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompleteTelephoneNumber")
    public JAXBElement<String> createCompleteTelephoneNumber(String value) {
        return new JAXBElement<String>(_CompleteTelephoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompletionStatus")
    public JAXBElement<String> createCompletionStatus(String value) {
        return new JAXBElement<String>(_CompletionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompletionSystem")
    public JAXBElement<String> createCompletionSystem(String value) {
        return new JAXBElement<String>(_CompletionSystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ComponentName")
    public JAXBElement<String> createComponentName(String value) {
        return new JAXBElement<String>(_ComponentName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ComponentNumber")
    public JAXBElement<Integer> createComponentNumber(Integer value) {
        return new JAXBElement<Integer>(_ComponentNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ComponentResult")
    public JAXBElement<Integer> createComponentResult(Integer value) {
        return new JAXBElement<Integer>(_ComponentResult_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ComponentSequenceNumber")
    public JAXBElement<Integer> createComponentSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_ComponentSequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ComponentType")
    public JAXBElement<String> createComponentType(String value) {
        return new JAXBElement<String>(_ComponentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentEditActionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ComponentEditAction")
    public JAXBElement<ComponentEditActionCodeType> createComponentEditAction(ComponentEditActionCodeType value) {
        return new JAXBElement<ComponentEditActionCodeType>(_ComponentEditAction_QNAME, ComponentEditActionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompensationRule")
    public JAXBElement<String> createCompensationRule(String value) {
        return new JAXBElement<String>(_CompensationRule_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ConditionalPassengerCategory")
    public JAXBElement<PassengerCategoryType> createConditionalPassengerCategory(PassengerCategoryType value) {
        return new JAXBElement<PassengerCategoryType>(_ConditionalPassengerCategory_QNAME, PassengerCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractCategory")
    public JAXBElement<ContractCategoryType> createContractCategory(ContractCategoryType value) {
        return new JAXBElement<ContractCategoryType>(_ContractCategory_QNAME, ContractCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractNumber")
    public JAXBElement<Integer> createContractNumber(Integer value) {
        return new JAXBElement<Integer>(_ContractNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractPeriod")
    public JAXBElement<Integer> createContractPeriod(Integer value) {
        return new JAXBElement<Integer>(_ContractPeriod_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractPeriodText")
    public JAXBElement<String> createContractPeriodText(String value) {
        return new JAXBElement<String>(_ContractPeriodText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractualCarrierCode")
    public JAXBElement<String> createContractualCarrierCode(String value) {
        return new JAXBElement<String>(_ContractualCarrierCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractualCarrierCodes")
    public JAXBElement<String> createContractualCarrierCodes(String value) {
        return new JAXBElement<String>(_ContractualCarrierCodes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractType")
    public JAXBElement<String> createContractType(String value) {
        return new JAXBElement<String>(_ContractType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractVersion")
    public JAXBElement<Integer> createContractVersion(Integer value) {
        return new JAXBElement<Integer>(_ContractVersion_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ContractVersionText")
    public JAXBElement<String> createContractVersionText(String value) {
        return new JAXBElement<String>(_ContractVersionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CookieId")
    public JAXBElement<String> createCookieId(String value) {
        return new JAXBElement<String>(_CookieId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CostCenter")
    public JAXBElement<String> createCostCenter(String value) {
        return new JAXBElement<String>(_CostCenter_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CountedFare")
    public JAXBElement<String> createCountedFare(String value) {
        return new JAXBElement<String>(_CountedFare_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CountryCode")
    public JAXBElement<CountryCodeType> createCountryCode(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_CountryCode_QNAME, CountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CountryName")
    public JAXBElement<String> createCountryName(String value) {
        return new JAXBElement<String>(_CountryName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CountryOfOrigin")
    public JAXBElement<String> createCountryOfOrigin(String value) {
        return new JAXBElement<String>(_CountryOfOrigin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CountryOfOriginMandatory")
    public JAXBElement<String> createCountryOfOriginMandatory(String value) {
        return new JAXBElement<String>(_CountryOfOriginMandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditAmount")
    public JAXBElement<Integer> createCreditAmount(Integer value) {
        return new JAXBElement<Integer>(_CreditAmount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExtraInfo")
    public JAXBElement<String> createExtraInfo(String value) {
        return new JAXBElement<String>(_ExtraInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExtendedInfo")
    public JAXBElement<String> createExtendedInfo(String value) {
        return new JAXBElement<String>(_ExtendedInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditCashJournalId")
    public JAXBElement<Integer> createCreditCashJournalId(Integer value) {
        return new JAXBElement<Integer>(_CreditCashJournalId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditCashierNoteNumber")
    public JAXBElement<Integer> createCreditCashierNoteNumber(Integer value) {
        return new JAXBElement<Integer>(_CreditCashierNoteNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardData")
    public JAXBElement<String> createCardData(String value) {
        return new JAXBElement<String>(_CardData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditCardData")
    public JAXBElement<String> createCreditCardData(String value) {
        return new JAXBElement<String>(_CreditCardData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditCardNumber")
    public JAXBElement<String> createCreditCardNumber(String value) {
        return new JAXBElement<String>(_CreditCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditCardReference")
    public JAXBElement<String> createCreditCardReference(String value) {
        return new JAXBElement<String>(_CreditCardReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditDate")
    public JAXBElement<XMLGregorianCalendar> createCreditDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditDateTime")
    public JAXBElement<XMLGregorianCalendar> createCreditDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditingCreditCardSystem")
    public JAXBElement<String> createCreditingCreditCardSystem(String value) {
        return new JAXBElement<String>(_CreditingCreditCardSystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditingPaymentCode")
    public JAXBElement<String> createCreditingPaymentCode(String value) {
        return new JAXBElement<String>(_CreditingPaymentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditingPaymentModelCode")
    public JAXBElement<String> createCreditingPaymentModelCode(String value) {
        return new JAXBElement<String>(_CreditingPaymentModelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditingCreditCardReference")
    public JAXBElement<String> createCreditingCreditCardReference(String value) {
        return new JAXBElement<String>(_CreditingCreditCardReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditPoints")
    public JAXBElement<Integer> createCreditPoints(Integer value) {
        return new JAXBElement<Integer>(_CreditPoints_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditProducerCode")
    public JAXBElement<Integer> createCreditProducerCode(Integer value) {
        return new JAXBElement<Integer>(_CreditProducerCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditReason")
    public JAXBElement<CreditReasonType> createCreditReason(CreditReasonType value) {
        return new JAXBElement<CreditReasonType>(_CreditReason_QNAME, CreditReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRuleCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditRuleCode")
    public JAXBElement<CreditRuleCodeType> createCreditRuleCode(CreditRuleCodeType value) {
        return new JAXBElement<CreditRuleCodeType>(_CreditRuleCode_QNAME, CreditRuleCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditTypeCode")
    public JAXBElement<String> createCreditTypeCode(String value) {
        return new JAXBElement<String>(_CreditTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditTerminalId")
    public JAXBElement<String> createCreditTerminalId(String value) {
        return new JAXBElement<String>(_CreditTerminalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditUserId")
    public JAXBElement<String> createCreditUserId(String value) {
        return new JAXBElement<String>(_CreditUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerAuthenticationLevel")
    public JAXBElement<String> createCustomerAuthenticationLevel(String value) {
        return new JAXBElement<String>(_CustomerAuthenticationLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerCity")
    public JAXBElement<String> createCustomerCity(String value) {
        return new JAXBElement<String>(_CustomerCity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerCityName")
    public JAXBElement<String> createCustomerCityName(String value) {
        return new JAXBElement<String>(_CustomerCityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerDiscountCode")
    public JAXBElement<String> createCustomerDiscountCode(String value) {
        return new JAXBElement<String>(_CustomerDiscountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerName")
    public JAXBElement<String> createCustomerName(String value) {
        return new JAXBElement<String>(_CustomerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerNote")
    public JAXBElement<String> createCustomerNote(String value) {
        return new JAXBElement<String>(_CustomerNote_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerOrganisationNumber")
    public JAXBElement<String> createCustomerOrganisationNumber(String value) {
        return new JAXBElement<String>(_CustomerOrganisationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerPin")
    public JAXBElement<String> createCustomerPin(String value) {
        return new JAXBElement<String>(_CustomerPin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerPriority")
    public JAXBElement<String> createCustomerPriority(String value) {
        return new JAXBElement<String>(_CustomerPriority_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerRoleCode")
    public JAXBElement<String> createCustomerRoleCode(String value) {
        return new JAXBElement<String>(_CustomerRoleCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerStreet")
    public JAXBElement<String> createCustomerStreet(String value) {
        return new JAXBElement<String>(_CustomerStreet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerStreetName")
    public JAXBElement<String> createCustomerStreetName(String value) {
        return new JAXBElement<String>(_CustomerStreetName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerStreetNameExtra")
    public JAXBElement<String> createCustomerStreetNameExtra(String value) {
        return new JAXBElement<String>(_CustomerStreetNameExtra_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerZip")
    public JAXBElement<String> createCustomerZip(String value) {
        return new JAXBElement<String>(_CustomerZip_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerZipCode")
    public JAXBElement<String> createCustomerZipCode(String value) {
        return new JAXBElement<String>(_CustomerZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DateOfPrinting")
    public JAXBElement<XMLGregorianCalendar> createDateOfPrinting(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateOfPrinting_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayCompensationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DelayCompensationCode")
    public JAXBElement<DelayCompensationCodeType> createDelayCompensationCode(DelayCompensationCodeType value) {
        return new JAXBElement<DelayCompensationCodeType>(_DelayCompensationCode_QNAME, DelayCompensationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DepartureDate")
    public JAXBElement<XMLGregorianCalendar> createDepartureDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DepartureDateTime")
    public JAXBElement<XMLGregorianCalendar> createDepartureDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DepartureTime")
    public JAXBElement<XMLGregorianCalendar> createDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "VariantDescription")
    public JAXBElement<String> createVariantDescription(String value) {
        return new JAXBElement<String>(_VariantDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DialogNumber")
    public JAXBElement<Integer> createDialogNumber(Integer value) {
        return new JAXBElement<Integer>(_DialogNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DialogText")
    public JAXBElement<String> createDialogText(String value) {
        return new JAXBElement<String>(_DialogText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DiscountCode")
    public JAXBElement<DiscountCodeType> createDiscountCode(DiscountCodeType value) {
        return new JAXBElement<DiscountCodeType>(_DiscountCode_QNAME, DiscountCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DiscountType")
    public JAXBElement<String> createDiscountType(String value) {
        return new JAXBElement<String>(_DiscountType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravelAgencyCustomerId")
    public JAXBElement<String> createTravelAgencyCustomerId(String value) {
        return new JAXBElement<String>(_TravelAgencyCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DistanceDiscountCode")
    public JAXBElement<String> createDistanceDiscountCode(String value) {
        return new JAXBElement<String>(_DistanceDiscountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DistributionAddressSequenceNumber")
    public JAXBElement<Integer> createDistributionAddressSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_DistributionAddressSequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DBDocCode")
    public JAXBElement<String> createDBDocCode(String value) {
        return new JAXBElement<String>(_DBDocCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DBRestrictionCode")
    public JAXBElement<String> createDBRestrictionCode(String value) {
        return new JAXBElement<String>(_DBRestrictionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DistributionCode")
    public JAXBElement<DistributionCodeType> createDistributionCode(DistributionCodeType value) {
        return new JAXBElement<DistributionCodeType>(_DistributionCode_QNAME, DistributionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DistributionType")
    public JAXBElement<String> createDistributionType(String value) {
        return new JAXBElement<String>(_DistributionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DistributionUserId")
    public JAXBElement<String> createDistributionUserId(String value) {
        return new JAXBElement<String>(_DistributionUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DocumentName")
    public JAXBElement<String> createDocumentName(String value) {
        return new JAXBElement<String>(_DocumentName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "DocumentPrintOutCode")
    public JAXBElement<String> createDocumentPrintOutCode(String value) {
        return new JAXBElement<String>(_DocumentPrintOutCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EconomyTransactionSystem")
    public JAXBElement<String> createEconomyTransactionSystem(String value) {
        return new JAXBElement<String>(_EconomyTransactionSystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditActionStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EditActionStatusCode")
    public JAXBElement<EditActionStatusCodeType> createEditActionStatusCode(EditActionStatusCodeType value) {
        return new JAXBElement<EditActionStatusCodeType>(_EditActionStatusCode_QNAME, EditActionStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EditCode1")
    public JAXBElement<String> createEditCode1(String value) {
        return new JAXBElement<String>(_EditCode1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EditCode2")
    public JAXBElement<String> createEditCode2(String value) {
        return new JAXBElement<String>(_EditCode2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EditedCustomerName")
    public JAXBElement<String> createEditedCustomerName(String value) {
        return new JAXBElement<String>(_EditedCustomerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ElectronicDistributionDateTime")
    public JAXBElement<XMLGregorianCalendar> createElectronicDistributionDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ElectronicDistributionDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ElectronicDistributionTime")
    public JAXBElement<XMLGregorianCalendar> createElectronicDistributionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ElectronicDistributionTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ElectronicPrintOutCode")
    public JAXBElement<String> createElectronicPrintOutCode(String value) {
        return new JAXBElement<String>(_ElectronicPrintOutCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EmailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EncryptedCardNumber")
    public JAXBElement<String> createEncryptedCardNumber(String value) {
        return new JAXBElement<String>(_EncryptedCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EncryptionKeyId")
    public JAXBElement<String> createEncryptionKeyId(String value) {
        return new JAXBElement<String>(_EncryptionKeyId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ErrorCode")
    public JAXBElement<Integer> createErrorCode(Integer value) {
        return new JAXBElement<Integer>(_ErrorCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ErrorText")
    public JAXBElement<String> createErrorText(String value) {
        return new JAXBElement<String>(_ErrorText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Establishment")
    public JAXBElement<String> createEstablishment(String value) {
        return new JAXBElement<String>(_Establishment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EventType")
    public JAXBElement<String> createEventType(String value) {
        return new JAXBElement<String>(_EventType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionSeverityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExceptionSeverity")
    public JAXBElement<ExceptionSeverityType> createExceptionSeverity(ExceptionSeverityType value) {
        return new JAXBElement<ExceptionSeverityType>(_ExceptionSeverity_QNAME, ExceptionSeverityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExternalContractNumber")
    public JAXBElement<String> createExternalContractNumber(String value) {
        return new JAXBElement<String>(_ExternalContractNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExternalCustomerReference")
    public JAXBElement<String> createExternalCustomerReference(String value) {
        return new JAXBElement<String>(_ExternalCustomerReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExternalOfferCode")
    public JAXBElement<String> createExternalOfferCode(String value) {
        return new JAXBElement<String>(_ExternalOfferCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExternalTicketText")
    public JAXBElement<String> createExternalTicketText(String value) {
        return new JAXBElement<String>(_ExternalTicketText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExpirationDate")
    public JAXBElement<XMLGregorianCalendar> createExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExpirationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExpireDate")
    public JAXBElement<String> createExpireDate(String value) {
        return new JAXBElement<String>(_ExpireDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ExchangeableMixable")
    public JAXBElement<String> createExchangeableMixable(String value) {
        return new JAXBElement<String>(_ExchangeableMixable_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FareAvailability")
    public JAXBElement<Integer> createFareAvailability(Integer value) {
        return new JAXBElement<Integer>(_FareAvailability_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FareCategory")
    public JAXBElement<String> createFareCategory(String value) {
        return new JAXBElement<String>(_FareCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FareType")
    public JAXBElement<FareTypeType> createFareType(FareTypeType value) {
        return new JAXBElement<FareTypeType>(_FareType_QNAME, FareTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FirmName")
    public JAXBElement<String> createFirmName(String value) {
        return new JAXBElement<String>(_FirmName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FreeText")
    public JAXBElement<String> createFreeText(String value) {
        return new JAXBElement<String>(_FreeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FreeTextRow")
    public JAXBElement<String> createFreeTextRow(String value) {
        return new JAXBElement<String>(_FreeTextRow_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FreeTextRowNumber")
    public JAXBElement<Integer> createFreeTextRowNumber(Integer value) {
        return new JAXBElement<Integer>(_FreeTextRowNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FromDate")
    public JAXBElement<XMLGregorianCalendar> createFromDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FromDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FromDateTime")
    public JAXBElement<XMLGregorianCalendar> createFromDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FromDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FromFareZone")
    public JAXBElement<Integer> createFromFareZone(Integer value) {
        return new JAXBElement<Integer>(_FromFareZone_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FromOrderItemId")
    public JAXBElement<Integer> createFromOrderItemId(Integer value) {
        return new JAXBElement<Integer>(_FromOrderItemId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "FromTicketStockNumber")
    public JAXBElement<Integer> createFromTicketStockNumber(Integer value) {
        return new JAXBElement<Integer>(_FromTicketStockNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "GLAccount")
    public JAXBElement<Integer> createGLAccount(Integer value) {
        return new JAXBElement<Integer>(_GLAccount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "GroupReference")
    public JAXBElement<String> createGroupReference(String value) {
        return new JAXBElement<String>(_GroupReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "GuaranteeCode")
    public JAXBElement<String> createGuaranteeCode(String value) {
        return new JAXBElement<String>(_GuaranteeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HaveEXTRows")
    public JAXBElement<String> createHaveEXTRows(String value) {
        return new JAXBElement<String>(_HaveEXTRows_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HaveNMNRowsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HaveNMNRows")
    public JAXBElement<HaveNMNRowsType> createHaveNMNRows(HaveNMNRowsType value) {
        return new JAXBElement<HaveNMNRowsType>(_HaveNMNRows_QNAME, HaveNMNRowsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HaveSKKRow")
    public JAXBElement<String> createHaveSKKRow(String value) {
        return new JAXBElement<String>(_HaveSKKRow_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HelpText")
    public JAXBElement<String> createHelpText(String value) {
        return new JAXBElement<String>(_HelpText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HelpTextLong")
    public JAXBElement<String> createHelpTextLong(String value) {
        return new JAXBElement<String>(_HelpTextLong_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HotelChain")
    public JAXBElement<String> createHotelChain(String value) {
        return new JAXBElement<String>(_HotelChain_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HotelId")
    public JAXBElement<String> createHotelId(String value) {
        return new JAXBElement<String>(_HotelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "HotelCustomerId")
    public JAXBElement<Integer> createHotelCustomerId(Integer value) {
        return new JAXBElement<Integer>(_HotelCustomerId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "IATACode")
    public JAXBElement<String> createIATACode(String value) {
        return new JAXBElement<String>(_IATACode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "IdRequirement")
    public JAXBElement<String> createIdRequirement(String value) {
        return new JAXBElement<String>(_IdRequirement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "InOutIndicator")
    public JAXBElement<String> createInOutIndicator(String value) {
        return new JAXBElement<String>(_InOutIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "InternationalSupplementCode")
    public JAXBElement<String> createInternationalSupplementCode(String value) {
        return new JAXBElement<String>(_InternationalSupplementCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "InvoiceReference")
    public JAXBElement<String> createInvoiceReference(String value) {
        return new JAXBElement<String>(_InvoiceReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "IsMixable")
    public JAXBElement<String> createIsMixable(String value) {
        return new JAXBElement<String>(_IsMixable_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ItineraryReference")
    public JAXBElement<Integer> createItineraryReference(Integer value) {
        return new JAXBElement<Integer>(_ItineraryReference_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "JourneyConnectionReference")
    public JAXBElement<Integer> createJourneyConnectionReference(Integer value) {
        return new JAXBElement<Integer>(_JourneyConnectionReference_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "KpsBurnCode")
    public JAXBElement<String> createKpsBurnCode(String value) {
        return new JAXBElement<String>(_KpsBurnCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LanguageCode")
    public JAXBElement<LanguageCodeType> createLanguageCode(LanguageCodeType value) {
        return new JAXBElement<LanguageCodeType>(_LanguageCode_QNAME, LanguageCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LastActivityDate")
    public JAXBElement<XMLGregorianCalendar> createLastActivityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastActivityDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LastRetrievalDate")
    public JAXBElement<XMLGregorianCalendar> createLastRetrievalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastRetrievalDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LatestCancellationDateTime")
    public JAXBElement<XMLGregorianCalendar> createLatestCancellationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LatestCancellationDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationCategory")
    public JAXBElement<String> createLocationCategory(String value) {
        return new JAXBElement<String>(_LocationCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationMapReference")
    public JAXBElement<String> createLocationMapReference(String value) {
        return new JAXBElement<String>(_LocationMapReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationProducerCode")
    public JAXBElement<Integer> createLocationProducerCode(Integer value) {
        return new JAXBElement<Integer>(_LocationProducerCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Logotype")
    public JAXBElement<String> createLogotype(String value) {
        return new JAXBElement<String>(_Logotype_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationId")
    public JAXBElement<Integer> createLocationId(Integer value) {
        return new JAXBElement<Integer>(_LocationId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationCode")
    public JAXBElement<String> createLocationCode(String value) {
        return new JAXBElement<String>(_LocationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationNameShort")
    public JAXBElement<String> createLocationNameShort(String value) {
        return new JAXBElement<String>(_LocationNameShort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationName")
    public JAXBElement<String> createLocationName(String value) {
        return new JAXBElement<String>(_LocationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "LocationLongName")
    public JAXBElement<String> createLocationLongName(String value) {
        return new JAXBElement<String>(_LocationLongName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Mandatory")
    public JAXBElement<String> createMandatory(String value) {
        return new JAXBElement<String>(_Mandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MarketSegmentTypeCode")
    public JAXBElement<String> createMarketSegmentTypeCode(String value) {
        return new JAXBElement<String>(_MarketSegmentTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MaskedCreditCardNumber")
    public JAXBElement<String> createMaskedCreditCardNumber(String value) {
        return new JAXBElement<String>(_MaskedCreditCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MaxPriceRecalculateFactor")
    public JAXBElement<BigDecimal> createMaxPriceRecalculateFactor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MaxPriceRecalculateFactor_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MembershipCardNumber")
    public JAXBElement<String> createMembershipCardNumber(String value) {
        return new JAXBElement<String>(_MembershipCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CardMeasure")
    public JAXBElement<CardMeasureType> createCardMeasure(CardMeasureType value) {
        return new JAXBElement<CardMeasureType>(_CardMeasure_QNAME, CardMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MinPriceRecalculateFactor")
    public JAXBElement<BigDecimal> createMinPriceRecalculateFactor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MinPriceRecalculateFactor_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MobilePhone")
    public JAXBElement<String> createMobilePhone(String value) {
        return new JAXBElement<String>(_MobilePhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ModifiedDate")
    public JAXBElement<XMLGregorianCalendar> createModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ModifiedDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ModifiedReason")
    public JAXBElement<String> createModifiedReason(String value) {
        return new JAXBElement<String>(_ModifiedReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MovedFromDateTime")
    public JAXBElement<XMLGregorianCalendar> createMovedFromDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovedFromDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MovedToDateTime")
    public JAXBElement<XMLGregorianCalendar> createMovedToDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MovedToDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MultiRideTicketNumberMandatory")
    public JAXBElement<String> createMultiRideTicketNumberMandatory(String value) {
        return new JAXBElement<String>(_MultiRideTicketNumberMandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NoteDateTime")
    public JAXBElement<XMLGregorianCalendar> createNoteDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NoteDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NoteRowNumber")
    public JAXBElement<Integer> createNoteRowNumber(Integer value) {
        return new JAXBElement<Integer>(_NoteRowNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NoteRowText")
    public JAXBElement<String> createNoteRowText(String value) {
        return new JAXBElement<String>(_NoteRowText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NotPrintable")
    public JAXBElement<EmptyType> createNotPrintable(EmptyType value) {
        return new JAXBElement<EmptyType>(_NotPrintable_QNAME, EmptyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOf")
    public JAXBElement<Integer> createNumberOf(Integer value) {
        return new JAXBElement<Integer>(_NumberOf_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfCountries")
    public JAXBElement<Integer> createNumberOfCountries(Integer value) {
        return new JAXBElement<Integer>(_NumberOfCountries_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfStandardDiscounts")
    public JAXBElement<Integer> createNumberOfStandardDiscounts(Integer value) {
        return new JAXBElement<Integer>(_NumberOfStandardDiscounts_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfFailedLogins")
    public JAXBElement<Integer> createNumberOfFailedLogins(Integer value) {
        return new JAXBElement<Integer>(_NumberOfFailedLogins_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfLockedOrderItems")
    public JAXBElement<Integer> createNumberOfLockedOrderItems(Integer value) {
        return new JAXBElement<Integer>(_NumberOfLockedOrderItems_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfPassengersCategory1")
    public JAXBElement<Integer> createNumberOfPassengersCategory1(Integer value) {
        return new JAXBElement<Integer>(_NumberOfPassengersCategory1_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfPassengersCategory2")
    public JAXBElement<Integer> createNumberOfPassengersCategory2(Integer value) {
        return new JAXBElement<Integer>(_NumberOfPassengersCategory2_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfPassengersCategory3")
    public JAXBElement<Integer> createNumberOfPassengersCategory3(Integer value) {
        return new JAXBElement<Integer>(_NumberOfPassengersCategory3_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfPassengersCategory4")
    public JAXBElement<Integer> createNumberOfPassengersCategory4(Integer value) {
        return new JAXBElement<Integer>(_NumberOfPassengersCategory4_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfSeats")
    public JAXBElement<Integer> createNumberOfSeats(Integer value) {
        return new JAXBElement<Integer>(_NumberOfSeats_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfStandard2Discounts")
    public JAXBElement<Integer> createNumberOfStandard2Discounts(Integer value) {
        return new JAXBElement<Integer>(_NumberOfStandard2Discounts_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OptionCategory")
    public JAXBElement<String> createOptionCategory(String value) {
        return new JAXBElement<String>(_OptionCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderCreatorCustomerId")
    public JAXBElement<String> createOrderCreatorCustomerId(String value) {
        return new JAXBElement<String>(_OrderCreatorCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderCreationDate")
    public JAXBElement<XMLGregorianCalendar> createOrderCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderCreationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderChainCreditingCode")
    public JAXBElement<String> createOrderChainCreditingCode(String value) {
        return new JAXBElement<String>(_OrderChainCreditingCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderDate")
    public JAXBElement<XMLGregorianCalendar> createOrderDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderDateTime")
    public JAXBElement<XMLGregorianCalendar> createOrderDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderId")
    public JAXBElement<String> createOrderId(String value) {
        return new JAXBElement<String>(_OrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderEvent")
    public JAXBElement<String> createOrderEvent(String value) {
        return new JAXBElement<String>(_OrderEvent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderIdReference")
    public JAXBElement<String> createOrderIdReference(String value) {
        return new JAXBElement<String>(_OrderIdReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderItemId")
    public JAXBElement<Integer> createOrderItemId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderItemIdReference")
    public JAXBElement<Integer> createOrderItemIdReference(Integer value) {
        return new JAXBElement<Integer>(_OrderItemIdReference_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderItemMultipleId")
    public JAXBElement<Integer> createOrderItemMultipleId(Integer value) {
        return new JAXBElement<Integer>(_OrderItemMultipleId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderItemStatus")
    public JAXBElement<OrderItemStatusCodeType> createOrderItemStatus(OrderItemStatusCodeType value) {
        return new JAXBElement<OrderItemStatusCodeType>(_OrderItemStatus_QNAME, OrderItemStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderLockTimeout")
    public JAXBElement<XMLGregorianCalendar> createOrderLockTimeout(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderLockTimeout_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderNoteType")
    public JAXBElement<String> createOrderNoteType(String value) {
        return new JAXBElement<String>(_OrderNoteType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderNotification")
    public JAXBElement<String> createOrderNotification(String value) {
        return new JAXBElement<String>(_OrderNotification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderStatus")
    public JAXBElement<OrderStatusCodeType> createOrderStatus(OrderStatusCodeType value) {
        return new JAXBElement<OrderStatusCodeType>(_OrderStatus_QNAME, OrderStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderTerminalId")
    public JAXBElement<String> createOrderTerminalId(String value) {
        return new JAXBElement<String>(_OrderTerminalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrganisationNumber")
    public JAXBElement<String> createOrganisationNumber(String value) {
        return new JAXBElement<String>(_OrganisationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Partner")
    public JAXBElement<Integer> createPartner(Integer value) {
        return new JAXBElement<Integer>(_Partner_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassengerAge")
    public JAXBElement<Integer> createPassengerAge(Integer value) {
        return new JAXBElement<Integer>(_PassengerAge_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassengerCategory")
    public JAXBElement<PassengerCategoryType> createPassengerCategory(PassengerCategoryType value) {
        return new JAXBElement<PassengerCategoryType>(_PassengerCategory_QNAME, PassengerCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassengerCategory1")
    public JAXBElement<PassengerCategoryType> createPassengerCategory1(PassengerCategoryType value) {
        return new JAXBElement<PassengerCategoryType>(_PassengerCategory1_QNAME, PassengerCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassengerCategory2")
    public JAXBElement<PassengerCategoryType> createPassengerCategory2(PassengerCategoryType value) {
        return new JAXBElement<PassengerCategoryType>(_PassengerCategory2_QNAME, PassengerCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassengerCategory3")
    public JAXBElement<PassengerCategoryType> createPassengerCategory3(PassengerCategoryType value) {
        return new JAXBElement<PassengerCategoryType>(_PassengerCategory3_QNAME, PassengerCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassengerCategory4")
    public JAXBElement<PassengerCategoryType> createPassengerCategory4(PassengerCategoryType value) {
        return new JAXBElement<PassengerCategoryType>(_PassengerCategory4_QNAME, PassengerCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassportMandatory")
    public JAXBElement<String> createPassportMandatory(String value) {
        return new JAXBElement<String>(_PassportMandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PassportNumber")
    public JAXBElement<String> createPassportNumber(String value) {
        return new JAXBElement<String>(_PassportNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PayerCustomerId")
    public JAXBElement<String> createPayerCustomerId(String value) {
        return new JAXBElement<String>(_PayerCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentCardReference")
    public JAXBElement<String> createPaymentCardReference(String value) {
        return new JAXBElement<String>(_PaymentCardReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentCardSystem")
    public JAXBElement<String> createPaymentCardSystem(String value) {
        return new JAXBElement<String>(_PaymentCardSystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentCashJournalId")
    public JAXBElement<Integer> createPaymentCashJournalId(Integer value) {
        return new JAXBElement<Integer>(_PaymentCashJournalId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentCode")
    public JAXBElement<PaymentCodeType> createPaymentCode(PaymentCodeType value) {
        return new JAXBElement<PaymentCodeType>(_PaymentCode_QNAME, PaymentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentDateTime")
    public JAXBElement<XMLGregorianCalendar> createPaymentDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentDate")
    public JAXBElement<XMLGregorianCalendar> createPaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentFreeText")
    public JAXBElement<String> createPaymentFreeText(String value) {
        return new JAXBElement<String>(_PaymentFreeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentStatus")
    public JAXBElement<PaymentStatusCodeType> createPaymentStatus(PaymentStatusCodeType value) {
        return new JAXBElement<PaymentStatusCodeType>(_PaymentStatus_QNAME, PaymentStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentTerminalId")
    public JAXBElement<String> createPaymentTerminalId(String value) {
        return new JAXBElement<String>(_PaymentTerminalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentUserId")
    public JAXBElement<String> createPaymentUserId(String value) {
        return new JAXBElement<String>(_PaymentUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PayerAccount")
    public JAXBElement<String> createPayerAccount(String value) {
        return new JAXBElement<String>(_PayerAccount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PayerAccountMandatory")
    public JAXBElement<String> createPayerAccountMandatory(String value) {
        return new JAXBElement<String>(_PayerAccountMandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentConditions")
    public JAXBElement<String> createPaymentConditions(String value) {
        return new JAXBElement<String>(_PaymentConditions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentNetAmount")
    public JAXBElement<BigDecimal> createPaymentNetAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PaymentNetAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerCountryNumber")
    public JAXBElement<String> createCustomerCountryNumber(String value) {
        return new JAXBElement<String>(_CustomerCountryNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerAreaNumber")
    public JAXBElement<String> createCustomerAreaNumber(String value) {
        return new JAXBElement<String>(_CustomerAreaNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CustomerSubscriberNumber")
    public JAXBElement<String> createCustomerSubscriberNumber(String value) {
        return new JAXBElement<String>(_CustomerSubscriberNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentModel")
    public JAXBElement<String> createPaymentModel(String value) {
        return new JAXBElement<String>(_PaymentModel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PaymentModelCode")
    public JAXBElement<String> createPaymentModelCode(String value) {
        return new JAXBElement<String>(_PaymentModelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PinCode")
    public JAXBElement<String> createPinCode(String value) {
        return new JAXBElement<String>(_PinCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacementCharacteristicsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementCharacteristics")
    public JAXBElement<PlacementCharacteristicsType> createPlacementCharacteristics(PlacementCharacteristicsType value) {
        return new JAXBElement<PlacementCharacteristicsType>(_PlacementCharacteristics_QNAME, PlacementCharacteristicsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacementDeviationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementDeviation")
    public JAXBElement<PlacementDeviationType> createPlacementDeviation(PlacementDeviationType value) {
        return new JAXBElement<PlacementDeviationType>(_PlacementDeviation_QNAME, PlacementDeviationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacementDirectionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementDirection")
    public JAXBElement<PlacementDirectionCodeType> createPlacementDirection(PlacementDirectionCodeType value) {
        return new JAXBElement<PlacementDirectionCodeType>(_PlacementDirection_QNAME, PlacementDirectionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementNumber")
    public JAXBElement<String> createPlacementNumber(String value) {
        return new JAXBElement<String>(_PlacementNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementNumberInterval")
    public JAXBElement<String> createPlacementNumberInterval(String value) {
        return new JAXBElement<String>(_PlacementNumberInterval_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementNumberType")
    public JAXBElement<String> createPlacementNumberType(String value) {
        return new JAXBElement<String>(_PlacementNumberType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacementOrientationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementOrientation")
    public JAXBElement<PlacementOrientationType> createPlacementOrientation(PlacementOrientationType value) {
        return new JAXBElement<PlacementOrientationType>(_PlacementOrientation_QNAME, PlacementOrientationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementSequenceNumber")
    public JAXBElement<Integer> createPlacementSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_PlacementSequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PlacementType")
    public JAXBElement<String> createPlacementType(String value) {
        return new JAXBElement<String>(_PlacementType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PreliminaryPaymentCode")
    public JAXBElement<String> createPreliminaryPaymentCode(String value) {
        return new JAXBElement<String>(_PreliminaryPaymentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PrintOutCode")
    public JAXBElement<String> createPrintOutCode(String value) {
        return new JAXBElement<String>(_PrintOutCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Points")
    public JAXBElement<Integer> createPoints(Integer value) {
        return new JAXBElement<Integer>(_Points_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceGroupCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PriceGroupCode")
    public JAXBElement<PriceGroupCodeType> createPriceGroupCode(PriceGroupCodeType value) {
        return new JAXBElement<PriceGroupCodeType>(_PriceGroupCode_QNAME, PriceGroupCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceGroupStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PriceGroupStatusCode")
    public JAXBElement<PriceGroupStatusCodeType> createPriceGroupStatusCode(PriceGroupStatusCodeType value) {
        return new JAXBElement<PriceGroupStatusCodeType>(_PriceGroupStatusCode_QNAME, PriceGroupStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceLevelCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PriceLevelCode")
    public JAXBElement<PriceLevelCodeType> createPriceLevelCode(PriceLevelCodeType value) {
        return new JAXBElement<PriceLevelCodeType>(_PriceLevelCode_QNAME, PriceLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PriceRecalculateFactor")
    public JAXBElement<BigDecimal> createPriceRecalculateFactor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceRecalculateFactor_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PriceRecalculateModel")
    public JAXBElement<Integer> createPriceRecalculateModel(Integer value) {
        return new JAXBElement<Integer>(_PriceRecalculateModel_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PriorityOrder")
    public JAXBElement<Integer> createPriorityOrder(Integer value) {
        return new JAXBElement<Integer>(_PriorityOrder_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "OrderProducerCode")
    public JAXBElement<Integer> createOrderProducerCode(Integer value) {
        return new JAXBElement<Integer>(_OrderProducerCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ProducerCode")
    public JAXBElement<Integer> createProducerCode(Integer value) {
        return new JAXBElement<Integer>(_ProducerCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ProductCode")
    public JAXBElement<ProductCodeType> createProductCode(ProductCodeType value) {
        return new JAXBElement<ProductCodeType>(_ProductCode_QNAME, ProductCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ProductionDate")
    public JAXBElement<XMLGregorianCalendar> createProductionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductionDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "PromotionCode")
    public JAXBElement<String> createPromotionCode(String value) {
        return new JAXBElement<String>(_PromotionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ProposedRetrievalDate")
    public JAXBElement<XMLGregorianCalendar> createProposedRetrievalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProposedRetrievalDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ReceiptNumber")
    public JAXBElement<Integer> createReceiptNumber(Integer value) {
        return new JAXBElement<Integer>(_ReceiptNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ReferenceNumber")
    public JAXBElement<String> createReferenceNumber(String value) {
        return new JAXBElement<String>(_ReferenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RegionName")
    public JAXBElement<String> createRegionName(String value) {
        return new JAXBElement<String>(_RegionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RegisterDate")
    public JAXBElement<XMLGregorianCalendar> createRegisterDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegisterDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RegistrationNumber")
    public JAXBElement<String> createRegistrationNumber(String value) {
        return new JAXBElement<String>(_RegistrationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ReprintDateTime")
    public JAXBElement<XMLGregorianCalendar> createReprintDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReprintDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RequestId")
    public JAXBElement<String> createRequestId(String value) {
        return new JAXBElement<String>(_RequestId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RequisitionId")
    public JAXBElement<Integer> createRequisitionId(Integer value) {
        return new JAXBElement<Integer>(_RequisitionId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RequisitionRequirement")
    public JAXBElement<String> createRequisitionRequirement(String value) {
        return new JAXBElement<String>(_RequisitionRequirement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RestrictionCodeCredit")
    public JAXBElement<String> createRestrictionCodeCredit(String value) {
        return new JAXBElement<String>(_RestrictionCodeCredit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RestrictionCodeCreditDate")
    public JAXBElement<XMLGregorianCalendar> createRestrictionCodeCreditDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RestrictionCodeCreditDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RestrictionType")
    public JAXBElement<String> createRestrictionType(String value) {
        return new JAXBElement<String>(_RestrictionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RetrievalDateTime")
    public JAXBElement<XMLGregorianCalendar> createRetrievalDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrievalDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RetrievalDate")
    public JAXBElement<XMLGregorianCalendar> createRetrievalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrievalDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RoomTypeDescription")
    public JAXBElement<String> createRoomTypeDescription(String value) {
        return new JAXBElement<String>(_RoomTypeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RowMovedFromOrderId")
    public JAXBElement<String> createRowMovedFromOrderId(String value) {
        return new JAXBElement<String>(_RowMovedFromOrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "RowMovedToOrderId")
    public JAXBElement<String> createRowMovedToOrderId(String value) {
        return new JAXBElement<String>(_RowMovedToOrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesOrderSequenceNumber")
    public JAXBElement<Integer> createSalesOrderSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_SalesOrderSequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailability")
    public JAXBElement<Integer> createSeatAvailability(Integer value) {
        return new JAXBElement<Integer>(_SeatAvailability_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailability1")
    public JAXBElement<Integer> createSeatAvailability1(Integer value) {
        return new JAXBElement<Integer>(_SeatAvailability1_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailability2")
    public JAXBElement<Integer> createSeatAvailability2(Integer value) {
        return new JAXBElement<Integer>(_SeatAvailability2_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailability3")
    public JAXBElement<Integer> createSeatAvailability3(Integer value) {
        return new JAXBElement<Integer>(_SeatAvailability3_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailability4")
    public JAXBElement<Integer> createSeatAvailability4(Integer value) {
        return new JAXBElement<Integer>(_SeatAvailability4_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailability5")
    public JAXBElement<Integer> createSeatAvailability5(Integer value) {
        return new JAXBElement<Integer>(_SeatAvailability5_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailability6")
    public JAXBElement<Integer> createSeatAvailability6(Integer value) {
        return new JAXBElement<Integer>(_SeatAvailability6_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatAvailabilityGroupDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailabilityGroupDetail")
    public JAXBElement<SeatAvailabilityGroupDetailType> createSeatAvailabilityGroupDetail(SeatAvailabilityGroupDetailType value) {
        return new JAXBElement<SeatAvailabilityGroupDetailType>(_SeatAvailabilityGroupDetail_QNAME, SeatAvailabilityGroupDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatAvailabilityGroupSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SeatAvailabilityGroupSummary")
    public JAXBElement<SeatAvailabilityGroupSummaryType> createSeatAvailabilityGroupSummary(SeatAvailabilityGroupSummaryType value) {
        return new JAXBElement<SeatAvailabilityGroupSummaryType>(_SeatAvailabilityGroupSummary_QNAME, SeatAvailabilityGroupSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesCategoryBookingClassCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesCategoryBookingClassCode")
    public JAXBElement<SalesCategoryBookingClassCodeType> createSalesCategoryBookingClassCode(SalesCategoryBookingClassCodeType value) {
        return new JAXBElement<SalesCategoryBookingClassCodeType>(_SalesCategoryBookingClassCode_QNAME, SalesCategoryBookingClassCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesCategoryFlexibilityCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesCategoryFlexibilityCode")
    public JAXBElement<SalesCategoryFlexibilityCodeType> createSalesCategoryFlexibilityCode(SalesCategoryFlexibilityCodeType value) {
        return new JAXBElement<SalesCategoryFlexibilityCodeType>(_SalesCategoryFlexibilityCode_QNAME, SalesCategoryFlexibilityCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesProducer")
    public JAXBElement<Integer> createSalesProducer(Integer value) {
        return new JAXBElement<Integer>(_SalesProducer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SaleStatus")
    public JAXBElement<SalesStatusType> createSaleStatus(SalesStatusType value) {
        return new JAXBElement<SalesStatusType>(_SaleStatus_QNAME, SalesStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitOwner")
    public JAXBElement<String> createSalesUnitOwner(String value) {
        return new JAXBElement<String>(_SalesUnitOwner_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitOwnerNumber")
    public JAXBElement<String> createSalesUnitOwnerNumber(String value) {
        return new JAXBElement<String>(_SalesUnitOwnerNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitCategory")
    public JAXBElement<String> createSalesUnitCategory(String value) {
        return new JAXBElement<String>(_SalesUnitCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitId")
    public JAXBElement<String> createSalesUnitId(String value) {
        return new JAXBElement<String>(_SalesUnitId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitName")
    public JAXBElement<String> createSalesUnitName(String value) {
        return new JAXBElement<String>(_SalesUnitName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitSectionId")
    public JAXBElement<String> createSalesUnitSectionId(String value) {
        return new JAXBElement<String>(_SalesUnitSectionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitSectionName")
    public JAXBElement<String> createSalesUnitSectionName(String value) {
        return new JAXBElement<String>(_SalesUnitSectionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Salutation")
    public JAXBElement<String> createSalutation(String value) {
        return new JAXBElement<String>(_Salutation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SatCode")
    public JAXBElement<String> createSatCode(String value) {
        return new JAXBElement<String>(_SatCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SecrecyExist")
    public JAXBElement<String> createSecrecyExist(String value) {
        return new JAXBElement<String>(_SecrecyExist_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentProducerCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SegmentProducerCode")
    public JAXBElement<SegmentProducerCodeType> createSegmentProducerCode(SegmentProducerCodeType value) {
        return new JAXBElement<SegmentProducerCodeType>(_SegmentProducerCode_QNAME, SegmentProducerCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SegmentReference")
    public JAXBElement<Integer> createSegmentReference(Integer value) {
        return new JAXBElement<Integer>(_SegmentReference_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SubsegmentSequenceNumber")
    public JAXBElement<Integer> createSubsegmentSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_SubsegmentSequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SellerName")
    public JAXBElement<String> createSellerName(String value) {
        return new JAXBElement<String>(_SellerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SenderAddress")
    public JAXBElement<String> createSenderAddress(String value) {
        return new JAXBElement<String>(_SenderAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SerialNumber")
    public JAXBElement<Integer> createSerialNumber(Integer value) {
        return new JAXBElement<Integer>(_SerialNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Service")
    public JAXBElement<Integer> createService(Integer value) {
        return new JAXBElement<Integer>(_Service_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceBrandAbbreviation")
    public JAXBElement<String> createServiceBrandAbbreviation(String value) {
        return new JAXBElement<String>(_ServiceBrandAbbreviation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceBrandCode")
    public JAXBElement<String> createServiceBrandCode(String value) {
        return new JAXBElement<String>(_ServiceBrandCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceBrandName")
    public JAXBElement<String> createServiceBrandName(String value) {
        return new JAXBElement<String>(_ServiceBrandName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceId")
    public JAXBElement<Long> createServiceId(Long value) {
        return new JAXBElement<Long>(_ServiceId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceName")
    public JAXBElement<String> createServiceName(String value) {
        return new JAXBElement<String>(_ServiceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceLongName")
    public JAXBElement<String> createServiceLongName(String value) {
        return new JAXBElement<String>(_ServiceLongName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceShortName")
    public JAXBElement<String> createServiceShortName(String value) {
        return new JAXBElement<String>(_ServiceShortName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceNationality")
    public JAXBElement<String> createServiceNationality(String value) {
        return new JAXBElement<String>(_ServiceNationality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceSpecification")
    public JAXBElement<String> createServiceSpecification(String value) {
        return new JAXBElement<String>(_ServiceSpecification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceVersion")
    public JAXBElement<Integer> createServiceVersion(Integer value) {
        return new JAXBElement<Integer>(_ServiceVersion_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServicePresaleMax")
    public JAXBElement<String> createServicePresaleMax(String value) {
        return new JAXBElement<String>(_ServicePresaleMax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServicePresaleMin")
    public JAXBElement<String> createServicePresaleMin(String value) {
        return new JAXBElement<String>(_ServicePresaleMin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ServiceProducerCode")
    public JAXBElement<Integer> createServiceProducerCode(Integer value) {
        return new JAXBElement<Integer>(_ServiceProducerCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Sex")
    public JAXBElement<SexType> createSex(SexType value) {
        return new JAXBElement<SexType>(_Sex_QNAME, SexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Destination")
    public JAXBElement<String> createDestination(String value) {
        return new JAXBElement<String>(_Destination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ShortCardName")
    public JAXBElement<String> createShortCardName(String value) {
        return new JAXBElement<String>(_ShortCardName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Signature")
    public JAXBElement<String> createSignature(String value) {
        return new JAXBElement<String>(_Signature_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmokingDepartmentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SmokingDepartment")
    public JAXBElement<SmokingDepartmentCodeType> createSmokingDepartment(SmokingDepartmentCodeType value) {
        return new JAXBElement<SmokingDepartmentCodeType>(_SmokingDepartment_QNAME, SmokingDepartmentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SocialSecurityNumber")
    public JAXBElement<String> createSocialSecurityNumber(String value) {
        return new JAXBElement<String>(_SocialSecurityNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SpaceProperty")
    public JAXBElement<String> createSpaceProperty(String value) {
        return new JAXBElement<String>(_SpaceProperty_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpacePropertyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SpacePropertyCode")
    public JAXBElement<SpacePropertyCodeType> createSpacePropertyCode(SpacePropertyCodeType value) {
        return new JAXBElement<SpacePropertyCodeType>(_SpacePropertyCode_QNAME, SpacePropertyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "StandardDiscountCode")
    public JAXBElement<String> createStandardDiscountCode(String value) {
        return new JAXBElement<String>(_StandardDiscountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Standard2DiscountCode")
    public JAXBElement<String> createStandard2DiscountCode(String value) {
        return new JAXBElement<String>(_Standard2DiscountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "StartDate")
    public JAXBElement<XMLGregorianCalendar> createStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "StatisticalKilometer")
    public JAXBElement<Integer> createStatisticalKilometer(Integer value) {
        return new JAXBElement<Integer>(_StatisticalKilometer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SaleStatusInfo")
    public JAXBElement<String> createSaleStatusInfo(String value) {
        return new JAXBElement<String>(_SaleStatusInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "StreetLongName")
    public JAXBElement<String> createStreetLongName(String value) {
        return new JAXBElement<String>(_StreetLongName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "StreetName")
    public JAXBElement<String> createStreetName(String value) {
        return new JAXBElement<String>(_StreetName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "StreetNumber")
    public JAXBElement<String> createStreetNumber(String value) {
        return new JAXBElement<String>(_StreetNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Stylesheet")
    public JAXBElement<String> createStylesheet(String value) {
        return new JAXBElement<String>(_Stylesheet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SubClassId")
    public JAXBElement<String> createSubClassId(String value) {
        return new JAXBElement<String>(_SubClassId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SuborderDate")
    public JAXBElement<XMLGregorianCalendar> createSuborderDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SuborderDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SuborderOrderId")
    public JAXBElement<String> createSuborderOrderId(String value) {
        return new JAXBElement<String>(_SuborderOrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SuborderOrderItemId")
    public JAXBElement<Integer> createSuborderOrderItemId(Integer value) {
        return new JAXBElement<Integer>(_SuborderOrderItemId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Telephone")
    public JAXBElement<String> createTelephone(String value) {
        return new JAXBElement<String>(_Telephone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TemplateType")
    public JAXBElement<String> createTemplateType(String value) {
        return new JAXBElement<String>(_TemplateType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TariffUnit")
    public JAXBElement<Integer> createTariffUnit(Integer value) {
        return new JAXBElement<Integer>(_TariffUnit_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "SalesUnitKey")
    public JAXBElement<String> createSalesUnitKey(String value) {
        return new JAXBElement<String>(_SalesUnitKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TerminalId")
    public JAXBElement<String> createTerminalId(String value) {
        return new JAXBElement<String>(_TerminalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketBarCode")
    public JAXBElement<String> createTicketBarCode(String value) {
        return new JAXBElement<String>(_TicketBarCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketCode")
    public JAXBElement<String> createTicketCode(String value) {
        return new JAXBElement<String>(_TicketCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketNumber")
    public JAXBElement<String> createTicketNumber(String value) {
        return new JAXBElement<String>(_TicketNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketTeared")
    public JAXBElement<String> createTicketTeared(String value) {
        return new JAXBElement<String>(_TicketTeared_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketTearedDateTime")
    public JAXBElement<XMLGregorianCalendar> createTicketTearedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TicketTearedDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketTearedUserId")
    public JAXBElement<String> createTicketTearedUserId(String value) {
        return new JAXBElement<String>(_TicketTearedUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketTearedLocationId")
    public JAXBElement<String> createTicketTearedLocationId(String value) {
        return new JAXBElement<String>(_TicketTearedLocationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketType")
    public JAXBElement<TicketTypeType> createTicketType(TicketTypeType value) {
        return new JAXBElement<TicketTypeType>(_TicketType_QNAME, TicketTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketUntearedDateTime")
    public JAXBElement<XMLGregorianCalendar> createTicketUntearedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TicketUntearedDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketUntearedUserId")
    public JAXBElement<String> createTicketUntearedUserId(String value) {
        return new JAXBElement<String>(_TicketUntearedUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TimeUnit")
    public JAXBElement<String> createTimeUnit(String value) {
        return new JAXBElement<String>(_TimeUnit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TicketUntearedLocationId")
    public JAXBElement<String> createTicketUntearedLocationId(String value) {
        return new JAXBElement<String>(_TicketUntearedLocationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TotalNumberOfTickets")
    public JAXBElement<Integer> createTotalNumberOfTickets(Integer value) {
        return new JAXBElement<Integer>(_TotalNumberOfTickets_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ToDate")
    public JAXBElement<XMLGregorianCalendar> createToDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ToDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ToDateTime")
    public JAXBElement<XMLGregorianCalendar> createToDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ToDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ToFareZone")
    public JAXBElement<Integer> createToFareZone(Integer value) {
        return new JAXBElement<Integer>(_ToFareZone_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ToTicketStockNumber")
    public JAXBElement<Integer> createToTicketStockNumber(Integer value) {
        return new JAXBElement<Integer>(_ToTicketStockNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TransportId")
    public JAXBElement<String> createTransportId(String value) {
        return new JAXBElement<String>(_TransportId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TransportInformation")
    public JAXBElement<TransportInformationType> createTransportInformation(TransportInformationType value) {
        return new JAXBElement<TransportInformationType>(_TransportInformation_QNAME, TransportInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TransportName")
    public JAXBElement<String> createTransportName(String value) {
        return new JAXBElement<String>(_TransportName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportSegmentsOriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TransportSegmentsOrigin")
    public JAXBElement<TransportSegmentsOriginType> createTransportSegmentsOrigin(TransportSegmentsOriginType value) {
        return new JAXBElement<TransportSegmentsOriginType>(_TransportSegmentsOrigin_QNAME, TransportSegmentsOriginType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelDocumentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravelDocumentCode")
    public JAXBElement<TravelDocumentCodeType> createTravelDocumentCode(TravelDocumentCodeType value) {
        return new JAXBElement<TravelDocumentCodeType>(_TravelDocumentCode_QNAME, TravelDocumentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravelLinkOrder")
    public JAXBElement<Integer> createTravelLinkOrder(Integer value) {
        return new JAXBElement<Integer>(_TravelLinkOrder_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravellerCustomerId")
    public JAXBElement<String> createTravellerCustomerId(String value) {
        return new JAXBElement<String>(_TravellerCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravellerFreeText")
    public JAXBElement<String> createTravellerFreeText(String value) {
        return new JAXBElement<String>(_TravellerFreeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravellerMandatory")
    public JAXBElement<String> createTravellerMandatory(String value) {
        return new JAXBElement<String>(_TravellerMandatory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravellerNumber")
    public JAXBElement<Integer> createTravellerNumber(Integer value) {
        return new JAXBElement<Integer>(_TravellerNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravellerRestrictionCode")
    public JAXBElement<String> createTravellerRestrictionCode(String value) {
        return new JAXBElement<String>(_TravellerRestrictionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CompanyRestrictionCode")
    public JAXBElement<String> createCompanyRestrictionCode(String value) {
        return new JAXBElement<String>(_CompanyRestrictionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravellerSequenceNumber")
    public JAXBElement<Integer> createTravellerSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_TravellerSequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravelDate")
    public JAXBElement<XMLGregorianCalendar> createTravelDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TravelDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelMethodCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravelMethodCode")
    public JAXBElement<TravelMethodCodeType> createTravelMethodCode(TravelMethodCodeType value) {
        return new JAXBElement<TravelMethodCodeType>(_TravelMethodCode_QNAME, TravelMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravelRoute")
    public JAXBElement<String> createTravelRoute(String value) {
        return new JAXBElement<String>(_TravelRoute_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TravelType")
    public JAXBElement<TravelTypeType> createTravelType(TravelTypeType value) {
        return new JAXBElement<TravelTypeType>(_TravelType_QNAME, TravelTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TypeOfCommunication")
    public JAXBElement<String> createTypeOfCommunication(String value) {
        return new JAXBElement<String>(_TypeOfCommunication_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "TypeOfSpecification")
    public JAXBElement<String> createTypeOfSpecification(String value) {
        return new JAXBElement<String>(_TypeOfSpecification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UnlockUserAccountPassword")
    public JAXBElement<String> createUnlockUserAccountPassword(String value) {
        return new JAXBElement<String>(_UnlockUserAccountPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UpdateUserId")
    public JAXBElement<String> createUpdateUserId(String value) {
        return new JAXBElement<String>(_UpdateUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UsedForVoucherCreationDate")
    public JAXBElement<XMLGregorianCalendar> createUsedForVoucherCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UsedForVoucherCreationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UsedNumberOfTickets")
    public JAXBElement<Integer> createUsedNumberOfTickets(Integer value) {
        return new JAXBElement<Integer>(_UsedNumberOfTickets_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UserAccountAlias")
    public JAXBElement<String> createUserAccountAlias(String value) {
        return new JAXBElement<String>(_UserAccountAlias_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UserAccountId")
    public JAXBElement<String> createUserAccountId(String value) {
        return new JAXBElement<String>(_UserAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UserAccountPassword")
    public JAXBElement<String> createUserAccountPassword(String value) {
        return new JAXBElement<String>(_UserAccountPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UserId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ValidFrom")
    public JAXBElement<XMLGregorianCalendar> createValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidFrom_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ValidTo")
    public JAXBElement<XMLGregorianCalendar> createValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidTo_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ValidityCode")
    public JAXBElement<Integer> createValidityCode(Integer value) {
        return new JAXBElement<Integer>(_ValidityCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ValidityDescription")
    public JAXBElement<String> createValidityDescription(String value) {
        return new JAXBElement<String>(_ValidityDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ValidityTimeType")
    public JAXBElement<String> createValidityTimeType(String value) {
        return new JAXBElement<String>(_ValidityTimeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "VariantNumber")
    public JAXBElement<Integer> createVariantNumber(Integer value) {
        return new JAXBElement<Integer>(_VariantNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VatMandatoryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "VatMandatoryCode")
    public JAXBElement<VatMandatoryCodeType> createVatMandatoryCode(VatMandatoryCodeType value) {
        return new JAXBElement<VatMandatoryCodeType>(_VatMandatoryCode_QNAME, VatMandatoryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ViaLocationSequenceNumber")
    public JAXBElement<Integer> createViaLocationSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_ViaLocationSequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "ZipCode")
    public JAXBElement<String> createZipCode(String value) {
        return new JAXBElement<String>(_ZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CurrencyCode")
    public JAXBElement<CurrencyCodeType> createCurrencyCode(CurrencyCodeType value) {
        return new JAXBElement<CurrencyCodeType>(_CurrencyCode_QNAME, CurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<String>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "CreditReasonCode")
    public JAXBElement<String> createCreditReasonCode(String value) {
        return new JAXBElement<String>(_CreditReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "EventDateTime")
    public JAXBElement<XMLGregorianCalendar> createEventDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "NumberOfDiscounts")
    public JAXBElement<String> createNumberOfDiscounts(String value) {
        return new JAXBElement<String>(_NumberOfDiscounts_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://petra.linkon.se/commonelements/data/v4_6", name = "Version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

}
