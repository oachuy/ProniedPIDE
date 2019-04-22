
package pe.gob.pj.verificacionantecedentespenalesws.ws;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PJAntecedentesPenales", targetNamespace = "http://ws.verificacionAntecedentesPenalesWS.pj.gob.pe", wsdlLocation = "https://ws3.pide.gob.pe/services/PJAntecedentesPenales?wsdl")
public class PJAntecedentesPenales
    extends Service
{

    private final static URL PJANTECEDENTESPENALES_WSDL_LOCATION;
    private final static WebServiceException PJANTECEDENTESPENALES_EXCEPTION;
    private final static QName PJANTECEDENTESPENALES_QNAME = new QName("http://ws.verificacionAntecedentesPenalesWS.pj.gob.pe", "PJAntecedentesPenales");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ws3.pide.gob.pe/services/PJAntecedentesPenales?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PJANTECEDENTESPENALES_WSDL_LOCATION = url;
        PJANTECEDENTESPENALES_EXCEPTION = e;
    }

    public PJAntecedentesPenales() {
        super(__getWsdlLocation(), PJANTECEDENTESPENALES_QNAME);
    }

    public PJAntecedentesPenales(WebServiceFeature... features) {
        super(__getWsdlLocation(), PJANTECEDENTESPENALES_QNAME, features);
    }

    public PJAntecedentesPenales(URL wsdlLocation) {
        super(wsdlLocation, PJANTECEDENTESPENALES_QNAME);
    }

    public PJAntecedentesPenales(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PJANTECEDENTESPENALES_QNAME, features);
    }

    public PJAntecedentesPenales(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PJAntecedentesPenales(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PJAntecedentesPenalesPortType
     */
    @WebEndpoint(name = "PJAntecedentesPenalesHttpSoap11Endpoint")
    public PJAntecedentesPenalesPortType getPJAntecedentesPenalesHttpSoap11Endpoint() {
        return super.getPort(new QName("http://ws.verificacionAntecedentesPenalesWS.pj.gob.pe", "PJAntecedentesPenalesHttpSoap11Endpoint"), PJAntecedentesPenalesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PJAntecedentesPenalesPortType
     */
    @WebEndpoint(name = "PJAntecedentesPenalesHttpSoap11Endpoint")
    public PJAntecedentesPenalesPortType getPJAntecedentesPenalesHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.verificacionAntecedentesPenalesWS.pj.gob.pe", "PJAntecedentesPenalesHttpSoap11Endpoint"), PJAntecedentesPenalesPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns PJAntecedentesPenalesPortType
     */
    @WebEndpoint(name = "PJAntecedentesPenalesHttpsSoap11Endpoint")
    public PJAntecedentesPenalesPortType getPJAntecedentesPenalesHttpsSoap11Endpoint() {
        return super.getPort(new QName("http://ws.verificacionAntecedentesPenalesWS.pj.gob.pe", "PJAntecedentesPenalesHttpsSoap11Endpoint"), PJAntecedentesPenalesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PJAntecedentesPenalesPortType
     */
    @WebEndpoint(name = "PJAntecedentesPenalesHttpsSoap11Endpoint")
    public PJAntecedentesPenalesPortType getPJAntecedentesPenalesHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.verificacionAntecedentesPenalesWS.pj.gob.pe", "PJAntecedentesPenalesHttpsSoap11Endpoint"), PJAntecedentesPenalesPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PJANTECEDENTESPENALES_EXCEPTION!= null) {
            throw PJANTECEDENTESPENALES_EXCEPTION;
        }
        return PJANTECEDENTESPENALES_WSDL_LOCATION;
    }

}
