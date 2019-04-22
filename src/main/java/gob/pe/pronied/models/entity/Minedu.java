package gob.pe.pronied.models.entity;

public class Minedu {
	private String Codigo;
	private String Mensaje;
	private String Usuario;
	private String Clave;
	private String IpSistema;
	private String DniConsultado;
	private String apeMatCasMadre;
	private String apeMatMadre;
	private String apeMatPadre;
	private String apePatMadre;
	private String apePatPadre;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String centPobladoDomicilio;
	private String centPobladoNacimiento;
	private String codEstCivil;
	private String codSexo;
	private String contDocumento;
	private String contDomicilio;
	private String contNacimiento;
	private String dirDomicilio;
	private String distDomicilio;
	private String distNacimiento;
	private String dptoDomicilio;
	private String dptoNacimiento;
	private String dscCentPobladoDomicilio;
	private String dscCentPobladoNacimiento;
	private String dscContDomicilio;
	private String dscContNacimiento;
	private String dscDistDomicilio;
	private String dscDistNacimiento;
	private String dscDptoDomicilio;
	private String dscDptoNacimiento;
	private String dscPaisDomicilio;
	private String dscPaisNacimiento;
	private String dscProvDomicilio;
	private String dscProvNacimiento;
	private String fecNacimiento;
	private String nombreMadre;
	private String nombrePadre;
	private String nombres;
	private String numDoc;
	private String pais;
	private String paisDomicilio;
	private String paisNacimiento;
	private String provDomicilio;
	private String provNacimiento;
	private String tipDoc;
	
	public Minedu() {
    }
	
	
	public Minedu(
			String Codigo,
			String Mensaje)
	{
		this.Codigo = Codigo;
		this.Mensaje = Mensaje;
	}
	
