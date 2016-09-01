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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.inventario.util.TipoCosteoDefinicionConstantesFunciones;

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
public class TipoCosteoDefinicionJInternalFrame extends TipoCosteoDefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCosteoDefinicion;
	
	protected JMenuBar jmenuBarTipoCosteoDefinicion;
	
	protected JMenu jmenuTipoCosteoDefinicion;
	protected JMenu jmenuDatosTipoCosteoDefinicion;
	protected JMenu jmenuArchivoTipoCosteoDefinicion;
	protected JMenu jmenuAccionesTipoCosteoDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCosteoDefinicion;	
	protected GridBagConstraints gridBagConstraintsTipoCosteoDefinicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCosteoDefinicionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCosteoDefinicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCosteoDefinicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCosteoDefinicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCosteoDefinicionSessionBean tipocosteodefinicionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCosteoDefinicion> tipocosteodefinicions;		
	public List<TipoCosteoDefinicion> tipocosteodefinicionsEliminados;	
	public List<TipoCosteoDefinicion> tipocosteodefinicionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCosteoDefinicion;		
	protected JButton jButtonAbrirOrderByTipoCosteoDefinicion;
	
	
	//protected JPanel jPanelOrderByTipoCosteoDefinicion;
	//public JScrollPane jScrollPanelOrderByTipoCosteoDefinicion;	
	//protected JButton jButtonCerrarOrderByTipoCosteoDefinicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCosteoDefinicionLogic tipocosteodefinicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCosteoDefinicion;
	public JScrollPane jScrollPanelDatosEdicionTipoCosteoDefinicion;
	public JScrollPane jScrollPanelDatosGeneralTipoCosteoDefinicion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCosteoDefinicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCosteoDefinicion;
	//public JScrollPane jScrollPanelImportacionTipoCosteoDefinicion;
	
	
	
	protected JPanel jPanelAccionesTipoCosteoDefinicion;
	
    protected JPanel jPanelPaginacionTipoCosteoDefinicion;
    protected JPanel jPanelParametrosReportesTipoCosteoDefinicion;
	protected JPanel jPanelParametrosReportesAccionesTipoCosteoDefinicion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCosteoDefinicion;
	protected JPanel jPanelParametrosAuxiliar2TipoCosteoDefinicion;
	protected JPanel jPanelParametrosAuxiliar3TipoCosteoDefinicion;
	protected JPanel jPanelParametrosAuxiliar4TipoCosteoDefinicion;
	//protected JPanel jPanelParametrosAuxiliar5TipoCosteoDefinicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCosteoDefinicion;
	//protected JPanel jPanelImportacionTipoCosteoDefinicion;
	
	
	public JTable jTableDatosTipoCosteoDefinicion;
	
	
	
	//public JTable jTableDatosTipoCosteoDefinicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCosteoDefinicion;
	protected JButton jButtonDuplicarTipoCosteoDefinicion;
	protected JButton jButtonCopiarTipoCosteoDefinicion;
	protected JButton jButtonVerFormTipoCosteoDefinicion;
	protected JButton jButtonNuevoRelacionesTipoCosteoDefinicion;
	protected JButton jButtonModificarTipoCosteoDefinicion;
	
    protected JButton jButtonGuardarCambiosTablaTipoCosteoDefinicion;
	protected JButton jButtonCerrarTipoCosteoDefinicion;
	
	
	protected JButton jButtonRecargarInformacionTipoCosteoDefinicion;
	protected JButton jButtonProcesarInformacionTipoCosteoDefinicion;
	
	
	protected JButton jButtonAnterioresTipoCosteoDefinicion;
	protected JButton jButtonSiguientesTipoCosteoDefinicion;
	protected JButton jButtonNuevoGuardarCambiosTipoCosteoDefinicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCosteoDefinicion;
	//protected JButton jButtonCerrarReporteDinamicoTipoCosteoDefinicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCosteoDefinicion;
	//protected JButton jButtonGenerarImportacionTipoCosteoDefinicion;
	//protected JButton jButtonCerrarImportacionTipoCosteoDefinicion;
	//protected JFileChooser jFileChooserImportacionTipoCosteoDefinicion;
	//protected File fileImportacionTipoCosteoDefinicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCosteoDefinicion;
	protected JButton jButtonDuplicarToolBarTipoCosteoDefinicion;
	protected JButton jButtonNuevoRelacionesToolBarTipoCosteoDefinicion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCosteoDefinicion;
	protected JButton jButtonCopiarToolBarTipoCosteoDefinicion;
	protected JButton jButtonVerFormToolBarTipoCosteoDefinicion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCosteoDefinicion;
	protected JButton jButtonCerrarToolBarTipoCosteoDefinicion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCosteoDefinicion;
	protected JButton jButtonProcesarInformacionToolBarTipoCosteoDefinicion;
	protected JButton jButtonAnterioresToolBarTipoCosteoDefinicion;
	protected JButton jButtonSiguientesToolBarTipoCosteoDefinicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCosteoDefinicion;
	protected JButton jButtonAbrirOrderByToolBarTipoCosteoDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCosteoDefinicion;
	protected JMenuItem jMenuItemDuplicarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCosteoDefinicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCosteoDefinicion;
	protected JMenuItem jMenuItemCopiarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemVerFormTipoCosteoDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCosteoDefinicion;
	protected JMenuItem jMenuItemCerrarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoCosteoDefinicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCosteoDefinicion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCosteoDefinicion;
	protected JMenuItem jMenuItemProcesarInformacionTipoCosteoDefinicion;
	protected JMenuItem jMenuItemAnterioresTipoCosteoDefinicion;
	protected JMenuItem jMenuItemSiguientesTipoCosteoDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion;
	protected JMenuItem jMenuItemAbrirOrderByTipoCosteoDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoCosteoDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCosteoDefinicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCosteoDefinicion;
	protected JCheckBox jCheckBoxSeleccionadosTipoCosteoDefinicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCosteoDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCosteoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCosteoDefinicion;
	protected JTextField jTextFieldValorCampoGeneralTipoCosteoDefinicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCosteoDefinicion;
	//public JList<Reporte> jListColumnasSelectReporteTipoCosteoDefinicion;
	//public JScrollPane jScrollColumnasSelectReporteTipoCosteoDefinicion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCosteoDefinicion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCosteoDefinicion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCosteoDefinicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCosteoDefinicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCosteoDefinicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCosteoDefinicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCosteoDefinicion;
	
		
	//public JLabel jLabelArchivoImportacionTipoCosteoDefinicion;	
	//public JLabel jLabelPathArchivoImportacionTipoCosteoDefinicion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCosteoDefinicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCosteoDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCosteoDefinicion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCosteoDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCosteoDefinicion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCosteoDefinicion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCosteoDefinicion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCosteoDefinicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCosteoDefinicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCosteoDefinicion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoCosteoDefinicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDefinicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDefinicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoDefinicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCosteoDefinicion)	{
		this.jButtonRecargarInformacionTipoCosteoDefinicion = jButtonRecargarInformacionTipoCosteoDefinicion;
	}
	
	public JButton getjButtonProcesarInformacionTipoCosteoDefinicion() {
		return this.jButtonProcesarInformacionTipoCosteoDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCosteoDefinicion)	{
		this.jButtonProcesarInformacionTipoCosteoDefinicion = jButtonProcesarInformacionTipoCosteoDefinicion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCosteoDefinicion() {
		return this.jButtonRecargarInformacionTipoCosteoDefinicion;
	}
	
	
	public List<TipoCosteoDefinicion> gettipocosteodefinicions() {
		return this.tipocosteodefinicions;
	}

	public void settipocosteodefinicions(List<TipoCosteoDefinicion> tipocosteodefinicions) {
		this.tipocosteodefinicions = tipocosteodefinicions;
	}
	
	public List<TipoCosteoDefinicion> gettipocosteodefinicionsAux() {
		return this.tipocosteodefinicionsAux;
	}

	public void settipocosteodefinicionsAux(List<TipoCosteoDefinicion> tipocosteodefinicionsAux) {
		this.tipocosteodefinicionsAux = tipocosteodefinicionsAux;
	}
	
	public List<TipoCosteoDefinicion> gettipocosteodefinicionsEliminados() {
		return this.tipocosteodefinicionsEliminados;
	}

	public void setTipoCosteoDefinicionsEliminados(List<TipoCosteoDefinicion> tipocosteodefinicionsEliminados) {
		this.tipocosteodefinicionsEliminados = tipocosteodefinicionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCosteoDefinicion() {
		return jComboBoxTiposSeleccionarTipoCosteoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCosteoDefinicion(
			JComboBox jComboBoxTiposSeleccionarTipoCosteoDefinicion) {
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion = jComboBoxTiposSeleccionarTipoCosteoDefinicion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCosteoDefinicion() {
		return jTextFieldValorCampoGeneralTipoCosteoDefinicion;
	}

	public void setjTextFieldValorCampoGeneralTipoCosteoDefinicion(
			JTextField jTextFieldValorCampoGeneralTipoCosteoDefinicion) {
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion = jTextFieldValorCampoGeneralTipoCosteoDefinicion;
	}

	public void setBorderResaltarValorCampoGeneralTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCosteoDefinicion() {
		return this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion;
	}

	public void setjCheckBoxSeleccionarTodosTipoCosteoDefinicion(
			JCheckBox jCheckBoxSeleccionarTodosTipoCosteoDefinicion) {
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion = jCheckBoxSeleccionarTodosTipoCosteoDefinicion;
	}

	public void setBorderResaltarSeleccionarTodosTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCosteoDefinicion() {
		return this.jCheckBoxSeleccionadosTipoCosteoDefinicion;
	}

	public void setjCheckBoxSeleccionadosTipoCosteoDefinicion(
			JCheckBox jCheckBoxSeleccionadosTipoCosteoDefinicion) {
		this.jCheckBoxSeleccionadosTipoCosteoDefinicion = jCheckBoxSeleccionadosTipoCosteoDefinicion;
	}
	
	public void setBorderResaltarSeleccionadosTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCosteoDefinicion() {
		return this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCosteoDefinicion(
			JComboBox jComboBoxTiposArchivosReportesTipoCosteoDefinicion) {
		this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion = jComboBoxTiposArchivosReportesTipoCosteoDefinicion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCosteoDefinicion() {
		return this.jComboBoxTiposReportesTipoCosteoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCosteoDefinicion(
			JComboBox jComboBoxTiposReportesTipoCosteoDefinicion) {
		this.jComboBoxTiposReportesTipoCosteoDefinicion = jComboBoxTiposReportesTipoCosteoDefinicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCosteoDefinicion() {
	//	return jComboBoxTiposReportesDinamicoTipoCosteoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCosteoDefinicion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCosteoDefinicion) {
	//	this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion = jComboBoxTiposReportesDinamicoTipoCosteoDefinicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion = jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion;
	//}
	
	public void setBorderResaltarTiposReportesTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCosteoDefinicion() {
		return this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCosteoDefinicion(
			JComboBox jComboBoxTiposGraficosReportesTipoCosteoDefinicion) {
		this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion = jComboBoxTiposGraficosReportesTipoCosteoDefinicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCosteoDefinicion() {
		return this.jComboBoxTiposPaginacionTipoCosteoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCosteoDefinicion(
			JComboBox jComboBoxTiposPaginacionTipoCosteoDefinicion) {
		this.jComboBoxTiposPaginacionTipoCosteoDefinicion = jComboBoxTiposPaginacionTipoCosteoDefinicion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCosteoDefinicion() {
		return this.jComboBoxTiposRelacionesTipoCosteoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCosteoDefinicion() {
		return this.jComboBoxTiposAccionesTipoCosteoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCosteoDefinicion(
			JComboBox jComboBoxTiposRelacionesTipoCosteoDefinicion) {
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion = jComboBoxTiposRelacionesTipoCosteoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCosteoDefinicion(
			JComboBox jComboBoxTiposAccionesTipoCosteoDefinicion) {
		this.jComboBoxTiposAccionesTipoCosteoDefinicion = jComboBoxTiposAccionesTipoCosteoDefinicion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCosteoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCosteoDefinicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCosteoDefinicion() {
	//	return jCheckBoxConGraficoDinamicoTipoCosteoDefinicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCosteoDefinicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCosteoDefinicion) {
	//	this.jCheckBoxConGraficoDinamicoTipoCosteoDefinicion = jCheckBoxConGraficoDinamicoTipoCosteoDefinicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCosteoDefinicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCosteoDefinicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCosteoDefinicion .setBorder(borderResaltar);		
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
		this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
		
		this.tipocosteodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocosteodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCosteoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCosteoDefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costeo Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCosteoDefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCosteoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCosteoDefinicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"nuevo","nuevo","Nuevo"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"duplicar","duplicar","Duplicar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"copiar","copiar","Copiar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"ver_form","ver_form","Ver"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"recargar","recargar","Recargar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCosteoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,
							"cerrar","cerrar","Salir"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCosteoDefinicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCosteoDefinicion;
			
				this.jButtonProcesarInformacionToolBarTipoCosteoDefinicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCosteoDefinicion;
				
		//protected JButton jButtonModificarToolBarTipoCosteoDefinicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCosteoDefinicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCosteoDefinicion=new JMenuMe("General");
		this.jmenuArchivoTipoCosteoDefinicion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCosteoDefinicion=new JMenuMe("Acciones");
		this.jmenuDatosTipoCosteoDefinicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCosteoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCosteoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCosteoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCosteoDefinicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCosteoDefinicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCosteoDefinicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCosteoDefinicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCosteoDefinicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCosteoDefinicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCosteoDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCosteoDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCosteoDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCosteoDefinicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCosteoDefinicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCosteoDefinicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCosteoDefinicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCosteoDefinicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCosteoDefinicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCosteoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCosteoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCosteoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCosteoDefinicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCosteoDefinicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCosteoDefinicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCosteoDefinicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCosteoDefinicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCosteoDefinicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCosteoDefinicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCosteoDefinicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCosteoDefinicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCosteoDefinicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCosteoDefinicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCosteoDefinicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCosteoDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCosteoDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCosteoDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCosteoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCosteoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCosteoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCosteoDefinicion.add(this.jMenuItemCerrarTipoCosteoDefinicion);
			
			this.jmenuAccionesTipoCosteoDefinicion.add(this.jMenuItemNuevoTipoCosteoDefinicion);
			this.jmenuAccionesTipoCosteoDefinicion.add(this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion);
			this.jmenuAccionesTipoCosteoDefinicion.add(this.jMenuItemNuevoRelacionesTipoCosteoDefinicion);
			this.jmenuAccionesTipoCosteoDefinicion.add(this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion);		
			this.jmenuAccionesTipoCosteoDefinicion.add(this.jMenuItemDuplicarTipoCosteoDefinicion);		
			this.jmenuAccionesTipoCosteoDefinicion.add(this.jMenuItemCopiarTipoCosteoDefinicion);		
			this.jmenuAccionesTipoCosteoDefinicion.add(this.jMenuItemVerFormTipoCosteoDefinicion);		
			
			this.jmenuDatosTipoCosteoDefinicion.add(this.jMenuItemRecargarInformacionTipoCosteoDefinicion);				
			this.jmenuDatosTipoCosteoDefinicion.add(this.jMenuItemAnterioresTipoCosteoDefinicion);				
			this.jmenuDatosTipoCosteoDefinicion.add(this.jMenuItemSiguientesTipoCosteoDefinicion);				
			this.jmenuDatosTipoCosteoDefinicion.add(this.jMenuItemAbrirOrderByTipoCosteoDefinicion);				
			this.jmenuDatosTipoCosteoDefinicion.add(this.jMenuItemMostrarOcultarTipoCosteoDefinicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCosteoDefinicion.add(this.jMenuItemGuardarCambiosTipoCosteoDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCosteoDefinicion.add(this.jmenuArchivoTipoCosteoDefinicion);		
			this.jmenuBarTipoCosteoDefinicion.add(this.jmenuAccionesTipoCosteoDefinicion);		
			this.jmenuBarTipoCosteoDefinicion.add(this.jmenuDatosTipoCosteoDefinicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCosteoDefinicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCosteoDefinicion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoCosteoDefinicion = new TipoCosteoDefinicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Costeo Definicion DATOS");
			this.jInternalFrameDetalleFormTipoCosteoDefinicion = new TipoCosteoDefinicionDetalleFormJInternalFrame(jDesktopPane,this.tipocosteodefinicionSessionBean.getConGuardarRelaciones(),this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion = null;//new TipoCosteoDefinicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCosteoDefinicion= new GridBagLayout();
		
		
		this.jTableDatosTipoCosteoDefinicion = new JTableMe();      
		
		String sToolTipTipoCosteoDefinicion="";
		sToolTipTipoCosteoDefinicion=TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCosteoDefinicion+="(Inventario.TipoCosteoDefinicion)";
		}
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCosteoDefinicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCosteoDefinicion.setToolTipText(sToolTipTipoCosteoDefinicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCosteoDefinicion);
		this.jTableDatosTipoCosteoDefinicion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCosteoDefinicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCosteoDefinicion.setRowSelectionAllowed(true);
		this.jTableDatosTipoCosteoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCosteoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCosteoDefinicion = new JButtonMe();
		this.jButtonDuplicarTipoCosteoDefinicion = new JButtonMe();
		this.jButtonCopiarTipoCosteoDefinicion = new JButtonMe();
		this.jButtonVerFormTipoCosteoDefinicion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCosteoDefinicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion = new JButtonMe();
		this.jButtonCerrarTipoCosteoDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoCosteoDefinicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCosteoDefinicion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costeo Definicion";
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeo Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCosteoDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCosteoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoCosteoDefinicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCosteoDefinicion=new ReporteDinamicoJInternalFrame(TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCosteoDefinicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCosteoDefinicion=new ImportacionJInternalFrame(TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCosteoDefinicion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCosteoDefinicion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCosteoDefinicion.setText("Orden");
		this.jButtonAbrirOrderByTipoCosteoDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCosteoDefinicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCosteoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteoDefinicion,false,this);
			
			//this.cargarOrderByTipoCosteoDefinicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCosteoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteoDefinicion,true,this);
			
			//this.cargarOrderByTipoCosteoDefinicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCosteoDefinicion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCosteoDefinicion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCosteoDefinicion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCosteoDefinicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCosteoDefinicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCosteoDefinicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCosteoDefinicion.setText("Nuevo");
		this.jButtonDuplicarTipoCosteoDefinicion.setText("Duplicar");
		this.jButtonCopiarTipoCosteoDefinicion.setText("Copiar");
		this.jButtonVerFormTipoCosteoDefinicion.setText("Ver");
		this.jButtonNuevoRelacionesTipoCosteoDefinicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.setText("Guardar");
		this.jButtonCerrarTipoCosteoDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCosteoDefinicion,"nuevo_button","Nuevo",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCosteoDefinicion,"duplicar_button","Duplicar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCosteoDefinicion,"copiar_button","Copiar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCosteoDefinicion,"ver_form","Ver",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCosteoDefinicion,"nuevorelaciones_button","Nuevo Rel",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCosteoDefinicion,"guardarcambiostabla_button","Guardar",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCosteoDefinicion,"cerrar_button","Salir",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCosteoDefinicion.setToolTipText("Nuevo"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCosteoDefinicion.setToolTipText("Duplicar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCosteoDefinicion.setToolTipText("Copiar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCosteoDefinicion.setToolTipText("Ver"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCosteoDefinicion.setToolTipText("Nuevo Rel"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.setToolTipText("Guardar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCosteoDefinicion.setToolTipText("Salir"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCosteoDefinicion";
		inputMap = this.jButtonNuevoTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCosteoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCosteoDefinicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCosteoDefinicion";
		inputMap = this.jButtonDuplicarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCosteoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCosteoDefinicion"));
		
		//COPIAR
		sMapKey = "CopiarTipoCosteoDefinicion";
		inputMap = this.jButtonCopiarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCosteoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCosteoDefinicion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCosteoDefinicion";
		inputMap = this.jButtonVerFormTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCosteoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCosteoDefinicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCosteoDefinicion";
		inputMap = this.jButtonNuevoRelacionesTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCosteoDefinicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCosteoDefinicion";
		inputMap = this.jButtonModificarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCosteoDefinicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCosteoDefinicion";
		inputMap = this.jButtonCerrarTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCosteoDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCosteoDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCosteoDefinicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCosteoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCosteoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCosteoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCosteoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCosteoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCosteoDefinicion.setName("jPanelParametrosReportesTipoCosteoDefinicion"); 
		
		this.jPanelParametrosReportesAccionesTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCosteoDefinicion.setName("jPanelParametrosReportesAccionesTipoCosteoDefinicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCosteoDefinicion = new JButtonMe();
		this.jButtonRecargarInformacionTipoCosteoDefinicion.setText("Recargar");
		this.jButtonRecargarInformacionTipoCosteoDefinicion.setToolTipText("Recargar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCosteoDefinicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCosteoDefinicion = new JButtonMe();
		this.jButtonProcesarInformacionTipoCosteoDefinicion.setText("Procesar");
		this.jButtonProcesarInformacionTipoCosteoDefinicion.setToolTipText("Procesar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCosteoDefinicion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCosteoDefinicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCosteoDefinicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCosteoDefinicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCosteoDefinicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCosteoDefinicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCosteoDefinicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCosteoDefinicion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCosteoDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCosteoDefinicion = new JLabelMe();
		
		this.jLabelAccionesTipoCosteoDefinicion.setText("Acciones");		
		this.jLabelAccionesTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCosteoDefinicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCosteoDefinicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCosteoDefinicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCosteoDefinicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCosteoDefinicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCosteoDefinicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCosteoDefinicion = new JButtonMe();
		//this.jButtonAnterioresTipoCosteoDefinicion.setText("<<");
        this.jButtonAnterioresTipoCosteoDefinicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCosteoDefinicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCosteoDefinicion = new JButtonMe();
		//this.jButtonSiguientesTipoCosteoDefinicion.setText(">>");
        this.jButtonSiguientesTipoCosteoDefinicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCosteoDefinicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion,"nuevoguardarcambios_button","Nue",this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCosteoDefinicion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCosteoDefinicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCosteoDefinicion";
		inputMap = this.jButtonRecargarInformacionTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCosteoDefinicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCosteoDefinicion";
		inputMap = this.jButtonSiguientesTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCosteoDefinicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCosteoDefinicion";
		inputMap = this.jButtonAnterioresTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCosteoDefinicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCosteoDefinicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCosteoDefinicion.setMinimumSize(new Dimension(this.getWidth(),TipoCosteoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCosteoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCosteoDefinicion.setMaximumSize(new Dimension(this.getWidth(),TipoCosteoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCosteoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCosteoDefinicion.setPreferredSize(new Dimension(this.getWidth(),TipoCosteoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCosteoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCosteoDefinicion = new GridBagLayout();

			this.jPanelPaginacionTipoCosteoDefinicion.setLayout(gridaBagLayoutPaginacionTipoCosteoDefinicion);						
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonAnterioresTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
					
						
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
			
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
						
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonSiguientesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonNuevoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCosteoDefinicion.gridy = 1;
				this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonNuevoRelacionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			}
			
			
			if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCosteoDefinicion.gridy = 1;
				this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonGuardarCambiosTablaTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			}
			
			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonDuplicarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonCopiarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonVerFormTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCosteoDefinicion.add(this.jButtonCerrarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
		
		
		this.jButtonRecargarInformacionTipoCosteoDefinicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCosteoDefinicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCosteoDefinicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCosteoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCosteoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCosteoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCosteoDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCosteoDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCosteoDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCosteoDefinicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCosteoDefinicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCosteoDefinicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCosteoDefinicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCosteoDefinicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCosteoDefinicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCosteoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCosteoDefinicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCosteoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCosteoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCosteoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCosteoDefinicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCosteoDefinicion.setLayout(gridaBagParametrosReportesTipoCosteoDefinicion);
			this.jPanelParametrosReportesAccionesTipoCosteoDefinicion.setLayout(gridaBagParametrosReportesAccionesTipoCosteoDefinicion);
			
			
			this.jPanelParametrosAuxiliar1TipoCosteoDefinicion.setLayout(gridaBagParametrosAuxiliar1TipoCosteoDefinicion);
			this.jPanelParametrosAuxiliar2TipoCosteoDefinicion.setLayout(gridaBagParametrosAuxiliar2TipoCosteoDefinicion);
			this.jPanelParametrosAuxiliar3TipoCosteoDefinicion.setLayout(gridaBagParametrosAuxiliar3TipoCosteoDefinicion);
			this.jPanelParametrosAuxiliar4TipoCosteoDefinicion.setLayout(gridaBagParametrosAuxiliar4TipoCosteoDefinicion);
			//this.jPanelParametrosAuxiliar5TipoCosteoDefinicion.setLayout(gridaBagParametrosAuxiliar2TipoCosteoDefinicion);			
			
			
			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jButtonRecargarInformacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosteoDefinicion.add(this.jComboBoxTiposPaginacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosteoDefinicion.add(this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosteoDefinicion.add(this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jPanelParametrosAuxiliar1TipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCosteoDefinicion.add(this.jComboBoxTiposReportesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jPanelParametrosAuxiliar4TipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jComboBoxTiposReportesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jCheckBoxGenerarReporteTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jPanelParametrosAuxiliar2TipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jLabelAccionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jButtonAbrirOrderByTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jComboBoxTiposSeleccionarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
			
			
			/*
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCosteoDefinicion.add(this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);															
				
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCosteoDefinicion.add(this.jCheckBoxSeleccionadosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jPanelParametrosAuxiliar3TipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jComboBoxTiposRelacionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
				
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteoDefinicion.add(this.jComboBoxTiposAccionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCosteoDefinicion = new GridBagLayout();

			this.jScrollPanelDatosTipoCosteoDefinicion.setLayout(gridaBagLayoutDatosTipoCosteoDefinicion);
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
			
			this.jScrollPanelDatosTipoCosteoDefinicion.add(this.jTableDatosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCosteoDefinicion.setViewportView(this.jTableDatosTipoCosteoDefinicion);
		this.jTableDatosTipoCosteoDefinicion.setFillsViewportHeight(true);
		this.jTableDatosTipoCosteoDefinicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCosteoDefinicion= new GridBagLayout();
		this.jPanelAccionesTipoCosteoDefinicion.setLayout(gridaBagLayoutAccionesTipoCosteoDefinicion);
		
		
		/*	
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
			
		this.jPanelAccionesTipoCosteoDefinicion.add(this.jButtonNuevoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCosteoDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCosteoDefinicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;		
			//this.gridBagConstraintsTipoCosteoDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;		
		//this.gridBagConstraintsTipoCosteoDefinicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCosteoDefinicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCosteoDefinicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);								
		
		
		/*
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		*/		
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =0;
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCosteoDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
				
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCosteoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCosteoDefinicion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCosteoDefinicion.setLayout(gridaBagLayoutBusquedasParametrosTipoCosteoDefinicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
			
			
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
			
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCosteoDefinicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCosteoDefinicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCosteoDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCosteoDefinicion.setName("jPanelReporteDinamicoTipoCosteoDefinicion"); 
		
		this.jPanelReporteDinamicoTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCosteoDefinicion.setLayout(gridaBagLayoutReporteDinamicoTipoCosteoDefinicion);
		
		
		this.jInternalFrameReporteDinamicoTipoCosteoDefinicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCosteoDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCosteoDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeo Definiciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCosteoDefinicion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCosteoDefinicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jLabelColumnasSelectReporteTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCosteoDefinicion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCosteoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCosteoDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCosteoDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCosteoDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCosteoDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCosteoDefinicion=new JScrollPane(this.jListColumnasSelectReporteTipoCosteoDefinicion);
			
			this.jScrollColumnasSelectReporteTipoCosteoDefinicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCosteoDefinicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCosteoDefinicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jListColumnasSelectReporteTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jScrollColumnasSelectReporteTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCosteoDefinicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCosteoDefinicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jLabelRelacionesSelectReporteTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCosteoDefinicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCosteoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCosteoDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCosteoDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCosteoDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCosteoDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCosteoDefinicion=new JScrollPane(this.jListRelacionesSelectReporteTipoCosteoDefinicion);
			
			this.jScrollRelacionesSelectReporteTipoCosteoDefinicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCosteoDefinicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCosteoDefinicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jListRelacionesSelectReporteTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jScrollRelacionesSelectReporteTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCosteoDefinicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCosteoDefinicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCosteoDefinicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCosteoDefinicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCosteoDefinicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jLabelGenerarExcelReporteDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion.setToolTipText("Generar EXCEL"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jComboBoxTiposReportesDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCosteoDefinicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCosteoDefinicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jLabelTiposArchivoReporteDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCosteoDefinicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCosteoDefinicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCosteoDefinicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCosteoDefinicion.setToolTipText("Generar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jButtonGenerarReporteDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCosteoDefinicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCosteoDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCosteoDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCosteoDefinicion.setToolTipText("Cancelar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteoDefinicion.add(this.jButtonCerrarReporteDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCosteoDefinicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCosteoDefinicion= new JScrollPane(jPanelReporteDinamicoTipoCosteoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeo Definiciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCosteoDefinicion);
		this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCosteoDefinicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCosteoDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCosteoDefinicion.setName("jPanelImportacionTipoCosteoDefinicion"); 
		
		this.jPanelImportacionTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCosteoDefinicion.setLayout(gridaBagLayoutImportacionTipoCosteoDefinicion);
		
		
		this.jInternalFrameImportacionTipoCosteoDefinicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCosteoDefinicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCosteoDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCosteoDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCosteoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCosteoDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCosteoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setResizable(true);
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setClosable(true);
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCosteoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCosteoDefinicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCosteoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setResizable(true);
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setClosable(true);
	    this.jInternalFrameImportacionTipoCosteoDefinicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeo Definiciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCosteoDefinicion = new JLabelMe();

		this.jLabelArchivoImportacionTipoCosteoDefinicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCosteoDefinicion.add(this.jLabelArchivoImportacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCosteoDefinicion = new JFileChooser();		
		this.jFileChooserImportacionTipoCosteoDefinicion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCosteoDefinicion = new JButtonMe();
		this.jButtonAbrirImportacionTipoCosteoDefinicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCosteoDefinicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCosteoDefinicion.setToolTipText("Generar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteoDefinicion.add(this.jButtonAbrirImportacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCosteoDefinicion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCosteoDefinicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCosteoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCosteoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCosteoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCosteoDefinicion.add(this.jLabelPathArchivoImportacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCosteoDefinicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCosteoDefinicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCosteoDefinicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCosteoDefinicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteoDefinicion.add(this.jTextFieldPathArchivoImportacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCosteoDefinicion = new JButtonMe();
		this.jButtonGenerarImportacionTipoCosteoDefinicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCosteoDefinicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCosteoDefinicion.setToolTipText("Generar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteoDefinicion.add(this.jButtonGenerarImportacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCosteoDefinicion = new JButtonMe();
		this.jButtonCerrarImportacionTipoCosteoDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCosteoDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCosteoDefinicion.setToolTipText("Cancelar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteoDefinicion.add(this.jButtonCerrarImportacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCosteoDefinicion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCosteoDefinicion= new JScrollPane(jPanelImportacionTipoCosteoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteoDefinicion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCosteoDefinicion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCosteoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCosteoDefinicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCosteoDefinicion);
		this.jInternalFrameImportacionTipoCosteoDefinicion.getContentPane().add(this.jScrollPanelImportacionTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCosteoDefinicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCosteoDefinicion = new JButtonMe();
			this.jButtonAbrirOrderByTipoCosteoDefinicion.setText("Orden");
			this.jButtonAbrirOrderByTipoCosteoDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCosteoDefinicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCosteoDefinicion";
			inputMap = this.jButtonAbrirOrderByTipoCosteoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCosteoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCosteoDefinicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCosteoDefinicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCosteoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCosteoDefinicion.setName("jPanelOrderByTipoCosteoDefinicion"); 
			
			this.jPanelOrderByTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCosteoDefinicion.setLayout(gridaBagLayoutOrderByTipoCosteoDefinicion);
			
			
			this.jTableDatosTipoCosteoDefinicionOrderBy = new JTableMe();        
			this.jTableDatosTipoCosteoDefinicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCosteoDefinicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCosteoDefinicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCosteoDefinicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCosteoDefinicionOrderBy.setViewportView(this.jTableDatosTipoCosteoDefinicionOrderBy);
			this.jTableDatosTipoCosteoDefinicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCosteoDefinicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCosteoDefinicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCosteoDefinicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCosteoDefinicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCosteoDefinicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCosteoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCosteoDefinicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCosteoDefinicion.setTitle("Orden");
			this.jInternalFrameOrderByTipoCosteoDefinicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCosteoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCosteoDefinicion.setResizable(true);
			this.jInternalFrameOrderByTipoCosteoDefinicion.setClosable(true);
			this.jInternalFrameOrderByTipoCosteoDefinicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCosteoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeo Definiciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCosteoDefinicion.ipady =150;
				
			this.jPanelOrderByTipoCosteoDefinicion.add(jScrollPanelDatosTipoCosteoDefinicionOrderBy, this.gridBagConstraintsTipoCosteoDefinicion);//this.jTableDatosTipoCosteoDefinicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCosteoDefinicion = new JButtonMe();
			this.jButtonCerrarOrderByTipoCosteoDefinicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCosteoDefinicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCosteoDefinicion.setToolTipText("Cancelar"+" "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCosteoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteoDefinicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCosteoDefinicion.add(this.jButtonCerrarOrderByTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCosteoDefinicion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCosteoDefinicion= new JScrollPane(jPanelOrderByTipoCosteoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCosteoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteoDefinicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCosteoDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCosteoDefinicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCosteoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCosteoDefinicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCosteoDefinicion);
			
			this.jInternalFrameOrderByTipoCosteoDefinicion.getContentPane().add(this.jScrollPanelOrderByTipoCosteoDefinicion, this.gridBagConstraintsTipoCosteoDefinicion);			
		
		} else {
			this.jButtonAbrirOrderByTipoCosteoDefinicion = new JButtonMe();
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
			&& this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCosteoDefinicion.getRowHeight();//TipoCosteoDefinicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion.isSelected()) {
					iHeightTable=TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCosteoDefinicion.isSelected()) {
					iHeightTable=TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCosteoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCosteoDefinicion!=null && this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCosteoDefinicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCosteoDefinicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCosteoDefinicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCosteoDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCosteoDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCosteoDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocosteodefinicionLogic.getTipoCosteoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocosteodefinicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCosteoDefinicion> TraerTipoCosteoDefinicionBeans(List<TipoCosteoDefinicion> tipocosteodefinicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCosteoDefinicion tipocosteodefinicion:tipocosteodefinicions) {
					
				if(!(TipoCosteoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCosteoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocosteodefinicion.setsDetalleGeneralEntityReporte(TipoCosteoDefinicionConstantesFunciones.getTipoCosteoDefinicionDescripcion(tipocosteodefinicion));
										
						
					
					

					if(tipocosteodefinicion.getDefinicions()!=null && Funciones.existeClass(classes,Definicion.class)) {
						try{tipocosteodefinicion.setdefinicionsDescripcionReporte(new JRBeanCollectionDataSource(DefinicionJInternalFrame.TraerDefinicionBeans(tipocosteodefinicion.getDefinicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocosteodefinicion.setsDetalleGeneralEntityReporte(tipocosteodefinicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocosteodefinicionbeans.add(tipocosteodefinicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocosteodefinicions;
    }
	//PARA REPORTES FIN
}
