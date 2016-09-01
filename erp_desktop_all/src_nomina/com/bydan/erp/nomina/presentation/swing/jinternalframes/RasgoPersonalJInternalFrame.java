/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.RasgoPersonalConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class RasgoPersonalJInternalFrame extends RasgoPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRasgoPersonal;
	
	protected JMenuBar jmenuBarRasgoPersonal;
	
	protected JMenu jmenuRasgoPersonal;
	protected JMenu jmenuDatosRasgoPersonal;
	protected JMenu jmenuArchivoRasgoPersonal;
	protected JMenu jmenuAccionesRasgoPersonal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRasgoPersonal;	
	protected GridBagConstraints gridBagConstraintsRasgoPersonal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RasgoPersonalDetalleFormJInternalFrame jInternalFrameDetalleFormRasgoPersonal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRasgoPersonal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRasgoPersonal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoRasgoPersonalBeanSwingJInternalFrame tiporasgopersonalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporasgopersonal="";
	
	public RasgoPersonalSessionBean rasgopersonalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoRasgoPersonalSessionBean tiporasgopersonalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RasgoPersonal> rasgopersonals;		
	public List<RasgoPersonal> rasgopersonalsEliminados;	
	public List<RasgoPersonal> rasgopersonalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRasgoPersonal;		
	protected JButton jButtonAbrirOrderByRasgoPersonal;
	
	
	//protected JPanel jPanelOrderByRasgoPersonal;
	//public JScrollPane jScrollPanelOrderByRasgoPersonal;	
	//protected JButton jButtonCerrarOrderByRasgoPersonal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RasgoPersonalLogic rasgopersonalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRasgoPersonal;
	public JScrollPane jScrollPanelDatosEdicionRasgoPersonal;
	public JScrollPane jScrollPanelDatosGeneralRasgoPersonal;
    
	
	
	//public JScrollPane jScrollPanelDatosRasgoPersonalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRasgoPersonal;
	//public JScrollPane jScrollPanelImportacionRasgoPersonal;
	
	
	
	protected JPanel jPanelAccionesRasgoPersonal;
	
    protected JPanel jPanelPaginacionRasgoPersonal;
    protected JPanel jPanelParametrosReportesRasgoPersonal;
	protected JPanel jPanelParametrosReportesAccionesRasgoPersonal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RasgoPersonal;
	protected JPanel jPanelParametrosAuxiliar2RasgoPersonal;
	protected JPanel jPanelParametrosAuxiliar3RasgoPersonal;
	protected JPanel jPanelParametrosAuxiliar4RasgoPersonal;
	//protected JPanel jPanelParametrosAuxiliar5RasgoPersonal;
	
	
	
	//protected JPanel jPanelReporteDinamicoRasgoPersonal;
	//protected JPanel jPanelImportacionRasgoPersonal;
	
	
	public JTable jTableDatosRasgoPersonal;
	
	
	
	//public JTable jTableDatosRasgoPersonalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRasgoPersonal;
	protected JButton jButtonDuplicarRasgoPersonal;
	protected JButton jButtonCopiarRasgoPersonal;
	protected JButton jButtonVerFormRasgoPersonal;
	protected JButton jButtonNuevoRelacionesRasgoPersonal;
	protected JButton jButtonModificarRasgoPersonal;
	
    protected JButton jButtonGuardarCambiosTablaRasgoPersonal;
	protected JButton jButtonCerrarRasgoPersonal;
	
	
	protected JButton jButtonRecargarInformacionRasgoPersonal;
	protected JButton jButtonProcesarInformacionRasgoPersonal;
	
	
	protected JButton jButtonAnterioresRasgoPersonal;
	protected JButton jButtonSiguientesRasgoPersonal;
	protected JButton jButtonNuevoGuardarCambiosRasgoPersonal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRasgoPersonal;
	//protected JButton jButtonCerrarReporteDinamicoRasgoPersonal;
	//protected JButton jButtonGenerarExcelReporteDinamicoRasgoPersonal;	
	
	
	
	//protected JButton jButtonAbrirImportacionRasgoPersonal;
	//protected JButton jButtonGenerarImportacionRasgoPersonal;
	//protected JButton jButtonCerrarImportacionRasgoPersonal;
	//protected JFileChooser jFileChooserImportacionRasgoPersonal;
	//protected File fileImportacionRasgoPersonal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRasgoPersonal;
	protected JButton jButtonDuplicarToolBarRasgoPersonal;
	protected JButton jButtonNuevoRelacionesToolBarRasgoPersonal;
	
	
	public JButton jButtonGuardarCambiosToolBarRasgoPersonal;
	protected JButton jButtonCopiarToolBarRasgoPersonal;
	protected JButton jButtonVerFormToolBarRasgoPersonal;
	public JButton jButtonGuardarCambiosTablaToolBarRasgoPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarRasgoPersonal;
	protected JButton jButtonCerrarToolBarRasgoPersonal;
	
	protected JButton jButtonRecargarInformacionToolBarRasgoPersonal;
	protected JButton jButtonProcesarInformacionToolBarRasgoPersonal;
	protected JButton jButtonAnterioresToolBarRasgoPersonal;
	protected JButton jButtonSiguientesToolBarRasgoPersonal;
	protected JButton jButtonNuevoGuardarCambiosToolBarRasgoPersonal;
	protected JButton jButtonAbrirOrderByToolBarRasgoPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRasgoPersonal;
	protected JMenuItem jMenuItemDuplicarRasgoPersonal;
	protected JMenuItem jMenuItemNuevoRelacionesRasgoPersonal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRasgoPersonal;
	protected JMenuItem jMenuItemCopiarRasgoPersonal;
	protected JMenuItem jMenuItemVerFormRasgoPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaRasgoPersonal;
	protected JMenuItem jMenuItemCerrarRasgoPersonal;
	protected JMenuItem jMenuItemDetalleCerrarRasgoPersonal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRasgoPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarRasgoPersonal;
	
	protected JMenuItem jMenuItemRecargarInformacionRasgoPersonal;
	protected JMenuItem jMenuItemProcesarInformacionRasgoPersonal;
	protected JMenuItem jMenuItemAnterioresRasgoPersonal;
	protected JMenuItem jMenuItemSiguientesRasgoPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRasgoPersonal;
	protected JMenuItem jMenuItemAbrirOrderByRasgoPersonal;
	protected JMenuItem jMenuItemMostrarOcultarRasgoPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRasgoPersonal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRasgoPersonal;
	protected JCheckBox jCheckBoxSeleccionadosRasgoPersonal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRasgoPersonal;
	protected JCheckBox jCheckBoxConGraficoReporteRasgoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRasgoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRasgoPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRasgoPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRasgoPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRasgoPersonal;
	protected JTextField jTextFieldValorCampoGeneralRasgoPersonal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRasgoPersonal;
	//public JList<Reporte> jListColumnasSelectReporteRasgoPersonal;
	//public JScrollPane jScrollColumnasSelectReporteRasgoPersonal;
	
	//public JLabel jLabelRelacionesSelectReporteRasgoPersonal;
	//public JList<Reporte> jListRelacionesSelectReporteRasgoPersonal;
	//public JScrollPane jScrollRelacionesSelectReporteRasgoPersonal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRasgoPersonal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRasgoPersonal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRasgoPersonal;
	//public JLabel jLabelTiposArchivoReporteDinamicoRasgoPersonal;
	
		
	//public JLabel jLabelArchivoImportacionRasgoPersonal;	
	//public JLabel jLabelPathArchivoImportacionRasgoPersonal;
	//protected JTextField jTextFieldPathArchivoImportacionRasgoPersonal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRasgoPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRasgoPersonal;
	
	//public JLabel jLabelColumnaCategoriaValorRasgoPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRasgoPersonal;
	
	//public JLabel jLabelColumnasValoresGraficoRasgoPersonal;
	//public JList<Reporte> jListColumnasValoresGraficoRasgoPersonal;
	//public JScrollPane jScrollColumnasValoresGraficoRasgoPersonal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRasgoPersonal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRasgoPersonal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRasgoPersonal;
	public JPanel jPanelFK_IdEmpleadoRasgoPersonal;
	public JButton jButtonFK_IdEmpleadoRasgoPersonal;
	public JPanel jPanelFK_IdTipoRasgoPersonalRasgoPersonal;
	public JButton jButtonFK_IdTipoRasgoPersonalRasgoPersonal;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoRasgoPersonal;
	public JLabel jLabelid_empleadoFK_IdEmpleadoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal;
	public JButton jButtonid_empleadoFK_IdEmpleadoRasgoPersonal= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRasgoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRasgoPersonalBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal;
	
	public JPanel jPanelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal;
	public JLabel jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal;
	public JButton jButtonid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal= new JButtonMe();
	public JButton jButtonid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonalBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
	//Esto va en DetalleForm
	//public int iHeightFormularioMaximo=0;
	//public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
	
	/*
	double start=(double)System.currentTimeMillis();	
	double end=0;
	double dif=0;
	
	end=(double)System.currentTimeMillis();			
	dif=end - start;			
	start=(double)System.currentTimeMillis();	
	System.out.println("Tiempo(ms) Carga TEST 1_2 DetalleMovimientoInventario: " + dif);		
	*/
	
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RasgoPersonalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RasgoPersonalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RasgoPersonalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RasgoPersonalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRasgoPersonal)	{
		this.jButtonRecargarInformacionRasgoPersonal = jButtonRecargarInformacionRasgoPersonal;
	}
	
	public JButton getjButtonProcesarInformacionRasgoPersonal() {
		return this.jButtonProcesarInformacionRasgoPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRasgoPersonal)	{
		this.jButtonProcesarInformacionRasgoPersonal = jButtonProcesarInformacionRasgoPersonal;
	}
	
	
	public JButton getjButtonRecargarInformacionRasgoPersonal() {
		return this.jButtonRecargarInformacionRasgoPersonal;
	}
	
	
	public List<RasgoPersonal> getrasgopersonals() {
		return this.rasgopersonals;
	}

	public void setrasgopersonals(List<RasgoPersonal> rasgopersonals) {
		this.rasgopersonals = rasgopersonals;
	}
	
	public List<RasgoPersonal> getrasgopersonalsAux() {
		return this.rasgopersonalsAux;
	}

	public void setrasgopersonalsAux(List<RasgoPersonal> rasgopersonalsAux) {
		this.rasgopersonalsAux = rasgopersonalsAux;
	}
	
	public List<RasgoPersonal> getrasgopersonalsEliminados() {
		return this.rasgopersonalsEliminados;
	}

	public void setRasgoPersonalsEliminados(List<RasgoPersonal> rasgopersonalsEliminados) {
		this.rasgopersonalsEliminados = rasgopersonalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRasgoPersonal() {
		return jComboBoxTiposSeleccionarRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRasgoPersonal(
			JComboBox jComboBoxTiposSeleccionarRasgoPersonal) {
		this.jComboBoxTiposSeleccionarRasgoPersonal = jComboBoxTiposSeleccionarRasgoPersonal;
	}
	
	public void setBorderResaltarTiposSeleccionarRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRasgoPersonal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRasgoPersonal() {
		return jTextFieldValorCampoGeneralRasgoPersonal;
	}

	public void setjTextFieldValorCampoGeneralRasgoPersonal(
			JTextField jTextFieldValorCampoGeneralRasgoPersonal) {
		this.jTextFieldValorCampoGeneralRasgoPersonal = jTextFieldValorCampoGeneralRasgoPersonal;
	}

	public void setBorderResaltarValorCampoGeneralRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRasgoPersonal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRasgoPersonal() {
		return this.jCheckBoxSeleccionarTodosRasgoPersonal;
	}

	public void setjCheckBoxSeleccionarTodosRasgoPersonal(
			JCheckBox jCheckBoxSeleccionarTodosRasgoPersonal) {
		this.jCheckBoxSeleccionarTodosRasgoPersonal = jCheckBoxSeleccionarTodosRasgoPersonal;
	}

	public void setBorderResaltarSeleccionarTodosRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRasgoPersonal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRasgoPersonal() {
		return this.jCheckBoxSeleccionadosRasgoPersonal;
	}

	public void setjCheckBoxSeleccionadosRasgoPersonal(
			JCheckBox jCheckBoxSeleccionadosRasgoPersonal) {
		this.jCheckBoxSeleccionadosRasgoPersonal = jCheckBoxSeleccionadosRasgoPersonal;
	}
	
	public void setBorderResaltarSeleccionadosRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRasgoPersonal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRasgoPersonal() {
		return this.jComboBoxTiposArchivosReportesRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRasgoPersonal(
			JComboBox jComboBoxTiposArchivosReportesRasgoPersonal) {
		this.jComboBoxTiposArchivosReportesRasgoPersonal = jComboBoxTiposArchivosReportesRasgoPersonal;
	}

	public void setBorderResaltarTiposArchivosReportesRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRasgoPersonal() {
		return this.jComboBoxTiposReportesRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRasgoPersonal(
			JComboBox jComboBoxTiposReportesRasgoPersonal) {
		this.jComboBoxTiposReportesRasgoPersonal = jComboBoxTiposReportesRasgoPersonal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRasgoPersonal() {
	//	return jComboBoxTiposReportesDinamicoRasgoPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRasgoPersonal(
	//		JComboBox jComboBoxTiposReportesDinamicoRasgoPersonal) {
	//	this.jComboBoxTiposReportesDinamicoRasgoPersonal = jComboBoxTiposReportesDinamicoRasgoPersonal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRasgoPersonal() {
	//	return jComboBoxTiposArchivosReportesDinamicoRasgoPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRasgoPersonal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRasgoPersonal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal = jComboBoxTiposArchivosReportesDinamicoRasgoPersonal;
	//}
	
	public void setBorderResaltarTiposReportesRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRasgoPersonal() {
		return this.jComboBoxTiposGraficosReportesRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRasgoPersonal(
			JComboBox jComboBoxTiposGraficosReportesRasgoPersonal) {
		this.jComboBoxTiposGraficosReportesRasgoPersonal = jComboBoxTiposGraficosReportesRasgoPersonal;
	}
	
	public void setBorderResaltarTiposGraficosReportesRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRasgoPersonal() {
		return this.jComboBoxTiposPaginacionRasgoPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRasgoPersonal(
			JComboBox jComboBoxTiposPaginacionRasgoPersonal) {
		this.jComboBoxTiposPaginacionRasgoPersonal = jComboBoxTiposPaginacionRasgoPersonal;
	}
	
	public void setBorderResaltarTiposPaginacionRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRasgoPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRasgoPersonal() {
		return this.jComboBoxTiposRelacionesRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRasgoPersonal() {
		return this.jComboBoxTiposAccionesRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRasgoPersonal(
			JComboBox jComboBoxTiposRelacionesRasgoPersonal) {
		this.jComboBoxTiposRelacionesRasgoPersonal = jComboBoxTiposRelacionesRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRasgoPersonal(
			JComboBox jComboBoxTiposAccionesRasgoPersonal) {
		this.jComboBoxTiposAccionesRasgoPersonal = jComboBoxTiposAccionesRasgoPersonal;
	}
	
	public void setBorderResaltarTiposRelacionesRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRasgoPersonal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRasgoPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRasgoPersonal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRasgoPersonal() {
	//	return jCheckBoxConGraficoDinamicoRasgoPersonal;
	//}

	//public void setjCheckBoxConGraficoDinamicoRasgoPersonal(
	//		JCheckBox jCheckBoxConGraficoDinamicoRasgoPersonal) {
	//	this.jCheckBoxConGraficoDinamicoRasgoPersonal = jCheckBoxConGraficoDinamicoRasgoPersonal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRasgoPersonal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRasgoPersonal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRasgoPersonal .setBorder(borderResaltar);		
	//}
	
	
	
			
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		
		this.rasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rasgopersonalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RasgoPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rasgo Personal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}
		
		RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRasgoPersonal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"nuevo","nuevo","Nuevo"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"duplicar","duplicar","Duplicar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"copiar","copiar","Copiar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"ver_form","ver_form","Ver"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"recargar","recargar","Recargar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRasgoPersonal,this.jTtoolBarRasgoPersonal,
							"cerrar","cerrar","Salir"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRasgoPersonal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRasgoPersonal;
			
				this.jButtonProcesarInformacionToolBarRasgoPersonal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRasgoPersonal;
				
		//protected JButton jButtonModificarToolBarRasgoPersonal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRasgoPersonal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRasgoPersonal=new JMenuMe("General");
		this.jmenuArchivoRasgoPersonal=new JMenuMe("Archivo");
		this.jmenuAccionesRasgoPersonal=new JMenuMe("Acciones");
		this.jmenuDatosRasgoPersonal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRasgoPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRasgoPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRasgoPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRasgoPersonal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRasgoPersonal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRasgoPersonal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRasgoPersonal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRasgoPersonal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRasgoPersonal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRasgoPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRasgoPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRasgoPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRasgoPersonal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRasgoPersonal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRasgoPersonal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRasgoPersonal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRasgoPersonal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRasgoPersonal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRasgoPersonal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRasgoPersonal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRasgoPersonal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRasgoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRasgoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRasgoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRasgoPersonal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRasgoPersonal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRasgoPersonal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRasgoPersonal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRasgoPersonal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRasgoPersonal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRasgoPersonal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRasgoPersonal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRasgoPersonal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRasgoPersonal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRasgoPersonal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRasgoPersonal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRasgoPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRasgoPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRasgoPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRasgoPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRasgoPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRasgoPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRasgoPersonal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRasgoPersonal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRasgoPersonal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRasgoPersonal.add(this.jMenuItemCerrarRasgoPersonal);
			
			this.jmenuAccionesRasgoPersonal.add(this.jMenuItemNuevoRasgoPersonal);
			this.jmenuAccionesRasgoPersonal.add(this.jMenuItemNuevoGuardarCambiosRasgoPersonal);
			this.jmenuAccionesRasgoPersonal.add(this.jMenuItemNuevoRelacionesRasgoPersonal);
			this.jmenuAccionesRasgoPersonal.add(this.jMenuItemGuardarCambiosTablaRasgoPersonal);		
			this.jmenuAccionesRasgoPersonal.add(this.jMenuItemDuplicarRasgoPersonal);		
			this.jmenuAccionesRasgoPersonal.add(this.jMenuItemCopiarRasgoPersonal);		
			this.jmenuAccionesRasgoPersonal.add(this.jMenuItemVerFormRasgoPersonal);		
			
			this.jmenuDatosRasgoPersonal.add(this.jMenuItemRecargarInformacionRasgoPersonal);				
			this.jmenuDatosRasgoPersonal.add(this.jMenuItemAnterioresRasgoPersonal);				
			this.jmenuDatosRasgoPersonal.add(this.jMenuItemSiguientesRasgoPersonal);				
			this.jmenuDatosRasgoPersonal.add(this.jMenuItemAbrirOrderByRasgoPersonal);				
			this.jmenuDatosRasgoPersonal.add(this.jMenuItemMostrarOcultarRasgoPersonal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRasgoPersonal.add(this.jMenuItemGuardarCambiosRasgoPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRasgoPersonal.add(this.jmenuArchivoRasgoPersonal);		
			this.jmenuBarRasgoPersonal.add(this.jmenuAccionesRasgoPersonal);		
			this.jmenuBarRasgoPersonal.add(this.jmenuDatosRasgoPersonal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRasgoPersonal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRasgoPersonal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoRasgoPersonal.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoRasgoPersonal= new JButtonMe();
		this.jButtonFK_IdEmpleadoRasgoPersonal.setText("Buscar");
		this.jButtonFK_IdEmpleadoRasgoPersonal.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoRasgoPersonal,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoRasgoPersonal = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoRasgoPersonal.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoRasgoPersonal.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.setFocusable(false);

		this.jPanelFK_IdTipoRasgoPersonalRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRasgoPersonalRasgoPersonal.setToolTipText("Buscar Por Tipo Rasgo Personal ");
		this.jButtonFK_IdTipoRasgoPersonalRasgoPersonal= new JButtonMe();
		this.jButtonFK_IdTipoRasgoPersonalRasgoPersonal.setText("Buscar");
		this.jButtonFK_IdTipoRasgoPersonalRasgoPersonal.setToolTipText("Buscar Por Tipo Rasgo Personal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRasgoPersonalRasgoPersonal,"buscar_button","Buscar Por Tipo Rasgo Personal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRasgoPersonalRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal = new JLabelMe();
		jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setText("Tipo Rasgo Personal :");
		jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setToolTipText("Tipo Rasgo Personal");
		jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal= new JComboBoxMe();
		jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRasgoPersonal=new JTabbedPane();


		this.jTabbedPaneBusquedasRasgoPersonal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRasgoPersonal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRasgoPersonal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
		
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleRasgoPersonal = new RasgoPersonalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rasgo Personal DATOS");
			this.jInternalFrameDetalleFormRasgoPersonal = new RasgoPersonalDetalleFormJInternalFrame(jDesktopPane,this.rasgopersonalSessionBean.getConGuardarRelaciones(),this.rasgopersonalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRasgoPersonal = null;//new RasgoPersonalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRasgoPersonal= new GridBagLayout();
		
		
		this.jTableDatosRasgoPersonal = new JTableMe();      
		
		String sToolTipRasgoPersonal="";
		sToolTipRasgoPersonal=RasgoPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRasgoPersonal+="(Nomina.RasgoPersonal)";
		}
		
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipRasgoPersonal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRasgoPersonal.setToolTipText(sToolTipRasgoPersonal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRasgoPersonal);
		this.jTableDatosRasgoPersonal.setAutoCreateRowSorter(true);
		this.jTableDatosRasgoPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRasgoPersonal.setRowSelectionAllowed(true);
		this.jTableDatosRasgoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRasgoPersonal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRasgoPersonal = new JButtonMe();
		this.jButtonDuplicarRasgoPersonal = new JButtonMe();
		this.jButtonCopiarRasgoPersonal = new JButtonMe();
		this.jButtonVerFormRasgoPersonal = new JButtonMe();
		this.jButtonNuevoRelacionesRasgoPersonal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRasgoPersonal = new JButtonMe();
		this.jButtonCerrarRasgoPersonal = new JButtonMe();
		
		this.jScrollPanelDatosRasgoPersonal = new JScrollPane();   
        this.jScrollPanelDatosGeneralRasgoPersonal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rasgo Personal";
		
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rasgo Personales" + this.sPath));
		} else {
			this.jScrollPanelDatosRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRasgoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesRasgoPersonal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoRasgoPersonal=new ReporteDinamicoJInternalFrame(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRasgoPersonal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRasgoPersonal=new ImportacionJInternalFrame(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRasgoPersonal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRasgoPersonal = new JButtonMe();
		
		this.jButtonAbrirOrderByRasgoPersonal.setText("Orden");
		this.jButtonAbrirOrderByRasgoPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRasgoPersonal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRasgoPersonal,false,this);
			
			//this.cargarOrderByRasgoPersonal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRasgoPersonal,true,this);
			
			//this.cargarOrderByRasgoPersonal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRasgoPersonal.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRasgoPersonal.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRasgoPersonal.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRasgoPersonal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRasgoPersonal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRasgoPersonal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRasgoPersonal.setText("Nuevo");
		this.jButtonDuplicarRasgoPersonal.setText("Duplicar");
		this.jButtonCopiarRasgoPersonal.setText("Copiar");
		this.jButtonVerFormRasgoPersonal.setText("Ver");
		this.jButtonNuevoRelacionesRasgoPersonal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRasgoPersonal.setText("Guardar");
		this.jButtonCerrarRasgoPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRasgoPersonal,"nuevo_button","Nuevo",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRasgoPersonal,"duplicar_button","Duplicar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRasgoPersonal,"copiar_button","Copiar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRasgoPersonal,"ver_form","Ver",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRasgoPersonal,"nuevorelaciones_button","Nuevo Rel",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRasgoPersonal,"guardarcambiostabla_button","Guardar",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRasgoPersonal,"cerrar_button","Salir",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRasgoPersonal.setToolTipText("Nuevo"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRasgoPersonal.setToolTipText("Duplicar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRasgoPersonal.setToolTipText("Copiar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRasgoPersonal.setToolTipText("Ver"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRasgoPersonal.setToolTipText("Nuevo Rel"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRasgoPersonal.setToolTipText("Guardar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRasgoPersonal.setToolTipText("Salir"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoRasgoPersonal";
		inputMap = this.jButtonNuevoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRasgoPersonal"));
		
		//DUPLICAR
		sMapKey = "DuplicarRasgoPersonal";
		inputMap = this.jButtonDuplicarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRasgoPersonal"));
		
		//COPIAR
		sMapKey = "CopiarRasgoPersonal";
		inputMap = this.jButtonCopiarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRasgoPersonal"));
		
		//VEr FORM
		sMapKey = "VerFormRasgoPersonal";
		inputMap = this.jButtonVerFormRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRasgoPersonal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRasgoPersonal";
		inputMap = this.jButtonNuevoRelacionesRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRasgoPersonal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRasgoPersonal";
		inputMap = this.jButtonModificarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRasgoPersonal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRasgoPersonal";
		inputMap = this.jButtonCerrarRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRasgoPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRasgoPersonal";
		inputMap = this.jButtonGuardarCambiosTablaRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRasgoPersonal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRasgoPersonal.setName("jPanelParametrosReportesRasgoPersonal"); 
		
		this.jPanelParametrosReportesAccionesRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRasgoPersonal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRasgoPersonal.setName("jPanelParametrosReportesAccionesRasgoPersonal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRasgoPersonal = new JButtonMe();
		this.jButtonRecargarInformacionRasgoPersonal.setText("Recargar");
		this.jButtonRecargarInformacionRasgoPersonal.setToolTipText("Recargar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRasgoPersonal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRasgoPersonal = new JButtonMe();
		this.jButtonProcesarInformacionRasgoPersonal.setText("Procesar");
		this.jButtonProcesarInformacionRasgoPersonal.setToolTipText("Procesar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRasgoPersonal.setVisible(false);
			
		this.jButtonProcesarInformacionRasgoPersonal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRasgoPersonal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRasgoPersonal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRasgoPersonal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRasgoPersonal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRasgoPersonal.setText("TIPO");       
		this.jComboBoxTiposReportesRasgoPersonal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRasgoPersonal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRasgoPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRasgoPersonal.setText("Paginacion");
		this.jComboBoxTiposPaginacionRasgoPersonal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRasgoPersonal.setText("Accion");
		this.jComboBoxTiposRelacionesRasgoPersonal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRasgoPersonal.setText("Accion");
		this.jComboBoxTiposAccionesRasgoPersonal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRasgoPersonal.setText("Accion");
		this.jComboBoxTiposSeleccionarRasgoPersonal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRasgoPersonal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRasgoPersonal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRasgoPersonal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRasgoPersonal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRasgoPersonal = new JLabelMe();
		
		this.jLabelAccionesRasgoPersonal.setText("Acciones");		
		this.jLabelAccionesRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRasgoPersonal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRasgoPersonal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRasgoPersonal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRasgoPersonal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRasgoPersonal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRasgoPersonal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRasgoPersonal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRasgoPersonal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRasgoPersonal.setText("Graf.");
		this.jCheckBoxConGraficoReporteRasgoPersonal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRasgoPersonal = new JButtonMe();
		//this.jButtonAnterioresRasgoPersonal.setText("<<");
        this.jButtonAnterioresRasgoPersonal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRasgoPersonal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRasgoPersonal = new JButtonMe();
		//this.jButtonSiguientesRasgoPersonal.setText(">>");
        this.jButtonSiguientesRasgoPersonal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRasgoPersonal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRasgoPersonal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRasgoPersonal.setText("Nue");
        this.jButtonNuevoGuardarCambiosRasgoPersonal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRasgoPersonal,"nuevoguardarcambios_button","Nue",this.rasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRasgoPersonal";
		inputMap = this.jButtonNuevoGuardarCambiosRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRasgoPersonal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRasgoPersonal";
		inputMap = this.jButtonRecargarInformacionRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRasgoPersonal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRasgoPersonal";
		inputMap = this.jButtonSiguientesRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRasgoPersonal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRasgoPersonal";
		inputMap = this.jButtonAnterioresRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRasgoPersonal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRasgoPersonal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRasgoPersonal.setMinimumSize(new Dimension(this.getWidth(),RasgoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RasgoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRasgoPersonal.setMaximumSize(new Dimension(this.getWidth(),RasgoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RasgoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRasgoPersonal.setPreferredSize(new Dimension(this.getWidth(),RasgoPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RasgoPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRasgoPersonal = new GridBagLayout();

			this.jPanelPaginacionRasgoPersonal.setLayout(gridaBagLayoutPaginacionRasgoPersonal);						
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = 0;
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonAnterioresRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
					
						
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRasgoPersonal.gridy = 0;
			
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonNuevoGuardarCambiosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
						
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRasgoPersonal.gridy = 0;
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonSiguientesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = 1;
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonNuevoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
						
			
			
			if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
				this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRasgoPersonal.gridy = 1;
				this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRasgoPersonal.add(this.jButtonGuardarCambiosTablaRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			}
			
			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = 1;
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonDuplicarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = 1;
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonCopiarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = 1;
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonVerFormRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = 1;
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRasgoPersonal.add(this.jButtonCerrarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
		
		
		this.jButtonRecargarInformacionRasgoPersonal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRasgoPersonal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRasgoPersonal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRasgoPersonal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRasgoPersonal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRasgoPersonal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRasgoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRasgoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRasgoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRasgoPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRasgoPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRasgoPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRasgoPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRasgoPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRasgoPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRasgoPersonal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRasgoPersonal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRasgoPersonal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRasgoPersonal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRasgoPersonal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRasgoPersonal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRasgoPersonal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRasgoPersonal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRasgoPersonal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRasgoPersonal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRasgoPersonal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRasgoPersonal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRasgoPersonal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RasgoPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RasgoPersonal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRasgoPersonal.setLayout(gridaBagParametrosReportesRasgoPersonal);
			this.jPanelParametrosReportesAccionesRasgoPersonal.setLayout(gridaBagParametrosReportesAccionesRasgoPersonal);
			
			
			this.jPanelParametrosAuxiliar1RasgoPersonal.setLayout(gridaBagParametrosAuxiliar1RasgoPersonal);
			this.jPanelParametrosAuxiliar2RasgoPersonal.setLayout(gridaBagParametrosAuxiliar2RasgoPersonal);
			this.jPanelParametrosAuxiliar3RasgoPersonal.setLayout(gridaBagParametrosAuxiliar3RasgoPersonal);
			this.jPanelParametrosAuxiliar4RasgoPersonal.setLayout(gridaBagParametrosAuxiliar4RasgoPersonal);
			//this.jPanelParametrosAuxiliar5RasgoPersonal.setLayout(gridaBagParametrosAuxiliar2RasgoPersonal);			
			
			
			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRasgoPersonal.add(this.jButtonRecargarInformacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RasgoPersonal.add(this.jComboBoxTiposPaginacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RasgoPersonal.add(this.jCheckBoxConAltoMaximoTablaRasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RasgoPersonal.add(this.jComboBoxTiposArchivosReportesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRasgoPersonal.add(this.jPanelParametrosAuxiliar1RasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRasgoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RasgoPersonal.add(this.jComboBoxTiposReportesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRasgoPersonal.add(this.jPanelParametrosAuxiliar4RasgoPersonal, this.gridBagConstraintsRasgoPersonal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRasgoPersonal.add(this.jComboBoxTiposReportesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRasgoPersonal.add(this.jCheckBoxGenerarReporteRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRasgoPersonal.add(this.jPanelParametrosAuxiliar2RasgoPersonal, this.gridBagConstraintsRasgoPersonal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRasgoPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRasgoPersonal.add(this.jLabelAccionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
				this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRasgoPersonal.add(this.jButtonAbrirOrderByRasgoPersonal, this.gridBagConstraintsRasgoPersonal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRasgoPersonal.add(this.jComboBoxTiposSeleccionarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
			
			
			/*
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRasgoPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRasgoPersonal.add(this.jCheckBoxSeleccionarTodosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRasgoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RasgoPersonal.add(this.jCheckBoxSeleccionarTodosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);															
				
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRasgoPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RasgoPersonal.add(this.jCheckBoxSeleccionadosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRasgoPersonal.add(this.jPanelParametrosAuxiliar3RasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRasgoPersonal.add(this.jComboBoxTiposAccionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
	
				
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRasgoPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRasgoPersonal.add(this.jTextFieldValorCampoGeneralRasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRasgoPersonal = new GridBagLayout();

			this.jScrollPanelDatosRasgoPersonal.setLayout(gridaBagLayoutDatosRasgoPersonal);
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = 0;
			this.gridBagConstraintsRasgoPersonal.gridx = 0;
			
			this.jScrollPanelDatosRasgoPersonal.add(this.jTableDatosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRasgoPersonal.setViewportView(this.jTableDatosRasgoPersonal);
		this.jTableDatosRasgoPersonal.setFillsViewportHeight(true);
		this.jTableDatosRasgoPersonal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRasgoPersonal= new GridBagLayout();
		this.jPanelAccionesRasgoPersonal.setLayout(gridaBagLayoutAccionesRasgoPersonal);
		
		
		/*	
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = 0;
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
			
		this.jPanelAccionesRasgoPersonal.add(this.jButtonNuevoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoRasgoPersonal= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoRasgoPersonal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRasgoPersonal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRasgoPersonal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoRasgoPersonal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoRasgoPersonal.setLayout(gridaBagLayoutFK_IdEmpleadoRasgoPersonal);

		gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRasgoPersonal.gridy = 0;
		gridBagConstraintsRasgoPersonal.gridx = 0;
		jPanelFK_IdEmpleadoRasgoPersonal.add(jLabelid_empleadoFK_IdEmpleadoRasgoPersonal, gridBagConstraintsRasgoPersonal);

		gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRasgoPersonal.gridy = 0;
		gridBagConstraintsRasgoPersonal.gridx = 1;
		jPanelFK_IdEmpleadoRasgoPersonal.add(jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal, gridBagConstraintsRasgoPersonal);


		gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.NONE;
		gridBagConstraintsRasgoPersonal.gridy = 0;
		gridBagConstraintsRasgoPersonal.gridx = 0;
		jPanelFK_IdEmpleadoRasgoPersonal.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal, gridBagConstraintsRasgoPersonal);

		gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRasgoPersonal.gridy = 1;
		gridBagConstraintsRasgoPersonal.gridx =1;
		jPanelFK_IdEmpleadoRasgoPersonal.add(jButtonFK_IdEmpleadoRasgoPersonal, gridBagConstraintsRasgoPersonal);

		jTabbedPaneBusquedasRasgoPersonal.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoRasgoPersonal);
		jTabbedPaneBusquedasRasgoPersonal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoRasgoPersonalRasgoPersonal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRasgoPersonalRasgoPersonal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRasgoPersonalRasgoPersonal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRasgoPersonalRasgoPersonal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRasgoPersonalRasgoPersonal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRasgoPersonalRasgoPersonal.setLayout(gridaBagLayoutFK_IdTipoRasgoPersonalRasgoPersonal);

		gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRasgoPersonal.gridy = 0;
		gridBagConstraintsRasgoPersonal.gridx = 0;
		jPanelFK_IdTipoRasgoPersonalRasgoPersonal.add(jLabelid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal, gridBagConstraintsRasgoPersonal);

		gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRasgoPersonal.gridy = 0;
		gridBagConstraintsRasgoPersonal.gridx = 1;
		jPanelFK_IdTipoRasgoPersonalRasgoPersonal.add(jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal, gridBagConstraintsRasgoPersonal);

		gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRasgoPersonal.gridy = 1;
		gridBagConstraintsRasgoPersonal.gridx =1;
		jPanelFK_IdTipoRasgoPersonalRasgoPersonal.add(jButtonFK_IdTipoRasgoPersonalRasgoPersonal, gridBagConstraintsRasgoPersonal);

		jTabbedPaneBusquedasRasgoPersonal.addTab("2.-Por Tipo Rasgo Personal ", jPanelFK_IdTipoRasgoPersonalRasgoPersonal);
		jTabbedPaneBusquedasRasgoPersonal.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRasgoPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRasgoPersonal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();						
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRasgoPersonal.gridx = 0;		
			//this.gridBagConstraintsRasgoPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRasgoPersonal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRasgoPersonal, this.gridBagConstraintsRasgoPersonal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRasgoPersonal.gridx = 0;		
		//this.gridBagConstraintsRasgoPersonal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRasgoPersonal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRasgoPersonal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRasgoPersonal.gridx = 0;		
			this.gridBagConstraintsRasgoPersonal.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRasgoPersonal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRasgoPersonal, this.gridBagConstraintsRasgoPersonal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);								
		
		
		/*
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		*/		
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRasgoPersonal.gridx =0;
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRasgoPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
				
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRasgoPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRasgoPersonal = new GridBagLayout();
			this.jPanelBusquedasParametrosRasgoPersonal.setLayout(gridaBagLayoutBusquedasParametrosRasgoPersonal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRasgoPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
			if(!Constantes.ISDEVELOPING) {
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
		} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
		}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
			
			
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
			
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRasgoPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRasgoPersonal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRasgoPersonal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRasgoPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRasgoPersonal.setName("jPanelReporteDinamicoRasgoPersonal"); 
		
		this.jPanelReporteDinamicoRasgoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRasgoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRasgoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRasgoPersonal.setLayout(gridaBagLayoutReporteDinamicoRasgoPersonal);
		
		
		this.jInternalFrameReporteDinamicoRasgoPersonal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRasgoPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRasgoPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRasgoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRasgoPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRasgoPersonal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRasgoPersonal.setResizable(true);
	    this.jInternalFrameReporteDinamicoRasgoPersonal.setClosable(true);
	    this.jInternalFrameReporteDinamicoRasgoPersonal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRasgoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRasgoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRasgoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rasgo Personales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRasgoPersonal = new JLabelMe();

		this.jLabelColumnasSelectReporteRasgoPersonal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jLabelColumnasSelectReporteRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRasgoPersonal = new JList<Reporte>();
		this.jListColumnasSelectReporteRasgoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRasgoPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRasgoPersonal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRasgoPersonal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRasgoPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRasgoPersonal=new JScrollPane(this.jListColumnasSelectReporteRasgoPersonal);
			
			this.jScrollColumnasSelectReporteRasgoPersonal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRasgoPersonal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRasgoPersonal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRasgoPersonal.add(this.jListColumnasSelectReporteRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jScrollColumnasSelectReporteRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRasgoPersonal = new JLabelMe();

		this.jLabelRelacionesSelectReporteRasgoPersonal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRasgoPersonal = new JList<Reporte>();
		this.jListRelacionesSelectReporteRasgoPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRasgoPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRasgoPersonal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRasgoPersonal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRasgoPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRasgoPersonal=new JScrollPane(this.jListRelacionesSelectReporteRasgoPersonal);
			
			this.jScrollRelacionesSelectReporteRasgoPersonal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRasgoPersonal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRasgoPersonal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRasgoPersonal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRasgoPersonal = new JComboBoxMe();
		this.jListColumnasValoresGraficoRasgoPersonal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRasgoPersonal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRasgoPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRasgoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRasgoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRasgoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRasgoPersonal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRasgoPersonal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jLabelGenerarExcelReporteDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRasgoPersonal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRasgoPersonal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRasgoPersonal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRasgoPersonal.setToolTipText("Generar EXCEL"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRasgoPersonal.add(this.jButtonGenerarExcelReporteDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jComboBoxTiposReportesDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRasgoPersonal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRasgoPersonal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jLabelTiposArchivoReporteDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jComboBoxTiposArchivosReportesDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRasgoPersonal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRasgoPersonal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRasgoPersonal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRasgoPersonal.setToolTipText("Generar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jButtonGenerarReporteDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRasgoPersonal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRasgoPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRasgoPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRasgoPersonal.setToolTipText("Cancelar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRasgoPersonal.add(this.jButtonCerrarReporteDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRasgoPersonal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRasgoPersonal= new JScrollPane(jPanelReporteDinamicoRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRasgoPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRasgoPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRasgoPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rasgo Personales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRasgoPersonal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRasgoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRasgoPersonal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRasgoPersonal);
		this.jInternalFrameReporteDinamicoRasgoPersonal.getContentPane().add(this.jScrollPanelReporteDinamicoRasgoPersonal, this.gridBagConstraintsRasgoPersonal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRasgoPersonal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRasgoPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRasgoPersonal.setName("jPanelImportacionRasgoPersonal"); 
		
		this.jPanelImportacionRasgoPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRasgoPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRasgoPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRasgoPersonal.setLayout(gridaBagLayoutImportacionRasgoPersonal);
		
		
		this.jInternalFrameImportacionRasgoPersonal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRasgoPersonal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRasgoPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRasgoPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRasgoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRasgoPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRasgoPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRasgoPersonal.setResizable(true);
	    this.jInternalFrameImportacionRasgoPersonal.setClosable(true);
	    this.jInternalFrameImportacionRasgoPersonal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRasgoPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRasgoPersonal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRasgoPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRasgoPersonal.setResizable(true);
	    this.jInternalFrameImportacionRasgoPersonal.setClosable(true);
	    this.jInternalFrameImportacionRasgoPersonal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRasgoPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRasgoPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRasgoPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rasgo Personales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRasgoPersonal = new JLabelMe();

		this.jLabelArchivoImportacionRasgoPersonal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRasgoPersonal.add(this.jLabelArchivoImportacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRasgoPersonal = new JFileChooser();		
		this.jFileChooserImportacionRasgoPersonal.setToolTipText("ESCOGER ARCHIVO"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRasgoPersonal = new JButtonMe();
		this.jButtonAbrirImportacionRasgoPersonal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRasgoPersonal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRasgoPersonal.setToolTipText("Generar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRasgoPersonal.add(this.jButtonAbrirImportacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRasgoPersonal = new JLabelMe();

		this.jLabelPathArchivoImportacionRasgoPersonal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRasgoPersonal.add(this.jLabelPathArchivoImportacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRasgoPersonal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRasgoPersonal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRasgoPersonal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRasgoPersonal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRasgoPersonal.add(this.jTextFieldPathArchivoImportacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRasgoPersonal = new JButtonMe();
		this.jButtonGenerarImportacionRasgoPersonal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRasgoPersonal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRasgoPersonal.setToolTipText("Generar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRasgoPersonal.add(this.jButtonGenerarImportacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRasgoPersonal = new JButtonMe();
		this.jButtonCerrarImportacionRasgoPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRasgoPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRasgoPersonal.setToolTipText("Cancelar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRasgoPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsRasgoPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRasgoPersonal.add(this.jButtonCerrarImportacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRasgoPersonal = new GridBagLayout();
		
		this.jScrollPanelImportacionRasgoPersonal= new JScrollPane(jPanelImportacionRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsRasgoPersonal.gridy =iPosYImportacion;
		this.gridBagConstraintsRasgoPersonal.gridx =iPosXImportacion;
		this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRasgoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRasgoPersonal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRasgoPersonal);
		this.jInternalFrameImportacionRasgoPersonal.getContentPane().add(this.jScrollPanelImportacionRasgoPersonal, this.gridBagConstraintsRasgoPersonal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRasgoPersonal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRasgoPersonal = new JButtonMe();
			this.jButtonAbrirOrderByRasgoPersonal.setText("Orden");
			this.jButtonAbrirOrderByRasgoPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRasgoPersonal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRasgoPersonal";
			inputMap = this.jButtonAbrirOrderByRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRasgoPersonal"));
		
		
			GridBagLayout gridaBagLayoutOrderByRasgoPersonal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRasgoPersonal.setName("jPanelOrderByRasgoPersonal"); 
			
			this.jPanelOrderByRasgoPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRasgoPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRasgoPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRasgoPersonal.setLayout(gridaBagLayoutOrderByRasgoPersonal);
			
			
			this.jTableDatosRasgoPersonalOrderBy = new JTableMe();        
			this.jTableDatosRasgoPersonalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRasgoPersonalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRasgoPersonalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRasgoPersonalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRasgoPersonalOrderBy.setViewportView(this.jTableDatosRasgoPersonalOrderBy);
			this.jTableDatosRasgoPersonalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRasgoPersonalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRasgoPersonal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRasgoPersonal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRasgoPersonal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRasgoPersonal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRasgoPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRasgoPersonal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRasgoPersonal.setTitle("Orden");
			this.jInternalFrameOrderByRasgoPersonal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRasgoPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRasgoPersonal.setResizable(true);
			this.jInternalFrameOrderByRasgoPersonal.setClosable(true);
			this.jInternalFrameOrderByRasgoPersonal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRasgoPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRasgoPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRasgoPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rasgo Personales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRasgoPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRasgoPersonal.ipady =150;
				
			this.jPanelOrderByRasgoPersonal.add(jScrollPanelDatosRasgoPersonalOrderBy, this.gridBagConstraintsRasgoPersonal);//this.jTableDatosRasgoPersonalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRasgoPersonal = new JButtonMe();
			this.jButtonCerrarOrderByRasgoPersonal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRasgoPersonal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRasgoPersonal.setToolTipText("Cancelar"+" "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRasgoPersonal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRasgoPersonal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRasgoPersonal.add(this.jButtonCerrarOrderByRasgoPersonal, this.gridBagConstraintsRasgoPersonal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRasgoPersonal = new GridBagLayout();
			
			this.jScrollPanelOrderByRasgoPersonal= new JScrollPane(jPanelOrderByRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsRasgoPersonal.gridy =iPosYOrderBy;
			this.gridBagConstraintsRasgoPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsRasgoPersonal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRasgoPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRasgoPersonal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRasgoPersonal);
			
			this.jInternalFrameOrderByRasgoPersonal.getContentPane().add(this.jScrollPanelOrderByRasgoPersonal, this.gridBagConstraintsRasgoPersonal);			
		
		} else {
			this.jButtonAbrirOrderByRasgoPersonal = new JButtonMe();
		}				
	}
	*/
	
	
	public void redimensionarTablaDatos(int iNumFilas) {
		this.redimensionarTablaDatos(iNumFilas,0);
	}
	
	public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    
		int iWidthTable=screenSize.width*2;//screenSize.width - (screenSize.width/8);
		int iWidthTableScroll=screenSize.width - (screenSize.width/8);
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rasgopersonalSessionBean.getConGuardarRelaciones()
			) {
		}
		
		//SI CALCULADO ES MENOR QUE MAXIMO
		/*
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		*/
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTableCalculado<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTableCalculado;
		}
		
		//NO VALE SIEMPRE PONE TAMANIO COLUMNA 200
		/*
		int iTotalWidth=0;
		int iWidthColumn=0;
		int iCountColumns=this.jTableDatosRasgoPersonal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRasgoPersonal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRasgoPersonal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRasgoPersonal.getRowHeight();//RasgoPersonalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRasgoPersonal.isSelected()) {
					iHeightTable=RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRasgoPersonal.isSelected()) {
					iHeightTable=RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RasgoPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRasgoPersonal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRasgoPersonal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRasgoPersonal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRasgoPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRasgoPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRasgoPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRasgoPersonal!=null && this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy()!=null) {
			//if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRasgoPersonal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRasgoPersonal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRasgoPersonal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRasgoPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRasgoPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRasgoPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
		//VERSION 0
		/*
		//SI CALCULADO ES MENOR QUE MAXIMO
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTable<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTable;
		}
		*/
	}
	
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rasgopersonalLogic.getRasgoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rasgopersonals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RasgoPersonal> TraerRasgoPersonalBeans(List<RasgoPersonal> rasgopersonals,ArrayList<Classe> classes)throws Exception {
		try {
			for(RasgoPersonal rasgopersonal:rasgopersonals) {
					
				if(!(RasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rasgopersonal.setsDetalleGeneralEntityReporte(RasgoPersonalConstantesFunciones.getRasgoPersonalDescripcion(rasgopersonal));
										
						
					
						
					
				} else  {
							
					//rasgopersonal.setsDetalleGeneralEntityReporte(rasgopersonal.getsDetalleGeneralEntityReporte());
										
				}
				
				//rasgopersonalbeans.add(rasgopersonalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rasgopersonals;
    }
	//PARA REPORTES FIN
}
