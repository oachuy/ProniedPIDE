
package minedu.reniec.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para entidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codPaisDocumentoEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codTipoDocumentoEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codTipoIndicadorNoHabido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dscPaisDocumentoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscTipoDocumentoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecInicioVigenciaEntidad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecTerminoVigenciaEntidad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ideNumericoEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indicadorNoHabido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDocumentoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocialEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenciaEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entidad", propOrder = {
    "codPaisDocumentoEntidad",
    "codTipoDocumentoEntidad",
    "codTipoIndicadorNoHabido",
    "dscPaisDocumentoEntidad",
    "dscTipoDocumentoEntidad",
    "fecInicioVigenciaEntidad",
    "fecTerminoVigenciaEntidad",
    "ideNumericoEntidad",
    "indicadorNoHabido",
    "numDocumentoEntidad",
    "razonSocialEntidad",
    "referenciaEntidad"
})
public class Entidad {

    protected int codPaisDocumentoEntidad;
    protected int codTipoDocumentoEntidad;
    protected int codTipoIndicadorNoHabido;
    protected String dscPaisDocumentoEntidad;
    protected String dscTipoDocumentoEntidad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecInicioVigenciaEntidad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecTerminoVigenciaEntidad;
    protected int ideNumericoEntidad;
    protected String indicadorNoHabido;
    protected String numDocumentoEntidad;
    protected String razonSocialEntidad;
    protected String referenciaEntidad;

    /**
     * Obtiene el valor de la propiedad codPaisDocumentoEntidad.
     * 
     */
    public int getCodPaisDocumentoEntidad() {
        return codPaisDocumentoEntidad;
    }

    /**
     * Define el valor de la propiedad codPaisDocumentoEntidad.
     * 
     */
    public void setCodPaisDocumentoEntidad(int value) {
        this.codPaisDocumentoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoDocumentoEntidad.
     * 
     */
    public int getCodTipoDocumentoEntidad() {
        return codTipoDocumentoEntidad;
    }

    /**
     * Define el valor de la propiedad codTipoDocumentoEntidad.
     * 
     */
    public void setCodTipoDocumentoEntidad(int value) {
        this.codTipoDocumentoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoIndicadorNoHabido.
     * 
     */
    public int getCodTipoIndicadorNoHabido() {
        return codTipoIndicadorNoHabido;
    }

    /**
     * Define el valor de la propiedad codTipoIndicadorNoHabido.
     * 
     */
    public void setCodTipoIndicadorNoHabido(int value) {
        this.codTipoIndicadorNoHabido = value;
    }

    /**
     * Obtiene el valor de la propiedad dscPaisDocumentoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscPaisDocumentoEntidad() {
        return dscPaisDocumentoEntidad;
    }

    /**
     * Define el valor de la propiedad dscPaisDocumentoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscPaisDocumentoEntidad(String value) {
        this.dscPaisDocumentoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad dscTipoDocumentoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscTipoDocumentoEntidad() {
        return dscTipoDocumentoEntidad;
    }

    /**
     * Define el valor de la propiedad dscTipoDocumentoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscTipoDocumentoEntidad(String value) {
        this.dscTipoDocumentoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fecInicioVigenciaEntidad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecInicioVigenciaEntidad() {
        return fecInicioVigenciaEntidad;
    }

    /**
     * Define el valor de la propiedad fecInicioVigenciaEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecInicioVigenciaEntidad(XMLGregorianCalendar value) {
        this.fecInicioVigenciaEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fecTerminoVigenciaEntidad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecTerminoVigenciaEntidad() {
        return fecTerminoVigenciaEntidad;
    }

    /**
     * Define el valor de la propiedad fecTerminoVigenciaEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecTerminoVigenciaEntidad(XMLGregorianCalendar value) {
        this.fecTerminoVigenciaEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad ideNumericoEntidad.
     * 
     */
    public int getIdeNumericoEntidad() {
        return ideNumericoEntidad;
    }

    /**
     * Define el valor de la propiedad ideNumericoEntidad.
     * 
     */
    public void setIdeNumericoEntidad(int value) {
        this.ideNumericoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorNoHabido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorNoHabido() {
        return indicadorNoHabido;
    }

    /**
     * Define el valor de la propiedad indicadorNoHabido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorNoHabido(String value) {
        this.indicadorNoHabido = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocumentoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocumentoEntidad() {
        return numDocumentoEntidad;
    }

    /**
     * Define el valor de la propiedad numDocumentoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocumentoEntidad(String value) {
        this.numDocumentoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialEntidad() {
        return razonSocialEntidad;
    }

    /**
     * Define el valor de la propiedad razonSocialEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialEntidad(String value) {
        this.razonSocialEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaEntidad() {
        return referenciaEntidad;
    }

    /**
     * Define el valor de la propiedad referenciaEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaEntidad(String value) {
        this.referenciaEntidad = value;
    }

}
