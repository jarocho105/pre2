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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.AutorizarRequisicionesConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class AutorizarRequisicionesJInternalFrame extends AutorizarRequisicionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAutorizarRequisiciones;
	
	protected JMenuBar jmenuBarAutorizarRequisiciones;
	
	protected JMenu jmenuAutorizarRequisiciones;
	protected JMenu jmenuDatosAutorizarRequisiciones;
	protected JMenu jmenuArchivoAutorizarRequisiciones;
	protected JMenu jmenuAccionesAutorizarRequisiciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutorizarRequisiciones;	
	protected GridBagConstraints gridBagConstraintsAutorizarRequisiciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AutorizarRequisicionesDetalleFormJInternalFrame jInternalFrameDetalleFormAutorizarRequisiciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAutorizarRequisiciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAutorizarRequisiciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public AutorizarRequisicionesSessionBean autorizarrequisicionesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AutorizarRequisiciones> autorizarrequisicioness;		
	public List<AutorizarRequisiciones> autorizarrequisicionessEliminados;	
	public List<AutorizarRequisiciones> autorizarrequisicionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAutorizarRequisiciones;		
	protected JButton jButtonAbrirOrderByAutorizarRequisiciones;
	
	
	//protected JPanel jPanelOrderByAutorizarRequisiciones;
	//public JScrollPane jScrollPanelOrderByAutorizarRequisiciones;	
	//protected JButton jButtonCerrarOrderByAutorizarRequisiciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AutorizarRequisicionesLogic autorizarrequisicionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAutorizarRequisiciones;
	public JScrollPane jScrollPanelDatosEdicionAutorizarRequisiciones;
	public JScrollPane jScrollPanelDatosGeneralAutorizarRequisiciones;
    
	
	
	//public JScrollPane jScrollPanelDatosAutorizarRequisicionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAutorizarRequisiciones;
	//public JScrollPane jScrollPanelImportacionAutorizarRequisiciones;
	
	
	
	protected JPanel jPanelAccionesAutorizarRequisiciones;
	
    protected JPanel jPanelPaginacionAutorizarRequisiciones;
    protected JPanel jPanelParametrosReportesAutorizarRequisiciones;
	protected JPanel jPanelParametrosReportesAccionesAutorizarRequisiciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AutorizarRequisiciones;
	protected JPanel jPanelParametrosAuxiliar2AutorizarRequisiciones;
	protected JPanel jPanelParametrosAuxiliar3AutorizarRequisiciones;
	protected JPanel jPanelParametrosAuxiliar4AutorizarRequisiciones;
	//protected JPanel jPanelParametrosAuxiliar5AutorizarRequisiciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoAutorizarRequisiciones;
	//protected JPanel jPanelImportacionAutorizarRequisiciones;
	
	
	public JTable jTableDatosAutorizarRequisiciones;
	
	
	
	//public JTable jTableDatosAutorizarRequisicionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAutorizarRequisiciones;
	protected JButton jButtonDuplicarAutorizarRequisiciones;
	protected JButton jButtonCopiarAutorizarRequisiciones;
	protected JButton jButtonVerFormAutorizarRequisiciones;
	protected JButton jButtonNuevoRelacionesAutorizarRequisiciones;
	protected JButton jButtonModificarAutorizarRequisiciones;
	
    protected JButton jButtonGuardarCambiosTablaAutorizarRequisiciones;
	protected JButton jButtonCerrarAutorizarRequisiciones;
	
	
	protected JButton jButtonRecargarInformacionAutorizarRequisiciones;
	protected JButton jButtonProcesarInformacionAutorizarRequisiciones;
	
	
	protected JButton jButtonAnterioresAutorizarRequisiciones;
	protected JButton jButtonSiguientesAutorizarRequisiciones;
	protected JButton jButtonNuevoGuardarCambiosAutorizarRequisiciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAutorizarRequisiciones;
	//protected JButton jButtonCerrarReporteDinamicoAutorizarRequisiciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionAutorizarRequisiciones;
	//protected JButton jButtonGenerarImportacionAutorizarRequisiciones;
	//protected JButton jButtonCerrarImportacionAutorizarRequisiciones;
	//protected JFileChooser jFileChooserImportacionAutorizarRequisiciones;
	//protected File fileImportacionAutorizarRequisiciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutorizarRequisiciones;
	protected JButton jButtonDuplicarToolBarAutorizarRequisiciones;
	protected JButton jButtonNuevoRelacionesToolBarAutorizarRequisiciones;
	
	
	public JButton jButtonGuardarCambiosToolBarAutorizarRequisiciones;
	protected JButton jButtonCopiarToolBarAutorizarRequisiciones;
	protected JButton jButtonVerFormToolBarAutorizarRequisiciones;
	public JButton jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones;
	protected JButton jButtonMostrarOcultarTablaToolBarAutorizarRequisiciones;
	protected JButton jButtonCerrarToolBarAutorizarRequisiciones;
	
	protected JButton jButtonRecargarInformacionToolBarAutorizarRequisiciones;
	protected JButton jButtonProcesarInformacionToolBarAutorizarRequisiciones;
	protected JButton jButtonAnterioresToolBarAutorizarRequisiciones;
	protected JButton jButtonSiguientesToolBarAutorizarRequisiciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarAutorizarRequisiciones;
	protected JButton jButtonAbrirOrderByToolBarAutorizarRequisiciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutorizarRequisiciones;
	protected JMenuItem jMenuItemDuplicarAutorizarRequisiciones;
	protected JMenuItem jMenuItemNuevoRelacionesAutorizarRequisiciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAutorizarRequisiciones;
	protected JMenuItem jMenuItemCopiarAutorizarRequisiciones;
	protected JMenuItem jMenuItemVerFormAutorizarRequisiciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutorizarRequisiciones;
	protected JMenuItem jMenuItemCerrarAutorizarRequisiciones;
	protected JMenuItem jMenuItemDetalleCerrarAutorizarRequisiciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAutorizarRequisiciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutorizarRequisiciones;
	
	protected JMenuItem jMenuItemRecargarInformacionAutorizarRequisiciones;
	protected JMenuItem jMenuItemProcesarInformacionAutorizarRequisiciones;
	protected JMenuItem jMenuItemAnterioresAutorizarRequisiciones;
	protected JMenuItem jMenuItemSiguientesAutorizarRequisiciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutorizarRequisiciones;
	protected JMenuItem jMenuItemAbrirOrderByAutorizarRequisiciones;
	protected JMenuItem jMenuItemMostrarOcultarAutorizarRequisiciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutorizarRequisiciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAutorizarRequisiciones;
	protected JCheckBox jCheckBoxSeleccionadosAutorizarRequisiciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAutorizarRequisiciones;
	protected JCheckBox jCheckBoxConGraficoReporteAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAutorizarRequisiciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutorizarRequisiciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAutorizarRequisiciones;
	protected JTextField jTextFieldValorCampoGeneralAutorizarRequisiciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAutorizarRequisiciones;
	//public JList<Reporte> jListColumnasSelectReporteAutorizarRequisiciones;
	//public JScrollPane jScrollColumnasSelectReporteAutorizarRequisiciones;
	
	//public JLabel jLabelRelacionesSelectReporteAutorizarRequisiciones;
	//public JList<Reporte> jListRelacionesSelectReporteAutorizarRequisiciones;
	//public JScrollPane jScrollRelacionesSelectReporteAutorizarRequisiciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAutorizarRequisiciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAutorizarRequisiciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAutorizarRequisiciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoAutorizarRequisiciones;
	
		
	//public JLabel jLabelArchivoImportacionAutorizarRequisiciones;	
	//public JLabel jLabelPathArchivoImportacionAutorizarRequisiciones;
	//protected JTextField jTextFieldPathArchivoImportacionAutorizarRequisiciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAutorizarRequisiciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAutorizarRequisiciones;
	
	//public JLabel jLabelColumnaCategoriaValorAutorizarRequisiciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAutorizarRequisiciones;
	
	//public JLabel jLabelColumnasValoresGraficoAutorizarRequisiciones;
	//public JList<Reporte> jListColumnasValoresGraficoAutorizarRequisiciones;
	//public JScrollPane jScrollColumnasValoresGraficoAutorizarRequisiciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAutorizarRequisiciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAutorizarRequisiciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAutorizarRequisiciones;
	public JPanel jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	public JButton jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	
	public JPanel jPanelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	public JLabel jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones;

	public JDateChooser jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	public JButton jButtonfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisicionesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	public JLabel jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones;

	public JDateChooser jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones;
	public JButton jButtonfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisicionesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AutorizarRequisicionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutorizarRequisicionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutorizarRequisicionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutorizarRequisicionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAutorizarRequisiciones)	{
		this.jButtonRecargarInformacionAutorizarRequisiciones = jButtonRecargarInformacionAutorizarRequisiciones;
	}
	
	public JButton getjButtonProcesarInformacionAutorizarRequisiciones() {
		return this.jButtonProcesarInformacionAutorizarRequisiciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutorizarRequisiciones)	{
		this.jButtonProcesarInformacionAutorizarRequisiciones = jButtonProcesarInformacionAutorizarRequisiciones;
	}
	
	
	public JButton getjButtonRecargarInformacionAutorizarRequisiciones() {
		return this.jButtonRecargarInformacionAutorizarRequisiciones;
	}
	
	
	public List<AutorizarRequisiciones> getautorizarrequisicioness() {
		return this.autorizarrequisicioness;
	}

	public void setautorizarrequisicioness(List<AutorizarRequisiciones> autorizarrequisicioness) {
		this.autorizarrequisicioness = autorizarrequisicioness;
	}
	
	public List<AutorizarRequisiciones> getautorizarrequisicionessAux() {
		return this.autorizarrequisicionessAux;
	}

	public void setautorizarrequisicionessAux(List<AutorizarRequisiciones> autorizarrequisicionessAux) {
		this.autorizarrequisicionessAux = autorizarrequisicionessAux;
	}
	
	public List<AutorizarRequisiciones> getautorizarrequisicionessEliminados() {
		return this.autorizarrequisicionessEliminados;
	}

	public void setAutorizarRequisicionessEliminados(List<AutorizarRequisiciones> autorizarrequisicionessEliminados) {
		this.autorizarrequisicionessEliminados = autorizarrequisicionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAutorizarRequisiciones() {
		return jComboBoxTiposSeleccionarAutorizarRequisiciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAutorizarRequisiciones(
			JComboBox jComboBoxTiposSeleccionarAutorizarRequisiciones) {
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones = jComboBoxTiposSeleccionarAutorizarRequisiciones;
	}
	
	public void setBorderResaltarTiposSeleccionarAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAutorizarRequisiciones() {
		return jTextFieldValorCampoGeneralAutorizarRequisiciones;
	}

	public void setjTextFieldValorCampoGeneralAutorizarRequisiciones(
			JTextField jTextFieldValorCampoGeneralAutorizarRequisiciones) {
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones = jTextFieldValorCampoGeneralAutorizarRequisiciones;
	}

	public void setBorderResaltarValorCampoGeneralAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAutorizarRequisiciones() {
		return this.jCheckBoxSeleccionarTodosAutorizarRequisiciones;
	}

	public void setjCheckBoxSeleccionarTodosAutorizarRequisiciones(
			JCheckBox jCheckBoxSeleccionarTodosAutorizarRequisiciones) {
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones = jCheckBoxSeleccionarTodosAutorizarRequisiciones;
	}

	public void setBorderResaltarSeleccionarTodosAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAutorizarRequisiciones() {
		return this.jCheckBoxSeleccionadosAutorizarRequisiciones;
	}

	public void setjCheckBoxSeleccionadosAutorizarRequisiciones(
			JCheckBox jCheckBoxSeleccionadosAutorizarRequisiciones) {
		this.jCheckBoxSeleccionadosAutorizarRequisiciones = jCheckBoxSeleccionadosAutorizarRequisiciones;
	}
	
	public void setBorderResaltarSeleccionadosAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAutorizarRequisiciones() {
		return this.jComboBoxTiposArchivosReportesAutorizarRequisiciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAutorizarRequisiciones(
			JComboBox jComboBoxTiposArchivosReportesAutorizarRequisiciones) {
		this.jComboBoxTiposArchivosReportesAutorizarRequisiciones = jComboBoxTiposArchivosReportesAutorizarRequisiciones;
	}

	public void setBorderResaltarTiposArchivosReportesAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAutorizarRequisiciones() {
		return this.jComboBoxTiposReportesAutorizarRequisiciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAutorizarRequisiciones(
			JComboBox jComboBoxTiposReportesAutorizarRequisiciones) {
		this.jComboBoxTiposReportesAutorizarRequisiciones = jComboBoxTiposReportesAutorizarRequisiciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAutorizarRequisiciones() {
	//	return jComboBoxTiposReportesDinamicoAutorizarRequisiciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAutorizarRequisiciones(
	//		JComboBox jComboBoxTiposReportesDinamicoAutorizarRequisiciones) {
	//	this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones = jComboBoxTiposReportesDinamicoAutorizarRequisiciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones = jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones;
	//}
	
	public void setBorderResaltarTiposReportesAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAutorizarRequisiciones() {
		return this.jComboBoxTiposGraficosReportesAutorizarRequisiciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAutorizarRequisiciones(
			JComboBox jComboBoxTiposGraficosReportesAutorizarRequisiciones) {
		this.jComboBoxTiposGraficosReportesAutorizarRequisiciones = jComboBoxTiposGraficosReportesAutorizarRequisiciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAutorizarRequisiciones() {
		return this.jComboBoxTiposPaginacionAutorizarRequisiciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAutorizarRequisiciones(
			JComboBox jComboBoxTiposPaginacionAutorizarRequisiciones) {
		this.jComboBoxTiposPaginacionAutorizarRequisiciones = jComboBoxTiposPaginacionAutorizarRequisiciones;
	}
	
	public void setBorderResaltarTiposPaginacionAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAutorizarRequisiciones() {
		return this.jComboBoxTiposRelacionesAutorizarRequisiciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutorizarRequisiciones() {
		return this.jComboBoxTiposAccionesAutorizarRequisiciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutorizarRequisiciones(
			JComboBox jComboBoxTiposRelacionesAutorizarRequisiciones) {
		this.jComboBoxTiposRelacionesAutorizarRequisiciones = jComboBoxTiposRelacionesAutorizarRequisiciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutorizarRequisiciones(
			JComboBox jComboBoxTiposAccionesAutorizarRequisiciones) {
		this.jComboBoxTiposAccionesAutorizarRequisiciones = jComboBoxTiposAccionesAutorizarRequisiciones;
	}
	
	public void setBorderResaltarTiposRelacionesAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAutorizarRequisiciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAutorizarRequisiciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAutorizarRequisiciones() {
	//	return jCheckBoxConGraficoDinamicoAutorizarRequisiciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoAutorizarRequisiciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoAutorizarRequisiciones) {
	//	this.jCheckBoxConGraficoDinamicoAutorizarRequisiciones = jCheckBoxConGraficoDinamicoAutorizarRequisiciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAutorizarRequisiciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAutorizarRequisiciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAutorizarRequisiciones .setBorder(borderResaltar);		
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
		this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean();
		
		this.autorizarrequisicionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autorizarrequisicionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AutorizarRequisicionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AutorizarRequisicionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutorizarRequisicionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutorizarRequisicionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutorizarRequisicionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autorizar Requisiciones MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
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
		
		AutorizarRequisicionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AutorizarRequisiciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAutorizarRequisiciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"nuevo","nuevo","Nuevo"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"duplicar","duplicar","Duplicar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"copiar","copiar","Copiar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"ver_form","ver_form","Ver"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"recargar","recargar","Buscar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAutorizarRequisiciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,
							"cerrar","cerrar","Salir"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAutorizarRequisiciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAutorizarRequisiciones;
			
				this.jButtonProcesarInformacionToolBarAutorizarRequisiciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAutorizarRequisiciones;
				
		//protected JButton jButtonModificarToolBarAutorizarRequisiciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAutorizarRequisiciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAutorizarRequisiciones=new JMenuMe("General");
		this.jmenuArchivoAutorizarRequisiciones=new JMenuMe("Archivo");
		this.jmenuAccionesAutorizarRequisiciones=new JMenuMe("Acciones");
		this.jmenuDatosAutorizarRequisiciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutorizarRequisiciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutorizarRequisiciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutorizarRequisiciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAutorizarRequisiciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAutorizarRequisiciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAutorizarRequisiciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAutorizarRequisiciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAutorizarRequisiciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAutorizarRequisiciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAutorizarRequisiciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutorizarRequisiciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutorizarRequisiciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAutorizarRequisiciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAutorizarRequisiciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAutorizarRequisiciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAutorizarRequisiciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAutorizarRequisiciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAutorizarRequisiciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutorizarRequisiciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutorizarRequisiciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutorizarRequisiciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAutorizarRequisiciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAutorizarRequisiciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAutorizarRequisiciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAutorizarRequisiciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAutorizarRequisiciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAutorizarRequisiciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAutorizarRequisiciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAutorizarRequisiciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAutorizarRequisiciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAutorizarRequisiciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAutorizarRequisiciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAutorizarRequisiciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAutorizarRequisiciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAutorizarRequisiciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAutorizarRequisiciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutorizarRequisiciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutorizarRequisiciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutorizarRequisiciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAutorizarRequisiciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAutorizarRequisiciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAutorizarRequisiciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAutorizarRequisiciones.add(this.jMenuItemCerrarAutorizarRequisiciones);
			
			this.jmenuAccionesAutorizarRequisiciones.add(this.jMenuItemNuevoAutorizarRequisiciones);
			this.jmenuAccionesAutorizarRequisiciones.add(this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones);
			this.jmenuAccionesAutorizarRequisiciones.add(this.jMenuItemNuevoRelacionesAutorizarRequisiciones);
			this.jmenuAccionesAutorizarRequisiciones.add(this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones);		
			this.jmenuAccionesAutorizarRequisiciones.add(this.jMenuItemDuplicarAutorizarRequisiciones);		
			this.jmenuAccionesAutorizarRequisiciones.add(this.jMenuItemCopiarAutorizarRequisiciones);		
			this.jmenuAccionesAutorizarRequisiciones.add(this.jMenuItemVerFormAutorizarRequisiciones);		
			
			this.jmenuDatosAutorizarRequisiciones.add(this.jMenuItemRecargarInformacionAutorizarRequisiciones);				
			this.jmenuDatosAutorizarRequisiciones.add(this.jMenuItemAnterioresAutorizarRequisiciones);				
			this.jmenuDatosAutorizarRequisiciones.add(this.jMenuItemSiguientesAutorizarRequisiciones);				
			this.jmenuDatosAutorizarRequisiciones.add(this.jMenuItemAbrirOrderByAutorizarRequisiciones);				
			this.jmenuDatosAutorizarRequisiciones.add(this.jMenuItemMostrarOcultarAutorizarRequisiciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAutorizarRequisiciones.add(this.jMenuItemGuardarCambiosAutorizarRequisiciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAutorizarRequisiciones.add(this.jmenuArchivoAutorizarRequisiciones);		
			this.jmenuBarAutorizarRequisiciones.add(this.jmenuAccionesAutorizarRequisiciones);		
			this.jmenuBarAutorizarRequisiciones.add(this.jmenuDatosAutorizarRequisiciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAutorizarRequisiciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAutorizarRequisiciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones= new JButtonMe();
		this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones.setText("Buscar");
		this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones,"buscar_button","Buscar Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones = new JLabelMe();
		jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones= new JDateChooser();
		jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setDate(new Date());
		jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones = new JLabelMe();
		jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones= new JDateChooser();
		jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setDate(new Date());
		jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasAutorizarRequisiciones=new JTabbedPane();


		this.jTabbedPaneBusquedasAutorizarRequisiciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutorizarRequisiciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutorizarRequisiciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAutorizarRequisiciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAutorizarRequisiciones = new AutorizarRequisicionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Autorizar Requisiciones DATOS");
			this.jInternalFrameDetalleFormAutorizarRequisiciones = new AutorizarRequisicionesDetalleFormJInternalFrame(jDesktopPane,this.autorizarrequisicionesSessionBean.getConGuardarRelaciones(),this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAutorizarRequisiciones = null;//new AutorizarRequisicionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutorizarRequisiciones= new GridBagLayout();
		
		
		this.jTableDatosAutorizarRequisiciones = new JTableMe();      
		
		String sToolTipAutorizarRequisiciones="";
		sToolTipAutorizarRequisiciones=AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutorizarRequisiciones+="(Inventario.AutorizarRequisiciones)";
		}
		
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutorizarRequisiciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAutorizarRequisiciones.setToolTipText(sToolTipAutorizarRequisiciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAutorizarRequisiciones);
		this.jTableDatosAutorizarRequisiciones.setAutoCreateRowSorter(true);
		this.jTableDatosAutorizarRequisiciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAutorizarRequisiciones.setRowSelectionAllowed(true);
		this.jTableDatosAutorizarRequisiciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAutorizarRequisiciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAutorizarRequisiciones = new JButtonMe();
		this.jButtonDuplicarAutorizarRequisiciones = new JButtonMe();
		this.jButtonCopiarAutorizarRequisiciones = new JButtonMe();
		this.jButtonVerFormAutorizarRequisiciones = new JButtonMe();
		this.jButtonNuevoRelacionesAutorizarRequisiciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones = new JButtonMe();
		this.jButtonCerrarAutorizarRequisiciones = new JButtonMe();
		
		this.jScrollPanelDatosAutorizarRequisiciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralAutorizarRequisiciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Autorizar Requisiciones";
		
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizar Requisicioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosAutorizarRequisiciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutorizarRequisiciones.setToolTipText("Acciones");
        this.jPanelAccionesAutorizarRequisiciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAutorizarRequisiciones=new ReporteDinamicoJInternalFrame(AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAutorizarRequisiciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAutorizarRequisiciones=new ImportacionJInternalFrame(AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAutorizarRequisiciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAutorizarRequisiciones = new JButtonMe();
		
		this.jButtonAbrirOrderByAutorizarRequisiciones.setText("Orden");
		this.jButtonAbrirOrderByAutorizarRequisiciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutorizarRequisiciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutorizarRequisiciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutorizarRequisiciones,false,this);
			
			//this.cargarOrderByAutorizarRequisiciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutorizarRequisiciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutorizarRequisiciones,true,this);
			
			//this.cargarOrderByAutorizarRequisiciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAutorizarRequisiciones.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosAutorizarRequisiciones.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosAutorizarRequisiciones.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosAutorizarRequisiciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutorizarRequisiciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutorizarRequisiciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAutorizarRequisiciones.setText("Nuevo");
		this.jButtonDuplicarAutorizarRequisiciones.setText("Duplicar");
		this.jButtonCopiarAutorizarRequisiciones.setText("Copiar");
		this.jButtonVerFormAutorizarRequisiciones.setText("Ver");
		this.jButtonNuevoRelacionesAutorizarRequisiciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.setText("Guardar");
		this.jButtonCerrarAutorizarRequisiciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutorizarRequisiciones,"nuevo_button","Nuevo",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAutorizarRequisiciones,"duplicar_button","Duplicar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAutorizarRequisiciones,"copiar_button","Copiar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAutorizarRequisiciones,"ver_form","Ver",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAutorizarRequisiciones,"nuevorelaciones_button","Nuevo Rel",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutorizarRequisiciones,"guardarcambiostabla_button","Guardar",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutorizarRequisiciones,"cerrar_button","Salir",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAutorizarRequisiciones.setToolTipText("Nuevo"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAutorizarRequisiciones.setToolTipText("Duplicar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAutorizarRequisiciones.setToolTipText("Copiar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAutorizarRequisiciones.setToolTipText("Ver"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAutorizarRequisiciones.setToolTipText("Nuevo Rel"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.setToolTipText("Guardar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutorizarRequisiciones.setToolTipText("Salir"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutorizarRequisiciones";
		inputMap = this.jButtonNuevoAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutorizarRequisiciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutorizarRequisiciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarAutorizarRequisiciones";
		inputMap = this.jButtonDuplicarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAutorizarRequisiciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAutorizarRequisiciones"));
		
		//COPIAR
		sMapKey = "CopiarAutorizarRequisiciones";
		inputMap = this.jButtonCopiarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAutorizarRequisiciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAutorizarRequisiciones"));
		
		//VEr FORM
		sMapKey = "VerFormAutorizarRequisiciones";
		inputMap = this.jButtonVerFormAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAutorizarRequisiciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAutorizarRequisiciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAutorizarRequisiciones";
		inputMap = this.jButtonNuevoRelacionesAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAutorizarRequisiciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAutorizarRequisiciones";
		inputMap = this.jButtonModificarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAutorizarRequisiciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAutorizarRequisiciones";
		inputMap = this.jButtonCerrarAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutorizarRequisiciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutorizarRequisiciones";
		inputMap = this.jButtonGuardarCambiosTablaAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutorizarRequisiciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AutorizarRequisiciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AutorizarRequisiciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AutorizarRequisiciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AutorizarRequisiciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AutorizarRequisiciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAutorizarRequisiciones.setName("jPanelParametrosReportesAutorizarRequisiciones"); 
		
		this.jPanelParametrosReportesAccionesAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAutorizarRequisiciones.setName("jPanelParametrosReportesAccionesAutorizarRequisiciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAutorizarRequisiciones = new JButtonMe();
		this.jButtonRecargarInformacionAutorizarRequisiciones.setText("Buscar");
		this.jButtonRecargarInformacionAutorizarRequisiciones.setToolTipText("Buscar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAutorizarRequisiciones,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionAutorizarRequisiciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionAutorizarRequisiciones = new JButtonMe();
		this.jButtonProcesarInformacionAutorizarRequisiciones.setText("Procesar");
		this.jButtonProcesarInformacionAutorizarRequisiciones.setToolTipText("Procesar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAutorizarRequisiciones.setVisible(false);
			
		this.jButtonProcesarInformacionAutorizarRequisiciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutorizarRequisiciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutorizarRequisiciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.setText("TIPO");       
		this.jComboBoxTiposReportesAutorizarRequisiciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAutorizarRequisiciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAutorizarRequisiciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionAutorizarRequisiciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAutorizarRequisiciones.setText("Accion");
		this.jComboBoxTiposRelacionesAutorizarRequisiciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutorizarRequisiciones.setText("Accion");
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAutorizarRequisiciones.setText("Accion");
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAutorizarRequisiciones = new JLabelMe();
		
		this.jLabelAccionesAutorizarRequisiciones.setText("Acciones");		
		this.jLabelAccionesAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAutorizarRequisiciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAutorizarRequisiciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAutorizarRequisiciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAutorizarRequisiciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAutorizarRequisiciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteAutorizarRequisiciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAutorizarRequisiciones = new JButtonMe();
		//this.jButtonAnterioresAutorizarRequisiciones.setText("<<");
        this.jButtonAnterioresAutorizarRequisiciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAutorizarRequisiciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAutorizarRequisiciones = new JButtonMe();
		//this.jButtonSiguientesAutorizarRequisiciones.setText(">>");
        this.jButtonSiguientesAutorizarRequisiciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAutorizarRequisiciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAutorizarRequisiciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAutorizarRequisiciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosAutorizarRequisiciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAutorizarRequisiciones,"nuevoguardarcambios_button","Nue",this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAutorizarRequisiciones";
		inputMap = this.jButtonNuevoGuardarCambiosAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAutorizarRequisiciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAutorizarRequisiciones";
		inputMap = this.jButtonRecargarInformacionAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAutorizarRequisiciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAutorizarRequisiciones";
		inputMap = this.jButtonSiguientesAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAutorizarRequisiciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAutorizarRequisiciones";
		inputMap = this.jButtonAnterioresAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAutorizarRequisiciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAutorizarRequisiciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAutorizarRequisiciones.setMinimumSize(new Dimension(this.getWidth(),AutorizarRequisicionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutorizarRequisicionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutorizarRequisiciones.setMaximumSize(new Dimension(this.getWidth(),AutorizarRequisicionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutorizarRequisicionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutorizarRequisiciones.setPreferredSize(new Dimension(this.getWidth(),AutorizarRequisicionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutorizarRequisicionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAutorizarRequisiciones = new GridBagLayout();

			this.jPanelPaginacionAutorizarRequisiciones.setLayout(gridaBagLayoutPaginacionAutorizarRequisiciones);						
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonAnterioresAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
					
						
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
			
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonNuevoGuardarCambiosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
						
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonSiguientesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 1;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonNuevoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
						
			
			
			if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
				this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAutorizarRequisiciones.gridy = 1;
				this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonGuardarCambiosTablaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			}
			
			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 1;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonDuplicarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 1;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonCopiarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 1;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonVerFormAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 1;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAutorizarRequisiciones.add(this.jButtonCerrarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
		
		
		this.jButtonRecargarInformacionAutorizarRequisiciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutorizarRequisiciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutorizarRequisiciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAutorizarRequisiciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutorizarRequisiciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutorizarRequisiciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAutorizarRequisiciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutorizarRequisiciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutorizarRequisiciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAutorizarRequisiciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutorizarRequisiciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutorizarRequisiciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAutorizarRequisiciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutorizarRequisiciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutorizarRequisiciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutorizarRequisiciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAutorizarRequisiciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutorizarRequisiciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutorizarRequisiciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAutorizarRequisiciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutorizarRequisiciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutorizarRequisiciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAutorizarRequisiciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAutorizarRequisiciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AutorizarRequisiciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AutorizarRequisiciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AutorizarRequisiciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AutorizarRequisiciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAutorizarRequisiciones.setLayout(gridaBagParametrosReportesAutorizarRequisiciones);
			this.jPanelParametrosReportesAccionesAutorizarRequisiciones.setLayout(gridaBagParametrosReportesAccionesAutorizarRequisiciones);
			
			
			this.jPanelParametrosAuxiliar1AutorizarRequisiciones.setLayout(gridaBagParametrosAuxiliar1AutorizarRequisiciones);
			this.jPanelParametrosAuxiliar2AutorizarRequisiciones.setLayout(gridaBagParametrosAuxiliar2AutorizarRequisiciones);
			this.jPanelParametrosAuxiliar3AutorizarRequisiciones.setLayout(gridaBagParametrosAuxiliar3AutorizarRequisiciones);
			this.jPanelParametrosAuxiliar4AutorizarRequisiciones.setLayout(gridaBagParametrosAuxiliar4AutorizarRequisiciones);
			//this.jPanelParametrosAuxiliar5AutorizarRequisiciones.setLayout(gridaBagParametrosAuxiliar2AutorizarRequisiciones);			
			
			
			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jButtonRecargarInformacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutorizarRequisiciones.add(this.jComboBoxTiposPaginacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutorizarRequisiciones.add(this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutorizarRequisiciones.add(this.jComboBoxTiposArchivosReportesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jPanelParametrosAuxiliar1AutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutorizarRequisiciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AutorizarRequisiciones.add(this.jComboBoxTiposReportesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jPanelParametrosAuxiliar4AutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jComboBoxTiposReportesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jCheckBoxGenerarReporteAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jPanelParametrosAuxiliar2AutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutorizarRequisiciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jLabelAccionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
				this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jButtonAbrirOrderByAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jComboBoxTiposSeleccionarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
			
			
			/*
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutorizarRequisiciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jCheckBoxSeleccionarTodosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutorizarRequisiciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutorizarRequisiciones.add(this.jCheckBoxSeleccionarTodosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);															
				
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutorizarRequisiciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutorizarRequisiciones.add(this.jCheckBoxSeleccionadosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jPanelParametrosAuxiliar3AutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutorizarRequisiciones.add(this.jComboBoxTiposAccionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAutorizarRequisiciones = new GridBagLayout();

			this.jScrollPanelDatosAutorizarRequisiciones.setLayout(gridaBagLayoutDatosAutorizarRequisiciones);
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
			
			this.jScrollPanelDatosAutorizarRequisiciones.add(this.jTableDatosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAutorizarRequisiciones.setViewportView(this.jTableDatosAutorizarRequisiciones);
		this.jTableDatosAutorizarRequisiciones.setFillsViewportHeight(true);
		this.jTableDatosAutorizarRequisiciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAutorizarRequisiciones= new GridBagLayout();
		this.jPanelAccionesAutorizarRequisiciones.setLayout(gridaBagLayoutAccionesAutorizarRequisiciones);
		
		
		/*	
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
			
		this.jPanelAccionesAutorizarRequisiciones.add(this.jButtonNuevoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaAutorizarRequisicionesAutorizarRequisiciones= new GridBagLayout();
		gridaBagLayoutBusquedaAutorizarRequisicionesAutorizarRequisiciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaAutorizarRequisicionesAutorizarRequisiciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaAutorizarRequisicionesAutorizarRequisiciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaAutorizarRequisicionesAutorizarRequisiciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones.setLayout(gridaBagLayoutBusquedaAutorizarRequisicionesAutorizarRequisiciones);

		gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		gridBagConstraintsAutorizarRequisiciones.gridx = 0;
		jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones.add(jLabelfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);

		gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutorizarRequisiciones.gridy = 0;
		gridBagConstraintsAutorizarRequisiciones.gridx = 1;
		jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones.add(jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);


		gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutorizarRequisiciones.gridy = 1;
		gridBagConstraintsAutorizarRequisiciones.gridx = 0;
		jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones.add(jLabelfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);

		gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutorizarRequisiciones.gridy = 1;
		gridBagConstraintsAutorizarRequisiciones.gridx = 1;
		jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones.add(jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);

		gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutorizarRequisiciones.gridy = 2;
		gridBagConstraintsAutorizarRequisiciones.gridx =1;
		jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones.add(jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones, gridBagConstraintsAutorizarRequisiciones);

		jTabbedPaneBusquedasAutorizarRequisiciones.addTab("1.-Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones);
		jTabbedPaneBusquedasAutorizarRequisiciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutorizarRequisiciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutorizarRequisiciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();						
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;		
			//this.gridBagConstraintsAutorizarRequisiciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutorizarRequisiciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;		
		//this.gridBagConstraintsAutorizarRequisiciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAutorizarRequisiciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAutorizarRequisiciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;		
			this.gridBagConstraintsAutorizarRequisiciones.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAutorizarRequisiciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);								
		
		
		/*
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		*/		
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutorizarRequisiciones.gridx =0;
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutorizarRequisiciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
				
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAutorizarRequisiciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutorizarRequisiciones = new GridBagLayout();
			this.jPanelBusquedasParametrosAutorizarRequisiciones.setLayout(gridaBagLayoutBusquedasParametrosAutorizarRequisiciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAutorizarRequisiciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
			
			
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
			
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAutorizarRequisiciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAutorizarRequisiciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAutorizarRequisiciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAutorizarRequisiciones.setName("jPanelReporteDinamicoAutorizarRequisiciones"); 
		
		this.jPanelReporteDinamicoAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAutorizarRequisiciones.setLayout(gridaBagLayoutReporteDinamicoAutorizarRequisiciones);
		
		
		this.jInternalFrameReporteDinamicoAutorizarRequisiciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAutorizarRequisiciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutorizarRequisiciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizar Requisicioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAutorizarRequisiciones = new JLabelMe();

		this.jLabelColumnasSelectReporteAutorizarRequisiciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jLabelColumnasSelectReporteAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAutorizarRequisiciones = new JList<Reporte>();
		this.jListColumnasSelectReporteAutorizarRequisiciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAutorizarRequisiciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAutorizarRequisiciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutorizarRequisiciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutorizarRequisiciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAutorizarRequisiciones=new JScrollPane(this.jListColumnasSelectReporteAutorizarRequisiciones);
			
			this.jScrollColumnasSelectReporteAutorizarRequisiciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutorizarRequisiciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutorizarRequisiciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jListColumnasSelectReporteAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jScrollColumnasSelectReporteAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAutorizarRequisiciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteAutorizarRequisiciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAutorizarRequisiciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteAutorizarRequisiciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAutorizarRequisiciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAutorizarRequisiciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutorizarRequisiciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutorizarRequisiciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAutorizarRequisiciones=new JScrollPane(this.jListRelacionesSelectReporteAutorizarRequisiciones);
			
			this.jScrollRelacionesSelectReporteAutorizarRequisiciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutorizarRequisiciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutorizarRequisiciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAutorizarRequisiciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAutorizarRequisiciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoAutorizarRequisiciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAutorizarRequisiciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAutorizarRequisiciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jLabelGenerarExcelReporteDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones.setToolTipText("Generar EXCEL"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		//this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jComboBoxTiposReportesDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAutorizarRequisiciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAutorizarRequisiciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jLabelTiposArchivoReporteDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jComboBoxTiposArchivosReportesDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAutorizarRequisiciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAutorizarRequisiciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAutorizarRequisiciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAutorizarRequisiciones.setToolTipText("Generar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jButtonGenerarReporteDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAutorizarRequisiciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAutorizarRequisiciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAutorizarRequisiciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAutorizarRequisiciones.setToolTipText("Cancelar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutorizarRequisiciones.add(this.jButtonCerrarReporteDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAutorizarRequisiciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAutorizarRequisiciones= new JScrollPane(jPanelReporteDinamicoAutorizarRequisiciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizar Requisicioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAutorizarRequisiciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAutorizarRequisiciones);
		this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getContentPane().add(this.jScrollPanelReporteDinamicoAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAutorizarRequisiciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAutorizarRequisiciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAutorizarRequisiciones.setName("jPanelImportacionAutorizarRequisiciones"); 
		
		this.jPanelImportacionAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAutorizarRequisiciones.setLayout(gridaBagLayoutImportacionAutorizarRequisiciones);
		
		
		this.jInternalFrameImportacionAutorizarRequisiciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAutorizarRequisiciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAutorizarRequisiciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutorizarRequisiciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAutorizarRequisiciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutorizarRequisiciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutorizarRequisiciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAutorizarRequisiciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutorizarRequisiciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutorizarRequisiciones.setResizable(true);
	    this.jInternalFrameImportacionAutorizarRequisiciones.setClosable(true);
	    this.jInternalFrameImportacionAutorizarRequisiciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAutorizarRequisiciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutorizarRequisiciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutorizarRequisiciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAutorizarRequisiciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutorizarRequisiciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutorizarRequisiciones.setResizable(true);
	    this.jInternalFrameImportacionAutorizarRequisiciones.setClosable(true);
	    this.jInternalFrameImportacionAutorizarRequisiciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizar Requisicioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAutorizarRequisiciones = new JLabelMe();

		this.jLabelArchivoImportacionAutorizarRequisiciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutorizarRequisiciones.add(this.jLabelArchivoImportacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAutorizarRequisiciones = new JFileChooser();		
		this.jFileChooserImportacionAutorizarRequisiciones.setToolTipText("ESCOGER ARCHIVO"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAutorizarRequisiciones = new JButtonMe();
		this.jButtonAbrirImportacionAutorizarRequisiciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAutorizarRequisiciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAutorizarRequisiciones.setToolTipText("Generar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYImportacion;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutorizarRequisiciones.add(this.jButtonAbrirImportacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAutorizarRequisiciones = new JLabelMe();

		this.jLabelPathArchivoImportacionAutorizarRequisiciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAutorizarRequisiciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutorizarRequisiciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutorizarRequisiciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutorizarRequisiciones.add(this.jLabelPathArchivoImportacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAutorizarRequisiciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAutorizarRequisiciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutorizarRequisiciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutorizarRequisiciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYImportacion;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutorizarRequisiciones.add(this.jTextFieldPathArchivoImportacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAutorizarRequisiciones = new JButtonMe();
		this.jButtonGenerarImportacionAutorizarRequisiciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAutorizarRequisiciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAutorizarRequisiciones.setToolTipText("Generar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYImportacion;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutorizarRequisiciones.add(this.jButtonGenerarImportacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAutorizarRequisiciones = new JButtonMe();
		this.jButtonCerrarImportacionAutorizarRequisiciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAutorizarRequisiciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAutorizarRequisiciones.setToolTipText("Cancelar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYImportacion;
		this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutorizarRequisiciones.add(this.jButtonCerrarImportacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAutorizarRequisiciones = new GridBagLayout();
		
		this.jScrollPanelImportacionAutorizarRequisiciones= new JScrollPane(jPanelImportacionAutorizarRequisiciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
		this.gridBagConstraintsAutorizarRequisiciones.gridy =iPosYImportacion;
		this.gridBagConstraintsAutorizarRequisiciones.gridx =iPosXImportacion;
		this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAutorizarRequisiciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAutorizarRequisiciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAutorizarRequisiciones);
		this.jInternalFrameImportacionAutorizarRequisiciones.getContentPane().add(this.jScrollPanelImportacionAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAutorizarRequisiciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAutorizarRequisiciones = new JButtonMe();
			this.jButtonAbrirOrderByAutorizarRequisiciones.setText("Orden");
			this.jButtonAbrirOrderByAutorizarRequisiciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutorizarRequisiciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAutorizarRequisiciones";
			inputMap = this.jButtonAbrirOrderByAutorizarRequisiciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAutorizarRequisiciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAutorizarRequisiciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByAutorizarRequisiciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAutorizarRequisiciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAutorizarRequisiciones.setName("jPanelOrderByAutorizarRequisiciones"); 
			
			this.jPanelOrderByAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAutorizarRequisiciones.setLayout(gridaBagLayoutOrderByAutorizarRequisiciones);
			
			
			this.jTableDatosAutorizarRequisicionesOrderBy = new JTableMe();        
			this.jTableDatosAutorizarRequisicionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAutorizarRequisicionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAutorizarRequisicionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAutorizarRequisicionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAutorizarRequisicionesOrderBy.setViewportView(this.jTableDatosAutorizarRequisicionesOrderBy);
			this.jTableDatosAutorizarRequisicionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAutorizarRequisicionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAutorizarRequisiciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAutorizarRequisiciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAutorizarRequisiciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAutorizarRequisiciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAutorizarRequisiciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAutorizarRequisiciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAutorizarRequisiciones.setTitle("Orden");
			this.jInternalFrameOrderByAutorizarRequisiciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAutorizarRequisiciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAutorizarRequisiciones.setResizable(true);
			this.jInternalFrameOrderByAutorizarRequisiciones.setClosable(true);
			this.jInternalFrameOrderByAutorizarRequisiciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAutorizarRequisiciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizar Requisicioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAutorizarRequisiciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAutorizarRequisiciones.ipady =150;
				
			this.jPanelOrderByAutorizarRequisiciones.add(jScrollPanelDatosAutorizarRequisicionesOrderBy, this.gridBagConstraintsAutorizarRequisiciones);//this.jTableDatosAutorizarRequisicionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAutorizarRequisiciones = new JButtonMe();
			this.jButtonCerrarOrderByAutorizarRequisiciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAutorizarRequisiciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAutorizarRequisiciones.setToolTipText("Cancelar"+" "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAutorizarRequisiciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutorizarRequisiciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAutorizarRequisiciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAutorizarRequisiciones.add(this.jButtonCerrarOrderByAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAutorizarRequisiciones = new GridBagLayout();
			
			this.jScrollPanelOrderByAutorizarRequisiciones= new JScrollPane(jPanelOrderByAutorizarRequisiciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAutorizarRequisiciones = new GridBagConstraints();
			this.gridBagConstraintsAutorizarRequisiciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsAutorizarRequisiciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutorizarRequisiciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAutorizarRequisiciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAutorizarRequisiciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAutorizarRequisiciones);
			
			this.jInternalFrameOrderByAutorizarRequisiciones.getContentPane().add(this.jScrollPanelOrderByAutorizarRequisiciones, this.gridBagConstraintsAutorizarRequisiciones);			
		
		} else {
			this.jButtonAbrirOrderByAutorizarRequisiciones = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosAutorizarRequisiciones.getRowHeight();//AutorizarRequisicionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones.isSelected()) {
					iHeightTable=AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutorizarRequisiciones.isSelected()) {
					iHeightTable=AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutorizarRequisicionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAutorizarRequisiciones!=null && this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy()!=null) {
			//if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAutorizarRequisiciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAutorizarRequisiciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAutorizarRequisiciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAutorizarRequisiciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutorizarRequisiciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutorizarRequisiciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=autorizarrequisicionesLogic.getAutorizarRequisicioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autorizarrequisicioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AutorizarRequisiciones> TraerAutorizarRequisicionesBeans(List<AutorizarRequisiciones> autorizarrequisicioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicioness) {
					
				if(!(AutorizarRequisicionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AutorizarRequisicionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					autorizarrequisiciones.setsDetalleGeneralEntityReporte(AutorizarRequisicionesConstantesFunciones.getAutorizarRequisicionesDescripcion(autorizarrequisiciones));
										
						
					
						
					
				} else  {
							
					//autorizarrequisiciones.setsDetalleGeneralEntityReporte(autorizarrequisiciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//autorizarrequisicionesbeans.add(autorizarrequisicionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return autorizarrequisicioness;
    }
	//PARA REPORTES FIN
}
