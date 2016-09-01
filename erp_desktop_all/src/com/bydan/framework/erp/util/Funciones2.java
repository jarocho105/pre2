package com.bydan.framework.erp.util;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
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
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableColumn;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.w3c.dom.Document;

import com.bydan.erp.contabilidad.business.entity.AsientoContable;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Usuario;
//import com.bydan.erp.seguridad.service.ejb.interfaces.SistemaAdditionable;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.LogHtmlFormatter;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Reporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.ParameterSelectionGeneral;
import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;

@SuppressWarnings("unused")
public class Funciones2 {	

	public static Date AdicionarDiasFecha(Date fecha, int iNumDias) {
		Date fechaResultado=new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(fecha);
		
		calendar.add(Calendar.DATE, iNumDias);
		
		fechaResultado = calendar.getTime();
		
		return fechaResultado;
	}
	
	public static String GenerarSecuencial(Long lValor,Integer iNumeroCaracteres,String sTipo) {
		String sResultado="";
				
		sResultado=lValor.toString();
		
		return sResultado;
	}
	
	public static Double Redondear(Double dValor,Integer iNumeroDecimales) {
		Double dResultado=0.0;
				
		dResultado=(double)Math.round(dValor*100.0)/100.0;
		
		return dResultado;
	}
	
	public static String getStringPostgresDate(Date date) {
		//Date date = new Date();
        
		String strDateTime="";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        
		strDateTime=dateFormat.format(date);
	     
		return strDateTime;
	}
	
	public static Date getDatePostgresString(String sDate)throws Exception  {
		DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		Date date ; 
		//formatter = new SimpleDateFormat(sDate);
		date = (Date)formatter.parse(sDate);   
		
		return date;
	}
	
	public static ArrayList<Reporte> getListTiposGraficosReportes()throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		
		reporte=new Reporte();
		reporte.setsCodigo("BARRAS");
		reporte.setsDescripcion("BARRAS");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("BARRAS_3D");
		reporte.setsDescripcion("BARRAS 3D");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("BARRAS_XY");
		reporte.setsDescripcion("BARRAS XY");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("PASTEL");
		reporte.setsDescripcion("PASTEL");
		
		arrayTiposReportes.add(reporte);
						
		reporte=new Reporte();
		reporte.setsCodigo("PASTEL_3D");
		reporte.setsDescripcion("PASTEL 3D");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("APILADO");
		reporte.setsDescripcion("APILADO");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("APILADO_3D");
		reporte.setsDescripcion("APILADO 3D");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("LINEA");
		reporte.setsDescripcion("LINEA");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("LINEA_XY");
		reporte.setsDescripcion("LINEA XY");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("AREA");
		reporte.setsDescripcion("AREA");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("AREA_XY");
		reporte.setsDescripcion("AREA XY");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("AREA_APILADA");
		reporte.setsDescripcion("AREA APILADA");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("DISPERSION");
		reporte.setsDescripcion("DISPERSION");
		
		arrayTiposReportes.add(reporte);
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposPaginacion()throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		
		arrayTiposReportes=Funciones2.getListTiposPaginacion(false,false,false);
				
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposPaginacion(Boolean conModeradasOpciones,Boolean conAvanzadasOpciones,Boolean conTodasOpciones)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		
		reporte=new Reporte();
		reporte.setsCodigo("10");
		reporte.setsDescripcion("10");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("20");
		reporte.setsDescripcion("20");
		
		arrayTiposReportes.add(reporte);
		
		
		reporte=new Reporte();
		reporte.setsCodigo("50");
		reporte.setsDescripcion("50");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("100");
		reporte.setsDescripcion("100");
		arrayTiposReportes.add(reporte);					
		
		if(conModeradasOpciones || conTodasOpciones) {
			reporte=new Reporte();
			reporte.setsCodigo("1000");
			reporte.setsDescripcion("1000");
			arrayTiposReportes.add(reporte);
			
			reporte=new Reporte();
			reporte.setsCodigo("10000");
			reporte.setsDescripcion("10000");
			arrayTiposReportes.add(reporte);	
		}
		
