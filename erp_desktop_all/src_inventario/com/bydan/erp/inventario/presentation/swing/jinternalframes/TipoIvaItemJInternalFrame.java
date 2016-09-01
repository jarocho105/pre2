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
import com.bydan.erp.inventario.util.TipoIvaItemConstantesFunciones;

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
public class TipoIvaItemJInternalFrame extends TipoIvaItemBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoIvaItem;
	
	protected JMenuBar jmenuBarTipoIvaItem;
	
	protected JMenu jmenuTipoIvaItem;
	protected JMenu jmenuDatosTipoIvaItem;
	protected JMenu jmenuArchivoTipoIvaItem;
	protected JMenu jmenuAccionesTipoIvaItem;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIvaItem;	
	protected GridBagConstraints gridBagConstraintsTipoIvaItem;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoIvaItemDetalleFormJInternalFrame jInternalFrameDetalleFormTipoIvaItem;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoIvaItem;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoIvaItem;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIvaItemSessionBean tipoivaitemSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoIvaItem> tipoivaitems;		
	public List<TipoIvaItem> tipoivaitemsEliminados;	
	public List<TipoIvaItem> tipoivaitemsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoIvaItem;		
	protected JButton jButtonAbrirOrderByTipoIvaItem;
	
	
	//protected JPanel jPanelOrderByTipoIvaItem;
	//public JScrollPane jScrollPanelOrderByTipoIvaItem;	
	//protected JButton jButtonCerrarOrderByTipoIvaItem;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoIvaItemLogic tipoivaitemLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoIvaItem;
	public JScrollPane jScrollPanelDatosEdicionTipoIvaItem;
	public JScrollPane jScrollPanelDatosGeneralTipoIvaItem;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoIvaItemOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoIvaItem;
	//public JScrollPane jScrollPanelImportacionTipoIvaItem;
	
	
	
	protected JPanel jPanelAccionesTipoIvaItem;
	
    protected JPanel jPanelPaginacionTipoIvaItem;
    protected JPanel jPanelParametrosReportesTipoIvaItem;
	protected JPanel jPanelParametrosReportesAccionesTipoIvaItem;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoIvaItem;
	protected JPanel jPanelParametrosAuxiliar2TipoIvaItem;
	protected JPanel jPanelParametrosAuxiliar3TipoIvaItem;
	protected JPanel jPanelParametrosAuxiliar4TipoIvaItem;
	//protected JPanel jPanelParametrosAuxiliar5TipoIvaItem;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoIvaItem;
	//protected JPanel jPanelImportacionTipoIvaItem;
	
	
	public JTable jTableDatosTipoIvaItem;
	
	
	
	//public JTable jTableDatosTipoIvaItemOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoIvaItem;
	protected JButton jButtonDuplicarTipoIvaItem;
	protected JButton jButtonCopiarTipoIvaItem;
	protected JButton jButtonVerFormTipoIvaItem;
	protected JButton jButtonNuevoRelacionesTipoIvaItem;
	protected JButton jButtonModificarTipoIvaItem;
	
    protected JButton jButtonGuardarCambiosTablaTipoIvaItem;
	protected JButton jButtonCerrarTipoIvaItem;
	
	
	protected JButton jButtonRecargarInformacionTipoIvaItem;
	protected JButton jButtonProcesarInformacionTipoIvaItem;
	
	
	protected JButton jButtonAnterioresTipoIvaItem;
	protected JButton jButtonSiguientesTipoIvaItem;
	protected JButton jButtonNuevoGuardarCambiosTipoIvaItem;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoIvaItem;
	//protected JButton jButtonCerrarReporteDinamicoTipoIvaItem;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoIvaItem;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoIvaItem;
	//protected JButton jButtonGenerarImportacionTipoIvaItem;
	//protected JButton jButtonCerrarImportacionTipoIvaItem;
	//protected JFileChooser jFileChooserImportacionTipoIvaItem;
	//protected File fileImportacionTipoIvaItem;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIvaItem;
	protected JButton jButtonDuplicarToolBarTipoIvaItem;
	protected JButton jButtonNuevoRelacionesToolBarTipoIvaItem;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoIvaItem;
	protected JButton jButtonCopiarToolBarTipoIvaItem;
	protected JButton jButtonVerFormToolBarTipoIvaItem;
	public JButton jButtonGuardarCambiosTablaToolBarTipoIvaItem;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIvaItem;
	protected JButton jButtonCerrarToolBarTipoIvaItem;
	
	protected JButton jButtonRecargarInformacionToolBarTipoIvaItem;
	protected JButton jButtonProcesarInformacionToolBarTipoIvaItem;
	protected JButton jButtonAnterioresToolBarTipoIvaItem;
	protected JButton jButtonSiguientesToolBarTipoIvaItem;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoIvaItem;
	protected JButton jButtonAbrirOrderByToolBarTipoIvaItem;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIvaItem;
	protected JMenuItem jMenuItemDuplicarTipoIvaItem;
	protected JMenuItem jMenuItemNuevoRelacionesTipoIvaItem;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoIvaItem;
	protected JMenuItem jMenuItemCopiarTipoIvaItem;
	protected JMenuItem jMenuItemVerFormTipoIvaItem;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIvaItem;
	protected JMenuItem jMenuItemCerrarTipoIvaItem;
	protected JMenuItem jMenuItemDetalleCerrarTipoIvaItem;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoIvaItem;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIvaItem;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoIvaItem;
	protected JMenuItem jMenuItemProcesarInformacionTipoIvaItem;
	protected JMenuItem jMenuItemAnterioresTipoIvaItem;
	protected JMenuItem jMenuItemSiguientesTipoIvaItem;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIvaItem;
	protected JMenuItem jMenuItemAbrirOrderByTipoIvaItem;
	protected JMenuItem jMenuItemMostrarOcultarTipoIvaItem;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIvaItem;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoIvaItem;
	protected JCheckBox jCheckBoxSeleccionadosTipoIvaItem;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoIvaItem;
	protected JCheckBox jCheckBoxConGraficoReporteTipoIvaItem;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoIvaItem;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoIvaItem;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIvaItem;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoIvaItem;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoIvaItem;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoIvaItem;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIvaItem;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIvaItem;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoIvaItem;
	protected JTextField jTextFieldValorCampoGeneralTipoIvaItem;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoIvaItem;
	//public JList<Reporte> jListColumnasSelectReporteTipoIvaItem;
	//public JScrollPane jScrollColumnasSelectReporteTipoIvaItem;
	
	//public JLabel jLabelRelacionesSelectReporteTipoIvaItem;
	//public JList<Reporte> jListRelacionesSelectReporteTipoIvaItem;
	//public JScrollPane jScrollRelacionesSelectReporteTipoIvaItem;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoIvaItem;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoIvaItem;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoIvaItem;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoIvaItem;
	
		
	//public JLabel jLabelArchivoImportacionTipoIvaItem;	
	//public JLabel jLabelPathArchivoImportacionTipoIvaItem;
	//protected JTextField jTextFieldPathArchivoImportacionTipoIvaItem;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoIvaItem;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoIvaItem;
	
	//public JLabel jLabelColumnaCategoriaValorTipoIvaItem;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoIvaItem;
	
	//public JLabel jLabelColumnasValoresGraficoTipoIvaItem;
	//public JList<Reporte> jListColumnasValoresGraficoTipoIvaItem;
	//public JScrollPane jScrollColumnasValoresGraficoTipoIvaItem;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoIvaItem;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoIvaItem;	
	
	
	
	
	
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
	public TipoIvaItemJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaItemJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaItemJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaItemJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoIvaItem)	{
		this.jButtonRecargarInformacionTipoIvaItem = jButtonRecargarInformacionTipoIvaItem;
	}
	
	public JButton getjButtonProcesarInformacionTipoIvaItem() {
		return this.jButtonProcesarInformacionTipoIvaItem;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIvaItem)	{
		this.jButtonProcesarInformacionTipoIvaItem = jButtonProcesarInformacionTipoIvaItem;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoIvaItem() {
		return this.jButtonRecargarInformacionTipoIvaItem;
	}
	
	
	public List<TipoIvaItem> gettipoivaitems() {
		return this.tipoivaitems;
	}

	public void settipoivaitems(List<TipoIvaItem> tipoivaitems) {
		this.tipoivaitems = tipoivaitems;
	}
	
	public List<TipoIvaItem> gettipoivaitemsAux() {
		return this.tipoivaitemsAux;
	}

	public void settipoivaitemsAux(List<TipoIvaItem> tipoivaitemsAux) {
		this.tipoivaitemsAux = tipoivaitemsAux;
	}
	
	public List<TipoIvaItem> gettipoivaitemsEliminados() {
		return this.tipoivaitemsEliminados;
	}

	public void setTipoIvaItemsEliminados(List<TipoIvaItem> tipoivaitemsEliminados) {
		this.tipoivaitemsEliminados = tipoivaitemsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoIvaItem() {
		return jComboBoxTiposSeleccionarTipoIvaItem;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoIvaItem(
			JComboBox jComboBoxTiposSeleccionarTipoIvaItem) {
		this.jComboBoxTiposSeleccionarTipoIvaItem = jComboBoxTiposSeleccionarTipoIvaItem;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoIvaItem .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoIvaItem() {
		return jTextFieldValorCampoGeneralTipoIvaItem;
	}

	public void setjTextFieldValorCampoGeneralTipoIvaItem(
			JTextField jTextFieldValorCampoGeneralTipoIvaItem) {
		this.jTextFieldValorCampoGeneralTipoIvaItem = jTextFieldValorCampoGeneralTipoIvaItem;
	}

	public void setBorderResaltarValorCampoGeneralTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoIvaItem .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoIvaItem() {
		return this.jCheckBoxSeleccionarTodosTipoIvaItem;
	}

	public void setjCheckBoxSeleccionarTodosTipoIvaItem(
			JCheckBox jCheckBoxSeleccionarTodosTipoIvaItem) {
		this.jCheckBoxSeleccionarTodosTipoIvaItem = jCheckBoxSeleccionarTodosTipoIvaItem;
	}

	public void setBorderResaltarSeleccionarTodosTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoIvaItem .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoIvaItem() {
		return this.jCheckBoxSeleccionadosTipoIvaItem;
	}

	public void setjCheckBoxSeleccionadosTipoIvaItem(
			JCheckBox jCheckBoxSeleccionadosTipoIvaItem) {
		this.jCheckBoxSeleccionadosTipoIvaItem = jCheckBoxSeleccionadosTipoIvaItem;
	}
	
	public void setBorderResaltarSeleccionadosTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoIvaItem .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoIvaItem() {
		return this.jComboBoxTiposArchivosReportesTipoIvaItem;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoIvaItem(
			JComboBox jComboBoxTiposArchivosReportesTipoIvaItem) {
		this.jComboBoxTiposArchivosReportesTipoIvaItem = jComboBoxTiposArchivosReportesTipoIvaItem;
	}

	public void setBorderResaltarTiposArchivosReportesTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoIvaItem .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoIvaItem() {
		return this.jComboBoxTiposReportesTipoIvaItem;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoIvaItem(
			JComboBox jComboBoxTiposReportesTipoIvaItem) {
		this.jComboBoxTiposReportesTipoIvaItem = jComboBoxTiposReportesTipoIvaItem;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoIvaItem() {
	//	return jComboBoxTiposReportesDinamicoTipoIvaItem;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoIvaItem(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoIvaItem) {
	//	this.jComboBoxTiposReportesDinamicoTipoIvaItem = jComboBoxTiposReportesDinamicoTipoIvaItem;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoIvaItem() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoIvaItem;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoIvaItem(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIvaItem) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem = jComboBoxTiposArchivosReportesDinamicoTipoIvaItem;
	//}
	
	public void setBorderResaltarTiposReportesTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoIvaItem .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoIvaItem() {
		return this.jComboBoxTiposGraficosReportesTipoIvaItem;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoIvaItem(
			JComboBox jComboBoxTiposGraficosReportesTipoIvaItem) {
		this.jComboBoxTiposGraficosReportesTipoIvaItem = jComboBoxTiposGraficosReportesTipoIvaItem;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoIvaItem .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoIvaItem() {
		return this.jComboBoxTiposPaginacionTipoIvaItem;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoIvaItem(
			JComboBox jComboBoxTiposPaginacionTipoIvaItem) {
		this.jComboBoxTiposPaginacionTipoIvaItem = jComboBoxTiposPaginacionTipoIvaItem;
	}
	
	public void setBorderResaltarTiposPaginacionTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoIvaItem .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoIvaItem() {
		return this.jComboBoxTiposRelacionesTipoIvaItem;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIvaItem() {
		return this.jComboBoxTiposAccionesTipoIvaItem;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIvaItem(
			JComboBox jComboBoxTiposRelacionesTipoIvaItem) {
		this.jComboBoxTiposRelacionesTipoIvaItem = jComboBoxTiposRelacionesTipoIvaItem;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIvaItem(
			JComboBox jComboBoxTiposAccionesTipoIvaItem) {
		this.jComboBoxTiposAccionesTipoIvaItem = jComboBoxTiposAccionesTipoIvaItem;
	}
	
	public void setBorderResaltarTiposRelacionesTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoIvaItem .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoIvaItem() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoIvaItem .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoIvaItem() {
	//	return jCheckBoxConGraficoDinamicoTipoIvaItem;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoIvaItem(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoIvaItem) {
	//	this.jCheckBoxConGraficoDinamicoTipoIvaItem = jCheckBoxConGraficoDinamicoTipoIvaItem;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoIvaItem() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoIvaItem.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoIvaItem .setBorder(borderResaltar);		
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
		this.tipoivaitemSessionBean=new TipoIvaItemSessionBean();
		
		this.tipoivaitemSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoivaitemSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoivaitemSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIvaItemJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIvaItemJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Iva Item MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoIvaItemJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoIvaItem No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoIvaItem= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"nuevo","nuevo","Nuevo"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"duplicar","duplicar","Duplicar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"copiar","copiar","Copiar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"ver_form","ver_form","Ver"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"recargar","recargar","Recargar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoIvaItem=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoIvaItem,this.jTtoolBarTipoIvaItem,
							"cerrar","cerrar","Salir"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoIvaItem=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoIvaItem;
			
				this.jButtonProcesarInformacionToolBarTipoIvaItem=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoIvaItem;
				
		//protected JButton jButtonModificarToolBarTipoIvaItem;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoIvaItem=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoIvaItem=new JMenuMe("General");
		this.jmenuArchivoTipoIvaItem=new JMenuMe("Archivo");
		this.jmenuAccionesTipoIvaItem=new JMenuMe("Acciones");
		this.jmenuDatosTipoIvaItem=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIvaItem= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIvaItem.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIvaItem,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoIvaItem= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoIvaItem.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoIvaItem,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoIvaItem= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoIvaItem.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoIvaItem,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoIvaItem= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIvaItem.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIvaItem,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoIvaItem= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoIvaItem.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoIvaItem,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoIvaItem= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoIvaItem.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoIvaItem,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoIvaItem= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoIvaItem.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoIvaItem,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIvaItem= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIvaItem.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIvaItem,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoIvaItem= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoIvaItem.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoIvaItem,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoIvaItem= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoIvaItem.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoIvaItem,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoIvaItem= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoIvaItem.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoIvaItem,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoIvaItem= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoIvaItem.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoIvaItem,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoIvaItem= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoIvaItem.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoIvaItem,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIvaItem= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIvaItem.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIvaItem,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoIvaItem= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoIvaItem.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoIvaItem,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIvaItem= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIvaItem.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIvaItem,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoIvaItem= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoIvaItem.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoIvaItem,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoIvaItem.add(this.jMenuItemCerrarTipoIvaItem);
			
			this.jmenuAccionesTipoIvaItem.add(this.jMenuItemNuevoTipoIvaItem);
			this.jmenuAccionesTipoIvaItem.add(this.jMenuItemNuevoGuardarCambiosTipoIvaItem);
			this.jmenuAccionesTipoIvaItem.add(this.jMenuItemNuevoRelacionesTipoIvaItem);
			this.jmenuAccionesTipoIvaItem.add(this.jMenuItemGuardarCambiosTablaTipoIvaItem);		
			this.jmenuAccionesTipoIvaItem.add(this.jMenuItemDuplicarTipoIvaItem);		
			this.jmenuAccionesTipoIvaItem.add(this.jMenuItemCopiarTipoIvaItem);		
			this.jmenuAccionesTipoIvaItem.add(this.jMenuItemVerFormTipoIvaItem);		
			
			this.jmenuDatosTipoIvaItem.add(this.jMenuItemRecargarInformacionTipoIvaItem);				
			this.jmenuDatosTipoIvaItem.add(this.jMenuItemAnterioresTipoIvaItem);				
			this.jmenuDatosTipoIvaItem.add(this.jMenuItemSiguientesTipoIvaItem);				
			this.jmenuDatosTipoIvaItem.add(this.jMenuItemAbrirOrderByTipoIvaItem);				
			this.jmenuDatosTipoIvaItem.add(this.jMenuItemMostrarOcultarTipoIvaItem);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoIvaItem.add(this.jMenuItemGuardarCambiosTipoIvaItem);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoIvaItem.add(this.jmenuArchivoTipoIvaItem);		
			this.jmenuBarTipoIvaItem.add(this.jmenuAccionesTipoIvaItem);		
			this.jmenuBarTipoIvaItem.add(this.jmenuDatosTipoIvaItem);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoIvaItem);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoIvaItem() {
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
			//this.jInternalFrameDetalleTipoIvaItem = new TipoIvaItemDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Iva Item DATOS");
			this.jInternalFrameDetalleFormTipoIvaItem = new TipoIvaItemDetalleFormJInternalFrame(jDesktopPane,this.tipoivaitemSessionBean.getConGuardarRelaciones(),this.tipoivaitemSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoIvaItem = null;//new TipoIvaItemDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIvaItem= new GridBagLayout();
		
		
		this.jTableDatosTipoIvaItem = new JTableMe();      
		
		String sToolTipTipoIvaItem="";
		sToolTipTipoIvaItem=TipoIvaItemConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIvaItem+="(Inventario.TipoIvaItem)";
		}
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIvaItem+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoIvaItem.setToolTipText(sToolTipTipoIvaItem);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoIvaItem);
		this.jTableDatosTipoIvaItem.setAutoCreateRowSorter(true);
		this.jTableDatosTipoIvaItem.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoIvaItem.setRowSelectionAllowed(true);
		this.jTableDatosTipoIvaItem.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoIvaItem,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoIvaItem = new JButtonMe();
		this.jButtonDuplicarTipoIvaItem = new JButtonMe();
		this.jButtonCopiarTipoIvaItem = new JButtonMe();
		this.jButtonVerFormTipoIvaItem = new JButtonMe();
		this.jButtonNuevoRelacionesTipoIvaItem = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoIvaItem = new JButtonMe();
		this.jButtonCerrarTipoIvaItem = new JButtonMe();
		
		this.jScrollPanelDatosTipoIvaItem = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoIvaItem = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Iva Item";
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Iva Itemes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIvaItem.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIvaItem.setToolTipText("Acciones");
        this.jPanelAccionesTipoIvaItem.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoIvaItem=new ReporteDinamicoJInternalFrame(TipoIvaItemConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoIvaItem();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoIvaItem=new ImportacionJInternalFrame(TipoIvaItemConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoIvaItem();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoIvaItem = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoIvaItem.setText("Orden");
		this.jButtonAbrirOrderByTipoIvaItem.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIvaItem,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIvaItem=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIvaItem,false,this);
			
			//this.cargarOrderByTipoIvaItem(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIvaItem=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIvaItem,true,this);
			
			//this.cargarOrderByTipoIvaItem(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoIvaItem.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIvaItem.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIvaItem.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoIvaItem.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIvaItem.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIvaItem.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoIvaItem.setText("Nuevo");
		this.jButtonDuplicarTipoIvaItem.setText("Duplicar");
		this.jButtonCopiarTipoIvaItem.setText("Copiar");
		this.jButtonVerFormTipoIvaItem.setText("Ver");
		this.jButtonNuevoRelacionesTipoIvaItem.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoIvaItem.setText("Guardar");
		this.jButtonCerrarTipoIvaItem.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIvaItem,"nuevo_button","Nuevo",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoIvaItem,"duplicar_button","Duplicar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoIvaItem,"copiar_button","Copiar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoIvaItem,"ver_form","Ver",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoIvaItem,"nuevorelaciones_button","Nuevo Rel",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIvaItem,"guardarcambiostabla_button","Guardar",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIvaItem,"cerrar_button","Salir",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoIvaItem.setToolTipText("Nuevo"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoIvaItem.setToolTipText("Duplicar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoIvaItem.setToolTipText("Copiar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoIvaItem.setToolTipText("Ver"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoIvaItem.setToolTipText("Nuevo Rel"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoIvaItem.setToolTipText("Guardar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIvaItem.setToolTipText("Salir"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIvaItem";
		inputMap = this.jButtonNuevoTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIvaItem.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIvaItem"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoIvaItem";
		inputMap = this.jButtonDuplicarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoIvaItem.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoIvaItem"));
		
		//COPIAR
		sMapKey = "CopiarTipoIvaItem";
		inputMap = this.jButtonCopiarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoIvaItem.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoIvaItem"));
		
		//VEr FORM
		sMapKey = "VerFormTipoIvaItem";
		inputMap = this.jButtonVerFormTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoIvaItem.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoIvaItem"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoIvaItem";
		inputMap = this.jButtonNuevoRelacionesTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoIvaItem"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoIvaItem";
		inputMap = this.jButtonModificarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoIvaItem"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoIvaItem";
		inputMap = this.jButtonCerrarTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIvaItem"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIvaItem";
		inputMap = this.jButtonGuardarCambiosTablaTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIvaItem"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoIvaItem= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoIvaItem= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoIvaItem= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoIvaItem= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoIvaItem= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoIvaItem.setName("jPanelParametrosReportesTipoIvaItem"); 
		
		this.jPanelParametrosReportesAccionesTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoIvaItem.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoIvaItem.setName("jPanelParametrosReportesAccionesTipoIvaItem"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoIvaItem = new JButtonMe();
		this.jButtonRecargarInformacionTipoIvaItem.setText("Recargar");
		this.jButtonRecargarInformacionTipoIvaItem.setToolTipText("Recargar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoIvaItem,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoIvaItem = new JButtonMe();
		this.jButtonProcesarInformacionTipoIvaItem.setText("Procesar");
		this.jButtonProcesarInformacionTipoIvaItem.setToolTipText("Procesar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoIvaItem.setVisible(false);
			
		this.jButtonProcesarInformacionTipoIvaItem.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIvaItem.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIvaItem.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIvaItem.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoIvaItem.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIvaItem.setText("TIPO");       
		this.jComboBoxTiposReportesTipoIvaItem.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIvaItem.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoIvaItem.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoIvaItem.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoIvaItem.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoIvaItem.setText("Accion");
		this.jComboBoxTiposRelacionesTipoIvaItem.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIvaItem.setText("Accion");
		this.jComboBoxTiposAccionesTipoIvaItem.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoIvaItem = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoIvaItem.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoIvaItem.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoIvaItem=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoIvaItem.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIvaItem.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIvaItem.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoIvaItem = new JLabelMe();
		
		this.jLabelAccionesTipoIvaItem.setText("Acciones");		
		this.jLabelAccionesTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoIvaItem = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoIvaItem.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoIvaItem.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoIvaItem = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoIvaItem.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoIvaItem.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoIvaItem = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoIvaItem.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoIvaItem.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoIvaItem = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoIvaItem.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoIvaItem.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoIvaItem = new JButtonMe();
		//this.jButtonAnterioresTipoIvaItem.setText("<<");
        this.jButtonAnterioresTipoIvaItem.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoIvaItem,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoIvaItem = new JButtonMe();
		//this.jButtonSiguientesTipoIvaItem.setText(">>");
        this.jButtonSiguientesTipoIvaItem.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoIvaItem,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoIvaItem = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoIvaItem.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoIvaItem.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoIvaItem,"nuevoguardarcambios_button","Nue",this.tipoivaitemSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoIvaItem";
		inputMap = this.jButtonNuevoGuardarCambiosTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoIvaItem"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoIvaItem";
		inputMap = this.jButtonRecargarInformacionTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoIvaItem"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoIvaItem";
		inputMap = this.jButtonSiguientesTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoIvaItem"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoIvaItem";
		inputMap = this.jButtonAnterioresTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoIvaItem"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoIvaItem();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoIvaItem.setMinimumSize(new Dimension(this.getWidth(),TipoIvaItemBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIvaItemBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIvaItem.setMaximumSize(new Dimension(this.getWidth(),TipoIvaItemBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIvaItemBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIvaItem.setPreferredSize(new Dimension(this.getWidth(),TipoIvaItemBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIvaItemBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoIvaItem = new GridBagLayout();

			this.jPanelPaginacionTipoIvaItem.setLayout(gridaBagLayoutPaginacionTipoIvaItem);						
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = 0;
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonAnterioresTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
					
						
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIvaItem.gridy = 0;
			
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonNuevoGuardarCambiosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
						
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIvaItem.gridy = 0;
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonSiguientesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = 1;
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonNuevoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
				this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIvaItem.gridy = 1;
				this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoIvaItem.add(this.jButtonNuevoRelacionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			}
			
			
			if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
				this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIvaItem.gridy = 1;
				this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoIvaItem.add(this.jButtonGuardarCambiosTablaTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			}
			
			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = 1;
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonDuplicarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = 1;
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonCopiarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = 1;
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonVerFormTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = 1;
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoIvaItem.add(this.jButtonCerrarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
		
		
		this.jButtonRecargarInformacionTipoIvaItem.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIvaItem.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIvaItem.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoIvaItem.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIvaItem.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIvaItem.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoIvaItem.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIvaItem.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIvaItem.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoIvaItem.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIvaItem.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIvaItem.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoIvaItem.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIvaItem.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIvaItem.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoIvaItem.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIvaItem.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIvaItem.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoIvaItem.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIvaItem.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIvaItem.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoIvaItem.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIvaItem.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIvaItem.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoIvaItem.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIvaItem.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIvaItem.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoIvaItem.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIvaItem.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIvaItem.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoIvaItem.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIvaItem.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIvaItem.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoIvaItem.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIvaItem.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIvaItem.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoIvaItem = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoIvaItem = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoIvaItem = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoIvaItem = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoIvaItem = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoIvaItem = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoIvaItem.setLayout(gridaBagParametrosReportesTipoIvaItem);
			this.jPanelParametrosReportesAccionesTipoIvaItem.setLayout(gridaBagParametrosReportesAccionesTipoIvaItem);
			
			
			this.jPanelParametrosAuxiliar1TipoIvaItem.setLayout(gridaBagParametrosAuxiliar1TipoIvaItem);
			this.jPanelParametrosAuxiliar2TipoIvaItem.setLayout(gridaBagParametrosAuxiliar2TipoIvaItem);
			this.jPanelParametrosAuxiliar3TipoIvaItem.setLayout(gridaBagParametrosAuxiliar3TipoIvaItem);
			this.jPanelParametrosAuxiliar4TipoIvaItem.setLayout(gridaBagParametrosAuxiliar4TipoIvaItem);
			//this.jPanelParametrosAuxiliar5TipoIvaItem.setLayout(gridaBagParametrosAuxiliar2TipoIvaItem);			
			
			
			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIvaItem.add(this.jButtonRecargarInformacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIvaItem.add(this.jComboBoxTiposPaginacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIvaItem.add(this.jCheckBoxConAltoMaximoTablaTipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIvaItem.add(this.jComboBoxTiposArchivosReportesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIvaItem.add(this.jPanelParametrosAuxiliar1TipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIvaItem.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoIvaItem.add(this.jComboBoxTiposReportesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIvaItem.add(this.jPanelParametrosAuxiliar4TipoIvaItem, this.gridBagConstraintsTipoIvaItem);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIvaItem.add(this.jComboBoxTiposReportesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIvaItem.add(this.jCheckBoxGenerarReporteTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIvaItem.add(this.jPanelParametrosAuxiliar2TipoIvaItem, this.gridBagConstraintsTipoIvaItem);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIvaItem.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIvaItem.add(this.jLabelAccionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
				this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoIvaItem.add(this.jButtonAbrirOrderByTipoIvaItem, this.gridBagConstraintsTipoIvaItem);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIvaItem.add(this.jComboBoxTiposSeleccionarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
			
			
			/*
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIvaItem.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIvaItem.add(this.jCheckBoxSeleccionarTodosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIvaItem.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIvaItem.add(this.jCheckBoxSeleccionarTodosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);															
				
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIvaItem.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIvaItem.add(this.jCheckBoxSeleccionadosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIvaItem.add(this.jPanelParametrosAuxiliar3TipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIvaItem.add(this.jComboBoxTiposRelacionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
				
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIvaItem.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIvaItem.add(this.jComboBoxTiposAccionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoIvaItem = new GridBagLayout();

			this.jScrollPanelDatosTipoIvaItem.setLayout(gridaBagLayoutDatosTipoIvaItem);
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = 0;
			this.gridBagConstraintsTipoIvaItem.gridx = 0;
			
			this.jScrollPanelDatosTipoIvaItem.add(this.jTableDatosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoIvaItem.setViewportView(this.jTableDatosTipoIvaItem);
		this.jTableDatosTipoIvaItem.setFillsViewportHeight(true);
		this.jTableDatosTipoIvaItem.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoIvaItem= new GridBagLayout();
		this.jPanelAccionesTipoIvaItem.setLayout(gridaBagLayoutAccionesTipoIvaItem);
		
		
		/*	
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = 0;
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
			
		this.jPanelAccionesTipoIvaItem.add(this.jButtonNuevoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIvaItem = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIvaItem);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();						
			this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIvaItem.gridx = 0;		
			//this.gridBagConstraintsTipoIvaItem.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIvaItem.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoIvaItem, this.gridBagConstraintsTipoIvaItem);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoIvaItem.gridx = 0;		
		//this.gridBagConstraintsTipoIvaItem.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoIvaItem.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoIvaItem);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);								
		
		
		/*
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		*/		
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIvaItem.gridx =0;
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIvaItem.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
				
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoIvaItem= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIvaItem = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoIvaItem.setLayout(gridaBagLayoutBusquedasParametrosTipoIvaItem);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoIvaItem=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIvaItem.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIvaItem.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIvaItem.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
			
			
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
			
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIvaItem.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoIvaItem;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoIvaItem() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoIvaItem = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoIvaItem.setName("jPanelReporteDinamicoTipoIvaItem"); 
		
		this.jPanelReporteDinamicoTipoIvaItem.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIvaItem.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIvaItem.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoIvaItem.setLayout(gridaBagLayoutReporteDinamicoTipoIvaItem);
		
		
		this.jInternalFrameReporteDinamicoTipoIvaItem= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoIvaItem = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIvaItem= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoIvaItem.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoIvaItem.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoIvaItem.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoIvaItem.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoIvaItem.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoIvaItem.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoIvaItem.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoIvaItem.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoIvaItem.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIvaItem.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIvaItem.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Iva Itemes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoIvaItem = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoIvaItem.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jLabelColumnasSelectReporteTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoIvaItem = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoIvaItem.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoIvaItem.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoIvaItem.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIvaItem.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIvaItem.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoIvaItem=new JScrollPane(this.jListColumnasSelectReporteTipoIvaItem);
			
			this.jScrollColumnasSelectReporteTipoIvaItem.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIvaItem.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIvaItem.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIvaItem.add(this.jListColumnasSelectReporteTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jScrollColumnasSelectReporteTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoIvaItem = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoIvaItem.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jLabelRelacionesSelectReporteTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoIvaItem = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoIvaItem.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoIvaItem.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoIvaItem.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIvaItem.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIvaItem.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoIvaItem=new JScrollPane(this.jListRelacionesSelectReporteTipoIvaItem);
			
			this.jScrollRelacionesSelectReporteTipoIvaItem.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIvaItem.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIvaItem.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIvaItem.add(this.jListRelacionesSelectReporteTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jScrollRelacionesSelectReporteTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoIvaItem = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoIvaItem = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoIvaItem = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoIvaItem = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoIvaItem.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoIvaItem.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIvaItem.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIvaItem.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoIvaItem = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoIvaItem.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jLabelGenerarExcelReporteDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoIvaItem = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoIvaItem.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoIvaItem,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoIvaItem.setToolTipText("Generar EXCEL"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		//this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoIvaItem.add(this.jButtonGenerarExcelReporteDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jComboBoxTiposReportesDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoIvaItem = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoIvaItem.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jLabelTiposArchivoReporteDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jComboBoxTiposArchivosReportesDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoIvaItem = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoIvaItem.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoIvaItem,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoIvaItem.setToolTipText("Generar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jButtonGenerarReporteDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoIvaItem = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoIvaItem.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoIvaItem,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoIvaItem.setToolTipText("Cancelar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIvaItem.add(this.jButtonCerrarReporteDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoIvaItem = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoIvaItem= new JScrollPane(jPanelReporteDinamicoTipoIvaItem,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoIvaItem.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIvaItem.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIvaItem.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Iva Itemes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoIvaItem.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoIvaItem.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoIvaItem.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoIvaItem);
		this.jInternalFrameReporteDinamicoTipoIvaItem.getContentPane().add(this.jScrollPanelReporteDinamicoTipoIvaItem, this.gridBagConstraintsTipoIvaItem);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoIvaItem() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoIvaItem = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoIvaItem.setName("jPanelImportacionTipoIvaItem"); 
		
		this.jPanelImportacionTipoIvaItem.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIvaItem.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIvaItem.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoIvaItem.setLayout(gridaBagLayoutImportacionTipoIvaItem);
		
		
		this.jInternalFrameImportacionTipoIvaItem= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoIvaItem= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoIvaItem = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIvaItem= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoIvaItem.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIvaItem.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIvaItem.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoIvaItem.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIvaItem.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIvaItem.setResizable(true);
	    this.jInternalFrameImportacionTipoIvaItem.setClosable(true);
	    this.jInternalFrameImportacionTipoIvaItem.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoIvaItem.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIvaItem.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIvaItem.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoIvaItem.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIvaItem.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIvaItem.setResizable(true);
	    this.jInternalFrameImportacionTipoIvaItem.setClosable(true);
	    this.jInternalFrameImportacionTipoIvaItem.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoIvaItem.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIvaItem.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIvaItem.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Iva Itemes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoIvaItem = new JLabelMe();

		this.jLabelArchivoImportacionTipoIvaItem.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIvaItem.add(this.jLabelArchivoImportacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoIvaItem = new JFileChooser();		
		this.jFileChooserImportacionTipoIvaItem.setToolTipText("ESCOGER ARCHIVO"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoIvaItem = new JButtonMe();
		this.jButtonAbrirImportacionTipoIvaItem.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoIvaItem,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoIvaItem.setToolTipText("Generar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIvaItem.add(this.jButtonAbrirImportacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoIvaItem = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoIvaItem.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoIvaItem.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIvaItem.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIvaItem.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIvaItem.add(this.jLabelPathArchivoImportacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoIvaItem=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoIvaItem.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIvaItem.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIvaItem.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIvaItem.add(this.jTextFieldPathArchivoImportacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoIvaItem = new JButtonMe();
		this.jButtonGenerarImportacionTipoIvaItem.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoIvaItem,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoIvaItem.setToolTipText("Generar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIvaItem.add(this.jButtonGenerarImportacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoIvaItem = new JButtonMe();
		this.jButtonCerrarImportacionTipoIvaItem.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoIvaItem,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoIvaItem.setToolTipText("Cancelar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIvaItem.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIvaItem.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIvaItem.add(this.jButtonCerrarImportacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoIvaItem = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoIvaItem= new JScrollPane(jPanelImportacionTipoIvaItem,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
		this.gridBagConstraintsTipoIvaItem.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoIvaItem.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoIvaItem.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoIvaItem.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoIvaItem);
		this.jInternalFrameImportacionTipoIvaItem.getContentPane().add(this.jScrollPanelImportacionTipoIvaItem, this.gridBagConstraintsTipoIvaItem);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoIvaItem(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoIvaItem = new JButtonMe();
			this.jButtonAbrirOrderByTipoIvaItem.setText("Orden");
			this.jButtonAbrirOrderByTipoIvaItem.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIvaItem,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoIvaItem";
			inputMap = this.jButtonAbrirOrderByTipoIvaItem.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoIvaItem.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoIvaItem"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoIvaItem = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoIvaItem = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoIvaItem.setName("jPanelOrderByTipoIvaItem"); 
			
			this.jPanelOrderByTipoIvaItem.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIvaItem.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIvaItem.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoIvaItem.setLayout(gridaBagLayoutOrderByTipoIvaItem);
			
			
			this.jTableDatosTipoIvaItemOrderBy = new JTableMe();        
			this.jTableDatosTipoIvaItemOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoIvaItemOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoIvaItemOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoIvaItemOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoIvaItemOrderBy.setViewportView(this.jTableDatosTipoIvaItemOrderBy);
			this.jTableDatosTipoIvaItemOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoIvaItemOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoIvaItem= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoIvaItem= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoIvaItem = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoIvaItem= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoIvaItem.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoIvaItem.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoIvaItem.setTitle("Orden");
			this.jInternalFrameOrderByTipoIvaItem.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoIvaItem.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoIvaItem.setResizable(true);
			this.jInternalFrameOrderByTipoIvaItem.setClosable(true);
			this.jInternalFrameOrderByTipoIvaItem.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoIvaItem.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIvaItem.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIvaItem.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoIvaItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Iva Itemes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoIvaItem.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoIvaItem.ipady =150;
				
			this.jPanelOrderByTipoIvaItem.add(jScrollPanelDatosTipoIvaItemOrderBy, this.gridBagConstraintsTipoIvaItem);//this.jTableDatosTipoIvaItemTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoIvaItem = new JButtonMe();
			this.jButtonCerrarOrderByTipoIvaItem.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoIvaItem,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoIvaItem.setToolTipText("Cancelar"+" "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoIvaItem, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIvaItem.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoIvaItem.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoIvaItem.add(this.jButtonCerrarOrderByTipoIvaItem, this.gridBagConstraintsTipoIvaItem);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoIvaItem = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoIvaItem= new JScrollPane(jPanelOrderByTipoIvaItem,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoIvaItem = new GridBagConstraints();
			this.gridBagConstraintsTipoIvaItem.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoIvaItem.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIvaItem.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoIvaItem.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoIvaItem.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoIvaItem);
			
			this.jInternalFrameOrderByTipoIvaItem.getContentPane().add(this.jScrollPanelOrderByTipoIvaItem, this.gridBagConstraintsTipoIvaItem);			
		
		} else {
			this.jButtonAbrirOrderByTipoIvaItem = new JButtonMe();
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
			&& this.tipoivaitemSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoIvaItem.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoIvaItem.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoIvaItem.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoIvaItem.getRowHeight();//TipoIvaItemConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIvaItem.isSelected()) {
					iHeightTable=TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIvaItem.isSelected()) {
					iHeightTable=TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIvaItemConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoIvaItem.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIvaItem.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIvaItem.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoIvaItem.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIvaItem.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIvaItem.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoIvaItem!=null && this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoIvaItem.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoIvaItem.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoIvaItem.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoIvaItem.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIvaItem.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIvaItem.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoivaitemLogic.getTipoIvaItems().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoivaitems.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoIvaItem> TraerTipoIvaItemBeans(List<TipoIvaItem> tipoivaitems,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoIvaItem tipoivaitem:tipoivaitems) {
					
				if(!(TipoIvaItemConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoIvaItemConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoivaitem.setsDetalleGeneralEntityReporte(TipoIvaItemConstantesFunciones.getTipoIvaItemDescripcion(tipoivaitem));
										
						
					
					

					if(tipoivaitem.getDefinicions()!=null && Funciones.existeClass(classes,Definicion.class)) {
						try{tipoivaitem.setdefinicionsDescripcionReporte(new JRBeanCollectionDataSource(DefinicionJInternalFrame.TraerDefinicionBeans(tipoivaitem.getDefinicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoivaitem.setsDetalleGeneralEntityReporte(tipoivaitem.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoivaitembeans.add(tipoivaitembean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoivaitems;
    }
	//PARA REPORTES FIN
}
