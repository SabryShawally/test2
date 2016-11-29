package se.linkon.service.location.v1_5;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-29T15:03:21.024+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "WSLocationService", 
                  wsdlLocation = "classpath:wsdl/location/1_5/LocationService.wsdl",
                  targetNamespace = "http://service.linkon.se/location/v1_5") 
public class WSLocationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.linkon.se/location/v1_5", "WSLocationService");
    public final static QName WSLocationPort = new QName("http://service.linkon.se/location/v1_5", "WSLocation-port");
    static {
        URL url = WSLocationService.class.getClassLoader().getResource("wsdl/location/1_5/LocationService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(WSLocationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/location/1_5/LocationService.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public WSLocationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSLocationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSLocationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WSLocationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WSLocationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WSLocationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns LocationService
     */
    @WebEndpoint(name = "WSLocation-port")
    public LocationService getWSLocationPort() {
        return super.getPort(WSLocationPort, LocationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocationService
     */
    @WebEndpoint(name = "WSLocation-port")
    public LocationService getWSLocationPort(WebServiceFeature... features) {
        return super.getPort(WSLocationPort, LocationService.class, features);
    }

}
