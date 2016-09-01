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
import com.bydan.erp.inventario.util.TipoUnidadConstantesFunciones;

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
public class TipoUnidadJInternalFrame extends TipoUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoUnidad;
	
	protected JMenuBar jmenuBarTipoUnidad;
	
	protected JMenu jmenuTipoUnidad;
	protected JMenu jmenuDatosTipoUnidad;
	protected JMenu jmenuArchivoTipoUnidad;
	protected JMenu jmenuAccionesTipoUnidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoUnidad;	
	protected GridBagConstraints gridBagConstraintsTipoUnidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoUnidadDetalleFormJInternalFrame jInternalFrameDetalleFormTipoUnidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoUnidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoUnidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoUnidadSessionBean tipounidadSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoUnidad> tipounidads;		
	public List<TipoUnidad> tipounidadsEliminados;	
	public List<TipoUnidad> tipounidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoUnidad;		
	protected JButton jButtonAbrirOrderByTipoUnidad;
	
	
	//protected JPanel jPanelOrderByTipoUnidad;
	//public JScrollPane jScrollPanelOrderByTipoUnidad;	
	//protected JButton jButtonCerrarOrderByTipoUnidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoUnidadLogic tipounidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoUnidad;
	public JScrollPane jScrollPanelDatosEdicionTipoUnidad;
	public JScrollPane jScrollPanelDatosGeneralTipoUnidad;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoUnidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoUnidad;
	//public JScrollPane jScrollPanelImportacionTipoUnidad;
	
	
	
	protected JPanel jPanelAccionesTipoUnidad;
	
    protected JPanel jPanelPaginacionTipoUnidad;
    protected JPanel jPanelParametrosReportesTipoUnidad;
	protected JPanel jPanelParametrosReportesAccionesTipoUnidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoUnidad;
	protected JPanel jPanelParametrosAuxiliar2TipoUnidad;
	protected JPanel jPanelParametrosAuxiliar3TipoUnidad;
	protected JPanel jPanelParametrosAuxiliar4TipoUnidad;
	//protected JPanel jPanelParametrosAuxiliar5TipoUnidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoUnidad;
	//protected JPanel jPanelImportacionTipoUnidad;
	
	
	public JTable jTableDatosTipoUnidad;
	
	
	
	//public JTable jTableDatosTipoUnidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoUnidad;
	protected JButton jButtonDuplicarTipoUnidad;
	protected JButton jButtonCopiarTipoUnidad;
	protected JButton jButtonVerFormTipoUnidad;
	protected JButton jButtonNuevoRelacionesTipoUnidad;
	protected JButton jButtonModificarTipoUnidad;
	
    protected JButton jButtonGuardarCambiosTablaTipoUnidad;
	protected JButton jButtonCerrarTipoUnidad;
	
	
	protected JButton jButtonRecargarInformacionTipoUnidad;
	protected JButton jButtonProcesarInformacionTipoUnidad;
	
	
	protected JButton jButtonAnterioresTipoUnidad;
	protected JButton jButtonSiguientesTipoUnidad;
	protected JButton jButtonNuevoGuardarCambiosTipoUnidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoUnidad;
	//protected JButton jButtonCerrarReporteDinamicoTipoUnidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoUnidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoUnidad;
	//protected JButton jButtonGenerarImportacionTipoUnidad;
	//protected JButton jButtonCerrarImportacionTipoUnidad;
	//protected JFileChooser jFileChooserImportacionTipoUnidad;
	//protected File fileImportacionTipoUnidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoUnidad;
	protected JButton jButtonDuplicarToolBarTipoUnidad;
	protected JButton jButtonNuevoRelacionesToolBarTipoUnidad;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoUnidad;
	protected JButton jButtonCopiarToolBarTipoUnidad;
	protected JButton jButtonVerFormToolBarTipoUnidad;
	public JButton jButtonGuardarCambiosTablaToolBarTipoUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoUnidad;
	protected JButton jButtonCerrarToolBarTipoUnidad;
	
	protected JButton jButtonRecargarInformacionToolBarTipoUnidad;
	protected JButton jButtonProcesarInformacionToolBarTipoUnidad;
	protected JButton jButtonAnterioresToolBarTipoUnidad;
	protected JButton jButtonSiguientesToolBarTipoUnidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoUnidad;
	protected JButton jButtonAbrirOrderByToolBarTipoUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoUnidad;
	protected JMenuItem jMenuItemDuplicarTipoUnidad;
	protected JMenuItem jMenuItemNuevoRelacionesTipoUnidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoUnidad;
	protected JMenuItem jMenuItemCopiarTipoUnidad;
	protected JMenuItem jMenuItemVerFormTipoUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoUnidad;
	protected JMenuItem jMenuItemCerrarTipoUnidad;
	protected JMenuItem jMenuItemDetalleCerrarTipoUnidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoUnidad;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoUnidad;
	protected JMenuItem jMenuItemProcesarInformacionTipoUnidad;
	protected JMenuItem jMenuItemAnterioresTipoUnidad;
	protected JMenuItem jMenuItemSiguientesTipoUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoUnidad;
	protected JMenuItem jMenuItemAbrirOrderByTipoUnidad;
	protected JMenuItem jMenuItemMostrarOcultarTipoUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoUnidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoUnidad;
	protected JCheckBox jCheckBoxSeleccionadosTipoUnidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoUnidad;
	protected JCheckBox jCheckBoxConGraficoReporteTipoUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoUnidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoUnidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoUnidad;
	protected JTextField jTextFieldValorCampoGeneralTipoUnidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoUnidad;
	//public JList<Reporte> jListColumnasSelectReporteTipoUnidad;
	//public JScrollPane jScrollColumnasSelectReporteTipoUnidad;
	
	//public JLabel jLabelRelacionesSelectReporteTipoUnidad;
	//public JList<Reporte> jListRelacionesSelectReporteTipoUnidad;
	//public JScrollPane jScrollRelacionesSelectReporteTipoUnidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoUnidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoUnidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoUnidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoUnidad;
	
		
	//public JLabel jLabelArchivoImportacionTipoUnidad;	
	//public JLabel jLabelPathArchivoImportacionTipoUnidad;
	//protected JTextField jTextFieldPathArchivoImportacionTipoUnidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoUnidad;
	
	//public JLabel jLabelColumnaCategoriaValorTipoUnidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoUnidad;
	
	//public JLabel jLabelColumnasValoresGraficoTipoUnidad;
	//public JList<Reporte> jListColumnasValoresGraficoTipoUnidad;
	//public JScrollPane jScrollColumnasValoresGraficoTipoUnidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoUnidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoUnidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoUnidad;
	public JPanel jPanelBusquedaPorNombreTipoUnidad;
	public JButton jButtonBusquedaPorNombreTipoUnidad;
	public JPanel jPanelBusquedaPorSiglasTipoUnidad;
	public JButton jButtonBusquedaPorSiglasTipoUnidad;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoUnidad;
	public JLabel jLabelnombreBusquedaPorNombreTipoUnidad;
	public JTextField jTextFieldnombreBusquedaPorNombreTipoUnidad;
	public JButton jButtonnombreBusquedaPorNombreTipoUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglasBusquedaPorSiglasTipoUnidad;
	public JLabel jLabelsiglasBusquedaPorSiglasTipoUnidad;
	public JTextField jTextFieldsiglasBusquedaPorSiglasTipoUnidad;
	public JButton jButtonsiglasBusquedaPorSiglasTipoUnidadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoUnidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUnidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUnidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUnidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoUnidad)	{
		this.jButtonRecargarInformacionTipoUnidad = jButtonRecargarInformacionTipoUnidad;
	}
	
	public JButton getjButtonProcesarInformacionTipoUnidad() {
		return this.jButtonProcesarInformacionTipoUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoUnidad)	{
		this.jButtonProcesarInformacionTipoUnidad = jButtonProcesarInformacionTipoUnidad;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoUnidad() {
		return this.jButtonRecargarInformacionTipoUnidad;
	}
	
	
	public List<TipoUnidad> gettipounidads() {
		return this.tipounidads;
	}

	public void settipounidads(List<TipoUnidad> tipounidads) {
		this.tipounidads = tipounidads;
	}
	
	public List<TipoUnidad> gettipounidadsAux() {
		return this.tipounidadsAux;
	}

	public void settipounidadsAux(List<TipoUnidad> tipounidadsAux) {
		this.tipounidadsAux = tipounidadsAux;
	}
	
	public List<TipoUnidad> gettipounidadsEliminados() {
		return this.tipounidadsEliminados;
	}

	public void setTipoUnidadsEliminados(List<TipoUnidad> tipounidadsEliminados) {
		this.tipounidadsEliminados = tipounidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoUnidad() {
		return jComboBoxTiposSeleccionarTipoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoUnidad(
			JComboBox jComboBoxTiposSeleccionarTipoUnidad) {
		this.jComboBoxTiposSeleccionarTipoUnidad = jComboBoxTiposSeleccionarTipoUnidad;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoUnidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoUnidad() {
		return jTextFieldValorCampoGeneralTipoUnidad;
	}

	public void setjTextFieldValorCampoGeneralTipoUnidad(
			JTextField jTextFieldValorCampoGeneralTipoUnidad) {
		this.jTextFieldValorCampoGeneralTipoUnidad = jTextFieldValorCampoGeneralTipoUnidad;
	}

	public void setBorderResaltarValorCampoGeneralTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoUnidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoUnidad() {
		return this.jCheckBoxSeleccionarTodosTipoUnidad;
	}

	public void setjCheckBoxSeleccionarTodosTipoUnidad(
			JCheckBox jCheckBoxSeleccionarTodosTipoUnidad) {
		this.jCheckBoxSeleccionarTodosTipoUnidad = jCheckBoxSeleccionarTodosTipoUnidad;
	}

	public void setBorderResaltarSeleccionarTodosTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoUnidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoUnidad() {
		return this.jCheckBoxSeleccionadosTipoUnidad;
	}

	public void setjCheckBoxSeleccionadosTipoUnidad(
			JCheckBox jCheckBoxSeleccionadosTipoUnidad) {
		this.jCheckBoxSeleccionadosTipoUnidad = jCheckBoxSeleccionadosTipoUnidad;
	}
	
	public void setBorderResaltarSeleccionadosTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoUnidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoUnidad() {
		return this.jComboBoxTiposArchivosReportesTipoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoUnidad(
			JComboBox jComboBoxTiposArchivosReportesTipoUnidad) {
		this.jComboBoxTiposArchivosReportesTipoUnidad = jComboBoxTiposArchivosReportesTipoUnidad;
	}

	public void setBorderResaltarTiposArchivosReportesTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoUnidad() {
		return this.jComboBoxTiposReportesTipoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoUnidad(
			JComboBox jComboBoxTiposReportesTipoUnidad) {
		this.jComboBoxTiposReportesTipoUnidad = jComboBoxTiposReportesTipoUnidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoUnidad() {
	//	return jComboBoxTiposReportesDinamicoTipoUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoUnidad(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoUnidad) {
	//	this.jComboBoxTiposReportesDinamicoTipoUnidad = jComboBoxTiposReportesDinamicoTipoUnidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoUnidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoUnidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoUnidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoUnidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad = jComboBoxTiposArchivosReportesDinamicoTipoUnidad;
	//}
	
	public void setBorderResaltarTiposReportesTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoUnidad() {
		return this.jComboBoxTiposGraficosReportesTipoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoUnidad(
			JComboBox jComboBoxTiposGraficosReportesTipoUnidad) {
		this.jComboBoxTiposGraficosReportesTipoUnidad = jComboBoxTiposGraficosReportesTipoUnidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoUnidad() {
		return this.jComboBoxTiposPaginacionTipoUnidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoUnidad(
			JComboBox jComboBoxTiposPaginacionTipoUnidad) {
		this.jComboBoxTiposPaginacionTipoUnidad = jComboBoxTiposPaginacionTipoUnidad;
	}
	
	public void setBorderResaltarTiposPaginacionTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoUnidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoUnidad() {
		return this.jComboBoxTiposRelacionesTipoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoUnidad() {
		return this.jComboBoxTiposAccionesTipoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoUnidad(
			JComboBox jComboBoxTiposRelacionesTipoUnidad) {
		this.jComboBoxTiposRelacionesTipoUnidad = jComboBoxTiposRelacionesTipoUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoUnidad(
			JComboBox jComboBoxTiposAccionesTipoUnidad) {
		this.jComboBoxTiposAccionesTipoUnidad = jComboBoxTiposAccionesTipoUnidad;
	}
	
	public void setBorderResaltarTiposRelacionesTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoUnidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoUnidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoUnidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoUnidad() {
	//	return jCheckBoxConGraficoDinamicoTipoUnidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoUnidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoUnidad) {
	//	this.jCheckBoxConGraficoDinamicoTipoUnidad = jCheckBoxConGraficoDinamicoTipoUnidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoUnidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoUnidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoUnidad .setBorder(borderResaltar);		
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
		this.tipounidadSessionBean=new TipoUnidadSessionBean();
		
		this.tipounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipounidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoUnidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"nuevo","nuevo","Nuevo"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"duplicar","duplicar","Duplicar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"copiar","copiar","Copiar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"ver_form","ver_form","Ver"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"recargar","recargar","Recargar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoUnidad,this.jTtoolBarTipoUnidad,
							"cerrar","cerrar","Salir"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoUnidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoUnidad;
			
				this.jButtonProcesarInformacionToolBarTipoUnidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoUnidad;
				
		//protected JButton jButtonModificarToolBarTipoUnidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoUnidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoUnidad=new JMenuMe("General");
		this.jmenuArchivoTipoUnidad=new JMenuMe("Archivo");
		this.jmenuAccionesTipoUnidad=new JMenuMe("Acciones");
		this.jmenuDatosTipoUnidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoUnidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoUnidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoUnidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoUnidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoUnidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoUnidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoUnidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoUnidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoUnidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoUnidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoUnidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoUnidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoUnidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoUnidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoUnidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoUnidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoUnidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoUnidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoUnidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoUnidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoUnidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoUnidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoUnidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoUnidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoUnidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoUnidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoUnidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoUnidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoUnidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoUnidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoUnidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoUnidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoUnidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoUnidad.add(this.jMenuItemCerrarTipoUnidad);
			
			this.jmenuAccionesTipoUnidad.add(this.jMenuItemNuevoTipoUnidad);
			this.jmenuAccionesTipoUnidad.add(this.jMenuItemNuevoGuardarCambiosTipoUnidad);
			this.jmenuAccionesTipoUnidad.add(this.jMenuItemNuevoRelacionesTipoUnidad);
			this.jmenuAccionesTipoUnidad.add(this.jMenuItemGuardarCambiosTablaTipoUnidad);		
			this.jmenuAccionesTipoUnidad.add(this.jMenuItemDuplicarTipoUnidad);		
			this.jmenuAccionesTipoUnidad.add(this.jMenuItemCopiarTipoUnidad);		
			this.jmenuAccionesTipoUnidad.add(this.jMenuItemVerFormTipoUnidad);		
			
			this.jmenuDatosTipoUnidad.add(this.jMenuItemRecargarInformacionTipoUnidad);				
			this.jmenuDatosTipoUnidad.add(this.jMenuItemAnterioresTipoUnidad);				
			this.jmenuDatosTipoUnidad.add(this.jMenuItemSiguientesTipoUnidad);				
			this.jmenuDatosTipoUnidad.add(this.jMenuItemAbrirOrderByTipoUnidad);				
			this.jmenuDatosTipoUnidad.add(this.jMenuItemMostrarOcultarTipoUnidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoUnidad.add(this.jMenuItemGuardarCambiosTipoUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoUnidad.add(this.jmenuArchivoTipoUnidad);		
			this.jmenuBarTipoUnidad.add(this.jmenuAccionesTipoUnidad);		
			this.jmenuBarTipoUnidad.add(this.jmenuDatosTipoUnidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoUnidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoUnidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoUnidad.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoUnidad= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoUnidad.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoUnidad.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoUnidad,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoUnidad = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoUnidad.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoUnidad.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreTipoUnidad= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreTipoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglasTipoUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglasTipoUnidad.setToolTipText("Buscar Por Siglas ");
		this.jButtonBusquedaPorSiglasTipoUnidad= new JButtonMe();
		this.jButtonBusquedaPorSiglasTipoUnidad.setText("Buscar");
		this.jButtonBusquedaPorSiglasTipoUnidad.setToolTipText("Buscar Por Siglas ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglasTipoUnidad,"buscar_button","Buscar Por Siglas ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglasTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglasBusquedaPorSiglasTipoUnidad = new JLabelMe();
		jLabelsiglasBusquedaPorSiglasTipoUnidad.setText("Siglas :");
		jLabelsiglasBusquedaPorSiglasTipoUnidad.setToolTipText("Siglas");
		jLabelsiglasBusquedaPorSiglasTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglasBusquedaPorSiglasTipoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglasBusquedaPorSiglasTipoUnidad= new JTextFieldMe();
		jTextFieldsiglasBusquedaPorSiglasTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBusquedaPorSiglasTipoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoUnidad=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoUnidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoUnidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoUnidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoUnidad = new TipoUnidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Unidad DATOS");
			this.jInternalFrameDetalleFormTipoUnidad = new TipoUnidadDetalleFormJInternalFrame(jDesktopPane,this.tipounidadSessionBean.getConGuardarRelaciones(),this.tipounidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoUnidad = null;//new TipoUnidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoUnidad= new GridBagLayout();
		
		
		this.jTableDatosTipoUnidad = new JTableMe();      
		
		String sToolTipTipoUnidad="";
		sToolTipTipoUnidad=TipoUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoUnidad+="(Inventario.TipoUnidad)";
		}
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoUnidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoUnidad.setToolTipText(sToolTipTipoUnidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoUnidad);
		this.jTableDatosTipoUnidad.setAutoCreateRowSorter(true);
		this.jTableDatosTipoUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoUnidad.setRowSelectionAllowed(true);
		this.jTableDatosTipoUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoUnidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoUnidad = new JButtonMe();
		this.jButtonDuplicarTipoUnidad = new JButtonMe();
		this.jButtonCopiarTipoUnidad = new JButtonMe();
		this.jButtonVerFormTipoUnidad = new JButtonMe();
		this.jButtonNuevoRelacionesTipoUnidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoUnidad = new JButtonMe();
		this.jButtonCerrarTipoUnidad = new JButtonMe();
		
		this.jScrollPanelDatosTipoUnidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoUnidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Unidad";
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoUnidad.setToolTipText("Acciones");
        this.jPanelAccionesTipoUnidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoUnidad=new ReporteDinamicoJInternalFrame(TipoUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoUnidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoUnidad=new ImportacionJInternalFrame(TipoUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoUnidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoUnidad = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoUnidad.setText("Orden");
		this.jButtonAbrirOrderByTipoUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoUnidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUnidad,false,this);
			
			//this.cargarOrderByTipoUnidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUnidad,true,this);
			
			//this.cargarOrderByTipoUnidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoUnidad.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoUnidad.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoUnidad.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoUnidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoUnidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoUnidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoUnidad.setText("Nuevo");
		this.jButtonDuplicarTipoUnidad.setText("Duplicar");
		this.jButtonCopiarTipoUnidad.setText("Copiar");
		this.jButtonVerFormTipoUnidad.setText("Ver");
		this.jButtonNuevoRelacionesTipoUnidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoUnidad.setText("Guardar");
		this.jButtonCerrarTipoUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoUnidad,"nuevo_button","Nuevo",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoUnidad,"duplicar_button","Duplicar",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoUnidad,"copiar_button","Copiar",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoUnidad,"ver_form","Ver",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoUnidad,"nuevorelaciones_button","Nuevo Rel",this.tipounidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoUnidad,"guardarcambiostabla_button","Guardar",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoUnidad,"cerrar_button","Salir",this.tipounidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoUnidad.setToolTipText("Nuevo"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoUnidad.setToolTipText("Duplicar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoUnidad.setToolTipText("Copiar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoUnidad.setToolTipText("Ver"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoUnidad.setToolTipText("Nuevo Rel"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoUnidad.setToolTipText("Guardar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoUnidad.setToolTipText("Salir"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoUnidad";
		inputMap = this.jButtonNuevoTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoUnidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoUnidad";
		inputMap = this.jButtonDuplicarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoUnidad"));
		
		//COPIAR
		sMapKey = "CopiarTipoUnidad";
		inputMap = this.jButtonCopiarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoUnidad"));
		
		//VEr FORM
		sMapKey = "VerFormTipoUnidad";
		inputMap = this.jButtonVerFormTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoUnidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoUnidad";
		inputMap = this.jButtonNuevoRelacionesTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoUnidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoUnidad";
		inputMap = this.jButtonModificarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoUnidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoUnidad";
		inputMap = this.jButtonCerrarTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoUnidad";
		inputMap = this.jButtonGuardarCambiosTablaTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoUnidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoUnidad.setName("jPanelParametrosReportesTipoUnidad"); 
		
		this.jPanelParametrosReportesAccionesTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoUnidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoUnidad.setName("jPanelParametrosReportesAccionesTipoUnidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoUnidad = new JButtonMe();
		this.jButtonRecargarInformacionTipoUnidad.setText("Recargar");
		this.jButtonRecargarInformacionTipoUnidad.setToolTipText("Recargar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoUnidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoUnidad = new JButtonMe();
		this.jButtonProcesarInformacionTipoUnidad.setText("Procesar");
		this.jButtonProcesarInformacionTipoUnidad.setToolTipText("Procesar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoUnidad.setVisible(false);
			
		this.jButtonProcesarInformacionTipoUnidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoUnidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoUnidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoUnidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoUnidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoUnidad.setText("TIPO");       
		this.jComboBoxTiposReportesTipoUnidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoUnidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoUnidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoUnidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoUnidad.setText("Accion");
		this.jComboBoxTiposRelacionesTipoUnidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoUnidad.setText("Accion");
		this.jComboBoxTiposAccionesTipoUnidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoUnidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoUnidad.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoUnidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoUnidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoUnidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoUnidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoUnidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoUnidad = new JLabelMe();
		
		this.jLabelAccionesTipoUnidad.setText("Acciones");		
		this.jLabelAccionesTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoUnidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoUnidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoUnidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoUnidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoUnidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoUnidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoUnidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoUnidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoUnidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoUnidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoUnidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoUnidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoUnidad = new JButtonMe();
		//this.jButtonAnterioresTipoUnidad.setText("<<");
        this.jButtonAnterioresTipoUnidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoUnidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoUnidad = new JButtonMe();
		//this.jButtonSiguientesTipoUnidad.setText(">>");
        this.jButtonSiguientesTipoUnidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoUnidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoUnidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoUnidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoUnidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoUnidad,"nuevoguardarcambios_button","Nue",this.tipounidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoUnidad";
		inputMap = this.jButtonNuevoGuardarCambiosTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoUnidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoUnidad";
		inputMap = this.jButtonRecargarInformacionTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoUnidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoUnidad";
		inputMap = this.jButtonSiguientesTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoUnidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoUnidad";
		inputMap = this.jButtonAnterioresTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoUnidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoUnidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoUnidad.setMinimumSize(new Dimension(this.getWidth(),TipoUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoUnidad.setMaximumSize(new Dimension(this.getWidth(),TipoUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoUnidad.setPreferredSize(new Dimension(this.getWidth(),TipoUnidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoUnidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoUnidad = new GridBagLayout();

			this.jPanelPaginacionTipoUnidad.setLayout(gridaBagLayoutPaginacionTipoUnidad);						
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = 0;
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoUnidad.add(this.jButtonAnterioresTipoUnidad, this.gridBagConstraintsTipoUnidad);
					
						
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoUnidad.gridy = 0;
			
			this.jPanelPaginacionTipoUnidad.add(this.jButtonNuevoGuardarCambiosTipoUnidad, this.gridBagConstraintsTipoUnidad);
						
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoUnidad.gridy = 0;
			this.jPanelPaginacionTipoUnidad.add(this.jButtonSiguientesTipoUnidad, this.gridBagConstraintsTipoUnidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = 1;
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUnidad.add(this.jButtonNuevoTipoUnidad, this.gridBagConstraintsTipoUnidad);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
				this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoUnidad.gridy = 1;
				this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoUnidad.add(this.jButtonNuevoRelacionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
			}
			
			
			if(!this.tipounidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
				this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoUnidad.gridy = 1;
				this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoUnidad.add(this.jButtonGuardarCambiosTablaTipoUnidad, this.gridBagConstraintsTipoUnidad);
			}
			
			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = 1;
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUnidad.add(this.jButtonDuplicarTipoUnidad, this.gridBagConstraintsTipoUnidad);
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = 1;
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUnidad.add(this.jButtonCopiarTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = 1;
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUnidad.add(this.jButtonVerFormTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = 1;
			this.gridBagConstraintsTipoUnidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoUnidad.add(this.jButtonCerrarTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
		
		
		this.jButtonRecargarInformacionTipoUnidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoUnidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoUnidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoUnidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoUnidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoUnidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoUnidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoUnidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoUnidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoUnidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoUnidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoUnidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoUnidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoUnidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoUnidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoUnidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoUnidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoUnidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoUnidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoUnidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoUnidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoUnidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoUnidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoUnidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoUnidad.setLayout(gridaBagParametrosReportesTipoUnidad);
			this.jPanelParametrosReportesAccionesTipoUnidad.setLayout(gridaBagParametrosReportesAccionesTipoUnidad);
			
			
			this.jPanelParametrosAuxiliar1TipoUnidad.setLayout(gridaBagParametrosAuxiliar1TipoUnidad);
			this.jPanelParametrosAuxiliar2TipoUnidad.setLayout(gridaBagParametrosAuxiliar2TipoUnidad);
			this.jPanelParametrosAuxiliar3TipoUnidad.setLayout(gridaBagParametrosAuxiliar3TipoUnidad);
			this.jPanelParametrosAuxiliar4TipoUnidad.setLayout(gridaBagParametrosAuxiliar4TipoUnidad);
			//this.jPanelParametrosAuxiliar5TipoUnidad.setLayout(gridaBagParametrosAuxiliar2TipoUnidad);			
			
			
			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUnidad.add(this.jButtonRecargarInformacionTipoUnidad, this.gridBagConstraintsTipoUnidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoUnidad.add(this.jComboBoxTiposPaginacionTipoUnidad, this.gridBagConstraintsTipoUnidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoUnidad.add(this.jCheckBoxConAltoMaximoTablaTipoUnidad, this.gridBagConstraintsTipoUnidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoUnidad.add(this.jComboBoxTiposArchivosReportesTipoUnidad, this.gridBagConstraintsTipoUnidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUnidad.add(this.jPanelParametrosAuxiliar1TipoUnidad, this.gridBagConstraintsTipoUnidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoUnidad.add(this.jComboBoxTiposReportesTipoUnidad, this.gridBagConstraintsTipoUnidad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUnidad.add(this.jPanelParametrosAuxiliar4TipoUnidad, this.gridBagConstraintsTipoUnidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUnidad.add(this.jComboBoxTiposReportesTipoUnidad, this.gridBagConstraintsTipoUnidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoUnidad.add(this.jCheckBoxGenerarReporteTipoUnidad, this.gridBagConstraintsTipoUnidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUnidad.add(this.jPanelParametrosAuxiliar2TipoUnidad, this.gridBagConstraintsTipoUnidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoUnidad.add(this.jLabelAccionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
				this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoUnidad.add(this.jButtonAbrirOrderByTipoUnidad, this.gridBagConstraintsTipoUnidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUnidad.add(this.jComboBoxTiposSeleccionarTipoUnidad, this.gridBagConstraintsTipoUnidad);			
			
			
			/*
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoUnidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoUnidad.add(this.jCheckBoxSeleccionarTodosTipoUnidad, this.gridBagConstraintsTipoUnidad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoUnidad.add(this.jCheckBoxSeleccionarTodosTipoUnidad, this.gridBagConstraintsTipoUnidad);															
				
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoUnidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoUnidad.add(this.jCheckBoxSeleccionadosTipoUnidad, this.gridBagConstraintsTipoUnidad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUnidad.add(this.jPanelParametrosAuxiliar3TipoUnidad, this.gridBagConstraintsTipoUnidad);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUnidad.add(this.jComboBoxTiposRelacionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
				
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUnidad.add(this.jComboBoxTiposAccionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
	
				
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUnidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUnidad.add(this.jTextFieldValorCampoGeneralTipoUnidad, this.gridBagConstraintsTipoUnidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoUnidad = new GridBagLayout();

			this.jScrollPanelDatosTipoUnidad.setLayout(gridaBagLayoutDatosTipoUnidad);
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = 0;
			this.gridBagConstraintsTipoUnidad.gridx = 0;
			
			this.jScrollPanelDatosTipoUnidad.add(this.jTableDatosTipoUnidad, this.gridBagConstraintsTipoUnidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoUnidad.setViewportView(this.jTableDatosTipoUnidad);
		this.jTableDatosTipoUnidad.setFillsViewportHeight(true);
		this.jTableDatosTipoUnidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoUnidad= new GridBagLayout();
		this.jPanelAccionesTipoUnidad.setLayout(gridaBagLayoutAccionesTipoUnidad);
		
		
		/*	
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = 0;
		this.gridBagConstraintsTipoUnidad.gridx = 0;
			
		this.jPanelAccionesTipoUnidad.add(this.jButtonNuevoTipoUnidad, this.gridBagConstraintsTipoUnidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoUnidad= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoUnidad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoUnidad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoUnidad.setLayout(gridaBagLayoutBusquedaPorNombreTipoUnidad);

		gridBagConstraintsTipoUnidad = new GridBagConstraints();
		gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoUnidad.gridy = 0;
		gridBagConstraintsTipoUnidad.gridx = 0;
		jPanelBusquedaPorNombreTipoUnidad.add(jLabelnombreBusquedaPorNombreTipoUnidad, gridBagConstraintsTipoUnidad);

		gridBagConstraintsTipoUnidad = new GridBagConstraints();
		gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoUnidad.gridy = 0;
		gridBagConstraintsTipoUnidad.gridx = 1;
		jPanelBusquedaPorNombreTipoUnidad.add(jTextFieldnombreBusquedaPorNombreTipoUnidad, gridBagConstraintsTipoUnidad);

		gridBagConstraintsTipoUnidad = new GridBagConstraints();
		gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoUnidad.gridy = 1;
		gridBagConstraintsTipoUnidad.gridx =1;
		jPanelBusquedaPorNombreTipoUnidad.add(jButtonBusquedaPorNombreTipoUnidad, gridBagConstraintsTipoUnidad);

		jTabbedPaneBusquedasTipoUnidad.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoUnidad);
		jTabbedPaneBusquedasTipoUnidad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorSiglasTipoUnidad= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglasTipoUnidad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTipoUnidad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTipoUnidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglasTipoUnidad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglasTipoUnidad.setLayout(gridaBagLayoutBusquedaPorSiglasTipoUnidad);

		gridBagConstraintsTipoUnidad = new GridBagConstraints();
		gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoUnidad.gridy = 0;
		gridBagConstraintsTipoUnidad.gridx = 0;
		jPanelBusquedaPorSiglasTipoUnidad.add(jLabelsiglasBusquedaPorSiglasTipoUnidad, gridBagConstraintsTipoUnidad);

		gridBagConstraintsTipoUnidad = new GridBagConstraints();
		gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoUnidad.gridy = 0;
		gridBagConstraintsTipoUnidad.gridx = 1;
		jPanelBusquedaPorSiglasTipoUnidad.add(jTextFieldsiglasBusquedaPorSiglasTipoUnidad, gridBagConstraintsTipoUnidad);

		gridBagConstraintsTipoUnidad = new GridBagConstraints();
		gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoUnidad.gridy = 1;
		gridBagConstraintsTipoUnidad.gridx =1;
		jPanelBusquedaPorSiglasTipoUnidad.add(jButtonBusquedaPorSiglasTipoUnidad, gridBagConstraintsTipoUnidad);

		jTabbedPaneBusquedasTipoUnidad.addTab("2.-Por Siglas ", jPanelBusquedaPorSiglasTipoUnidad);
		jTabbedPaneBusquedasTipoUnidad.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoUnidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipounidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();						
			this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoUnidad.gridx = 0;		
			//this.gridBagConstraintsTipoUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoUnidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoUnidad, this.gridBagConstraintsTipoUnidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoUnidad.gridx = 0;		
		//this.gridBagConstraintsTipoUnidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoUnidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoUnidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoUnidad.gridx = 0;		
			this.gridBagConstraintsTipoUnidad.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoUnidad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoUnidad, this.gridBagConstraintsTipoUnidad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoUnidad, this.gridBagConstraintsTipoUnidad);								
		
		
		/*
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
		*/		
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoUnidad.gridx =0;
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoUnidad, this.gridBagConstraintsTipoUnidad);
				
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoUnidad, this.gridBagConstraintsTipoUnidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoUnidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoUnidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoUnidad = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoUnidad.setLayout(gridaBagLayoutBusquedasParametrosTipoUnidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoUnidad, this.gridBagConstraintsTipoUnidad);
			
			
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
			
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoUnidad, this.gridBagConstraintsTipoUnidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoUnidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoUnidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoUnidad.setName("jPanelReporteDinamicoTipoUnidad"); 
		
		this.jPanelReporteDinamicoTipoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoUnidad.setLayout(gridaBagLayoutReporteDinamicoTipoUnidad);
		
		
		this.jInternalFrameReporteDinamicoTipoUnidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoUnidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoUnidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoUnidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoUnidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Unidades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoUnidad = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoUnidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoUnidad.add(this.jLabelColumnasSelectReporteTipoUnidad, this.gridBagConstraintsTipoUnidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoUnidad = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoUnidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoUnidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoUnidad=new JScrollPane(this.jListColumnasSelectReporteTipoUnidad);
			
			this.jScrollColumnasSelectReporteTipoUnidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoUnidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoUnidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoUnidad.add(this.jListColumnasSelectReporteTipoUnidad, this.gridBagConstraintsTipoUnidad);
		this.jPanelReporteDinamicoTipoUnidad.add(this.jScrollColumnasSelectReporteTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoUnidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoUnidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoUnidad.add(this.jLabelRelacionesSelectReporteTipoUnidad, this.gridBagConstraintsTipoUnidad);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoUnidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoUnidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoUnidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoUnidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoUnidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoUnidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoUnidad=new JScrollPane(this.jListRelacionesSelectReporteTipoUnidad);
			
			this.jScrollRelacionesSelectReporteTipoUnidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoUnidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoUnidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoUnidad.add(this.jListRelacionesSelectReporteTipoUnidad, this.gridBagConstraintsTipoUnidad);
		this.jPanelReporteDinamicoTipoUnidad.add(this.jScrollRelacionesSelectReporteTipoUnidad, this.gridBagConstraintsTipoUnidad);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoUnidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoUnidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoUnidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoUnidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoUnidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoUnidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoUnidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoUnidad.add(this.jLabelGenerarExcelReporteDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoUnidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoUnidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoUnidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoUnidad.setToolTipText("Generar EXCEL"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoUnidad.add(this.jButtonGenerarExcelReporteDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUnidad.add(this.jComboBoxTiposReportesDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoUnidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoUnidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoUnidad.add(this.jLabelTiposArchivoReporteDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUnidad.add(this.jComboBoxTiposArchivosReportesDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoUnidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoUnidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoUnidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoUnidad.setToolTipText("Generar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUnidad.add(this.jButtonGenerarReporteDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoUnidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoUnidad.setToolTipText("Cancelar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUnidad.add(this.jButtonCerrarReporteDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoUnidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoUnidad= new JScrollPane(jPanelReporteDinamicoTipoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoUnidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoUnidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoUnidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Unidades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoUnidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoUnidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoUnidad);
		this.jInternalFrameReporteDinamicoTipoUnidad.getContentPane().add(this.jScrollPanelReporteDinamicoTipoUnidad, this.gridBagConstraintsTipoUnidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoUnidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoUnidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoUnidad.setName("jPanelImportacionTipoUnidad"); 
		
		this.jPanelImportacionTipoUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoUnidad.setLayout(gridaBagLayoutImportacionTipoUnidad);
		
		
		this.jInternalFrameImportacionTipoUnidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoUnidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoUnidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoUnidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoUnidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoUnidad.setResizable(true);
	    this.jInternalFrameImportacionTipoUnidad.setClosable(true);
	    this.jInternalFrameImportacionTipoUnidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoUnidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoUnidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoUnidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoUnidad.setResizable(true);
	    this.jInternalFrameImportacionTipoUnidad.setClosable(true);
	    this.jInternalFrameImportacionTipoUnidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoUnidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoUnidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoUnidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Unidades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoUnidad = new JLabelMe();

		this.jLabelArchivoImportacionTipoUnidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoUnidad.add(this.jLabelArchivoImportacionTipoUnidad, this.gridBagConstraintsTipoUnidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoUnidad = new JFileChooser();		
		this.jFileChooserImportacionTipoUnidad.setToolTipText("ESCOGER ARCHIVO"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoUnidad = new JButtonMe();
		this.jButtonAbrirImportacionTipoUnidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoUnidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoUnidad.setToolTipText("Generar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUnidad.add(this.jButtonAbrirImportacionTipoUnidad, this.gridBagConstraintsTipoUnidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoUnidad = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoUnidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoUnidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoUnidad.add(this.jLabelPathArchivoImportacionTipoUnidad, this.gridBagConstraintsTipoUnidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoUnidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoUnidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoUnidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoUnidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUnidad.add(this.jTextFieldPathArchivoImportacionTipoUnidad, this.gridBagConstraintsTipoUnidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoUnidad = new JButtonMe();
		this.jButtonGenerarImportacionTipoUnidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoUnidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoUnidad.setToolTipText("Generar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUnidad.add(this.jButtonGenerarImportacionTipoUnidad, this.gridBagConstraintsTipoUnidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoUnidad = new JButtonMe();
		this.jButtonCerrarImportacionTipoUnidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoUnidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoUnidad.setToolTipText("Cancelar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUnidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUnidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUnidad.add(this.jButtonCerrarImportacionTipoUnidad, this.gridBagConstraintsTipoUnidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoUnidad = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoUnidad= new JScrollPane(jPanelImportacionTipoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
		this.gridBagConstraintsTipoUnidad.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoUnidad.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoUnidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoUnidad);
		this.jInternalFrameImportacionTipoUnidad.getContentPane().add(this.jScrollPanelImportacionTipoUnidad, this.gridBagConstraintsTipoUnidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoUnidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoUnidad = new JButtonMe();
			this.jButtonAbrirOrderByTipoUnidad.setText("Orden");
			this.jButtonAbrirOrderByTipoUnidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoUnidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoUnidad";
			inputMap = this.jButtonAbrirOrderByTipoUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoUnidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoUnidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoUnidad.setName("jPanelOrderByTipoUnidad"); 
			
			this.jPanelOrderByTipoUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoUnidad.setLayout(gridaBagLayoutOrderByTipoUnidad);
			
			
			this.jTableDatosTipoUnidadOrderBy = new JTableMe();        
			this.jTableDatosTipoUnidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoUnidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoUnidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoUnidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoUnidadOrderBy.setViewportView(this.jTableDatosTipoUnidadOrderBy);
			this.jTableDatosTipoUnidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoUnidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoUnidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoUnidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoUnidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoUnidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoUnidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoUnidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoUnidad.setTitle("Orden");
			this.jInternalFrameOrderByTipoUnidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoUnidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoUnidad.setResizable(true);
			this.jInternalFrameOrderByTipoUnidad.setClosable(true);
			this.jInternalFrameOrderByTipoUnidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoUnidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoUnidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoUnidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Unidades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoUnidad.ipady =150;
				
			this.jPanelOrderByTipoUnidad.add(jScrollPanelDatosTipoUnidadOrderBy, this.gridBagConstraintsTipoUnidad);//this.jTableDatosTipoUnidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoUnidad = new JButtonMe();
			this.jButtonCerrarOrderByTipoUnidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoUnidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoUnidad.setToolTipText("Cancelar"+" "+TipoUnidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUnidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoUnidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoUnidad.add(this.jButtonCerrarOrderByTipoUnidad, this.gridBagConstraintsTipoUnidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoUnidad = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoUnidad= new JScrollPane(jPanelOrderByTipoUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoUnidad = new GridBagConstraints();
			this.gridBagConstraintsTipoUnidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoUnidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoUnidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoUnidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoUnidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoUnidad);
			
			this.jInternalFrameOrderByTipoUnidad.getContentPane().add(this.jScrollPanelOrderByTipoUnidad, this.gridBagConstraintsTipoUnidad);			
		
		} else {
			this.jButtonAbrirOrderByTipoUnidad = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipounidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoUnidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoUnidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoUnidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoUnidad.getRowHeight();//TipoUnidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoUnidad.isSelected()) {
					iHeightTable=TipoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoUnidad.isSelected()) {
					iHeightTable=TipoUnidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoUnidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoUnidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoUnidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoUnidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoUnidad!=null && this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy()!=null) {
			//if(!this.tipounidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoUnidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoUnidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoUnidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoUnidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoUnidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoUnidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoUnidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipounidadLogic.getTipoUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipounidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoUnidad> TraerTipoUnidadBeans(List<TipoUnidad> tipounidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoUnidad tipounidad:tipounidads) {
					
				if(!(TipoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipounidad.setsDetalleGeneralEntityReporte(TipoUnidadConstantesFunciones.getTipoUnidadDescripcion(tipounidad));
										
						
					
					

					if(tipounidad.getUnidads()!=null && Funciones.existeClass(classes,Unidad.class)) {
						try{tipounidad.setunidadsDescripcionReporte(new JRBeanCollectionDataSource(UnidadJInternalFrame.TraerUnidadBeans(tipounidad.getUnidads(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipounidad.setsDetalleGeneralEntityReporte(tipounidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipounidadbeans.add(tipounidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipounidads;
    }
	//PARA REPORTES FIN
}