		if(conAvanzadasOpciones || conTodasOpciones) {
			reporte=new Reporte();
			reporte.setsCodigo("100000");
			reporte.setsDescripcion("100000");
			arrayTiposReportes.add(reporte);	
			
			reporte=new Reporte();
			reporte.setsCodigo("1000000");
			reporte.setsDescripcion("1000000");
			arrayTiposReportes.add(reporte);	
		}
		
		if(conTodasOpciones) {
			reporte=new Reporte();
			reporte.setsCodigo("100000000");
			reporte.setsDescripcion("100000000");
			arrayTiposReportes.add(reporte);
			
			reporte=new Reporte();
			reporte.setsCodigo("TODOS");
			reporte.setsDescripcion("TODOS");
			arrayTiposReportes.add(reporte);
		}
		
		return arrayTiposReportes;
	}
	
	public static Reporte getTipoPaginacionDefecto(String sTipo,ArrayList<Reporte> arrayTiposReportes)throws Exception  {
		Reporte reporteDefecto=new Reporte();
		Boolean esPrimero=true;
		
		if(sTipo.equals("NORMAL")) {
			
			for(Reporte reporte:arrayTiposReportes) {
				if(esPrimero) {
					reporteDefecto=reporte;
				}
				
				if(reporte.getsCodigo().equals("10")) {
					reporteDefecto=reporte;
					break;
				}
				
				if(esPrimero) {
					esPrimero=false;
				}
			}
			
			
		} else if(sTipo.equals("RELACIONADO")) {
			
			for(Reporte reporte:arrayTiposReportes) {
				if(esPrimero) {
					reporteDefecto=reporte;
				}
				
				if(reporte.getsCodigo().equals("100")) {
					reporteDefecto=reporte;
					break;
				}
				
				if(esPrimero) {
					esPrimero=false;
				}
			}
		}
				
		return reporteDefecto;
	}
	
	public static int getPaginacionDefecto(String sTipo)throws Exception  {
		Integer iPaginacionDefecto=10;
		
		if(sTipo.equals("NORMAL")) {
			iPaginacionDefecto=10;
			
		} else if(sTipo.equals("RELACIONADO")) {
			iPaginacionDefecto=100;
		}
		
		return iPaginacionDefecto;
	}
	
	public static ArrayList<Reporte> getListTiposAcciones()throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=Funciones2.getListTiposAcciones(false,false,false);
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposAcciones(Boolean tieneReporteGroup)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=Funciones2.getListTiposAcciones(tieneReporteGroup,false,false);
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposAcciones(Boolean tieneReporteGroup,Boolean conImportar)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=Funciones2.getListTiposAcciones(tieneReporteGroup,conImportar,false);
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposRelaciones()throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		String sDefault="RELACIONES";//"ESCOJA ACCION"
		
		reporte=new Reporte();
		reporte.setsCodigo(sDefault);
		reporte.setsDescripcion(sDefault);
		
		arrayTiposReportes.add(reporte);
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposAcciones(Boolean tieneReporteGroup,Boolean conImportar,Boolean conRecargarFKs)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		String sDefault="ACCIONES";//"ESCOJA ACCION"
		
		reporte=new Reporte();
		reporte.setsCodigo(sDefault);
		reporte.setsDescripcion(sDefault);
		
		arrayTiposReportes.add(reporte);
		
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("ESCOJA ACCION");
		reporte.setsDescripcion("ESCOJA ACCION");
		
		arrayTiposReportes.add(reporte);
		*/
		
		
		reporte=new Reporte();
		reporte.setsCodigo("GENERAR REPORTE");
		reporte.setsDescripcion("GENERAR REPORTE");
		
		arrayTiposReportes.add(reporte);
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("GENERAR REPORTE FORM");
		reporte.setsDescripcion("GENERAR REPORTE FORM");
		
		arrayTiposReportes.add(reporte);
		*/
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("GENERAR REPORTE DINAMICO");
		reporte.setsDescripcion("GENERAR REPORTE DINAMICO");
		
		arrayTiposReportes.add(reporte);
		*/
		
		reporte=new Reporte();
		reporte.setsCodigo("EXPORTAR_DATOS");
		reporte.setsDescripcion("EXPORTAR DATOS");
		
		arrayTiposReportes.add(reporte);
		
		if(conImportar) {
			reporte=new Reporte();
			reporte.setsCodigo("IMPORTAR_DATOS");
			reporte.setsDescripcion("IMPORTAR DATOS");
			
			arrayTiposReportes.add(reporte);
		}
		
		if(conRecargarFKs) {
			reporte=new Reporte();
			reporte.setsCodigo("RECARGAR_FK");
			reporte.setsDescripcion("RECARGAR REFERENCIAS");
			
			arrayTiposReportes.add(reporte);
		}
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("EXPORTAR_DATOS_EXCEL");
		reporte.setsDescripcion("EXPORTAR DATOS EXCEL");
		
		arrayTiposReportes.add(reporte);
		*/
		
		if(tieneReporteGroup) {
			/*
			reporte=new Reporte();
			reporte.setsCodigo("GENERAR_REPORTE_GROUP_GENERICO");
			reporte.setsDescripcion("GENERAR REPORTE GROUP GENERICO");
			
			arrayTiposReportes.add(reporte);
			
			reporte=new Reporte();
			reporte.setsCodigo("GENERAR_REPORTE_TOTALES_GROUP_GENERICO");
			reporte.setsDescripcion("GENERAR REPORTE TOTALES GROUP GENERICO");
			
			arrayTiposReportes.add(reporte);
			*/
		}
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("20");
		reporte.setsDescripcion("20");
		
		arrayTiposReportes.add(reporte);
		*/		
						
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposAccionesFormulario(Boolean tieneReporteGroup,Boolean conImportar)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=Funciones2.getListTiposAccionesFormulario(tieneReporteGroup,conImportar,false);
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposAccionesFormulario(Boolean tieneReporteGroup,Boolean conImportar,Boolean conRecargarFKs)throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		
		reporte=new Reporte();
		reporte.setsCodigo("ESCOJA ACCION");
		reporte.setsDescripcion("ESCOJA ACCION");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo("GENERAR REPORTE");
		reporte.setsDescripcion("GENERAR REPORTE");
		
		arrayTiposReportes.add(reporte);
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("GENERAR REPORTE FORM");
		reporte.setsDescripcion("GENERAR REPORTE FORM");
		
		arrayTiposReportes.add(reporte);
		*/
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("GENERAR REPORTE DINAMICO");
		reporte.setsDescripcion("GENERAR REPORTE DINAMICO");
		
		arrayTiposReportes.add(reporte);
		*/
		
		reporte=new Reporte();
		reporte.setsCodigo("EXPORTAR_DATOS");
		reporte.setsDescripcion("EXPORTAR DATOS");
		
		arrayTiposReportes.add(reporte);
		
		if(conImportar) {
			/*
			reporte=new Reporte();
			reporte.setsCodigo("IMPORTAR_DATOS");
			reporte.setsDescripcion("IMPORTAR DATOS");
			
			arrayTiposReportes.add(reporte);
			*/
		}
		
		if(conRecargarFKs) {
			reporte=new Reporte();
			reporte.setsCodigo("RECARGAR_FK");
			reporte.setsDescripcion("RECARGAR REFERENCIAS");
			
			arrayTiposReportes.add(reporte);
		}
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("EXPORTAR_DATOS_EXCEL");
		reporte.setsDescripcion("EXPORTAR DATOS EXCEL");
		
		arrayTiposReportes.add(reporte);
		*/
		
		if(tieneReporteGroup) {
			/*
			reporte=new Reporte();
			reporte.setsCodigo("GENERAR_REPORTE_GROUP_GENERICO");
			reporte.setsDescripcion("GENERAR REPORTE GROUP GENERICO");
			
			arrayTiposReportes.add(reporte);
			
			reporte=new Reporte();
			reporte.setsCodigo("GENERAR_REPORTE_TOTALES_GROUP_GENERICO");
			reporte.setsDescripcion("GENERAR REPORTE TOTALES GROUP GENERICO");
			
			arrayTiposReportes.add(reporte);
			*/
		}
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("20");
		reporte.setsDescripcion("20");
		
		arrayTiposReportes.add(reporte);
		*/		
						
		
		return arrayTiposReportes;
	}
	
	public static ArrayList<Reporte> getListTiposSeleccionar()throws Exception  {
		ArrayList<Reporte> arrayTiposReportes=new ArrayList<Reporte>();
		Reporte reporte=null;
		String sDefault="COLUMNAS";//"SELECCIONAR"
		
		reporte=new Reporte();
		reporte.setsCodigo("ESCOJA COLUMNA");
		reporte.setsDescripcion("ESCOJA COLUMNA");
		
		arrayTiposReportes.add(reporte);
		
		reporte=new Reporte();
		reporte.setsCodigo(sDefault);
		reporte.setsDescripcion(sDefault);
		
		arrayTiposReportes.add(reporte);				
		
		/*
		reporte=new Reporte();
		reporte.setsCodigo("20");
		reporte.setsDescripcion("20");
		
		arrayTiposReportes.add(reporte);
		*/		
						
		
		return arrayTiposReportes;
	}
	
	public static String getDescripcionBoolean(Boolean valor) throws Exception {
		String sDescripcion=Constantes.SCAMPOVERDADERO;

		if(!valor) {
			sDescripcion=Constantes.SCAMPOFALSO;
		}

		return sDescripcion;
	}
	
	public static Boolean verificarGetPermisosUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		for(String sPagina:arrPaginasFinal) {
			if(sPagina.equals(sPaginaActual)) {
				verificado=true;
				break;
			}
		}
		
		return verificado;
	}
	
	public static Boolean verificarGetPermisosUsuarioOpcionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		for(Opcion opcion:opcionsFinal) {
			if(opcion.getnombre_clase().equals(sPaginaActual)) {
				verificado=true;
				break;
			}
		}
		
		return verificado;
	}
	
	public static int getColumnIndexByName(JTable table, String name) {
	    for (int i = 0; i < table.getColumnCount(); ++i)
	        if (table.getColumnName(i).equals(name))
	            return i;
	    return -1;
	}
	
	public static void getMensajeTiempoEjecucion(long start_time,long end_time,String sTipo,Boolean enSegundos) {
		long lTotal=0;
		String sSufijo=" ms ";
		lTotal=(end_time - start_time);
				
		if(enSegundos) {
			lTotal=lTotal/ 1000;
			sSufijo=" seg ";
		}
		
		System.out.println("Total "+sTipo+" ==> " + lTotal + " "+sSufijo);
	}
	
	public static Color getColorFilaTabla1() {
		//return Color.LIGHT_GRAY;
		return new Color(220,220,220);
	}
	
	public static Color getColorFilaTabla2() {
		return Color.WHITE;				
	}
	
	public static Color getColorFilaTablaTotales() {
		return Color.YELLOW;
	}
	
	public static Color getColorTextoFilaTabla1() {
		return Color.BLACK;
	}
	
	public static void mostrarMensajeDeveloping(String sMensaje) {
		System.out.println(sMensaje);
		
		if(Constantes2.ISDEVELOPING_QUERY_EXPORT) {
			if(Constantes2.BufferedWriter!=null) {
				try {
					Constantes2.BufferedWriter.write(sMensaje+";\r\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String getStringFromInputStream(InputStream is) {
		 
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		String line;
		Boolean esPrimer=true;
		
		try {
 
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				if(!esPrimer) {
					line="\r\n"+line;
				} else {
					esPrimer=false;
				}
				
				sb.append(line);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
 
		return sb.toString();
	}
	
	public static String getQueryExportar(DatosCliente datosCliente,String sQuery,QueryWhereSelectParameters queryWhereSelectParameters) {
		String sQueryExportar="";
		
		if(datosCliente.getIsConExportar()) {
			if(queryWhereSelectParameters.getDbType().equals(ParameterDbType.POSTGRES)) {
				/*
				COPY (SELECT column1, column2, column3, column4
				FROM tablename
				WHERE column1 = �value�
				ORDER BY column4 DESC
				LIMIT 100)
				TO '/usr/local/pgsql/data/csv/limit_export.csv'
				WITH DELIMITER ','
				CSV HEADER  
				*/
				
				sQueryExportar=" copy ("+sQuery+") to '"+datosCliente.getDatosExportar().getsPath()+"'";
				sQueryExportar+=" with delimiter '"+datosCliente.getDatosExportar().getsDelimiter()+"'";
				sQueryExportar+=" "+datosCliente.getDatosExportar().getsTipo();
				
				if(datosCliente.getDatosExportar().getConCabecera()) {
					sQueryExportar+=" header";
				}
			}
		}
		
		return sQueryExportar;
	}
	
	public static String getTipoExportar(ParametroGeneralUsuario parametroGeneralUsuario) {
		String sTipoExportar="csv";
		
		if(parametroGeneralUsuario.getid_tipo_exportar().equals(1L) 
			|| parametroGeneralUsuario.getid_tipo_exportar().equals(2L)) {
			
			sTipoExportar="csv";
		}
		
		return sTipoExportar;
	}
	
	public static String getTipoDelimiter(ParametroGeneralUsuario parametroGeneralUsuario) {
		String sTipoExportar=",";
		
		if(parametroGeneralUsuario.getid_tipo_delimiter().equals(1L)) {
			sTipoExportar=",";
			
		} else if(parametroGeneralUsuario.getid_tipo_delimiter().equals(2L)) {
			sTipoExportar="\t";
		
		} else if(parametroGeneralUsuario.getid_tipo_delimiter().equals(3L)) {
			sTipoExportar=";";
		}
		
		return sTipoExportar;
	}
	
	public static String getTipoExtensionArchivoExportar(ParametroGeneralUsuario parametroGeneralUsuario) {
		String sTipoExportar="txt";
		
		if(parametroGeneralUsuario.getid_tipo_exportar().equals(1L) 
			|| parametroGeneralUsuario.getid_tipo_exportar().equals(2L)) {
			
			sTipoExportar="txt";
		}
		
		return sTipoExportar;
	}
	
	public static Border getBorderResaltar(ParametroGeneralUsuario parametroGeneralUsuario,String sTipo) {
		//DEFAULT "COLUMNA"
		Integer iWidthLine=2;
		Border borderResaltar = null;
		Color color=Color.GREEN;
		
		if(sTipo.equals("TAB")) {
			iWidthLine=3;
			
		} else if(sTipo.equals("BUTTON")) {
			//BORDER PARA FORMULARIOS RELACIONADOS(MAESTRO-DETALLE)
			color=Color.BLUE;
		}
		
		borderResaltar = BorderFactory.createMatteBorder(iWidthLine, iWidthLine, iWidthLine, iWidthLine, color);
		
		return borderResaltar;
	}
	
	public static Border getBorderResaltar(ParametroGeneralUsuario parametroGeneralUsuario) {
		Border borderResaltar = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);
		
		return borderResaltar;
	}
	
	public static Border getBorderResaltar() {
		Border borderResaltar = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);
		
		return borderResaltar;
	}
	
	public static void setTableColumnOcultar(TableColumn tableColumn) {
		tableColumn.setPreferredWidth(0);
		tableColumn.setWidth(0);
		tableColumn.setMinWidth(0);
	}
	
	public static Document parseXml(InputStream inputStream) throws Exception {
	    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	
	    documentBuilderFactory.setValidating(false);
	    documentBuilderFactory.setIgnoringComments(true);
	    documentBuilderFactory.setIgnoringElementContentWhitespace(false);
	    documentBuilderFactory.setNamespaceAware(true);
	    // documentBuilderFactory.setCoalescing(true);
	    // documentBuilderFactory.setExpandEntityReferences(true);
	
	    DocumentBuilder documentBuilder = null;
	    documentBuilder = documentBuilderFactory.newDocumentBuilder();
	    //documentBuilder.setEntityResolver(new NullResolver());
	
	    // documentBuilder.setErrorHandler( new MyErrorHandler());
	
	    return documentBuilder.parse(inputStream);
	}
	
	public static String getExtensionTipoImagen(Long id_tipo_imagen) {
		String sExtension="";
		
		if(id_tipo_imagen.equals(1L)) {
			sExtension="jpg";
		
		} else if(id_tipo_imagen.equals(2L)) {
			sExtension="gif";
		}
		
		return sExtension;
	}
	
	public static String getExtensionTipoArchivo(Long id_tipo_archivo) {
		String sExtension="";
		
		if(id_tipo_archivo.equals(1L)) {
			sExtension="jpg";
		
		} else if(id_tipo_archivo.equals(2L)) {
			sExtension="txt";
			
		} else if(id_tipo_archivo.equals(3L)) {
			sExtension="docx";
			
		} else if(id_tipo_archivo.equals(4L)) {
			sExtension="xlsx";
		
		}  else if(id_tipo_archivo.equals(5L)) {
			sExtension="pdf";
		}

		return sExtension;
	}
	
	public static void writeQueryFile(PreparedStatement pstmt) {
		//BufferedWriter bufferedWriter = null;
		
		try {
			//bufferedWriter = new BufferedWriter(new FileWriter(Constantes2.SPATH_EXPORT));
			
			if(Constantes2.ISDEVELOPING_QUERY_EXPORT) {
				if(Constantes2.BufferedWriter!=null) {
					Constantes2.BufferedWriter.write(pstmt.toString()+";\r\n");
				}
			}
			//bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static String getFinalQueryOrderBy(ArrayList<OrderBy> arrOrderBy) {
		Boolean existeOrderBy=false;
		String sOrderBy="";
		
		if(arrOrderBy.size()>0) {
			for(OrderBy orderBy:arrOrderBy) {
				if(orderBy.getisSelected()) {
					if(!existeOrderBy) {
						existeOrderBy=true;						
					} else {
						sOrderBy+=",";
					}
					
					if(!orderBy.getsPrefijoSql().equals("")) {
						sOrderBy+=orderBy.getsPrefijoSql()+".";
					}
					
					sOrderBy+=orderBy.getsNombreDB();
					
					if(!orderBy.getesDesc()) {
						sOrderBy+=" asc ";
					} else {
						sOrderBy+=" desc ";
					}
				}
			}
		}
		
		if(existeOrderBy) {
			sOrderBy=" order by "+sOrderBy;
		}
		
		return sOrderBy;
	}
	
	public static Boolean permiteMostarParaBusqueda(Boolean esParaBusquedaForeignKey,String sNombreColumna,Boolean esFk,Integer iCountNumeroColumnasNormal,Integer iCountNumeroColumnasFk) {
		Boolean permite=true;
		Integer iCountNumeroColumnas=iCountNumeroColumnasNormal + iCountNumeroColumnasFk;
		
		if(esParaBusquedaForeignKey) {
			if(iCountNumeroColumnas>=15) {
				permite=false;
			} else {
				if(iCountNumeroColumnasNormal>=10) {
					permite=false;
				}
			}
		}
		
		return permite;
	}
	
	public static int getValorProporcion(Integer iValorInicial,Integer iPorcentajeProporcion) {
		Double dValorProporcion=iValorInicial.doubleValue();
		Double dFactorPorcentaje=(iPorcentajeProporcion.doubleValue() / 100.0); 
		
		dValorProporcion=iValorInicial * dFactorPorcentaje;
		
		Integer iValorProporcionFinal=dValorProporcion.intValue();
		
		return iValorProporcionFinal;
	}
	
	public static CellStyle getStyleTitulo(Workbook workbook,String sTipo) {
		CellStyle cellStyle = workbook.createCellStyle();
		org.apache.poi.ss.usermodel.Font font= workbook.createFont();
		
		if(sTipo.equals("PRINCIPAL")) {
			cellStyle.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
			
			font.setFontHeightInPoints((short)12);
			font.setBoldweight(org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_BOLD);//new XSSFColor(new java.awt.Color(red,green,blue))
			cellStyle.setFont(font);
		    //font.setColor(IndexedColors.WHITE.getIndex());		   
		    //font.setItalic(false);
			
		} else if(sTipo.equals("ZEBRA")) {
			cellStyle.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());//new XSSFColor(new java.awt.Color(red,green,blue))					
		
		} else if(sTipo.equals("PRINCIPAL_VERTICAL")) {
			cellStyle.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.getIndex());//new XSSFColor(new java.awt.Color(red,green,blue))
			
			font.setFontHeightInPoints((short)12);
			font.setBoldweight(org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_BOLD);
			cellStyle.setFont(font);
			cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
		    //font.setColor(IndexedColors.WHITE.getIndex());		   
		    //font.setItalic(false);
			
		} 
		
		cellStyle.setFillPattern(CellStyle.ALIGN_CENTER);
		
		return cellStyle;
	}
}
