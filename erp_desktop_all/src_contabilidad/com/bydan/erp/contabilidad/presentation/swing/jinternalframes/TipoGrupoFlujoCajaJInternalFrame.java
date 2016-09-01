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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoGrupoFlujoCajaConstantesFunciones;

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
public class TipoGrupoFlujoCajaJInternalFrame extends TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGrupoFlujoCaja;
	
	protected JMenuBar jmenuBarTipoGrupoFlujoCaja;
	
	protected JMenu jmenuTipoGrupoFlujoCaja;
	protected JMenu jmenuDatosTipoGrupoFlujoCaja;
	protected JMenu jmenuArchivoTipoGrupoFlujoCaja;
	protected JMenu jmenuAccionesTipoGrupoFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoFlujoCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGrupoFlujoCajaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGrupoFlujoCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGrupoFlujoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGrupoFlujoCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGrupoFlujoCaja> tipogrupoflujocajas;		
	public List<TipoGrupoFlujoCaja> tipogrupoflujocajasEliminados;	
	public List<TipoGrupoFlujoCaja> tipogrupoflujocajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGrupoFlujoCaja;		
	protected JButton jButtonAbrirOrderByTipoGrupoFlujoCaja;
	
	
	//protected JPanel jPanelOrderByTipoGrupoFlujoCaja;
	//public JScrollPane jScrollPanelOrderByTipoGrupoFlujoCaja;	
	//protected JButton jButtonCerrarOrderByTipoGrupoFlujoCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGrupoFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoFlujoCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGrupoFlujoCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGrupoFlujoCaja;
	//public JScrollPane jScrollPanelImportacionTipoGrupoFlujoCaja;
	
	
	
	protected JPanel jPanelAccionesTipoGrupoFlujoCaja;
	
    protected JPanel jPanelPaginacionTipoGrupoFlujoCaja;
    protected JPanel jPanelParametrosReportesTipoGrupoFlujoCaja;
	protected JPanel jPanelParametrosReportesAccionesTipoGrupoFlujoCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGrupoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar2TipoGrupoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar3TipoGrupoFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar4TipoGrupoFlujoCaja;
	//protected JPanel jPanelParametrosAuxiliar5TipoGrupoFlujoCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGrupoFlujoCaja;
	//protected JPanel jPanelImportacionTipoGrupoFlujoCaja;
	
	
	public JTable jTableDatosTipoGrupoFlujoCaja;
	
	
	
	//public JTable jTableDatosTipoGrupoFlujoCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGrupoFlujoCaja;
	protected JButton jButtonDuplicarTipoGrupoFlujoCaja;
	protected JButton jButtonCopiarTipoGrupoFlujoCaja;
	protected JButton jButtonVerFormTipoGrupoFlujoCaja;
	protected JButton jButtonNuevoRelacionesTipoGrupoFlujoCaja;
	protected JButton jButtonModificarTipoGrupoFlujoCaja;
	
    protected JButton jButtonGuardarCambiosTablaTipoGrupoFlujoCaja;
	protected JButton jButtonCerrarTipoGrupoFlujoCaja;
	
	
	protected JButton jButtonRecargarInformacionTipoGrupoFlujoCaja;
	protected JButton jButtonProcesarInformacionTipoGrupoFlujoCaja;
	
	
	protected JButton jButtonAnterioresTipoGrupoFlujoCaja;
	protected JButton jButtonSiguientesTipoGrupoFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja;
	//protected JButton jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGrupoFlujoCaja;
	//protected JButton jButtonGenerarImportacionTipoGrupoFlujoCaja;
	//protected JButton jButtonCerrarImportacionTipoGrupoFlujoCaja;
	//protected JFileChooser jFileChooserImportacionTipoGrupoFlujoCaja;
	//protected File fileImportacionTipoGrupoFlujoCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonDuplicarToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonCopiarToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonVerFormToolBarTipoGrupoFlujoCaja;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonCerrarToolBarTipoGrupoFlujoCaja;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonAnterioresToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonSiguientesToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonAbrirOrderByToolBarTipoGrupoFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemDuplicarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGrupoFlujoCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemCopiarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemVerFormTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemCerrarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemAnterioresTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemSiguientesTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemAbrirOrderByTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoFlujoCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja;
	protected JCheckBox jCheckBoxSeleccionadosTipoGrupoFlujoCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGrupoFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGrupoFlujoCaja;
	protected JTextField jTextFieldValorCampoGeneralTipoGrupoFlujoCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGrupoFlujoCaja;
	//public JList<Reporte> jListColumnasSelectReporteTipoGrupoFlujoCaja;
	//public JScrollPane jScrollColumnasSelectReporteTipoGrupoFlujoCaja;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGrupoFlujoCaja;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGrupoFlujoCaja;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGrupoFlujoCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGrupoFlujoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGrupoFlujoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGrupoFlujoCaja;
	
		
	//public JLabel jLabelArchivoImportacionTipoGrupoFlujoCaja;	
	//public JLabel jLabelPathArchivoImportacionTipoGrupoFlujoCaja;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGrupoFlujoCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGrupoFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGrupoFlujoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGrupoFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGrupoFlujoCaja;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGrupoFlujoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGrupoFlujoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGrupoFlujoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGrupoFlujoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGrupoFlujoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGrupoFlujoCaja;
	public JPanel jPanelBusquedaPorCodigoTipoGrupoFlujoCaja;
	public JButton jButtonBusquedaPorCodigoTipoGrupoFlujoCaja;
	public JPanel jPanelBusquedaPorNombreTipoGrupoFlujoCaja;
	public JButton jButtonBusquedaPorNombreTipoGrupoFlujoCaja;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja;
	public JButton jButtoncodigoBusquedaPorCodigoTipoGrupoFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoGrupoFlujoCaja;
	public JLabel jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja;
	public JButton jButtonnombreBusquedaPorNombreTipoGrupoFlujoCajaBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoGrupoFlujoCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFlujoCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFlujoCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFlujoCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGrupoFlujoCaja)	{
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja = jButtonRecargarInformacionTipoGrupoFlujoCaja;
	}
	
	public JButton getjButtonProcesarInformacionTipoGrupoFlujoCaja() {
		return this.jButtonProcesarInformacionTipoGrupoFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoFlujoCaja)	{
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja = jButtonProcesarInformacionTipoGrupoFlujoCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGrupoFlujoCaja() {
		return this.jButtonRecargarInformacionTipoGrupoFlujoCaja;
	}
	
	
	public List<TipoGrupoFlujoCaja> gettipogrupoflujocajas() {
		return this.tipogrupoflujocajas;
	}

	public void settipogrupoflujocajas(List<TipoGrupoFlujoCaja> tipogrupoflujocajas) {
		this.tipogrupoflujocajas = tipogrupoflujocajas;
	}
	
	public List<TipoGrupoFlujoCaja> gettipogrupoflujocajasAux() {
		return this.tipogrupoflujocajasAux;
	}

	public void settipogrupoflujocajasAux(List<TipoGrupoFlujoCaja> tipogrupoflujocajasAux) {
		this.tipogrupoflujocajasAux = tipogrupoflujocajasAux;
	}
	
	public List<TipoGrupoFlujoCaja> gettipogrupoflujocajasEliminados() {
		return this.tipogrupoflujocajasEliminados;
	}

	public void setTipoGrupoFlujoCajasEliminados(List<TipoGrupoFlujoCaja> tipogrupoflujocajasEliminados) {
		this.tipogrupoflujocajasEliminados = tipogrupoflujocajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGrupoFlujoCaja() {
		return jComboBoxTiposSeleccionarTipoGrupoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposSeleccionarTipoGrupoFlujoCaja) {
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja = jComboBoxTiposSeleccionarTipoGrupoFlujoCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGrupoFlujoCaja() {
		return jTextFieldValorCampoGeneralTipoGrupoFlujoCaja;
	}

	public void setjTextFieldValorCampoGeneralTipoGrupoFlujoCaja(
			JTextField jTextFieldValorCampoGeneralTipoGrupoFlujoCaja) {
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja = jTextFieldValorCampoGeneralTipoGrupoFlujoCaja;
	}

	public void setBorderResaltarValorCampoGeneralTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGrupoFlujoCaja() {
		return this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja;
	}

	public void setjCheckBoxSeleccionarTodosTipoGrupoFlujoCaja(
			JCheckBox jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja) {
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja = jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja;
	}

	public void setBorderResaltarSeleccionarTodosTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGrupoFlujoCaja() {
		return this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja;
	}

	public void setjCheckBoxSeleccionadosTipoGrupoFlujoCaja(
			JCheckBox jCheckBoxSeleccionadosTipoGrupoFlujoCaja) {
		this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja = jCheckBoxSeleccionadosTipoGrupoFlujoCaja;
	}
	
	public void setBorderResaltarSeleccionadosTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja) {
		this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja = jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposReportesTipoGrupoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposReportesTipoGrupoFlujoCaja) {
		this.jComboBoxTiposReportesTipoGrupoFlujoCaja = jComboBoxTiposReportesTipoGrupoFlujoCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja() {
	//	return jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja) {
	//	this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja = jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja = jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja;
	//}
	
	public void setBorderResaltarTiposReportesTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja) {
		this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja = jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposPaginacionTipoGrupoFlujoCaja) {
		this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja = jComboBoxTiposPaginacionTipoGrupoFlujoCaja;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposAccionesTipoGrupoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposRelacionesTipoGrupoFlujoCaja) {
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja = jComboBoxTiposRelacionesTipoGrupoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposAccionesTipoGrupoFlujoCaja) {
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja = jComboBoxTiposAccionesTipoGrupoFlujoCaja;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGrupoFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja() {
	//	return jCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja) {
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja = jCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGrupoFlujoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGrupoFlujoCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja .setBorder(borderResaltar);		
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
		this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
		
		this.tipogrupoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGrupoFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGrupoFlujoCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"nuevo","nuevo","Nuevo"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"duplicar","duplicar","Duplicar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"copiar","copiar","Copiar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"ver_form","ver_form","Ver"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"recargar","recargar","Recargar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,
							"cerrar","cerrar","Salir"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja;
			
				this.jButtonProcesarInformacionToolBarTipoGrupoFlujoCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGrupoFlujoCaja;
				
		//protected JButton jButtonModificarToolBarTipoGrupoFlujoCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGrupoFlujoCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGrupoFlujoCaja=new JMenuMe("General");
		this.jmenuArchivoTipoGrupoFlujoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGrupoFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDatosTipoGrupoFlujoCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGrupoFlujoCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGrupoFlujoCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGrupoFlujoCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGrupoFlujoCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGrupoFlujoCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGrupoFlujoCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGrupoFlujoCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGrupoFlujoCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGrupoFlujoCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGrupoFlujoCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGrupoFlujoCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGrupoFlujoCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGrupoFlujoCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGrupoFlujoCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGrupoFlujoCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGrupoFlujoCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGrupoFlujoCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGrupoFlujoCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGrupoFlujoCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGrupoFlujoCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGrupoFlujoCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGrupoFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGrupoFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGrupoFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGrupoFlujoCaja.add(this.jMenuItemCerrarTipoGrupoFlujoCaja);
			
			this.jmenuAccionesTipoGrupoFlujoCaja.add(this.jMenuItemNuevoTipoGrupoFlujoCaja);
			this.jmenuAccionesTipoGrupoFlujoCaja.add(this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja);
			this.jmenuAccionesTipoGrupoFlujoCaja.add(this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja);
			this.jmenuAccionesTipoGrupoFlujoCaja.add(this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja);		
			this.jmenuAccionesTipoGrupoFlujoCaja.add(this.jMenuItemDuplicarTipoGrupoFlujoCaja);		
			this.jmenuAccionesTipoGrupoFlujoCaja.add(this.jMenuItemCopiarTipoGrupoFlujoCaja);		
			this.jmenuAccionesTipoGrupoFlujoCaja.add(this.jMenuItemVerFormTipoGrupoFlujoCaja);		
			
			this.jmenuDatosTipoGrupoFlujoCaja.add(this.jMenuItemRecargarInformacionTipoGrupoFlujoCaja);				
			this.jmenuDatosTipoGrupoFlujoCaja.add(this.jMenuItemAnterioresTipoGrupoFlujoCaja);				
			this.jmenuDatosTipoGrupoFlujoCaja.add(this.jMenuItemSiguientesTipoGrupoFlujoCaja);				
			this.jmenuDatosTipoGrupoFlujoCaja.add(this.jMenuItemAbrirOrderByTipoGrupoFlujoCaja);				
			this.jmenuDatosTipoGrupoFlujoCaja.add(this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGrupoFlujoCaja.add(this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGrupoFlujoCaja.add(this.jmenuArchivoTipoGrupoFlujoCaja);		
			this.jmenuBarTipoGrupoFlujoCaja.add(this.jmenuAccionesTipoGrupoFlujoCaja);		
			this.jmenuBarTipoGrupoFlujoCaja.add(this.jmenuDatosTipoGrupoFlujoCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGrupoFlujoCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGrupoFlujoCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoGrupoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoGrupoFlujoCaja.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoGrupoFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoGrupoFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoGrupoFlujoCaja.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoGrupoFlujoCaja,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoGrupoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoGrupoFlujoCaja.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoGrupoFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoGrupoFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoGrupoFlujoCaja.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoGrupoFlujoCaja,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGrupoFlujoCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGrupoFlujoCaja = new TipoGrupoFlujoCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Grupo Flujo Caja DATOS");
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja = new TipoGrupoFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones(),this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja = null;//new TipoGrupoFlujoCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoFlujoCaja= new GridBagLayout();
		
		
		this.jTableDatosTipoGrupoFlujoCaja = new JTableMe();      
		
		String sToolTipTipoGrupoFlujoCaja="";
		sToolTipTipoGrupoFlujoCaja=TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoFlujoCaja+="(Contabilidad.TipoGrupoFlujoCaja)";
		}
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoFlujoCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGrupoFlujoCaja.setToolTipText(sToolTipTipoGrupoFlujoCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGrupoFlujoCaja);
		this.jTableDatosTipoGrupoFlujoCaja.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGrupoFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGrupoFlujoCaja.setRowSelectionAllowed(true);
		this.jTableDatosTipoGrupoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonDuplicarTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonCopiarTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonVerFormTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonCerrarTipoGrupoFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Flujo Caja";
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoFlujoCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja=new ReporteDinamicoJInternalFrame(TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGrupoFlujoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGrupoFlujoCaja=new ImportacionJInternalFrame(TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGrupoFlujoCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGrupoFlujoCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGrupoFlujoCaja.setText("Orden");
		this.jButtonAbrirOrderByTipoGrupoFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoFlujoCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFlujoCaja,false,this);
			
			//this.cargarOrderByTipoGrupoFlujoCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFlujoCaja,true,this);
			
			//this.cargarOrderByTipoGrupoFlujoCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGrupoFlujoCaja.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGrupoFlujoCaja.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGrupoFlujoCaja.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoGrupoFlujoCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoFlujoCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoFlujoCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGrupoFlujoCaja.setText("Nuevo");
		this.jButtonDuplicarTipoGrupoFlujoCaja.setText("Duplicar");
		this.jButtonCopiarTipoGrupoFlujoCaja.setText("Copiar");
		this.jButtonVerFormTipoGrupoFlujoCaja.setText("Ver");
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.setText("Guardar");
		this.jButtonCerrarTipoGrupoFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoFlujoCaja,"nuevo_button","Nuevo",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGrupoFlujoCaja,"duplicar_button","Duplicar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGrupoFlujoCaja,"copiar_button","Copiar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGrupoFlujoCaja,"ver_form","Ver",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGrupoFlujoCaja,"nuevorelaciones_button","Nuevo Rel",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja,"guardarcambiostabla_button","Guardar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoFlujoCaja,"cerrar_button","Salir",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGrupoFlujoCaja.setToolTipText("Nuevo"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGrupoFlujoCaja.setToolTipText("Duplicar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGrupoFlujoCaja.setToolTipText("Copiar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGrupoFlujoCaja.setToolTipText("Ver"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.setToolTipText("Nuevo Rel"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.setToolTipText("Guardar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoFlujoCaja.setToolTipText("Salir"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoFlujoCaja";
		inputMap = this.jButtonNuevoTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoFlujoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGrupoFlujoCaja";
		inputMap = this.jButtonDuplicarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGrupoFlujoCaja"));
		
		//COPIAR
		sMapKey = "CopiarTipoGrupoFlujoCaja";
		inputMap = this.jButtonCopiarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGrupoFlujoCaja"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGrupoFlujoCaja";
		inputMap = this.jButtonVerFormTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGrupoFlujoCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGrupoFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGrupoFlujoCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGrupoFlujoCaja";
		inputMap = this.jButtonModificarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGrupoFlujoCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoFlujoCaja";
		inputMap = this.jButtonCerrarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoFlujoCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGrupoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGrupoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGrupoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGrupoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGrupoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGrupoFlujoCaja.setName("jPanelParametrosReportesTipoGrupoFlujoCaja"); 
		
		this.jPanelParametrosReportesAccionesTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGrupoFlujoCaja.setName("jPanelParametrosReportesAccionesTipoGrupoFlujoCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.setText("Recargar");
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.setToolTipText("Recargar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGrupoFlujoCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja.setText("Procesar");
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja.setToolTipText("Procesar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGrupoFlujoCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGrupoFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoFlujoCaja.setText("Acciones");		
		this.jLabelAccionesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGrupoFlujoCaja = new JButtonMe();
		//this.jButtonAnterioresTipoGrupoFlujoCaja.setText("<<");
        this.jButtonAnterioresTipoGrupoFlujoCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGrupoFlujoCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGrupoFlujoCaja = new JButtonMe();
		//this.jButtonSiguientesTipoGrupoFlujoCaja.setText(">>");
        this.jButtonSiguientesTipoGrupoFlujoCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGrupoFlujoCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja,"nuevoguardarcambios_button","Nue",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGrupoFlujoCaja";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGrupoFlujoCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGrupoFlujoCaja";
		inputMap = this.jButtonRecargarInformacionTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGrupoFlujoCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGrupoFlujoCaja";
		inputMap = this.jButtonSiguientesTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGrupoFlujoCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGrupoFlujoCaja";
		inputMap = this.jButtonAnterioresTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGrupoFlujoCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGrupoFlujoCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),TipoGrupoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),TipoGrupoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),TipoGrupoFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGrupoFlujoCaja = new GridBagLayout();

			this.jPanelPaginacionTipoGrupoFlujoCaja.setLayout(gridaBagLayoutPaginacionTipoGrupoFlujoCaja);						
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonAnterioresTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
					
						
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
			
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
						
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonSiguientesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonNuevoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonNuevoRelacionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			}
			
			
			if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			}
			
			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonDuplicarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonCopiarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonVerFormTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGrupoFlujoCaja.add(this.jButtonCerrarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
		
		
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGrupoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGrupoFlujoCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGrupoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGrupoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGrupoFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGrupoFlujoCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.setLayout(gridaBagParametrosReportesTipoGrupoFlujoCaja);
			this.jPanelParametrosReportesAccionesTipoGrupoFlujoCaja.setLayout(gridaBagParametrosReportesAccionesTipoGrupoFlujoCaja);
			
			
			this.jPanelParametrosAuxiliar1TipoGrupoFlujoCaja.setLayout(gridaBagParametrosAuxiliar1TipoGrupoFlujoCaja);
			this.jPanelParametrosAuxiliar2TipoGrupoFlujoCaja.setLayout(gridaBagParametrosAuxiliar2TipoGrupoFlujoCaja);
			this.jPanelParametrosAuxiliar3TipoGrupoFlujoCaja.setLayout(gridaBagParametrosAuxiliar3TipoGrupoFlujoCaja);
			this.jPanelParametrosAuxiliar4TipoGrupoFlujoCaja.setLayout(gridaBagParametrosAuxiliar4TipoGrupoFlujoCaja);
			//this.jPanelParametrosAuxiliar5TipoGrupoFlujoCaja.setLayout(gridaBagParametrosAuxiliar2TipoGrupoFlujoCaja);			
			
			
			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jButtonRecargarInformacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoFlujoCaja.add(this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoFlujoCaja.add(this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoFlujoCaja.add(this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jPanelParametrosAuxiliar1TipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGrupoFlujoCaja.add(this.jComboBoxTiposReportesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jPanelParametrosAuxiliar4TipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jComboBoxTiposReportesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jCheckBoxGenerarReporteTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jPanelParametrosAuxiliar2TipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jLabelAccionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jButtonAbrirOrderByTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
			
			
			/*
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoFlujoCaja.add(this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);															
				
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoFlujoCaja.add(this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jPanelParametrosAuxiliar3TipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
				
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.add(this.jComboBoxTiposAccionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGrupoFlujoCaja = new GridBagLayout();

			this.jScrollPanelDatosTipoGrupoFlujoCaja.setLayout(gridaBagLayoutDatosTipoGrupoFlujoCaja);
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
			
			this.jScrollPanelDatosTipoGrupoFlujoCaja.add(this.jTableDatosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGrupoFlujoCaja.setViewportView(this.jTableDatosTipoGrupoFlujoCaja);
		this.jTableDatosTipoGrupoFlujoCaja.setFillsViewportHeight(true);
		this.jTableDatosTipoGrupoFlujoCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesTipoGrupoFlujoCaja.setLayout(gridaBagLayoutAccionesTipoGrupoFlujoCaja);
		
		
		/*	
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
			
		this.jPanelAccionesTipoGrupoFlujoCaja.add(this.jButtonNuevoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoGrupoFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoGrupoFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoGrupoFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoGrupoFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoGrupoFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoGrupoFlujoCaja.setLayout(gridaBagLayoutBusquedaPorCodigoTipoGrupoFlujoCaja);

		gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
		jPanelBusquedaPorCodigoTipoGrupoFlujoCaja.add(jLabelcodigoBusquedaPorCodigoTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);

		gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoGrupoFlujoCaja.gridx = 1;
		jPanelBusquedaPorCodigoTipoGrupoFlujoCaja.add(jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);

		gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
		gridBagConstraintsTipoGrupoFlujoCaja.gridx =1;
		jPanelBusquedaPorCodigoTipoGrupoFlujoCaja.add(jButtonBusquedaPorCodigoTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);

		jTabbedPaneBusquedasTipoGrupoFlujoCaja.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoGrupoFlujoCaja);
		jTabbedPaneBusquedasTipoGrupoFlujoCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoGrupoFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoGrupoFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGrupoFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGrupoFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoGrupoFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoGrupoFlujoCaja.setLayout(gridaBagLayoutBusquedaPorNombreTipoGrupoFlujoCaja);

		gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
		jPanelBusquedaPorNombreTipoGrupoFlujoCaja.add(jLabelnombreBusquedaPorNombreTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);

		gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		gridBagConstraintsTipoGrupoFlujoCaja.gridx = 1;
		jPanelBusquedaPorNombreTipoGrupoFlujoCaja.add(jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);

		gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFlujoCaja.gridy = 1;
		gridBagConstraintsTipoGrupoFlujoCaja.gridx =1;
		jPanelBusquedaPorNombreTipoGrupoFlujoCaja.add(jButtonBusquedaPorNombreTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);

		jTabbedPaneBusquedasTipoGrupoFlujoCaja.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoGrupoFlujoCaja);
		jTabbedPaneBusquedasTipoGrupoFlujoCaja.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoFlujoCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;		
		//this.gridBagConstraintsTipoGrupoFlujoCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGrupoFlujoCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);								
		
		
		/*
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		*/		
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
				
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGrupoFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoFlujoCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGrupoFlujoCaja.setLayout(gridaBagLayoutBusquedasParametrosTipoGrupoFlujoCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			
			
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
			
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGrupoFlujoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGrupoFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.setName("jPanelReporteDinamicoTipoGrupoFlujoCaja"); 
		
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.setLayout(gridaBagLayoutReporteDinamicoTipoGrupoFlujoCaja);
		
		
		this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Flujo Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGrupoFlujoCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGrupoFlujoCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jLabelColumnasSelectReporteTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGrupoFlujoCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGrupoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGrupoFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGrupoFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja=new JScrollPane(this.jListColumnasSelectReporteTipoGrupoFlujoCaja);
			
			this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jListColumnasSelectReporteTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGrupoFlujoCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGrupoFlujoCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jLabelRelacionesSelectReporteTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGrupoFlujoCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGrupoFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGrupoFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGrupoFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGrupoFlujoCaja=new JScrollPane(this.jListRelacionesSelectReporteTipoGrupoFlujoCaja);
			
			this.jScrollRelacionesSelectReporteTipoGrupoFlujoCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoFlujoCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoFlujoCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jListRelacionesSelectReporteTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jScrollRelacionesSelectReporteTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoGrupoFlujoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGrupoFlujoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGrupoFlujoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFlujoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jLabelGenerarExcelReporteDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.setToolTipText("Generar EXCEL"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jComboBoxTiposReportesDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFlujoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFlujoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jLabelTiposArchivoReporteDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja.setToolTipText("Generar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja.setToolTipText("Cancelar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFlujoCaja.add(this.jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGrupoFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja= new JScrollPane(jPanelReporteDinamicoTipoGrupoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Flujo Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGrupoFlujoCaja);
		this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGrupoFlujoCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGrupoFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGrupoFlujoCaja.setName("jPanelImportacionTipoGrupoFlujoCaja"); 
		
		this.jPanelImportacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGrupoFlujoCaja.setLayout(gridaBagLayoutImportacionTipoGrupoFlujoCaja);
		
		
		this.jInternalFrameImportacionTipoGrupoFlujoCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGrupoFlujoCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGrupoFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoFlujoCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Flujo Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGrupoFlujoCaja = new JLabelMe();

		this.jLabelArchivoImportacionTipoGrupoFlujoCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoFlujoCaja.add(this.jLabelArchivoImportacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGrupoFlujoCaja = new JFileChooser();		
		this.jFileChooserImportacionTipoGrupoFlujoCaja.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonAbrirImportacionTipoGrupoFlujoCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGrupoFlujoCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGrupoFlujoCaja.setToolTipText("Generar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFlujoCaja.add(this.jButtonAbrirImportacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGrupoFlujoCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGrupoFlujoCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoFlujoCaja.add(this.jLabelPathArchivoImportacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGrupoFlujoCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFlujoCaja.add(this.jTextFieldPathArchivoImportacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonGenerarImportacionTipoGrupoFlujoCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGrupoFlujoCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGrupoFlujoCaja.setToolTipText("Generar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFlujoCaja.add(this.jButtonGenerarImportacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonCerrarImportacionTipoGrupoFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGrupoFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGrupoFlujoCaja.setToolTipText("Cancelar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFlujoCaja.add(this.jButtonCerrarImportacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGrupoFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGrupoFlujoCaja= new JScrollPane(jPanelImportacionTipoGrupoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGrupoFlujoCaja);
		this.jInternalFrameImportacionTipoGrupoFlujoCaja.getContentPane().add(this.jScrollPanelImportacionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGrupoFlujoCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGrupoFlujoCaja = new JButtonMe();
			this.jButtonAbrirOrderByTipoGrupoFlujoCaja.setText("Orden");
			this.jButtonAbrirOrderByTipoGrupoFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoFlujoCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGrupoFlujoCaja";
			inputMap = this.jButtonAbrirOrderByTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGrupoFlujoCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGrupoFlujoCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGrupoFlujoCaja.setName("jPanelOrderByTipoGrupoFlujoCaja"); 
			
			this.jPanelOrderByTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGrupoFlujoCaja.setLayout(gridaBagLayoutOrderByTipoGrupoFlujoCaja);
			
			
			this.jTableDatosTipoGrupoFlujoCajaOrderBy = new JTableMe();        
			this.jTableDatosTipoGrupoFlujoCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGrupoFlujoCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGrupoFlujoCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGrupoFlujoCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGrupoFlujoCajaOrderBy.setViewportView(this.jTableDatosTipoGrupoFlujoCajaOrderBy);
			this.jTableDatosTipoGrupoFlujoCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGrupoFlujoCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGrupoFlujoCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGrupoFlujoCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGrupoFlujoCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGrupoFlujoCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setTitle("Orden");
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setResizable(true);
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setClosable(true);
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Flujo Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGrupoFlujoCaja.ipady =150;
				
			this.jPanelOrderByTipoGrupoFlujoCaja.add(jScrollPanelDatosTipoGrupoFlujoCajaOrderBy, this.gridBagConstraintsTipoGrupoFlujoCaja);//this.jTableDatosTipoGrupoFlujoCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGrupoFlujoCaja = new JButtonMe();
			this.jButtonCerrarOrderByTipoGrupoFlujoCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGrupoFlujoCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGrupoFlujoCaja.setToolTipText("Cancelar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGrupoFlujoCaja.add(this.jButtonCerrarOrderByTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGrupoFlujoCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGrupoFlujoCaja= new JScrollPane(jPanelOrderByTipoGrupoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGrupoFlujoCaja);
			
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getContentPane().add(this.jScrollPanelOrderByTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
		
		} else {
			this.jButtonAbrirOrderByTipoGrupoFlujoCaja = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGrupoFlujoCaja.getRowHeight();//TipoGrupoFlujoCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja.isSelected()) {
					iHeightTable=TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoFlujoCaja.isSelected()) {
					iHeightTable=TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGrupoFlujoCaja!=null && this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoflujocajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGrupoFlujoCaja> TraerTipoGrupoFlujoCajaBeans(List<TipoGrupoFlujoCaja> tipogrupoflujocajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGrupoFlujoCaja tipogrupoflujocaja:tipogrupoflujocajas) {
					
				if(!(TipoGrupoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGrupoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogrupoflujocaja.setsDetalleGeneralEntityReporte(TipoGrupoFlujoCajaConstantesFunciones.getTipoGrupoFlujoCajaDescripcion(tipogrupoflujocaja));
										
						
					
					

					if(tipogrupoflujocaja.getLineaFlujoCajas()!=null && Funciones.existeClass(classes,LineaFlujoCaja.class)) {
						try{tipogrupoflujocaja.setlineaflujocajasDescripcionReporte(new JRBeanCollectionDataSource(LineaFlujoCajaJInternalFrame.TraerLineaFlujoCajaBeans(tipogrupoflujocaja.getLineaFlujoCajas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogrupoflujocaja.getCentroActividads()!=null && Funciones.existeClass(classes,CentroActividad.class)) {
						try{tipogrupoflujocaja.setcentroactividadsDescripcionReporte(new JRBeanCollectionDataSource(CentroActividadJInternalFrame.TraerCentroActividadBeans(tipogrupoflujocaja.getCentroActividads(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipogrupoflujocaja.setsDetalleGeneralEntityReporte(tipogrupoflujocaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogrupoflujocajabeans.add(tipogrupoflujocajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogrupoflujocajas;
    }
	//PARA REPORTES FIN
}