	public Minedu(
			String apeMatCasMadre,
			String apeMatMadre,
			String apeMatPadre,
			String apePatMadre,
			String apePatPadre,
			String apellidoMaterno,
			String apellidoPaterno,
			String centPobladoDomicilio,
			String centPobladoNacimiento,
			String codEstCivil,
			String codSexo,
			String contDocumento,
			String contDomicilio,
			String contNacimiento,
			String dirDomicilio,
			String distDomicilio,
			String distNacimiento,
			String dptoDomicilio,
			String dptoNacimiento,
			String dscCentPobladoDomicilio,
			String dscCentPobladoNacimiento,
			String dscContDomicilio,
			String dscContNacimiento,
			String dscDistDomicilio,
			String dscDistNacimiento,
			String dscDptoDomicilio,
			String dscDptoNacimiento,
			String dscPaisDomicilio,
			String dscPaisNacimiento,
			String dscProvDomicilio,
			String dscProvNacimiento,
			String fecNacimiento,
			String nombreMadre,
			String nombrePadre,
			String nombres,
			String numDoc,
			String pais,
			String paisDomicilio,
			String paisNacimiento,
			String provDomicilio,
			String provNacimiento,
			String tipDoc) {
		this.apeMatCasMadre = apeMatCasMadre;
		this.apeMatMadre = apeMatMadre;
		this.apeMatPadre = apeMatPadre;
		this.apePatMadre = apePatMadre;
		this.apePatPadre = apePatPadre;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
		this.centPobladoDomicilio = centPobladoDomicilio;
		this.centPobladoNacimiento = centPobladoNacimiento;
		this.codEstCivil = codEstCivil;
		this.codSexo = codSexo;
		this.contDocumento = contDocumento;
		this.contDomicilio = contDomicilio;
		this.contNacimiento = contNacimiento;
		this.dirDomicilio = dirDomicilio;
		this.distDomicilio = distDomicilio;
		this.distNacimiento = distNacimiento;
		this.dptoDomicilio = dptoDomicilio;
		this.dptoNacimiento = dptoNacimiento;
		this.dscCentPobladoDomicilio = dscCentPobladoDomicilio;
		this.dscCentPobladoNacimiento = dscCentPobladoNacimiento;
		this.dscContDomicilio = dscContDomicilio;
		this.dscContNacimiento = dscContNacimiento;
		this.dscDistDomicilio = dscDistDomicilio;
		this.dscDistNacimiento = dscDistNacimiento;
		this.dscDptoDomicilio = dscDptoDomicilio;
		this.dscDptoNacimiento = dscDptoNacimiento;
		this.dscPaisDomicilio = dscPaisDomicilio;
		this.dscPaisNacimiento = dscPaisNacimiento;
		this.dscProvDomicilio = dscProvDomicilio;
		this.dscProvNacimiento = dscProvNacimiento;
		this.fecNacimiento = fecNacimiento;
		this.nombreMadre = nombreMadre;
		this.nombrePadre = nombrePadre;
		this.nombres = nombres;
		this.numDoc = numDoc;
		this.pais = pais;
		this.paisDomicilio = paisDomicilio;
		this.paisNacimiento = paisNacimiento;
		this.provDomicilio = provDomicilio;
		this.provNacimiento = provNacimiento;
		this.tipDoc = tipDoc;
    }

	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getIpSistema() {
		return IpSistema;
	}
	public void setIpSistema(String ipSistema) {
		IpSistema = ipSistema;
	}
	public String getDniConsultado() {
		return DniConsultado;
	}
	public void setDniConsultado(String dniConsultado) {
		DniConsultado = dniConsultado;
	}
	public String getApeMatCasMadre() {
		return apeMatCasMadre;
	}
	public void setApeMatCasMadre(String apeMatCasMadre) {
		this.apeMatCasMadre = apeMatCasMadre;
	}
	public String getApeMatMadre() {
		return apeMatMadre;
	}
	public void setApeMatMadre(String apeMatMadre) {
		this.apeMatMadre = apeMatMadre;
	}
	public String getApeMatPadre() {
		return apeMatPadre;
	}
	public void setApeMatPadre(String apeMatPadre) {
		this.apeMatPadre = apeMatPadre;
	}
	public String getApePatMadre() {
		return apePatMadre;
	}
	public void setApePatMadre(String apePatMadre) {
		this.apePatMadre = apePatMadre;
	}
	public String getApePatPadre() {
		return apePatPadre;
	}
	public void setApePatPadre(String apePatPadre) {
		this.apePatPadre = apePatPadre;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getCentPobladoDomicilio() {
		return centPobladoDomicilio;
	}
	public void setCentPobladoDomicilio(String centPobladoDomicilio) {
		this.centPobladoDomicilio = centPobladoDomicilio;
	}
	public String getCentPobladoNacimiento() {
		return centPobladoNacimiento;
	}
	public void setCentPobladoNacimiento(String centPobladoNacimiento) {
		this.centPobladoNacimiento = centPobladoNacimiento;
	}
	public String getCodEstCivil() {
		return codEstCivil;
	}
	public void setCodEstCivil(String codEstCivil) {
		this.codEstCivil = codEstCivil;
	}
	public String getCodSexo() {
		return codSexo;
	}
	public void setCodSexo(String codSexo) {
		this.codSexo = codSexo;
	}
	public String getContDocumento() {
		return contDocumento;
	}
	public void setContDocumento(String contDocumento) {
		this.contDocumento = contDocumento;
	}
	public String getContDomicilio() {
		return contDomicilio;
	}
	public void setContDomicilio(String contDomicilio) {
		this.contDomicilio = contDomicilio;
	}
	public String getContNacimiento() {
		return contNacimiento;
	}
	public void setContNacimiento(String contNacimiento) {
		this.contNacimiento = contNacimiento;
	}
	public String getDirDomicilio() {
		return dirDomicilio;
	}
	public void setDirDomicilio(String dirDomicilio) {
		this.dirDomicilio = dirDomicilio;
	}
	public String getDistDomicilio() {
		return distDomicilio;
	}
	public void setDistDomicilio(String distDomicilio) {
		this.distDomicilio = distDomicilio;
	}
	public String getDistNacimiento() {
		return distNacimiento;
	}
	public void setDistNacimiento(String distNacimiento) {
		this.distNacimiento = distNacimiento;
	}
	public String getDptoDomicilio() {
		return dptoDomicilio;
	}
	public void setDptoDomicilio(String dptoDomicilio) {
		this.dptoDomicilio = dptoDomicilio;
	}
	public String getDptoNacimiento() {
		return dptoNacimiento;
	}
	public void setDptoNacimiento(String dptoNacimiento) {
		this.dptoNacimiento = dptoNacimiento;
	}
	public String getDscCentPobladoDomicilio() {
		return dscCentPobladoDomicilio;
	}
	public void setDscCentPobladoDomicilio(String dscCentPobladoDomicilio) {
		this.dscCentPobladoDomicilio = dscCentPobladoDomicilio;
	}
	public String getDscCentPobladoNacimiento() {
		return dscCentPobladoNacimiento;
	}
	public void setDscCentPobladoNacimiento(String dscCentPobladoNacimiento) {
		this.dscCentPobladoNacimiento = dscCentPobladoNacimiento;
	}
	public String getDscContDomicilio() {
		return dscContDomicilio;
	}
	public void setDscContDomicilio(String dscContDomicilio) {
		this.dscContDomicilio = dscContDomicilio;
	}
	public String getDscContNacimiento() {
		return dscContNacimiento;
	}
	public void setDscContNacimiento(String dscContNacimiento) {
		this.dscContNacimiento = dscContNacimiento;
	}
	public String getDscDistDomicilio() {
		return dscDistDomicilio;
	}
	public void setDscDistDomicilio(String dscDistDomicilio) {
		this.dscDistDomicilio = dscDistDomicilio;
	}
	public String getDscDistNacimiento() {
		return dscDistNacimiento;
	}
	public void setDscDistNacimiento(String dscDistNacimiento) {
		this.dscDistNacimiento = dscDistNacimiento;
	}
	public String getDscDptoDomicilio() {
		return dscDptoDomicilio;
	}
	public void setDscDptoDomicilio(String dscDptoDomicilio) {
		this.dscDptoDomicilio = dscDptoDomicilio;
	}
	public String getDscDptoNacimiento() {
		return dscDptoNacimiento;
	}
	public void setDscDptoNacimiento(String dscDptoNacimiento) {
		this.dscDptoNacimiento = dscDptoNacimiento;
	}
	public String getDscPaisDomicilio() {
		return dscPaisDomicilio;
	}
	public void setDscPaisDomicilio(String dscPaisDomicilio) {
		this.dscPaisDomicilio = dscPaisDomicilio;
	}
	public String getDscPaisNacimiento() {
		return dscPaisNacimiento;
	}
	public void setDscPaisNacimiento(String dscPaisNacimiento) {
		this.dscPaisNacimiento = dscPaisNacimiento;
	}
	public String getDscProvDomicilio() {
		return dscProvDomicilio;
	}
	public void setDscProvDomicilio(String dscProvDomicilio) {
		this.dscProvDomicilio = dscProvDomicilio;
	}
	public String getDscProvNacimiento() {
		return dscProvNacimiento;
	}
	public void setDscProvNacimiento(String dscProvNacimiento) {
		this.dscProvNacimiento = dscProvNacimiento;
	}
	public String getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPaisDomicilio() {
		return paisDomicilio;
	}
	public void setPaisDomicilio(String paisDomicilio) {
		this.paisDomicilio = paisDomicilio;
	}
	public String getPaisNacimiento() {
		return paisNacimiento;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}
	public String getProvDomicilio() {
		return provDomicilio;
	}
	public void setProvDomicilio(String provDomicilio) {
		this.provDomicilio = provDomicilio;
	}
	public String getProvNacimiento() {
		return provNacimiento;
	}
	public void setProvNacimiento(String provNacimiento) {
		this.provNacimiento = provNacimiento;
	}
	public String getTipDoc() {
		return tipDoc;
	}
	public void setTipDoc(String tipDoc) {
		this.tipDoc = tipDoc;
	}
	
	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}

