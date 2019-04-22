package gob.pe.pronied.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pideconsultalog" ,schema="pide")
public class Pide implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpideconsultalog")
	private Long id;
	
	@Column(name = "metodoconsultado")
	private String metodoconsultado;
	
	@Column(name = "idsistema")
	private int IdSistema;
	
	@Column(name = "dniusuario")
	private String dniusuario;
	
	@Column(name = "dniconsultado")
	private String dniconsultado;
	
	@Column(name = "resultado")
	private String resultado;
	
	@Column(name = "desresultado")
	private String desresultado;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaconsulta")
	private Date fechaconsulta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMetodoconsultado() {
		return metodoconsultado;
	}

	public void setMetodoconsultado(String metodoconsultado) {
		this.metodoconsultado = metodoconsultado;
	}

	public int getIdSistema() {
		return IdSistema;
	}

	public void setIdSistema(int idSistema) {
		IdSistema = idSistema;
	}

	public String getDniusuario() {
		return dniusuario;
	}

	public void setDniusuario(String dniusuario) {
		this.dniusuario = dniusuario;
	}

	public String getDniconsultado() {
		return dniconsultado;
	}

	public void setDniconsultado(String dniconsultado) {
		this.dniconsultado = dniconsultado;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	
	public String getDesresultado() {
		return desresultado;
	}

	public void setDesresultado(String desresultado) {
		this.desresultado = desresultado;
	}

	public Date getFechaconsulta() {
		return fechaconsulta;
	}

	public void setFechaconsulta(Date fechaconsulta) {
		this.fechaconsulta = fechaconsulta;
	}

	@Override
	public String toString() {
		return "Pide [id=" + id + ", metodoconsultado=" + metodoconsultado + ", IdSistema=" + IdSistema
				+ ", dniusuario=" + dniusuario + ", dniconsultado=" + dniconsultado + ", resultado=" + resultado
				+ ", fechaconsulta=" + fechaconsulta + "]";
	}

    
	
}
