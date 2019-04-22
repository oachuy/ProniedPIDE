
package minedu.reniec.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaReniecRemapeo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaReniecRemapeo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.reniec.minedu/}respuesta">
 *       &lt;sequence>
 *         &lt;element name="persona" type="{http://ws.reniec.minedu/}personaRemapeo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaReniecRemapeo", propOrder = {
    "persona"
})
public class RespuestaReniecRemapeo
    extends Respuesta
{

    protected PersonaRemapeo persona;

    /**
     * Obtiene el valor de la propiedad persona.
     * 
     * @return
     *     possible object is
     *     {@link PersonaRemapeo }
     *     
     */
    public PersonaRemapeo getPersona() {
        return persona;
    }

    /**
     * Define el valor de la propiedad persona.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaRemapeo }
     *     
     */
    public void setPersona(PersonaRemapeo value) {
        this.persona = value;
    }

}
