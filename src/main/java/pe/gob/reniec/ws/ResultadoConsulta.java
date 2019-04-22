
package pe.gob.reniec.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadoConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosPersona" type="{http://ws.reniec.gob.pe/}datosPersona" minOccurs="0"/>
 *         &lt;element name="deResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoConsulta", propOrder = {
    "coResultado",
    "datosPersona",
    "deResultado"
})
public class ResultadoConsulta {

    protected String coResultado;
    protected DatosPersona datosPersona;
    protected String deResultado;

    /**
     * Obtiene el valor de la propiedad coResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoResultado() {
        return coResultado;
    }

    /**
     * Define el valor de la propiedad coResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoResultado(String value) {
        this.coResultado = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPersona.
     * 
     * @return
     *     possible object is
     *     {@link DatosPersona }
     *     
     */
    public DatosPersona getDatosPersona() {
        return datosPersona;
    }

    /**
     * Define el valor de la propiedad datosPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPersona }
     *     
     */
    public void setDatosPersona(DatosPersona value) {
        this.datosPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad deResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeResultado() {
        return deResultado;
    }

    /**
     * Define el valor de la propiedad deResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeResultado(String value) {
        this.deResultado = value;
    }

}
