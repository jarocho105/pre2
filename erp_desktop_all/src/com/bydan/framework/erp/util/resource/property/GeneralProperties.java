package com.bydan.framework.erp.util.resource.property;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import com.bydan.framework.erp.util.Constantes;

public class GeneralProperties {
	public GeneralProperties() {
		super();
	}
		
	public static void loadProperties()throws Exception {
		Properties properties=new Properties();
		
		InputStream inputStream=GeneralProperties.class.getClass().getResourceAsStream("GeneralProperties.properties");		
		
		try	{			
			properties.load(inputStream);			
			loadPropertiesToConstantes(properties);
		} catch(Exception ex) {
			throw ex;
		} finally {
			inputStream.close();
		}
	}
	
	@SuppressWarnings("unused")
	private static void loadProperties(InputStream inputStream)throws Exception {
		Properties properties=new Properties();
		
		try {		
			properties.load(inputStream);			
			loadPropertiesToConstantes(properties);
		} catch(Exception ex) {
			throw ex;
		} finally {
			inputStream.close();
		}		
	}
	
	public static void loadProperties(String strfilePath)throws Exception {
		Properties properties=new Properties();		
		
		FileInputStream fileInputStream=null;
		
		try {
			fileInputStream=new FileInputStream(strfilePath);			
			properties.load(fileInputStream);			
			loadPropertiesToConstantes(properties);
			
		} catch(Exception ex) {
			throw ex;
		} finally {
			fileInputStream.close();
		}		
	}
	
