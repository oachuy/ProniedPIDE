package gob.pe.pronied.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gob.pe.pronied.models.entity.CantidadMetodoSistema;
import gob.pe.pronied.models.entity.Minedu;
import gob.pe.pronied.models.entity.Pide;
import minedu.reniec.ws.ReniecWS;
import minedu.reniec.ws.ReniecWSService;
import minedu.reniec.ws.RespuestaReniecRemapeo;
import pe.gob.inpe.wsantjudiciales.endpoint.INPEAJudiciales;
import pe.gob.inpe.wsantjudiciales.endpoint.INPEAJudicialesPortType;
import rest.pronied.domain.AntecedentesJudiciales;

@Repository

public class ConsumePideDAOImpl implements IConsumePideDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public void save(Pide pide) {
		em.persist(pide);
	}
	
	@Override
	public String consultaAntecedentesJudiciales(AntecedentesJudiciales antecedentes) {
		String resultado = null;
		INPEAJudicialesPortType servicios = new INPEAJudiciales().getINPEAJudicialesHttpsSoap11Endpoint();
		resultado = servicios.getAntecedenteJudicial(
				antecedentes.getApellidoPaterno(), 
				antecedentes.getApellidoMaterno(), 
				antecedentes.getNombres());
		return resultado;
	}
	
	@Override
	public void consultaMinedu(Minedu minedu) {
		ReniecWS servicios = new ReniecWSService().getReniecWSPort();
		RespuestaReniecRemapeo RespuestaReniec = new RespuestaReniecRemapeo();
		RespuestaReniec = servicios.buscarDNICascada(
				minedu.getUsuario(), 
				minedu.getClave(), 
				minedu.getIpSistema(), 
				minedu.getDniConsultado());
		if (RespuestaReniec.getCodigo().equals("R002"))
		{
			minedu.setCodigo("R002");
			minedu.setMensaje("No encontrado");
		}
		else
		{
			minedu.setApellidoPaterno(RespuestaReniec.getPersona().getApellidoPaterno());
			minedu.setApellidoMaterno(RespuestaReniec.getPersona().getApellidoMaterno());
			minedu.setNombres(RespuestaReniec.getPersona().getNombres());
			minedu.setCodSexo(RespuestaReniec.getPersona().getCodSexo());
			minedu.setCodEstCivil(RespuestaReniec.getPersona().getCodEstCivil());
			minedu.setNumDoc(RespuestaReniec.getPersona().getNumDoc());
			minedu.setCentPobladoDomicilio(RespuestaReniec.getPersona().getCentPobladoDomicilio());
			minedu.setCentPobladoNacimiento(RespuestaReniec.getPersona().getCentPobladoNacimiento());
			minedu.setContDocumento(RespuestaReniec.getPersona().getContDocumento());
			minedu.setContDomicilio(RespuestaReniec.getPersona().getContDomicilio());
			minedu.setContNacimiento(RespuestaReniec.getPersona().getContNacimiento());
			minedu.setDirDomicilio(RespuestaReniec.getPersona().getDirDomicilio());
			minedu.setDistDomicilio(RespuestaReniec.getPersona().getDistDomicilio());
			minedu.setDistNacimiento(RespuestaReniec.getPersona().getDistNacimiento());
			minedu.setDptoDomicilio(RespuestaReniec.getPersona().getDptoDomicilio());
			minedu.setDptoNacimiento(RespuestaReniec.getPersona().getDptoNacimiento());
			minedu.setDscCentPobladoDomicilio(RespuestaReniec.getPersona().getDscCentPobladoDomicilio());
			minedu.setDscCentPobladoNacimiento(RespuestaReniec.getPersona().getDscCentPobladoNacimiento());
			minedu.setDscContDomicilio(RespuestaReniec.getPersona().getDscContDomicilio());
			minedu.setDscContNacimiento(RespuestaReniec.getPersona().getDscContNacimiento());
			minedu.setDscDistDomicilio(RespuestaReniec.getPersona().getDscDistDomicilio());
			minedu.setDscDistNacimiento(RespuestaReniec.getPersona().getDscDistNacimiento());
			minedu.setDscDptoDomicilio(RespuestaReniec.getPersona().getDscDptoDomicilio());
			minedu.setDscDptoNacimiento(RespuestaReniec.getPersona().getDscDptoNacimiento());
			minedu.setDscPaisDomicilio(RespuestaReniec.getPersona().getDscPaisDomicilio());
			minedu.setDscPaisNacimiento(RespuestaReniec.getPersona().getDscPaisNacimiento());
			minedu.setDscProvDomicilio(RespuestaReniec.getPersona().getDscProvDomicilio());
			minedu.setDscProvNacimiento(RespuestaReniec.getPersona().getDscProvNacimiento());
			minedu.setFecNacimiento(RespuestaReniec.getPersona().getFecNacimiento());
			minedu.setNombreMadre(RespuestaReniec.getPersona().getNombreMadre());
			minedu.setNombrePadre(RespuestaReniec.getPersona().getNombrePadre());
			minedu.setApeMatMadre(RespuestaReniec.getPersona().getApeMatMadre());
			minedu.setApeMatPadre(RespuestaReniec.getPersona().getApeMatPadre());
			minedu.setApePatMadre(RespuestaReniec.getPersona().getApePatMadre());
			minedu.setApePatPadre(RespuestaReniec.getPersona().getApePatPadre());
			minedu.setApeMatCasMadre(RespuestaReniec.getPersona().getApeMatCasMadre());
			minedu.setPais(RespuestaReniec.getPersona().getPais());
			minedu.setPaisDomicilio(RespuestaReniec.getPersona().getPaisDomicilio());
			minedu.setPaisNacimiento(RespuestaReniec.getPersona().getPaisNacimiento());
			minedu.setProvDomicilio(RespuestaReniec.getPersona().getProvDomicilio());
			minedu.setProvNacimiento(RespuestaReniec.getPersona().getProvNacimiento());
			minedu.setTipDoc(RespuestaReniec.getPersona().getTipDoc());
		}
	}
	
	@Override
	public List<Minedu> generaJsonListMinedu(Minedu minedu) {
		List<Minedu> mineduList = new ArrayList<>();
		mineduList.add(new Minedu(
				minedu.getApeMatCasMadre(),
				minedu.getApeMatMadre(),
				minedu.getApeMatPadre(),
				minedu.getApePatMadre(),
				minedu.getApePatPadre(),
				minedu.getApellidoMaterno(),
				minedu.getApellidoPaterno(),
				minedu.getCentPobladoDomicilio(),
				minedu.getCentPobladoNacimiento(),
				minedu.getCodEstCivil(),
				minedu.getCodSexo(),
				minedu.getContDocumento(),
				minedu.getContDomicilio(),
				minedu.getContNacimiento(),
				minedu.getDirDomicilio(),
				minedu.getDistDomicilio(),
				minedu.getDistNacimiento(),
				minedu.getDptoDomicilio(),
				minedu.getDptoNacimiento(),
				minedu.getDscCentPobladoDomicilio(),
				minedu.getDscCentPobladoNacimiento(),
				minedu.getDscContDomicilio(),
				minedu.getDscContNacimiento(),
				minedu.getDscDistDomicilio(),
				minedu.getDscDistNacimiento(),
				minedu.getDscDptoDomicilio(),
				minedu.getDscDptoNacimiento(),
				minedu.getDscPaisDomicilio(),
				minedu.getDscPaisNacimiento(),
				minedu.getDscProvDomicilio(),
				minedu.getDscProvNacimiento(),
				minedu.getFecNacimiento(),
				minedu.getNombreMadre(),
				minedu.getNombrePadre(),
				minedu.getNombres(),
				minedu.getNumDoc(),
				minedu.getPais(),
				minedu.getPaisDomicilio(),
				minedu.getPaisNacimiento(),
				minedu.getProvDomicilio(),
				minedu.getProvNacimiento(),
				minedu.getTipDoc()
				));
		return mineduList;
	}

	@Override
	public List<Minedu> generaJsonListMineduError(Minedu minedu) {
		List<Minedu> mineduList = new ArrayList<>();
		mineduList.add(new Minedu(
				minedu.getCodigo(),
				minedu.getMensaje()
				));
		return mineduList;
	}
	
	@Override
	public List <Object[]> CantidadMetodoSistema() {
		StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("pide.CantidadOKxSistema");
		// Realizamos la llamada al procedimiento
	    storedProcedureQuery.execute();
		List <Object[]> resultList = storedProcedureQuery.getResultList();

		return resultList;
	}
	
	@Override
	public List <Object[]> CantidadxMetodo(){
		StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("pide.CantidadOKxMetodo");
		storedProcedureQuery.execute();
		List <Object[]> resultList = storedProcedureQuery.getResultList();
        return resultList;
	}

	@Override
	public void InsertPideConsultaLog( 
			String metodoconsultado,
    	    int idsistema,
    	    String dniusuario,
    	    String dniconsultado,
    	    String resultado ,
    	    String desresultado,
    	    Date fechaconsulta
    ) {
	  
		StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("pide.paInsertaPideConsultaLog");
		storedProcedureQuery.registerStoredProcedureParameter("metodoconsultado", String.class, ParameterMode.IN);
		storedProcedureQuery.registerStoredProcedureParameter("idsistema", Integer.class, ParameterMode.IN);
		storedProcedureQuery.registerStoredProcedureParameter("dniusuario", String.class, ParameterMode.IN);
		storedProcedureQuery.registerStoredProcedureParameter("dniconsultado", String.class, ParameterMode.IN);
		storedProcedureQuery.registerStoredProcedureParameter("resultado", String.class, ParameterMode.IN);
		storedProcedureQuery.registerStoredProcedureParameter("desresultado", String.class, ParameterMode.IN);
		storedProcedureQuery.registerStoredProcedureParameter("fechaconsulta", Date.class, ParameterMode.IN);

		
		storedProcedureQuery.setParameter("metodoconsultado", metodoconsultado);
		storedProcedureQuery.setParameter("idsistema", idsistema);
		storedProcedureQuery.setParameter("dniusuario", dniusuario);
		storedProcedureQuery.setParameter("dniconsultado", dniconsultado);
		storedProcedureQuery.setParameter("resultado", resultado);
		storedProcedureQuery.setParameter("desresultado", desresultado);
		storedProcedureQuery.setParameter("fechaconsulta", fechaconsulta);

		storedProcedureQuery.execute();

	}
	
	

}
