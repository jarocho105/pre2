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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.sris.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoTransaccionModuloConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoTransaccionModuloJInternalFrame extends TipoTransaccionModuloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTransaccionModulo;
	
	protected JMenuBar jmenuBarTipoTransaccionModulo;
	
	protected JMenu jmenuTipoTransaccionModulo;
	protected JMenu jmenuDatosTipoTransaccionModulo;
	protected JMenu jmenuArchivoTipoTransaccionModulo;
	protected JMenu jmenuAccionesTipoTransaccionModulo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTransaccionModulo;	
	protected GridBagConstraints gridBagConstraintsTipoTransaccionModulo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTransaccionModuloDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTransaccionModulo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTransaccionModulo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTransaccionModulo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
		
	
	
	public ModuloSessionBean moduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTransaccionModulo> tipotransaccionmodulos;		
	public List<TipoTransaccionModulo> tipotransaccionmodulosEliminados;	
	public List<TipoTransaccionModulo> tipotransaccionmodulosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTransaccionModulo;		
	protected JButton jButtonAbrirOrderByTipoTransaccionModulo;
	
	
	//protected JPanel jPanelOrderByTipoTransaccionModulo;
	//public JScrollPane jScrollPanelOrderByTipoTransaccionModulo;	
	//protected JButton jButtonCerrarOrderByTipoTransaccionModulo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTransaccionModulo;
	public JScrollPane jScrollPanelDatosEdicionTipoTransaccionModulo;
	public JScrollPane jScrollPanelDatosGeneralTipoTransaccionModulo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTransaccionModuloOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTransaccionModulo;
	//public JScrollPane jScrollPanelImportacionTipoTransaccionModulo;
	
	
	
	protected JPanel jPanelAccionesTipoTransaccionModulo;
	
    protected JPanel jPanelPaginacionTipoTransaccionModulo;
    protected JPanel jPanelParametrosReportesTipoTransaccionModulo;
	protected JPanel jPanelParametrosReportesAccionesTipoTransaccionModulo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTransaccionModulo;
	protected JPanel jPanelParametrosAuxiliar2TipoTransaccionModulo;
	protected JPanel jPanelParametrosAuxiliar3TipoTransaccionModulo;
	protected JPanel jPanelParametrosAuxiliar4TipoTransaccionModulo;
	//protected JPanel jPanelParametrosAuxiliar5TipoTransaccionModulo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTransaccionModulo;
	//protected JPanel jPanelImportacionTipoTransaccionModulo;
	
	
	public JTable jTableDatosTipoTransaccionModulo;
	
	
	
	//public JTable jTableDatosTipoTransaccionModuloOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTransaccionModulo;
	protected JButton jButtonDuplicarTipoTransaccionModulo;
	protected JButton jButtonCopiarTipoTransaccionModulo;
	protected JButton jButtonVerFormTipoTransaccionModulo;
	protected JButton jButtonNuevoRelacionesTipoTransaccionModulo;
	protected JButton jButtonModificarTipoTransaccionModulo;
	
    protected JButton jButtonGuardarCambiosTablaTipoTransaccionModulo;
	protected JButton jButtonCerrarTipoTransaccionModulo;
	
	
	protected JButton jButtonRecargarInformacionTipoTransaccionModulo;
	protected JButton jButtonProcesarInformacionTipoTransaccionModulo;
	
	
	protected JButton jButtonAnterioresTipoTransaccionModulo;
	protected JButton jButtonSiguientesTipoTransaccionModulo;
	protected JButton jButtonNuevoGuardarCambiosTipoTransaccionModulo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTransaccionModulo;
	//protected JButton jButtonCerrarReporteDinamicoTipoTransaccionModulo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTransaccionModulo;
	//protected JButton jButtonGenerarImportacionTipoTransaccionModulo;
	//protected JButton jButtonCerrarImportacionTipoTransaccionModulo;
	//protected JFileChooser jFileChooserImportacionTipoTransaccionModulo;
	//protected File fileImportacionTipoTransaccionModulo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTransaccionModulo;
	protected JButton jButtonDuplicarToolBarTipoTransaccionModulo;
	protected JButton jButtonNuevoRelacionesToolBarTipoTransaccionModulo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTransaccionModulo;
	protected JButton jButtonCopiarToolBarTipoTransaccionModulo;
	protected JButton jButtonVerFormToolBarTipoTransaccionModulo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTransaccionModulo;
	protected JButton jButtonCerrarToolBarTipoTransaccionModulo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTransaccionModulo;
	protected JButton jButtonProcesarInformacionToolBarTipoTransaccionModulo;
	protected JButton jButtonAnterioresToolBarTipoTransaccionModulo;
	protected JButton jButtonSiguientesToolBarTipoTransaccionModulo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTransaccionModulo;
	protected JButton jButtonAbrirOrderByToolBarTipoTransaccionModulo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTransaccionModulo;
	protected JMenuItem jMenuItemDuplicarTipoTransaccionModulo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTransaccionModulo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTransaccionModulo;
	protected JMenuItem jMenuItemCopiarTipoTransaccionModulo;
	protected JMenuItem jMenuItemVerFormTipoTransaccionModulo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTransaccionModulo;
	protected JMenuItem jMenuItemCerrarTipoTransaccionModulo;
	protected JMenuItem jMenuItemDetalleCerrarTipoTransaccionModulo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTransaccionModulo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTransaccionModulo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTransaccionModulo;
	protected JMenuItem jMenuItemProcesarInformacionTipoTransaccionModulo;
	protected JMenuItem jMenuItemAnterioresTipoTransaccionModulo;
	protected JMenuItem jMenuItemSiguientesTipoTransaccionModulo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTransaccionModulo;
	protected JMenuItem jMenuItemAbrirOrderByTipoTransaccionModulo;
	protected JMenuItem jMenuItemMostrarOcultarTipoTransaccionModulo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTransaccionModulo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTransaccionModulo;
	protected JCheckBox jCheckBoxSeleccionadosTipoTransaccionModulo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTransaccionModulo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTransaccionModulo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTransaccionModulo;
	protected JTextField jTextFieldValorCampoGeneralTipoTransaccionModulo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTransaccionModulo;
	//public JList<Reporte> jListColumnasSelectReporteTipoTransaccionModulo;
	//public JScrollPane jScrollColumnasSelectReporteTipoTransaccionModulo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTransaccionModulo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTransaccionModulo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTransaccionModulo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTransaccionModulo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTransaccionModulo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTransaccionModulo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTransaccionModulo;
	
		
	//public JLabel jLabelArchivoImportacionTipoTransaccionModulo;	
	//public JLabel jLabelPathArchivoImportacionTipoTransaccionModulo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTransaccionModulo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTransaccionModulo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTransaccionModulo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTransaccionModulo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTransaccionModulo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTransaccionModulo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTransaccionModulo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTransaccionModulo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTransaccionModulo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTransaccionModulo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoTransaccionModulo;
	public JPanel jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	public JButton jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	public JPanel jPanelBusquedaPorNombreTipoTransaccionModulo;
	public JButton jButtonBusquedaPorNombreTipoTransaccionModulo;
	public JPanel jPanelFK_IdModuloTipoTransaccionModulo;
	public JButton jButtonFK_IdModuloTipoTransaccionModulo;
	
	public JPanel jPanelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	public JLabel jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	public JButton jButtonid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModuloUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	public JLabel jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	public JTextArea jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo;
	public JButton jButtonnombreBusquedaPorIdModuloPorNombreTipoTransaccionModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoTransaccionModulo;
	public JLabel jLabelnombreBusquedaPorNombreTipoTransaccionModulo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoTransaccionModulo;
	public JButton jButtonnombreBusquedaPorNombreTipoTransaccionModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloFK_IdModuloTipoTransaccionModulo;
	public JLabel jLabelid_moduloFK_IdModuloTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo;
	public JButton jButtonid_moduloFK_IdModuloTipoTransaccionModulo= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoTransaccionModuloUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoTransaccionModuloBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoTransaccionModuloJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaccionModuloJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaccionModuloJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaccionModuloJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTransaccionModulo)	{
		this.jButtonRecargarInformacionTipoTransaccionModulo = jButtonRecargarInformacionTipoTransaccionModulo;
	}
	
	public JButton getjButtonProcesarInformacionTipoTransaccionModulo() {
		return this.jButtonProcesarInformacionTipoTransaccionModulo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTransaccionModulo)	{
		this.jButtonProcesarInformacionTipoTransaccionModulo = jButtonProcesarInformacionTipoTransaccionModulo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTransaccionModulo() {
		return this.jButtonRecargarInformacionTipoTransaccionModulo;
	}
	
	
	public List<TipoTransaccionModulo> gettipotransaccionmodulos() {
		return this.tipotransaccionmodulos;
	}

	public void settipotransaccionmodulos(List<TipoTransaccionModulo> tipotransaccionmodulos) {
		this.tipotransaccionmodulos = tipotransaccionmodulos;
	}
	
	public List<TipoTransaccionModulo> gettipotransaccionmodulosAux() {
		return this.tipotransaccionmodulosAux;
	}

	public void settipotransaccionmodulosAux(List<TipoTransaccionModulo> tipotransaccionmodulosAux) {
		this.tipotransaccionmodulosAux = tipotransaccionmodulosAux;
	}
	
	public List<TipoTransaccionModulo> gettipotransaccionmodulosEliminados() {
		return this.tipotransaccionmodulosEliminados;
	}

	public void setTipoTransaccionModulosEliminados(List<TipoTransaccionModulo> tipotransaccionmodulosEliminados) {
		this.tipotransaccionmodulosEliminados = tipotransaccionmodulosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTransaccionModulo() {
		return jComboBoxTiposSeleccionarTipoTransaccionModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTransaccionModulo(
			JComboBox jComboBoxTiposSeleccionarTipoTransaccionModulo) {
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo = jComboBoxTiposSeleccionarTipoTransaccionModulo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTransaccionModulo() {
		return jTextFieldValorCampoGeneralTipoTransaccionModulo;
	}

	public void setjTextFieldValorCampoGeneralTipoTransaccionModulo(
			JTextField jTextFieldValorCampoGeneralTipoTransaccionModulo) {
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo = jTextFieldValorCampoGeneralTipoTransaccionModulo;
	}

	public void setBorderResaltarValorCampoGeneralTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTransaccionModulo() {
		return this.jCheckBoxSeleccionarTodosTipoTransaccionModulo;
	}

	public void setjCheckBoxSeleccionarTodosTipoTransaccionModulo(
			JCheckBox jCheckBoxSeleccionarTodosTipoTransaccionModulo) {
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo = jCheckBoxSeleccionarTodosTipoTransaccionModulo;
	}

	public void setBorderResaltarSeleccionarTodosTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTransaccionModulo() {
		return this.jCheckBoxSeleccionadosTipoTransaccionModulo;
	}

	public void setjCheckBoxSeleccionadosTipoTransaccionModulo(
			JCheckBox jCheckBoxSeleccionadosTipoTransaccionModulo) {
		this.jCheckBoxSeleccionadosTipoTransaccionModulo = jCheckBoxSeleccionadosTipoTransaccionModulo;
	}
	
	public void setBorderResaltarSeleccionadosTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTransaccionModulo() {
		return this.jComboBoxTiposArchivosReportesTipoTransaccionModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTransaccionModulo(
			JComboBox jComboBoxTiposArchivosReportesTipoTransaccionModulo) {
		this.jComboBoxTiposArchivosReportesTipoTransaccionModulo = jComboBoxTiposArchivosReportesTipoTransaccionModulo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTransaccionModulo() {
		return this.jComboBoxTiposReportesTipoTransaccionModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTransaccionModulo(
			JComboBox jComboBoxTiposReportesTipoTransaccionModulo) {
		this.jComboBoxTiposReportesTipoTransaccionModulo = jComboBoxTiposReportesTipoTransaccionModulo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTransaccionModulo() {
	//	return jComboBoxTiposReportesDinamicoTipoTransaccionModulo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTransaccionModulo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTransaccionModulo) {
	//	this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo = jComboBoxTiposReportesDinamicoTipoTransaccionModulo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo = jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo;
	//}
	
	public void setBorderResaltarTiposReportesTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTransaccionModulo() {
		return this.jComboBoxTiposGraficosReportesTipoTransaccionModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTransaccionModulo(
			JComboBox jComboBoxTiposGraficosReportesTipoTransaccionModulo) {
		this.jComboBoxTiposGraficosReportesTipoTransaccionModulo = jComboBoxTiposGraficosReportesTipoTransaccionModulo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTransaccionModulo() {
		return this.jComboBoxTiposPaginacionTipoTransaccionModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTransaccionModulo(
			JComboBox jComboBoxTiposPaginacionTipoTransaccionModulo) {
		this.jComboBoxTiposPaginacionTipoTransaccionModulo = jComboBoxTiposPaginacionTipoTransaccionModulo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTransaccionModulo() {
		return this.jComboBoxTiposRelacionesTipoTransaccionModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTransaccionModulo() {
		return this.jComboBoxTiposAccionesTipoTransaccionModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTransaccionModulo(
			JComboBox jComboBoxTiposRelacionesTipoTransaccionModulo) {
		this.jComboBoxTiposRelacionesTipoTransaccionModulo = jComboBoxTiposRelacionesTipoTransaccionModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTransaccionModulo(
			JComboBox jComboBoxTiposAccionesTipoTransaccionModulo) {
		this.jComboBoxTiposAccionesTipoTransaccionModulo = jComboBoxTiposAccionesTipoTransaccionModulo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTransaccionModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTransaccionModulo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTransaccionModulo() {
	//	return jCheckBoxConGraficoDinamicoTipoTransaccionModulo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTransaccionModulo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTransaccionModulo) {
	//	this.jCheckBoxConGraficoDinamicoTipoTransaccionModulo = jCheckBoxConGraficoDinamicoTipoTransaccionModulo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTransaccionModulo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTransaccionModulo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTransaccionModulo .setBorder(borderResaltar);		
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
		this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
		
		this.tipotransaccionmoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotransaccionmoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTransaccionModuloJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTransaccionModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTransaccionModuloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTransaccionModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTransaccionModuloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Transaccion Modulo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTransaccionModuloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTransaccionModulo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"nuevo","nuevo","Nuevo"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"duplicar","duplicar","Duplicar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"copiar","copiar","Copiar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"ver_form","ver_form","Ver"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"recargar","recargar","Recargar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTransaccionModulo,this.jTtoolBarTipoTransaccionModulo,
							"cerrar","cerrar","Salir"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTransaccionModulo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTransaccionModulo;
			
				this.jButtonProcesarInformacionToolBarTipoTransaccionModulo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTransaccionModulo;
				
		//protected JButton jButtonModificarToolBarTipoTransaccionModulo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTransaccionModulo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTransaccionModulo=new JMenuMe("General");
		this.jmenuArchivoTipoTransaccionModulo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTransaccionModulo=new JMenuMe("Acciones");
		this.jmenuDatosTipoTransaccionModulo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTransaccionModulo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTransaccionModulo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTransaccionModulo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTransaccionModulo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTransaccionModulo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTransaccionModulo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTransaccionModulo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTransaccionModulo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTransaccionModulo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTransaccionModulo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTransaccionModulo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTransaccionModulo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTransaccionModulo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTransaccionModulo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTransaccionModulo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTransaccionModulo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTransaccionModulo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTransaccionModulo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTransaccionModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTransaccionModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTransaccionModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTransaccionModulo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTransaccionModulo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTransaccionModulo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTransaccionModulo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTransaccionModulo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTransaccionModulo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTransaccionModulo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTransaccionModulo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTransaccionModulo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTransaccionModulo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTransaccionModulo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTransaccionModulo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTransaccionModulo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTransaccionModulo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTransaccionModulo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTransaccionModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTransaccionModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTransaccionModulo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTransaccionModulo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTransaccionModulo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTransaccionModulo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTransaccionModulo.add(this.jMenuItemCerrarTipoTransaccionModulo);
			
			this.jmenuAccionesTipoTransaccionModulo.add(this.jMenuItemNuevoTipoTransaccionModulo);
			this.jmenuAccionesTipoTransaccionModulo.add(this.jMenuItemNuevoGuardarCambiosTipoTransaccionModulo);
			this.jmenuAccionesTipoTransaccionModulo.add(this.jMenuItemNuevoRelacionesTipoTransaccionModulo);
			this.jmenuAccionesTipoTransaccionModulo.add(this.jMenuItemGuardarCambiosTablaTipoTransaccionModulo);		
			this.jmenuAccionesTipoTransaccionModulo.add(this.jMenuItemDuplicarTipoTransaccionModulo);		
			this.jmenuAccionesTipoTransaccionModulo.add(this.jMenuItemCopiarTipoTransaccionModulo);		
			this.jmenuAccionesTipoTransaccionModulo.add(this.jMenuItemVerFormTipoTransaccionModulo);		
			
			this.jmenuDatosTipoTransaccionModulo.add(this.jMenuItemRecargarInformacionTipoTransaccionModulo);				
			this.jmenuDatosTipoTransaccionModulo.add(this.jMenuItemAnterioresTipoTransaccionModulo);				
			this.jmenuDatosTipoTransaccionModulo.add(this.jMenuItemSiguientesTipoTransaccionModulo);				
			this.jmenuDatosTipoTransaccionModulo.add(this.jMenuItemAbrirOrderByTipoTransaccionModulo);				
			this.jmenuDatosTipoTransaccionModulo.add(this.jMenuItemMostrarOcultarTipoTransaccionModulo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTransaccionModulo.add(this.jMenuItemGuardarCambiosTipoTransaccionModulo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTransaccionModulo.add(this.jmenuArchivoTipoTransaccionModulo);		
			this.jmenuBarTipoTransaccionModulo.add(this.jmenuAccionesTipoTransaccionModulo);		
			this.jmenuBarTipoTransaccionModulo.add(this.jmenuDatosTipoTransaccionModulo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTransaccionModulo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTransaccionModulo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setToolTipText("Buscar Por Modulo Por Nombre ");
		this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo= new JButtonMe();
		this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setText("Buscar");
		this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setToolTipText("Buscar Por Modulo Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo,"buscar_button","Buscar Por Modulo Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo = new JLabelMe();
		jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo = new JLabelMe();
		jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setText("Nombre :");
		jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo= new JTextAreaMe();
		jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoTransaccionModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoTransaccionModulo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoTransaccionModulo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoTransaccionModulo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoTransaccionModulo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoTransaccionModulo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoTransaccionModulo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoTransaccionModulo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoTransaccionModulo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoTransaccionModulo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModuloTipoTransaccionModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloTipoTransaccionModulo.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloTipoTransaccionModulo= new JButtonMe();
		this.jButtonFK_IdModuloTipoTransaccionModulo.setText("Buscar");
		this.jButtonFK_IdModuloTipoTransaccionModulo.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloTipoTransaccionModulo,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloTipoTransaccionModulo = new JLabelMe();
		jLabelid_moduloFK_IdModuloTipoTransaccionModulo.setText("Modulo :");
		jLabelid_moduloFK_IdModuloTipoTransaccionModulo.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoTransaccionModulo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoTransaccionModulo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTransaccionModulo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTransaccionModulo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoTransaccionModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoTransaccionModulo = new TipoTransaccionModuloDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Transaccion Modulo DATOS");
			this.jInternalFrameDetalleFormTipoTransaccionModulo = new TipoTransaccionModuloDetalleFormJInternalFrame(jDesktopPane,this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones(),this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTransaccionModulo = null;//new TipoTransaccionModuloDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTransaccionModulo= new GridBagLayout();
		
		
		this.jTableDatosTipoTransaccionModulo = new JTableMe();      
		
		String sToolTipTipoTransaccionModulo="";
		sToolTipTipoTransaccionModulo=TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTransaccionModulo+="(Contabilidad.TipoTransaccionModulo)";
		}
		
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTransaccionModulo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTransaccionModulo.setToolTipText(sToolTipTipoTransaccionModulo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTransaccionModulo);
		this.jTableDatosTipoTransaccionModulo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTransaccionModulo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTransaccionModulo.setRowSelectionAllowed(true);
		this.jTableDatosTipoTransaccionModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTransaccionModulo = new JButtonMe();
		this.jButtonDuplicarTipoTransaccionModulo = new JButtonMe();
		this.jButtonCopiarTipoTransaccionModulo = new JButtonMe();
		this.jButtonVerFormTipoTransaccionModulo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTransaccionModulo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo = new JButtonMe();
		this.jButtonCerrarTipoTransaccionModulo = new JButtonMe();
		
		this.jScrollPanelDatosTipoTransaccionModulo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTransaccionModulo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Transaccion Modulo";
		
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transaccion Modulos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTransaccionModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTransaccionModulo.setToolTipText("Acciones");
        this.jPanelAccionesTipoTransaccionModulo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTransaccionModulo=new ReporteDinamicoJInternalFrame(TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTransaccionModulo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTransaccionModulo=new ImportacionJInternalFrame(TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTransaccionModulo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTransaccionModulo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTransaccionModulo.setText("Orden");
		this.jButtonAbrirOrderByTipoTransaccionModulo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTransaccionModulo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTransaccionModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransaccionModulo,false,this);
			
			//this.cargarOrderByTipoTransaccionModulo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTransaccionModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransaccionModulo,true,this);
			
			//this.cargarOrderByTipoTransaccionModulo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTransaccionModulo.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTransaccionModulo.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTransaccionModulo.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoTransaccionModulo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTransaccionModulo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTransaccionModulo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTransaccionModulo.setText("Nuevo");
		this.jButtonDuplicarTipoTransaccionModulo.setText("Duplicar");
		this.jButtonCopiarTipoTransaccionModulo.setText("Copiar");
		this.jButtonVerFormTipoTransaccionModulo.setText("Ver");
		this.jButtonNuevoRelacionesTipoTransaccionModulo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.setText("Guardar");
		this.jButtonCerrarTipoTransaccionModulo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTransaccionModulo,"nuevo_button","Nuevo",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTransaccionModulo,"duplicar_button","Duplicar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTransaccionModulo,"copiar_button","Copiar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTransaccionModulo,"ver_form","Ver",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTransaccionModulo,"nuevorelaciones_button","Nuevo Rel",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTransaccionModulo,"guardarcambiostabla_button","Guardar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTransaccionModulo,"cerrar_button","Salir",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTransaccionModulo.setToolTipText("Nuevo"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTransaccionModulo.setToolTipText("Duplicar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTransaccionModulo.setToolTipText("Copiar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTransaccionModulo.setToolTipText("Ver"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTransaccionModulo.setToolTipText("Nuevo Rel"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.setToolTipText("Guardar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTransaccionModulo.setToolTipText("Salir"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTransaccionModulo";
		inputMap = this.jButtonNuevoTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTransaccionModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTransaccionModulo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTransaccionModulo";
		inputMap = this.jButtonDuplicarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTransaccionModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTransaccionModulo"));
		
		//COPIAR
		sMapKey = "CopiarTipoTransaccionModulo";
		inputMap = this.jButtonCopiarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTransaccionModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTransaccionModulo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTransaccionModulo";
		inputMap = this.jButtonVerFormTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTransaccionModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTransaccionModulo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTransaccionModulo";
		inputMap = this.jButtonNuevoRelacionesTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTransaccionModulo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTransaccionModulo";
		inputMap = this.jButtonModificarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTransaccionModulo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTransaccionModulo";
		inputMap = this.jButtonCerrarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTransaccionModulo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTransaccionModulo";
		inputMap = this.jButtonGuardarCambiosTablaTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTransaccionModulo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTransaccionModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTransaccionModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTransaccionModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTransaccionModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTransaccionModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTransaccionModulo.setName("jPanelParametrosReportesTipoTransaccionModulo"); 
		
		this.jPanelParametrosReportesAccionesTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTransaccionModulo.setName("jPanelParametrosReportesAccionesTipoTransaccionModulo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTransaccionModulo = new JButtonMe();
		this.jButtonRecargarInformacionTipoTransaccionModulo.setText("Recargar");
		this.jButtonRecargarInformacionTipoTransaccionModulo.setToolTipText("Recargar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTransaccionModulo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTransaccionModulo = new JButtonMe();
		this.jButtonProcesarInformacionTipoTransaccionModulo.setText("Procesar");
		this.jButtonProcesarInformacionTipoTransaccionModulo.setToolTipText("Procesar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTransaccionModulo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTransaccionModulo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTransaccionModulo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTransaccionModulo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTransaccionModulo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTransaccionModulo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTransaccionModulo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTransaccionModulo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTransaccionModulo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTransaccionModulo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTransaccionModulo.setText("Accion");
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTransaccionModulo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTransaccionModulo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTransaccionModulo = new JLabelMe();
		
		this.jLabelAccionesTipoTransaccionModulo.setText("Acciones");		
		this.jLabelAccionesTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTransaccionModulo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTransaccionModulo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTransaccionModulo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTransaccionModulo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTransaccionModulo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTransaccionModulo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTransaccionModulo = new JButtonMe();
		//this.jButtonAnterioresTipoTransaccionModulo.setText("<<");
        this.jButtonAnterioresTipoTransaccionModulo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTransaccionModulo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTransaccionModulo = new JButtonMe();
		//this.jButtonSiguientesTipoTransaccionModulo.setText(">>");
        this.jButtonSiguientesTipoTransaccionModulo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTransaccionModulo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTransaccionModulo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTransaccionModulo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTransaccionModulo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTransaccionModulo,"nuevoguardarcambios_button","Nue",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTransaccionModulo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTransaccionModulo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTransaccionModulo";
		inputMap = this.jButtonRecargarInformacionTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTransaccionModulo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTransaccionModulo";
		inputMap = this.jButtonSiguientesTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTransaccionModulo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTransaccionModulo";
		inputMap = this.jButtonAnterioresTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTransaccionModulo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTransaccionModulo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTransaccionModulo.setMinimumSize(new Dimension(this.getWidth(),TipoTransaccionModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTransaccionModuloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTransaccionModulo.setMaximumSize(new Dimension(this.getWidth(),TipoTransaccionModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTransaccionModuloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTransaccionModulo.setPreferredSize(new Dimension(this.getWidth(),TipoTransaccionModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTransaccionModuloBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTransaccionModulo = new GridBagLayout();

			this.jPanelPaginacionTipoTransaccionModulo.setLayout(gridaBagLayoutPaginacionTipoTransaccionModulo);						
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonAnterioresTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
					
						
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
			
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonNuevoGuardarCambiosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
						
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonSiguientesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 1;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonNuevoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
						
			
			
			if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
				this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTransaccionModulo.gridy = 1;
				this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonGuardarCambiosTablaTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			}
			
			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 1;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonDuplicarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 1;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonCopiarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 1;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonVerFormTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 1;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTransaccionModulo.add(this.jButtonCerrarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
		
		
		this.jButtonRecargarInformacionTipoTransaccionModulo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTransaccionModulo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTransaccionModulo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTransaccionModulo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTransaccionModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTransaccionModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTransaccionModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTransaccionModulo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTransaccionModulo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTransaccionModulo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTransaccionModulo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTransaccionModulo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTransaccionModulo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTransaccionModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTransaccionModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTransaccionModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTransaccionModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTransaccionModulo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTransaccionModulo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTransaccionModulo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTransaccionModulo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTransaccionModulo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTransaccionModulo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTransaccionModulo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTransaccionModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTransaccionModulo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTransaccionModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTransaccionModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTransaccionModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTransaccionModulo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTransaccionModulo.setLayout(gridaBagParametrosReportesTipoTransaccionModulo);
			this.jPanelParametrosReportesAccionesTipoTransaccionModulo.setLayout(gridaBagParametrosReportesAccionesTipoTransaccionModulo);
			
			
			this.jPanelParametrosAuxiliar1TipoTransaccionModulo.setLayout(gridaBagParametrosAuxiliar1TipoTransaccionModulo);
			this.jPanelParametrosAuxiliar2TipoTransaccionModulo.setLayout(gridaBagParametrosAuxiliar2TipoTransaccionModulo);
			this.jPanelParametrosAuxiliar3TipoTransaccionModulo.setLayout(gridaBagParametrosAuxiliar3TipoTransaccionModulo);
			this.jPanelParametrosAuxiliar4TipoTransaccionModulo.setLayout(gridaBagParametrosAuxiliar4TipoTransaccionModulo);
			//this.jPanelParametrosAuxiliar5TipoTransaccionModulo.setLayout(gridaBagParametrosAuxiliar2TipoTransaccionModulo);			
			
			
			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jButtonRecargarInformacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTransaccionModulo.add(this.jComboBoxTiposPaginacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTransaccionModulo.add(this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTransaccionModulo.add(this.jComboBoxTiposArchivosReportesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jPanelParametrosAuxiliar1TipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransaccionModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTransaccionModulo.add(this.jComboBoxTiposReportesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jPanelParametrosAuxiliar4TipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jComboBoxTiposReportesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jCheckBoxGenerarReporteTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jPanelParametrosAuxiliar2TipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransaccionModulo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jLabelAccionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
				this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jButtonAbrirOrderByTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jComboBoxTiposSeleccionarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
			
			
			/*
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransaccionModulo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jCheckBoxSeleccionarTodosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransaccionModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTransaccionModulo.add(this.jCheckBoxSeleccionarTodosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);															
				
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransaccionModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTransaccionModulo.add(this.jCheckBoxSeleccionadosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jPanelParametrosAuxiliar3TipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jComboBoxTiposRelacionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
				
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jComboBoxTiposAccionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
	
				
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransaccionModulo.add(this.jTextFieldValorCampoGeneralTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTransaccionModulo = new GridBagLayout();

			this.jScrollPanelDatosTipoTransaccionModulo.setLayout(gridaBagLayoutDatosTipoTransaccionModulo);
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
			
			this.jScrollPanelDatosTipoTransaccionModulo.add(this.jTableDatosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTransaccionModulo.setViewportView(this.jTableDatosTipoTransaccionModulo);
		this.jTableDatosTipoTransaccionModulo.setFillsViewportHeight(true);
		this.jTableDatosTipoTransaccionModulo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTransaccionModulo= new GridBagLayout();
		this.jPanelAccionesTipoTransaccionModulo.setLayout(gridaBagLayoutAccionesTipoTransaccionModulo);
		
		
		/*	
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
			
		this.jPanelAccionesTipoTransaccionModulo.add(this.jButtonNuevoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdModuloPorNombreTipoTransaccionModulo= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdModuloPorNombreTipoTransaccionModulo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorNombreTipoTransaccionModulo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorNombreTipoTransaccionModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdModuloPorNombreTipoTransaccionModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo.setLayout(gridaBagLayoutBusquedaPorIdModuloPorNombreTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		gridBagConstraintsTipoTransaccionModulo.gridx = 0;
		jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo.add(jLabelid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		gridBagConstraintsTipoTransaccionModulo.gridx = 1;
		jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo.add(jComboBoxid_moduloBusquedaPorIdModuloPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);


		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 1;
		gridBagConstraintsTipoTransaccionModulo.gridx = 0;
		jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo.add(jLabelnombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 1;
		gridBagConstraintsTipoTransaccionModulo.gridx = 1;
		jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo.add(jTextAreanombreBusquedaPorIdModuloPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 2;
		gridBagConstraintsTipoTransaccionModulo.gridx =1;
		jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo.add(jButtonBusquedaPorIdModuloPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		jTabbedPaneBusquedasTipoTransaccionModulo.addTab("1.-Por Modulo Por Nombre ", jPanelBusquedaPorIdModuloPorNombreTipoTransaccionModulo);
		jTabbedPaneBusquedasTipoTransaccionModulo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoTransaccionModulo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoTransaccionModulo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoTransaccionModulo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoTransaccionModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoTransaccionModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoTransaccionModulo.setLayout(gridaBagLayoutBusquedaPorNombreTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		gridBagConstraintsTipoTransaccionModulo.gridx = 0;
		jPanelBusquedaPorNombreTipoTransaccionModulo.add(jLabelnombreBusquedaPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		gridBagConstraintsTipoTransaccionModulo.gridx = 1;
		jPanelBusquedaPorNombreTipoTransaccionModulo.add(jTextAreanombreBusquedaPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 1;
		gridBagConstraintsTipoTransaccionModulo.gridx =1;
		jPanelBusquedaPorNombreTipoTransaccionModulo.add(jButtonBusquedaPorNombreTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		jTabbedPaneBusquedasTipoTransaccionModulo.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoTransaccionModulo);
		jTabbedPaneBusquedasTipoTransaccionModulo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdModuloTipoTransaccionModulo= new GridBagLayout();
		gridaBagLayoutFK_IdModuloTipoTransaccionModulo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoTransaccionModulo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoTransaccionModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloTipoTransaccionModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloTipoTransaccionModulo.setLayout(gridaBagLayoutFK_IdModuloTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		gridBagConstraintsTipoTransaccionModulo.gridx = 0;
		jPanelFK_IdModuloTipoTransaccionModulo.add(jLabelid_moduloFK_IdModuloTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		gridBagConstraintsTipoTransaccionModulo.gridx = 1;
		jPanelFK_IdModuloTipoTransaccionModulo.add(jComboBoxid_moduloFK_IdModuloTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTransaccionModulo.gridy = 1;
		gridBagConstraintsTipoTransaccionModulo.gridx =1;
		jPanelFK_IdModuloTipoTransaccionModulo.add(jButtonFK_IdModuloTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);

		jTabbedPaneBusquedasTipoTransaccionModulo.addTab("3.-Por Modulo ", jPanelFK_IdModuloTipoTransaccionModulo);
		jTabbedPaneBusquedasTipoTransaccionModulo.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTransaccionModulo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTransaccionModulo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();						
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;		
			//this.gridBagConstraintsTipoTransaccionModulo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTransaccionModulo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;		
		//this.gridBagConstraintsTipoTransaccionModulo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTransaccionModulo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTransaccionModulo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;		
			this.gridBagConstraintsTipoTransaccionModulo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoTransaccionModulo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);								
		
		
		/*
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		*/		
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTransaccionModulo.gridx =0;
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTransaccionModulo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
				
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTransaccionModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTransaccionModulo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTransaccionModulo.setLayout(gridaBagLayoutBusquedasParametrosTipoTransaccionModulo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTransaccionModulo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			
			
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
			
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTransaccionModulo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTransaccionModulo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTransaccionModulo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTransaccionModulo.setName("jPanelReporteDinamicoTipoTransaccionModulo"); 
		
		this.jPanelReporteDinamicoTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTransaccionModulo.setLayout(gridaBagLayoutReporteDinamicoTipoTransaccionModulo);
		
		
		this.jInternalFrameReporteDinamicoTipoTransaccionModulo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTransaccionModulo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTransaccionModulo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transaccion Modulos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTransaccionModulo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTransaccionModulo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jLabelColumnasSelectReporteTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTransaccionModulo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTransaccionModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTransaccionModulo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTransaccionModulo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTransaccionModulo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTransaccionModulo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTransaccionModulo=new JScrollPane(this.jListColumnasSelectReporteTipoTransaccionModulo);
			
			this.jScrollColumnasSelectReporteTipoTransaccionModulo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTransaccionModulo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTransaccionModulo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jListColumnasSelectReporteTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jScrollColumnasSelectReporteTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTransaccionModulo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTransaccionModulo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTransaccionModulo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTransaccionModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTransaccionModulo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTransaccionModulo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTransaccionModulo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTransaccionModulo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTransaccionModulo=new JScrollPane(this.jListRelacionesSelectReporteTipoTransaccionModulo);
			
			this.jScrollRelacionesSelectReporteTipoTransaccionModulo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTransaccionModulo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTransaccionModulo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoTransaccionModulo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTransaccionModulo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTransaccionModulo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTransaccionModulo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTransaccionModulo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jLabelGenerarExcelReporteDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo.setToolTipText("Generar EXCEL"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jButtonGenerarExcelReporteDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jComboBoxTiposReportesDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTransaccionModulo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTransaccionModulo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jLabelTiposArchivoReporteDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTransaccionModulo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTransaccionModulo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTransaccionModulo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTransaccionModulo.setToolTipText("Generar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jButtonGenerarReporteDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTransaccionModulo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTransaccionModulo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTransaccionModulo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTransaccionModulo.setToolTipText("Cancelar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransaccionModulo.add(this.jButtonCerrarReporteDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTransaccionModulo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTransaccionModulo= new JScrollPane(jPanelReporteDinamicoTipoTransaccionModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transaccion Modulos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransaccionModulo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTransaccionModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTransaccionModulo);
		this.jInternalFrameReporteDinamicoTipoTransaccionModulo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTransaccionModulo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTransaccionModulo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTransaccionModulo.setName("jPanelImportacionTipoTransaccionModulo"); 
		
		this.jPanelImportacionTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTransaccionModulo.setLayout(gridaBagLayoutImportacionTipoTransaccionModulo);
		
		
		this.jInternalFrameImportacionTipoTransaccionModulo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTransaccionModulo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTransaccionModulo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTransaccionModulo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTransaccionModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTransaccionModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTransaccionModulo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTransaccionModulo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTransaccionModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTransaccionModulo.setResizable(true);
	    this.jInternalFrameImportacionTipoTransaccionModulo.setClosable(true);
	    this.jInternalFrameImportacionTipoTransaccionModulo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTransaccionModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTransaccionModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTransaccionModulo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTransaccionModulo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTransaccionModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTransaccionModulo.setResizable(true);
	    this.jInternalFrameImportacionTipoTransaccionModulo.setClosable(true);
	    this.jInternalFrameImportacionTipoTransaccionModulo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transaccion Modulos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTransaccionModulo = new JLabelMe();

		this.jLabelArchivoImportacionTipoTransaccionModulo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTransaccionModulo.add(this.jLabelArchivoImportacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTransaccionModulo = new JFileChooser();		
		this.jFileChooserImportacionTipoTransaccionModulo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTransaccionModulo = new JButtonMe();
		this.jButtonAbrirImportacionTipoTransaccionModulo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTransaccionModulo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTransaccionModulo.setToolTipText("Generar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransaccionModulo.add(this.jButtonAbrirImportacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTransaccionModulo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTransaccionModulo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTransaccionModulo.add(this.jLabelPathArchivoImportacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTransaccionModulo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTransaccionModulo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTransaccionModulo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTransaccionModulo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransaccionModulo.add(this.jTextFieldPathArchivoImportacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTransaccionModulo = new JButtonMe();
		this.jButtonGenerarImportacionTipoTransaccionModulo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTransaccionModulo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTransaccionModulo.setToolTipText("Generar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransaccionModulo.add(this.jButtonGenerarImportacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTransaccionModulo = new JButtonMe();
		this.jButtonCerrarImportacionTipoTransaccionModulo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTransaccionModulo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTransaccionModulo.setToolTipText("Cancelar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransaccionModulo.add(this.jButtonCerrarImportacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTransaccionModulo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTransaccionModulo= new JScrollPane(jPanelImportacionTipoTransaccionModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTransaccionModulo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTransaccionModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTransaccionModulo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTransaccionModulo);
		this.jInternalFrameImportacionTipoTransaccionModulo.getContentPane().add(this.jScrollPanelImportacionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTransaccionModulo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTransaccionModulo = new JButtonMe();
			this.jButtonAbrirOrderByTipoTransaccionModulo.setText("Orden");
			this.jButtonAbrirOrderByTipoTransaccionModulo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTransaccionModulo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTransaccionModulo";
			inputMap = this.jButtonAbrirOrderByTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTransaccionModulo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTransaccionModulo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTransaccionModulo.setName("jPanelOrderByTipoTransaccionModulo"); 
			
			this.jPanelOrderByTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTransaccionModulo.setLayout(gridaBagLayoutOrderByTipoTransaccionModulo);
			
			
			this.jTableDatosTipoTransaccionModuloOrderBy = new JTableMe();        
			this.jTableDatosTipoTransaccionModuloOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTransaccionModuloOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTransaccionModuloOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTransaccionModuloOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTransaccionModuloOrderBy.setViewportView(this.jTableDatosTipoTransaccionModuloOrderBy);
			this.jTableDatosTipoTransaccionModuloOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTransaccionModuloOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTransaccionModulo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTransaccionModulo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTransaccionModulo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTransaccionModulo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTransaccionModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTransaccionModulo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTransaccionModulo.setTitle("Orden");
			this.jInternalFrameOrderByTipoTransaccionModulo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTransaccionModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTransaccionModulo.setResizable(true);
			this.jInternalFrameOrderByTipoTransaccionModulo.setClosable(true);
			this.jInternalFrameOrderByTipoTransaccionModulo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transaccion Modulos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTransaccionModulo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTransaccionModulo.ipady =150;
				
			this.jPanelOrderByTipoTransaccionModulo.add(jScrollPanelDatosTipoTransaccionModuloOrderBy, this.gridBagConstraintsTipoTransaccionModulo);//this.jTableDatosTipoTransaccionModuloTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTransaccionModulo = new JButtonMe();
			this.jButtonCerrarOrderByTipoTransaccionModulo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTransaccionModulo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTransaccionModulo.setToolTipText("Cancelar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTransaccionModulo.add(this.jButtonCerrarOrderByTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTransaccionModulo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTransaccionModulo= new JScrollPane(jPanelOrderByTipoTransaccionModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTransaccionModulo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTransaccionModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTransaccionModulo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTransaccionModulo);
			
			this.jInternalFrameOrderByTipoTransaccionModulo.getContentPane().add(this.jScrollPanelOrderByTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
		
		} else {
			this.jButtonAbrirOrderByTipoTransaccionModulo = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTransaccionModulo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTransaccionModulo.getRowHeight();//TipoTransaccionModuloConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo.isSelected()) {
					iHeightTable=TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTransaccionModulo.isSelected()) {
					iHeightTable=TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTransaccionModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTransaccionModulo!=null && this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTransaccionModulo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTransaccionModulo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTransaccionModulo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTransaccionModulo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipotransaccionmoduloLogic.getTipoTransaccionModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotransaccionmodulos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTransaccionModulo> TraerTipoTransaccionModuloBeans(List<TipoTransaccionModulo> tipotransaccionmodulos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTransaccionModulo tipotransaccionmodulo:tipotransaccionmodulos) {
					
				if(!(TipoTransaccionModuloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTransaccionModuloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipotransaccionmodulo.setsDetalleGeneralEntityReporte(TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmodulo));
										
						
					
						
					
				} else  {
							
					//tipotransaccionmodulo.setsDetalleGeneralEntityReporte(tipotransaccionmodulo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipotransaccionmodulobeans.add(tipotransaccionmodulobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipotransaccionmodulos;
    }
	//PARA REPORTES FIN
}
