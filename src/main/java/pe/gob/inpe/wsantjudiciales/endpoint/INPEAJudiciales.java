
package pe.gob.inpe.wsantjudiciales.endpoint;

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
@WebServiceClient(name = "INPEAJudiciales", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe", wsdlLocation = "https://ws3.pide.gob.pe/services/INPEAJudiciales?wsdl")
public class INPEAJudiciales
    extends Service
{

    private final static URL INPEAJUDICIALES_WSDL_LOCATION;
    private final static WebServiceException INPEAJUDICIALES_EXCEPTION;
    private final static QName INPEAJUDICIALES_QNAME = new QName("http://endpoint.wsantjudiciales.inpe.gob.pe", "INPEAJudiciales");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ws3.pide.gob.pe/services/INPEAJudiciales?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INPEAJUDICIALES_WSDL_LOCATION = url;
        INPEAJUDICIALES_EXCEPTION = e;
    }

    public INPEAJudiciales() {
        super(__getWsdlLocation(), INPEAJUDICIALES_QNAME);
    }

    public INPEAJudiciales(WebServiceFeature... features) {
        super(__getWsdlLocation(), INPEAJUDICIALES_QNAME, features);
    }

    public INPEAJudiciales(URL wsdlLocation) {
        super(wsdlLocation, INPEAJUDICIALES_QNAME);
    }

    public INPEAJudiciales(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INPEAJUDICIALES_QNAME, features);
    }

    public INPEAJudiciales(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public INPEAJudiciales(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns INPEAJudicialesPortType
     */
    @WebEndpoint(name = "INPEAJudicialesHttpsSoap11Endpoint")
    public INPEAJudicialesPortType getINPEAJudicialesHttpsSoap11Endpoint() {
        return super.getPort(new QName("http://endpoint.wsantjudiciales.inpe.gob.pe", "INPEAJudicialesHttpsSoap11Endpoint"), INPEAJudicialesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns INPEAJudicialesPortType
     */
    @WebEndpoint(name = "INPEAJudicialesHttpsSoap11Endpoint")
    public INPEAJudicialesPortType getINPEAJudicialesHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint.wsantjudiciales.inpe.gob.pe", "INPEAJudicialesHttpsSoap11Endpoint"), INPEAJudicialesPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INPEAJUDICIALES_EXCEPTION!= null) {
            throw INPEAJUDICIALES_EXCEPTION;
        }
        return INPEAJUDICIALES_WSDL_LOCATION;
    }

}