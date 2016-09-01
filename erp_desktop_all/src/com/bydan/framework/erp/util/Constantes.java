package com.bydan.framework.erp.util;

import java.util.ArrayList;

//import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;

//@Stateless
@SuppressWarnings("unused")
public class Constantes 
{
	
	//@PersistenceUnit(unitName="PersistenceUnitEnvioMail")
	final public static EntityManagerFactory JPAENTITYMANAGERFACTORY=null;//Persistence.createEntityManagerFactory(Constantes.SJPAPERSISTENCEUNITNAME);
	
	final public  static String SJPAPERSISTENCEUNITNAME="PersistenceUnitEnvioMail";
	
	public  static ConnexionType CONNEXIONTYPE=ConnexionType.JDBC32;//ConnexionType.HIBERNATE;//ConnexionType.JDBC32;
	
	public  static ParameterDbType PARAMETERDBTYPE=ParameterDbType.POSTGRES;
	
	public  static Boolean ISJBOSS=false;
	
	public  static Boolean ISDEVELOPING=false;
	
	public  static Boolean ISSETVERSIONROWUPDATE=false;
	
	final public  static String SPREFIXJNDI="java:";
	
	final public  static String SCONNEXIONDATASOURCE="EnvioMailDataSource";
	
	final public  static Boolean ISUSACONNECTIONFROMDATASOURCESSERVER=false;
	
	final public  static String SFINALQUERY=" order by id ";
	
	//CONSTANTES EJB
	final public  static Boolean ISUSAEJBLOGICLAYER=true;
	
	final public  static Boolean ISUSAEJBREMOTE=false;
	
	final public  static Boolean ISUSAEJBRMI=false;
	
	public  static Boolean ISUSAEJBREMOTEADDITIONAL=false;
	
	final public  static Boolean ISUSAEJBHOME=false;
	
	public  static String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";//"org.jboss.naming.HttpNamingContextFactory";//"org.jnp.interfaces.NamingContextFactory";
	
	public  static String PROVIDER_URL="jnp://localhost:1099";//"http://bydan.homelinux.com:80/invoker/JNDIFactory";//"jnp://localhost:1099";//bydan.homelinux.com
	
	public  static String URL_PKG_PREFIXES="org.jboss.naming:org.jnp.interfaces";//"org.jboss.naming";//"org.jboss.naming:org.jnp.interfaces";
	
	
	final public  static String SEJBPACKAGE="seguridad";
	
	final public static String SEJBLOCAL="local";
	
	final public static String SEJBREMOTE="remote";
	
	final public static String SSESSIONBEAN="SessionBean";
	
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	final public static String SVALIDACIONCADENA="No es cadena";
	
	final public static String SREGEXCADENA="No es cadena";
	
	final public static String SREGEXCADENATODOS="[^�]*";
	
	final public static String SVALIDACIONNUMEROENTERO="No es numero";
	
	final public static String SREGEXNUMEROENTERO="No es numero";
	
	final public static String SVALIDACIONNOTNULL="Es nulo";
	
	final public static String SVALIDACIONSMALLINT="No es smallint";
	
	final public static String SVALIDACIONBIGINT="No es bigint";
	
	final public static String SVALIDACIONLENGTH="No tamanio";
	
	//MENSAJES Y REGEX GENERALES VALIDACIONES
	
	final public static String SEJBADDITIONAL="Additional";
	
	final public static String SEJBSEPARATOR="/";
	
	private static ArrayList<String> arrMailsVerificacionErrores=new ArrayList<String>();

	final public static String SMAILIP="200.31.26.156";
	
	final public static String SMAILPORT="";
	
	final public static String SMAILDNS="tame.com.ec";
	
	final public static String SDNSNAMESERVER="localhost";
	
	final public static String SPORTSERVER="8081";
	
	final public static String SCONTEXTSERVER="erp";
	
	final public static String SUNIDAD_ARCHIVOS="C";
	
	public  static Boolean ISMOSTRARMENSAJESMANTENIMIENTO=true;
	
	final public static Long LIDPERFILTUTOR=2L;

	final public static Long LIDPERFILALUMNO=2L;

	final public static String SERROR="ERROR";
	
	final public static String SURLVIDEO="VIDEO";
		
	final public static String SLABELARCHIVOS="Archivos";
	
	final public static String SLABELRESUMENES="Resumenes";
	
	final public static String SLABELURLS="Urls";
	
	final public static String SLABELPREGUNTASOPCIONES="Preguntas";
	
	final public static String SLABELPREGUNTASYRESPUESTAS="Preguntas Y Respuestas";
	
	final public static String SLABELURLSYENLACES="Urls y Enlaces externos";
	
	final public static String SLABELVERDESDEYOUTUBE="Ver desde Youtube";
	
	final public static String SLABELVERDESDEVIDEOGOOGLE="Ver desde Video Google";
	
	final public static String SLABELPREGUNTAS="Preguntas";
	
