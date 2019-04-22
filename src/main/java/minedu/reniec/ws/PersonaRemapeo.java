
package minedu.reniec.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para personaRemapeo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personaRemapeo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apeMatCasMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apeMatMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apeMatPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apePatMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apePatPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centPobladoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centPobladoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEstCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUbgNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dptoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dptoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscCentPobladoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscCentPobladoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscContDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscContNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscDistDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscDistNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscDptoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscDptoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscPaisDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscPaisNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscProvDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscProvNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecFallecimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecRegSistema" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horaRegSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUsrSistema" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ipSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDocMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDocPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipDocMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipDocPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personaRemapeo", propOrder = {
    "apeMatCasMadre",
    "apeMatMadre",
    "apeMatPadre",
    "apePatMadre",
    "apePatPadre",
    "apellidoMaterno",
    "apellidoPaterno",
    "centPobladoDomicilio",
    "centPobladoNacimiento",
    "codEstCivil",
    "codSexo",
    "codUbgNac",
    "contDocumento",
    "contDomicilio",
    "contNacimiento",
    "dirDomicilio",
    "distDomicilio",
    "distNacimiento",
    "dptoDomicilio",
    "dptoNacimiento",
    "dscCentPobladoDomicilio",
    "dscCentPobladoNacimiento",
    "dscContDomicilio",
    "dscContNacimiento",
    "dscDistDomicilio",
    "dscDistNacimiento",
    "dscDptoDomicilio",
    "dscDptoNacimiento",
    "dscPaisDomicilio",
    "dscPaisNacimiento",
    "dscProvDomicilio",
    "dscProvNacimiento",
    "estado",
    "fecFallecimiento",
    "fecNacimiento",
    "fecRegSistema",
    "horaRegSistema",
    "idUsrSistema",
    "ipSistema",
    "nombreMadre",
    "nombrePadre",
    "nombres",
    "nroDocMadre",
    "nroDocPadre",
    "numDoc",
    "pais",
    "paisDomicilio",
    "paisNacimiento",
    "provDomicilio",
    "provNacimiento",
    "tipDoc",
    "tipDocMadre",
    "tipDocPadre",
    "tipoResultado"
})
public class PersonaRemapeo {

    protected String apeMatCasMadre;
    protected String apeMatMadre;
    protected String apeMatPadre;
    protected String apePatMadre;
    protected String apePatPadre;
    protected String apellidoMaterno;
    protected String apellidoPaterno;
    protected String centPobladoDomicilio;
    protected String centPobladoNacimiento;
    protected String codEstCivil;
    protected String codSexo;
    protected String codUbgNac;
    protected String contDocumento;
    protected String contDomicilio;
    protected String contNacimiento;
    protected String dirDomicilio;
    protected String distDomicilio;
    protected String distNacimiento;
    protected String dptoDomicilio;
    protected String dptoNacimiento;
    protected String dscCentPobladoDomicilio;
    protected String dscCentPobladoNacimiento;
    protected String dscContDomicilio;
    protected String dscContNacimiento;
    protected String dscDistDomicilio;
    protected String dscDistNacimiento;
    protected String dscDptoDomicilio;
    protected String dscDptoNacimiento;
    protected String dscPaisDomicilio;
    protected String dscPaisNacimiento;
    protected String dscProvDomicilio;
    protected String dscProvNacimiento;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecFallecimiento;
    protected String fecNacimiento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecRegSistema;
    protected String horaRegSistema;
    protected int idUsrSistema;
    protected String ipSistema;
    protected String nombreMadre;
    protected String nombrePadre;
    protected String nombres;
    protected String nroDocMadre;
    protected String nroDocPadre;
    protected String numDoc;
    protected String pais;
    protected String paisDomicilio;
    protected String paisNacimiento;
    protected String provDomicilio;
    protected String provNacimiento;
    protected String tipDoc;
    protected String tipDocMadre;
    protected String tipDocPadre;
    protected String tipoResultado;

