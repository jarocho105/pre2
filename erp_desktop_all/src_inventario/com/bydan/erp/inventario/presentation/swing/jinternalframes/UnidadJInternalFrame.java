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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.UnidadConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class UnidadJInternalFrame extends UnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUnidad;
	
	protected JMenuBar jmenuBarUnidad;
	
	protected JMenu jmenuUnidad;
	protected JMenu jmenuDatosUnidad;
	protected JMenu jmenuArchivoUnidad;
	protected JMenu jmenuAccionesUnidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUnidad;	
	protected GridBagConstraints gridBagConstraintsUnidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UnidadDetalleFormJInternalFrame jInternalFrameDetalleFormUnidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUnidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUnidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoUnidadBeanSwingJInternalFrame tipounidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipounidad="";
	
	public UnidadSessionBean unidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoUnidadSessionBean tipounidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Unidad> unidads;		
	public List<Unidad> unidadsEliminados;	
	public List<Unidad> unidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUnidad;		
	protected JButton jButtonAbrirOrderByUnidad;
	
	
	//protected JPanel jPanelOrderByUnidad;
	//public JScrollPane jScrollPanelOrderByUnidad;	
	//protected JButton jButtonCerrarOrderByUnidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UnidadLogic unidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUnidad;
	public JScrollPane jScrollPanelDatosEdicionUnidad;
	public JScrollPane jScrollPanelDatosGeneralUnidad;
    
	
	
	//public JScrollPane jScrollPanelDatosUnidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUnidad;
	//public JScrollPane jScrollPanelImportacionUnidad;
	
	
	
	protected JPanel jPanelAccionesUnidad;
	
    protected JPanel jPanelPaginacionUnidad;
    protected JPanel jPanelParametrosReportesUnidad;
	protected JPanel jPanelParametrosReportesAccionesUnidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Unidad;
	protected JPanel jPanelParametrosAuxiliar2Unidad;
	protected JPanel jPanelParametrosAuxiliar3Unidad;
	protected JPanel jPanelParametrosAuxiliar4Unidad;
	//protected JPanel jPanelParametrosAuxiliar5Unidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoUnidad;
	//protected JPanel jPanelImportacionUnidad;
	
	
	public JTable jTableDatosUnidad;
	
	
	
	//public JTable jTableDatosUnidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUnidad;
	protected JButton jButtonDuplicarUnidad;
	protected JButton jButtonCopiarUnidad;
	protected JButton jButtonVerFormUnidad;
	protected JButton jButtonNuevoRelacionesUnidad;
	protected JButton jButtonModificarUnidad;
	
    protected JButton jButtonGuardarCambiosTablaUnidad;
	protected JButton jButtonCerrarUnidad;
	
	
	protected JButton jButtonRecargarInformacionUnidad;
	protected JButton jButtonProcesarInformacionUnidad;
	
	
	protected JButton jButtonAnterioresUnidad;
	protected JButton jButtonSiguientesUnidad;
	protected JButton jButtonNuevoGuardarCambiosUnidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUnidad;
	//protected JButton jButtonCerrarReporteDinamicoUnidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoUnidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionUnidad;
	//protected JButton jButtonGenerarImportacionUnidad;
	//protected JButton jButtonCerrarImportacionUnidad;
	//protected JFileChooser jFileChooserImportacionUnidad;
	//protected File fileImportacionUnidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUnidad;
	protected JButton jButtonDuplicarToolBarUnidad;
	protected JButton jButtonNuevoRelacionesToolBarUnidad;
	
	
	public JButton jButtonGuardarCambiosToolBarUnidad;
	protected JButton jButtonCopiarToolBarUnidad;
	protected JButton jButtonVerFormToolBarUnidad;
	public JButton jButtonGuardarCambiosTablaToolBarUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarUnidad;
	protected JButton jButtonCerrarToolBarUnidad;
	
	protected JButton jButtonRecargarInformacionToolBarUnidad;
	protected JButton jButtonProcesarInformacionToolBarUnidad;
	protected JButton jButtonAnterioresToolBarUnidad;
	protected JButton jButtonSiguientesToolBarUnidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarUnidad;
	protected JButton jButtonAbrirOrderByToolBarUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUnidad;
	protected JMenuItem jMenuItemDuplicarUnidad;
	protected JMenuItem jMenuItemNuevoRelacionesUnidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUnidad;
	protected JMenuItem jMenuItemCopiarUnidad;
	protected JMenuItem jMenuItemVerFormUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaUnidad;
	protected JMenuItem jMenuItemCerrarUnidad;
	protected JMenuItem jMenuItemDetalleCerrarUnidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarUnidad;
	
	protected JMenuItem jMenuItemRecargarInformacionUnidad;
	protected JMenuItem jMenuItemProcesarInformacionUnidad;
	protected JMenuItem jMenuItemAnterioresUnidad;
	protected JMenuItem jMenuItemSiguientesUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUnidad;
	protected JMenuItem jMenuItemAbrirOrderByUnidad;
	protected JMenuItem jMenuItemMostrarOcultarUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUnidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUnidad;
	protected JCheckBox jCheckBoxSeleccionadosUnidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUnidad;
	protected JCheckBox jCheckBoxConGraficoReporteUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUnidad;
	protected JTextField jTextFieldValorCampoGeneralUnidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUnidad;
	//public JList<Reporte> jListColumnasSelectReporteUnidad;
	//public JScrollPane jScrollColumnasSelectReporteUnidad;
	
	//public JLabel jLabelRelacionesSelectReporteUnidad;
	//public JList<Reporte> jListRelacionesSelectReporteUnidad;
	//public JScrollPane jScrollRelacionesSelectReporteUnidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUnidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUnidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUnidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoUnidad;
	
		
	//public JLabel jLabelArchivoImportacionUnidad;	
	//public JLabel jLabelPathArchivoImportacionUnidad;
	//protected JTextField jTextFieldPathArchivoImportacionUnidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUnidad;
	
	//public JLabel jLabelColumnaCategoriaValorUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUnidad;
	
	//public JLabel jLabelColumnasValoresGraficoUnidad;
	//public JList<Reporte> jListColumnasValoresGraficoUnidad;
	//public JScrollPane jScrollColumnasValoresGraficoUnidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUnidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUnidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUnidad;
	public JPanel jPanelBusquedaPorNombreUnidad;
	public JButton jButtonBusquedaPorNombreUnidad;
	public JPanel jPanelBusquedaPorSiglasUnidad;
	public JButton jButtonBusquedaPorSiglasUnidad;
	public JPanel jPanelFK_IdTipoUnidadUnidad;
	public JButton jButtonFK_IdTipoUnidadUnidad;
	
	public JPanel jPanelnombreBusquedaPorNombreUnidad;
	public JLabel jLabelnombreBusquedaPorNombreUnidad;
	public JTextField jTextFieldnombreBusquedaPorNombreUnidad;
	public JButton jButtonnombreBusquedaPorNombreUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglasBusquedaPorSiglasUnidad;
	public JLabel jLabelsiglasBusquedaPorSiglasUnidad;
	public JTextField jTextFieldsiglasBusquedaPorSiglasUnidad;
	public JButton jButtonsiglasBusquedaPorSiglasUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_unidadFK_IdTipoUnidadUnidad;
	public JLabel jLabelid_tipo_unidadFK_IdTipoUnidadUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad;
	public JButton jButtonid_tipo_unidadFK_IdTipoUnidadUnidad= new JButtonMe();
	public JButton jButtonid_tipo_unidadFK_IdTipoUnidadUnidadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_unidadFK_IdTipoUnidadUnidadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public UnidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UnidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UnidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UnidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUnidad)	{
		this.jButtonRecargarInformacionUnidad = jButtonRecargarInformacionUnidad;
	}
	
	public JButton getjButtonProcesarInformacionUnidad() {
		return this.jButtonProcesarInformacionUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUnidad)	{
		this.jButtonProcesarInformacionUnidad = jButtonProcesarInformacionUnidad;
	}
	
	
	public JButton getjButtonRecargarInformacionUnidad() {
		return this.jButtonRecargarInformacionUnidad;
	}
	
	
	public List<Unidad> getunidads() {
		return this.unidads;
	}

	public void setunidads(List<Unidad> unidads) {
		this.unidads = unidads;
	}
	
	public List<Unidad> getunidadsAux() {
		return this.unidadsAux;
	}

	public void setunidadsAux(List<Unidad> unidadsAux) {
		this.unidadsAux = unidadsAux;
	}
	
	public List<Unidad> getunidadsEliminados() {
		return this.unidadsEliminados;
	}

	public void setUnidadsEliminados(List<Unidad> unidadsEliminados) {
		this.unidadsEliminados = unidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUnidad() {
		return jComboBoxTiposSeleccionarUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUnidad(
			JComboBox jComboBoxTiposSeleccionarUnidad) {
		this.jComboBoxTiposSeleccionarUnidad = jComboBoxTiposSeleccionarUnidad;
	}
	
	public void setBorderResaltarTiposSeleccionarUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUnidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUnidad() {
		return jTextFieldValorCampoGeneralUnidad;
	}

	public void setjTextFieldValorCampoGeneralUnidad(
			JTextField jTextFieldValorCampoGeneralUnidad) {
		this.jTextFieldValorCampoGeneralUnidad = jTextFieldValorCampoGeneralUnidad;
	}

	public void setBorderResaltarValorCampoGeneralUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUnidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUnidad() {
		return this.jCheckBoxSeleccionarTodosUnidad;
	}

	public void setjCheckBoxSeleccionarTodosUnidad(
			JCheckBox jCheckBoxSeleccionarTodosUnidad) {
		this.jCheckBoxSeleccionarTodosUnidad = jCheckBoxSeleccionarTodosUnidad;
	}

	public void setBorderResaltarSeleccionarTodosUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUnidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUnidad() {
		return this.jCheckBoxSeleccionadosUnidad;
	}

	public void setjCheckBoxSeleccionadosUnidad(
			JCheckBox jCheckBoxSeleccionadosUnidad) {
		this.jCheckBoxSeleccionadosUnidad = jCheckBoxSeleccionadosUnidad;
	}
	
	public void setBorderResaltarSeleccionadosUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUnidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUnidad() {
		return this.jComboBoxTiposArchivosReportesUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUnidad(
			JComboBox jComboBoxTiposArchivosReportesUnidad) {
		this.jComboBoxTiposArchivosReportesUnidad = jComboBoxTiposArchivosReportesUnidad;
	}

	public void setBorderResaltarTiposArchivosReportesUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUnidad() {
		return this.jComboBoxTiposReportesUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUnidad(
			JComboBox jComboBoxTiposReportesUnidad) {
		this.jComboBoxTiposReportesUnidad = jComboBoxTiposReportesUnidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUnidad() {
	//	return jComboBoxTiposReportesDinamicoUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUnidad(
	//		JComboBox jComboBoxTiposReportesDinamicoUnidad) {
	//	this.jComboBoxTiposReportesDinamicoUnidad = jComboBoxTiposReportesDinamicoUnidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUnidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUnidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUnidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUnidad = jComboBoxTiposArchivosReportesDinamicoUnidad;
	//}
	
	public void setBorderResaltarTiposReportesUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUnidad() {
		return this.jComboBoxTiposGraficosReportesUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUnidad(
			JComboBox jComboBoxTiposGraficosReportesUnidad) {
		this.jComboBoxTiposGraficosReportesUnidad = jComboBoxTiposGraficosReportesUnidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUnidad() {
		return this.jComboBoxTiposPaginacionUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUnidad(
			JComboBox jComboBoxTiposPaginacionUnidad) {
		this.jComboBoxTiposPaginacionUnidad = jComboBoxTiposPaginacionUnidad;
	}
	
	public void setBorderResaltarTiposPaginacionUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUnidad() {
		return this.jComboBoxTiposRelacionesUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUnidad() {
		return this.jComboBoxTiposAccionesUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUnidad(
			JComboBox jComboBoxTiposRelacionesUnidad) {
		this.jComboBoxTiposRelacionesUnidad = jComboBoxTiposRelacionesUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUnidad(
			JComboBox jComboBoxTiposAccionesUnidad) {
		this.jComboBoxTiposAccionesUnidad = jComboBoxTiposAccionesUnidad;
	}
	
	public void setBorderResaltarTiposRelacionesUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUnidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUnidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUnidad() {
	//	return jCheckBoxConGraficoDinamicoUnidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoUnidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoUnidad) {
	//	this.jCheckBoxConGraficoDinamicoUnidad = jCheckBoxConGraficoDinamicoUnidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUnidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUnidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUnidad .setBorder(borderResaltar);		
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
		this.unidadSessionBean=new UnidadSessionBean();
		
		this.unidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.unidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.unidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
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
		
		UnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Unidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUnidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUnidad,this.jTtoolBarUnidad,
							"nuevo","nuevo","Nuevo"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUnidad,this.jTtoolBarUnidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUnidad,this.jTtoolBarUnidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUnidad,this.jTtoolBarUnidad,
							"duplicar","duplicar","Duplicar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUnidad,this.jTtoolBarUnidad,
							"copiar","copiar","Copiar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUnidad,this.jTtoolBarUnidad,
							"ver_form","ver_form","Ver"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUnidad,this.jTtoolBarUnidad,
							"recargar","recargar","Recargar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUnidad,this.jTtoolBarUnidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUnidad,this.jTtoolBarUnidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUnidad,this.jTtoolBarUnidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUnidad,this.jTtoolBarUnidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUnidad,this.jTtoolBarUnidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUnidad,this.jTtoolBarUnidad,
							"cerrar","cerrar","Salir"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUnidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUnidad;
			
				this.jButtonProcesarInformacionToolBarUnidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUnidad;
				
		//protected JButton jButtonModificarToolBarUnidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUnidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUnidad=new JMenuMe("General");
		this.jmenuArchivoUnidad=new JMenuMe("Archivo");
		this.jmenuAccionesUnidad=new JMenuMe("Acciones");
		this.jmenuDatosUnidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUnidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUnidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUnidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUnidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUnidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUnidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUnidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUnidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUnidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUnidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUnidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUnidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUnidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUnidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUnidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUnidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUnidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUnidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUnidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUnidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUnidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUnidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUnidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUnidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUnidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUnidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUnidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUnidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUnidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUnidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUnidad.add(this.jMenuItemCerrarUnidad);
			
			this.jmenuAccionesUnidad.add(this.jMenuItemNuevoUnidad);
			this.jmenuAccionesUnidad.add(this.jMenuItemNuevoGuardarCambiosUnidad);
			this.jmenuAccionesUnidad.add(this.jMenuItemNuevoRelacionesUnidad);
			this.jmenuAccionesUnidad.add(this.jMenuItemGuardarCambiosTablaUnidad);		
			this.jmenuAccionesUnidad.add(this.jMenuItemDuplicarUnidad);		
			this.jmenuAccionesUnidad.add(this.jMenuItemCopiarUnidad);		
			this.jmenuAccionesUnidad.add(this.jMenuItemVerFormUnidad);		
			
			this.jmenuDatosUnidad.add(this.jMenuItemRecargarInformacionUnidad);				
			this.jmenuDatosUnidad.add(this.jMenuItemAnterioresUnidad);				
			this.jmenuDatosUnidad.add(this.jMenuItemSiguientesUnidad);				
			this.jmenuDatosUnidad.add(this.jMenuItemAbrirOrderByUnidad);				
			this.jmenuDatosUnidad.add(this.jMenuItemMostrarOcultarUnidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUnidad.add(this.jMenuItemGuardarCambiosUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUnidad.add(this.jmenuArchivoUnidad);		
			this.jmenuBarUnidad.add(this.jmenuAccionesUnidad);		
			this.jmenuBarUnidad.add(this.jmenuDatosUnidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUnidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUnidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreUnidad.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreUnidad= new JButtonMe();
		this.jButtonBusquedaPorNombreUnidad.setText("Buscar");
		this.jButtonBusquedaPorNombreUnidad.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreUnidad,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreUnidad = new JLabelMe();
		jLabelnombreBusquedaPorNombreUnidad.setText("Nombre :");
		jLabelnombreBusquedaPorNombreUnidad.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreUnidad= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreUnidad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglasUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglasUnidad.setToolTipText("Buscar Por Siglas ");
		this.jButtonBusquedaPorSiglasUnidad= new JButtonMe();
		this.jButtonBusquedaPorSiglasUnidad.setText("Buscar");
		this.jButtonBusquedaPorSiglasUnidad.setToolTipText("Buscar Por Siglas ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglasUnidad,"buscar_button","Buscar Por Siglas ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglasUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglasBusquedaPorSiglasUnidad = new JLabelMe();
		jLabelsiglasBusquedaPorSiglasUnidad.setText("Siglas :");
		jLabelsiglasBusquedaPorSiglasUnidad.setToolTipText("Siglas");
		jLabelsiglasBusquedaPorSiglasUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglasBusquedaPorSiglasUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglasBusquedaPorSiglasUnidad= new JTextFieldMe();
		jTextFieldsiglasBusquedaPorSiglasUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBusquedaPorSiglasUnidad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoUnidadUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoUnidadUnidad.setToolTipText("Buscar Por Tipo Unidad ");
		this.jButtonFK_IdTipoUnidadUnidad= new JButtonMe();
		this.jButtonFK_IdTipoUnidadUnidad.setText("Buscar");
		this.jButtonFK_IdTipoUnidadUnidad.setToolTipText("Buscar Por Tipo Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoUnidadUnidad,"buscar_button","Buscar Por Tipo Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoUnidadUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_unidadFK_IdTipoUnidadUnidad = new JLabelMe();
		jLabelid_tipo_unidadFK_IdTipoUnidadUnidad.setText("Tipo Unidad :");
		jLabelid_tipo_unidadFK_IdTipoUnidadUnidad.setToolTipText("Tipo Unidad");
		jLabelid_tipo_unidadFK_IdTipoUnidadUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_unidadFK_IdTipoUnidadUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_unidadFK_IdTipoUnidadUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_unidadFK_IdTipoUnidadUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad= new JComboBoxMe();
		jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUnidad=new JTabbedPane();


		this.jTabbedPaneBusquedasUnidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUnidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUnidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUnidad = new UnidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Unidad DATOS");
			this.jInternalFrameDetalleFormUnidad = new UnidadDetalleFormJInternalFrame(jDesktopPane,this.unidadSessionBean.getConGuardarRelaciones(),this.unidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUnidad = null;//new UnidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUnidad= new GridBagLayout();
		
		
		this.jTableDatosUnidad = new JTableMe();      
		
		String sToolTipUnidad="";
		sToolTipUnidad=UnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUnidad+="(Inventario.Unidad)";
		}
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipUnidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUnidad.setToolTipText(sToolTipUnidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUnidad);
		this.jTableDatosUnidad.setAutoCreateRowSorter(true);
		this.jTableDatosUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUnidad.setRowSelectionAllowed(true);
		this.jTableDatosUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUnidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUnidad = new JButtonMe();
		this.jButtonDuplicarUnidad = new JButtonMe();
		this.jButtonCopiarUnidad = new JButtonMe();
		this.jButtonVerFormUnidad = new JButtonMe();
		this.jButtonNuevoRelacionesUnidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUnidad = new JButtonMe();
		this.jButtonCerrarUnidad = new JButtonMe();
		
		this.jScrollPanelDatosUnidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralUnidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Unidad";
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUnidad.setToolTipText("Acciones");
        this.jPanelAccionesUnidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUnidad=new ReporteDinamicoJInternalFrame(UnidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUnidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUnidad=new ImportacionJInternalFrame(UnidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUnidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUnidad = new JButtonMe();
		
		this.jButtonAbrirOrderByUnidad.setText("Orden");
		this.jButtonAbrirOrderByUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUnidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUnidad,false,this);
			
			//this.cargarOrderByUnidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUnidad,true,this);
			
			//this.cargarOrderByUnidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUnidad.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosUnidad.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosUnidad.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosUnidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUnidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUnidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUnidad.setText("Nuevo");
		this.jButtonDuplicarUnidad.setText("Duplicar");
		this.jButtonCopiarUnidad.setText("Copiar");
		this.jButtonVerFormUnidad.setText("Ver");
		this.jButtonNuevoRelacionesUnidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUnidad.setText("Guardar");
		this.jButtonCerrarUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUnidad,"nuevo_button","Nuevo",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUnidad,"duplicar_button","Duplicar",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUnidad,"copiar_button","Copiar",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUnidad,"ver_form","Ver",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUnidad,"nuevorelaciones_button","Nuevo Rel",this.unidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUnidad,"guardarcambiostabla_button","Guardar",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUnidad,"cerrar_button","Salir",this.unidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUnidad.setToolTipText("Nuevo"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUnidad.setToolTipText("Duplicar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUnidad.setToolTipText("Copiar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUnidad.setToolTipText("Ver"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUnidad.setToolTipText("Nuevo Rel"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUnidad.setToolTipText("Guardar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUnidad.setToolTipText("Salir"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUnidad";
		inputMap = this.jButtonNuevoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUnidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarUnidad";
		inputMap = this.jButtonDuplicarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUnidad"));
		
		//COPIAR
		sMapKey = "CopiarUnidad";
		inputMap = this.jButtonCopiarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUnidad"));
		
		//VEr FORM
		sMapKey = "VerFormUnidad";
		inputMap = this.jButtonVerFormUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUnidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUnidad";
		inputMap = this.jButtonNuevoRelacionesUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUnidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUnidad";
		inputMap = this.jButtonModificarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUnidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUnidad";
		inputMap = this.jButtonCerrarUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUnidad";
		inputMap = this.jButtonGuardarCambiosTablaUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUnidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Unidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Unidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Unidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Unidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Unidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUnidad.setName("jPanelParametrosReportesUnidad"); 
		
		this.jPanelParametrosReportesAccionesUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUnidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUnidad.setName("jPanelParametrosReportesAccionesUnidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUnidad = new JButtonMe();
		this.jButtonRecargarInformacionUnidad.setText("Recargar");
		this.jButtonRecargarInformacionUnidad.setToolTipText("Recargar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUnidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUnidad = new JButtonMe();
		this.jButtonProcesarInformacionUnidad.setText("Procesar");
		this.jButtonProcesarInformacionUnidad.setToolTipText("Procesar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUnidad.setVisible(false);
			
		this.jButtonProcesarInformacionUnidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUnidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUnidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUnidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUnidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUnidad.setText("TIPO");       
		this.jComboBoxTiposReportesUnidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUnidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUnidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionUnidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUnidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUnidad.setText("Accion");
		this.jComboBoxTiposRelacionesUnidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUnidad.setText("Accion");
		this.jComboBoxTiposAccionesUnidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUnidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUnidad.setText("Accion");
		this.jComboBoxTiposSeleccionarUnidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUnidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUnidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUnidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUnidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUnidad = new JLabelMe();
		
		this.jLabelAccionesUnidad.setText("Acciones");		
		this.jLabelAccionesUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUnidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUnidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUnidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUnidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUnidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUnidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUnidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUnidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUnidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUnidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteUnidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUnidad = new JButtonMe();
		//this.jButtonAnterioresUnidad.setText("<<");
        this.jButtonAnterioresUnidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUnidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUnidad = new JButtonMe();
		//this.jButtonSiguientesUnidad.setText(">>");
        this.jButtonSiguientesUnidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUnidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUnidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUnidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosUnidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUnidad,"nuevoguardarcambios_button","Nue",this.unidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUnidad";
		inputMap = this.jButtonNuevoGuardarCambiosUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUnidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUnidad";
		inputMap = this.jButtonRecargarInformacionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUnidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUnidad";
		inputMap = this.jButtonSiguientesUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUnidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUnidad";
		inputMap = this.jButtonAnterioresUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUnidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUnidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUnidad.setMinimumSize(new Dimension(this.getWidth(),UnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUnidad.setMaximumSize(new Dimension(this.getWidth(),UnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUnidad.setPreferredSize(new Dimension(this.getWidth(),UnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UnidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUnidad = new GridBagLayout();

			this.jPanelPaginacionUnidad.setLayout(gridaBagLayoutPaginacionUnidad);						
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = 0;
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUnidad.add(this.jButtonAnterioresUnidad, this.gridBagConstraintsUnidad);
					
						
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUnidad.gridy = 0;
			
			this.jPanelPaginacionUnidad.add(this.jButtonNuevoGuardarCambiosUnidad, this.gridBagConstraintsUnidad);
						
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUnidad.gridy = 0;
			this.jPanelPaginacionUnidad.add(this.jButtonSiguientesUnidad, this.gridBagConstraintsUnidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = 1;
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUnidad.add(this.jButtonNuevoUnidad, this.gridBagConstraintsUnidad);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsUnidad = new GridBagConstraints();
				this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUnidad.gridy = 1;
				this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionUnidad.add(this.jButtonNuevoRelacionesUnidad, this.gridBagConstraintsUnidad);
			}
			
			
			if(!this.unidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUnidad = new GridBagConstraints();
				this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUnidad.gridy = 1;
				this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUnidad.add(this.jButtonGuardarCambiosTablaUnidad, this.gridBagConstraintsUnidad);
			}
			
			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = 1;
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUnidad.add(this.jButtonDuplicarUnidad, this.gridBagConstraintsUnidad);
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = 1;
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUnidad.add(this.jButtonCopiarUnidad, this.gridBagConstraintsUnidad);
		
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = 1;
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUnidad.add(this.jButtonVerFormUnidad, this.gridBagConstraintsUnidad);
		
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = 1;
			this.gridBagConstraintsUnidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUnidad.add(this.jButtonCerrarUnidad, this.gridBagConstraintsUnidad);
		
		
		
		this.jButtonRecargarInformacionUnidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUnidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUnidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUnidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUnidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUnidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUnidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUnidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUnidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUnidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUnidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUnidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUnidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUnidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUnidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUnidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUnidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Unidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Unidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Unidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Unidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUnidad.setLayout(gridaBagParametrosReportesUnidad);
			this.jPanelParametrosReportesAccionesUnidad.setLayout(gridaBagParametrosReportesAccionesUnidad);
			
			
			this.jPanelParametrosAuxiliar1Unidad.setLayout(gridaBagParametrosAuxiliar1Unidad);
			this.jPanelParametrosAuxiliar2Unidad.setLayout(gridaBagParametrosAuxiliar2Unidad);
			this.jPanelParametrosAuxiliar3Unidad.setLayout(gridaBagParametrosAuxiliar3Unidad);
			this.jPanelParametrosAuxiliar4Unidad.setLayout(gridaBagParametrosAuxiliar4Unidad);
			//this.jPanelParametrosAuxiliar5Unidad.setLayout(gridaBagParametrosAuxiliar2Unidad);			
			
			
			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUnidad.add(this.jButtonRecargarInformacionUnidad, this.gridBagConstraintsUnidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Unidad.add(this.jComboBoxTiposPaginacionUnidad, this.gridBagConstraintsUnidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Unidad.add(this.jCheckBoxConAltoMaximoTablaUnidad, this.gridBagConstraintsUnidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Unidad.add(this.jComboBoxTiposArchivosReportesUnidad, this.gridBagConstraintsUnidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUnidad.add(this.jPanelParametrosAuxiliar1Unidad, this.gridBagConstraintsUnidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Unidad.add(this.jComboBoxTiposReportesUnidad, this.gridBagConstraintsUnidad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUnidad.add(this.jPanelParametrosAuxiliar4Unidad, this.gridBagConstraintsUnidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUnidad.add(this.jComboBoxTiposReportesUnidad, this.gridBagConstraintsUnidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUnidad.add(this.jCheckBoxGenerarReporteUnidad, this.gridBagConstraintsUnidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUnidad.add(this.jPanelParametrosAuxiliar2Unidad, this.gridBagConstraintsUnidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUnidad.add(this.jLabelAccionesUnidad, this.gridBagConstraintsUnidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUnidad = new GridBagConstraints();
				this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUnidad.add(this.jButtonAbrirOrderByUnidad, this.gridBagConstraintsUnidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUnidad.add(this.jComboBoxTiposSeleccionarUnidad, this.gridBagConstraintsUnidad);			
			
			
			/*
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUnidad.add(this.jCheckBoxSeleccionarTodosUnidad, this.gridBagConstraintsUnidad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Unidad.add(this.jCheckBoxSeleccionarTodosUnidad, this.gridBagConstraintsUnidad);															
				
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Unidad.add(this.jCheckBoxSeleccionadosUnidad, this.gridBagConstraintsUnidad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUnidad.add(this.jPanelParametrosAuxiliar3Unidad, this.gridBagConstraintsUnidad);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUnidad.add(this.jComboBoxTiposRelacionesUnidad, this.gridBagConstraintsUnidad);
				
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUnidad.add(this.jComboBoxTiposAccionesUnidad, this.gridBagConstraintsUnidad);
	
				
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUnidad.add(this.jTextFieldValorCampoGeneralUnidad, this.gridBagConstraintsUnidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUnidad = new GridBagLayout();

			this.jScrollPanelDatosUnidad.setLayout(gridaBagLayoutDatosUnidad);
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = 0;
			this.gridBagConstraintsUnidad.gridx = 0;
			
			this.jScrollPanelDatosUnidad.add(this.jTableDatosUnidad, this.gridBagConstraintsUnidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUnidad.setViewportView(this.jTableDatosUnidad);
		this.jTableDatosUnidad.setFillsViewportHeight(true);
		this.jTableDatosUnidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUnidad= new GridBagLayout();
		this.jPanelAccionesUnidad.setLayout(gridaBagLayoutAccionesUnidad);
		
		
		/*	
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = 0;
		this.gridBagConstraintsUnidad.gridx = 0;
			
		this.jPanelAccionesUnidad.add(this.jButtonNuevoUnidad, this.gridBagConstraintsUnidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreUnidad= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreUnidad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreUnidad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreUnidad.setLayout(gridaBagLayoutBusquedaPorNombreUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 0;
		gridBagConstraintsUnidad.gridx = 0;
		jPanelBusquedaPorNombreUnidad.add(jLabelnombreBusquedaPorNombreUnidad, gridBagConstraintsUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 0;
		gridBagConstraintsUnidad.gridx = 1;
		jPanelBusquedaPorNombreUnidad.add(jTextFieldnombreBusquedaPorNombreUnidad, gridBagConstraintsUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 1;
		gridBagConstraintsUnidad.gridx =1;
		jPanelBusquedaPorNombreUnidad.add(jButtonBusquedaPorNombreUnidad, gridBagConstraintsUnidad);

		jTabbedPaneBusquedasUnidad.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreUnidad);
		jTabbedPaneBusquedasUnidad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorSiglasUnidad= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglasUnidad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasUnidad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglasUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglasUnidad.setLayout(gridaBagLayoutBusquedaPorSiglasUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 0;
		gridBagConstraintsUnidad.gridx = 0;
		jPanelBusquedaPorSiglasUnidad.add(jLabelsiglasBusquedaPorSiglasUnidad, gridBagConstraintsUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 0;
		gridBagConstraintsUnidad.gridx = 1;
		jPanelBusquedaPorSiglasUnidad.add(jTextFieldsiglasBusquedaPorSiglasUnidad, gridBagConstraintsUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 1;
		gridBagConstraintsUnidad.gridx =1;
		jPanelBusquedaPorSiglasUnidad.add(jButtonBusquedaPorSiglasUnidad, gridBagConstraintsUnidad);

		jTabbedPaneBusquedasUnidad.addTab("2.-Por Siglas ", jPanelBusquedaPorSiglasUnidad);
		jTabbedPaneBusquedasUnidad.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoUnidadUnidad= new GridBagLayout();
		gridaBagLayoutFK_IdTipoUnidadUnidad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoUnidadUnidad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoUnidadUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoUnidadUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoUnidadUnidad.setLayout(gridaBagLayoutFK_IdTipoUnidadUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 0;
		gridBagConstraintsUnidad.gridx = 0;
		jPanelFK_IdTipoUnidadUnidad.add(jLabelid_tipo_unidadFK_IdTipoUnidadUnidad, gridBagConstraintsUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 0;
		gridBagConstraintsUnidad.gridx = 1;
		jPanelFK_IdTipoUnidadUnidad.add(jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad, gridBagConstraintsUnidad);

		gridBagConstraintsUnidad = new GridBagConstraints();
		gridBagConstraintsUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUnidad.gridy = 1;
		gridBagConstraintsUnidad.gridx =1;
		jPanelFK_IdTipoUnidadUnidad.add(jButtonFK_IdTipoUnidadUnidad, gridBagConstraintsUnidad);

		jTabbedPaneBusquedasUnidad.addTab("3.-Por Tipo Unidad ", jPanelFK_IdTipoUnidadUnidad);
		jTabbedPaneBusquedasUnidad.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUnidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.unidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUnidad = new GridBagConstraints();						
			this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUnidad.gridx = 0;		
			//this.gridBagConstraintsUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUnidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUnidad, this.gridBagConstraintsUnidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUnidad.gridx = 0;		
		//this.gridBagConstraintsUnidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUnidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUnidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUnidad.gridx = 0;		
			this.gridBagConstraintsUnidad.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUnidad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUnidad, this.gridBagConstraintsUnidad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUnidad, this.gridBagConstraintsUnidad);								
		
		
		/*
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUnidad, this.gridBagConstraintsUnidad);
		*/		
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUnidad.gridx =0;
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUnidad, this.gridBagConstraintsUnidad);
				
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUnidad, this.gridBagConstraintsUnidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(UnidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUnidad = new GridBagLayout();
			this.jPanelBusquedasParametrosUnidad.setLayout(gridaBagLayoutBusquedasParametrosUnidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUnidad, this.gridBagConstraintsUnidad);
			
			
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUnidad, this.gridBagConstraintsUnidad);
		
			
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUnidad, this.gridBagConstraintsUnidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUnidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUnidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUnidad.setName("jPanelReporteDinamicoUnidad"); 
		
		this.jPanelReporteDinamicoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUnidad.setLayout(gridaBagLayoutReporteDinamicoUnidad);
		
		
		this.jInternalFrameReporteDinamicoUnidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUnidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUnidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoUnidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoUnidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Unidades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUnidad = new JLabelMe();

		this.jLabelColumnasSelectReporteUnidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUnidad.add(this.jLabelColumnasSelectReporteUnidad, this.gridBagConstraintsUnidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUnidad = new JList<Reporte>();
		this.jListColumnasSelectReporteUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUnidad=new JScrollPane(this.jListColumnasSelectReporteUnidad);
			
			this.jScrollColumnasSelectReporteUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUnidad.add(this.jListColumnasSelectReporteUnidad, this.gridBagConstraintsUnidad);
		this.jPanelReporteDinamicoUnidad.add(this.jScrollColumnasSelectReporteUnidad, this.gridBagConstraintsUnidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUnidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteUnidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUnidad.add(this.jLabelRelacionesSelectReporteUnidad, this.gridBagConstraintsUnidad);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUnidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUnidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUnidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUnidad=new JScrollPane(this.jListRelacionesSelectReporteUnidad);
			
			this.jScrollRelacionesSelectReporteUnidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUnidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUnidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUnidad.add(this.jListRelacionesSelectReporteUnidad, this.gridBagConstraintsUnidad);
		this.jPanelReporteDinamicoUnidad.add(this.jScrollRelacionesSelectReporteUnidad, this.gridBagConstraintsUnidad);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoUnidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUnidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoUnidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUnidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUnidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUnidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUnidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUnidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUnidad.add(this.jLabelGenerarExcelReporteDinamicoUnidad, this.gridBagConstraintsUnidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUnidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUnidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUnidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUnidad.setToolTipText("Generar EXCEL"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUnidad = new GridBagConstraints();
		//this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUnidad.add(this.jButtonGenerarExcelReporteDinamicoUnidad, this.gridBagConstraintsUnidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUnidad.add(this.jComboBoxTiposReportesDinamicoUnidad, this.gridBagConstraintsUnidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUnidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUnidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUnidad.add(this.jLabelTiposArchivoReporteDinamicoUnidad, this.gridBagConstraintsUnidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUnidad.add(this.jComboBoxTiposArchivosReportesDinamicoUnidad, this.gridBagConstraintsUnidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUnidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUnidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUnidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUnidad.setToolTipText("Generar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUnidad.add(this.jButtonGenerarReporteDinamicoUnidad, this.gridBagConstraintsUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUnidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUnidad.setToolTipText("Cancelar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUnidad.add(this.jButtonCerrarReporteDinamicoUnidad, this.gridBagConstraintsUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUnidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUnidad= new JScrollPane(jPanelReporteDinamicoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Unidades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUnidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUnidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUnidad);
		this.jInternalFrameReporteDinamicoUnidad.getContentPane().add(this.jScrollPanelReporteDinamicoUnidad, this.gridBagConstraintsUnidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUnidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUnidad.setName("jPanelImportacionUnidad"); 
		
		this.jPanelImportacionUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUnidad.setLayout(gridaBagLayoutImportacionUnidad);
		
		
		this.jInternalFrameImportacionUnidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUnidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUnidad.setResizable(true);
	    this.jInternalFrameImportacionUnidad.setClosable(true);
	    this.jInternalFrameImportacionUnidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUnidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUnidad.setResizable(true);
	    this.jInternalFrameImportacionUnidad.setClosable(true);
	    this.jInternalFrameImportacionUnidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Unidades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUnidad = new JLabelMe();

		this.jLabelArchivoImportacionUnidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUnidad.add(this.jLabelArchivoImportacionUnidad, this.gridBagConstraintsUnidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUnidad = new JFileChooser();		
		this.jFileChooserImportacionUnidad.setToolTipText("ESCOGER ARCHIVO"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUnidad = new JButtonMe();
		this.jButtonAbrirImportacionUnidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUnidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUnidad.setToolTipText("Generar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUnidad.add(this.jButtonAbrirImportacionUnidad, this.gridBagConstraintsUnidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUnidad = new JLabelMe();

		this.jLabelPathArchivoImportacionUnidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUnidad.add(this.jLabelPathArchivoImportacionUnidad, this.gridBagConstraintsUnidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUnidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUnidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUnidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUnidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUnidad.add(this.jTextFieldPathArchivoImportacionUnidad, this.gridBagConstraintsUnidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUnidad = new JButtonMe();
		this.jButtonGenerarImportacionUnidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUnidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUnidad.setToolTipText("Generar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUnidad.add(this.jButtonGenerarImportacionUnidad, this.gridBagConstraintsUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUnidad = new JButtonMe();
		this.jButtonCerrarImportacionUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUnidad.setToolTipText("Cancelar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUnidad.add(this.jButtonCerrarImportacionUnidad, this.gridBagConstraintsUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUnidad = new GridBagLayout();
		
		this.jScrollPanelImportacionUnidad= new JScrollPane(jPanelImportacionUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUnidad = new GridBagConstraints();
		this.gridBagConstraintsUnidad.gridy =iPosYImportacion;
		this.gridBagConstraintsUnidad.gridx =iPosXImportacion;
		this.gridBagConstraintsUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUnidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUnidad);
		this.jInternalFrameImportacionUnidad.getContentPane().add(this.jScrollPanelImportacionUnidad, this.gridBagConstraintsUnidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUnidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUnidad = new JButtonMe();
			this.jButtonAbrirOrderByUnidad.setText("Orden");
			this.jButtonAbrirOrderByUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUnidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUnidad";
			inputMap = this.jButtonAbrirOrderByUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUnidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByUnidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUnidad.setName("jPanelOrderByUnidad"); 
			
			this.jPanelOrderByUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUnidad.setLayout(gridaBagLayoutOrderByUnidad);
			
			
			this.jTableDatosUnidadOrderBy = new JTableMe();        
			this.jTableDatosUnidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUnidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUnidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUnidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUnidadOrderBy.setViewportView(this.jTableDatosUnidadOrderBy);
			this.jTableDatosUnidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUnidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUnidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUnidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUnidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUnidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUnidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUnidad.setTitle("Orden");
			this.jInternalFrameOrderByUnidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUnidad.setResizable(true);
			this.jInternalFrameOrderByUnidad.setClosable(true);
			this.jInternalFrameOrderByUnidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Unidades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUnidad.ipady =150;
				
			this.jPanelOrderByUnidad.add(jScrollPanelDatosUnidadOrderBy, this.gridBagConstraintsUnidad);//this.jTableDatosUnidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUnidad = new JButtonMe();
			this.jButtonCerrarOrderByUnidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUnidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUnidad.setToolTipText("Cancelar"+" "+UnidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUnidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUnidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUnidad.add(this.jButtonCerrarOrderByUnidad, this.gridBagConstraintsUnidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUnidad = new GridBagLayout();
			
			this.jScrollPanelOrderByUnidad= new JScrollPane(jPanelOrderByUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUnidad = new GridBagConstraints();
			this.gridBagConstraintsUnidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsUnidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUnidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUnidad);
			
			this.jInternalFrameOrderByUnidad.getContentPane().add(this.jScrollPanelOrderByUnidad, this.gridBagConstraintsUnidad);			
		
		} else {
			this.jButtonAbrirOrderByUnidad = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.unidadSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosUnidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUnidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUnidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUnidad.getRowHeight();//UnidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUnidad.isSelected()) {
					iHeightTable=UnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUnidad.isSelected()) {
					iHeightTable=UnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUnidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUnidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUnidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUnidad!=null && this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy()!=null) {
			//if(!this.unidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUnidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUnidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUnidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=unidadLogic.getUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=unidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Unidad> TraerUnidadBeans(List<Unidad> unidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(Unidad unidad:unidads) {
					
				if(!(UnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					unidad.setsDetalleGeneralEntityReporte(UnidadConstantesFunciones.getUnidadDescripcion(unidad));
										
						
					
					

					if(unidad.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{unidad.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(unidad.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(unidad.getConversionInvenConversions()!=null && Funciones.existeClass(classes,ConversionInven.class)) {
						try{unidad.setconversioninvenConversionsDescripcionReporte(new JRBeanCollectionDataSource(ConversionInvenJInternalFrame.TraerConversionInvenBeans(unidad.getConversionInvenConversions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(unidad.getRangoUnidadVentas()!=null && Funciones.existeClass(classes,RangoUnidadVenta.class)) {
						try{unidad.setrangounidadventasDescripcionReporte(new JRBeanCollectionDataSource(RangoUnidadVentaJInternalFrame.TraerRangoUnidadVentaBeans(unidad.getRangoUnidadVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(unidad.getValorPorUnidads()!=null && Funciones.existeClass(classes,ValorPorUnidad.class)) {
						try{unidad.setvalorporunidadsDescripcionReporte(new JRBeanCollectionDataSource(ValorPorUnidadJInternalFrame.TraerValorPorUnidadBeans(unidad.getValorPorUnidads(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//unidad.setsDetalleGeneralEntityReporte(unidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//unidadbeans.add(unidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return unidads;
    }
	//PARA REPORTES FIN
}
