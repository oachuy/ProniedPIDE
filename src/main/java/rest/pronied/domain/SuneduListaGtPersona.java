package rest.pronied.domain;

import java.util.ArrayList;


public class SuneduListaGtPersona {
	private ArrayList<SuneduGtPersona> suneduGtPersonaList;

	public SuneduListaGtPersona() {
		super();
	}

	public SuneduListaGtPersona(ArrayList<SuneduGtPersona> suneduGtPersonaList) {
		super();
		this.suneduGtPersonaList = suneduGtPersonaList;
	}

	public ArrayList<SuneduGtPersona> getSuneduGtPersonaList() {
		return suneduGtPersonaList;
	}

	public void setSuneduGtPersonaList(ArrayList<SuneduGtPersona> suneduGtPersonaList) {
		this.suneduGtPersonaList = suneduGtPersonaList;
	}

	@Override
	public String toString() {
		return "SuneduListaGtPersona [suneduGtPersonaList="
				+ suneduGtPersonaList + "]";
	}
	
	
	
	
	
}
