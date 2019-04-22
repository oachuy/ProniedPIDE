
package pe.gob.pj.verificacionantecedentespenalesws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xApellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xNombre1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xNombre2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xNombre3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xDni" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xMotivoConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xProcesoEntidadConsultante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xRucEntidadConsultante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xIpPublica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xDniPersonaConsultante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xAudNombrePC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xAudIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xAudNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xAudDireccionMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xApellidoPaterno",
    "xApellidoMaterno",
    "xNombre1",
    "xNombre2",
    "xNombre3",
    "xDni",
    "xMotivoConsulta",
    "xProcesoEntidadConsultante",
    "xRucEntidadConsultante",
    "xIpPublica",
    "xDniPersonaConsultante",
    "xAudNombrePC",
    "xAudIP",
    "xAudNombreUsuario",
    "xAudDireccionMAC"
})
@XmlRootElement(name = "verificarAntecedentesPenales")
public class VerificarAntecedentesPenales {

    @XmlElement(required = true)
    protected String xApellidoPaterno;
    @XmlElement(required = true)
    protected String xApellidoMaterno;
    @XmlElement(required = true)
    protected String xNombre1;
    @XmlElement(required = true)
    protected String xNombre2;
    @XmlElement(required = true)
    protected String xNombre3;
    @XmlElement(required = true)
    protected String xDni;
    @XmlElement(required = true)
    protected String xMotivoConsulta;
    @XmlElement(required = true)
    protected String xProcesoEntidadConsultante;
    @XmlElement(required = true)
    protected String xRucEntidadConsultante;
    @XmlElement(required = true)
    protected String xIpPublica;
    @XmlElement(required = true)
    protected String xDniPersonaConsultante;
    @XmlElement(required = true)
    protected String xAudNombrePC;
    @XmlElement(required = true)
    protected String xAudIP;
    @XmlElement(required = true)
    protected String xAudNombreUsuario;
    @XmlElement(required = true)
    protected String xAudDireccionMAC;

    /**
     * Obtiene el valor de la propiedad xApellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXApellidoPaterno() {
        return xApellidoPaterno;
    }

    /**
     * Define el valor de la propiedad xApellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXApellidoPaterno(String value) {
        this.xApellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad xApellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXApellidoMaterno() {
        return xApellidoMaterno;
    }

    /**
     * Define el valor de la propiedad xApellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXApellidoMaterno(String value) {
        this.xApellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad xNombre1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNombre1() {
        return xNombre1;
    }

    /**
     * Define el valor de la propiedad xNombre1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNombre1(String value) {
        this.xNombre1 = value;
    }

    /**
     * Obtiene el valor de la propiedad xNombre2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNombre2() {
        return xNombre2;
    }

    /**
     * Define el valor de la propiedad xNombre2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNombre2(String value) {
        this.xNombre2 = value;
    }

    /**
     * Obtiene el valor de la propiedad xNombre3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNombre3() {
        return xNombre3;
    }

    /**
     * Define el valor de la propiedad xNombre3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNombre3(String value) {
        this.xNombre3 = value;
    }

    /**
     * Obtiene el valor de la propiedad xDni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDni() {
        return xDni;
    }

    /**
     * Define el valor de la propiedad xDni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDni(String value) {
        this.xDni = value;
    }

    /**
     * Obtiene el valor de la propiedad xMotivoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMotivoConsulta() {
        return xMotivoConsulta;
    }

    /**
     * Define el valor de la propiedad xMotivoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivoConsulta(String value) {
        this.xMotivoConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad xProcesoEntidadConsultante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXProcesoEntidadConsultante() {
        return xProcesoEntidadConsultante;
    }

    /**
     * Define el valor de la propiedad xProcesoEntidadConsultante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXProcesoEntidadConsultante(String value) {
        this.xProcesoEntidadConsultante = value;
    }

    /**
     * Obtiene el valor de la propiedad xRucEntidadConsultante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRucEntidadConsultante() {
        return xRucEntidadConsultante;
    }

    /**
     * Define el valor de la propiedad xRucEntidadConsultante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRucEntidadConsultante(String value) {
        this.xRucEntidadConsultante = value;
    }

    /**
     * Obtiene el valor de la propiedad xIpPublica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXIpPublica() {
        return xIpPublica;
    }

    /**
     * Define el valor de la propiedad xIpPublica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXIpPublica(String value) {
        this.xIpPublica = value;
    }

    /**
     * Obtiene el valor de la propiedad xDniPersonaConsultante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDniPersonaConsultante() {
        return xDniPersonaConsultante;
    }

    /**
     * Define el valor de la propiedad xDniPersonaConsultante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDniPersonaConsultante(String value) {
        this.xDniPersonaConsultante = value;
    }

    /**
     * Obtiene el valor de la propiedad xAudNombrePC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAudNombrePC() {
        return xAudNombrePC;
    }

    /**
     * Define el valor de la propiedad xAudNombrePC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAudNombrePC(String value) {
        this.xAudNombrePC = value;
    }

    /**
     * Obtiene el valor de la propiedad xAudIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAudIP() {
        return xAudIP;
    }

    /**
     * Define el valor de la propiedad xAudIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAudIP(String value) {
        this.xAudIP = value;
    }

    /**
     * Obtiene el valor de la propiedad xAudNombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAudNombreUsuario() {
        return xAudNombreUsuario;
    }

    /**
     * Define el valor de la propiedad xAudNombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAudNombreUsuario(String value) {
        this.xAudNombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad xAudDireccionMAC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAudDireccionMAC() {
        return xAudDireccionMAC;
    }

    /**
     * Define el valor de la propiedad xAudDireccionMAC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAudDireccionMAC(String value) {
        this.xAudDireccionMAC = value;
    }

}
