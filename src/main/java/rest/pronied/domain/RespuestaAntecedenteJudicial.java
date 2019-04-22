package rest.pronied.domain;

public class RespuestaAntecedenteJudicial {
	
	String Respuesta;
    
	public RespuestaAntecedenteJudicial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaAntecedenteJudicial(String respuesta) {
		super();
		Respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "RespuestaAntecedenteJudicial [Respuesta=" + Respuesta + "]";
	}

	public String getRespuesta() {
		return Respuesta;
	}

	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}

}
