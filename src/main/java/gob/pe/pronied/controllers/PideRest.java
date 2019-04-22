package gob.pe.pronied.controllers;

import gob.pe.pronied.bean.CodigoException;
import gob.pe.pronied.models.entity.CantidadMetSisList;
import gob.pe.pronied.models.entity.CantidadMetodo;
import gob.pe.pronied.models.entity.CantidadMetodoList;
import gob.pe.pronied.models.entity.CantidadMetodoSistema;
import gob.pe.pronied.models.entity.Minedu;
import gob.pe.pronied.models.entity.Pide;
import gob.pe.pronied.service.IConsumePideDAO;
import gob.pe.pronied.util.UtilPropertiesAppHttp;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.apache.axis2.AxisFault;
//import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.reniec.ws.Consultar;
import pe.gob.reniec.ws.DatosPersona;
import pe.gob.reniec.ws.PeticionConsulta;
import pe.gob.reniec.ws.ReniecConsultaDni;
import pe.gob.reniec.ws.ReniecConsultaDniPortType;
import pe.gob.reniec.ws.ResultadoConsulta;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub.GtPersonaType;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub.ListaGTPersonaType;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub.OpConsultarRNGT;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub.OpConsultarRNGTResponse;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub.OperacionType;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub.RespuestaType;
import pe.gob.sunedu.wsgt.gradosws.WSGradosStub.UsuarioType;
import rest.pronied.domain.AntecedentesJudiciales;
import rest.pronied.domain.ReniecConsultarResponse;
import rest.pronied.domain.ReniecDatosPersona;
import rest.pronied.domain.RespuestaAntecedenteJudicial;
import rest.pronied.domain.Sunedu;
import rest.pronied.domain.SuneduGtPersona;
import rest.pronied.domain.SuneduListaGtPersona;
import rest.pronied.domain.SuneduRespuesta;

	
@RestController
public class PideRest {
	    
	    @Autowired
	    UtilPropertiesAppHttp utilPropertiesApp;
	     
	   //DATOS DE ACCESO WS SUNEDU
	 	@Value("${sunedu.clave}")
	 	private String suneduClaveSOAP;
	 	@Value("${sunedu.usuario}")
	 	private String suneduUsuarioSOAP;
	 	@Value("${sunedu.entidad}")
	 	private String suneduEntidadSOAP;
	 	
	 	@Value("${reniec.proniedruc}")
	 	private String proniecRuc;
	 	
	 	//DATOS DE ACCESO WS MINEDU
		@Value("${Controller.UsuarioMINEDU}")
		private String UsuarioMINEDU;
		@Value("${Controller.ClaveWsMINEDU}")
		private String ClaveMINEDU;
		@Value("${Controller.IPWsMINEDU}")
		private String IpMinedu;
	
	 	
	 	@Autowired
		private IConsumePideDAO consumePideDAO;
	 	
	 	private static final Logger LOGGER = LoggerFactory.getLogger(PideRest.class);
	 	
