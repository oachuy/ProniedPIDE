package gob.pe.pronied.models.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CantidadMetodo {
	String metodoConsultado;
	int cantidad;
	
	public CantidadMetodo(String metodoConsultado, int cantidad) {
		this.metodoConsultado = metodoConsultado;
		this.cantidad = cantidad;
	}

	@XmlElement
	public String getMetodoConsultado() {
		return metodoConsultado;
	}

	public void setMetodoConsultado(String metodoConsultado) {
		this.metodoConsultado = metodoConsultado;
	}

	@XmlElement
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "CantidadMetodo [metodoConsultado=" + metodoConsultado + ", cantidad=" + cantidad + "]";
	}
	
	
	

}