    /**
     * Obtiene el valor de la propiedad apeMatCasMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeMatCasMadre() {
        return apeMatCasMadre;
    }

    /**
     * Define el valor de la propiedad apeMatCasMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeMatCasMadre(String value) {
        this.apeMatCasMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad apeMatMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeMatMadre() {
        return apeMatMadre;
    }

    /**
     * Define el valor de la propiedad apeMatMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeMatMadre(String value) {
        this.apeMatMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad apeMatPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeMatPadre() {
        return apeMatPadre;
    }

    /**
     * Define el valor de la propiedad apeMatPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeMatPadre(String value) {
        this.apeMatPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad apePatMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApePatMadre() {
        return apePatMadre;
    }

    /**
     * Define el valor de la propiedad apePatMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApePatMadre(String value) {
        this.apePatMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad apePatPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApePatPadre() {
        return apePatPadre;
    }

    /**
     * Define el valor de la propiedad apePatPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApePatPadre(String value) {
        this.apePatPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Define el valor de la propiedad apellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Define el valor de la propiedad apellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad centPobladoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentPobladoDomicilio() {
        return centPobladoDomicilio;
    }

    /**
     * Define el valor de la propiedad centPobladoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentPobladoDomicilio(String value) {
        this.centPobladoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad centPobladoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentPobladoNacimiento() {
        return centPobladoNacimiento;
    }

    /**
     * Define el valor de la propiedad centPobladoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentPobladoNacimiento(String value) {
        this.centPobladoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstCivil() {
        return codEstCivil;
    }

    /**
     * Define el valor de la propiedad codEstCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstCivil(String value) {
        this.codEstCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad codSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSexo() {
        return codSexo;
    }

    /**
     * Define el valor de la propiedad codSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSexo(String value) {
        this.codSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad codUbgNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUbgNac() {
        return codUbgNac;
    }

    /**
     * Define el valor de la propiedad codUbgNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUbgNac(String value) {
        this.codUbgNac = value;
    }

    /**
     * Obtiene el valor de la propiedad contDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContDocumento() {
        return contDocumento;
    }

    /**
     * Define el valor de la propiedad contDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContDocumento(String value) {
        this.contDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad contDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContDomicilio() {
        return contDomicilio;
    }

    /**
     * Define el valor de la propiedad contDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContDomicilio(String value) {
        this.contDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad contNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContNacimiento() {
        return contNacimiento;
    }

    /**
     * Define el valor de la propiedad contNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContNacimiento(String value) {
        this.contNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dirDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirDomicilio() {
        return dirDomicilio;
    }

    /**
     * Define el valor de la propiedad dirDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirDomicilio(String value) {
        this.dirDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad distDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistDomicilio() {
        return distDomicilio;
    }

    /**
     * Define el valor de la propiedad distDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistDomicilio(String value) {
        this.distDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad distNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistNacimiento() {
        return distNacimiento;
    }

    /**
     * Define el valor de la propiedad distNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistNacimiento(String value) {
        this.distNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dptoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDptoDomicilio() {
        return dptoDomicilio;
    }

    /**
     * Define el valor de la propiedad dptoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDptoDomicilio(String value) {
        this.dptoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad dptoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDptoNacimiento() {
        return dptoNacimiento;
    }

    /**
     * Define el valor de la propiedad dptoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDptoNacimiento(String value) {
        this.dptoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dscCentPobladoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscCentPobladoDomicilio() {
        return dscCentPobladoDomicilio;
    }

    /**
     * Define el valor de la propiedad dscCentPobladoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscCentPobladoDomicilio(String value) {
        this.dscCentPobladoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad dscCentPobladoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscCentPobladoNacimiento() {
        return dscCentPobladoNacimiento;
    }

    /**
     * Define el valor de la propiedad dscCentPobladoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscCentPobladoNacimiento(String value) {
        this.dscCentPobladoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dscContDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscContDomicilio() {
        return dscContDomicilio;
    }

    /**
     * Define el valor de la propiedad dscContDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscContDomicilio(String value) {
        this.dscContDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad dscContNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscContNacimiento() {
        return dscContNacimiento;
    }

    /**
     * Define el valor de la propiedad dscContNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscContNacimiento(String value) {
        this.dscContNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dscDistDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscDistDomicilio() {
        return dscDistDomicilio;
    }

    /**
     * Define el valor de la propiedad dscDistDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscDistDomicilio(String value) {
        this.dscDistDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad dscDistNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscDistNacimiento() {
        return dscDistNacimiento;
    }

    /**
     * Define el valor de la propiedad dscDistNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscDistNacimiento(String value) {
        this.dscDistNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dscDptoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscDptoDomicilio() {
        return dscDptoDomicilio;
    }

    /**
     * Define el valor de la propiedad dscDptoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscDptoDomicilio(String value) {
        this.dscDptoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad dscDptoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscDptoNacimiento() {
        return dscDptoNacimiento;
    }

    /**
     * Define el valor de la propiedad dscDptoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscDptoNacimiento(String value) {
        this.dscDptoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dscPaisDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscPaisDomicilio() {
        return dscPaisDomicilio;
    }

    /**
     * Define el valor de la propiedad dscPaisDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscPaisDomicilio(String value) {
        this.dscPaisDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad dscPaisNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscPaisNacimiento() {
        return dscPaisNacimiento;
    }

    /**
     * Define el valor de la propiedad dscPaisNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscPaisNacimiento(String value) {
        this.dscPaisNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dscProvDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscProvDomicilio() {
        return dscProvDomicilio;
    }

    /**
     * Define el valor de la propiedad dscProvDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscProvDomicilio(String value) {
        this.dscProvDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad dscProvNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscProvNacimiento() {
        return dscProvNacimiento;
    }

    /**
     * Define el valor de la propiedad dscProvNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscProvNacimiento(String value) {
        this.dscProvNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecFallecimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecFallecimiento() {
        return fecFallecimiento;
    }

    /**
     * Define el valor de la propiedad fecFallecimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecFallecimiento(XMLGregorianCalendar value) {
        this.fecFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fecNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecNacimiento() {
        return fecNacimiento;
    }

    /**
     * Define el valor de la propiedad fecNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecNacimiento(String value) {
        this.fecNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fecRegSistema.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecRegSistema() {
        return fecRegSistema;
    }

    /**
     * Define el valor de la propiedad fecRegSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecRegSistema(XMLGregorianCalendar value) {
        this.fecRegSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad horaRegSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraRegSistema() {
        return horaRegSistema;
    }

    /**
     * Define el valor de la propiedad horaRegSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraRegSistema(String value) {
        this.horaRegSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsrSistema.
     * 
     */
    public int getIdUsrSistema() {
        return idUsrSistema;
    }