	final public static String SLABELRESPUESTAS="Respuestas";
	
	final public static String SLABELRESPUESTASCORRECTAS="Respuestas Correctas";
		
	final public static String SPALABRACLAVEREEMPLAZARHTML="REEMPLAZAR";
	
	final public static String SRAIZDESDEPAGINASCURSO="../../../../";
	
	final public static String SURLVIDEOGOOGLE="GOOGLE";
	
	final public static String SURLVIDEOYOUTUBE="YOUTUBE";
	
	final public static String SNOMBRESISTEMACARPETA="AulaVirtual";
	
	final public static String SLABELIMPRIMIR="Imprimir Pagina";
	
	final public static String SNOMBREINICIOPARAMETROTITULO="sTitulo";
	
	final public static String SNOMBREINICIOPARAMETROPARRAFO="sParrafo";
	
	final public static String SNOMBREINICIOPARAMETROPATHIMAGEN="sPathImagen";
	
	final public static String SLABELREESPUESTASSOLAMENTE="Respuestas de la p�gina ";
	
	final public static String SRAIZDESDECURSO="../../../";

	final public static Integer INUMEROELEMENTOSMINIMOPAGINA=4;

	final public static Long LIDPERFILADMINISTRADORAULAVIRTUAL=2L;
	
	final public static Long LIDPERFILADMINISTRADOR=1L;

	final public static String SCARPETAPAGINAS="Paginas";

	final public static String SPATHLOGGIN="C:\\";

	final public static String SLOGGINPACKAGEFILE="bydan.enviomails_f";
	
	final public static String SLOGGINPACKAGECONSOLE="bydan.enviomails_c";

	public static String SCONNEXION="127.0.0.1:3306/enviomails_dbo?user=root////password=root";
	
	public static String SCONNEXION_USER="root";
	
	public static String SCONNEXION_PASSWORD="root";
	
	public static String SCONNEXION_POSTGRES="127.0.0.1:5432/bydan_erp";//"127.0.0.1:5432/bydan_erp";"192.168.1.4:5432/bydan_erp";
	
	public static String SCONNEXIONAUDITORIA="127.0.0.1:3306/auditoria_dbo?user=root////password=root";
	
	public static String SCONNEXIONSEGURIDAD="127.0.0.1:3306/seguridads_dbo?user=root////password=root";
	
	//SERVICIO RMI
	public static String SSERVICIO_RMI_IP="127.0.0.1";
	public static Integer SSERVICIO_RMI_PORT=1099;
	//SERVICIO RMI
		
	final public static String SLABELIMPRIMIRHASTA="Imprimir hasta la pagina";
	
	final public static String SLABELIMPRIMIRCURSOUNIDADCURRICULAR="Imprimir Curso";
	
	final public static Integer ITAMANIOPAGINA=600;
	
	final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOS=350;
	final public static Integer ISWING_TAMANIOMINIMO_TABLADATOS=260;
	
	//PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS
	final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
	final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
	
	final public static Integer ISWING_RESTOPARTE_DIFERENCIA_ANCHO=7;
	
	final public static Integer ISWING_RESTOPARTE_DIFERENCIA_ALTO=8;//5;
		
	final public static Integer ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL=5;
	final public static Integer ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL=4;
	
	final public static Integer ISWING_ANCHO_CONTROL=150;
	final public static Integer ISWING_ANCHO_CONTROL_VALOR=100;
	final public static Integer ISWING_ANCHO_CONTROL_FECHA=100;//FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,80)
	final public static Integer ISWING_ANCHO_CONTROL_LABEL=150;
	final public static Integer ISWING_ANCHO_CONTROL_LABEL2=80;
	final public static Integer ISWING_ALTO_CONTROL=22;
	final public static Integer ISWING_ALTO_CONTROL_FECHA=26;//Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA
	final public static Integer ISWING_ANCHO_COLUMNA=100;
	final public static Integer ISWING_ALTO_FILA=34;
	final public static Integer ISWING_ALTO_FILA_TABLA=18;
	final public static Integer ISWING_ALTO_FILA_TABLA_EXTRA_FECHA=4;
	//PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS
	final public static Integer ISWING_ALTO_TABPANE=350;//375;400;260;
	final public static Integer ISWING_ALTO_TABPANE_BUSQUEDA=130;//150;
	
	public static String SAUDITORIABUSCAR="BUSQ";
	
	public static String SAUDITORIAINSERTAR="INS";
	
	public static String SAUDITORIAACTUALIZAR="ACT";
	
	public static String SAUDITORIAELIMINARLOGICAMENTE="ELMLGC";
	
	public static String SAUDITORIAELIMINARFISICAMENTE="ELMFSC";
	
	final public static Long LIDSISTEMAACTUAL=14L;
	
	public static Long LIDMODULOACTUAL=2L;
	
	final public static String SAREADEPARTAMENTO="BYDAN";
	
	final public static String SCHEMA="seguridad";

	public static final String SCHEMAAUDITORIA="auditoria";
	
