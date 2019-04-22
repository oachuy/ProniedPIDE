package rest.pronied.domain;

public class SuneduGtPersona {
	
	private String tipoDocumento;
	private String nroDocumento;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres;
	private String abreviaturaTitulo;
	private String tituloProfesional;
	private String universidad;
	private String pais;
	private String tipoInstitucion;
	private String tipoGestion;
	private String fechaEmision;
	private String resolucion;
	private String fechaResolucion;
	
	
	
	public SuneduGtPersona() {
		super();
	}
	
	
	
	public SuneduGtPersona(String tipoDocumento, String nroDocumento,
			String apellidoPaterno, String apellidoMaterno, String nombres,
			String abreviaturaTitulo, String tituloProfesional,
			String universidad, String pais, String tipoInstitucion,
			String tipoGestion, String fechaEmision, String resolucion,
			String fechaResolucion) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombres = nombres;
		this.abreviaturaTitulo = abreviaturaTitulo;
		this.tituloProfesional = tituloProfesional;
		this.universidad = universidad;
		this.pais = pais;
		this.tipoInstitucion = tipoInstitucion;
		this.tipoGestion = tipoGestion;
		this.fechaEmision = fechaEmision;
		this.resolucion = resolucion;
		this.fechaResolucion = fechaResolucion;
	}



	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getAbreviaturaTitulo() {
		return abreviaturaTitulo;
	}
	public void setAbreviaturaTitulo(String abreviaturaTitulo) {
		this.abreviaturaTitulo = abreviaturaTitulo;
	}
	public String getTituloProfesional() {
		return tituloProfesional;
	}
	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTipoInstitucion() {
		return tipoInstitucion;
	}
	public void setTipoInstitucion(String tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}
	public String getTipoGestion() {
		return tipoGestion;
	}
	public void setTipoGestion(String tipoGestion) {
		this.tipoGestion = tipoGestion;
	}
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getFechaResolucion() {
		return fechaResolucion;
	}
	public void setFechaResolucion(String fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}
	@Override
	public String toString() {
		return "SuneduGtPersona [tipoDocumento=" + tipoDocumento
				+ ", nroDocumento=" + nroDocumento + ", apellidoPaterno="
				+ apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombres=" + nombres + ", abreviaturaTitulo="
				+ abreviaturaTitulo + ", tituloProfesional="
				+ tituloProfesional + ", universidad=" + universidad
				+ ", pais=" + pais + ", tipoInstitucion=" + tipoInstitucion
				+ ", tipoGestion=" + tipoGestion + ", fechaEmision="
				+ fechaEmision + ", resolucion=" + resolucion
				+ ", fechaResolucion=" + fechaResolucion + "]";
	}
	
	
}