	private static void loadPropertiesToConstantes(Properties properties)throws Exception {
		/*
		Constantes.SMAILIP=properties.getProperty("MAILIP"); 
		
		Constantes.SMAILPORT=properties.getProperty("MAILPORT"); 
		
		Constantes.SMAILDNS=properties.getProperty("MAILDNS"); 
		*/
		
		ArrayList<String> arrMailsVerificacionErrores=new ArrayList<String>();
		
		String strMailVerificacionErrores=properties.getProperty("MAILVERIFICACIONERRORES1");
		arrMailsVerificacionErrores.add(strMailVerificacionErrores);
		
		strMailVerificacionErrores=properties.getProperty("MAILVERIFICACIONERRORES2");
		arrMailsVerificacionErrores.add(strMailVerificacionErrores);
		
		strMailVerificacionErrores=properties.getProperty("MAILVERIFICACIONERRORES3");
		arrMailsVerificacionErrores.add(strMailVerificacionErrores);
		
		Constantes.setArrMailsVerificacionErrores(arrMailsVerificacionErrores); 
		/*		
		Constantes.LIDPERFILTUTOR=Long.parseLong(properties.getProperty("IDPERFILTUTOR")); 
		
		Constantes.LIDPERFILALUMNO=Long.parseLong(properties.getProperty("IDPERFILALUMNO")); 
		
		Constantes.SLABELIMPRIMIR=properties.getProperty("LABELIMPRIMIR"); 
	
		Constantes.SLABELIMPRIMIRHASTA=properties.getProperty("LABELIMPRIMIRHASTA"); 
		
		Constantes.SLABELIMPRIMIRCURSOUNIDADCURRICULAR=properties.getProperty("LABELIMPRIMIRCURSOUNIDADCURRICULAR"); 
		
		Constantes.ITAMANIOPAGINA=Integer.parseInt(properties.getProperty("TAMANIOPAGINA")); 
		
		Constantes.SRAIZDESDEPAGINASCURSO=properties.getProperty("RAIZDESDEPAGINASCURSO"); 
	
		Constantes.SLABELARCHIVOS=properties.getProperty("LABELARCHIVOS"); 
		
		Constantes.SLABELRESUMENES=properties.getProperty("LABELRESUMENES") ;
		
		Constantes.SLABELURLS=properties.getProperty("LABELURLS"); 
		
		Constantes.SLABELPREGUNTASOPCIONES=properties.getProperty("LABELPREGUNTASOPCIONES") ;

		Constantes.SLABELPREGUNTASYRESPUESTAS=properties.getProperty("LABELPREGUNTASYRESPUESTAS") ;
		
		Constantes.SLABELURLSYENLACES=properties.getProperty("LABELURLSYENLACES");
		
		Constantes.SLABELVERDESDEYOUTUBE=properties.getProperty("LABELVERDESDEYOUTUBE") ;
	
		Constantes.SLABELVERDESDEVIDEOGOOGLE=properties.getProperty("LABELVERDESDEVIDEOGOOGLE") ;
		
		Constantes.SLABELPREGUNTAS=properties.getProperty("LABELPREGUNTAS") ;
		
		Constantes.SLABELRESPUESTAS=properties.getProperty("LABELRESPUESTAS") ;
		
		Constantes.SLABELRESPUESTASCORRECTAS=properties.getProperty("LABELRESPUESTASCORRECTAS") ;

		Constantes.SPALABRACLAVEREEMPLAZARHTML=properties.getProperty("PALABRACLAVEREEMPLAZARHTML") ;

		Constantes.SURLVIDEO=properties.getProperty("URLVIDEO") ;

		Constantes.SURLVIDEOGOOGLE=properties.getProperty("URLVIDEOGOOGLE") ;

		Constantes.SURLVIDEOYOUTUBE=properties.getProperty("URLVIDEOYOUTUBE") ;

		Constantes.SNOMBRESISTEMACARPETA=properties.getProperty("NOMBRESISTEMACARPETA") ;
		
		Constantes.SNOMBREINICIOPARAMETROTITULO=properties.getProperty("NOMBREINICIOPARAMETROTITULO") ;
		
		Constantes.SNOMBREINICIOPARAMETROPATHIMAGEN=properties.getProperty("NOMBREINICIOPARAMETROPATHIMAGEN") ;

		Constantes.SLABELREESPUESTASSOLAMENTE=properties.getProperty("LABELRESPUESTASSOLAMENTE") ;
		
		Constantes.SRAIZDESDECURSO=properties.getProperty("RAIZDESDECURSO") ;
		
		Constantes.SNOMBREINICIOPARAMETROPARRAFO=properties.getProperty("NOMBREINICIOPARAMETROPARRAFO") ;
		
		Constantes.INUMEROELEMENTOSMINIMOPAGINA=Integer.parseInt(properties.getProperty("NUMEROELEMENTOSMINIMOSPAGINA")) ;
		
		Constantes.LIDPERFILADMINISTRADOR=Long.parseLong(properties.getProperty("IDPERFILADMINISTRADOR")) ;
	
		Constantes.LIDPERFILADMINISTRADORAULAVIRTUAL=Long.parseLong(properties.getProperty("IDPERFILADMINISTRADORAULAVIRTUAL")) ;
		
		Constantes.SCARPETAPAGINAS=properties.getProperty("CARPETAPAGINAS") ;
		
		Constantes.SLOGGINPACKAGECONSOLE=properties.getProperty("LOGGINPACKAGECONSOLE") ;
				
		Constantes.SPATHLOGGIN=properties.getProperty("PATHLOGGIN") ;
		
		Constantes.SLOGGINPACKAGEFILE=properties.getProperty("LOGGINPACKAGEFILE") ;
		
		Constantes.SCHEMA=properties.getProperty("SCHEMA") ;
		
		Constantes.SAREADEPARTAMENTO=properties.getProperty("AREADEPARTAMENTO") ;
	
		Constantes.LIDSISTEMAACTUAL=Long.parseLong(properties.getProperty("OIDSISTEMAACTUAL")) ;
		
		Constantes.SAUDITORIAINSERTAR=properties.getProperty("AUDITORIAINSERTAR") ;

		Constantes.SAUDITORIAACTUALIZAR=properties.getProperty("AUDITORIAACTUALIZAR") ;
	
		Constantes.SAUDITORIAELIMINARLOGICAMENTE=properties.getProperty("AUDITORIAELIMINARLOGICAMENTE") ; 
	
		Constantes.SAUDITORIAELIMINARFISICAMENTE=properties.getProperty("AUDITORIAELIMINARFISICAMENTE") ;
		*/
		Constantes.SCONNEXIONAUDITORIA=properties.getProperty("CONNEXIONAUDITORIA") ;
	
		Constantes.SCONNEXIONSEGURIDAD=properties.getProperty("CONNEXIONSEGURIDAD") ;
	
		Constantes.SCONNEXION=properties.getProperty("CONNEXION") ;
	}	
}
