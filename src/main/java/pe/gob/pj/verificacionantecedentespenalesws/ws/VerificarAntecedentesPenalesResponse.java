
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
 *         &lt;element name="xCodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xMensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "xCodigoRespuesta",
    "xMensajeRespuesta"
})
@XmlRootElement(name = "verificarAntecedentesPenalesResponse")
public class VerificarAntecedentesPenalesResponse {

    @XmlElement(required = true)
    protected String xCodigoRespuesta;
    @XmlElement(required = true)
    protected String xMensajeRespuesta;

    /**
     * Obtiene el valor de la propiedad xCodigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCodigoRespuesta() {
        return xCodigoRespuesta;
    }

    /**
     * Define el valor de la propiedad xCodigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCodigoRespuesta(String value) {
        this.xCodigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad xMensajeRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMensajeRespuesta() {
        return xMensajeRespuesta;
    }

    /**
     * Define el valor de la propiedad xMensajeRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMensajeRespuesta(String value) {
        this.xMensajeRespuesta = value;
    }

}
