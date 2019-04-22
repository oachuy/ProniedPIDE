package gob.pe.pronied.service;

import java.util.Date;
import java.util.List;
import gob.pe.pronied.models.entity.Minedu;
import gob.pe.pronied.models.entity.Pide;
import rest.pronied.domain.AntecedentesJudiciales;

public interface IConsumePideDAO {

	public void save(Pide pide); 
	public String consultaAntecedentesJudiciales(AntecedentesJudiciales antecedentes);
	public void consultaMinedu(Minedu minedu);
	public List<Minedu> generaJsonListMinedu(Minedu minedu);
	public List<Minedu> generaJsonListMineduError(Minedu minedu);
    public List <Object[]>  CantidadMetodoSistema();
    public List <Object[]> CantidadxMetodo();
    public void InsertPideConsultaLog( String metodoconsultado,
    	    int idsistema,
    	    String dniusuario,
    	    String dniconsultado,
    	    String resultado ,
    	    String desresultado,
    	    Date fechaconsulta);
}
