package rest.pronied.domain;

public class SuneduRespuesta {
    private String fechaSunedu;
    private String horaSunedu;
    private String cGenerico;
    private String dGenerico;
    
	public SuneduRespuesta() {
		super();
	}
	

	public SuneduRespuesta(String fechaSunedu, String horaSunedu,
			String cGenerico, String dGenerico) {
		super();
		this.fechaSunedu = fechaSunedu;
		this.horaSunedu = horaSunedu;
		this.cGenerico = cGenerico;
		this.dGenerico = dGenerico;
	}




	public String getFechaSunedu() {
		return fechaSunedu;
	}
	public void setFechaSunedu(String fechaSunedu) {
		this.fechaSunedu = fechaSunedu;
	}
	public String getHoraSunedu() {
		return horaSunedu;
	}
	public void setHoraSunedu(String horaSunedu) {
		this.horaSunedu = horaSunedu;
	}
	public String getcGenerico() {
		return cGenerico;
	}
	public void setcGenerico(String cGenerico) {
		this.cGenerico = cGenerico;
	}
	public String getdGenerico() {
		return dGenerico;
	}
	public void setdGenerico(String dGenerico) {
		this.dGenerico = dGenerico;
	}
	@Override
	public String toString() {
		return "SuneduRespuesta [fechaSunedu=" + fechaSunedu + ", horaSunedu="
				+ horaSunedu + ", cGenerico=" + cGenerico + ", dGenerico="
				+ dGenerico + "]";
	}
    
    
}
