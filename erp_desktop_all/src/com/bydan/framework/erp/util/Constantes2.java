package com.bydan.framework.erp.util;

import java.io.BufferedWriter;
import java.util.ArrayList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.w3c.dom.Document;

@SuppressWarnings("unused")
public class Constantes2 
{
		
	public  static String S_UTF8="UTF-8";
	public  static String S_DELIMITER="\\A";	
	public  static String S_KEYWHERE="--where";
	public  static String S_SELECCIONAR="Sel";
	public  static String S_ELI="Eli";
	public  Document DOCUMENT_BUILDER=null;
	
	public  static Boolean CON_COMBOBOX_ITEMLISTENER=true;
	public  static Boolean CON_WEB_EXPRESS_VERSION2=false;
	public  static Boolean CON_PROCESO_HILO=false;
	public  static Boolean CON_PRECARGAR_CLASES_WEB=true;
	//public  static Boolean CON_CARGAR_CLASES_PORPARTE=true;
	public  static Boolean CON_DEEPLOAD_REL=true;
	
	public  static Boolean ISDEVELOPING2=true;
	//public  static Boolean ISDEVELOPING3_LOAD_WEB_MIN=false;
	public  static Boolean ISDEVELOPING_SQL=false;
	
	public  static Boolean ISDEVELOPING_QUERY_EXPORT=false;
	public  static String SPATH_EXPORT="D:/erp_bydan/query/";
	public static String SFILENAME_EXPORT="file.sql";
	public static BufferedWriter BufferedWriter = null;
	
	public static Boolean ISDEVELOPING_MIGRATION=false;
	public static Boolean ISDEVELOPING_VALIDACIONDATOS_TRAER=false;
	
	public  static String S_TIPO="TIPO";
	public  static String S_TOTAL="TOTAL";
	
	public  static String S_TOTALES="TOTALES";
	public  static String S_CODIGO_UNICO="Cod. Unico";
	
	final public static Integer ISWING_ANCHO_CONTROL_LABEL2=200;
	final public static Integer ISWING_ANCHO_CONTROL_BOTONICONO=30;
	
	final public static Integer ISWING_ALTO_CONTROL_LABEL=22;
	final public static Integer ISWING_ALTO_CONTROL_LABEL2=27;
	final public static Integer ISWING_ALTO_CONTROL_BOTONICONO=25;
	
	final public static Integer ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL=300;
	final public static Integer ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL=150;
	
	final public static Integer ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY=250;
	final public static Integer ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY=330;//250;300
	
	public  static String S_REPORTE_EXTRA_GROUP_GENERICO="GroupGenerico";
	
	public  static String S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO="GroupTotalesGenerico";
	
	public  static String S_REPORTE_EXTRA_GROUP_REPORTE="GroupReporte";
	
	public  static String S_ICON_IMAGE="icon.gif";
	
	public  static String S_FONDOBORDE_IMAGE="fondo_cabecera";
	
	public  static String S_FONDOCONTROL_COLOR="azul";
	
	public  static String S_SIZE_VARIANT="regular";
	
	public  static String S_NAME_VARIANT="JComponent.sizeVariant";
	
	public  static String S_PATH_ULTIMO_ARCHIVO="";
	
	public static Integer I_CELLSPACING=0;
	
	public static Integer I_CELLSPACING_LEFT=5;
	
	public  static Boolean CON_PRECARGAR_RECARGADO_ACTIVOSFIJOS=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_CARTERA=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_COMISIONES=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_CONTABILIDAD=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_CUENTASPORCOBRAR=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_CUENTASPORPAGAR=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_FACTURACION=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_IMPORTACIONES=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_INVENTARIO=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_NOMINA=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_PRODUCCION=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_PUNTOVENTA=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_SEGURIDAD=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_SRI=false;
	public  static Boolean CON_PRECARGAR_RECARGADO_TESORERIA=false;
}