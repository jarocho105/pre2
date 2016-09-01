package com.bydan.framework.erp.business.entity;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.FuncionesJsp;
import com.bydan.framework.erp.util.Mensaje;
import com.bydan.framework.erp.util.MensajeGrupo;



/*
import org.jivesoftware.smack.*; 
//import org.jivesoftware.smack.packet.Message; 
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smackx.Form;
import org.jivesoftware.smackx.XHTMLManager;
import org.jivesoftware.smackx.muc.MultiUserChat;

import net.sf.jasperreports.engine.JasperCompileManager;
*/


@SuppressWarnings("unused")
public class Test {
	
	
	
	public static void EnviarMails(String strHtmml,String strMailDestinatario)throws MessagingException, Exception 
	{
				
		//String strPathFoto="C:\\AlcoholDrogasSubversion\\TomkatWorkSpace\\ControlAlcoholDrogasWeb\\WebContent\\Imagenes\\Logos\\Tame1.jpg";
		//String strPathFotoProduccion="C:\\SoftwareInstalado\\IBM\\WebSphere\\AppServer\\profiles\\AppSrv01\\installedApps\\tame_filessrvNode01Cell\\ControlAlcoholDrogasWeb_war.ear\\ControlAlcoholDrogasWeb.war\\Imagenes\\Logos\\Tame1.jpg";
		
		if(strMailDestinatario==null||strMailDestinatario=="")
		{
			return;
		}
		
		Properties props = new Properties();
	    props.put("mail.host", "200.31.26.156");
	    props.put("mail.user", "bchavez");
	    props.put("mail.from", "bchavez@tame.com.ec");
	    Session session = Session.getInstance(props, null);
	  
	    MimeMessage msg = new MimeMessage(session);
        msg.setFrom();
        msg.addRecipients(Message.RecipientType.TO,strMailDestinatario);
        
        String htmlText =strHtmml;
        
        MimeMultipart multipart = new MimeMultipart("related");

        BodyPart messageBodyPart = new MimeBodyPart();
        //String htmlText = "<H1>Hello</H1><img src=\"cid:image\">";
        messageBodyPart.setContent(htmlText, "text/html");
        multipart.addBodyPart(messageBodyPart);
        msg.setContent(multipart);
        
	    try 
	    {
	    	msg.setSubject("http://10.1.1.15/ControlAlcoholDrogasWeb/ Prueba del Sistema de Control de Alcohol y Drogas");
	    	   
	       // msg.addRecipients(Message.RecipientType.TO,strMailDestinatario);
	        
	        
	        /*
	        messageBodyPart = new MimeBodyPart();       
	        DataSource fds = new FileDataSource(strPathFotoProduccion);
	        messageBodyPart.setDataHandler(new DataHandler(fds));
	        messageBodyPart.setHeader("Content-ID","<image>");
	        multipart.addBodyPart(messageBodyPart);
	         */
	       
	        
	        //msg.setContent(BuildHtmlTable(null,null,null),"text/html");
	        Transport.send(msg);
	    } 
	    catch (MessagingException mex) 
	    {
	    	//String s=mex.getMessage();
	    	
	    	msg = new MimeMessage(session);
	        msg.setFrom();
	        msg.addRecipients(Message.RecipientType.TO,"sromero@tame.com.ec");
	        msg.addRecipients(Message.RecipientType.TO,"bchavez@tame.com.ec");
	        msg.addRecipients(Message.RecipientType.TO,"eargotti@tame.com.ec");
	       
	        multipart = new MimeMultipart("related");

	        messageBodyPart = new MimeBodyPart();
	        //String htmlText = "<H1>Hello</H1><img src=\"cid:image\">";
	        messageBodyPart.setContent(htmlText, "text/html");
	        multipart.addBodyPart(messageBodyPart);
	        msg.setContent(multipart);
	        
	    	msg.setSubject("Error:al enviar mail a direccion "+strMailDestinatario+" http://10.1.1.15/ControlAlcoholDrogasWeb/ Prueba del Sistema de Control de Alcohol y Drogas");	 
	    	Transport.send(msg);
	        ;//throw mex;

	       

	    }
	    catch (Exception ex) 
	    {

	    	//String s=ex.getMessage();
	    	
	    	msg = new MimeMessage(session);
	        msg.setFrom();
	        msg.addRecipients(Message.RecipientType.TO,"sromero@tame.com.ec");
	        msg.addRecipients(Message.RecipientType.TO,"bchavez@tame.com.ec");
	        msg.addRecipients(Message.RecipientType.TO,"eargotti@tame.com.ec");
	       
	        multipart = new MimeMultipart("related");

	        messageBodyPart = new MimeBodyPart();
	        //String htmlText = "<H1>Hello</H1><img src=\"cid:image\">";
	        messageBodyPart.setContent(htmlText, "text/html");
	        multipart.addBodyPart(messageBodyPart);
	        msg.setContent(multipart);
	        
	    	msg.setSubject("Error:al enviar mail a direccion "+strMailDestinatario+" http://10.1.1.15/ControlAlcoholDrogasWeb/ Prueba del Sistema de Control de Alcohol y Drogas");	 
	    	Transport.send(msg);
	        ;//throw ex;

	        

	    }
	}
	
