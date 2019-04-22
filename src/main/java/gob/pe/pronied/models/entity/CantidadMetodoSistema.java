package gob.pe.pronied.models.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CantidadMetodoSistema {
	
	int IdSistema;
	String descripcion;
	String Metodo;
	int cantidad;

	public CantidadMetodoSistema(int idSistema, String descripcion, String metodo, int cantidad) {

		this.IdSistema = idSistema;
		this.descripcion = descripcion;
	    this.Metodo = metodo;
		this.cantidad = cantidad;
	}

	public CantidadMetodoSistema() {
		super();
	}
	
	@XmlElement
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@XmlElement
	public String getMetodo() {
		return Metodo;
	}
	
	public void setMetodo(String metodo) {
		Metodo = metodo;
	}
	
	@XmlElement
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@XmlElement
	public int getIdSistema() {
		return IdSistema;
	}
	public void setIdSistema(int idSistema) {
		IdSistema = idSistema;
	}
	
	@Override
	public String toString() {
		return "CantidadMetodoSistema [Metodo=" + Metodo + ", cantidad=" + cantidad + ", IdSistema=" + IdSistema + "]";
	}
	
}