    /**
     * Define el valor de la propiedad idUsrSistema.
     * 
     */
    public void setIdUsrSistema(int value) {
        this.idUsrSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad ipSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpSistema() {
        return ipSistema;
    }

    /**
     * Define el valor de la propiedad ipSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpSistema(String value) {
        this.ipSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMadre() {
        return nombreMadre;
    }

    /**
     * Define el valor de la propiedad nombreMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMadre(String value) {
        this.nombreMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePadre() {
        return nombrePadre;
    }

    /**
     * Define el valor de la propiedad nombrePadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePadre(String value) {
        this.nombrePadre = value;
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

    /**
     * Obtiene el valor de la propiedad nroDocMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocMadre() {
        return nroDocMadre;
    }

    /**
     * Define el valor de la propiedad nroDocMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocMadre(String value) {
        this.nroDocMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocPadre() {
        return nroDocPadre;
    }

    /**
     * Define el valor de la propiedad nroDocPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocPadre(String value) {
        this.nroDocPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad numDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Define el valor de la propiedad numDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDoc(String value) {
        this.numDoc = value;
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
     * Obtiene el valor de la propiedad paisDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDomicilio() {
        return paisDomicilio;
    }

    /**
     * Define el valor de la propiedad paisDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDomicilio(String value) {
        this.paisDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad paisNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * Define el valor de la propiedad paisNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNacimiento(String value) {
        this.paisNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad provDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvDomicilio() {
        return provDomicilio;
    }

    /**
     * Define el valor de la propiedad provDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvDomicilio(String value) {
        this.provDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad provNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvNacimiento() {
        return provNacimiento;
    }

    /**
     * Define el valor de la propiedad provNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvNacimiento(String value) {
        this.provNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipDoc() {
        return tipDoc;
    }

    /**
     * Define el valor de la propiedad tipDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipDoc(String value) {
        this.tipDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tipDocMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipDocMadre() {
        return tipDocMadre;
    }

    /**
     * Define el valor de la propiedad tipDocMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipDocMadre(String value) {
        this.tipDocMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipDocPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipDocPadre() {
        return tipDocPadre;
    }

    /**
     * Define el valor de la propiedad tipDocPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipDocPadre(String value) {
        this.tipDocPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoResultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoResultado() {
        return tipoResultado;
    }

    /**
     * Define el valor de la propiedad tipoResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoResultado(String value) {
        this.tipoResultado = value;
    }

}
