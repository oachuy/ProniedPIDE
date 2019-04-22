
package pe.gob.inpe.wsantjudiciales.endpoint;

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
 *         &lt;element name="apepat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apemat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "apepat",
    "apemat",
    "nombres"
})
@XmlRootElement(name = "getAntecedenteJudicial")
public class GetAntecedenteJudicial {

    @XmlElement(required = true)
    protected String apepat;
    @XmlElement(required = true)
    protected String apemat;
    @XmlElement(required = true)
    protected String nombres;

    /**
     * Obtiene el valor de la propiedad apepat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApepat() {
        return apepat;
    }

    /**
     * Define el valor de la propiedad apepat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApepat(String value) {
        this.apepat = value;
    }

    /**
     * Obtiene el valor de la propiedad apemat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApemat() {
        return apemat;
    }

    /**
     * Define el valor de la propiedad apemat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApemat(String value) {
        this.apemat = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

}
