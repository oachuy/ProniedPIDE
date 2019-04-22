package gob.pe.pronied.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CantidadMetodoList {
	
	@XmlElement
	private List<CantidadMetodo> cntMetodoList = new ArrayList<CantidadMetodo>();

	public List<CantidadMetodo> getCntMetodoList() {
		return cntMetodoList;
	}

	public void setCntMetodoList(List<CantidadMetodo> cntMetodoList) {
		this.cntMetodoList = cntMetodoList;
	}
    
}