	public static void main(String[] args) 
	{
		
		 try 
		 {
			Mensaje mensaje=new Mensaje(Constantes.SMENSAJEAUXILIAR,Constantes.SMENSAJEREGISTROSESSION,"abc",MensajeGrupo.NONE);
			String sXml =  "";//FuncionesJsp.getJsonMensaje(mensaje);
			
			System.out.println(sXml);
			
			 //System.out.println(FuncionesJsp.getJsonTiposReportes());
			 //Test.EnviarMails("<H1>Hello TAME BYDAN</H1>", "bchavez@tame.com.ec");
			 
			 //TEST DE CHAT
			 /*
			// Create a connection to the jabber.org server.
			 //XMPPConnection conn1 = new XMPPConnection("jabber.org");
			 //conn1.connect();

			 // Create a connection to the jabber.org server on a specific port.
			 ConnectionConfiguration config = new ConnectionConfiguration("localhost", 5222);
			 XMPPConnection conn2 = new XMPPConnection(config);
			 conn2.connect();


			// Assume we've created an XMPPConnection name "connection".
			 ChatManager chatmanager = conn2.getChatManager();
			 
			 conn2.login("admin", "admin");

			 //MultiUserChat muc = new MultiUserChat(conn2, "myroom@aa.bydan-pc");

		      // Create the room
		      //muc.create("testbot");
		      //muc.sendConfigurationForm(new Form(Form.TYPE_SUBMIT));

		      
			 Presence presence = new Presence(Presence.Type.unavailable);
			 presence.setStatus("Gone fishing");
			 // Send the packet (assume we have a XMPPConnection instance called "con").
			 conn2.sendPacket(presence);

			 Roster roster = conn2.getRoster();
			 
			 String [] s={"Curso DANILO PARRA"};
			 roster.createGroup("Curso DANILO PARRA");
			 roster.createEntry("bydan@bydan-pc", "bydan", s);
			
			 Collection<RosterEntry> entries = roster.getEntries();
			 for (RosterEntry entry : entries) {
			     System.out.println(entry);
			 }

			 
			 Chat newChat = chatmanager.createChat("bydan@bydan-pc", new MessageListener() {
			     public void processMessage(Chat chat, Message message) {
			         System.out.println("Received message: " + message.getBody());
			     }
			 });

			 try {
				 
				 for(int x=0;x<3;x++)
				 {
					 newChat.sendMessage("JAJA !" + x);
				 }
			     
			    
			 }
			 catch (XMPPException e) {
			     System.out.println("Error Delivering block");
			 }
			  */
			 
			 
			 
			 
			 
			 
			 //com.bydan.framework.aulavirtual.utils.resources.properties.GeneralProperties.LoadProperties();
			 
			 //Test.GenerateMySqlDataStatement();
			 
			 /*
			 String strPathCompilacion="D:\\Me\\2009\\Proyectos\\AulaVirtualFromSV\\AulaVirtualWeb\\WebContent\\Reportes\\";
			
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\AgrupacionDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\AlumnoPreguntaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\AlumnoRespuestaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\AlumnoTestDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\AnioDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\AplicacionDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\CalendarioDeUnidadCurricularDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\CalendarioDeUnidadEducativaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\CaracteristicaControlAjaxDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\CatalogoArchivoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\CatalogoArchivoPaginaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\CatalogoUrlDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\CatalogoUrlPaginaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\Media\\ChatDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\ContactoDeUnidadCurricularDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\ContactoDeUnidadEducativaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\ApicacionRelaciones\\ContenidoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\ControlAjaxDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\DetalleAgrupacionDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoRelaciones\\DistincionAcademicaParaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorRelaciones\\DistincionAcademicaParaTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\EmpresaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\EstadoCivilDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoRelaciones\\EstudioRealizadoParaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorRelaciones\\EstudioRealizadoParaTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoRelaciones\\ExperienciaLaboralParaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorRelaciones\\ExperienciaLaboralParaTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\Media\\ForoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\GeneroDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\ApicacionRelaciones\\GraficoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\GrupoAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\GrupoNotaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\IdiomaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoRelaciones\\IdiomaParaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorRelaciones\\IdiomaParaTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\ImagenDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\InstitucionEducativaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\ApicacionRelaciones\\LinkDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\LugarDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\Media\\MailDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\ApicacionRelaciones\\MenuDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\ModalidadDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\NotaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\NoticiaDeUnidadCurricularDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\NoticiaDeUnidadEducativaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\Media\\OpinionDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\PaginaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\ApicacionRelaciones\\PaginaGeneralDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\ParrafoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\PeriodoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\PoliticaSorteoTestDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoRelaciones\\PracticaLaboralParaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorRelaciones\\PracticaLaboralParaTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\PreguntaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\PreguntaPracticaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoRelaciones\\ReferenciaParaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorRelaciones\\ReferenciaParaTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\RespuestaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\RespuestaPracticaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\ApicacionRelaciones\\SeccionDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoRelaciones\\SeminarioParaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorRelaciones\\SeminarioParaTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\Media\\TemaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\TestDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\TipoArchivoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\TipoContenidoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\TipoCursoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\TipoEmpresaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\TipoImagenDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\TipoInstitucionEducativaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\TipoLinkDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\TipoLugarDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"InformacionGeneral\\TipoMenuDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\TipoNotaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\TipoParrafoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\TipoTestDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\TipoTituloDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\TipoTituloEducativoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\TipoTrabajoNotaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\TipoUrlDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\TipoValorRespuestaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\TituloDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\DatosPersonales\\TituloEducativoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\TutoriaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\TutoriaAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularTutorDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularTutorAlumnoDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularTutorAlumnoPaginaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\ProcesoEducativo\\UnidadEducativaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\Media\\VideoConferenciaDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\TutoriaDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\TestDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\PreguntaDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\RespuestaDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\CatalogoArchivoMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\PaginaDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\CatalogoUrlMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\PaginaDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\PaginaMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\CatalogoUrlDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularTutorAlumnoDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"Catalogos\\SitiosWeb\\CatalogoArchivoDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\PreguntaMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\RespuestaMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\TestMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\TutoriaMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\AlumnoDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\TutorDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\UnidadCurricularTutorAlumnoMasterRelacionesDesign.jrxml");}catch(Exception ex){;}
			 try{JasperCompileManager.compileReportToFile(strPathCompilacion+"AulaVirtual\\CursoRelaciones\\SitiosWeb\\PaginaDetalleRelacionesDesign.jrxml");}catch(Exception ex){;}
			 
			 		 */
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		 
		 System.out.println("OK");
		 }
	
	public static void GenerateMySql(StringBuilder stringBuilderData,String strFileName)
	 {
	    try
	    {
		    // Create file 
		    FileWriter fstream = new FileWriter("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAulaMySql\\"+strFileName);
		    BufferedWriter out = new BufferedWriter(fstream);
		    
		    
		    out.write(stringBuilderData.toString());
		    
		    
		   
		    //Close the output stream
		    out.close();
		}
	    catch (Exception e)
	    {//Catch exception if any
	      System.err.println("Error: " + e.getMessage());
	    }
	  }
	
	 public static void GenerateMySql(ArrayList<String> arrayListMySqlFiles,String strFileName)
	 {
	    try
	    {
		    // Create file 
		    FileWriter fstream = new FileWriter("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAulaMySql\\"+strFileName);
		    BufferedWriter out = new BufferedWriter(fstream);
		    
		    for(String strMySqlFile:arrayListMySqlFiles)
		    {
		    	 out.write(strMySqlFile);
		    	 out.write("\r\n");
		    }
		    
		   
		    //Close the output stream
		    out.close();
		}
	    catch (Exception e)
	    {//Catch exception if any
	      System.err.println("Error: " + e.getMessage());
	    }
	  }
	
	 public static String ChangeFileAlumno(String strFile,String strType)
	 {
	 	String strFileMySql="";

	 	if(strFile!=null)
	 	{
	 		String arrStrColumns[]={"",""};

	 		arrStrColumns=strFile.split("\t");

	 		String strId=arrStrColumns[0];
	 		String bigIdGenero="1";
	 		//try{bigIdGenero=arrStrColumns[1];}
	 		//catch(Exception ex){bigIdGenero="";}

	 		String bigIdEstadoCivil="1";
	 		//try{bigIdEstadoCivil=arrStrColumns[2];}
	 		//catch(Exception ex){bigIdEstadoCivil="";}

	 		String strCedula="";
	 		try{strCedula=arrStrColumns[1];}
	 		catch(Exception ex){strCedula="";}

	 		String strNombreCompleto="";
	 		try{strNombreCompleto=arrStrColumns[2];}
	 		catch(Exception ex){strNombreCompleto="";}

	 		String strDireccion="none";
	 		//try{strDireccion=arrStrColumns[5];}
	 		//catch(Exception ex){strDireccion="";}

	 		String strTelefonoCelular="none";
	 		//try{strTelefonoCelular=arrStrColumns[6];}
	 		//catch(Exception ex){strTelefonoCelular="";}

	 		String strTelefonoConvencional="none";
	 		//try{strTelefonoConvencional=arrStrColumns[7];}
	 		//catch(Exception ex){strTelefonoConvencional="";}

	 		String strMail="x@hotmail.com";
	 		//try{strMail=arrStrColumns[8];}
	 		//catch(Exception ex){strMail="";}

	 		String strFechaNacimiento="";
	 		try{strFechaNacimiento=arrStrColumns[3];}
	 		catch(Exception ex){strFechaNacimiento="";}

	 		String strClave="";
	 		try{strClave=arrStrColumns[4];}
	 		catch(Exception ex){strClave="";}

	 		String strObservaciones="none";
	 		//try{strObservaciones=arrStrColumns[11];}
	 		//catch(Exception ex){strObservaciones="";}

	 		String bitEstado="";
	 		try{bitEstado=arrStrColumns[5];}
	 		catch(Exception ex){bitEstado="";}


	 		strFileMySql="INSERT INTO aulavirtual_dbo.alumno VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdGenero+","+bigIdEstadoCivil+","+"'"+strCedula+"'"+","+"'"+strNombreCompleto+"'"+","+"'"+strDireccion+"'"+","+"'"+strTelefonoCelular+"'"+","+"'"+strTelefonoConvencional+"'"+","+"'"+strMail+"'"+","+"'"+strFechaNacimiento+"'"+","+"'"+strClave+"'"+","+"'"+strObservaciones+"'"+","+bitEstado+");";
	 	}

	 	return strFileMySql;
	 }

	
	public static String ChangeFileTipoArchivo(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String strCodigo="";
			try{strCodigo=arrStrColumns[1];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String strDescripcion="";
			try{strDescripcion=arrStrColumns[3];}
			catch(Exception ex){strDescripcion="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.tipoarchivo VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+"'"+strDescripcion+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileTipoImagen(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String strCodigo="";
			try{strCodigo=arrStrColumns[1];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String strHtmlInicial="";
			try{strHtmlInicial=arrStrColumns[3];}
			catch(Exception ex){strHtmlInicial="";}

			String strHtmlFinal="";
			try{strHtmlFinal=arrStrColumns[4];}
			catch(Exception ex){strHtmlFinal="";}

			String strXmlJasperInicial="";
			try{strXmlJasperInicial=arrStrColumns[5];}
			catch(Exception ex){strXmlJasperInicial="";}

			String strXmlJasperFinal="";
			try{strXmlJasperFinal=arrStrColumns[6];}
			catch(Exception ex){strXmlJasperFinal="";}

			String strCssInicial="";
			try{strCssInicial=arrStrColumns[7];}
			catch(Exception ex){strCssInicial="";}

			String strCssFinal="";
			try{strCssFinal=arrStrColumns[8];}
			catch(Exception ex){strCssFinal="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.tipoimagen VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+"'"+strHtmlInicial+"'"+","+"'"+strHtmlFinal+"'"+","+"'"+strXmlJasperInicial+"'"+","+"'"+strXmlJasperFinal+"'"+","+"'"+strCssInicial+"'"+","+"'"+strCssFinal+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileTipoParrafo(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String strCodigo="";
			try{strCodigo=arrStrColumns[1];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String strHtmlInicial="";
			try{strHtmlInicial=arrStrColumns[3];}
			catch(Exception ex){strHtmlInicial="";}

			String strHtmlFinal="";
			try{strHtmlFinal=arrStrColumns[4];}
			catch(Exception ex){strHtmlFinal="";}

			String strCssInicial="";
			try{strCssInicial=arrStrColumns[5];}
			catch(Exception ex){strCssInicial="";}

			String strCssFinal="";
			try{strCssFinal=arrStrColumns[6];}
			catch(Exception ex){strCssFinal="";}

			String strXmlJasperInicial="";
			try{strXmlJasperInicial=arrStrColumns[7];}
			catch(Exception ex){strXmlJasperInicial="";}

			String strXmlJasperFinal="";
			try{strXmlJasperFinal=arrStrColumns[8];}
			catch(Exception ex){strXmlJasperFinal="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.tipoparrafo VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+"'"+strHtmlInicial+"'"+","+"'"+strHtmlFinal+"'"+","+"'"+strCssInicial+"'"+","+"'"+strCssFinal+"'"+","+"'"+strXmlJasperInicial+"'"+","+"'"+strXmlJasperFinal+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileTipoTest(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String strCodigo="";
			try{strCodigo=arrStrColumns[1];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.tipotest VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileTipoTitulo(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String strCodigo="";
			try{strCodigo=arrStrColumns[1];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String intNivel="";
			try{intNivel=arrStrColumns[3];}
			catch(Exception ex){intNivel="";}

			String strHtmlInicial="";
			try{strHtmlInicial=arrStrColumns[4];}
			catch(Exception ex){strHtmlInicial="";}

			String strHtmlFinal="";
			try{strHtmlFinal=arrStrColumns[5];}
			catch(Exception ex){strHtmlFinal="";}

			String strCssInicial="";
			try{strCssInicial=arrStrColumns[6];}
			catch(Exception ex){strCssInicial="";}

			String strCssFinal="";
			try{strCssFinal=arrStrColumns[7];}
			catch(Exception ex){strCssFinal="";}

			String strXmlJasperInicial="";
			try{strXmlJasperInicial=arrStrColumns[8];}
			catch(Exception ex){strXmlJasperInicial="";}

			String strXmlJasperFinal="";
			try{strXmlJasperFinal=arrStrColumns[9];}
			catch(Exception ex){strXmlJasperFinal="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.tipotitulo VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+intNivel+","+"'"+strHtmlInicial+"'"+","+"'"+strHtmlFinal+"'"+","+"'"+strCssInicial+"'"+","+"'"+strCssFinal+"'"+","+"'"+strXmlJasperInicial+"'"+","+"'"+strXmlJasperFinal+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileTipoUrl(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String strCodigo="";
			try{strCodigo=arrStrColumns[1];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String strDescripcion="";
			try{strDescripcion=arrStrColumns[3];}
			catch(Exception ex){strDescripcion="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.tipourl VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+"'"+strDescripcion+"'"+");";
		}

		return strFileMySql;
	}






	public static String ChangeFileCatalogoUrl(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdTipoUrl="";
			try{bigIdTipoUrl=arrStrColumns[1];}
			catch(Exception ex){bigIdTipoUrl="";}

			String strCodigo="";
			try{strCodigo=arrStrColumns[2];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[3];}
			catch(Exception ex){strNombre="";}

			String strHtmlInicial="";
			try{strHtmlInicial=arrStrColumns[4];}
			catch(Exception ex){strHtmlInicial="";}

			String strHtmlFinal="";
			try{strHtmlFinal=arrStrColumns[5];}
			catch(Exception ex){strHtmlFinal="";}

			String strCssInicial="";
			try{strCssInicial=arrStrColumns[6];}
			catch(Exception ex){strCssInicial="";}

			String strCssFinal="";
			try{strCssFinal=arrStrColumns[7];}
			catch(Exception ex){strCssFinal="";}

			String strXmlJasperInicial="";
			try{strXmlJasperInicial=arrStrColumns[8];}
			catch(Exception ex){strXmlJasperInicial="";}

			String strXmlJasperFinal="";
			try{strXmlJasperFinal=arrStrColumns[9];}
			catch(Exception ex){strXmlJasperFinal="";}

			String strPathIcono="";
			try{strPathIcono=arrStrColumns[10];}
			catch(Exception ex){strPathIcono="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.catalogourl VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdTipoUrl+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+"'"+strHtmlInicial+"'"+","+"'"+strHtmlFinal+"'"+","+"'"+strCssInicial+"'"+","+"'"+strCssFinal+"'"+","+"'"+strXmlJasperInicial+"'"+","+"'"+strXmlJasperFinal+"'"+","+"'"+strPathIcono+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileCatalogoArchivo(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdTipoArchivo="";
			try{bigIdTipoArchivo=arrStrColumns[1];}
			catch(Exception ex){bigIdTipoArchivo="";}

			String strCodigo="";
			try{strCodigo=arrStrColumns[2];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[3];}
			catch(Exception ex){strNombre="";}

			String strExtension="";
			try{strExtension=arrStrColumns[4];}
			catch(Exception ex){strExtension="";}

			String strHtmlInicial="";
			try{strHtmlInicial=arrStrColumns[5];}
			catch(Exception ex){strHtmlInicial="";}

			String strHtmlFinal="";
			try{strHtmlFinal=arrStrColumns[6];}
			catch(Exception ex){strHtmlFinal="";}

			String strCssInicial="";
			try{strCssInicial=arrStrColumns[7];}
			catch(Exception ex){strCssInicial="";}

			String strCssFinal="";
			try{strCssFinal=arrStrColumns[8];}
			catch(Exception ex){strCssFinal="";}

			String strXmlJasperInicial="";
			try{strXmlJasperInicial=arrStrColumns[9];}
			catch(Exception ex){strXmlJasperInicial="";}

			String strXmlJasperFinal="";
			try{strXmlJasperFinal=arrStrColumns[10];}
			catch(Exception ex){strXmlJasperFinal="";}

			String strPathIcono="";
			try{strPathIcono=arrStrColumns[11];}
			catch(Exception ex){strPathIcono="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.catalogoarchivo VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdTipoArchivo+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+"'"+strExtension+"'"+","+"'"+strHtmlInicial+"'"+","+"'"+strHtmlFinal+"'"+","+"'"+strCssInicial+"'"+","+"'"+strCssFinal+"'"+","+"'"+strXmlJasperInicial+"'"+","+"'"+strXmlJasperFinal+"'"+","+"'"+strPathIcono+"'"+");";
		}

		return strFileMySql;
	}


	public static String ChangeFileControlAjax(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String strCodigo="";
			try{strCodigo=arrStrColumns[1];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String strHtmlInicial="";
			try{strHtmlInicial=arrStrColumns[3];}
			catch(Exception ex){strHtmlInicial="";}

			String strHtmlFinal="";
			try{strHtmlFinal=arrStrColumns[4];}
			catch(Exception ex){strHtmlFinal="";}

			String strHtmlIntermedio="";
			try{strHtmlIntermedio=arrStrColumns[5];}
			catch(Exception ex){strHtmlIntermedio="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.controlajax VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+"'"+strHtmlInicial+"'"+","+"'"+strHtmlFinal+"'"+","+"'"+strHtmlIntermedio+"'"+");";
		}

		return strFileMySql;
	}


	public static String ChangeFileCaracteristicaControlAjax(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdControlAjax="";
			try{bigIdControlAjax=arrStrColumns[1];}
			catch(Exception ex){bigIdControlAjax="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String intOrden="";
			try{intOrden=arrStrColumns[3];}
			catch(Exception ex){intOrden="";}

			String strHtmlInicial="";
			try{strHtmlInicial=arrStrColumns[4];}
			catch(Exception ex){strHtmlInicial="";}

			String strHtmlFinal="";
			try{strHtmlFinal=arrStrColumns[5];}
			catch(Exception ex){strHtmlFinal="";}

			String strDescripcion="";
			try{strDescripcion=arrStrColumns[6];}
			catch(Exception ex){strDescripcion="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.caracteristicacontrolajax VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdControlAjax+","+"'"+strNombre+"'"+","+intOrden+","+"'"+strHtmlInicial+"'"+","+"'"+strHtmlFinal+"'"+","+"'"+strDescripcion+"'"+");";
		}

		return strFileMySql;
	}



	public static String ChangeFileTutor(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdGenero="1";
			//try{bigIdGenero=arrStrColumns[1];}
			//catch(Exception ex){bigIdGenero="";}

			String bigIdEstadoCivil="1";
			//try{bigIdEstadoCivil=arrStrColumns[2];}
			//catch(Exception ex){bigIdEstadoCivil="";}

			String strCedula="";
			try{strCedula=arrStrColumns[6];}
			catch(Exception ex){strCedula="";}

			String strNombreCompleto="";
			try{strNombreCompleto=arrStrColumns[2];}
			catch(Exception ex){strNombreCompleto="";}

			String strDireccion="";
			try{strDireccion=arrStrColumns[4];}
			catch(Exception ex){strDireccion="";}

			String strTelefonoCelular="";
			try{strTelefonoCelular="09"+arrStrColumns[5];}
			catch(Exception ex){strTelefonoCelular="";}

			String strTelefonoConvencional="";
			try{strTelefonoConvencional=arrStrColumns[5];}
			catch(Exception ex){strTelefonoConvencional="";}

			String strMail="x@hotmail.com";
			//try{strMail=arrStrColumns[9];}
			//catch(Exception ex){strMail="";}

			String strFechaNacimiento="";
			try{strFechaNacimiento=arrStrColumns[7];}
			catch(Exception ex){strFechaNacimiento="";}

			String strObservaciones="none";
			//try{strObservaciones=arrStrColumns[11];}
			//catch(Exception ex){strObservaciones="";}

			String bitEstado="true";
			//try{bitEstado=arrStrColumns[12];}
			//catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.tutor VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdGenero+","+bigIdEstadoCivil+","+"'"+strCedula+"'"+","+"'"+strNombreCompleto+"'"+","+"'"+strDireccion+"'"+","+"'"+strTelefonoCelular+"'"+","+"'"+strTelefonoConvencional+"'"+","+"'"+strMail+"'"+","+"'"+strFechaNacimiento+"'"+","+"'"+strObservaciones+"'"+","+bitEstado+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileCurso(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdUnidadEducativa="1";
			//try{bigIdUnidadEducativa=arrStrColumns[1];}
			//catch(Exception ex){bigIdUnidadEducativa="";}

			String bigIdPeriodo="1";
			//try{bigIdPeriodo=arrStrColumns[2];}
			//catch(Exception ex){bigIdPeriodo="";}

			String bigIdTipoCurso="1";
			//try{bigIdTipoCurso=arrStrColumns[3];}
			//catch(Exception ex){bigIdTipoCurso="";}

			String bigIdModalidad="1";
			//try{bigIdModalidad=arrStrColumns[4];}
			//catch(Exception ex){bigIdModalidad="";}

			String strCodigo="";
			try{strCodigo=arrStrColumns[2];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String intNivel="";
			try{intNivel=arrStrColumns[1];}
			catch(Exception ex){intNivel="";}

			String intNumeroHoras="";
			try{intNumeroHoras=arrStrColumns[15];}
			catch(Exception ex){intNumeroHoras="";}

			String strObjetivo="";
			try{strObjetivo=arrStrColumns[5];}
			catch(Exception ex){strObjetivo="";}

			String strDescripcion="";
			try{strDescripcion=arrStrColumns[4];}
			catch(Exception ex){strDescripcion="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[3];}
			catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.curso VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdUnidadEducativa+","+bigIdPeriodo+","+bigIdTipoCurso+","+bigIdModalidad+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+intNivel+","+intNumeroHoras+","+"'"+strObjetivo+"'"+","+"'"+strDescripcion+"'"+","+bitEstado+");";
		}

		return strFileMySql;
	}





	public static String ChangeFileUnidadCurricular(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdCurso="";
			try{bigIdCurso=arrStrColumns[1];}
			catch(Exception ex){bigIdCurso="";}

			String strCodigo="";
			try{strCodigo=arrStrColumns[2];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[2];}
			catch(Exception ex){strNombre="";}

			String intNivel="";
			try{intNivel=arrStrColumns[11];}
			catch(Exception ex){intNivel="";}

			String intHoras="";
			try{intHoras=arrStrColumns[16];}
			catch(Exception ex){intHoras="";}

			String strObjetivos="";
			try{strObjetivos=arrStrColumns[5];}
			catch(Exception ex){strObjetivos="";}

			String strDescripcion="";
			try{strDescripcion=arrStrColumns[5];}
			catch(Exception ex){strDescripcion="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[3];}
			catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.unidadcurricular VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdCurso+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+intNivel+","+intHoras+","+"'"+strObjetivos+"'"+","+"'"+strDescripcion+"'"+","+bitEstado+");";
		}

		return strFileMySql;
	}

	
	
	public static String ChangeFileAgrupacion(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPagina="";
			try{bigIdPagina=arrStrColumns[1];}
			catch(Exception ex){bigIdPagina="";}

			String bigIdControlAjax="";
			try{bigIdControlAjax=arrStrColumns[2];}
			catch(Exception ex){bigIdControlAjax="";}

			String strNombre="";
			try{strNombre=arrStrColumns[3];}
			catch(Exception ex){strNombre="";}

			String strTitulo="";
			try{strTitulo=arrStrColumns[5];}
			catch(Exception ex){strTitulo="";}

			String intOrden="";
			try{intOrden=arrStrColumns[4];}
			catch(Exception ex){intOrden="";}

			String strCssContenedor="";
			try{strCssContenedor=arrStrColumns[7];}
			catch(Exception ex){strCssContenedor="";}

			String strDescripcion="";
			try{strDescripcion=arrStrColumns[6];}
			catch(Exception ex){strDescripcion="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.agrupacion VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPagina+","+bigIdControlAjax+","+"'"+strNombre+"'"+","+"'"+strTitulo+"'"+","+intOrden+","+"'"+strCssContenedor+"'"+","+"'"+strDescripcion+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileDetalleAgrupacion(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdAgrupacion="";
			try{bigIdAgrupacion=arrStrColumns[1];}
			catch(Exception ex){bigIdAgrupacion="";}

			String bigIdCaracteristicaControlAjax="";
			try{bigIdCaracteristicaControlAjax=arrStrColumns[2];}
			catch(Exception ex){bigIdCaracteristicaControlAjax="";}

			String intNumeroDetalleAgrupacion="";
			try{intNumeroDetalleAgrupacion=arrStrColumns[6];}
			catch(Exception ex){intNumeroDetalleAgrupacion="";}

			String strDetalleConfiguracion="";
			try{strDetalleConfiguracion=arrStrColumns[3];}
			catch(Exception ex){strDetalleConfiguracion="";}
			
			if(strDetalleConfiguracion.contains("'"))
			{
				strDetalleConfiguracion=strDetalleConfiguracion.replace("'", "\\'");
			}
			
			String strDetalleDescripcion="";
			try{strDetalleDescripcion=arrStrColumns[4];}
			catch(Exception ex){strDetalleDescripcion="";}

			if(strDetalleDescripcion.contains("'"))
			{
				strDetalleDescripcion=strDetalleDescripcion.replace("'", "\\'");
			}
			
			String bitEsParaReporte="";
			try{bitEsParaReporte=arrStrColumns[7];}
			catch(Exception ex){bitEsParaReporte="";}

			String bitAdicionarHtmlIntermedioControl="";
			try{bitAdicionarHtmlIntermedioControl=arrStrColumns[8];}
			catch(Exception ex){bitAdicionarHtmlIntermedioControl="";}

			if(bitAdicionarHtmlIntermedioControl.equals("-"))
			{
				bitAdicionarHtmlIntermedioControl="0";
			}
			
			strFileMySql="INSERT INTO aulavirtual_dbo.detalleagrupacion VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdAgrupacion+","+bigIdCaracteristicaControlAjax+","+intNumeroDetalleAgrupacion+","+"'"+strDetalleConfiguracion+"'"+","+"'"+strDetalleDescripcion+"'"+","+bitEsParaReporte+","+bitAdicionarHtmlIntermedioControl+");";
		}

		return strFileMySql;
	}


	public static String ChangeFileAlumnoPregunta(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdAlumno="";
			try{bigIdAlumno=arrStrColumns[1];}
			catch(Exception ex){bigIdAlumno="";}

			String bigIdPregunta="";
			try{bigIdPregunta=arrStrColumns[2];}
			catch(Exception ex){bigIdPregunta="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.alumnopregunta VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdAlumno+","+bigIdPregunta+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileAlumnoRespuesta(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdAlumno="";
			try{bigIdAlumno=arrStrColumns[1];}
			catch(Exception ex){bigIdAlumno="";}

			String bigIdRespuesta="";
			try{bigIdRespuesta=arrStrColumns[2];}
			catch(Exception ex){bigIdRespuesta="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.alumnorespuesta VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdAlumno+","+bigIdRespuesta+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileAlumnoTest(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdAlumno="";
			try{bigIdAlumno=arrStrColumns[1];}
			catch(Exception ex){bigIdAlumno="";}

			String bigIdTest="";
			try{bigIdTest=arrStrColumns[2];}
			catch(Exception ex){bigIdTest="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[3];}
			catch(Exception ex){bitEstado="";}

			String bitEstadoSorteado="";
			try{bitEstadoSorteado=arrStrColumns[5];}
			catch(Exception ex){bitEstadoSorteado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.alumnotest VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdAlumno+","+bigIdTest+","+bitEstado+","+bitEstadoSorteado+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileUnidadCurricularTutor(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdUnidadCurricular="";
			try{bigIdUnidadCurricular=arrStrColumns[1];}
			catch(Exception ex){bigIdUnidadCurricular="";}

			String bigIdTutor="";
			try{bigIdTutor=arrStrColumns[2];}
			catch(Exception ex){bigIdTutor="";}

			String bitEstadoActivoExamen="";
			try{bitEstadoActivoExamen=arrStrColumns[4];}
			catch(Exception ex){bitEstadoActivoExamen="";}

			String bitEstadoSortearExamen="";
			try{bitEstadoSortearExamen=arrStrColumns[5];}
			catch(Exception ex){bitEstadoSortearExamen="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.unidadcurriculartutor VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdUnidadCurricular+","+bigIdTutor+","+bitEstadoActivoExamen+","+bitEstadoSortearExamen+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileUnidadCurricularTutorAlumno(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdUnidadCurricularTutor="";
			try{bigIdUnidadCurricularTutor=arrStrColumns[3];}
			catch(Exception ex){bigIdUnidadCurricularTutor="";}

			String bigIdAlumno="";
			try{bigIdAlumno=arrStrColumns[1];}
			catch(Exception ex){bigIdAlumno="";}

			String strCodigoGrupo="NONE";
			//try{strCodigoGrupo=arrStrColumns[3];}
			//catch(Exception ex){strCodigoGrupo="";}

			String bitEstadoActivoExamen="";
			try{bitEstadoActivoExamen=arrStrColumns[4];}
			catch(Exception ex){bitEstadoActivoExamen="";}

			String bitEstadoSortearExamen="";
			try{bitEstadoSortearExamen=arrStrColumns[5];}
			catch(Exception ex){bitEstadoSortearExamen="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.unidadcurriculartutoralumno VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdUnidadCurricularTutor+","+bigIdAlumno+","+"'"+strCodigoGrupo+"'"+","+bitEstadoActivoExamen+","+bitEstadoSortearExamen+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileUnidadCurricularTutorAlumnoPagina(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdUnidadCurricularTutorAlumno="";
			try{bigIdUnidadCurricularTutorAlumno=arrStrColumns[1];}
			catch(Exception ex){bigIdUnidadCurricularTutorAlumno="";}

			String bigIdPagina="";
			try{bigIdPagina=arrStrColumns[2];}
			catch(Exception ex){bigIdPagina="";}

			String bitEsSalida="";
			try{bitEsSalida=arrStrColumns[4];}
			catch(Exception ex){bitEsSalida="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.unidadcurriculartutoralumnopagina VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdUnidadCurricularTutorAlumno+","+bigIdPagina+","+bitEsSalida+");";
		}

		return strFileMySql;
	}


	public static String ChangeFile(String strFile,String strType) 
	{
			String strFileMySql="";
			
			/*
			if(strType=="Alumno")
			{
				strFileMySql=Test.ChangeFileAlumno(strFile, strType);				
			}
			else if(strType=="TipoArchivo")
			{
				strFileMySql=Test.ChangeFileTipoArchivo(strFile, strType);				
			}
			*/
			
			if(strType=="TipoArchivo")
			{
				strFileMySql=Test.ChangeFileTipoArchivo(strFile, strType);
			}
			else if(strType=="TipoImagen")
			{
				strFileMySql=Test.ChangeFileTipoImagen(strFile, strType);
			}
			else if(strType=="TipoParrafo")
			{
				strFileMySql=Test.ChangeFileTipoParrafo(strFile, strType);
			}
			else if(strType=="TipoTest")
			{
				strFileMySql=Test.ChangeFileTipoTest(strFile, strType);
			}
			else if(strType=="TipoTitulo")
			{
				strFileMySql=Test.ChangeFileTipoTitulo(strFile, strType);
			}
			else if(strType=="TipoUrl")
			{
				strFileMySql=Test.ChangeFileTipoUrl(strFile, strType);
			}		
			else if(strType=="CatalogoUrl")
			{
				strFileMySql=Test.ChangeFileCatalogoUrl(strFile, strType);
			}
			else if(strType=="CatalogoArchivo")
			{
				strFileMySql=Test.ChangeFileCatalogoArchivo(strFile, strType);
			}
			else if(strType=="ControlAjax")
			{
				strFileMySql=Test.ChangeFileControlAjax(strFile, strType);
			}
			else if(strType=="CaracteristicaControlAjax")
			{
				strFileMySql=Test.ChangeFileCaracteristicaControlAjax(strFile, strType);
			}
			else if(strType=="Tutor")
			{
				strFileMySql=Test.ChangeFileTutor(strFile, strType);
			}
			else if(strType=="Alumno")
			{
				strFileMySql=Test.ChangeFileAlumno(strFile, strType);
			}
			else if(strType=="Curso")
			{
				strFileMySql=Test.ChangeFileCurso(strFile, strType);
			}
			else if(strType=="UnidadCurricular")
			{
				strFileMySql=Test.ChangeFileUnidadCurricular(strFile, strType);
			}
			else if(strType=="Pagina")
			{
				strFileMySql=Test.ChangeFilePagina(strFile, strType);
			}
			else if(strType=="Titulo")
			{
				strFileMySql=Test.ChangeFileTitulo(strFile, strType);
			}
			else if(strType=="Parrafo")
			{
				strFileMySql=Test.ChangeFileParrafo(strFile, strType);
			}
			else if(strType=="PreguntaPractica")
			{
				strFileMySql=Test.ChangeFilePreguntaPractica(strFile, strType);
			}
			else if(strType=="RespuestaPractica")
			{
				strFileMySql=Test.ChangeFileRespuestaPractica(strFile, strType);
			}
			else if(strType=="Test")
			{
				strFileMySql=Test.ChangeFileTest(strFile, strType);
			}
			else if(strType=="Pregunta")
			{
				strFileMySql=Test.ChangeFilePregunta(strFile, strType);
			}
			else if(strType=="Respuesta")
			{
				strFileMySql=Test.ChangeFileRespuesta(strFile, strType);
			}
			else if(strType=="CatalogoUrlPagina")
			{
				strFileMySql=Test.ChangeFileCatalogoUrlPagina(strFile, strType);
			}
			else if(strType=="Imagen")
			{
				strFileMySql=Test.ChangeFileImagen(strFile, strType);
			}
			else if(strType=="Agrupacion")
			{
				strFileMySql=Test.ChangeFileAgrupacion(strFile, strType);
			}
			else if(strType=="DetalleAgrupacion")
			{
				strFileMySql=Test.ChangeFileDetalleAgrupacion(strFile, strType);
			}
			else if(strType=="AlumnoPregunta")
			{
				strFileMySql=Test.ChangeFileAlumnoPregunta(strFile, strType);
			}
			else if(strType=="AlumnoRespuesta")
			{
				strFileMySql=Test.ChangeFileAlumnoRespuesta(strFile, strType);
			}
			else if(strType=="AlumnoTest")
			{
				strFileMySql=Test.ChangeFileAlumnoTest(strFile, strType);
			}
			else if(strType=="UnidadCurricularTutor")
			{
				strFileMySql=Test.ChangeFileUnidadCurricularTutor(strFile, strType);
			}
			else if(strType=="UnidadCurricularTutorAlumno")
			{
				strFileMySql=Test.ChangeFileUnidadCurricularTutorAlumno(strFile, strType);
			}
			else if(strType=="UnidadCurricularTutorAlumnoPagina")
			{
				strFileMySql=Test.ChangeFileUnidadCurricularTutorAlumnoPagina(strFile, strType);
			}

			return strFileMySql;	
	}
	 
	public static void ChangeFiles(ArrayList<String> arrayListFiles,String strType,StringBuilder stringBuilderData ) 
	{
		//ArrayList<String> arrayListFilesMySql=new ArrayList<String>();
		String strFileMySql="";
		
		for(String strFile:arrayListFiles)
		{
			
			
			strFileMySql=Test.ChangeFile(strFile, strType);
			
			stringBuilderData.append(strFileMySql);
			stringBuilderData.append("\r\n");
			//arrayListFilesMySql.add(strFileMySql);
		}
		
		//return arrayListFilesMySql;
	}
	
	
	public static String ChangeFilePagina(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdUnidadCurricular="";
			try{bigIdUnidadCurricular=arrStrColumns[1];}
			catch(Exception ex){bigIdUnidadCurricular="";}

			String strCodigo="";
			try{strCodigo=arrStrColumns[2];}
			catch(Exception ex){strCodigo="";}

			String strNombre="";
			try{strNombre=arrStrColumns[3];}
			catch(Exception ex){strNombre="";}

			String intOrden="";
			try{intOrden=arrStrColumns[7];}
			catch(Exception ex){intOrden="";}

			String intNumeroElementos="";
			try{intNumeroElementos=arrStrColumns[6];}
			catch(Exception ex){intNumeroElementos="";}

			String bigNumeroPaginaRespuestas="";
			try{bigNumeroPaginaRespuestas=arrStrColumns[9];}
			catch(Exception ex){bigNumeroPaginaRespuestas="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[4];}
			catch(Exception ex){bitEstado="";}

			String strPath="";
			try{strPath=arrStrColumns[5];}
			catch(Exception ex){strPath="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.pagina VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdUnidadCurricular+","+"'"+strCodigo+"'"+","+"'"+strNombre+"'"+","+intOrden+","+intNumeroElementos+","+bigNumeroPaginaRespuestas+","+bitEstado+","+"'"+strPath+"'"+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileTitulo(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPagina="";
			try{bigIdPagina=arrStrColumns[1];}
			catch(Exception ex){bigIdPagina="";}

			String bigIdTipoTitulo="";
			try{bigIdTipoTitulo=arrStrColumns[2];}
			catch(Exception ex){bigIdTipoTitulo="";}

			String strTitulo="";
			try{strTitulo=arrStrColumns[3];}
			catch(Exception ex){strTitulo="";}

			String intOrden="";
			try{intOrden=arrStrColumns[4];}
			catch(Exception ex){intOrden="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.titulo VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPagina+","+bigIdTipoTitulo+","+"'"+strTitulo+"'"+","+intOrden+");";
		}

		return strFileMySql;
	}

	public static String ChangeFileParrafo(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPagina="";
			try{bigIdPagina=arrStrColumns[1];}
			catch(Exception ex){bigIdPagina="";}

			String bigIdTipoParrafo="";
			try{bigIdTipoParrafo=arrStrColumns[2];}
			catch(Exception ex){bigIdTipoParrafo="";}

			String strParrafo="";
			try{strParrafo=arrStrColumns[3];}
			catch(Exception ex){strParrafo="";}

			String intOrden="";
			try{intOrden=arrStrColumns[4];}
			catch(Exception ex){intOrden="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.parrafo VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPagina+","+bigIdTipoParrafo+","+"'"+strParrafo+"'"+","+intOrden+");";
		}

		return strFileMySql;
	}

	public static String ChangeFilePreguntaPractica(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPagina="";
			try{bigIdPagina=arrStrColumns[1];}
			catch(Exception ex){bigIdPagina="";}

			String strPregunta="";
			try{strPregunta=arrStrColumns[3];}
			catch(Exception ex){strPregunta="";}

			String intNumero="";
			try{intNumero=arrStrColumns[4];}
			catch(Exception ex){intNumero="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[2];}
			catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.preguntapractica VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPagina+","+"'"+strPregunta+"'"+","+intNumero+","+bitEstado+");";
		}

		return strFileMySql;
	}
	
	public static String ChangeFileRespuestaPractica(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPreguntaPractica="";
			try{bigIdPreguntaPractica=arrStrColumns[1];}
			catch(Exception ex){bigIdPreguntaPractica="";}

			String strRespuesta="";
			try{strRespuesta=arrStrColumns[2];}
			catch(Exception ex){strRespuesta="";}

			String bitEsCorrecta="";
			try{bitEsCorrecta=arrStrColumns[3];}
			catch(Exception ex){bitEsCorrecta="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[4];}
			catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.respuestapractica VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPreguntaPractica+","+"'"+strRespuesta+"'"+","+bitEsCorrecta+","+bitEstado+");";
		}

		return strFileMySql;
	}

	
	public static String ChangeFileTest(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdTipoTest="";
			try{bigIdTipoTest=arrStrColumns[1];}
			catch(Exception ex){bigIdTipoTest="";}

			String bigIdUnidadCurricular="";
			try{bigIdUnidadCurricular=arrStrColumns[2];}
			catch(Exception ex){bigIdUnidadCurricular="";}

			String strCodigo="";
			try{strCodigo=arrStrColumns[3];}
			catch(Exception ex){strCodigo="";}

			String intNumeroPreguntas="";
			try{intNumeroPreguntas=arrStrColumns[7];}
			catch(Exception ex){intNumeroPreguntas="";}

			String decValorPonderacion="0.0";
			//try{decValorPonderacion=arrStrColumns[5];}
			//catch(Exception ex){decValorPonderacion="";}

			String strObservaciones="";
			try{strObservaciones=arrStrColumns[5];}
			catch(Exception ex){strObservaciones="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[4];}
			catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.test VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdTipoTest+","+bigIdUnidadCurricular+","+"'"+strCodigo+"'"+","+intNumeroPreguntas+","+decValorPonderacion+","+"'"+strObservaciones+"'"+","+bitEstado+");";
		}

		return strFileMySql;
	}


	public static String ChangeFilePregunta(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdTest="";
			try{bigIdTest=arrStrColumns[1];}
			catch(Exception ex){bigIdTest="";}

			String strPregunta="";
			try{strPregunta=arrStrColumns[3];}
			catch(Exception ex){strPregunta="";}

			String intNumero="";
			try{intNumero=arrStrColumns[4];}
			catch(Exception ex){intNumero="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[2];}
			catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.pregunta VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdTest+","+"'"+strPregunta+"'"+","+intNumero+","+bitEstado+");";
		}

		return strFileMySql;
	}


	public static String ChangeFileRespuesta(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPregunta="";
			try{bigIdPregunta=arrStrColumns[1];}
			catch(Exception ex){bigIdPregunta="";}

			String bigIdTipoValorRespuesta="1";
			//try{bigIdTipoValorRespuesta=arrStrColumns[2];}
			//catch(Exception ex){bigIdTipoValorRespuesta="";}

			String strRespuesta="";
			try{strRespuesta=arrStrColumns[2];}
			catch(Exception ex){strRespuesta="";}

			String bitEsCorrecta="";
			try{bitEsCorrecta=arrStrColumns[4];}
			catch(Exception ex){bitEsCorrecta="";}

			String bitEstado="";
			try{bitEstado=arrStrColumns[3];}
			catch(Exception ex){bitEstado="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.respuesta VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPregunta+","+bigIdTipoValorRespuesta+","+"'"+strRespuesta+"'"+","+bitEsCorrecta+","+bitEstado+");";
		}

		return strFileMySql;
	}




	public static String ChangeFileCatalogoUrlPagina(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPagina="";
			try{bigIdPagina=arrStrColumns[1];}
			catch(Exception ex){bigIdPagina="";}

			String bigIdCatalogoUrl="";
			try{bigIdCatalogoUrl=arrStrColumns[2];}
			catch(Exception ex){bigIdCatalogoUrl="";}

			String strNombre="";
			try{strNombre=arrStrColumns[3];}
			catch(Exception ex){strNombre="";}

			String strResumen="";
			try{strResumen=arrStrColumns[4];}
			catch(Exception ex){strResumen="";}

			String strUrl="";
			try{strUrl=arrStrColumns[5];}
			catch(Exception ex){strUrl="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.catalogourlpagina VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPagina+","+bigIdCatalogoUrl+","+"'"+strNombre+"'"+","+"'"+strResumen+"'"+","+"'"+strUrl+"'"+");";
		}

		return strFileMySql;
	}


	public static String ChangeFileImagen(String strFile,String strType)
	{
		String strFileMySql="";

		if(strFile!=null)
		{
			String arrStrColumns[]={"",""};

			arrStrColumns=strFile.split("\t");

			String strId=arrStrColumns[0];
			String bigIdPagina="";
			try{bigIdPagina=arrStrColumns[1];}
			catch(Exception ex){bigIdPagina="";}

			String bigIdTipoImagen="";
			try{bigIdTipoImagen=arrStrColumns[2];}
			catch(Exception ex){bigIdTipoImagen="";}

			String strNombre="";
			try{strNombre=arrStrColumns[3];}
			catch(Exception ex){strNombre="";}

			String intOrden="";
			try{intOrden=arrStrColumns[4];}
			catch(Exception ex){intOrden="";}

			String imaImagen="";
			try{imaImagen=arrStrColumns[6];}
			catch(Exception ex){imaImagen="";}


			strFileMySql="INSERT INTO aulavirtual_dbo.imagen VALUES("+strId+",1,1,CURRENT_TIMESTAMP"+","+bigIdPagina+","+bigIdTipoImagen+","+"'"+strNombre+"'"+","+intOrden+",'"+imaImagen+"');";
		}

		return strFileMySql;
	}
	
	public static void GenerateMySqlDataStatement() 
	{
		//Alumno
		
		StringBuilder stringBuilderData=new StringBuilder();
		
		ArrayList<String> arrayListFiles=new ArrayList<String>();
		
		
		/*
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\TipoArchivo.txt");
		Test.ChangeFiles(arrayListFiles, "TipoArchivo",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\TipoImagen.txt");
		Test.ChangeFiles(arrayListFiles, "TipoImagen",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\TipoParrafo.txt");
		Test.ChangeFiles(arrayListFiles, "TipoParrafo",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\TipoTest.txt");
		Test.ChangeFiles(arrayListFiles, "TipoTest",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\TipoTitulo.txt");
		Test.ChangeFiles(arrayListFiles, "TipoTitulo",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\TipoUrl.txt");
		Test.ChangeFiles(arrayListFiles, "TipoUrl",stringBuilderData);
		
		
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\CatalogoUrl.txt");
		Test.ChangeFiles(arrayListFiles, "CatalogoUrl",stringBuilderData);
		
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\CatalogoArchivo.txt");
		Test.ChangeFiles(arrayListFiles, "CatalogoArchivo",stringBuilderData);
		
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\ControlAjax.txt");
		Test.ChangeFiles(arrayListFiles, "ControlAjax",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\CaracteristicaControlAjax.txt");
		Test.ChangeFiles(arrayListFiles, "CaracteristicaControlAjax",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Tutor.txt");
		Test.ChangeFiles(arrayListFiles, "Tutor",stringBuilderData);
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Alumno.txt");
		Test.ChangeFiles(arrayListFiles, "Alumno",stringBuilderData);
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Curso.txt");
		Test.ChangeFiles(arrayListFiles, "Curso",stringBuilderData);
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\UnidadCurricular.txt");
		Test.ChangeFiles(arrayListFiles, "UnidadCurricular",stringBuilderData);
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Pagina.txt");
		Test.ChangeFiles(arrayListFiles, "Pagina",stringBuilderData);
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Titulo.txt");
		Test.ChangeFiles(arrayListFiles, "Titulo",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Parrafo.txt");
		Test.ChangeFiles(arrayListFiles, "Parrafo",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\PreguntaPractica.txt");
		Test.ChangeFiles(arrayListFiles, "PreguntaPractica",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\RespuestaPractica.txt");
		Test.ChangeFiles(arrayListFiles, "RespuestaPractica",stringBuilderData);
				
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Test.txt");
		Test.ChangeFiles(arrayListFiles, "Test",stringBuilderData);
		
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Pregunta.txt");
		Test.ChangeFiles(arrayListFiles, "Pregunta",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Respuesta.txt");
		Test.ChangeFiles(arrayListFiles, "Respuesta",stringBuilderData);
		
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\CatalogoUrlPagina.txt");
		Test.ChangeFiles(arrayListFiles, "CatalogoUrlPagina",stringBuilderData);
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Imagen.txt");
		Test.ChangeFiles(arrayListFiles, "Imagen",stringBuilderData);
		
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Agrupacion.txt");
		Test.ChangeFiles(arrayListFiles, "Agrupacion",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\DetalleAgrupacion.txt");
		Test.ChangeFiles(arrayListFiles, "DetalleAgrupacion",stringBuilderData);
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\AlumnoTest.txt");
		Test.ChangeFiles(arrayListFiles, "AlumnoTest",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\AlumnoPregunta.txt");
		Test.ChangeFiles(arrayListFiles, "AlumnoPregunta",stringBuilderData);

		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\AlumnoRespuesta.txt");
		Test.ChangeFiles(arrayListFiles, "AlumnoRespuesta",stringBuilderData);
		
		
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\UnidadCurricularTutor.txt");
		Test.ChangeFiles(arrayListFiles, "UnidadCurricularTutor",stringBuilderData);
	
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\UnidadCurricularTutorAlumno.txt");
		Test.ChangeFiles(arrayListFiles, "UnidadCurricularTutorAlumno",stringBuilderData);
		*/
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\UnidadCurricularTutorAlumnoPagina.txt");
		Test.ChangeFiles(arrayListFiles, "UnidadCurricularTutorAlumnoPagina",stringBuilderData);



		
		Test.GenerateMySql(stringBuilderData,"ExecuteImportData.sql");
		
		
		
		
		
		
		
		
		/*
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\TipoArchivo.txt");				
		Test.ChangeFiles(arrayListFiles, "TipoArchivo",stringBuilderData);
		
		arrayListFiles=new ArrayList<String>();
		arrayListFiles=Test.GetFileText("D:\\Me\\2009\\Proyectos\\Documentacion\\AulaVirtual\\Datos\\DatosAula\\Alumno.txt");				
		Test.ChangeFiles(arrayListFiles, "Alumno",stringBuilderData);
		*/
		
		/*
		String [] arrColumns={""};
		
		for(String strFile:arrayListFiles)
		{
			arrColumns=strFile.split("\t");
			
			for(String strColumn:arrColumns)
			{
				System.out.println(strColumn);
			}
		}
		*/
	}
	
	
	public static ArrayList<String> GetFileText(String strPath) 
	{
		ArrayList<String> arrayListFilesDate=new ArrayList<String>();
		String strFile=new String();
		
		File file = new File(strPath);
	    FileInputStream fis = null;
	    //BufferedInputStream bis = null;
	   // DataInputStream dis = null;
	
	    //StringBuilder stringBuilderData=new StringBuilder();
	   // String [] strRowsData={"",""};
	    
	    try 
	    {
	      fis = new FileInputStream(file);
	
	      // Here BufferedInputStream is added for fast reading.
	      DataInputStream in = new DataInputStream(fis);
	      BufferedReader br = new BufferedReader(new InputStreamReader(in));
	      
	    //Read File Line By Line
	      strFile= br.readLine();
	      
	    while (strFile != null)   
	    {
	
	      // this statement reads the line from the file and print it to
	        // the console.
	        
	         
	        System.out.println(strFile);
	        
	        arrayListFilesDate.add(strFile);
	        
	        strFile=br.readLine();
		       
	      }
	
	      // dispose all the resources after using them.
	      fis.close();
	      in.close();
	      br.close();
	      //bis.close();
	      //dis.close();
	      
	      
	    } 
	    catch (FileNotFoundException e) 
	    {
	      e.printStackTrace();
	    } 
	    catch (IOException e) 
	    {
	      e.printStackTrace();
	    }
	    catch (Exception e) 
	    {
	      e.printStackTrace();
	    }
	    
	    return arrayListFilesDate;
	}
}
	
	