	    //SUNEDU   http://localhost:8080/sunedu?dni=33265579&sistema=3
	    @RequestMapping(method = RequestMethod.GET, value="/sunedu", produces="application/hal+json")
		public  Object ConsultaSunedu(@RequestParam("dni") String dni,
				                      @RequestParam("sistema") int IdSistema) throws AxisFault
		{
	    	Pide pide = new Pide();
	    	String Metodo = "ConsultaSunedu";
	    	
	    	Sunedu sunedu = null;
	    	SuneduRespuesta suneduRespuesta = null;
	    	SuneduGtPersona suneduGtpersona= null;
	    	ArrayList<SuneduGtPersona> listSuneduGtpersona = null;
	    	SuneduListaGtPersona suneduListaGtPersona = null;
	    	
	    	WSGradosStub wSGradosStub = new WSGradosStub();	
	    	OpConsultarRNGT opConsultarRNGT = new OpConsultarRNGT();

	    	UsuarioType ut = new UsuarioType();
	    	ut.setClave(suneduClaveSOAP);
	    	ut.setUsuario(suneduUsuarioSOAP);
	    	ut.setIdEntidad(suneduEntidadSOAP);

	    	OperacionType op = new OperacionType();
	    	op.setFecha("20170911");
	    	op.setHora("083511");
	    	op.setIp_wsServer("200.48.255.26");
	    	op.setIp_wsUser("172.15.123.12");
	    	op.setMac_wsServer("AF:06:EE:46:DA:EC");

	    	opConsultarRNGT.setOperacion(op);
	    	opConsultarRNGT.setUsuario(ut);
	    	opConsultarRNGT.setNroDocIdentidad(dni);

	    	try {
	    		OpConsultarRNGTResponse opresponse = wSGradosStub.opConsultarRNGT(opConsultarRNGT);
	    		RespuestaType rt = opresponse.getRespuesta();
	    		
	    	   if (rt != null){   
	    		   suneduRespuesta = new SuneduRespuesta(rt.getFechaSunedu(),rt.getHoraSunedu()
		    				,rt.getCGenerico(),rt.getDGenerica());
		    		if(rt.getCGenerico().equals("00000")){	
		    			
			    		ListaGTPersonaType lgt = opresponse.getListaGTPersona();
			    	    GtPersonaType[] gtpt =lgt.getGtPersona();
			    	    listSuneduGtpersona = new ArrayList<SuneduGtPersona>(); 
			    	    
			    	    for (int i=0 ; i<gtpt.length;i++){
			    		  suneduGtpersona = new SuneduGtPersona(
			    				 gtpt[i].getTipoDocumento()
			    				 ,gtpt[i].getNroDocumento()
						         ,gtpt[i].getApellidoPaterno() 
						         ,gtpt[i].getApellidoMaterno()
						         ,gtpt[i].getNombres()
						         ,gtpt[i].getAbreviaturaTitulo()
						         ,gtpt[i].getTituloProfesional()
						         ,gtpt[i].getUniversidad()
						         ,gtpt[i].getPais()
						         ,gtpt[i].getTipoInstitucion()
						         ,gtpt[i].getTipoGestion()
						         ,gtpt[i].getFechaEmision()  
						         ,gtpt[i].getResolucion()
						         ,gtpt[i].getFechaResolucion()
						   );
			    		  
			    		  listSuneduGtpersona.add(suneduGtpersona);
			    	    }
			    	    suneduListaGtPersona = new SuneduListaGtPersona(listSuneduGtpersona);
			    	    
			    	    sunedu = new Sunedu(suneduRespuesta,suneduListaGtPersona );
		    		}else{
		    			sunedu=new Sunedu(suneduRespuesta);
		    		}

			 		//GRABO LA CONSULTA REALIZADA
			 		 consumePideDAO.InsertPideConsultaLog(Metodo,IdSistema,null, dni,rt.getCGenerico(), rt.getDGenerica(), 
		 					 new Date());
	    	   }
	    	   else{
			 		consumePideDAO.InsertPideConsultaLog(Metodo,IdSistema,null, dni,new String("500"), utilPropertiesApp.getCode().get("500"), 
		 					 new Date());
			 		
	    		   return new CodigoException("500",utilPropertiesApp.getCode().get("500") );
	    	   }
			} catch (Exception e) {
				e.printStackTrace();
				LOGGER.debug("ConsultaSunedu- Cause:{} -- e:{}", e.getCause().toString(),e);
           	    if(e.getCause().toString().indexOf("ConstraintViolationException")!=-1) {
           		 return new CodigoException("910",utilPropertiesApp.getCode().get("910") );
           	    }else if(e.getCause().toString().indexOf("UnknownHostException")!=-1){
           		   return new CodigoException("920",utilPropertiesApp.getCode().get("920") );
           	    }
				pide.setIdSistema(IdSistema);
		 	    pide.setDniconsultado(dni);
		 	    pide.setMetodoconsultado(Metodo);
		 	    pide.setResultado("500");
		 		pide.setDesresultado(e.getMessage()+ "_RemoteException");
		 		pide.setFechaconsulta(new Date());
		 			
		 		//GRABO LA CONSULTA REALIZADA
		 		consumePideDAO.save(pide);
				return new CodigoException("500",utilPropertiesApp.getCode().get("500") + "_RemoteException" );
			}

			return sunedu ;
		}
	    
