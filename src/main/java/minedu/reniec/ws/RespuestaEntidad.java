
package minedu.reniec.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaEntidad">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.reniec.minedu/}respuesta">
 *       &lt;sequence>
 *         &lt;element name="entidad" type="{http://ws.reniec.minedu/}entidad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaEntidad", propOrder = {
    "entidad"
})
public class RespuestaEntidad
    extends Respuesta
{

    protected Entidad entidad;

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link Entidad }
     *     
     */
    public Entidad getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidad }
     *     
     */
    public void setEntidad(Entidad value) {
        this.entidad = value;
    }

}
