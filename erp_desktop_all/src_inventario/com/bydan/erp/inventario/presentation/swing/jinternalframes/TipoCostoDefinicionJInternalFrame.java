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
import com.bydan.erp.inventario.util.TipoCostoDefinicionConstantesFunciones;

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
public class TipoCostoDefinicionJInternalFrame extends TipoCostoDefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCostoDefinicion;
	
	protected JMenuBar jmenuBarTipoCostoDefinicion;
	
	protected JMenu jmenuTipoCostoDefinicion;
	protected JMenu jmenuDatosTipoCostoDefinicion;
	protected JMenu jmenuArchivoTipoCostoDefinicion;
	protected JMenu jmenuAccionesTipoCostoDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCostoDefinicion;	
	protected GridBagConstraints gridBagConstraintsTipoCostoDefinicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCostoDefinicionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCostoDefinicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCostoDefinicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCostoDefinicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCostoDefinicionSessionBean tipocostodefinicionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCostoDefinicion> tipocostodefinicions;		
	public List<TipoCostoDefinicion> tipocostodefinicionsEliminados;	
	public List<TipoCostoDefinicion> tipocostodefinicionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCostoDefinicion;		
	protected JButton jButtonAbrirOrderByTipoCostoDefinicion;
	
	
	//protected JPanel jPanelOrderByTipoCostoDefinicion;
	//public JScrollPane jScrollPanelOrderByTipoCostoDefinicion;	
	//protected JButton jButtonCerrarOrderByTipoCostoDefinicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCostoDefinicionLogic tipocostodefinicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCostoDefinicion;
	public JScrollPane jScrollPanelDatosEdicionTipoCostoDefinicion;
	public JScrollPane jScrollPanelDatosGeneralTipoCostoDefinicion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCostoDefinicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCostoDefinicion;
	//public JScrollPane jScrollPanelImportacionTipoCostoDefinicion;
	
	
	
	protected JPanel jPanelAccionesTipoCostoDefinicion;
	
    protected JPanel jPanelPaginacionTipoCostoDefinicion;
    protected JPanel jPanelParametrosReportesTipoCostoDefinicion;
	protected JPanel jPanelParametrosReportesAccionesTipoCostoDefinicion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCostoDefinicion;
	protected JPanel jPanelParametrosAuxiliar2TipoCostoDefinicion;
	protected JPanel jPanelParametrosAuxiliar3TipoCostoDefinicion;
	protected JPanel jPanelParametrosAuxiliar4TipoCostoDefinicion;
	//protected JPanel jPanelParametrosAuxiliar5TipoCostoDefinicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCostoDefinicion;
	//protected JPanel jPanelImportacionTipoCostoDefinicion;
	
	
	public JTable jTableDatosTipoCostoDefinicion;
	
	
	
	//public JTable jTableDatosTipoCostoDefinicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCostoDefinicion;
	protected JButton jButtonDuplicarTipoCostoDefinicion;
	protected JButton jButtonCopiarTipoCostoDefinicion;
	protected JButton jButtonVerFormTipoCostoDefinicion;
	protected JButton jButtonNuevoRelacionesTipoCostoDefinicion;
	protected JButton jButtonModificarTipoCostoDefinicion;
	
    protected JButton jButtonGuardarCambiosTablaTipoCostoDefinicion;
	protected JButton jButtonCerrarTipoCostoDefinicion;
	
	
	protected JButton jButtonRecargarInformacionTipoCostoDefinicion;
	protected JButton jButtonProcesarInformacionTipoCostoDefinicion;
	
	
	protected JButton jButtonAnterioresTipoCostoDefinicion;
	protected JButton jButtonSiguientesTipoCostoDefinicion;
	protected JButton jButtonNuevoGuardarCambiosTipoCostoDefinicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCostoDefinicion;
	//protected JButton jButtonCerrarReporteDinamicoTipoCostoDefinicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCostoDefinicion;
	//protected JButton jButtonGenerarImportacionTipoCostoDefinicion;
	//protected JButton jButtonCerrarImportacionTipoCostoDefinicion;
	//protected JFileChooser jFileChooserImportacionTipoCostoDefinicion;
	//protected File fileImportacionTipoCostoDefinicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCostoDefinicion;
	protected JButton jButtonDuplicarToolBarTipoCostoDefinicion;
	protected JButton jButtonNuevoRelacionesToolBarTipoCostoDefinicion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCostoDefinicion;
	protected JButton jButtonCopiarToolBarTipoCostoDefinicion;
	protected JButton jButtonVerFormToolBarTipoCostoDefinicion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCostoDefinicion;
	protected JButton jButtonCerrarToolBarTipoCostoDefinicion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCostoDefinicion;
	protected JButton jButtonProcesarInformacionToolBarTipoCostoDefinicion;
	protected JButton jButtonAnterioresToolBarTipoCostoDefinicion;
	protected JButton jButtonSiguientesToolBarTipoCostoDefinicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCostoDefinicion;
	protected JButton jButtonAbrirOrderByToolBarTipoCostoDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCostoDefinicion;
	protected JMenuItem jMenuItemDuplicarTipoCostoDefinicion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCostoDefinicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCostoDefinicion;
	protected JMenuItem jMenuItemCopiarTipoCostoDefinicion;
	protected JMenuItem jMenuItemVerFormTipoCostoDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCostoDefinicion;
	protected JMenuItem jMenuItemCerrarTipoCostoDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoCostoDefinicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCostoDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCostoDefinicion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCostoDefinicion;
	protected JMenuItem jMenuItemProcesarInformacionTipoCostoDefinicion;
	protected JMenuItem jMenuItemAnterioresTipoCostoDefinicion;
	protected JMenuItem jMenuItemSiguientesTipoCostoDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCostoDefinicion;
	protected JMenuItem jMenuItemAbrirOrderByTipoCostoDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoCostoDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCostoDefinicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCostoDefinicion;
	protected JCheckBox jCheckBoxSeleccionadosTipoCostoDefinicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCostoDefinicion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCostoDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCostoDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCostoDefinicion;
	protected JTextField jTextFieldValorCampoGeneralTipoCostoDefinicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCostoDefinicion;
	//public JList<Reporte> jListColumnasSelectReporteTipoCostoDefinicion;
	//public JScrollPane jScrollColumnasSelectReporteTipoCostoDefinicion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCostoDefinicion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCostoDefinicion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCostoDefinicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCostoDefinicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCostoDefinicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCostoDefinicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCostoDefinicion;
	
		
	//public JLabel jLabelArchivoImportacionTipoCostoDefinicion;	
	//public JLabel jLabelPathArchivoImportacionTipoCostoDefinicion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCostoDefinicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCostoDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCostoDefinicion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCostoDefinicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCostoDefinicion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCostoDefinicion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCostoDefinicion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCostoDefinicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCostoDefinicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCostoDefinicion;	
	
	
	
	
	
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
	public TipoCostoDefinicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDefinicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDefinicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoDefinicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCostoDefinicion)	{
		this.jButtonRecargarInformacionTipoCostoDefinicion = jButtonRecargarInformacionTipoCostoDefinicion;
	}
	
	public JButton getjButtonProcesarInformacionTipoCostoDefinicion() {
		return this.jButtonProcesarInformacionTipoCostoDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCostoDefinicion)	{
		this.jButtonProcesarInformacionTipoCostoDefinicion = jButtonProcesarInformacionTipoCostoDefinicion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCostoDefinicion() {
		return this.jButtonRecargarInformacionTipoCostoDefinicion;
	}
	
	
	public List<TipoCostoDefinicion> gettipocostodefinicions() {
		return this.tipocostodefinicions;
	}

	public void settipocostodefinicions(List<TipoCostoDefinicion> tipocostodefinicions) {
		this.tipocostodefinicions = tipocostodefinicions;
	}
	
	public List<TipoCostoDefinicion> gettipocostodefinicionsAux() {
		return this.tipocostodefinicionsAux;
	}

	public void settipocostodefinicionsAux(List<TipoCostoDefinicion> tipocostodefinicionsAux) {
		this.tipocostodefinicionsAux = tipocostodefinicionsAux;
	}
	
	public List<TipoCostoDefinicion> gettipocostodefinicionsEliminados() {
		return this.tipocostodefinicionsEliminados;
	}

	public void setTipoCostoDefinicionsEliminados(List<TipoCostoDefinicion> tipocostodefinicionsEliminados) {
		this.tipocostodefinicionsEliminados = tipocostodefinicionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCostoDefinicion() {
		return jComboBoxTiposSeleccionarTipoCostoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCostoDefinicion(
			JComboBox jComboBoxTiposSeleccionarTipoCostoDefinicion) {
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion = jComboBoxTiposSeleccionarTipoCostoDefinicion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCostoDefinicion() {
		return jTextFieldValorCampoGeneralTipoCostoDefinicion;
	}

	public void setjTextFieldValorCampoGeneralTipoCostoDefinicion(
			JTextField jTextFieldValorCampoGeneralTipoCostoDefinicion) {
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion = jTextFieldValorCampoGeneralTipoCostoDefinicion;
	}

	public void setBorderResaltarValorCampoGeneralTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCostoDefinicion() {
		return this.jCheckBoxSeleccionarTodosTipoCostoDefinicion;
	}

	public void setjCheckBoxSeleccionarTodosTipoCostoDefinicion(
			JCheckBox jCheckBoxSeleccionarTodosTipoCostoDefinicion) {
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion = jCheckBoxSeleccionarTodosTipoCostoDefinicion;
	}

	public void setBorderResaltarSeleccionarTodosTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCostoDefinicion() {
		return this.jCheckBoxSeleccionadosTipoCostoDefinicion;
	}

	public void setjCheckBoxSeleccionadosTipoCostoDefinicion(
			JCheckBox jCheckBoxSeleccionadosTipoCostoDefinicion) {
		this.jCheckBoxSeleccionadosTipoCostoDefinicion = jCheckBoxSeleccionadosTipoCostoDefinicion;
	}
	
	public void setBorderResaltarSeleccionadosTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCostoDefinicion() {
		return this.jComboBoxTiposArchivosReportesTipoCostoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCostoDefinicion(
			JComboBox jComboBoxTiposArchivosReportesTipoCostoDefinicion) {
		this.jComboBoxTiposArchivosReportesTipoCostoDefinicion = jComboBoxTiposArchivosReportesTipoCostoDefinicion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCostoDefinicion() {
		return this.jComboBoxTiposReportesTipoCostoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCostoDefinicion(
			JComboBox jComboBoxTiposReportesTipoCostoDefinicion) {
		this.jComboBoxTiposReportesTipoCostoDefinicion = jComboBoxTiposReportesTipoCostoDefinicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCostoDefinicion() {
	//	return jComboBoxTiposReportesDinamicoTipoCostoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCostoDefinicion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCostoDefinicion) {
	//	this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion = jComboBoxTiposReportesDinamicoTipoCostoDefinicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion = jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion;
	//}
	
	public void setBorderResaltarTiposReportesTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCostoDefinicion() {
		return this.jComboBoxTiposGraficosReportesTipoCostoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCostoDefinicion(
			JComboBox jComboBoxTiposGraficosReportesTipoCostoDefinicion) {
		this.jComboBoxTiposGraficosReportesTipoCostoDefinicion = jComboBoxTiposGraficosReportesTipoCostoDefinicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCostoDefinicion() {
		return this.jComboBoxTiposPaginacionTipoCostoDefinicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCostoDefinicion(
			JComboBox jComboBoxTiposPaginacionTipoCostoDefinicion) {
		this.jComboBoxTiposPaginacionTipoCostoDefinicion = jComboBoxTiposPaginacionTipoCostoDefinicion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCostoDefinicion() {
		return this.jComboBoxTiposRelacionesTipoCostoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCostoDefinicion() {
		return this.jComboBoxTiposAccionesTipoCostoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCostoDefinicion(
			JComboBox jComboBoxTiposRelacionesTipoCostoDefinicion) {
		this.jComboBoxTiposRelacionesTipoCostoDefinicion = jComboBoxTiposRelacionesTipoCostoDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCostoDefinicion(
			JComboBox jComboBoxTiposAccionesTipoCostoDefinicion) {
		this.jComboBoxTiposAccionesTipoCostoDefinicion = jComboBoxTiposAccionesTipoCostoDefinicion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCostoDefinicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCostoDefinicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCostoDefinicion() {
	//	return jCheckBoxConGraficoDinamicoTipoCostoDefinicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCostoDefinicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCostoDefinicion) {
	//	this.jCheckBoxConGraficoDinamicoTipoCostoDefinicion = jCheckBoxConGraficoDinamicoTipoCostoDefinicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCostoDefinicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCostoDefinicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCostoDefinicion .setBorder(borderResaltar);		
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
		this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
		
		this.tipocostodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocostodefinicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCostoDefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCostoDefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCostoDefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCostoDefinicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCostoDefinicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"nuevo","nuevo","Nuevo"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"duplicar","duplicar","Duplicar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"copiar","copiar","Copiar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"ver_form","ver_form","Ver"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"recargar","recargar","Recargar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCostoDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,
							"cerrar","cerrar","Salir"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCostoDefinicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCostoDefinicion;
			
				this.jButtonProcesarInformacionToolBarTipoCostoDefinicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCostoDefinicion;
				
		//protected JButton jButtonModificarToolBarTipoCostoDefinicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCostoDefinicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCostoDefinicion=new JMenuMe("General");
		this.jmenuArchivoTipoCostoDefinicion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCostoDefinicion=new JMenuMe("Acciones");
		this.jmenuDatosTipoCostoDefinicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCostoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCostoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCostoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCostoDefinicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCostoDefinicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCostoDefinicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCostoDefinicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCostoDefinicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCostoDefinicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCostoDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCostoDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCostoDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCostoDefinicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCostoDefinicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCostoDefinicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCostoDefinicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCostoDefinicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCostoDefinicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCostoDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCostoDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCostoDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCostoDefinicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCostoDefinicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCostoDefinicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCostoDefinicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCostoDefinicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCostoDefinicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCostoDefinicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCostoDefinicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCostoDefinicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCostoDefinicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCostoDefinicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCostoDefinicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCostoDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCostoDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCostoDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCostoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCostoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCostoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCostoDefinicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCostoDefinicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCostoDefinicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCostoDefinicion.add(this.jMenuItemCerrarTipoCostoDefinicion);
			
			this.jmenuAccionesTipoCostoDefinicion.add(this.jMenuItemNuevoTipoCostoDefinicion);
			this.jmenuAccionesTipoCostoDefinicion.add(this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion);
			this.jmenuAccionesTipoCostoDefinicion.add(this.jMenuItemNuevoRelacionesTipoCostoDefinicion);
			this.jmenuAccionesTipoCostoDefinicion.add(this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion);		
			this.jmenuAccionesTipoCostoDefinicion.add(this.jMenuItemDuplicarTipoCostoDefinicion);		
			this.jmenuAccionesTipoCostoDefinicion.add(this.jMenuItemCopiarTipoCostoDefinicion);		
			this.jmenuAccionesTipoCostoDefinicion.add(this.jMenuItemVerFormTipoCostoDefinicion);		
			
			this.jmenuDatosTipoCostoDefinicion.add(this.jMenuItemRecargarInformacionTipoCostoDefinicion);				
			this.jmenuDatosTipoCostoDefinicion.add(this.jMenuItemAnterioresTipoCostoDefinicion);				
			this.jmenuDatosTipoCostoDefinicion.add(this.jMenuItemSiguientesTipoCostoDefinicion);				
			this.jmenuDatosTipoCostoDefinicion.add(this.jMenuItemAbrirOrderByTipoCostoDefinicion);				
			this.jmenuDatosTipoCostoDefinicion.add(this.jMenuItemMostrarOcultarTipoCostoDefinicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCostoDefinicion.add(this.jMenuItemGuardarCambiosTipoCostoDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCostoDefinicion.add(this.jmenuArchivoTipoCostoDefinicion);		
			this.jmenuBarTipoCostoDefinicion.add(this.jmenuAccionesTipoCostoDefinicion);		
			this.jmenuBarTipoCostoDefinicion.add(this.jmenuDatosTipoCostoDefinicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCostoDefinicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCostoDefinicion() {
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
			//this.jInternalFrameDetalleTipoCostoDefinicion = new TipoCostoDefinicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Costo Definicion DATOS");
			this.jInternalFrameDetalleFormTipoCostoDefinicion = new TipoCostoDefinicionDetalleFormJInternalFrame(jDesktopPane,this.tipocostodefinicionSessionBean.getConGuardarRelaciones(),this.tipocostodefinicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCostoDefinicion = null;//new TipoCostoDefinicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCostoDefinicion= new GridBagLayout();
		
		
		this.jTableDatosTipoCostoDefinicion = new JTableMe();      
		
		String sToolTipTipoCostoDefinicion="";
		sToolTipTipoCostoDefinicion=TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCostoDefinicion+="(Inventario.TipoCostoDefinicion)";
		}
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCostoDefinicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCostoDefinicion.setToolTipText(sToolTipTipoCostoDefinicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCostoDefinicion);
		this.jTableDatosTipoCostoDefinicion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCostoDefinicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCostoDefinicion.setRowSelectionAllowed(true);
		this.jTableDatosTipoCostoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCostoDefinicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCostoDefinicion = new JButtonMe();
		this.jButtonDuplicarTipoCostoDefinicion = new JButtonMe();
		this.jButtonCopiarTipoCostoDefinicion = new JButtonMe();
		this.jButtonVerFormTipoCostoDefinicion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCostoDefinicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion = new JButtonMe();
		this.jButtonCerrarTipoCostoDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoCostoDefinicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCostoDefinicion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo Definicion";
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCostoDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCostoDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoCostoDefinicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCostoDefinicion=new ReporteDinamicoJInternalFrame(TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCostoDefinicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCostoDefinicion=new ImportacionJInternalFrame(TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCostoDefinicion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCostoDefinicion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCostoDefinicion.setText("Orden");
		this.jButtonAbrirOrderByTipoCostoDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCostoDefinicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCostoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoDefinicion,false,this);
			
			//this.cargarOrderByTipoCostoDefinicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCostoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoDefinicion,true,this);
			
			//this.cargarOrderByTipoCostoDefinicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCostoDefinicion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCostoDefinicion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCostoDefinicion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCostoDefinicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCostoDefinicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCostoDefinicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCostoDefinicion.setText("Nuevo");
		this.jButtonDuplicarTipoCostoDefinicion.setText("Duplicar");
		this.jButtonCopiarTipoCostoDefinicion.setText("Copiar");
		this.jButtonVerFormTipoCostoDefinicion.setText("Ver");
		this.jButtonNuevoRelacionesTipoCostoDefinicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.setText("Guardar");
		this.jButtonCerrarTipoCostoDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCostoDefinicion,"nuevo_button","Nuevo",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCostoDefinicion,"duplicar_button","Duplicar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCostoDefinicion,"copiar_button","Copiar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCostoDefinicion,"ver_form","Ver",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCostoDefinicion,"nuevorelaciones_button","Nuevo Rel",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCostoDefinicion,"guardarcambiostabla_button","Guardar",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCostoDefinicion,"cerrar_button","Salir",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCostoDefinicion.setToolTipText("Nuevo"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCostoDefinicion.setToolTipText("Duplicar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCostoDefinicion.setToolTipText("Copiar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCostoDefinicion.setToolTipText("Ver"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCostoDefinicion.setToolTipText("Nuevo Rel"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.setToolTipText("Guardar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCostoDefinicion.setToolTipText("Salir"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCostoDefinicion";
		inputMap = this.jButtonNuevoTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCostoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCostoDefinicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCostoDefinicion";
		inputMap = this.jButtonDuplicarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCostoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCostoDefinicion"));
		
		//COPIAR
		sMapKey = "CopiarTipoCostoDefinicion";
		inputMap = this.jButtonCopiarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCostoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCostoDefinicion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCostoDefinicion";
		inputMap = this.jButtonVerFormTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCostoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCostoDefinicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCostoDefinicion";
		inputMap = this.jButtonNuevoRelacionesTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCostoDefinicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCostoDefinicion";
		inputMap = this.jButtonModificarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCostoDefinicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCostoDefinicion";
		inputMap = this.jButtonCerrarTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCostoDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCostoDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCostoDefinicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCostoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCostoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCostoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCostoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCostoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCostoDefinicion.setName("jPanelParametrosReportesTipoCostoDefinicion"); 
		
		this.jPanelParametrosReportesAccionesTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCostoDefinicion.setName("jPanelParametrosReportesAccionesTipoCostoDefinicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCostoDefinicion = new JButtonMe();
		this.jButtonRecargarInformacionTipoCostoDefinicion.setText("Recargar");
		this.jButtonRecargarInformacionTipoCostoDefinicion.setToolTipText("Recargar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCostoDefinicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCostoDefinicion = new JButtonMe();
		this.jButtonProcesarInformacionTipoCostoDefinicion.setText("Procesar");
		this.jButtonProcesarInformacionTipoCostoDefinicion.setToolTipText("Procesar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCostoDefinicion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCostoDefinicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCostoDefinicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCostoDefinicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCostoDefinicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCostoDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCostoDefinicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCostoDefinicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCostoDefinicion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCostoDefinicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCostoDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCostoDefinicion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCostoDefinicion = new JLabelMe();
		
		this.jLabelAccionesTipoCostoDefinicion.setText("Acciones");		
		this.jLabelAccionesTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCostoDefinicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCostoDefinicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCostoDefinicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCostoDefinicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCostoDefinicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCostoDefinicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCostoDefinicion = new JButtonMe();
		//this.jButtonAnterioresTipoCostoDefinicion.setText("<<");
        this.jButtonAnterioresTipoCostoDefinicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCostoDefinicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCostoDefinicion = new JButtonMe();
		//this.jButtonSiguientesTipoCostoDefinicion.setText(">>");
        this.jButtonSiguientesTipoCostoDefinicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCostoDefinicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCostoDefinicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCostoDefinicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCostoDefinicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCostoDefinicion,"nuevoguardarcambios_button","Nue",this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCostoDefinicion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCostoDefinicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCostoDefinicion";
		inputMap = this.jButtonRecargarInformacionTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCostoDefinicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCostoDefinicion";
		inputMap = this.jButtonSiguientesTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCostoDefinicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCostoDefinicion";
		inputMap = this.jButtonAnterioresTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCostoDefinicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCostoDefinicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCostoDefinicion.setMinimumSize(new Dimension(this.getWidth(),TipoCostoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCostoDefinicion.setMaximumSize(new Dimension(this.getWidth(),TipoCostoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCostoDefinicion.setPreferredSize(new Dimension(this.getWidth(),TipoCostoDefinicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoDefinicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCostoDefinicion = new GridBagLayout();

			this.jPanelPaginacionTipoCostoDefinicion.setLayout(gridaBagLayoutPaginacionTipoCostoDefinicion);						
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonAnterioresTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
					
						
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
			
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonNuevoGuardarCambiosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
						
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonSiguientesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonNuevoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCostoDefinicion.gridy = 1;
				this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonNuevoRelacionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			}
			
			
			if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCostoDefinicion.gridy = 1;
				this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonGuardarCambiosTablaTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			}
			
			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonDuplicarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonCopiarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonVerFormTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 1;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCostoDefinicion.add(this.jButtonCerrarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
		
		
		this.jButtonRecargarInformacionTipoCostoDefinicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCostoDefinicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCostoDefinicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCostoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCostoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCostoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCostoDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCostoDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCostoDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCostoDefinicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCostoDefinicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCostoDefinicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCostoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCostoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCostoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCostoDefinicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCostoDefinicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCostoDefinicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCostoDefinicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCostoDefinicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCostoDefinicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCostoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCostoDefinicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCostoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCostoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCostoDefinicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCostoDefinicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCostoDefinicion.setLayout(gridaBagParametrosReportesTipoCostoDefinicion);
			this.jPanelParametrosReportesAccionesTipoCostoDefinicion.setLayout(gridaBagParametrosReportesAccionesTipoCostoDefinicion);
			
			
			this.jPanelParametrosAuxiliar1TipoCostoDefinicion.setLayout(gridaBagParametrosAuxiliar1TipoCostoDefinicion);
			this.jPanelParametrosAuxiliar2TipoCostoDefinicion.setLayout(gridaBagParametrosAuxiliar2TipoCostoDefinicion);
			this.jPanelParametrosAuxiliar3TipoCostoDefinicion.setLayout(gridaBagParametrosAuxiliar3TipoCostoDefinicion);
			this.jPanelParametrosAuxiliar4TipoCostoDefinicion.setLayout(gridaBagParametrosAuxiliar4TipoCostoDefinicion);
			//this.jPanelParametrosAuxiliar5TipoCostoDefinicion.setLayout(gridaBagParametrosAuxiliar2TipoCostoDefinicion);			
			
			
			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jButtonRecargarInformacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCostoDefinicion.add(this.jComboBoxTiposPaginacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCostoDefinicion.add(this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCostoDefinicion.add(this.jComboBoxTiposArchivosReportesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jPanelParametrosAuxiliar1TipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCostoDefinicion.add(this.jComboBoxTiposReportesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jPanelParametrosAuxiliar4TipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jComboBoxTiposReportesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jCheckBoxGenerarReporteTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jPanelParametrosAuxiliar2TipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jLabelAccionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
				this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jButtonAbrirOrderByTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jComboBoxTiposSeleccionarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
			
			
			/*
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoDefinicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jCheckBoxSeleccionarTodosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCostoDefinicion.add(this.jCheckBoxSeleccionarTodosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);															
				
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoDefinicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCostoDefinicion.add(this.jCheckBoxSeleccionadosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jPanelParametrosAuxiliar3TipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jComboBoxTiposRelacionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
				
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoDefinicion.add(this.jComboBoxTiposAccionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCostoDefinicion = new GridBagLayout();

			this.jScrollPanelDatosTipoCostoDefinicion.setLayout(gridaBagLayoutDatosTipoCostoDefinicion);
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
			
			this.jScrollPanelDatosTipoCostoDefinicion.add(this.jTableDatosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCostoDefinicion.setViewportView(this.jTableDatosTipoCostoDefinicion);
		this.jTableDatosTipoCostoDefinicion.setFillsViewportHeight(true);
		this.jTableDatosTipoCostoDefinicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCostoDefinicion= new GridBagLayout();
		this.jPanelAccionesTipoCostoDefinicion.setLayout(gridaBagLayoutAccionesTipoCostoDefinicion);
		
		
		/*	
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = 0;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
			
		this.jPanelAccionesTipoCostoDefinicion.add(this.jButtonNuevoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCostoDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCostoDefinicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;		
			//this.gridBagConstraintsTipoCostoDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCostoDefinicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;		
		//this.gridBagConstraintsTipoCostoDefinicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCostoDefinicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCostoDefinicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);								
		
		
		/*
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		*/		
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCostoDefinicion.gridx =0;
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCostoDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
				
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCostoDefinicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCostoDefinicion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCostoDefinicion.setLayout(gridaBagLayoutBusquedasParametrosTipoCostoDefinicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCostoDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
			
			
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
			
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCostoDefinicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCostoDefinicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCostoDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCostoDefinicion.setName("jPanelReporteDinamicoTipoCostoDefinicion"); 
		
		this.jPanelReporteDinamicoTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCostoDefinicion.setLayout(gridaBagLayoutReporteDinamicoTipoCostoDefinicion);
		
		
		this.jInternalFrameReporteDinamicoTipoCostoDefinicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCostoDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCostoDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Definiciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCostoDefinicion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCostoDefinicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jLabelColumnasSelectReporteTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCostoDefinicion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCostoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCostoDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCostoDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCostoDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCostoDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCostoDefinicion=new JScrollPane(this.jListColumnasSelectReporteTipoCostoDefinicion);
			
			this.jScrollColumnasSelectReporteTipoCostoDefinicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCostoDefinicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCostoDefinicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jListColumnasSelectReporteTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jScrollColumnasSelectReporteTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCostoDefinicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCostoDefinicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jLabelRelacionesSelectReporteTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCostoDefinicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCostoDefinicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCostoDefinicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCostoDefinicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCostoDefinicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCostoDefinicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCostoDefinicion=new JScrollPane(this.jListRelacionesSelectReporteTipoCostoDefinicion);
			
			this.jScrollRelacionesSelectReporteTipoCostoDefinicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCostoDefinicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCostoDefinicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jListRelacionesSelectReporteTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jScrollRelacionesSelectReporteTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCostoDefinicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCostoDefinicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCostoDefinicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCostoDefinicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCostoDefinicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jLabelGenerarExcelReporteDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion.setToolTipText("Generar EXCEL"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jComboBoxTiposReportesDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCostoDefinicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCostoDefinicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jLabelTiposArchivoReporteDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCostoDefinicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCostoDefinicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCostoDefinicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCostoDefinicion.setToolTipText("Generar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jButtonGenerarReporteDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCostoDefinicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCostoDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCostoDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCostoDefinicion.setToolTipText("Cancelar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoDefinicion.add(this.jButtonCerrarReporteDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCostoDefinicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCostoDefinicion= new JScrollPane(jPanelReporteDinamicoTipoCostoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Definiciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoDefinicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCostoDefinicion);
		this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCostoDefinicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCostoDefinicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCostoDefinicion.setName("jPanelImportacionTipoCostoDefinicion"); 
		
		this.jPanelImportacionTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCostoDefinicion.setLayout(gridaBagLayoutImportacionTipoCostoDefinicion);
		
		
		this.jInternalFrameImportacionTipoCostoDefinicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCostoDefinicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCostoDefinicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCostoDefinicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCostoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCostoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCostoDefinicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCostoDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCostoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCostoDefinicion.setResizable(true);
	    this.jInternalFrameImportacionTipoCostoDefinicion.setClosable(true);
	    this.jInternalFrameImportacionTipoCostoDefinicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCostoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCostoDefinicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCostoDefinicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCostoDefinicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCostoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCostoDefinicion.setResizable(true);
	    this.jInternalFrameImportacionTipoCostoDefinicion.setClosable(true);
	    this.jInternalFrameImportacionTipoCostoDefinicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Definiciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCostoDefinicion = new JLabelMe();

		this.jLabelArchivoImportacionTipoCostoDefinicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCostoDefinicion.add(this.jLabelArchivoImportacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCostoDefinicion = new JFileChooser();		
		this.jFileChooserImportacionTipoCostoDefinicion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCostoDefinicion = new JButtonMe();
		this.jButtonAbrirImportacionTipoCostoDefinicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCostoDefinicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCostoDefinicion.setToolTipText("Generar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoDefinicion.add(this.jButtonAbrirImportacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCostoDefinicion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCostoDefinicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCostoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCostoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCostoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCostoDefinicion.add(this.jLabelPathArchivoImportacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCostoDefinicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCostoDefinicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCostoDefinicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCostoDefinicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoDefinicion.add(this.jTextFieldPathArchivoImportacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCostoDefinicion = new JButtonMe();
		this.jButtonGenerarImportacionTipoCostoDefinicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCostoDefinicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCostoDefinicion.setToolTipText("Generar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoDefinicion.add(this.jButtonGenerarImportacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCostoDefinicion = new JButtonMe();
		this.jButtonCerrarImportacionTipoCostoDefinicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCostoDefinicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCostoDefinicion.setToolTipText("Cancelar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoDefinicion.add(this.jButtonCerrarImportacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCostoDefinicion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCostoDefinicion= new JScrollPane(jPanelImportacionTipoCostoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoDefinicion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCostoDefinicion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCostoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCostoDefinicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCostoDefinicion);
		this.jInternalFrameImportacionTipoCostoDefinicion.getContentPane().add(this.jScrollPanelImportacionTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCostoDefinicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCostoDefinicion = new JButtonMe();
			this.jButtonAbrirOrderByTipoCostoDefinicion.setText("Orden");
			this.jButtonAbrirOrderByTipoCostoDefinicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCostoDefinicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCostoDefinicion";
			inputMap = this.jButtonAbrirOrderByTipoCostoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCostoDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCostoDefinicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCostoDefinicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCostoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCostoDefinicion.setName("jPanelOrderByTipoCostoDefinicion"); 
			
			this.jPanelOrderByTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCostoDefinicion.setLayout(gridaBagLayoutOrderByTipoCostoDefinicion);
			
			
			this.jTableDatosTipoCostoDefinicionOrderBy = new JTableMe();        
			this.jTableDatosTipoCostoDefinicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCostoDefinicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCostoDefinicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCostoDefinicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCostoDefinicionOrderBy.setViewportView(this.jTableDatosTipoCostoDefinicionOrderBy);
			this.jTableDatosTipoCostoDefinicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCostoDefinicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCostoDefinicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCostoDefinicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCostoDefinicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCostoDefinicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCostoDefinicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCostoDefinicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCostoDefinicion.setTitle("Orden");
			this.jInternalFrameOrderByTipoCostoDefinicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCostoDefinicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCostoDefinicion.setResizable(true);
			this.jInternalFrameOrderByTipoCostoDefinicion.setClosable(true);
			this.jInternalFrameOrderByTipoCostoDefinicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCostoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Definiciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCostoDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCostoDefinicion.ipady =150;
				
			this.jPanelOrderByTipoCostoDefinicion.add(jScrollPanelDatosTipoCostoDefinicionOrderBy, this.gridBagConstraintsTipoCostoDefinicion);//this.jTableDatosTipoCostoDefinicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCostoDefinicion = new JButtonMe();
			this.jButtonCerrarOrderByTipoCostoDefinicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCostoDefinicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCostoDefinicion.setToolTipText("Cancelar"+" "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCostoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoDefinicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCostoDefinicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCostoDefinicion.add(this.jButtonCerrarOrderByTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCostoDefinicion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCostoDefinicion= new JScrollPane(jPanelOrderByTipoCostoDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCostoDefinicion = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoDefinicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCostoDefinicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCostoDefinicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCostoDefinicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCostoDefinicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCostoDefinicion);
			
			this.jInternalFrameOrderByTipoCostoDefinicion.getContentPane().add(this.jScrollPanelOrderByTipoCostoDefinicion, this.gridBagConstraintsTipoCostoDefinicion);			
		
		} else {
			this.jButtonAbrirOrderByTipoCostoDefinicion = new JButtonMe();
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
			&& this.tipocostodefinicionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCostoDefinicion.getRowHeight();//TipoCostoDefinicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion.isSelected()) {
					iHeightTable=TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCostoDefinicion.isSelected()) {
					iHeightTable=TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCostoDefinicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCostoDefinicion!=null && this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCostoDefinicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCostoDefinicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCostoDefinicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCostoDefinicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCostoDefinicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCostoDefinicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocostodefinicionLogic.getTipoCostoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostodefinicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCostoDefinicion> TraerTipoCostoDefinicionBeans(List<TipoCostoDefinicion> tipocostodefinicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCostoDefinicion tipocostodefinicion:tipocostodefinicions) {
					
				if(!(TipoCostoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCostoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocostodefinicion.setsDetalleGeneralEntityReporte(TipoCostoDefinicionConstantesFunciones.getTipoCostoDefinicionDescripcion(tipocostodefinicion));
										
						
					
					

					if(tipocostodefinicion.getDefinicions()!=null && Funciones.existeClass(classes,Definicion.class)) {
						try{tipocostodefinicion.setdefinicionsDescripcionReporte(new JRBeanCollectionDataSource(DefinicionJInternalFrame.TraerDefinicionBeans(tipocostodefinicion.getDefinicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocostodefinicion.setsDetalleGeneralEntityReporte(tipocostodefinicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocostodefinicionbeans.add(tipocostodefinicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocostodefinicions;
    }
	//PARA REPORTES FIN
}
