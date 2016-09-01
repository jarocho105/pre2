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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoMovimientoModuloConstantesFunciones;

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
public class TipoMovimientoModuloJInternalFrame extends TipoMovimientoModuloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMovimientoModulo;
	
	protected JMenuBar jmenuBarTipoMovimientoModulo;
	
	protected JMenu jmenuTipoMovimientoModulo;
	protected JMenu jmenuDatosTipoMovimientoModulo;
	protected JMenu jmenuArchivoTipoMovimientoModulo;
	protected JMenu jmenuAccionesTipoMovimientoModulo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMovimientoModulo;	
	protected GridBagConstraints gridBagConstraintsTipoMovimientoModulo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMovimientoModuloDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMovimientoModulo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMovimientoModulo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMovimientoModulo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
		
	
	
	public ModuloSessionBean moduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMovimientoModulo> tipomovimientomodulos;		
	public List<TipoMovimientoModulo> tipomovimientomodulosEliminados;	
	public List<TipoMovimientoModulo> tipomovimientomodulosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMovimientoModulo;		
	protected JButton jButtonAbrirOrderByTipoMovimientoModulo;
	
	
	//protected JPanel jPanelOrderByTipoMovimientoModulo;
	//public JScrollPane jScrollPanelOrderByTipoMovimientoModulo;	
	//protected JButton jButtonCerrarOrderByTipoMovimientoModulo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMovimientoModuloLogic tipomovimientomoduloLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMovimientoModulo;
	public JScrollPane jScrollPanelDatosEdicionTipoMovimientoModulo;
	public JScrollPane jScrollPanelDatosGeneralTipoMovimientoModulo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMovimientoModuloOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMovimientoModulo;
	//public JScrollPane jScrollPanelImportacionTipoMovimientoModulo;
	
	
	
	protected JPanel jPanelAccionesTipoMovimientoModulo;
	
    protected JPanel jPanelPaginacionTipoMovimientoModulo;
    protected JPanel jPanelParametrosReportesTipoMovimientoModulo;
	protected JPanel jPanelParametrosReportesAccionesTipoMovimientoModulo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMovimientoModulo;
	protected JPanel jPanelParametrosAuxiliar2TipoMovimientoModulo;
	protected JPanel jPanelParametrosAuxiliar3TipoMovimientoModulo;
	protected JPanel jPanelParametrosAuxiliar4TipoMovimientoModulo;
	//protected JPanel jPanelParametrosAuxiliar5TipoMovimientoModulo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMovimientoModulo;
	//protected JPanel jPanelImportacionTipoMovimientoModulo;
	
	
	public JTable jTableDatosTipoMovimientoModulo;
	
	
	
	//public JTable jTableDatosTipoMovimientoModuloOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMovimientoModulo;
	protected JButton jButtonDuplicarTipoMovimientoModulo;
	protected JButton jButtonCopiarTipoMovimientoModulo;
	protected JButton jButtonVerFormTipoMovimientoModulo;
	protected JButton jButtonNuevoRelacionesTipoMovimientoModulo;
	protected JButton jButtonModificarTipoMovimientoModulo;
	
    protected JButton jButtonGuardarCambiosTablaTipoMovimientoModulo;
	protected JButton jButtonCerrarTipoMovimientoModulo;
	
	
	protected JButton jButtonRecargarInformacionTipoMovimientoModulo;
	protected JButton jButtonProcesarInformacionTipoMovimientoModulo;
	
	
	protected JButton jButtonAnterioresTipoMovimientoModulo;
	protected JButton jButtonSiguientesTipoMovimientoModulo;
	protected JButton jButtonNuevoGuardarCambiosTipoMovimientoModulo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMovimientoModulo;
	//protected JButton jButtonCerrarReporteDinamicoTipoMovimientoModulo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMovimientoModulo;
	//protected JButton jButtonGenerarImportacionTipoMovimientoModulo;
	//protected JButton jButtonCerrarImportacionTipoMovimientoModulo;
	//protected JFileChooser jFileChooserImportacionTipoMovimientoModulo;
	//protected File fileImportacionTipoMovimientoModulo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMovimientoModulo;
	protected JButton jButtonDuplicarToolBarTipoMovimientoModulo;
	protected JButton jButtonNuevoRelacionesToolBarTipoMovimientoModulo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMovimientoModulo;
	protected JButton jButtonCopiarToolBarTipoMovimientoModulo;
	protected JButton jButtonVerFormToolBarTipoMovimientoModulo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMovimientoModulo;
	protected JButton jButtonCerrarToolBarTipoMovimientoModulo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMovimientoModulo;
	protected JButton jButtonProcesarInformacionToolBarTipoMovimientoModulo;
	protected JButton jButtonAnterioresToolBarTipoMovimientoModulo;
	protected JButton jButtonSiguientesToolBarTipoMovimientoModulo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMovimientoModulo;
	protected JButton jButtonAbrirOrderByToolBarTipoMovimientoModulo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMovimientoModulo;
	protected JMenuItem jMenuItemDuplicarTipoMovimientoModulo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMovimientoModulo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMovimientoModulo;
	protected JMenuItem jMenuItemCopiarTipoMovimientoModulo;
	protected JMenuItem jMenuItemVerFormTipoMovimientoModulo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMovimientoModulo;
	protected JMenuItem jMenuItemCerrarTipoMovimientoModulo;
	protected JMenuItem jMenuItemDetalleCerrarTipoMovimientoModulo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMovimientoModulo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMovimientoModulo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMovimientoModulo;
	protected JMenuItem jMenuItemProcesarInformacionTipoMovimientoModulo;
	protected JMenuItem jMenuItemAnterioresTipoMovimientoModulo;
	protected JMenuItem jMenuItemSiguientesTipoMovimientoModulo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMovimientoModulo;
	protected JMenuItem jMenuItemAbrirOrderByTipoMovimientoModulo;
	protected JMenuItem jMenuItemMostrarOcultarTipoMovimientoModulo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMovimientoModulo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMovimientoModulo;
	protected JCheckBox jCheckBoxSeleccionadosTipoMovimientoModulo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMovimientoModulo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMovimientoModulo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMovimientoModulo;
	protected JTextField jTextFieldValorCampoGeneralTipoMovimientoModulo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMovimientoModulo;
	//public JList<Reporte> jListColumnasSelectReporteTipoMovimientoModulo;
	//public JScrollPane jScrollColumnasSelectReporteTipoMovimientoModulo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMovimientoModulo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMovimientoModulo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMovimientoModulo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMovimientoModulo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMovimientoModulo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMovimientoModulo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMovimientoModulo;
	
		
	//public JLabel jLabelArchivoImportacionTipoMovimientoModulo;	
	//public JLabel jLabelPathArchivoImportacionTipoMovimientoModulo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMovimientoModulo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMovimientoModulo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMovimientoModulo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMovimientoModulo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMovimientoModulo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMovimientoModulo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMovimientoModulo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMovimientoModulo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMovimientoModulo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMovimientoModulo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMovimientoModulo;
	public JPanel jPanelBusquedaPorCodigoTipoMovimientoModulo;
	public JButton jButtonBusquedaPorCodigoTipoMovimientoModulo;
	public JPanel jPanelBusquedaPorNombreTipoMovimientoModulo;
	public JButton jButtonBusquedaPorNombreTipoMovimientoModulo;
	public JPanel jPanelFK_IdModuloTipoMovimientoModulo;
	public JButton jButtonFK_IdModuloTipoMovimientoModulo;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoMovimientoModulo;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo;
	public JButton jButtoncodigoBusquedaPorCodigoTipoMovimientoModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoMovimientoModulo;
	public JLabel jLabelnombreBusquedaPorNombreTipoMovimientoModulo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoMovimientoModulo;
	public JButton jButtonnombreBusquedaPorNombreTipoMovimientoModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloFK_IdModuloTipoMovimientoModulo;
	public JLabel jLabelid_moduloFK_IdModuloTipoMovimientoModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo;
	public JButton jButtonid_moduloFK_IdModuloTipoMovimientoModulo= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoMovimientoModuloUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoMovimientoModuloBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoMovimientoModuloJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoModuloJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoModuloJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoModuloJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMovimientoModulo)	{
		this.jButtonRecargarInformacionTipoMovimientoModulo = jButtonRecargarInformacionTipoMovimientoModulo;
	}
	
	public JButton getjButtonProcesarInformacionTipoMovimientoModulo() {
		return this.jButtonProcesarInformacionTipoMovimientoModulo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMovimientoModulo)	{
		this.jButtonProcesarInformacionTipoMovimientoModulo = jButtonProcesarInformacionTipoMovimientoModulo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMovimientoModulo() {
		return this.jButtonRecargarInformacionTipoMovimientoModulo;
	}
	
	
	public List<TipoMovimientoModulo> gettipomovimientomodulos() {
		return this.tipomovimientomodulos;
	}

	public void settipomovimientomodulos(List<TipoMovimientoModulo> tipomovimientomodulos) {
		this.tipomovimientomodulos = tipomovimientomodulos;
	}
	
	public List<TipoMovimientoModulo> gettipomovimientomodulosAux() {
		return this.tipomovimientomodulosAux;
	}

	public void settipomovimientomodulosAux(List<TipoMovimientoModulo> tipomovimientomodulosAux) {
		this.tipomovimientomodulosAux = tipomovimientomodulosAux;
	}
	
	public List<TipoMovimientoModulo> gettipomovimientomodulosEliminados() {
		return this.tipomovimientomodulosEliminados;
	}

	public void setTipoMovimientoModulosEliminados(List<TipoMovimientoModulo> tipomovimientomodulosEliminados) {
		this.tipomovimientomodulosEliminados = tipomovimientomodulosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMovimientoModulo() {
		return jComboBoxTiposSeleccionarTipoMovimientoModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMovimientoModulo(
			JComboBox jComboBoxTiposSeleccionarTipoMovimientoModulo) {
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo = jComboBoxTiposSeleccionarTipoMovimientoModulo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMovimientoModulo() {
		return jTextFieldValorCampoGeneralTipoMovimientoModulo;
	}

	public void setjTextFieldValorCampoGeneralTipoMovimientoModulo(
			JTextField jTextFieldValorCampoGeneralTipoMovimientoModulo) {
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo = jTextFieldValorCampoGeneralTipoMovimientoModulo;
	}

	public void setBorderResaltarValorCampoGeneralTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMovimientoModulo() {
		return this.jCheckBoxSeleccionarTodosTipoMovimientoModulo;
	}

	public void setjCheckBoxSeleccionarTodosTipoMovimientoModulo(
			JCheckBox jCheckBoxSeleccionarTodosTipoMovimientoModulo) {
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo = jCheckBoxSeleccionarTodosTipoMovimientoModulo;
	}

	public void setBorderResaltarSeleccionarTodosTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMovimientoModulo() {
		return this.jCheckBoxSeleccionadosTipoMovimientoModulo;
	}

	public void setjCheckBoxSeleccionadosTipoMovimientoModulo(
			JCheckBox jCheckBoxSeleccionadosTipoMovimientoModulo) {
		this.jCheckBoxSeleccionadosTipoMovimientoModulo = jCheckBoxSeleccionadosTipoMovimientoModulo;
	}
	
	public void setBorderResaltarSeleccionadosTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMovimientoModulo() {
		return this.jComboBoxTiposArchivosReportesTipoMovimientoModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMovimientoModulo(
			JComboBox jComboBoxTiposArchivosReportesTipoMovimientoModulo) {
		this.jComboBoxTiposArchivosReportesTipoMovimientoModulo = jComboBoxTiposArchivosReportesTipoMovimientoModulo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMovimientoModulo() {
		return this.jComboBoxTiposReportesTipoMovimientoModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMovimientoModulo(
			JComboBox jComboBoxTiposReportesTipoMovimientoModulo) {
		this.jComboBoxTiposReportesTipoMovimientoModulo = jComboBoxTiposReportesTipoMovimientoModulo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMovimientoModulo() {
	//	return jComboBoxTiposReportesDinamicoTipoMovimientoModulo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMovimientoModulo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMovimientoModulo) {
	//	this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo = jComboBoxTiposReportesDinamicoTipoMovimientoModulo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo = jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo;
	//}
	
	public void setBorderResaltarTiposReportesTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMovimientoModulo() {
		return this.jComboBoxTiposGraficosReportesTipoMovimientoModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMovimientoModulo(
			JComboBox jComboBoxTiposGraficosReportesTipoMovimientoModulo) {
		this.jComboBoxTiposGraficosReportesTipoMovimientoModulo = jComboBoxTiposGraficosReportesTipoMovimientoModulo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMovimientoModulo() {
		return this.jComboBoxTiposPaginacionTipoMovimientoModulo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMovimientoModulo(
			JComboBox jComboBoxTiposPaginacionTipoMovimientoModulo) {
		this.jComboBoxTiposPaginacionTipoMovimientoModulo = jComboBoxTiposPaginacionTipoMovimientoModulo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMovimientoModulo() {
		return this.jComboBoxTiposRelacionesTipoMovimientoModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMovimientoModulo() {
		return this.jComboBoxTiposAccionesTipoMovimientoModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMovimientoModulo(
			JComboBox jComboBoxTiposRelacionesTipoMovimientoModulo) {
		this.jComboBoxTiposRelacionesTipoMovimientoModulo = jComboBoxTiposRelacionesTipoMovimientoModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMovimientoModulo(
			JComboBox jComboBoxTiposAccionesTipoMovimientoModulo) {
		this.jComboBoxTiposAccionesTipoMovimientoModulo = jComboBoxTiposAccionesTipoMovimientoModulo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMovimientoModulo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMovimientoModulo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMovimientoModulo() {
	//	return jCheckBoxConGraficoDinamicoTipoMovimientoModulo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMovimientoModulo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMovimientoModulo) {
	//	this.jCheckBoxConGraficoDinamicoTipoMovimientoModulo = jCheckBoxConGraficoDinamicoTipoMovimientoModulo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMovimientoModulo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMovimientoModulo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMovimientoModulo .setBorder(borderResaltar);		
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
		this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
		
		this.tipomovimientomoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimientomoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMovimientoModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMovimientoModuloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movimiento Modulo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMovimientoModuloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMovimientoModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMovimientoModulo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"nuevo","nuevo","Nuevo"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"duplicar","duplicar","Duplicar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"copiar","copiar","Copiar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"ver_form","ver_form","Ver"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"recargar","recargar","Recargar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMovimientoModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,
							"cerrar","cerrar","Salir"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMovimientoModulo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMovimientoModulo;
			
				this.jButtonProcesarInformacionToolBarTipoMovimientoModulo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMovimientoModulo;
				
		//protected JButton jButtonModificarToolBarTipoMovimientoModulo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMovimientoModulo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMovimientoModulo=new JMenuMe("General");
		this.jmenuArchivoTipoMovimientoModulo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMovimientoModulo=new JMenuMe("Acciones");
		this.jmenuDatosTipoMovimientoModulo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMovimientoModulo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMovimientoModulo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMovimientoModulo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMovimientoModulo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMovimientoModulo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMovimientoModulo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMovimientoModulo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMovimientoModulo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMovimientoModulo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMovimientoModulo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMovimientoModulo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMovimientoModulo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMovimientoModulo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMovimientoModulo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMovimientoModulo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMovimientoModulo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMovimientoModulo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMovimientoModulo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMovimientoModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMovimientoModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMovimientoModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMovimientoModulo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMovimientoModulo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMovimientoModulo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMovimientoModulo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMovimientoModulo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMovimientoModulo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMovimientoModulo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMovimientoModulo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMovimientoModulo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMovimientoModulo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMovimientoModulo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMovimientoModulo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMovimientoModulo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMovimientoModulo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMovimientoModulo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMovimientoModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMovimientoModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMovimientoModulo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMovimientoModulo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMovimientoModulo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMovimientoModulo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMovimientoModulo.add(this.jMenuItemCerrarTipoMovimientoModulo);
			
			this.jmenuAccionesTipoMovimientoModulo.add(this.jMenuItemNuevoTipoMovimientoModulo);
			this.jmenuAccionesTipoMovimientoModulo.add(this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo);
			this.jmenuAccionesTipoMovimientoModulo.add(this.jMenuItemNuevoRelacionesTipoMovimientoModulo);
			this.jmenuAccionesTipoMovimientoModulo.add(this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo);		
			this.jmenuAccionesTipoMovimientoModulo.add(this.jMenuItemDuplicarTipoMovimientoModulo);		
			this.jmenuAccionesTipoMovimientoModulo.add(this.jMenuItemCopiarTipoMovimientoModulo);		
			this.jmenuAccionesTipoMovimientoModulo.add(this.jMenuItemVerFormTipoMovimientoModulo);		
			
			this.jmenuDatosTipoMovimientoModulo.add(this.jMenuItemRecargarInformacionTipoMovimientoModulo);				
			this.jmenuDatosTipoMovimientoModulo.add(this.jMenuItemAnterioresTipoMovimientoModulo);				
			this.jmenuDatosTipoMovimientoModulo.add(this.jMenuItemSiguientesTipoMovimientoModulo);				
			this.jmenuDatosTipoMovimientoModulo.add(this.jMenuItemAbrirOrderByTipoMovimientoModulo);				
			this.jmenuDatosTipoMovimientoModulo.add(this.jMenuItemMostrarOcultarTipoMovimientoModulo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMovimientoModulo.add(this.jMenuItemGuardarCambiosTipoMovimientoModulo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMovimientoModulo.add(this.jmenuArchivoTipoMovimientoModulo);		
			this.jmenuBarTipoMovimientoModulo.add(this.jmenuAccionesTipoMovimientoModulo);		
			this.jmenuBarTipoMovimientoModulo.add(this.jmenuDatosTipoMovimientoModulo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMovimientoModulo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMovimientoModulo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoMovimientoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoMovimientoModulo.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoMovimientoModulo= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoMovimientoModulo.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoMovimientoModulo.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoMovimientoModulo,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoMovimientoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoMovimientoModulo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoMovimientoModulo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoMovimientoModulo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoMovimientoModulo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoMovimientoModulo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoMovimientoModulo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoMovimientoModulo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoMovimientoModulo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoMovimientoModulo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModuloTipoMovimientoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloTipoMovimientoModulo.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloTipoMovimientoModulo= new JButtonMe();
		this.jButtonFK_IdModuloTipoMovimientoModulo.setText("Buscar");
		this.jButtonFK_IdModuloTipoMovimientoModulo.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloTipoMovimientoModulo,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloTipoMovimientoModulo = new JLabelMe();
		jLabelid_moduloFK_IdModuloTipoMovimientoModulo.setText("Modulo :");
		jLabelid_moduloFK_IdModuloTipoMovimientoModulo.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoMovimientoModulo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMovimientoModulo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMovimientoModulo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMovimientoModulo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMovimientoModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMovimientoModulo = new TipoMovimientoModuloDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Movimiento Modulo DATOS");
			this.jInternalFrameDetalleFormTipoMovimientoModulo = new TipoMovimientoModuloDetalleFormJInternalFrame(jDesktopPane,this.tipomovimientomoduloSessionBean.getConGuardarRelaciones(),this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMovimientoModulo = null;//new TipoMovimientoModuloDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMovimientoModulo= new GridBagLayout();
		
		
		this.jTableDatosTipoMovimientoModulo = new JTableMe();      
		
		String sToolTipTipoMovimientoModulo="";
		sToolTipTipoMovimientoModulo=TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMovimientoModulo+="(Contabilidad.TipoMovimientoModulo)";
		}
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMovimientoModulo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMovimientoModulo.setToolTipText(sToolTipTipoMovimientoModulo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMovimientoModulo);
		this.jTableDatosTipoMovimientoModulo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMovimientoModulo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMovimientoModulo.setRowSelectionAllowed(true);
		this.jTableDatosTipoMovimientoModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMovimientoModulo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMovimientoModulo = new JButtonMe();
		this.jButtonDuplicarTipoMovimientoModulo = new JButtonMe();
		this.jButtonCopiarTipoMovimientoModulo = new JButtonMe();
		this.jButtonVerFormTipoMovimientoModulo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMovimientoModulo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo = new JButtonMe();
		this.jButtonCerrarTipoMovimientoModulo = new JButtonMe();
		
		this.jScrollPanelDatosTipoMovimientoModulo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMovimientoModulo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movimiento Modulo";
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento Modulos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMovimientoModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMovimientoModulo.setToolTipText("Acciones");
        this.jPanelAccionesTipoMovimientoModulo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMovimientoModulo=new ReporteDinamicoJInternalFrame(TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMovimientoModulo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMovimientoModulo=new ImportacionJInternalFrame(TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMovimientoModulo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMovimientoModulo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMovimientoModulo.setText("Orden");
		this.jButtonAbrirOrderByTipoMovimientoModulo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMovimientoModulo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMovimientoModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimientoModulo,false,this);
			
			//this.cargarOrderByTipoMovimientoModulo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMovimientoModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimientoModulo,true,this);
			
			//this.cargarOrderByTipoMovimientoModulo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMovimientoModulo.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoMovimientoModulo.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoMovimientoModulo.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoMovimientoModulo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMovimientoModulo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMovimientoModulo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMovimientoModulo.setText("Nuevo");
		this.jButtonDuplicarTipoMovimientoModulo.setText("Duplicar");
		this.jButtonCopiarTipoMovimientoModulo.setText("Copiar");
		this.jButtonVerFormTipoMovimientoModulo.setText("Ver");
		this.jButtonNuevoRelacionesTipoMovimientoModulo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.setText("Guardar");
		this.jButtonCerrarTipoMovimientoModulo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMovimientoModulo,"nuevo_button","Nuevo",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMovimientoModulo,"duplicar_button","Duplicar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMovimientoModulo,"copiar_button","Copiar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMovimientoModulo,"ver_form","Ver",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMovimientoModulo,"nuevorelaciones_button","Nuevo Rel",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMovimientoModulo,"guardarcambiostabla_button","Guardar",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMovimientoModulo,"cerrar_button","Salir",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMovimientoModulo.setToolTipText("Nuevo"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMovimientoModulo.setToolTipText("Duplicar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMovimientoModulo.setToolTipText("Copiar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMovimientoModulo.setToolTipText("Ver"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMovimientoModulo.setToolTipText("Nuevo Rel"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.setToolTipText("Guardar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMovimientoModulo.setToolTipText("Salir"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMovimientoModulo";
		inputMap = this.jButtonNuevoTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMovimientoModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMovimientoModulo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMovimientoModulo";
		inputMap = this.jButtonDuplicarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMovimientoModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMovimientoModulo"));
		
		//COPIAR
		sMapKey = "CopiarTipoMovimientoModulo";
		inputMap = this.jButtonCopiarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMovimientoModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMovimientoModulo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMovimientoModulo";
		inputMap = this.jButtonVerFormTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMovimientoModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMovimientoModulo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMovimientoModulo";
		inputMap = this.jButtonNuevoRelacionesTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMovimientoModulo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMovimientoModulo";
		inputMap = this.jButtonModificarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMovimientoModulo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMovimientoModulo";
		inputMap = this.jButtonCerrarTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMovimientoModulo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMovimientoModulo";
		inputMap = this.jButtonGuardarCambiosTablaTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMovimientoModulo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMovimientoModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMovimientoModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMovimientoModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMovimientoModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMovimientoModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMovimientoModulo.setName("jPanelParametrosReportesTipoMovimientoModulo"); 
		
		this.jPanelParametrosReportesAccionesTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMovimientoModulo.setName("jPanelParametrosReportesAccionesTipoMovimientoModulo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMovimientoModulo = new JButtonMe();
		this.jButtonRecargarInformacionTipoMovimientoModulo.setText("Recargar");
		this.jButtonRecargarInformacionTipoMovimientoModulo.setToolTipText("Recargar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMovimientoModulo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMovimientoModulo = new JButtonMe();
		this.jButtonProcesarInformacionTipoMovimientoModulo.setText("Procesar");
		this.jButtonProcesarInformacionTipoMovimientoModulo.setToolTipText("Procesar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMovimientoModulo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMovimientoModulo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMovimientoModulo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMovimientoModulo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMovimientoModulo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMovimientoModulo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMovimientoModulo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMovimientoModulo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMovimientoModulo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMovimientoModulo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMovimientoModulo.setText("Accion");
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMovimientoModulo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMovimientoModulo = new JLabelMe();
		
		this.jLabelAccionesTipoMovimientoModulo.setText("Acciones");		
		this.jLabelAccionesTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMovimientoModulo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMovimientoModulo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMovimientoModulo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMovimientoModulo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMovimientoModulo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMovimientoModulo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMovimientoModulo = new JButtonMe();
		//this.jButtonAnterioresTipoMovimientoModulo.setText("<<");
        this.jButtonAnterioresTipoMovimientoModulo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMovimientoModulo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMovimientoModulo = new JButtonMe();
		//this.jButtonSiguientesTipoMovimientoModulo.setText(">>");
        this.jButtonSiguientesTipoMovimientoModulo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMovimientoModulo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMovimientoModulo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMovimientoModulo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMovimientoModulo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMovimientoModulo,"nuevoguardarcambios_button","Nue",this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMovimientoModulo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMovimientoModulo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMovimientoModulo";
		inputMap = this.jButtonRecargarInformacionTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMovimientoModulo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMovimientoModulo";
		inputMap = this.jButtonSiguientesTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMovimientoModulo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMovimientoModulo";
		inputMap = this.jButtonAnterioresTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMovimientoModulo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMovimientoModulo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMovimientoModulo.setMinimumSize(new Dimension(this.getWidth(),TipoMovimientoModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimientoModuloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMovimientoModulo.setMaximumSize(new Dimension(this.getWidth(),TipoMovimientoModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimientoModuloBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMovimientoModulo.setPreferredSize(new Dimension(this.getWidth(),TipoMovimientoModuloBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimientoModuloBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMovimientoModulo = new GridBagLayout();

			this.jPanelPaginacionTipoMovimientoModulo.setLayout(gridaBagLayoutPaginacionTipoMovimientoModulo);						
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonAnterioresTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
					
						
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
			
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonNuevoGuardarCambiosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
						
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonSiguientesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 1;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonNuevoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMovimientoModulo.gridy = 1;
				this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonNuevoRelacionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			}
			
			
			if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMovimientoModulo.gridy = 1;
				this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonGuardarCambiosTablaTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			}
			
			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 1;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonDuplicarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 1;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonCopiarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 1;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonVerFormTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 1;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMovimientoModulo.add(this.jButtonCerrarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
		
		
		this.jButtonRecargarInformacionTipoMovimientoModulo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMovimientoModulo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMovimientoModulo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMovimientoModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMovimientoModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMovimientoModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMovimientoModulo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMovimientoModulo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMovimientoModulo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMovimientoModulo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMovimientoModulo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMovimientoModulo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMovimientoModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMovimientoModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMovimientoModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimientoModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMovimientoModulo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMovimientoModulo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMovimientoModulo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMovimientoModulo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMovimientoModulo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMovimientoModulo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMovimientoModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMovimientoModulo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMovimientoModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMovimientoModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMovimientoModulo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMovimientoModulo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMovimientoModulo.setLayout(gridaBagParametrosReportesTipoMovimientoModulo);
			this.jPanelParametrosReportesAccionesTipoMovimientoModulo.setLayout(gridaBagParametrosReportesAccionesTipoMovimientoModulo);
			
			
			this.jPanelParametrosAuxiliar1TipoMovimientoModulo.setLayout(gridaBagParametrosAuxiliar1TipoMovimientoModulo);
			this.jPanelParametrosAuxiliar2TipoMovimientoModulo.setLayout(gridaBagParametrosAuxiliar2TipoMovimientoModulo);
			this.jPanelParametrosAuxiliar3TipoMovimientoModulo.setLayout(gridaBagParametrosAuxiliar3TipoMovimientoModulo);
			this.jPanelParametrosAuxiliar4TipoMovimientoModulo.setLayout(gridaBagParametrosAuxiliar4TipoMovimientoModulo);
			//this.jPanelParametrosAuxiliar5TipoMovimientoModulo.setLayout(gridaBagParametrosAuxiliar2TipoMovimientoModulo);			
			
			
			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jButtonRecargarInformacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimientoModulo.add(this.jComboBoxTiposPaginacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimientoModulo.add(this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimientoModulo.add(this.jComboBoxTiposArchivosReportesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jPanelParametrosAuxiliar1TipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimientoModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMovimientoModulo.add(this.jComboBoxTiposReportesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jPanelParametrosAuxiliar4TipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jComboBoxTiposReportesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jCheckBoxGenerarReporteTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jPanelParametrosAuxiliar2TipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimientoModulo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jLabelAccionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jButtonAbrirOrderByTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jComboBoxTiposSeleccionarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
			
			
			/*
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimientoModulo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jCheckBoxSeleccionarTodosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimientoModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMovimientoModulo.add(this.jCheckBoxSeleccionarTodosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);															
				
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimientoModulo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMovimientoModulo.add(this.jCheckBoxSeleccionadosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jPanelParametrosAuxiliar3TipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jComboBoxTiposRelacionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
				
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jComboBoxTiposAccionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
	
				
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimientoModulo.add(this.jTextFieldValorCampoGeneralTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMovimientoModulo = new GridBagLayout();

			this.jScrollPanelDatosTipoMovimientoModulo.setLayout(gridaBagLayoutDatosTipoMovimientoModulo);
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
			
			this.jScrollPanelDatosTipoMovimientoModulo.add(this.jTableDatosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMovimientoModulo.setViewportView(this.jTableDatosTipoMovimientoModulo);
		this.jTableDatosTipoMovimientoModulo.setFillsViewportHeight(true);
		this.jTableDatosTipoMovimientoModulo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMovimientoModulo= new GridBagLayout();
		this.jPanelAccionesTipoMovimientoModulo.setLayout(gridaBagLayoutAccionesTipoMovimientoModulo);
		
		
		/*	
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
			
		this.jPanelAccionesTipoMovimientoModulo.add(this.jButtonNuevoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoMovimientoModulo= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoMovimientoModulo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoMovimientoModulo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoMovimientoModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoMovimientoModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoMovimientoModulo.setLayout(gridaBagLayoutBusquedaPorCodigoTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		gridBagConstraintsTipoMovimientoModulo.gridx = 0;
		jPanelBusquedaPorCodigoTipoMovimientoModulo.add(jLabelcodigoBusquedaPorCodigoTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		gridBagConstraintsTipoMovimientoModulo.gridx = 1;
		jPanelBusquedaPorCodigoTipoMovimientoModulo.add(jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 1;
		gridBagConstraintsTipoMovimientoModulo.gridx =1;
		jPanelBusquedaPorCodigoTipoMovimientoModulo.add(jButtonBusquedaPorCodigoTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		jTabbedPaneBusquedasTipoMovimientoModulo.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoMovimientoModulo);
		jTabbedPaneBusquedasTipoMovimientoModulo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoMovimientoModulo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoMovimientoModulo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoMovimientoModulo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoMovimientoModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoMovimientoModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoMovimientoModulo.setLayout(gridaBagLayoutBusquedaPorNombreTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		gridBagConstraintsTipoMovimientoModulo.gridx = 0;
		jPanelBusquedaPorNombreTipoMovimientoModulo.add(jLabelnombreBusquedaPorNombreTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		gridBagConstraintsTipoMovimientoModulo.gridx = 1;
		jPanelBusquedaPorNombreTipoMovimientoModulo.add(jTextAreanombreBusquedaPorNombreTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 1;
		gridBagConstraintsTipoMovimientoModulo.gridx =1;
		jPanelBusquedaPorNombreTipoMovimientoModulo.add(jButtonBusquedaPorNombreTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		jTabbedPaneBusquedasTipoMovimientoModulo.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoMovimientoModulo);
		jTabbedPaneBusquedasTipoMovimientoModulo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdModuloTipoMovimientoModulo= new GridBagLayout();
		gridaBagLayoutFK_IdModuloTipoMovimientoModulo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoMovimientoModulo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoMovimientoModulo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloTipoMovimientoModulo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloTipoMovimientoModulo.setLayout(gridaBagLayoutFK_IdModuloTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		gridBagConstraintsTipoMovimientoModulo.gridx = 0;
		jPanelFK_IdModuloTipoMovimientoModulo.add(jLabelid_moduloFK_IdModuloTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 0;
		gridBagConstraintsTipoMovimientoModulo.gridx = 1;
		jPanelFK_IdModuloTipoMovimientoModulo.add(jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMovimientoModulo.gridy = 1;
		gridBagConstraintsTipoMovimientoModulo.gridx =1;
		jPanelFK_IdModuloTipoMovimientoModulo.add(jButtonFK_IdModuloTipoMovimientoModulo, gridBagConstraintsTipoMovimientoModulo);

		jTabbedPaneBusquedasTipoMovimientoModulo.addTab("3.-Por Modulo ", jPanelFK_IdModuloTipoMovimientoModulo);
		jTabbedPaneBusquedasTipoMovimientoModulo.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMovimientoModulo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMovimientoModulo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();						
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;		
			//this.gridBagConstraintsTipoMovimientoModulo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMovimientoModulo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;		
		//this.gridBagConstraintsTipoMovimientoModulo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMovimientoModulo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMovimientoModulo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;		
			this.gridBagConstraintsTipoMovimientoModulo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoMovimientoModulo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);								
		
		
		/*
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		*/		
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimientoModulo.gridx =0;
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMovimientoModulo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
				
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMovimientoModulo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMovimientoModulo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMovimientoModulo.setLayout(gridaBagLayoutBusquedasParametrosTipoMovimientoModulo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMovimientoModulo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
			
			
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
			
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMovimientoModulo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMovimientoModulo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMovimientoModulo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMovimientoModulo.setName("jPanelReporteDinamicoTipoMovimientoModulo"); 
		
		this.jPanelReporteDinamicoTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMovimientoModulo.setLayout(gridaBagLayoutReporteDinamicoTipoMovimientoModulo);
		
		
		this.jInternalFrameReporteDinamicoTipoMovimientoModulo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMovimientoModulo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMovimientoModulo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento Modulos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMovimientoModulo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMovimientoModulo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jLabelColumnasSelectReporteTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMovimientoModulo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMovimientoModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMovimientoModulo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMovimientoModulo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMovimientoModulo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMovimientoModulo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMovimientoModulo=new JScrollPane(this.jListColumnasSelectReporteTipoMovimientoModulo);
			
			this.jScrollColumnasSelectReporteTipoMovimientoModulo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMovimientoModulo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMovimientoModulo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jListColumnasSelectReporteTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jScrollColumnasSelectReporteTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMovimientoModulo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMovimientoModulo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jLabelRelacionesSelectReporteTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMovimientoModulo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMovimientoModulo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMovimientoModulo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMovimientoModulo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMovimientoModulo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMovimientoModulo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMovimientoModulo=new JScrollPane(this.jListRelacionesSelectReporteTipoMovimientoModulo);
			
			this.jScrollRelacionesSelectReporteTipoMovimientoModulo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMovimientoModulo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMovimientoModulo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jListRelacionesSelectReporteTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jScrollRelacionesSelectReporteTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoMovimientoModulo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMovimientoModulo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMovimientoModulo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMovimientoModulo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMovimientoModulo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jLabelGenerarExcelReporteDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo.setToolTipText("Generar EXCEL"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jComboBoxTiposReportesDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMovimientoModulo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMovimientoModulo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jLabelTiposArchivoReporteDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMovimientoModulo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMovimientoModulo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMovimientoModulo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMovimientoModulo.setToolTipText("Generar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jButtonGenerarReporteDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMovimientoModulo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMovimientoModulo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMovimientoModulo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMovimientoModulo.setToolTipText("Cancelar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimientoModulo.add(this.jButtonCerrarReporteDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMovimientoModulo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMovimientoModulo= new JScrollPane(jPanelReporteDinamicoTipoMovimientoModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento Modulos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimientoModulo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMovimientoModulo);
		this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMovimientoModulo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMovimientoModulo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMovimientoModulo.setName("jPanelImportacionTipoMovimientoModulo"); 
		
		this.jPanelImportacionTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMovimientoModulo.setLayout(gridaBagLayoutImportacionTipoMovimientoModulo);
		
		
		this.jInternalFrameImportacionTipoMovimientoModulo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMovimientoModulo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMovimientoModulo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMovimientoModulo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMovimientoModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMovimientoModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMovimientoModulo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMovimientoModulo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMovimientoModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMovimientoModulo.setResizable(true);
	    this.jInternalFrameImportacionTipoMovimientoModulo.setClosable(true);
	    this.jInternalFrameImportacionTipoMovimientoModulo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMovimientoModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMovimientoModulo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMovimientoModulo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMovimientoModulo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMovimientoModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMovimientoModulo.setResizable(true);
	    this.jInternalFrameImportacionTipoMovimientoModulo.setClosable(true);
	    this.jInternalFrameImportacionTipoMovimientoModulo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento Modulos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMovimientoModulo = new JLabelMe();

		this.jLabelArchivoImportacionTipoMovimientoModulo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMovimientoModulo.add(this.jLabelArchivoImportacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMovimientoModulo = new JFileChooser();		
		this.jFileChooserImportacionTipoMovimientoModulo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMovimientoModulo = new JButtonMe();
		this.jButtonAbrirImportacionTipoMovimientoModulo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMovimientoModulo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMovimientoModulo.setToolTipText("Generar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimientoModulo.add(this.jButtonAbrirImportacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMovimientoModulo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMovimientoModulo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMovimientoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMovimientoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMovimientoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMovimientoModulo.add(this.jLabelPathArchivoImportacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMovimientoModulo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMovimientoModulo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMovimientoModulo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMovimientoModulo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimientoModulo.add(this.jTextFieldPathArchivoImportacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMovimientoModulo = new JButtonMe();
		this.jButtonGenerarImportacionTipoMovimientoModulo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMovimientoModulo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMovimientoModulo.setToolTipText("Generar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimientoModulo.add(this.jButtonGenerarImportacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMovimientoModulo = new JButtonMe();
		this.jButtonCerrarImportacionTipoMovimientoModulo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMovimientoModulo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMovimientoModulo.setToolTipText("Cancelar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimientoModulo.add(this.jButtonCerrarImportacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMovimientoModulo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMovimientoModulo= new JScrollPane(jPanelImportacionTipoMovimientoModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimientoModulo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMovimientoModulo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMovimientoModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMovimientoModulo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMovimientoModulo);
		this.jInternalFrameImportacionTipoMovimientoModulo.getContentPane().add(this.jScrollPanelImportacionTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMovimientoModulo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMovimientoModulo = new JButtonMe();
			this.jButtonAbrirOrderByTipoMovimientoModulo.setText("Orden");
			this.jButtonAbrirOrderByTipoMovimientoModulo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMovimientoModulo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMovimientoModulo";
			inputMap = this.jButtonAbrirOrderByTipoMovimientoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMovimientoModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMovimientoModulo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMovimientoModulo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMovimientoModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMovimientoModulo.setName("jPanelOrderByTipoMovimientoModulo"); 
			
			this.jPanelOrderByTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMovimientoModulo.setLayout(gridaBagLayoutOrderByTipoMovimientoModulo);
			
			
			this.jTableDatosTipoMovimientoModuloOrderBy = new JTableMe();        
			this.jTableDatosTipoMovimientoModuloOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMovimientoModuloOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMovimientoModuloOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMovimientoModuloOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMovimientoModuloOrderBy.setViewportView(this.jTableDatosTipoMovimientoModuloOrderBy);
			this.jTableDatosTipoMovimientoModuloOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMovimientoModuloOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMovimientoModulo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMovimientoModulo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMovimientoModulo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMovimientoModulo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMovimientoModulo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMovimientoModulo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMovimientoModulo.setTitle("Orden");
			this.jInternalFrameOrderByTipoMovimientoModulo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMovimientoModulo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMovimientoModulo.setResizable(true);
			this.jInternalFrameOrderByTipoMovimientoModulo.setClosable(true);
			this.jInternalFrameOrderByTipoMovimientoModulo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMovimientoModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento Modulos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMovimientoModulo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMovimientoModulo.ipady =150;
				
			this.jPanelOrderByTipoMovimientoModulo.add(jScrollPanelDatosTipoMovimientoModuloOrderBy, this.gridBagConstraintsTipoMovimientoModulo);//this.jTableDatosTipoMovimientoModuloTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMovimientoModulo = new JButtonMe();
			this.jButtonCerrarOrderByTipoMovimientoModulo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMovimientoModulo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMovimientoModulo.setToolTipText("Cancelar"+" "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMovimientoModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimientoModulo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMovimientoModulo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMovimientoModulo.add(this.jButtonCerrarOrderByTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMovimientoModulo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMovimientoModulo= new JScrollPane(jPanelOrderByTipoMovimientoModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMovimientoModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimientoModulo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMovimientoModulo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMovimientoModulo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMovimientoModulo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMovimientoModulo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMovimientoModulo);
			
			this.jInternalFrameOrderByTipoMovimientoModulo.getContentPane().add(this.jScrollPanelOrderByTipoMovimientoModulo, this.gridBagConstraintsTipoMovimientoModulo);			
		
		} else {
			this.jButtonAbrirOrderByTipoMovimientoModulo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMovimientoModulo.getRowHeight();//TipoMovimientoModuloConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo.isSelected()) {
					iHeightTable=TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMovimientoModulo.isSelected()) {
					iHeightTable=TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMovimientoModuloConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMovimientoModulo!=null && this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMovimientoModulo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMovimientoModulo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMovimientoModulo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMovimientoModulo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMovimientoModulo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMovimientoModulo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomovimientomoduloLogic.getTipoMovimientoModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimientomodulos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMovimientoModulo> TraerTipoMovimientoModuloBeans(List<TipoMovimientoModulo> tipomovimientomodulos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMovimientoModulo tipomovimientomodulo:tipomovimientomodulos) {
					
				if(!(TipoMovimientoModuloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMovimientoModuloConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomovimientomodulo.setsDetalleGeneralEntityReporte(TipoMovimientoModuloConstantesFunciones.getTipoMovimientoModuloDescripcion(tipomovimientomodulo));
										
						
					
					

					if(tipomovimientomodulo.getParametroCompras()!=null && Funciones.existeClass(classes,ParametroCompra.class)) {
						try{tipomovimientomodulo.setparametrocomprasDescripcionReporte(new JRBeanCollectionDataSource(ParametroCompraJInternalFrame.TraerParametroCompraBeans(tipomovimientomodulo.getParametroCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipomovimientomodulo.getFacturaProveedorServicios()!=null && Funciones.existeClass(classes,FacturaProveedorServicio.class)) {
						try{tipomovimientomodulo.setfacturaproveedorserviciosDescripcionReporte(new JRBeanCollectionDataSource(FacturaProveedorServicioJInternalFrame.TraerFacturaProveedorServicioBeans(tipomovimientomodulo.getFacturaProveedorServicios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipomovimientomodulo.getSecuencials()!=null && Funciones.existeClass(classes,Secuencial.class)) {
						try{tipomovimientomodulo.setsecuencialsDescripcionReporte(new JRBeanCollectionDataSource(SecuencialJInternalFrame.TraerSecuencialBeans(tipomovimientomodulo.getSecuencials(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipomovimientomodulo.getTipoDocumentos()!=null && Funciones.existeClass(classes,TipoDocumento.class)) {
						try{tipomovimientomodulo.settipodocumentosDescripcionReporte(new JRBeanCollectionDataSource(TipoDocumentoJInternalFrame.TraerTipoDocumentoBeans(tipomovimientomodulo.getTipoDocumentos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipomovimientomodulo.setsDetalleGeneralEntityReporte(tipomovimientomodulo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomovimientomodulobeans.add(tipomovimientomodulobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomovimientomodulos;
    }
	//PARA REPORTES FIN
}