	final public static String SFALSE="false";
	
	final public static String SNONE="NONE";
		
	public static String SCAMPONONE="NONE";
	
	final public static String SCAMPOVERDADERO="Si";//Verdadero
	
	final public static String SCAMPOFALSO="No";//Falso

	public static String SHTMLFLECHA="->";
		
	final public static String SEXTENSIONARCHIVOJSP=".jsp";
	
	final public static String SPREFIJOARCHIVOJSP="Mantenimiento";
	
	//CONSTANTES PAGINATION
	final public static String SPAGINATIONONE="NONE";
	
	final public static String SPAGINATIONEXT="NEXT";
	
	final public static String SPAGINATIOPREVIEW="PREVIEW";
	
	
	//CONSTANTES MENSAJE
	final public static String SMENSAJEVERIFICARPERMISOSCODIGO="verificarpermisosmantenimiento";
	final public static String SMENSAJEVERIFICARPERMISOSTITULO="Verificar permisos de usuario";
	final public static String SMENSAJEAUXILIAR="Auxiliar";
	final public static String SMENSAJEULTIMABUSQUEDA="Ultima Busqueda";
	final public static String SMENSAJEREGISTROSESSION="Registro de sesion";
	final public static String SMENSAJEEXCEPCIONDEAPLICACION="Excepcion de Aplicacion";
	final public static String SMENSAJEERRORDEAPLICACION="Error de aplicacion";
	
	final public static String SMENSAJEGRUPO="mensajegrupo";
	final public static String SMENSAJETIPO="mensajetipo";
	final public static String SMENSAJENOMBREMENSAJE="nombremensaje";
	final public static String SMENSAJEESOPCIONAL="esopcional";
	final public static String SMENSAJETITULO="titulo";
	final public static String SMENSAJEMENSAJEUSUARIO="mensajeusuario";
	final public static String SMENSAJEMENSAJETECNICO="mensajetecnico";
	final public static String SMENSAJEAPLICACIONJ2EE="aplicacionj2ee";
	final public static String SMENSAJEAPLICACION="aplicacion";
	
	final public static String SMENSAJE_ESCOJA_OPCION="Escoja una opcion";
	
	//CONSTANTES REPORTES
	final public static String SREPORTEPATHCARPETA="Reportes/";
	final public static String SREPORTESUFIJOREPORTE="Design.jasper";
	final public static String SREPORTEMASTERRELACIONES="MasterRelaciones";
	final public static String SREPORTETITULO="REPORTE DE  ";
	
	//CONSTANTES WEB 
	final public static String SSESSIONVALUETREEAJAX="valueTreeAjax";
	final public static String SSESSIONVALUEJAVASCRIPTTREEAJAX="valueJavaScriptTreeAjax";
	
	//CONSTANTES SWING
	public static int INUM_MAX_VENTANAS=5;
	public static int INUM_MAX_VENTANAS_DET_X=3;
	public static int INUM_MAX_VENTANAS_DET_Y=1;
	public static int INUM_MAX_VENTANAS_REL_X=3;
	public static int INUM_MAX_VENTANAS_REL_Y=1;
	public static Boolean CON_VARIAS_VENTANAS=false;
	
	public static ArrayList<String> getArrMailsVerificacionErrores() {
		return arrMailsVerificacionErrores;
	}

	public static void setArrMailsVerificacionErrores(
			ArrayList<String> arrMailsVerificacionErrores) {
		Constantes.arrMailsVerificacionErrores = arrMailsVerificacionErrores;
	}
	
	final public  static String SMODULO_SEGURIDAD="Seguridad";
	final public  static String SMODULO_CONTABILIDAD="Contabilidad";
	final public  static String SMODULO_TESORERIA="Tesoreria";
	final public  static String SMODULO_CARTERA="Cartera";
	final public  static String SMODULO_NOMINA="Nomina";
	final public  static String SMODULO_COMISIONES="Comisiones";
	final public  static String SMODULO_INVENTARIO="Inventario";
	final public  static String SMODULO_FACTURACION="Facturacion";
	final public  static String SMODULO_ACTIVOS_FIJOS="ActivosFijos";
	final public  static String SMODULO_CUENTAS_PORPAGAR="CuentasPorPagar";
	final public  static String SMODULO_CUENTAS_PORCOBRAR="CuentasPorCobrar";
	final public  static String SMODULO_PRODUCCION="Produccion";
	final public  static String SMODULO_IMPORTACIONES="Importaciones";
	final public  static String SMODULO_PUNTO_VENTA="PuntoVenta";
	final public  static String SMODULO_PROYECTOS="Proyectos";
	final public  static String SMODULO_SRI="Sris";
	
	//CONSTANTES VERSION
	public static String SVERSION_JBOSS="8.1";
			
	//CONSTANTES FILES APPLICATION
	public static String SNANME_FILE_EAR_EJB="erp_ear";
	public static String SNANME_FILE_EJB="erp_ejb";
}
