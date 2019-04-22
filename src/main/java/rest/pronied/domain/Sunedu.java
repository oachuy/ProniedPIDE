package rest.pronied.domain;

import java.util.ArrayList;
import java.util.List;

public class Sunedu {
	
	private SuneduRespuesta suneduRespuesta;
	private SuneduListaGtPersona suneduListaGtPersona;

	public Sunedu() {
		super();

	}

	public Sunedu(SuneduRespuesta suneduRespuesta,
			SuneduListaGtPersona suneduListaGtPersona) {
		super();
		this.suneduRespuesta = suneduRespuesta;
		this.suneduListaGtPersona = suneduListaGtPersona;
	}
	
	public Sunedu(SuneduRespuesta suneduRespuesta){
		super();
		this.suneduRespuesta = suneduRespuesta;
		this.suneduListaGtPersona = null;
	}

	public SuneduRespuesta getSuneduRespuesta() {
		return suneduRespuesta;
	}
	public void setSuneduRespuesta(SuneduRespuesta suneduRespuesta) {
		this.suneduRespuesta = suneduRespuesta;
	}
	public SuneduListaGtPersona getSuneduListaGtPersona() {
		return suneduListaGtPersona;
	}
	public void setSuneduListaGtPersona(SuneduListaGtPersona suneduListaGtPersona) {
		this.suneduListaGtPersona = suneduListaGtPersona;
	}
	@Override
	public String toString() {
		return "Sunedu [suneduRespuesta=" + suneduRespuesta
				+ ", suneduListaGtPersona=" + suneduListaGtPersona + "]";
	}

}

	

