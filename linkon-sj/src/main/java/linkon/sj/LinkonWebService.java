package linkon.sj;

import se.linkon.service.gtssales.v1_17.GtsSalesService;
import se.linkon.service.gtssales.v1_17.WSGtsSalesService;
import se.linkon.service.location.v1_5.LocationService;
import se.linkon.service.location.v1_5.WSLocationService;
import se.linkon.service.order.orderstorage.v1_10.OrderStorageService;
import se.linkon.service.order.orderstorage.v1_10.WSOrderStorageService;
import se.linkon.service.timetable.v2_7.TimetableService;
import se.linkon.service.timetable.v2_7.WSTimetableService;

import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkonWebService {

    private LinkonApiEnvironment environment = LinkonApiEnvironment.TEST;
    String username = "AT126F";
    String password = "Xyw8Fr3T";

    private LocationService locationService;
    private TimetableService timetableService;
    private GtsSalesService gtsSalesService;
    private OrderStorageService orderStorageService;

    public LinkonWebService() {
        locationService = getLocationService();
        timetableService = getTimetableService();
        gtsSalesService = getGtsSalesService();
        orderStorageService = getOrderStorageService();
    }

    public final LocationService getLocationService() {
        reInitializeServicesWhenEnvironmentChanges();
        return locationService;
    }

    public final TimetableService getTimetableService() {
        reInitializeServicesWhenEnvironmentChanges();
        return timetableService;
    }

    public GtsSalesService getGtsSalesService() {
        reInitializeServicesWhenEnvironmentChanges();
        return gtsSalesService;
    }

    public OrderStorageService getOrderStorageService() {
        reInitializeServicesWhenEnvironmentChanges();
        return orderStorageService;
    }

    private void initializeLocationService() {
        locationService = (new WSLocationService()).getWSLocationPort();
        BindingProvider provider = (BindingProvider) locationService;
        setUpProvider(provider, LinkonServiceEndpoint.LOCATION);
    }

    private void initializetTimetableService() {
        timetableService = (new WSTimetableService()).getWSTimetablePort();
        BindingProvider provider = (BindingProvider) timetableService;
        setUpProvider(provider, LinkonServiceEndpoint.TIME_TABLE);
    }

    private void initializeGtsSalesService() {
        gtsSalesService = (new WSGtsSalesService()).getWSGtsSalesPort();
        BindingProvider provider = (BindingProvider) gtsSalesService;
        setUpProvider(provider, LinkonServiceEndpoint.GTS_SALES);
    }

    private void initializeOrderStorageService() {
        orderStorageService = (new WSOrderStorageService()).getWSOrderStoragePort();
        BindingProvider provider = (BindingProvider) orderStorageService;
        setUpProvider(provider, LinkonServiceEndpoint.ORDER_STORAGE);
    }

    private void reInitializeServicesWhenEnvironmentChanges() {
        initializeLocationService();
        initializetTimetableService();
        initializeGtsSalesService();
        initializeOrderStorageService();
    }

    private void setUpProvider(BindingProvider provider, LinkonServiceEndpoint service) {

        Map<String, Object> requestContext = provider.getRequestContext();
        requestContext.put("javax.xml.ws.service.endpoint.address", service.getServiceUrl(environment));

        List handlerChain = provider.getBinding().getHandlerChain();
        handlerChain.add(new WSSecurityHandler(username, password));

        SOAPHandler<SOAPMessageContext> loggingHandler = new SOAPHandler<SOAPMessageContext>() {

            @Override
            public boolean handleMessage(SOAPMessageContext context) {
                String prefix = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY) ? "REQUEST: " : "RESPONSE: ";
                log(context, prefix);
                return true;
            }

            @Override
            public boolean handleFault(SOAPMessageContext context) {
                log(context, "FAULT: ");
                return true;
            }

            @Override
            public void close(MessageContext context) {
                // Do nothing
            }

            @Override
            @SuppressWarnings({"rawtypes", "unchecked"})
            public Set getHeaders() {
                // Not required for logging
                return null;
            }

            private void log(SOAPMessageContext context, String prefix) {
                try {
                    SOAPMessage msg = context.getMessage();
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    msg.writeTo(out);
                    StringBuilder msgString = new StringBuilder(prefix);
                    msgString.append(out);

                    System.out.println("Message " + msgString.toString());
                } catch (Exception e) {
                }
            }

        };

        handlerChain.add(loggingHandler);
        provider.getBinding().setHandlerChain(handlerChain);
    }


}