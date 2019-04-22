
package minedu.reniec.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarExtranjero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarExtranjero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipsistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="continente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarExtranjero", propOrder = {
    "usuario",
    "clave",
    "ipsistema",
    "continente",
    "pais",
    "tipdoc",
    "numdoc"
})
public class BuscarExtranjero {

    protected String usuario;
    protected String clave;
    protected String ipsistema;
    protected String continente;
    protected String pais;
    protected String tipdoc;
    protected String numdoc;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad ipsistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsistema() {
        return ipsistema;
    }

    /**
     * Define el valor de la propiedad ipsistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsistema(String value) {
        this.ipsistema = value;
    }

    /**
     * Obtiene el valor de la propiedad continente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinente() {
        return continente;
    }

    /**
     * Define el valor de la propiedad continente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinente(String value) {
        this.continente = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad tipdoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipdoc() {
        return tipdoc;
    }

    /**
     * Define el valor de la propiedad tipdoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipdoc(String value) {
        this.tipdoc = value;
    }

    /**
     * Obtiene el valor de la propiedad numdoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumdoc() {
        return numdoc;
    }

    /**
     * Define el valor de la propiedad numdoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumdoc(String value) {
        this.numdoc = value;
    }

}
