package rest.pronied.domain;

public class ReniecConsultarResponse {
	
	private String coResultado;
	private ReniecDatosPersona reniecDatosPersona;
	private String deResultado;
	
	
	
	public ReniecConsultarResponse() {
		super();
	}

	public ReniecConsultarResponse(String coResultado,
			ReniecDatosPersona reniecDatosPersona, String deResultado) {
		super();
		this.coResultado = coResultado;
		this.reniecDatosPersona = reniecDatosPersona;
		this.deResultado = deResultado;
	}

	public String getCoResultado() {
		return coResultado;
	}
	public void setCoResultado(String coResultado) {
		this.coResultado = coResultado;
	}
	public ReniecDatosPersona getReniecDatosPersona() {
		return reniecDatosPersona;
	}
	public void setReniecDatosPersona(ReniecDatosPersona reniecDatosPersona) {
		this.reniecDatosPersona = reniecDatosPersona;
	}
	public String getDeResultado() {
		return deResultado;
	}
	public void setDeResultado(String deResultado) {
		this.deResultado = deResultado;
	}

	@Override
	public String toString() {
		return "ReniecConsultarResponse [coResultado=" + coResultado
				+ ", reniecDatosPersona=" + reniecDatosPersona
				+ ", deResultado=" + deResultado + "]";
	}
}
