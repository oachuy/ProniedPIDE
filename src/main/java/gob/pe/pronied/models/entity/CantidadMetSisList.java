package gob.pe.pronied.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CantidadMetSisList {

	@XmlElement(name="cantidad")
	private List<CantidadMetodoSistema> cntMetList = new ArrayList<CantidadMetodoSistema>();

	public List<CantidadMetodoSistema> getCntMetList() {
		return cntMetList;
	}

	public void setCntMetList(List<CantidadMetodoSistema> cntMetList) {
		this.cntMetList = cntMetList;
	}

	@Override
	public String toString() {
		return "CantidadMetSisList [cntMetList=" + cntMetList.get(0).getCantidad() + "]";
	}
	
}
