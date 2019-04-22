package rest.pronied.domain;

import java.util.Arrays;

public class ReniecDatosPersona {
	
	private String apPrimer;
	private String apSegundo;
	private String direccion;
	private String estadoCivil;
	private byte[] foto;
	private String prenombres;
	private String restriccion;
	private String ubigeo;
	
	
	
	public ReniecDatosPersona() {
		super();
		
	}
	
	
	
	public ReniecDatosPersona(String apPrimer, String apSegundo,
			String direccion, String estadoCivil, byte[] foto,
			String prenombres, String restriccion, String ubigeo) {
		super();
		this.apPrimer = apPrimer;
		this.apSegundo = apSegundo;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.foto = foto;
		this.prenombres = prenombres;
		this.restriccion = restriccion;
		this.ubigeo = ubigeo;
	}



	public String getApPrimer() {
		return apPrimer;
	}
	public void setApPrimer(String apPrimer) {
		this.apPrimer = apPrimer;
	}
	public String getApSegundo() {
		return apSegundo;
	}
	public void setApSegundo(String apSegundo) {
		this.apSegundo = apSegundo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getPrenombres() {
		return prenombres;
	}
	public void setPrenombres(String prenombres) {
		this.prenombres = prenombres;
	}
	public String getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(String restriccion) {
		this.restriccion = restriccion;
	}
	public String getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}



	@Override
	public String toString() {
		return "ReniecDatosPersona [apPrimer=" + apPrimer + ", apSegundo="
				+ apSegundo + ", direccion=" + direccion + ", estadoCivil="
				+ estadoCivil + ", foto=" + Arrays.toString(foto)
				+ ", prenombres=" + prenombres + ", restriccion=" + restriccion
				+ ", ubigeo=" + ubigeo + "]";
	}
	
	

}
