
package minedu.reniec.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the minedu.reniec.ws package. 
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

    private final static QName _BuscarExtranjero_QNAME = new QName("http://ws.reniec.minedu/", "buscarExtranjero");
    private final static QName _BuscarDNICascadaMasivoResponse_QNAME = new QName("http://ws.reniec.minedu/", "buscarDNICascadaMasivoResponse");
    private final static QName _BuscarDNICascadaMasivo_QNAME = new QName("http://ws.reniec.minedu/", "buscarDNICascadaMasivo");
    private final static QName _BuscarEntidadResponse_QNAME = new QName("http://ws.reniec.minedu/", "buscarEntidadResponse");
    private final static QName _BuscarExtranjeroResponse_QNAME = new QName("http://ws.reniec.minedu/", "buscarExtranjeroResponse");
    private final static QName _ActualizacionPersonaResponse_QNAME = new QName("http://ws.reniec.minedu/", "actualizacionPersonaResponse");
    private final static QName _BuscarDNICascada_QNAME = new QName("http://ws.reniec.minedu/", "buscarDNICascada");
    private final static QName _BuscarDNICascadaResponse_QNAME = new QName("http://ws.reniec.minedu/", "buscarDNICascadaResponse");
    private final static QName _ActualizacionPersona_QNAME = new QName("http://ws.reniec.minedu/", "actualizacionPersona");
    private final static QName _BuscarEntidad_QNAME = new QName("http://ws.reniec.minedu/", "buscarEntidad");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: minedu.reniec.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizacionPersona }
     * 
     */
    public ActualizacionPersona createActualizacionPersona() {
        return new ActualizacionPersona();
    }

    /**
     * Create an instance of {@link BuscarEntidad }
     * 
     */
    public BuscarEntidad createBuscarEntidad() {
        return new BuscarEntidad();
    }

    /**
     * Create an instance of {@link BuscarDNICascadaResponse }
     * 
     */
    public BuscarDNICascadaResponse createBuscarDNICascadaResponse() {
        return new BuscarDNICascadaResponse();
    }

    /**
     * Create an instance of {@link ActualizacionPersonaResponse }
     * 
     */
    public ActualizacionPersonaResponse createActualizacionPersonaResponse() {
        return new ActualizacionPersonaResponse();
    }

    /**
     * Create an instance of {@link BuscarDNICascada }
     * 
     */
    public BuscarDNICascada createBuscarDNICascada() {
        return new BuscarDNICascada();
    }

    /**
     * Create an instance of {@link BuscarDNICascadaMasivo }
     * 
     */
    public BuscarDNICascadaMasivo createBuscarDNICascadaMasivo() {
        return new BuscarDNICascadaMasivo();
    }

    /**
     * Create an instance of {@link BuscarEntidadResponse }
     * 
     */
    public BuscarEntidadResponse createBuscarEntidadResponse() {
        return new BuscarEntidadResponse();
    }

    /**
     * Create an instance of {@link BuscarExtranjeroResponse }
     * 
     */
    public BuscarExtranjeroResponse createBuscarExtranjeroResponse() {
        return new BuscarExtranjeroResponse();
    }

    /**
     * Create an instance of {@link BuscarExtranjero }
     * 
     */
    public BuscarExtranjero createBuscarExtranjero() {
        return new BuscarExtranjero();
    }

    /**
     * Create an instance of {@link BuscarDNICascadaMasivoResponse }
     * 
     */
    public BuscarDNICascadaMasivoResponse createBuscarDNICascadaMasivoResponse() {
        return new BuscarDNICascadaMasivoResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link MensajeError }
     * 
     */
    public MensajeError createMensajeError() {
        return new MensajeError();
    }

    /**
     * Create an instance of {@link RespuestaEntidad }
     * 
     */
    public RespuestaEntidad createRespuestaEntidad() {
        return new RespuestaEntidad();
    }

    /**
     * Create an instance of {@link PersonaRemapeo }
     * 
     */
    public PersonaRemapeo createPersonaRemapeo() {
        return new PersonaRemapeo();
    }

    /**
     * Create an instance of {@link RespuestaReniec }
     * 
     */
    public RespuestaReniec createRespuestaReniec() {
        return new RespuestaReniec();
    }

    /**
     * Create an instance of {@link Entidad }
     * 
     */
    public Entidad createEntidad() {
        return new Entidad();
    }

    /**
     * Create an instance of {@link RespuestaReniecRemapeo }
     * 
     */
    public RespuestaReniecRemapeo createRespuestaReniecRemapeo() {
        return new RespuestaReniecRemapeo();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarExtranjero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarExtranjero")
    public JAXBElement<BuscarExtranjero> createBuscarExtranjero(BuscarExtranjero value) {
        return new JAXBElement<BuscarExtranjero>(_BuscarExtranjero_QNAME, BuscarExtranjero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDNICascadaMasivoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarDNICascadaMasivoResponse")
    public JAXBElement<BuscarDNICascadaMasivoResponse> createBuscarDNICascadaMasivoResponse(BuscarDNICascadaMasivoResponse value) {
        return new JAXBElement<BuscarDNICascadaMasivoResponse>(_BuscarDNICascadaMasivoResponse_QNAME, BuscarDNICascadaMasivoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDNICascadaMasivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarDNICascadaMasivo")
    public JAXBElement<BuscarDNICascadaMasivo> createBuscarDNICascadaMasivo(BuscarDNICascadaMasivo value) {
        return new JAXBElement<BuscarDNICascadaMasivo>(_BuscarDNICascadaMasivo_QNAME, BuscarDNICascadaMasivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEntidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarEntidadResponse")
    public JAXBElement<BuscarEntidadResponse> createBuscarEntidadResponse(BuscarEntidadResponse value) {
        return new JAXBElement<BuscarEntidadResponse>(_BuscarEntidadResponse_QNAME, BuscarEntidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarExtranjeroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarExtranjeroResponse")
    public JAXBElement<BuscarExtranjeroResponse> createBuscarExtranjeroResponse(BuscarExtranjeroResponse value) {
        return new JAXBElement<BuscarExtranjeroResponse>(_BuscarExtranjeroResponse_QNAME, BuscarExtranjeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizacionPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "actualizacionPersonaResponse")
    public JAXBElement<ActualizacionPersonaResponse> createActualizacionPersonaResponse(ActualizacionPersonaResponse value) {
        return new JAXBElement<ActualizacionPersonaResponse>(_ActualizacionPersonaResponse_QNAME, ActualizacionPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDNICascada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarDNICascada")
    public JAXBElement<BuscarDNICascada> createBuscarDNICascada(BuscarDNICascada value) {
        return new JAXBElement<BuscarDNICascada>(_BuscarDNICascada_QNAME, BuscarDNICascada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDNICascadaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarDNICascadaResponse")
    public JAXBElement<BuscarDNICascadaResponse> createBuscarDNICascadaResponse(BuscarDNICascadaResponse value) {
        return new JAXBElement<BuscarDNICascadaResponse>(_BuscarDNICascadaResponse_QNAME, BuscarDNICascadaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizacionPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "actualizacionPersona")
    public JAXBElement<ActualizacionPersona> createActualizacionPersona(ActualizacionPersona value) {
        return new JAXBElement<ActualizacionPersona>(_ActualizacionPersona_QNAME, ActualizacionPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEntidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.reniec.minedu/", name = "buscarEntidad")
    public JAXBElement<BuscarEntidad> createBuscarEntidad(BuscarEntidad value) {
        return new JAXBElement<BuscarEntidad>(_BuscarEntidad_QNAME, BuscarEntidad.class, null, value);
    }

}
