package com.bydan.framework.erp.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.LogHtmlFormatter;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Reporte;
import com.bydan.framework.erp.business.logic.ParameterSelectionGeneral;
import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;

@SuppressWarnings("unused")
public class Funciones {
	public static Object getObjectEjbReference(String sEjbReference) {
		Object object=new Object();
		
		try {
			if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				object=Funciones.getInitialContextEjb().lookup(sEjbReference);	
			}
		} catch (Exception e) {
			
		}
		return object;
	}
	
	public static InitialContext getInitialContextEjb() {
		InitialContext initialContext =null;
		
		try {
			initialContext = new InitialContext(Funciones.getHashtableEnv());	
		} catch (Exception e) {
			e.printStackTrace();
			/*
			StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
			 System.out.println(sw.toString());
			 */
		}
		
		return initialContext;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Hashtable getHashtableEnv() {
		Hashtable hashtableEnv = new Hashtable();
		
		/*
		System.out.println(Context.INITIAL_CONTEXT_FACTORY);
		System.out.println(Context.PROVIDER_URL);
		System.out.println(Context.URL_PKG_PREFIXES);
		*/
		
		System.out.println(Constantes.INITIAL_CONTEXT_FACTORY);
		System.out.println(Constantes.PROVIDER_URL);
		System.out.println(Constantes.URL_PKG_PREFIXES);
		
		hashtableEnv.put(Context.INITIAL_CONTEXT_FACTORY,Constantes.INITIAL_CONTEXT_FACTORY);
		hashtableEnv.put(Context.PROVIDER_URL,Constantes.PROVIDER_URL);
		hashtableEnv.put(Context.URL_PKG_PREFIXES,Constantes.URL_PKG_PREFIXES);

		return hashtableEnv;
	}
	
	
	public static ArrayList<Reporte> getListTiposReportes(Boolean tieneReporteGroup)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		
		reporte=new Reporte();
		reporte.setsCodigo("NORMAL");
		reporte.setsDescripcion("NORMAL");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("FORMULARIO");
		reporte.setsDescripcion("FORMULARIO");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("DINAMICO");
		reporte.setsDescripcion("DINAMICO");
		
		arrayTiposReportes.add(reporte);
		
		
		if(tieneReporteGroup) {
			reporte=new Reporte();
			reporte.setsCodigo("GRUPO_GENERICO");
			reporte.setsDescripcion("GRUPO");//"GRUPO GENERICO"
			
			arrayTiposReportes.add(reporte);
			
			reporte=new Reporte();
			reporte.setsCodigo("TOTALES_GRUPO_GENERICO");
			reporte.setsDescripcion("TOTAL GRUPO");//"TOTALES GRUPO GENERICO"
			
			arrayTiposReportes.add(reporte);
		}
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposReportesDinamico(Boolean tieneReporteGroup)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		
		reporte=new Reporte();
		reporte.setsCodigo("NORMAL");
		reporte.setsDescripcion("NORMAL");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("FORMULARIO");
		reporte.setsDescripcion("FORMULARIO");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("RELACIONES");
		reporte.setsDescripcion("RELACIONES");
		
		arrayTiposReportes.add(reporte);
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("DINAMICO");
		reporte.setsDescripcion("DINAMICO");
		
		arrayTiposReportes.add(reporte);
		
		
		if(tieneReporteGroup) {
			reporte=new Reporte();
			reporte.setsCodigo("GRUPO_GENERICO");
			reporte.setsDescripcion("GRUPO");//"GRUPO GENERICO"
			
			arrayTiposReportes.add(reporte);
			
			reporte=new Reporte();
			reporte.setsCodigo("TOTALES_GRUPO_GENERICO");
			reporte.setsDescripcion("TOTAL GRUPO");//"TOTALES GRUPO GENERICO"
			
			arrayTiposReportes.add(reporte);
		}
		*/
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposArchivosReportes()throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		
		reporte=new Reporte();
		reporte.setsCodigo("VISUALIZAR");
		reporte.setsDescripcion("VISUALIZAR");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("PDF");
		reporte.setsDescripcion("PDF");
		
		arrayTiposReportes.add(reporte);
		
		
		reporte=new Reporte();
		reporte.setsCodigo("WORD");
		reporte.setsDescripcion("WORD");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("EXCEL");
		reporte.setsDescripcion("EXCEL");
		arrayTiposReportes.add(reporte);	
		

		reporte=new Reporte();
		reporte.setsCodigo("HTML");
		reporte.setsDescripcion("HTML");
		
		arrayTiposReportes.add(reporte);		
		
		reporte=new Reporte();
		reporte.setsCodigo("XML");
		reporte.setsDescripcion("XML");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("TEXTO");
		reporte.setsDescripcion("TEXTO");
		
		arrayTiposReportes.add(reporte);
		
		
		reporte=new Reporte();
		reporte.setsCodigo("EXCEL2");
		reporte.setsDescripcion("EXCEL2");
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("EXCEL2_2");
		reporte.setsDescripcion("EXCEL2_2");
		arrayTiposReportes.add(reporte);
		
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposReportes()throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		
		reporte=new Reporte();
		reporte.setsCodigo("VISUALIZAR");
		reporte.setsDescripcion("VISUALIZAR");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("PDF");
		reporte.setsDescripcion("PDF");
		
		arrayTiposReportes.add(reporte);
		
		
		reporte=new Reporte();
		reporte.setsCodigo("WORD");
		reporte.setsDescripcion("WORD");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("EXCEL");
		reporte.setsDescripcion("EXCEL");
		arrayTiposReportes.add(reporte);	
		

		reporte=new Reporte();
		reporte.setsCodigo("HTML");
		reporte.setsDescripcion("HTML");
		
		arrayTiposReportes.add(reporte);		
		
		reporte=new Reporte();
		reporte.setsCodigo("XML");
		reporte.setsDescripcion("XML");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("TEXTO");
		reporte.setsDescripcion("TEXTO");
		
		arrayTiposReportes.add(reporte);
						
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<String> traerTiposReportes()throws Exception  {
		ArrayList<String> arrayTiposReportes=new ArrayList<String>();
		
		arrayTiposReportes.add("PDF");
		arrayTiposReportes.add("WORD");
		arrayTiposReportes.add("EXCEL");
		arrayTiposReportes.add("HTML");
		
		return arrayTiposReportes;
	}
	
	public static String getDetalleBusqueda(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception  {
		String sDetalleBusqueda="";
		//Integer iCount=1;
		
		if(queryWhereSelectParameters.getParametersSelectionGeneral()!=null) {
			for(ParameterSelectionGeneral parameterselectiongeneral:queryWhereSelectParameters.getParametersSelectionGeneral()) {
				sDetalleBusqueda+="-"+parameterselectiongeneral.getColumnName()+"="+parameterselectiongeneral.getParameterInitialValue();			
				//iCount++;
			}
		}
		
		if(sDetalleBusqueda.length()>200) {
			sDetalleBusqueda=sDetalleBusqueda.substring(0, 199);
		}
		
		return sDetalleBusqueda;
	}
	
	public static Date ConvertToDate(String sDate)throws Exception  {
		DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		Date date ; 
		//formatter = new SimpleDateFormat(sDate);
		date = (Date)formatter.parse(sDate);   
		
		return date;
	}
	
	public static void enviarMails(String strHtmlSubject,String strHtmlBody,ArrayList<ArchivoMailAttachment> arrayListArchivoMailAttachments,String strMailEnvio,String strUsuarioMailEnvio,ArrayList<String> arrMailsDestinatarios)throws MessagingException, Exception {			
		if(strUsuarioMailEnvio==null||strUsuarioMailEnvio=="") {
			return;
		}
		
		Properties properties= new Properties();
		
		properties.put("mail.host", Constantes.SMAILIP);
		properties.put("mail.user", strUsuarioMailEnvio);
		properties.put("mail.from", strMailEnvio);
	   
	    Session session = Session.getInstance(properties, null);
	  
	    MimeMessage mimeMessage= new MimeMessage(session);
	    mimeMessage.setFrom();
	    
	    for(String strMailDestinatario:arrMailsDestinatarios) {
	    	mimeMessage.addRecipients(Message.RecipientType.TO,strMailDestinatario);
	    }
                 
	    MimeMultipart mimeMultipart= new MimeMultipart("related");
	
	    BodyPart messageBodyPart = new MimeBodyPart();
	    messageBodyPart.setContent(strHtmlBody, "text/html");
		        
	    mimeMultipart.addBodyPart(messageBodyPart);
	    
	    try {	    	
	    	mimeMessage.setSubject(strHtmlSubject);
	    	   
	       /*
	        messageBodyPart = new MimeBodyPart();       
	        DataSource fds = new FileDataSource(strPathFotoProduccion);
	        messageBodyPart.setDataHandler(new DataHandler(fds));
	        messageBodyPart.setHeader("Content-ID","<image>");
	        multipart.addBodyPart(messageBodyPart);
	       */
	       
	    	MimeBodyPart mimeBodyPart= new MimeBodyPart();
	    	BufferedDataSource bufferedDataSource= null;
    		
	    	for(ArchivoMailAttachment archivoMailAttachment:arrayListArchivoMailAttachments) {
	    		/*	    		
	    		mimeBodyPart.attachFile("file.jpg");
	    		mimeBodyPart.setFileName(archivoMailAttachment.getSFileName());
	    		mimeMultipart.addBodyPart(mimeBodyPart);
	    		*/
	    		bufferedDataSource= new BufferedDataSource(archivoMailAttachment.getArrBytesFile(), archivoMailAttachment.getSFileName());
	    		mimeBodyPart.setDataHandler(new DataHandler(bufferedDataSource));
	    		mimeBodyPart.setFileName(bufferedDataSource.getName());
	    		
	    		mimeMultipart.addBodyPart(mimeBodyPart);
	    	}
	    	
	    	mimeMessage.setContent(mimeMultipart);	        
	        
	        Transport.send(mimeMessage);
	    } catch (MessagingException messagingException) {
	    	
	    	Funciones.enviarMailsException(strMailEnvio,strUsuarioMailEnvio, messagingException, arrMailsDestinatarios);	        
	    	throw messagingException;
	    	
	    } catch (Exception exception) {
	    	Funciones.enviarMailsException(strMailEnvio,strUsuarioMailEnvio, exception, arrMailsDestinatarios);	    	
	    	throw exception;
	    }
	}
	
	private static void enviarMailsException(String strMailEnvio,String strUsuarioMailEnvio,Exception exception,ArrayList<String> arrMailsDestinatarios)throws MessagingException, Exception {
		Properties properties= new Properties();
		
		properties.put("mail.host", Constantes.SMAILIP);
		properties.put("mail.user", strUsuarioMailEnvio);
		properties.put("mail.from", strMailEnvio);
	   
	    Session session = Session.getInstance(properties, null);
	
		String strException=exception.getMessage();
    	
    	String strMailsDestinatarios="";
    	
    	for(String strMailDestinatario:arrMailsDestinatarios) {
    		strMailsDestinatarios+=strMailDestinatario;
	    }
    	
    	MimeMessage mimeMessage = new MimeMessage(session);
    	mimeMessage.setFrom();
    	
    	for(String strMailVerificacion:Constantes.getArrMailsVerificacionErrores()) {
    		mimeMessage.addRecipients(Message.RecipientType.TO,strMailVerificacion);
    	}
    	
    	MimeMultipart mimeMultipart = new MimeMultipart("related");

    	MimeBodyPart messageBodyPart = new MimeBodyPart();
        //String htmlText = "<H1>Hello</H1><img src=\"cid:image\">";
        messageBodyPart.setContent(strException, "text/html");
        mimeMultipart.addBodyPart(messageBodyPart);
        mimeMessage.setContent(mimeMultipart);
        
        mimeMessage.setSubject("Error:al enviar mail a direccion "+strMailsDestinatarios);	 
    	Transport.send(mimeMessage);
	}
	
	public static void resetearActivoClasses(ArrayList<Classe> classes) {
	    for(Classe classe:classes) {
	    	classe.blnActivo=true;
	    }
	}
	
	public static void manageException(org.apache.log4j.Logger logger,Exception e) throws Exception {
		try {
			logger.error("Exception:" + e.getMessage());
			
		} catch(Exception exc) {
			throw exc;
		}
	}
	
	public static void manageException(org.apache.log4j.Logger logger,StringBuilder stringBuilder,String sPath,String sAmbito,String sNombreProceso) throws Exception {
		try {
			//logger.error("Exception:" + stringBuilder.toString());
			
		} catch(Exception exc) {
			throw exc;
		}
	}
	
	//@SuppressWarnings("unchecked")
	@SuppressWarnings("rawtypes")
	public static Boolean existeClass(ArrayList<Classe> classes,Class classAux) {
		Boolean isExiste=false;
		
	    for(Classe classe:classes) {
	    	if(classe.clas.equals(classAux)) {
	    		isExiste=true;
	    	}
	    }
	    
	    return isExiste;
	}
	
	public static void logShowExceptionMessages(org.apache.log4j.Logger logger,Exception e) throws Exception {
		try {
			logger.error("Exception:" + e.getMessage());
			
		} catch(Exception exc) {
			throw exc;
		}
	}
	
	public static void logShowExceptionMessages(Exception ex) throws Exception {
		try {
			
			FileHandler fileHandler= new FileHandler(Constantes.SPATHLOGGIN+"log"+Funciones.getStringMySqlCurrentDate()+".log",1000000,10,true);
			fileHandler.setFormatter(new LogHtmlFormatter());
			    
			ConsoleHandler consoleHandler= new ConsoleHandler();
			consoleHandler.setFormatter(new SimpleFormatter());
	  		
			Logger.getLogger(Constantes.SLOGGINPACKAGEFILE).addHandler(fileHandler);
			Logger.getLogger(Constantes.SLOGGINPACKAGECONSOLE).addHandler(consoleHandler);
						
			Logger loggerFile = Logger.getLogger(Constantes.SLOGGINPACKAGEFILE); 
			
			Logger loggerConsole = Logger.getLogger(Constantes.SLOGGINPACKAGECONSOLE); 
			
			String strLineErrorConsole="";
			String strLineErrorFile="";
			
			Integer intLineNumber=1;
			
			StackTraceElement elements[] = ex.getStackTrace();
			
			for (int i = 0, n = elements.length; i < n; i++) {
			    if(!elements[i].isNativeMethod()) {
			    	strLineErrorConsole=intLineNumber+". File:"+elements[i].getFileName() + ",No Line:" 
			                      + elements[i].getLineNumber() 
			                      + " ,Method:" 
			                      + elements[i].getMethodName() + "(),Path:"+elements[i].toString();
			    	
			    	strLineErrorFile="<td>"+intLineNumber+"</td>"+"<td>"+elements[i].getFileName() +"</td>"+"<td>" 
                    + elements[i].getLineNumber() +"</td>"
                    + "<td>"
                    + elements[i].getMethodName() +"</td>"+ "<td>"+elements[i].toString()+"</td>";
  	
			         System.err.println(strLineErrorConsole);
			        
			    	 loggerConsole.log(Level.SEVERE,strLineErrorConsole);
			    	 
			    	 loggerFile.log(Level.SEVERE,strLineErrorFile);
			    	 
			    	 intLineNumber++;
			    }
			}
		} catch(Exception exc) {
			throw exc;
		}
	}
	
	public static String getStringMySqlCurrentDateTime() {
		Date date = new Date();
        
		String strDateTime="";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        
		strDateTime=dateFormat.format(date);
	     
		return strDateTime;
	}
	
	
	public static String getStringMySqlCurrentDate() {
		Date date = new Date();
        
		String strDateTime="";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        
		strDateTime=dateFormat.format(date);
	     
		return strDateTime;
	}
	
	public static String getStringAuditoriaAccion(AuditoriaAcciones auditoriaAccion) {
		String strAccion="";
		  
		if(auditoriaAccion.equals(AuditoriaAcciones.ACTUALIZAR)) {
			strAccion="Actualizar";
		} else if(auditoriaAccion.equals(AuditoriaAcciones.DEEPSAVE)) {
			strAccion="DeepSave";
		} else if(auditoriaAccion.equals(AuditoriaAcciones.ELIMINARLOGICAMENTE)) {
			strAccion="EliminarLogicamente";
		} else if(auditoriaAccion.equals(AuditoriaAcciones.ELIMINARFISICAMENTE)){ 
			strAccion="EliminarFisicamente";
		} else if(auditoriaAccion.equals(AuditoriaAcciones.NUEVO)) {
			strAccion="Nuevo";
		} else if(auditoriaAccion.equals(AuditoriaAcciones.OTRO)) {
			strAccion="Otro";
		}
		
		return strAccion;
	}
	
	public static String validarXml(String strXml) {
		String strXmlValidado="";
		strXmlValidado=strXml;
			
		return strXmlValidado;
	}
	
	public static String validarXml(String strXml,String strTableName) {
	     String strXmlValidado="";
	     
	     strXml=strXml.replace('&', ' ');	     
	     strXmlValidado=strXml;
	     
		return strXmlValidado;
	}
	
	public static String validarJson(String strJson,String strTableName) {
	     String strJsonValidado="";
	     
	     strJson=strJson.replace("\"", "'");
	     strJson=strJson.replace("\\r", "");
	     strJson=strJson.replace("\\n", "");
	     strJson=strJson.replace("\\'", "");
	     strJsonValidado=strJson;
	     
		return strJsonValidado;
	}
	
	public static Object validarCampoJson(Object objCampoJson,String strTableName) {
	     String strJsonValidado="";
	     String strCampoJson="";
	     
	     if(objCampoJson!=null&&objCampoJson.getClass()==String.class) {
	    	 strCampoJson=(String)objCampoJson;
		     strCampoJson=strCampoJson.replace("'", "");
		     strJsonValidado=strCampoJson;
		     
		     objCampoJson=strJsonValidado;
	     }
	     
		return objCampoJson;
	}
	
	public static String reemplazarCodigosHtmlReporte(String strTexto) {
		String strTextoReemplazado="";
	     
		if(strTexto.contains("8aacute")){strTexto=strTexto.replace("8aacute", "&aacute");}		
		if(strTexto.contains("8eacute")){strTexto=strTexto.replace("8eacute", "&eacute");}
		if(strTexto.contains("8iacute")){strTexto=strTexto.replace("8iacute", "&iacute");}	
		if(strTexto.contains("8oacute")){strTexto=strTexto.replace("8oacute", "&oacute");}		
		if(strTexto.contains("8uacute")){strTexto=strTexto.replace("8uacute", "&uacute");}		
		if(strTexto.contains("8#")){strTexto=strTexto.replace("8#", "&#");}		
		if(strTexto.contains("8Aacute")){strTexto=strTexto.replace("8Aacute", "&Aacute");}		
		if(strTexto.contains("8Eacute")){strTexto=strTexto.replace("8Eacute", "&Eacute");}		
		if(strTexto.contains("8Iacute")){strTexto=strTexto.replace("8Iacute", "&Iacute");}		
		if(strTexto.contains("8Oacute")){strTexto=strTexto.replace("8Oacute", "&Oacute");}		
		if(strTexto.contains("8Uacute")){strTexto=strTexto.replace("8Uacute", "&Uacute");}		
		if(strTexto.contains("[[")){strTexto=strTexto.replace("[[", "<");}		
		if(strTexto.contains("]]")){strTexto=strTexto.replace("]]", ">");}		
		if(strTexto.contains("8ntilde")){strTexto=strTexto.replace("8ntilde", "&ntilde");}		
		if(strTexto.contains("8Ntilde")){strTexto=strTexto.replace("8Ntilde", "&Ntilde");}	
		if(strTexto.contains("8iexcl")){strTexto=strTexto.replace("8iexcl", "&iexcl");}		
		if(strTexto.contains("8#33")){strTexto=strTexto.replace("8#33", "&#33");}	
		if(strTexto.contains("8iquest")){strTexto=strTexto.replace("8iquest", "&iquest");}		
		if(strTexto.contains("8#63")){strTexto=strTexto.replace("8#63", "&#63");}	
		if(strTexto.contains("8quot")){strTexto=strTexto.replace("8quot", "&quot");}
	     		
		if(strTexto.contains("8#32")){strTexto=strTexto.replace("8#32", "&#32");}
		if(strTexto.contains("8#33")){strTexto=strTexto.replace("8#33", "&#33");}
		if(strTexto.contains("8#34")){strTexto=strTexto.replace("8#34", "&#34");}
		if(strTexto.contains("8#35")){strTexto=strTexto.replace("8#35", "&#35");}
		if(strTexto.contains("8#36")){strTexto=strTexto.replace("8#36", "&#36");}
		if(strTexto.contains("8#37")){strTexto=strTexto.replace("8#37", "&#37");}
		if(strTexto.contains("8#38")){strTexto=strTexto.replace("8#38", "&#38");}
		if(strTexto.contains("8#39")){strTexto=strTexto.replace("8#39", "&#39");}
		if(strTexto.contains("8#40")){strTexto=strTexto.replace("8#40", "&#40");}
		if(strTexto.contains("8#41")){strTexto=strTexto.replace("8#41", "&#41");}
		if(strTexto.contains("8#42")){strTexto=strTexto.replace("8#42", "&#42");}
		if(strTexto.contains("8#43")){strTexto=strTexto.replace("8#43", "&#43");}
		if(strTexto.contains("8#44")){strTexto=strTexto.replace("8#44", "&#44");}
		if(strTexto.contains("8#45")){strTexto=strTexto.replace("8#45", "&#45");}
		if(strTexto.contains("8#46")){strTexto=strTexto.replace("8#46", "&#46");}
		if(strTexto.contains("8#47")){strTexto=strTexto.replace("8#47", "&#47");}
		if(strTexto.contains("8#48")){strTexto=strTexto.replace("8#48", "&#48");}
		if(strTexto.contains("8#49")){strTexto=strTexto.replace("8#49", "&#49");}
		if(strTexto.contains("8#50")){strTexto=strTexto.replace("8#50", "&#50");}
		if(strTexto.contains("8#51")){strTexto=strTexto.replace("8#51", "&#51");}
		if(strTexto.contains("8#52")){strTexto=strTexto.replace("8#52", "&#52");}
		if(strTexto.contains("8#53")){strTexto=strTexto.replace("8#53", "&#53");}
		if(strTexto.contains("8#54")){strTexto=strTexto.replace("8#54", "&#54");}
		if(strTexto.contains("8#55")){strTexto=strTexto.replace("8#55", "&#55");}
		if(strTexto.contains("8#56")){strTexto=strTexto.replace("8#56", "&#56");}
		if(strTexto.contains("8#57")){strTexto=strTexto.replace("8#57", "&#57");}
		if(strTexto.contains("8#58")){strTexto=strTexto.replace("8#58", "&#58");}
		if(strTexto.contains("8#59")){strTexto=strTexto.replace("8#59", "&#59");}
		if(strTexto.contains("8#60")){strTexto=strTexto.replace("8#60", "&#60");}
		if(strTexto.contains("8#61")){strTexto=strTexto.replace("8#61", "&#61");}
		if(strTexto.contains("8#62")){strTexto=strTexto.replace("8#62", "&#62");}
		if(strTexto.contains("8#63")){strTexto=strTexto.replace("8#63", "&#63");}
		if(strTexto.contains("8#64")){strTexto=strTexto.replace("8#64", "&#64");}
		if(strTexto.contains("8#65")){strTexto=strTexto.replace("8#65", "&#65");}
		if(strTexto.contains("8#66")){strTexto=strTexto.replace("8#66", "&#66");}
		if(strTexto.contains("8#67")){strTexto=strTexto.replace("8#67", "&#67");}
		if(strTexto.contains("8#68")){strTexto=strTexto.replace("8#68", "&#68");}
		if(strTexto.contains("8#69")){strTexto=strTexto.replace("8#69", "&#69");}
		if(strTexto.contains("8#70")){strTexto=strTexto.replace("8#70", "&#70");}
		if(strTexto.contains("8#71")){strTexto=strTexto.replace("8#71", "&#71");}
		if(strTexto.contains("8#72")){strTexto=strTexto.replace("8#72", "&#72");}
		if(strTexto.contains("8#73")){strTexto=strTexto.replace("8#73", "&#73");}
		if(strTexto.contains("8#74")){strTexto=strTexto.replace("8#74", "&#74");}
		if(strTexto.contains("8#75")){strTexto=strTexto.replace("8#75", "&#75");}
		if(strTexto.contains("8#76")){strTexto=strTexto.replace("8#76", "&#76");}
		if(strTexto.contains("8#77")){strTexto=strTexto.replace("8#77", "&#77");}
		if(strTexto.contains("8#78")){strTexto=strTexto.replace("8#78", "&#78");}
		if(strTexto.contains("8#79")){strTexto=strTexto.replace("8#79", "&#79");}
		if(strTexto.contains("8#80")){strTexto=strTexto.replace("8#80", "&#80");}
		if(strTexto.contains("8#81")){strTexto=strTexto.replace("8#81", "&#81");}
		if(strTexto.contains("8#82")){strTexto=strTexto.replace("8#82", "&#82");}
		if(strTexto.contains("8#83")){strTexto=strTexto.replace("8#83", "&#83");}
		if(strTexto.contains("8#84")){strTexto=strTexto.replace("8#84", "&#84");}
		if(strTexto.contains("8#85")){strTexto=strTexto.replace("8#85", "&#85");}
		if(strTexto.contains("8#86")){strTexto=strTexto.replace("8#86", "&#86");}
		if(strTexto.contains("8#87")){strTexto=strTexto.replace("8#87", "&#87");}
		if(strTexto.contains("8#88")){strTexto=strTexto.replace("8#88", "&#88");}
		if(strTexto.contains("8#89")){strTexto=strTexto.replace("8#89", "&#89");}
		if(strTexto.contains("8#90")){strTexto=strTexto.replace("8#90", "&#90");}
		if(strTexto.contains("8#91")){strTexto=strTexto.replace("8#91", "&#91");}
		if(strTexto.contains("8#92")){strTexto=strTexto.replace("8#92", "&#92");}
		if(strTexto.contains("8#93")){strTexto=strTexto.replace("8#93", "&#93");}
		if(strTexto.contains("8#94")){strTexto=strTexto.replace("8#94", "&#94");}
		if(strTexto.contains("8#95")){strTexto=strTexto.replace("8#95", "&#95");}
		if(strTexto.contains("8#96")){strTexto=strTexto.replace("8#96", "&#96");}
		if(strTexto.contains("8#97")){strTexto=strTexto.replace("8#97", "&#97");}
		if(strTexto.contains("8#98")){strTexto=strTexto.replace("8#98", "&#98");}
		if(strTexto.contains("8#99")){strTexto=strTexto.replace("8#99", "&#99");}
		if(strTexto.contains("8#100")){strTexto=strTexto.replace("8#100", "&#100");}
		if(strTexto.contains("8#101")){strTexto=strTexto.replace("8#101", "&#101");}
		if(strTexto.contains("8#102")){strTexto=strTexto.replace("8#102", "&#102");}
		if(strTexto.contains("8#103")){strTexto=strTexto.replace("8#103", "&#103");}
		if(strTexto.contains("8#104")){strTexto=strTexto.replace("8#104", "&#104");}
		if(strTexto.contains("8#105")){strTexto=strTexto.replace("8#105", "&#105");}
		if(strTexto.contains("8#106")){strTexto=strTexto.replace("8#106", "&#106");}
		if(strTexto.contains("8#107")){strTexto=strTexto.replace("8#107", "&#107");}
		if(strTexto.contains("8#108")){strTexto=strTexto.replace("8#108", "&#108");}
		if(strTexto.contains("8#109")){strTexto=strTexto.replace("8#109", "&#109");}
		if(strTexto.contains("8#110")){strTexto=strTexto.replace("8#110", "&#110");}
		if(strTexto.contains("8#111")){strTexto=strTexto.replace("8#111", "&#111");}
		if(strTexto.contains("8#112")){strTexto=strTexto.replace("8#112", "&#112");}
		if(strTexto.contains("8#113")){strTexto=strTexto.replace("8#113", "&#113");}
		if(strTexto.contains("8#114")){strTexto=strTexto.replace("8#114", "&#114");}
		if(strTexto.contains("8#115")){strTexto=strTexto.replace("8#115", "&#115");}
		if(strTexto.contains("8#116")){strTexto=strTexto.replace("8#116", "&#116");}
		if(strTexto.contains("8#117")){strTexto=strTexto.replace("8#117", "&#117");}
		if(strTexto.contains("8#118")){strTexto=strTexto.replace("8#118", "&#118");}
		if(strTexto.contains("8#119")){strTexto=strTexto.replace("8#119", "&#119");}
		if(strTexto.contains("8#120")){strTexto=strTexto.replace("8#120", "&#120");}
		if(strTexto.contains("8#121")){strTexto=strTexto.replace("8#121", "&#121");}
		if(strTexto.contains("8#122")){strTexto=strTexto.replace("8#122", "&#122");}
		if(strTexto.contains("8#123")){strTexto=strTexto.replace("8#123", "&#123");}
		if(strTexto.contains("8#124")){strTexto=strTexto.replace("8#124", "&#124");}
		if(strTexto.contains("8#125")){strTexto=strTexto.replace("8#125", "&#125");}
		if(strTexto.contains("8#126")){strTexto=strTexto.replace("8#126", "&#126");}
		if(strTexto.contains("8#127")){strTexto=strTexto.replace("8#127", "&#127");}
		if(strTexto.contains("8#128")){strTexto=strTexto.replace("8#128", "&#128");}
		if(strTexto.contains("8#129")){strTexto=strTexto.replace("8#129", "&#129");}
		if(strTexto.contains("8#130")){strTexto=strTexto.replace("8#130", "&#130");}
		if(strTexto.contains("8#131")){strTexto=strTexto.replace("8#131", "&#131");}
		if(strTexto.contains("8#132")){strTexto=strTexto.replace("8#132", "&#132");}
		if(strTexto.contains("8#133")){strTexto=strTexto.replace("8#133", "&#133");}
		if(strTexto.contains("8#134")){strTexto=strTexto.replace("8#134", "&#134");}
		if(strTexto.contains("8#135")){strTexto=strTexto.replace("8#135", "&#135");}
		if(strTexto.contains("8#136")){strTexto=strTexto.replace("8#136", "&#136");}
		if(strTexto.contains("8#137")){strTexto=strTexto.replace("8#137", "&#137");}
		if(strTexto.contains("8#138")){strTexto=strTexto.replace("8#138", "&#138");}
		if(strTexto.contains("8#139")){strTexto=strTexto.replace("8#139", "&#139");}
		if(strTexto.contains("8#140")){strTexto=strTexto.replace("8#140", "&#140");}
		if(strTexto.contains("8#141")){strTexto=strTexto.replace("8#141", "&#141");}
		if(strTexto.contains("8#142")){strTexto=strTexto.replace("8#142", "&#142");}
		if(strTexto.contains("8#143")){strTexto=strTexto.replace("8#143", "&#143");}
		if(strTexto.contains("8#144")){strTexto=strTexto.replace("8#144", "&#144");}
		if(strTexto.contains("8#145")){strTexto=strTexto.replace("8#145", "&#145");}
		if(strTexto.contains("8#146")){strTexto=strTexto.replace("8#146", "&#146");}
		if(strTexto.contains("8#147")){strTexto=strTexto.replace("8#147", "&#147");}
		if(strTexto.contains("8#148")){strTexto=strTexto.replace("8#148", "&#148");}
		if(strTexto.contains("8#149")){strTexto=strTexto.replace("8#149", "&#149");}
		if(strTexto.contains("8#150")){strTexto=strTexto.replace("8#150", "&#150");}
		if(strTexto.contains("8#151")){strTexto=strTexto.replace("8#151", "&#151");}
		if(strTexto.contains("8#152")){strTexto=strTexto.replace("8#152", "&#152");}
		if(strTexto.contains("8#153")){strTexto=strTexto.replace("8#153", "&#153");}
		if(strTexto.contains("8#154")){strTexto=strTexto.replace("8#154", "&#154");}
		if(strTexto.contains("8#155")){strTexto=strTexto.replace("8#155", "&#155");}
		if(strTexto.contains("8#156")){strTexto=strTexto.replace("8#156", "&#156");}
		if(strTexto.contains("8#157")){strTexto=strTexto.replace("8#157", "&#157");}
		if(strTexto.contains("8#158")){strTexto=strTexto.replace("8#158", "&#158");}
		if(strTexto.contains("8#159")){strTexto=strTexto.replace("8#159", "&#159");}
		if(strTexto.contains("8#160")){strTexto=strTexto.replace("8#160", "&#160");}
		if(strTexto.contains("8#161")){strTexto=strTexto.replace("8#161", "&#161");}
		if(strTexto.contains("8#162")){strTexto=strTexto.replace("8#162", "&#162");}
		if(strTexto.contains("8#163")){strTexto=strTexto.replace("8#163", "&#163");}
		if(strTexto.contains("8#164")){strTexto=strTexto.replace("8#164", "&#164");}
		if(strTexto.contains("8#165")){strTexto=strTexto.replace("8#165", "&#165");}
		if(strTexto.contains("8#166")){strTexto=strTexto.replace("8#166", "&#166");}
		if(strTexto.contains("8#167")){strTexto=strTexto.replace("8#167", "&#167");}
		if(strTexto.contains("8#168")){strTexto=strTexto.replace("8#168", "&#168");}
		if(strTexto.contains("8#169")){strTexto=strTexto.replace("8#169", "&#169");}
		if(strTexto.contains("8#170")){strTexto=strTexto.replace("8#170", "&#170");}
		if(strTexto.contains("8#171")){strTexto=strTexto.replace("8#171", "&#171");}
		if(strTexto.contains("8#172")){strTexto=strTexto.replace("8#172", "&#172");}
		if(strTexto.contains("8#173")){strTexto=strTexto.replace("8#173", "&#173");}
		if(strTexto.contains("8#174")){strTexto=strTexto.replace("8#174", "&#174");}
		if(strTexto.contains("8#175")){strTexto=strTexto.replace("8#175", "&#175");}
		if(strTexto.contains("8#176")){strTexto=strTexto.replace("8#176", "&#176");}
		if(strTexto.contains("8#177")){strTexto=strTexto.replace("8#177", "&#177");}
		if(strTexto.contains("8#178")){strTexto=strTexto.replace("8#178", "&#178");}
		if(strTexto.contains("8#179")){strTexto=strTexto.replace("8#179", "&#179");}
		if(strTexto.contains("8#180")){strTexto=strTexto.replace("8#180", "&#180");}
		if(strTexto.contains("8#181")){strTexto=strTexto.replace("8#181", "&#181");}
		if(strTexto.contains("8#182")){strTexto=strTexto.replace("8#182", "&#182");}
		if(strTexto.contains("8#183")){strTexto=strTexto.replace("8#183", "&#183");}
		if(strTexto.contains("8#184")){strTexto=strTexto.replace("8#184", "&#184");}
		if(strTexto.contains("8#185")){strTexto=strTexto.replace("8#185", "&#185");}
		if(strTexto.contains("8#186")){strTexto=strTexto.replace("8#186", "&#186");}
		if(strTexto.contains("8#187")){strTexto=strTexto.replace("8#187", "&#187");}
		if(strTexto.contains("8#188")){strTexto=strTexto.replace("8#188", "&#188");}
		if(strTexto.contains("8#189")){strTexto=strTexto.replace("8#189", "&#189");}
		if(strTexto.contains("8#190")){strTexto=strTexto.replace("8#190", "&#190");}
		if(strTexto.contains("8#191")){strTexto=strTexto.replace("8#191", "&#191");}
		if(strTexto.contains("8#192")){strTexto=strTexto.replace("8#192", "&#192");}
		if(strTexto.contains("8#193")){strTexto=strTexto.replace("8#193", "&#193");}
		if(strTexto.contains("8#194")){strTexto=strTexto.replace("8#194", "&#194");}
		if(strTexto.contains("8#195")){strTexto=strTexto.replace("8#195", "&#195");}
		if(strTexto.contains("8#196")){strTexto=strTexto.replace("8#196", "&#196");}
		if(strTexto.contains("8#197")){strTexto=strTexto.replace("8#197", "&#197");}
		if(strTexto.contains("8#198")){strTexto=strTexto.replace("8#198", "&#198");}
		if(strTexto.contains("8#199")){strTexto=strTexto.replace("8#199", "&#199");}
		if(strTexto.contains("8#200")){strTexto=strTexto.replace("8#200", "&#200");}
		if(strTexto.contains("8#201")){strTexto=strTexto.replace("8#201", "&#201");}
		if(strTexto.contains("8#202")){strTexto=strTexto.replace("8#202", "&#202");}
		if(strTexto.contains("8#203")){strTexto=strTexto.replace("8#203", "&#203");}
		if(strTexto.contains("8#204")){strTexto=strTexto.replace("8#204", "&#204");}
		if(strTexto.contains("8#205")){strTexto=strTexto.replace("8#205", "&#205");}
		if(strTexto.contains("8#206")){strTexto=strTexto.replace("8#206", "&#206");}
		if(strTexto.contains("8#207")){strTexto=strTexto.replace("8#207", "&#207");}
		if(strTexto.contains("8#208")){strTexto=strTexto.replace("8#208", "&#208");}
		if(strTexto.contains("8#209")){strTexto=strTexto.replace("8#209", "&#209");}
		if(strTexto.contains("8#210")){strTexto=strTexto.replace("8#210", "&#210");}
		if(strTexto.contains("8#211")){strTexto=strTexto.replace("8#211", "&#211");}
		if(strTexto.contains("8#212")){strTexto=strTexto.replace("8#212", "&#212");}
		if(strTexto.contains("8#213")){strTexto=strTexto.replace("8#213", "&#213");}
		if(strTexto.contains("8#214")){strTexto=strTexto.replace("8#214", "&#214");}
		if(strTexto.contains("8#215")){strTexto=strTexto.replace("8#215", "&#215");}
		if(strTexto.contains("8#216")){strTexto=strTexto.replace("8#216", "&#216");}
		if(strTexto.contains("8#217")){strTexto=strTexto.replace("8#217", "&#217");}
		if(strTexto.contains("8#218")){strTexto=strTexto.replace("8#218", "&#218");}
		if(strTexto.contains("8#219")){strTexto=strTexto.replace("8#219", "&#219");}
		if(strTexto.contains("8#220")){strTexto=strTexto.replace("8#220", "&#220");}
		if(strTexto.contains("8#221")){strTexto=strTexto.replace("8#221", "&#221");}
		if(strTexto.contains("8#222")){strTexto=strTexto.replace("8#222", "&#222");}
		if(strTexto.contains("8#223")){strTexto=strTexto.replace("8#223", "&#223");}
		if(strTexto.contains("8#224")){strTexto=strTexto.replace("8#224", "&#224");}
		if(strTexto.contains("8#225")){strTexto=strTexto.replace("8#225", "&#225");}
		if(strTexto.contains("8#226")){strTexto=strTexto.replace("8#226", "&#226");}
		if(strTexto.contains("8#227")){strTexto=strTexto.replace("8#227", "&#227");}
		if(strTexto.contains("8#228")){strTexto=strTexto.replace("8#228", "&#228");}
		if(strTexto.contains("8#229")){strTexto=strTexto.replace("8#229", "&#229");}
		if(strTexto.contains("8#230")){strTexto=strTexto.replace("8#230", "&#230");}
		if(strTexto.contains("8#231")){strTexto=strTexto.replace("8#231", "&#231");}
		if(strTexto.contains("8#232")){strTexto=strTexto.replace("8#232", "&#232");}
		if(strTexto.contains("8#233")){strTexto=strTexto.replace("8#233", "&#233");}
		if(strTexto.contains("8#234")){strTexto=strTexto.replace("8#234", "&#234");}
		if(strTexto.contains("8#235")){strTexto=strTexto.replace("8#235", "&#235");}
		if(strTexto.contains("8#236")){strTexto=strTexto.replace("8#236", "&#236");}
		if(strTexto.contains("8#237")){strTexto=strTexto.replace("8#237", "&#237");}
		if(strTexto.contains("8#238")){strTexto=strTexto.replace("8#238", "&#238");}
		if(strTexto.contains("8#239")){strTexto=strTexto.replace("8#239", "&#239");}
		if(strTexto.contains("8#240")){strTexto=strTexto.replace("8#240", "&#240");}
		if(strTexto.contains("8#241")){strTexto=strTexto.replace("8#241", "&#241");}
		if(strTexto.contains("8#242")){strTexto=strTexto.replace("8#242", "&#242");}
		if(strTexto.contains("8#243")){strTexto=strTexto.replace("8#243", "&#243");}
		if(strTexto.contains("8#244")){strTexto=strTexto.replace("8#244", "&#244");}
		if(strTexto.contains("8#245")){strTexto=strTexto.replace("8#245", "&#245");}
		if(strTexto.contains("8#246")){strTexto=strTexto.replace("8#246", "&#246");}
		if(strTexto.contains("8#247")){strTexto=strTexto.replace("8#247", "&#247");}
		if(strTexto.contains("8#248")){strTexto=strTexto.replace("8#248", "&#248");}
		if(strTexto.contains("8#249")){strTexto=strTexto.replace("8#249", "&#249");}
		if(strTexto.contains("8#250")){strTexto=strTexto.replace("8#250", "&#250");}
		if(strTexto.contains("8#251")){strTexto=strTexto.replace("8#251", "&#251");}
		if(strTexto.contains("8#252")){strTexto=strTexto.replace("8#252", "&#252");}
		if(strTexto.contains("8#253")){strTexto=strTexto.replace("8#253", "&#253");}
		if(strTexto.contains("8#254")){strTexto=strTexto.replace("8#254", "&#254");}
		if(strTexto.contains("8#255")){strTexto=strTexto.replace("8#255", "&#255");}
		if(strTexto.contains("8#338")){strTexto=strTexto.replace("8#338", "&#338");}
		if(strTexto.contains("8#339")){strTexto=strTexto.replace("8#339", "&#339");}
		if(strTexto.contains("8#352")){strTexto=strTexto.replace("8#352", "&#352");}
		if(strTexto.contains("8#353")){strTexto=strTexto.replace("8#353", "&#353");}
		if(strTexto.contains("8#376")){strTexto=strTexto.replace("8#376", "&#376");}
		if(strTexto.contains("8#402")){strTexto=strTexto.replace("8#402", "&#402");}
		if(strTexto.contains("8#8211")){strTexto=strTexto.replace("8#8211", "&#8211");}
		if(strTexto.contains("8#8212")){strTexto=strTexto.replace("8#8212", "&#8212");}
		if(strTexto.contains("8#8216")){strTexto=strTexto.replace("8#8216", "&#8216");}
		if(strTexto.contains("8#8217")){strTexto=strTexto.replace("8#8217", "&#8217");}
		if(strTexto.contains("8#8218")){strTexto=strTexto.replace("8#8218", "&#8218");}
		if(strTexto.contains("8#8220")){strTexto=strTexto.replace("8#8220", "&#8220");}
		if(strTexto.contains("8#8221")){strTexto=strTexto.replace("8#8221", "&#8221");}
		if(strTexto.contains("8#8222")){strTexto=strTexto.replace("8#8222", "&#8222");}
		if(strTexto.contains("8#8224")){strTexto=strTexto.replace("8#8224", "&#8224");}
		if(strTexto.contains("8#8225")){strTexto=strTexto.replace("8#8225", "&#8225");}
		if(strTexto.contains("8#8226")){strTexto=strTexto.replace("8#8226", "&#8226");}
		if(strTexto.contains("8#8230")){strTexto=strTexto.replace("8#8230", "&#8230");}
		if(strTexto.contains("8#8240")){strTexto=strTexto.replace("8#8240", "&#8240");}
		if(strTexto.contains("8#8364")){strTexto=strTexto.replace("8#8364", "&#8364");}
		if(strTexto.contains("8#8482")){strTexto=strTexto.replace("8#8482", "&#8482");}

	    strTextoReemplazado=strTexto; 
	     
		return strTextoReemplazado;
	}
	
	public static String reemplazarCodigosXmlReporte(String strTexto) {
		String strTextoReemplazado="";
	     
		if(strTexto.contains("8aacute")){strTexto=strTexto.replace("8aacute", "�");	}		
		if(strTexto.contains("8eacute")){strTexto=strTexto.replace("8eacute", "�");}	
		if(strTexto.contains("8iacute")){strTexto=strTexto.replace("8iacute", "�");}	
		if(strTexto.contains("8oacute")){strTexto=strTexto.replace("8oacute", "�");}	
		if(strTexto.contains("8uacute")){strTexto=strTexto.replace("8uacute", "�");}
		if(strTexto.contains("8#")){strTexto=strTexto.replace("8#", "&#");}
		if(strTexto.contains("8Aacute")){strTexto=strTexto.replace("8Aacute", "�");}
		if(strTexto.contains("8Eacute")){strTexto=strTexto.replace("8Eacute", "�");}
		if(strTexto.contains("8Iacute")){strTexto=strTexto.replace("8Iacute", "�");}
		if(strTexto.contains("8Oacute")){strTexto=strTexto.replace("8Oacute", "�");}
		if(strTexto.contains("8Uacute")){strTexto=strTexto.replace("8Uacute", "�");}
		if(strTexto.contains("[[")){strTexto=strTexto.replace("[[", "<");}
		if(strTexto.contains("]]")){strTexto=strTexto.replace("]]", ">");}
		if(strTexto.contains("</br>")){	strTexto=strTexto.replace("</br>", "\n");}
		if(strTexto.contains("8ntilde")){strTexto=strTexto.replace("8ntilde", "�");}
		if(strTexto.contains("8Ntilde")){strTexto=strTexto.replace("8Ntilde", "�");}
		if(strTexto.contains("8iexcl"))	{strTexto=strTexto.replace("8iexcl", "�");}
		if(strTexto.contains("8#33")){strTexto=strTexto.replace("8#33", "!");}
		if(strTexto.contains("8iquest")){strTexto=strTexto.replace("8iquest", "�");}
		if(strTexto.contains("8#63")){strTexto=strTexto.replace("8#63", "?");}
		if(strTexto.contains("8quot")){strTexto=strTexto.replace("8quot", "\"");}
				
		if(strTexto.contains("8#32")){strTexto=strTexto.replace("8#32", "");}
		if(strTexto.contains("8#33")){strTexto=strTexto.replace("8#33", "!");}
		if(strTexto.contains("8#34")){strTexto=strTexto.replace("8#34", "\"");}
		if(strTexto.contains("8#35")){strTexto=strTexto.replace("8#35", "#");}
		if(strTexto.contains("8#36")){strTexto=strTexto.replace("8#36", "$");}
		if(strTexto.contains("8#37")){strTexto=strTexto.replace("8#37", "%");}
		if(strTexto.contains("8#38")){strTexto=strTexto.replace("8#38", "&");}
		if(strTexto.contains("8#39")){strTexto=strTexto.replace("8#39", "'");}
		if(strTexto.contains("8#40")){strTexto=strTexto.replace("8#40", "(");}
		if(strTexto.contains("8#41")){strTexto=strTexto.replace("8#41", ")");}
		if(strTexto.contains("8#42")){strTexto=strTexto.replace("8#42", "*");}
		if(strTexto.contains("8#43")){strTexto=strTexto.replace("8#43", "+");}
		if(strTexto.contains("8#44")){strTexto=strTexto.replace("8#44", ",");}
		if(strTexto.contains("8#45")){strTexto=strTexto.replace("8#45", "-");}
		if(strTexto.contains("8#46")){strTexto=strTexto.replace("8#46", ".");}
		if(strTexto.contains("8#47")){strTexto=strTexto.replace("8#47", "/");}
		if(strTexto.contains("8#48")){strTexto=strTexto.replace("8#48", "0");}
		if(strTexto.contains("8#49")){strTexto=strTexto.replace("8#49", "1");}
		if(strTexto.contains("8#50")){strTexto=strTexto.replace("8#50", "2");}
		if(strTexto.contains("8#51")){strTexto=strTexto.replace("8#51", "3");}
		if(strTexto.contains("8#52")){strTexto=strTexto.replace("8#52", "4");}
		if(strTexto.contains("8#53")){strTexto=strTexto.replace("8#53", "5");}
		if(strTexto.contains("8#54")){strTexto=strTexto.replace("8#54", "6");}
		if(strTexto.contains("8#55")){strTexto=strTexto.replace("8#55", "7");}
		if(strTexto.contains("8#56")){strTexto=strTexto.replace("8#56", "8");}
		if(strTexto.contains("8#57")){strTexto=strTexto.replace("8#57", "9");}
		if(strTexto.contains("8#58")){strTexto=strTexto.replace("8#58", ":");}
		if(strTexto.contains("8#59")){strTexto=strTexto.replace("8#59", ";");}
		if(strTexto.contains("8#60")){strTexto=strTexto.replace("8#60", "<");}
		if(strTexto.contains("8#61")){strTexto=strTexto.replace("8#61", "=");}
		if(strTexto.contains("8#62")){strTexto=strTexto.replace("8#62", ">");}
		if(strTexto.contains("8#63")){strTexto=strTexto.replace("8#63", "?");}
		if(strTexto.contains("8#64")){strTexto=strTexto.replace("8#64", "@");}
		if(strTexto.contains("8#65")){strTexto=strTexto.replace("8#65", "A");}
		if(strTexto.contains("8#66")){strTexto=strTexto.replace("8#66", "B");}
		if(strTexto.contains("8#67")){strTexto=strTexto.replace("8#67", "C");}
		if(strTexto.contains("8#68")){strTexto=strTexto.replace("8#68", "D");}
		if(strTexto.contains("8#69")){strTexto=strTexto.replace("8#69", "E");}
		if(strTexto.contains("8#70")){strTexto=strTexto.replace("8#70", "F");}
		if(strTexto.contains("8#71")){strTexto=strTexto.replace("8#71", "G");}
		if(strTexto.contains("8#72")){strTexto=strTexto.replace("8#72", "H");}
		if(strTexto.contains("8#73")){strTexto=strTexto.replace("8#73", "I");}
		if(strTexto.contains("8#74")){strTexto=strTexto.replace("8#74", "J");}
		if(strTexto.contains("8#75")){strTexto=strTexto.replace("8#75", "K");}
		if(strTexto.contains("8#76")){strTexto=strTexto.replace("8#76", "L");}
		if(strTexto.contains("8#77")){strTexto=strTexto.replace("8#77", "M");}
		if(strTexto.contains("8#78")){strTexto=strTexto.replace("8#78", "N");}
		if(strTexto.contains("8#79")){strTexto=strTexto.replace("8#79", "O");}
		if(strTexto.contains("8#80")){strTexto=strTexto.replace("8#80", "P");}
		if(strTexto.contains("8#81")){strTexto=strTexto.replace("8#81", "Q");}
		if(strTexto.contains("8#82")){strTexto=strTexto.replace("8#82", "R");}
		if(strTexto.contains("8#83")){strTexto=strTexto.replace("8#83", "S");}
		if(strTexto.contains("8#84")){strTexto=strTexto.replace("8#84", "T");}
		if(strTexto.contains("8#85")){strTexto=strTexto.replace("8#85", "U");}
		if(strTexto.contains("8#86")){strTexto=strTexto.replace("8#86", "V");}
		if(strTexto.contains("8#87")){strTexto=strTexto.replace("8#87", "W");}
		if(strTexto.contains("8#88")){strTexto=strTexto.replace("8#88", "X");}
		if(strTexto.contains("8#89")){strTexto=strTexto.replace("8#89", "Y");}
		if(strTexto.contains("8#90")){strTexto=strTexto.replace("8#90", "Z");}
		if(strTexto.contains("8#91")){strTexto=strTexto.replace("8#91", "[");}
		if(strTexto.contains("8#92")){strTexto=strTexto.replace("8#92", "\\");}
		if(strTexto.contains("8#93")){strTexto=strTexto.replace("8#93", "]");}
		if(strTexto.contains("8#94")){strTexto=strTexto.replace("8#94", "^");}
		if(strTexto.contains("8#95")){strTexto=strTexto.replace("8#95", "_");}
		if(strTexto.contains("8#96")){strTexto=strTexto.replace("8#96", "`");}
		if(strTexto.contains("8#97")){strTexto=strTexto.replace("8#97", "a");}
		if(strTexto.contains("8#98")){strTexto=strTexto.replace("8#98", "b");}
		if(strTexto.contains("8#99")){strTexto=strTexto.replace("8#99", "c");}
		if(strTexto.contains("8#100")){strTexto=strTexto.replace("8#100", "d");}
		if(strTexto.contains("8#101")){strTexto=strTexto.replace("8#101", "e");}
		if(strTexto.contains("8#102")){strTexto=strTexto.replace("8#102", "f");}
		if(strTexto.contains("8#103")){strTexto=strTexto.replace("8#103", "g");}
		if(strTexto.contains("8#104")){strTexto=strTexto.replace("8#104", "h");}
		if(strTexto.contains("8#105")){strTexto=strTexto.replace("8#105", "i");}
		if(strTexto.contains("8#106")){strTexto=strTexto.replace("8#106", "j");}
		if(strTexto.contains("8#107")){strTexto=strTexto.replace("8#107", "k");}
		if(strTexto.contains("8#108")){strTexto=strTexto.replace("8#108", "l");}
		if(strTexto.contains("8#109")){strTexto=strTexto.replace("8#109", "m");}
		if(strTexto.contains("8#110")){strTexto=strTexto.replace("8#110", "n");}
		if(strTexto.contains("8#111")){strTexto=strTexto.replace("8#111", "o");}
		if(strTexto.contains("8#112")){strTexto=strTexto.replace("8#112", "p");}
		if(strTexto.contains("8#113")){strTexto=strTexto.replace("8#113", "q");}
		if(strTexto.contains("8#114")){strTexto=strTexto.replace("8#114", "r");}
		if(strTexto.contains("8#115")){strTexto=strTexto.replace("8#115", "s");}
		if(strTexto.contains("8#116")){strTexto=strTexto.replace("8#116", "t");}
		if(strTexto.contains("8#117")){strTexto=strTexto.replace("8#117", "u");}
		if(strTexto.contains("8#118")){strTexto=strTexto.replace("8#118", "v");}
		if(strTexto.contains("8#119")){strTexto=strTexto.replace("8#119", "w");}
		if(strTexto.contains("8#120")){strTexto=strTexto.replace("8#120", "x");}
		if(strTexto.contains("8#121")){strTexto=strTexto.replace("8#121", "y");}
		if(strTexto.contains("8#122")){strTexto=strTexto.replace("8#122", "z");}
		if(strTexto.contains("8#123")){strTexto=strTexto.replace("8#123", "{");}
		if(strTexto.contains("8#124")){strTexto=strTexto.replace("8#124", "|");}
		if(strTexto.contains("8#125")){strTexto=strTexto.replace("8#125", "}");}
		if(strTexto.contains("8#126")){strTexto=strTexto.replace("8#126", "~");}
		if(strTexto.contains("8#127")){strTexto=strTexto.replace("8#127", "");}
		if(strTexto.contains("8#128")){strTexto=strTexto.replace("8#128", "");}
		if(strTexto.contains("8#129")){strTexto=strTexto.replace("8#129", "");}
		if(strTexto.contains("8#130")){strTexto=strTexto.replace("8#130", "");}
		if(strTexto.contains("8#131")){strTexto=strTexto.replace("8#131", "");}
		if(strTexto.contains("8#132")){strTexto=strTexto.replace("8#132", "");}
		if(strTexto.contains("8#133")){strTexto=strTexto.replace("8#133", "");}
		if(strTexto.contains("8#134")){strTexto=strTexto.replace("8#134", "");}
		if(strTexto.contains("8#135")){strTexto=strTexto.replace("8#135", "");}
		if(strTexto.contains("8#136")){strTexto=strTexto.replace("8#136", "");}
		if(strTexto.contains("8#137")){strTexto=strTexto.replace("8#137", "");}
		if(strTexto.contains("8#138")){strTexto=strTexto.replace("8#138", "");}
		if(strTexto.contains("8#139")){strTexto=strTexto.replace("8#139", "");}
		if(strTexto.contains("8#140")){strTexto=strTexto.replace("8#140", "");}
		if(strTexto.contains("8#141")){strTexto=strTexto.replace("8#141", "");}
		if(strTexto.contains("8#142")){strTexto=strTexto.replace("8#142", "");}
		if(strTexto.contains("8#143")){strTexto=strTexto.replace("8#143", "");}
		if(strTexto.contains("8#144")){strTexto=strTexto.replace("8#144", "");}
		if(strTexto.contains("8#145")){strTexto=strTexto.replace("8#145", "");}
		if(strTexto.contains("8#146")){strTexto=strTexto.replace("8#146", "");}
		if(strTexto.contains("8#147")){strTexto=strTexto.replace("8#147", "");}
		if(strTexto.contains("8#148")){strTexto=strTexto.replace("8#148", "");}
		if(strTexto.contains("8#149")){strTexto=strTexto.replace("8#149", "");}
		if(strTexto.contains("8#150")){strTexto=strTexto.replace("8#150", "");}
		if(strTexto.contains("8#151")){strTexto=strTexto.replace("8#151", "");}
		if(strTexto.contains("8#152")){strTexto=strTexto.replace("8#152", "");}
		if(strTexto.contains("8#153")){strTexto=strTexto.replace("8#153", "");}
		if(strTexto.contains("8#154")){strTexto=strTexto.replace("8#154", "");}
		if(strTexto.contains("8#155")){strTexto=strTexto.replace("8#155", "");}
		if(strTexto.contains("8#156")){strTexto=strTexto.replace("8#156", "");}
		if(strTexto.contains("8#157")){strTexto=strTexto.replace("8#157", "");}
		if(strTexto.contains("8#158")){strTexto=strTexto.replace("8#158", "");}
		if(strTexto.contains("8#159")){strTexto=strTexto.replace("8#159", "");}
		if(strTexto.contains("8#160")){strTexto=strTexto.replace("8#160", "");}
		if(strTexto.contains("8#161")){strTexto=strTexto.replace("8#161", "�");}
		if(strTexto.contains("8#162")){strTexto=strTexto.replace("8#162", "�");}
		if(strTexto.contains("8#163")){strTexto=strTexto.replace("8#163", "�");}
		if(strTexto.contains("8#164")){strTexto=strTexto.replace("8#164", "�");}
		if(strTexto.contains("8#165")){strTexto=strTexto.replace("8#165", "�");}
		if(strTexto.contains("8#166")){strTexto=strTexto.replace("8#166", "�");}
		if(strTexto.contains("8#167")){strTexto=strTexto.replace("8#167", "�");}
		if(strTexto.contains("8#168")){strTexto=strTexto.replace("8#168", "�");}
		if(strTexto.contains("8#169")){strTexto=strTexto.replace("8#169", "�");}
		if(strTexto.contains("8#170")){strTexto=strTexto.replace("8#170", "�");}
		if(strTexto.contains("8#171")){strTexto=strTexto.replace("8#171", "�");}
		if(strTexto.contains("8#172")){strTexto=strTexto.replace("8#172", "�");}
		if(strTexto.contains("8#173")){strTexto=strTexto.replace("8#173", "�");}
		if(strTexto.contains("8#174")){strTexto=strTexto.replace("8#174", "�");}
		if(strTexto.contains("8#175")){strTexto=strTexto.replace("8#175", "�");}
		if(strTexto.contains("8#176")){strTexto=strTexto.replace("8#176", "�");}
		if(strTexto.contains("8#177")){strTexto=strTexto.replace("8#177", "�");}
		if(strTexto.contains("8#178")){strTexto=strTexto.replace("8#178", "�");}
		if(strTexto.contains("8#179")){strTexto=strTexto.replace("8#179", "�");}
		if(strTexto.contains("8#180")){strTexto=strTexto.replace("8#180", "�");}
		if(strTexto.contains("8#181")){strTexto=strTexto.replace("8#181", "�");}
		if(strTexto.contains("8#182")){strTexto=strTexto.replace("8#182", "�");}
		if(strTexto.contains("8#183")){strTexto=strTexto.replace("8#183", "�");}
		if(strTexto.contains("8#184")){strTexto=strTexto.replace("8#184", "�");}
		if(strTexto.contains("8#185")){strTexto=strTexto.replace("8#185", "�");}
		if(strTexto.contains("8#186")){strTexto=strTexto.replace("8#186", "�");}
		if(strTexto.contains("8#187")){strTexto=strTexto.replace("8#187", "�");}
		if(strTexto.contains("8#188")){strTexto=strTexto.replace("8#188", "�");}
		if(strTexto.contains("8#189")){strTexto=strTexto.replace("8#189", "�");}
		if(strTexto.contains("8#190")){strTexto=strTexto.replace("8#190", "�");}
		if(strTexto.contains("8#191")){strTexto=strTexto.replace("8#191", "�");}
		if(strTexto.contains("8#192")){strTexto=strTexto.replace("8#192", "�");}
		if(strTexto.contains("8#193")){strTexto=strTexto.replace("8#193", "�");}
		if(strTexto.contains("8#194")){strTexto=strTexto.replace("8#194", "�");}
		if(strTexto.contains("8#195")){strTexto=strTexto.replace("8#195", "�");}
		if(strTexto.contains("8#196")){strTexto=strTexto.replace("8#196", "�");}
		if(strTexto.contains("8#197")){strTexto=strTexto.replace("8#197", "�");}
		if(strTexto.contains("8#198")){strTexto=strTexto.replace("8#198", "�");}
		if(strTexto.contains("8#199")){strTexto=strTexto.replace("8#199", "�");}
		if(strTexto.contains("8#200")){strTexto=strTexto.replace("8#200", "�");}
		if(strTexto.contains("8#201")){strTexto=strTexto.replace("8#201", "�");}
		if(strTexto.contains("8#202")){strTexto=strTexto.replace("8#202", "�");}
		if(strTexto.contains("8#203")){strTexto=strTexto.replace("8#203", "�");}
		if(strTexto.contains("8#204")){strTexto=strTexto.replace("8#204", "�");}
		if(strTexto.contains("8#205")){strTexto=strTexto.replace("8#205", "�");}
		if(strTexto.contains("8#206")){strTexto=strTexto.replace("8#206", "�");}
		if(strTexto.contains("8#207")){strTexto=strTexto.replace("8#207", "�");}
		if(strTexto.contains("8#208")){strTexto=strTexto.replace("8#208", "�");}
		if(strTexto.contains("8#209")){strTexto=strTexto.replace("8#209", "�");}
		if(strTexto.contains("8#210")){strTexto=strTexto.replace("8#210", "�");}
		if(strTexto.contains("8#211")){strTexto=strTexto.replace("8#211", "�");}
		if(strTexto.contains("8#212")){strTexto=strTexto.replace("8#212", "�");}
		if(strTexto.contains("8#213")){strTexto=strTexto.replace("8#213", "�");}
		if(strTexto.contains("8#214")){strTexto=strTexto.replace("8#214", "�");}
		if(strTexto.contains("8#215")){strTexto=strTexto.replace("8#215", "�");}
		if(strTexto.contains("8#216")){strTexto=strTexto.replace("8#216", "�");}
		if(strTexto.contains("8#217")){strTexto=strTexto.replace("8#217", "�");}
		if(strTexto.contains("8#218")){strTexto=strTexto.replace("8#218", "�");}
		if(strTexto.contains("8#219")){strTexto=strTexto.replace("8#219", "�");}
		if(strTexto.contains("8#220")){strTexto=strTexto.replace("8#220", "�");}
		if(strTexto.contains("8#221")){strTexto=strTexto.replace("8#221", "�");}
		if(strTexto.contains("8#222")){strTexto=strTexto.replace("8#222", "�");}
		if(strTexto.contains("8#223")){strTexto=strTexto.replace("8#223", "�");}
		if(strTexto.contains("8#224")){strTexto=strTexto.replace("8#224", "�");}
		if(strTexto.contains("8#225")){strTexto=strTexto.replace("8#225", "�");}
		if(strTexto.contains("8#226")){strTexto=strTexto.replace("8#226", "�");}
		if(strTexto.contains("8#227")){strTexto=strTexto.replace("8#227", "�");}
		if(strTexto.contains("8#228")){strTexto=strTexto.replace("8#228", "�");}
		if(strTexto.contains("8#229")){strTexto=strTexto.replace("8#229", "�");}
		if(strTexto.contains("8#230")){strTexto=strTexto.replace("8#230", "�");}
		if(strTexto.contains("8#231")){strTexto=strTexto.replace("8#231", "�");}
		if(strTexto.contains("8#232")){strTexto=strTexto.replace("8#232", "�");}
		if(strTexto.contains("8#233")){strTexto=strTexto.replace("8#233", "�");}
		if(strTexto.contains("8#234")){strTexto=strTexto.replace("8#234", "�");}
		if(strTexto.contains("8#235")){strTexto=strTexto.replace("8#235", "�");}
		if(strTexto.contains("8#236")){strTexto=strTexto.replace("8#236", "�");}
		if(strTexto.contains("8#237")){strTexto=strTexto.replace("8#237", "�");}
		if(strTexto.contains("8#238")){strTexto=strTexto.replace("8#238", "�");}
		if(strTexto.contains("8#239")){strTexto=strTexto.replace("8#239", "�");}
		if(strTexto.contains("8#240")){strTexto=strTexto.replace("8#240", "�");}
		if(strTexto.contains("8#241")){strTexto=strTexto.replace("8#241", "�");}
		if(strTexto.contains("8#242")){strTexto=strTexto.replace("8#242", "�");}
		if(strTexto.contains("8#243")){strTexto=strTexto.replace("8#243", "�");}
		if(strTexto.contains("8#244")){strTexto=strTexto.replace("8#244", "�");}
		if(strTexto.contains("8#245")){strTexto=strTexto.replace("8#245", "�");}
		if(strTexto.contains("8#246")){strTexto=strTexto.replace("8#246", "�");}
		if(strTexto.contains("8#247")){strTexto=strTexto.replace("8#247", "�");}
		if(strTexto.contains("8#248")){strTexto=strTexto.replace("8#248", "�");}
		if(strTexto.contains("8#249")){strTexto=strTexto.replace("8#249", "�");}
		if(strTexto.contains("8#250")){strTexto=strTexto.replace("8#250", "�");}
		if(strTexto.contains("8#251")){strTexto=strTexto.replace("8#251", "�");}
		if(strTexto.contains("8#252")){strTexto=strTexto.replace("8#252", "�");}
		if(strTexto.contains("8#253")){strTexto=strTexto.replace("8#253", "�");}
		if(strTexto.contains("8#254")){strTexto=strTexto.replace("8#254", "�");}
		if(strTexto.contains("8#255")){strTexto=strTexto.replace("8#255", "�");}
		if(strTexto.contains("8#338")){strTexto=strTexto.replace("8#338", "�");}
		if(strTexto.contains("8#339")){strTexto=strTexto.replace("8#339", "�");}
		if(strTexto.contains("8#352")){strTexto=strTexto.replace("8#352", "�");}
		if(strTexto.contains("8#353")){strTexto=strTexto.replace("8#353", "�");}
		if(strTexto.contains("8#376")){strTexto=strTexto.replace("8#376", "�");}
		if(strTexto.contains("8#402")){strTexto=strTexto.replace("8#402", "�");}
		if(strTexto.contains("8#8211")){strTexto=strTexto.replace("8#8211", "�");}
		if(strTexto.contains("8#8212")){strTexto=strTexto.replace("8#8212", "�");}
		if(strTexto.contains("8#8216")){strTexto=strTexto.replace("8#8216", "�");}
		if(strTexto.contains("8#8217")){strTexto=strTexto.replace("8#8217", "�");}
		if(strTexto.contains("8#8218")){strTexto=strTexto.replace("8#8218", "�");}
		if(strTexto.contains("8#8220")){strTexto=strTexto.replace("8#8220", "�");}
		if(strTexto.contains("8#8221")){strTexto=strTexto.replace("8#8221", "�");}
		if(strTexto.contains("8#8222")){strTexto=strTexto.replace("8#8222", "�");}
		if(strTexto.contains("8#8224")){strTexto=strTexto.replace("8#8224", "�");}
		if(strTexto.contains("8#8225")){strTexto=strTexto.replace("8#8225", "�");}
		if(strTexto.contains("8#8226")){strTexto=strTexto.replace("8#8226", "�");}
		if(strTexto.contains("8#8230")){strTexto=strTexto.replace("8#8230", "�");}
		if(strTexto.contains("8#8240")){strTexto=strTexto.replace("8#8240", "�");}
		if(strTexto.contains("8#8364")){strTexto=strTexto.replace("8#8364", "�");}
		if(strTexto.contains("8#8482")){strTexto=strTexto.replace("8#8482", "�");}
		
	    strTextoReemplazado=strTexto; 
	     
		return strTextoReemplazado;
	}
	
	public static String GetTituloSistema(ParametroGeneralSg parametroGeneralSg,Modulo moduloActual,Usuario usuarioActual) {
		String sTituloSistema="";
		
		sTituloSistema=parametroGeneralSg.getnombre_sistema()+" Version "+parametroGeneralSg.getversion_sistema();
		
		if(moduloActual!=null && moduloActual.getId()>0) {
			sTituloSistema+= " --- Modulo "+moduloActual.getnombre();
		}
		
		if(usuarioActual!=null && usuarioActual.getId()>0) {
			sTituloSistema+= " --- Usuario "+usuarioActual.getnombre();
		}
		
		return sTituloSistema;
	}
	
	public static String GetTituloSistema(ParametroGeneralSg parametroGeneralSg,Modulo moduloActual,Usuario usuarioActual,String sPantalla) {
		String sTituloSistema=Funciones.GetTituloSistema(parametroGeneralSg,moduloActual,usuarioActual,sPantalla,PaginaTipo.PRINCIPAL,null);
		
		return sTituloSistema;
	}
	
	public static String GetTituloSistema(ParametroGeneralSg parametroGeneralSg,Modulo moduloActual,Usuario usuarioActual,String sPantalla,PaginaTipo paginaTipo) {
		String sTituloSistema=Funciones.GetTituloSistema(parametroGeneralSg,moduloActual,usuarioActual,sPantalla,paginaTipo,null);
		
		return sTituloSistema;
	}
	
	public static String GetTituloSistema(ParametroGeneralSg parametroGeneralSg,Modulo moduloActual,Usuario usuarioActual,String sPantalla,PaginaTipo paginaTipo,PaginaTipo paginaTipoPadre) {
		String sTituloSistema="";
		String sTipoPagina="";
		String sTipoPaginaPadre="";
		
		sTituloSistema+=sPantalla;
		
		if(moduloActual!=null && moduloActual.getId()>0) {
			sTituloSistema+= " --- Modulo "+moduloActual.getnombre();
		}
					
		if(usuarioActual!=null && usuarioActual.getId()>0) {
			sTituloSistema+= " --- Usuario "+usuarioActual.getnombre();
		}
		
		sTituloSistema+=" --- "+parametroGeneralSg.getnombre_sistema()+" Version "+parametroGeneralSg.getversion_sistema();
		
		
		sTipoPagina=Funciones.GetSimboloPaginaTipo(paginaTipo);
		
		sTipoPaginaPadre=Funciones.GetSimboloPaginaTipo(paginaTipoPadre);				
		
		sTituloSistema=sTipoPagina+sTipoPaginaPadre+sTituloSistema;
		
		return sTituloSistema;
	}
	
	public static String GetSimboloPaginaTipo(PaginaTipo paginaTipo) {
		String sTipoPagina="";
		
		if(paginaTipo!=null) {
			if(paginaTipo.equals(PaginaTipo.PRINCIPAL)) {
				sTipoPagina="[PRI] - ";
			} else if(paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
				sTipoPagina="[SEC] - ";
			} else if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				sTipoPagina="[BUS] - ";
			} else if(paginaTipo.equals(PaginaTipo.AUXILIAR)) {
				sTipoPagina="[AUX] - ";
			}  else if(paginaTipo.equals(PaginaTipo.FORMULARIO)) {
				sTipoPagina="[FOR] - ";
			} else {
				sTipoPagina="[PRI] - ";
			}
		}
		
		return sTipoPagina;
	}
	
	public static String GetTituloSistemaReporte(ParametroGeneralSg parametroGeneralSg,Modulo moduloActual,Usuario usuarioActual) {
		String sTituloSistema="";
		
		sTituloSistema=parametroGeneralSg.getnombre_simple_sistema()+" "+moduloActual.getnombre();
				
		/*
		sTituloSistema=parametroGeneralSg.getnombre_sistema()+" VERSION "+parametroGeneralSg.getversion_sistema();
		
		if(moduloActual!=null && moduloActual.getId()>0) {
			sTituloSistema+= " --- MODULO "+moduloActual.getnombre();
		}
		
		if(usuarioActual!=null && usuarioActual.getId()>0) {
			sTituloSistema+= " --- USUARIO "+usuarioActual.getnombre();
		}
		*/
		
		return sTituloSistema;
	}
	
	public static String GetWhereGlobalConstants(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Boolean conWhere,Boolean conAnd,ArrayList<String> arrColumnasGlobales) {
		String sWhereGlobal="";
		
		sWhereGlobal=Funciones.GetWhereGlobalConstants(parametroGeneralUsuario,moduloActual,conWhere,conAnd,arrColumnasGlobales,"");
				
		return sWhereGlobal;
	}
	
	public static String GetWhereGlobalConstants(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Boolean conWhere,Boolean conAnd,ArrayList<String> arrColumnasGlobales,String sNombreTabla) {
		String sWhereGlobal="";
		Boolean existeCondicion=false;
		
		if(conWhere) {
			sWhereGlobal+=" where ";
			
		} else if(conAnd) {
			sWhereGlobal+=" and ";
		}
		
		
		if(sNombreTabla!="") {
			sNombreTabla=sNombreTabla+".";
		}
		
		
		for(String sColumnaGlobal:arrColumnasGlobales) {
			if(sColumnaGlobal.equals("id_empresa")) {
				sWhereGlobal+=" "+sNombreTabla+"id_empresa="+parametroGeneralUsuario.getid_empresa();			
				existeCondicion=true;
			}
			
			if(sColumnaGlobal.equals("id_sucursal")) {		
				if(existeCondicion) {
					sWhereGlobal+=" and ";
				} else {
					existeCondicion=true;
				}			
				
				sWhereGlobal+=" "+sNombreTabla+"id_sucursal="+parametroGeneralUsuario.getid_sucursal();			
			}
			
			if(sColumnaGlobal.equals("id_ejercicio")) {
				if(existeCondicion) {
					sWhereGlobal+=" and ";
				} else {
					existeCondicion=true;
				}	
				
				sWhereGlobal+=" "+sNombreTabla+"id_ejercicio="+parametroGeneralUsuario.getid_ejercicio();
			}
			
			if(sColumnaGlobal.equals("id_periodo")) {
				if(existeCondicion) {
					//sWhereGlobal+=" and ";
				} else {
					existeCondicion=true;
				}	
				
				//sWhereGlobal+=" id_periodo="+parametroGeneralUsuario.getid_periodo();
			}
			
			if(sColumnaGlobal.equals("id_modulo")) {
				if(existeCondicion) {
					sWhereGlobal+=" and ";
				} else {
					existeCondicion=true;
				}	
				
				sWhereGlobal+=" "+sNombreTabla+"id_modulo="+moduloActual.getId();
			}
		}
		
		if(!existeCondicion) {
			sWhereGlobal="";
		}
		
		return sWhereGlobal;
	}
	
	public static String GetFinalQueryAppend(String sFinalQueryIni,String sFinalQueryNew) {
		String sFinalQuery="";
		sFinalQueryNew=" "+sFinalQueryNew+" ";
		int iLength=sFinalQueryNew.length();
		
		if(sFinalQueryIni.contains("where") || sFinalQueryIni.contains("WHERE")) {
			if(!(sFinalQueryNew.contains("inner") || sFinalQueryNew.contains("INNER"))) {
				if(iLength>2 && !(sFinalQueryNew.contains("and") || sFinalQueryNew.contains("AND"))) {
					sFinalQueryNew=sFinalQueryNew.replace("where","");
					sFinalQueryNew=sFinalQueryNew.replace("WHERE","");
					
					sFinalQueryNew=" and "+sFinalQueryNew;
				}
				
				sFinalQuery=sFinalQueryIni + sFinalQueryNew;
				
			} else {
				//no hacer reemplazo por and
				//primero inner con su where
				
				sFinalQueryIni=sFinalQueryIni.replace("where","and");
				sFinalQueryIni=sFinalQueryIni.replace("WHERE","AND");
				
				sFinalQuery=sFinalQueryNew + sFinalQueryIni;
			}
		} else {
			if(iLength>2 && !(sFinalQueryNew.contains("where") || sFinalQueryNew.contains("WHERE"))) {
				sFinalQueryNew=" where "+sFinalQueryNew;
			}
			
			sFinalQuery=sFinalQueryIni + sFinalQueryNew;
		}
		
		//sFinalQuery=sFinalQueryIni + sFinalQueryNew;
		
		return sFinalQuery;
	}
	
	public static String GetFinalQueryAppendBusqueda(String sFinalQueryIni,String sFinalQueryNew,String finalQueryPaginacionTodos) {
		String sFinalQuery="";
		sFinalQueryNew=" "+sFinalQueryNew+" ";
		int iLength=sFinalQueryNew.length();
		
		if(sFinalQueryIni.contains("where") || sFinalQueryIni.contains("WHERE")) {
			if(!(sFinalQueryNew.contains("inner") || sFinalQueryNew.contains("INNER"))) {
				if(iLength>2 && !(sFinalQueryNew.contains("and") || sFinalQueryNew.contains("AND"))) {
					sFinalQueryNew=sFinalQueryNew.replace("where","");
					sFinalQueryNew=sFinalQueryNew.replace("WHERE","");
					
					sFinalQueryNew=" and "+sFinalQueryNew;
				}
				
				sFinalQuery=sFinalQueryIni + sFinalQueryNew;
				
			} else {
				//no hacer reemplazo por and
				//primero inner con su where
				
				sFinalQueryIni=sFinalQueryIni.replace("where","and");
				sFinalQueryIni=sFinalQueryIni.replace("WHERE","AND");
				
				sFinalQuery=sFinalQueryNew + sFinalQueryIni;
			}
		} else {
			if(!(sFinalQueryNew.contains("inner") || sFinalQueryNew.contains("INNER"))) {
				if(iLength>2 && !(sFinalQueryNew.contains("where") || sFinalQueryNew.contains("WHERE"))) {
					sFinalQueryNew=" where "+sFinalQueryNew;
					
					sFinalQuery=sFinalQueryIni + sFinalQueryNew;
				
				} else {
					sFinalQuery=sFinalQueryNew + sFinalQueryIni;
				}
			} else {
				sFinalQueryIni=sFinalQueryIni.replace("where","and");
				sFinalQueryIni=sFinalQueryIni.replace("WHERE","AND");
				
				sFinalQuery=sFinalQueryNew + sFinalQueryIni;
			}
			
			//sFinalQuery=sFinalQueryIni + sFinalQueryNew;
		}
		
		//sFinalQuery=sFinalQueryIni + sFinalQueryNew;
		
		sFinalQuery=sFinalQuery + finalQueryPaginacionTodos;
		
		return sFinalQuery;
	}
}