	    //DNI RENIEC  http://localhost:8080/reniec?dni=33265579&user=06796285&clave=06796285&sistema=100
	    @RequestMapping(method = RequestMethod.GET, value="/reniec", produces="application/hal+json")
		public  Object ConsultaDNIReniec(@RequestParam("dni") String dni,@RequestParam("user") String user,@RequestParam("clave") String clave,
				                         @RequestParam("sistema") int IdSistema)  
		{
	    	 String Metodo = "ConsultaReniec";
             PeticionConsulta pc = new PeticionConsulta();
		     pc.setNuDniConsulta(dni);
		     pc.setNuDniUsuario(user);
		     pc.setNuRucUsuario(proniecRuc);
		     pc.setPassword(clave);
		     
		     Consultar co = new Consultar();
		     co.setArg0(pc);
             try {
			     ReniecConsultaDni reniecConsultaDni = new ReniecConsultaDni();
			     ReniecConsultaDniPortType port = reniecConsultaDni.getReniecConsultaDniHttpsSoap11Endpoint();
			     ResultadoConsulta consulta = port.consultar(pc);
	             
			     if(consulta != null){
				     ReniecConsultarResponse rcr = null;
		             if(consulta.getCoResultado().equals("0000")){
			             DatosPersona dp= consulta.getDatosPersona();
			             ReniecDatosPersona rdp = new ReniecDatosPersona(
				             dp.getApPrimer(),
				             dp.getApSegundo(),
				             dp.getDireccion(),
				             dp.getEstadoCivil(),
				             dp.getFoto(),
				             dp.getPrenombres(),
				             dp.getRestriccion(),
				             dp.getUbigeo()
			             );
			             rcr= new ReniecConsultarResponse(
			            		 consulta.getCoResultado(),rdp,consulta.getDeResultado());
		             }
		             else{
		            	 rcr= new ReniecConsultarResponse(
			            		 consulta.getCoResultado(),null,consulta.getDeResultado());
		             }
	
		 			 //GRABO LA CONSULTA REALIZADA
		             
		 			 consumePideDAO.InsertPideConsultaLog(Metodo,IdSistema, user, dni, consulta.getCoResultado(), consulta.getDeResultado(), 
		 					 new Date());
			    	 return rcr;
			     }else{
			    	 LOGGER.debug("ConsultaDNIReniec ",utilPropertiesApp.getCode().get("500"), new Date());
		 			consumePideDAO.InsertPideConsultaLog(Metodo,IdSistema, user, dni, new String("500"), utilPropertiesApp.getCode().get("500"), 
		 					 new Date());
			    	 return new CodigoException("500",utilPropertiesApp.getCode().get("500") );
			     }
             }
             catch(Exception e) {
            	 e.printStackTrace();
            	 LOGGER.debug("ConsultaDNIReniec- Cause: {} -- e: {}", e.getCause().toString(),e);
            	 if(e.getCause().toString().indexOf("ConstraintViolationException")!=-1) {
            		 return new CodigoException("910",utilPropertiesApp.getCode().get("910") );
            	 } else if(e.getCause().toString().indexOf("UnknownHostException")!=-1){
            		 return new CodigoException("920",utilPropertiesApp.getCode().get("920") );
            	 }
            	 return new CodigoException("500",utilPropertiesApp.getCode().get("500") );
             }
		}
	    
	    
	    //DNI Antecedentes Judiales
	    @RequestMapping(method = RequestMethod.GET, value="/antecedente", produces="application/hal+json")
		public  Object ConsultaDNIAntecedentesJudiciales(@RequestParam("apepat") String apepat,@RequestParam("apemat") String apemat,@RequestParam("nombres") String nombres,
				                                         @RequestParam("sistema") String sistema) throws MalformedURLException 
		{
	    	AntecedentesJudiciales antecedentes = new AntecedentesJudiciales();
	    	antecedentes.setApellidoPaterno(apepat);
	    	
	    	antecedentes.setApellidoMaterno(apemat);
	    	antecedentes.setNombres(nombres);
	    	
	    	String Resultado = consumePideDAO.consultaAntecedentesJudiciales(antecedentes);
	    	return new RespuestaAntecedenteJudicial(Resultado);
		}
	  
	    
	    @RequestMapping(path = "/BuscaDNIxMinedu/{dni}")
		public List<Minedu> getBuscaDNI(@PathVariable String dni, Minedu minedu, Pide pide)
		{
			String Usuario				= UsuarioMINEDU;
			String Clave				= ClaveMINEDU;
			String Ip					= IpMinedu;
			String Consultado			= dni;
			String Metodo				= "ConsultaMINEDU";
			
			minedu.setUsuario(Usuario);
			minedu.setClave(Clave);
			minedu.setIpSistema(Ip);
			minedu.setDniConsultado(Consultado);
			
			//OBTENGO LOS DATOS DE MINEDU
			consumePideDAO.consultaMinedu(minedu);
			
			
			//DATOS PARA SEGUIMIENTO DE PIDE
			/*pide.setIdSistema(IdSistema);
			pide.setDniusuario(dni);
			pide.setObjetoconsultado(Consultado);
			pide.setMetodoconsultado(Metodo);
			pide.setResultado("OK");
			pide.setFechaconsulta(new Date());*/
			
			
			//GRABO LA CONSULTA REALIZADA
			//consumePideDAO.save(pide);
			
			List<Minedu> mineduList;
			
			if (minedu.getCodigo() == "R002")
			{
				mineduList = consumePideDAO.generaJsonListMineduError(minedu);
			}
			else
			{
				mineduList = consumePideDAO.generaJsonListMinedu(minedu);
			}
			
			return mineduList;
		}
	    