	/*@Override
    public String toString() {
        return "Minedu{" + 
        		"apeMatCasMadre=" + apeMatCasMadre + 
        		", apeMatMadre=" + apeMatMadre + 
        		", apeMatPadre="+apeMatPadre +
        		", apePatMadre="+apePatMadre +
        		", apePatPadre="+apePatPadre +
        		", apellidoMaterno="+apellidoMaterno +
        		", apellidoPaterno="+apellidoPaterno +
        		", centPobladoDomicilio="+centPobladoDomicilio +
        		", centPobladoNacimiento="+centPobladoNacimiento +
        		", codEstCivil="+codEstCivil +
        		", codSexo="+codSexo +
        		", contDocumento="+contDocumento +
        		", contDomicilio="+contDomicilio +
        		", contNacimiento="+contNacimiento +
        		", dirDomicilio="+dirDomicilio +
        		", distDomicilio="+distDomicilio +
        		", distNacimiento="+distNacimiento +
        		", dptoDomicilio="+dptoDomicilio +
        		", dptoNacimiento="+dptoNacimiento +
        		", dscCentPobladoDomicilio="+dscCentPobladoDomicilio +
        		", dscCentPobladoNacimiento="+dscCentPobladoNacimiento +
        		", dscContDomicilio="+dscContDomicilio +
        		", dscContNacimiento="+dscContNacimiento +
        		", dscDistDomicilio="+dscDistDomicilio +
        		", dscDistNacimiento="+dscDistNacimiento +
        		", dscDptoDomicilio="+dscDptoDomicilio +
        		", dscDptoNacimiento="+dscDptoNacimiento +
        		", dscPaisDomicilio="+dscPaisDomicilio +
        		", dscPaisNacimiento="+dscPaisNacimiento +
        		", dscProvDomicilio="+dscProvDomicilio +
        		", dscProvNacimiento="+dscProvNacimiento +
        		", fecNacimiento="+fecNacimiento +
        		", nombreMadre="+nombreMadre +
        		", nombrePadre="+nombrePadre +
        		", nombres="+nombres +
        		", numDoc="+numDoc +
        		", pais="+pais +
        		", paisDomicilio="+paisDomicilio +
        		", paisNacimiento="+paisNacimiento +
        		", provDomicilio="+provDomicilio +
        		", provNacimiento="+provNacimiento +
        		", tipDoc="+tipDoc + '}';
    }*/
	
}
