
package pe.gob.inpe.wsantjudiciales.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "INPEAJudicialesPortType", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface INPEAJudicialesPortType {


    /**
     * 
     * @param apepat
     * @param apemat
     * @param nombres
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "getAntecedenteJudicial")
    @WebResult(name = "getAntecedenteJudicialReturn", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe")
    @RequestWrapper(localName = "getAntecedenteJudicial", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe", className = "pe.gob.inpe.wsantjudiciales.endpoint.GetAntecedenteJudicial")
    @ResponseWrapper(localName = "getAntecedenteJudicialResponse", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe", className = "pe.gob.inpe.wsantjudiciales.endpoint.GetAntecedenteJudicialResponse")
    public String getAntecedenteJudicial(
        @WebParam(name = "apepat", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe")
        String apepat,
        @WebParam(name = "apemat", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe")
        String apemat,
        @WebParam(name = "nombres", targetNamespace = "http://endpoint.wsantjudiciales.inpe.gob.pe")
        String nombres);

}