	    //Reporte
	    @RequestMapping(method = RequestMethod.GET,value = "/CantidadxMetodoxSistema", produces="application/hal+json")
	    public Object getCantidadxMetodoxSistema() {

	    	CantidadMetSisList cmsl = new CantidadMetSisList();
	    	List<Object[]> rows =  (List<Object[]>) consumePideDAO.CantidadMetodoSistema();

	    	for (Object[] row : rows) {
	    	    cmsl.getCntMetList().add(new CantidadMetodoSistema((int) row[0],(String) row[1],(String) row[2],(int) row[3]));
	    	}
	    	return cmsl;
	    }
	    
	  //Reporte
	    @RequestMapping(method = RequestMethod.GET,value = "/CantidadxMetodo", produces="application/hal+json")
	    public Object getCantidadxMetodo() {

	    	CantidadMetodoList cmsl = new CantidadMetodoList();
	    	List<Object[]> rows =  (List<Object[]>) consumePideDAO.CantidadxMetodo();

	    	for (Object[] row : rows) {
	    	    cmsl.getCntMetodoList().add(new CantidadMetodo((String) row[0],(int) row[1]));
	    	}
	    	return cmsl;
	    }
	    
	    @RequestMapping(method = RequestMethod.GET,value = "/wsdlTest", produces="application/hal+json")
	    private String isWSDLAvailable(@RequestParam("wsdlAddr") String wsdlAddr) {
            HttpURLConnection c = null;
            try {
                URL u = new URL(wsdlAddr);
                c = (HttpURLConnection) u.openConnection();
                c.setRequestMethod("GET");
                c.getInputStream();
                LOGGER.debug("PruebaWSDL - Conectó ");
                return String.valueOf(c.getResponseCode());
            } catch (Exception e) {
            	e.printStackTrace();
            	LOGGER.debug("PruebaWSDL - Cause: {} -- e: {}", e.getCause().toString(),e);
            	return e.getMessage();
            } finally {
                if (c != null) c.disconnect();
                
            }    
         }
	    
}
