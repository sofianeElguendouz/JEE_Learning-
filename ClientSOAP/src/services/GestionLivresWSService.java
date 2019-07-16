
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GestionLivresWSService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8092/GestionLivres/GestionLivresWS?WSDL")
public class GestionLivresWSService
    extends Service
{

    private final static URL GESTIONLIVRESWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GESTIONLIVRESWSSERVICE_EXCEPTION;
    private final static QName GESTIONLIVRESWSSERVICE_QNAME = new QName("http://services/", "GestionLivresWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8092/GestionLivres/GestionLivresWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTIONLIVRESWSSERVICE_WSDL_LOCATION = url;
        GESTIONLIVRESWSSERVICE_EXCEPTION = e;
    }

    public GestionLivresWSService() {
        super(__getWsdlLocation(), GESTIONLIVRESWSSERVICE_QNAME);
    }

    public GestionLivresWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTIONLIVRESWSSERVICE_QNAME, features);
    }

    public GestionLivresWSService(URL wsdlLocation) {
        super(wsdlLocation, GESTIONLIVRESWSSERVICE_QNAME);
    }

    public GestionLivresWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GESTIONLIVRESWSSERVICE_QNAME, features);
    }

    public GestionLivresWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionLivresWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GestionLivresWS
     */
    @WebEndpoint(name = "GestionLivresWSPort")
    public GestionLivresWS getGestionLivresWSPort() {
        return super.getPort(new QName("http://services/", "GestionLivresWSPort"), GestionLivresWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionLivresWS
     */
    @WebEndpoint(name = "GestionLivresWSPort")
    public GestionLivresWS getGestionLivresWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "GestionLivresWSPort"), GestionLivresWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTIONLIVRESWSSERVICE_EXCEPTION!= null) {
            throw GESTIONLIVRESWSSERVICE_EXCEPTION;
        }
        return GESTIONLIVRESWSSERVICE_WSDL_LOCATION;
    }

}