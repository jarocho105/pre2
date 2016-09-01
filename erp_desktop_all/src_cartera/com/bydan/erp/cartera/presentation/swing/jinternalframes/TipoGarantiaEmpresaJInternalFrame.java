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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoGarantiaEmpresaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoGarantiaEmpresaJInternalFrame extends TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGarantiaEmpresa;
	
	protected JMenuBar jmenuBarTipoGarantiaEmpresa;
	
	protected JMenu jmenuTipoGarantiaEmpresa;
	protected JMenu jmenuDatosTipoGarantiaEmpresa;
	protected JMenu jmenuArchivoTipoGarantiaEmpresa;
	protected JMenu jmenuAccionesTipoGarantiaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGarantiaEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoGarantiaEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGarantiaEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGarantiaEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGarantiaEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGarantiaEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGarantiaEmpresa> tipogarantiaempresas;		
	public List<TipoGarantiaEmpresa> tipogarantiaempresasEliminados;	
	public List<TipoGarantiaEmpresa> tipogarantiaempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGarantiaEmpresa;		
	protected JButton jButtonAbrirOrderByTipoGarantiaEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoGarantiaEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoGarantiaEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoGarantiaEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGarantiaEmpresaLogic tipogarantiaempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGarantiaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoGarantiaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoGarantiaEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGarantiaEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGarantiaEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoGarantiaEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoGarantiaEmpresa;
	
    protected JPanel jPanelPaginacionTipoGarantiaEmpresa;
    protected JPanel jPanelParametrosReportesTipoGarantiaEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoGarantiaEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGarantiaEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoGarantiaEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoGarantiaEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoGarantiaEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoGarantiaEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGarantiaEmpresa;
	//protected JPanel jPanelImportacionTipoGarantiaEmpresa;
	
	
	public JTable jTableDatosTipoGarantiaEmpresa;
	
	
	
	//public JTable jTableDatosTipoGarantiaEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGarantiaEmpresa;
	protected JButton jButtonDuplicarTipoGarantiaEmpresa;
	protected JButton jButtonCopiarTipoGarantiaEmpresa;
	protected JButton jButtonVerFormTipoGarantiaEmpresa;
	protected JButton jButtonNuevoRelacionesTipoGarantiaEmpresa;
	protected JButton jButtonModificarTipoGarantiaEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoGarantiaEmpresa;
	protected JButton jButtonCerrarTipoGarantiaEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoGarantiaEmpresa;
	protected JButton jButtonProcesarInformacionTipoGarantiaEmpresa;
	
	
	protected JButton jButtonAnterioresTipoGarantiaEmpresa;
	protected JButton jButtonSiguientesTipoGarantiaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoGarantiaEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGarantiaEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoGarantiaEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGarantiaEmpresa;
	//protected JButton jButtonGenerarImportacionTipoGarantiaEmpresa;
	//protected JButton jButtonCerrarImportacionTipoGarantiaEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoGarantiaEmpresa;
	//protected File fileImportacionTipoGarantiaEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGarantiaEmpresa;
	protected JButton jButtonDuplicarToolBarTipoGarantiaEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGarantiaEmpresa;
	protected JButton jButtonCopiarToolBarTipoGarantiaEmpresa;
	protected JButton jButtonVerFormToolBarTipoGarantiaEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGarantiaEmpresa;
	protected JButton jButtonCerrarToolBarTipoGarantiaEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGarantiaEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoGarantiaEmpresa;
	protected JButton jButtonAnterioresToolBarTipoGarantiaEmpresa;
	protected JButton jButtonSiguientesToolBarTipoGarantiaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGarantiaEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoGarantiaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGarantiaEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemCopiarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemVerFormTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemCerrarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoGarantiaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoGarantiaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGarantiaEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGarantiaEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoGarantiaEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGarantiaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGarantiaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGarantiaEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoGarantiaEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGarantiaEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoGarantiaEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoGarantiaEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGarantiaEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGarantiaEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGarantiaEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGarantiaEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGarantiaEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGarantiaEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGarantiaEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoGarantiaEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoGarantiaEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGarantiaEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGarantiaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGarantiaEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGarantiaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGarantiaEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGarantiaEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGarantiaEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGarantiaEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGarantiaEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGarantiaEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGarantiaEmpresa;
	public JPanel jPanelBusquedaPorCodigoTipoGarantiaEmpresa;
	public JButton jButtonBusquedaPorCodigoTipoGarantiaEmpresa;
	public JPanel jPanelBusquedaPorNombreTipoGarantiaEmpresa;
	public JButton jButtonBusquedaPorNombreTipoGarantiaEmpresa;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoGarantiaEmpresa;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa;
	public JButton jButtoncodigoBusquedaPorCodigoTipoGarantiaEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoGarantiaEmpresa;
	public JLabel jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa;
	public JButton jButtonnombreBusquedaPorNombreTipoGarantiaEmpresaBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoGarantiaEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGarantiaEmpresa)	{
		this.jButtonRecargarInformacionTipoGarantiaEmpresa = jButtonRecargarInformacionTipoGarantiaEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoGarantiaEmpresa() {
		return this.jButtonProcesarInformacionTipoGarantiaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGarantiaEmpresa)	{
		this.jButtonProcesarInformacionTipoGarantiaEmpresa = jButtonProcesarInformacionTipoGarantiaEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGarantiaEmpresa() {
		return this.jButtonRecargarInformacionTipoGarantiaEmpresa;
	}
	
	
	public List<TipoGarantiaEmpresa> gettipogarantiaempresas() {
		return this.tipogarantiaempresas;
	}

	public void settipogarantiaempresas(List<TipoGarantiaEmpresa> tipogarantiaempresas) {
		this.tipogarantiaempresas = tipogarantiaempresas;
	}
	
	public List<TipoGarantiaEmpresa> gettipogarantiaempresasAux() {
		return this.tipogarantiaempresasAux;
	}

	public void settipogarantiaempresasAux(List<TipoGarantiaEmpresa> tipogarantiaempresasAux) {
		this.tipogarantiaempresasAux = tipogarantiaempresasAux;
	}
	
	public List<TipoGarantiaEmpresa> gettipogarantiaempresasEliminados() {
		return this.tipogarantiaempresasEliminados;
	}

	public void setTipoGarantiaEmpresasEliminados(List<TipoGarantiaEmpresa> tipogarantiaempresasEliminados) {
		this.tipogarantiaempresasEliminados = tipogarantiaempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGarantiaEmpresa() {
		return jComboBoxTiposSeleccionarTipoGarantiaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoGarantiaEmpresa) {
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa = jComboBoxTiposSeleccionarTipoGarantiaEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGarantiaEmpresa() {
		return jTextFieldValorCampoGeneralTipoGarantiaEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoGarantiaEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoGarantiaEmpresa) {
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa = jTextFieldValorCampoGeneralTipoGarantiaEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGarantiaEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoGarantiaEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoGarantiaEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa = jCheckBoxSeleccionarTodosTipoGarantiaEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGarantiaEmpresa() {
		return this.jCheckBoxSeleccionadosTipoGarantiaEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoGarantiaEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoGarantiaEmpresa) {
		this.jCheckBoxSeleccionadosTipoGarantiaEmpresa = jCheckBoxSeleccionadosTipoGarantiaEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGarantiaEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoGarantiaEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa = jComboBoxTiposArchivosReportesTipoGarantiaEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGarantiaEmpresa() {
		return this.jComboBoxTiposReportesTipoGarantiaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposReportesTipoGarantiaEmpresa) {
		this.jComboBoxTiposReportesTipoGarantiaEmpresa = jComboBoxTiposReportesTipoGarantiaEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGarantiaEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGarantiaEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa = jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGarantiaEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoGarantiaEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa = jComboBoxTiposGraficosReportesTipoGarantiaEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGarantiaEmpresa() {
		return this.jComboBoxTiposPaginacionTipoGarantiaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoGarantiaEmpresa) {
		this.jComboBoxTiposPaginacionTipoGarantiaEmpresa = jComboBoxTiposPaginacionTipoGarantiaEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGarantiaEmpresa() {
		return this.jComboBoxTiposRelacionesTipoGarantiaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGarantiaEmpresa() {
		return this.jComboBoxTiposAccionesTipoGarantiaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoGarantiaEmpresa) {
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa = jComboBoxTiposRelacionesTipoGarantiaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGarantiaEmpresa(
			JComboBox jComboBoxTiposAccionesTipoGarantiaEmpresa) {
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa = jComboBoxTiposAccionesTipoGarantiaEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGarantiaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGarantiaEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoGarantiaEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGarantiaEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGarantiaEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoGarantiaEmpresa = jCheckBoxConGraficoDinamicoTipoGarantiaEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGarantiaEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGarantiaEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGarantiaEmpresa .setBorder(borderResaltar);		
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
		this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
		
		this.tipogarantiaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogarantiaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGarantiaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGarantiaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Garantia Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGarantiaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGarantiaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGarantiaEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"copiar","copiar","Copiar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"recargar","recargar","Recargar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGarantiaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoGarantiaEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGarantiaEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoGarantiaEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGarantiaEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGarantiaEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoGarantiaEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGarantiaEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoGarantiaEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGarantiaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGarantiaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGarantiaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGarantiaEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGarantiaEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGarantiaEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGarantiaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGarantiaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGarantiaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGarantiaEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGarantiaEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGarantiaEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGarantiaEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGarantiaEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGarantiaEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGarantiaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGarantiaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGarantiaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGarantiaEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGarantiaEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGarantiaEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGarantiaEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGarantiaEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGarantiaEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGarantiaEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGarantiaEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGarantiaEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGarantiaEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGarantiaEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGarantiaEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGarantiaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGarantiaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGarantiaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGarantiaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGarantiaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGarantiaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGarantiaEmpresa.add(this.jMenuItemCerrarTipoGarantiaEmpresa);
			
			this.jmenuAccionesTipoGarantiaEmpresa.add(this.jMenuItemNuevoTipoGarantiaEmpresa);
			this.jmenuAccionesTipoGarantiaEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa);
			this.jmenuAccionesTipoGarantiaEmpresa.add(this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa);
			this.jmenuAccionesTipoGarantiaEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa);		
			this.jmenuAccionesTipoGarantiaEmpresa.add(this.jMenuItemDuplicarTipoGarantiaEmpresa);		
			this.jmenuAccionesTipoGarantiaEmpresa.add(this.jMenuItemCopiarTipoGarantiaEmpresa);		
			this.jmenuAccionesTipoGarantiaEmpresa.add(this.jMenuItemVerFormTipoGarantiaEmpresa);		
			
			this.jmenuDatosTipoGarantiaEmpresa.add(this.jMenuItemRecargarInformacionTipoGarantiaEmpresa);				
			this.jmenuDatosTipoGarantiaEmpresa.add(this.jMenuItemAnterioresTipoGarantiaEmpresa);				
			this.jmenuDatosTipoGarantiaEmpresa.add(this.jMenuItemSiguientesTipoGarantiaEmpresa);				
			this.jmenuDatosTipoGarantiaEmpresa.add(this.jMenuItemAbrirOrderByTipoGarantiaEmpresa);				
			this.jmenuDatosTipoGarantiaEmpresa.add(this.jMenuItemMostrarOcultarTipoGarantiaEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGarantiaEmpresa.add(this.jMenuItemGuardarCambiosTipoGarantiaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGarantiaEmpresa.add(this.jmenuArchivoTipoGarantiaEmpresa);		
			this.jmenuBarTipoGarantiaEmpresa.add(this.jmenuAccionesTipoGarantiaEmpresa);		
			this.jmenuBarTipoGarantiaEmpresa.add(this.jmenuDatosTipoGarantiaEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGarantiaEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGarantiaEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoGarantiaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoGarantiaEmpresa.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoGarantiaEmpresa= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoGarantiaEmpresa.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoGarantiaEmpresa.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoGarantiaEmpresa,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoGarantiaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoGarantiaEmpresa.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoGarantiaEmpresa= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoGarantiaEmpresa.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoGarantiaEmpresa.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoGarantiaEmpresa,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGarantiaEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGarantiaEmpresa = new TipoGarantiaEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Garantia Empresa DATOS");
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa = new TipoGarantiaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipogarantiaempresaSessionBean.getConGuardarRelaciones(),this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa = null;//new TipoGarantiaEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGarantiaEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoGarantiaEmpresa = new JTableMe();      
		
		String sToolTipTipoGarantiaEmpresa="";
		sToolTipTipoGarantiaEmpresa=TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGarantiaEmpresa+="(Cartera.TipoGarantiaEmpresa)";
		}
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGarantiaEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGarantiaEmpresa.setToolTipText(sToolTipTipoGarantiaEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGarantiaEmpresa);
		this.jTableDatosTipoGarantiaEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGarantiaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGarantiaEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoGarantiaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGarantiaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonCopiarTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonVerFormTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonCerrarTipoGarantiaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoGarantiaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGarantiaEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Garantia Empresa";
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantia Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGarantiaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGarantiaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoGarantiaEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa=new ReporteDinamicoJInternalFrame(TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGarantiaEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGarantiaEmpresa=new ImportacionJInternalFrame(TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGarantiaEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGarantiaEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGarantiaEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoGarantiaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGarantiaEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGarantiaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantiaEmpresa,false,this);
			
			//this.cargarOrderByTipoGarantiaEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGarantiaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantiaEmpresa,true,this);
			
			//this.cargarOrderByTipoGarantiaEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGarantiaEmpresa.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoGarantiaEmpresa.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoGarantiaEmpresa.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoGarantiaEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGarantiaEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGarantiaEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGarantiaEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoGarantiaEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoGarantiaEmpresa.setText("Copiar");
		this.jButtonVerFormTipoGarantiaEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.setText("Guardar");
		this.jButtonCerrarTipoGarantiaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGarantiaEmpresa,"nuevo_button","Nuevo",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGarantiaEmpresa,"duplicar_button","Duplicar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGarantiaEmpresa,"copiar_button","Copiar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGarantiaEmpresa,"ver_form","Ver",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGarantiaEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa,"guardarcambiostabla_button","Guardar",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGarantiaEmpresa,"cerrar_button","Salir",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGarantiaEmpresa.setToolTipText("Nuevo"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGarantiaEmpresa.setToolTipText("Duplicar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGarantiaEmpresa.setToolTipText("Copiar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGarantiaEmpresa.setToolTipText("Ver"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa.setToolTipText("Nuevo Rel"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.setToolTipText("Guardar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGarantiaEmpresa.setToolTipText("Salir"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGarantiaEmpresa";
		inputMap = this.jButtonNuevoTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGarantiaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGarantiaEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGarantiaEmpresa";
		inputMap = this.jButtonDuplicarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGarantiaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGarantiaEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoGarantiaEmpresa";
		inputMap = this.jButtonCopiarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGarantiaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGarantiaEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGarantiaEmpresa";
		inputMap = this.jButtonVerFormTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGarantiaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGarantiaEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGarantiaEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGarantiaEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGarantiaEmpresa";
		inputMap = this.jButtonModificarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGarantiaEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGarantiaEmpresa";
		inputMap = this.jButtonCerrarTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGarantiaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGarantiaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGarantiaEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGarantiaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGarantiaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGarantiaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGarantiaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGarantiaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGarantiaEmpresa.setName("jPanelParametrosReportesTipoGarantiaEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGarantiaEmpresa.setName("jPanelParametrosReportesAccionesTipoGarantiaEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.setToolTipText("Recargar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGarantiaEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoGarantiaEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoGarantiaEmpresa.setToolTipText("Procesar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGarantiaEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGarantiaEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGarantiaEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoGarantiaEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGarantiaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGarantiaEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoGarantiaEmpresa.setText("<<");
        this.jButtonAnterioresTipoGarantiaEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGarantiaEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGarantiaEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoGarantiaEmpresa.setText(">>");
        this.jButtonSiguientesTipoGarantiaEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGarantiaEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa,"nuevoguardarcambios_button","Nue",this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGarantiaEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGarantiaEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGarantiaEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGarantiaEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGarantiaEmpresa";
		inputMap = this.jButtonSiguientesTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGarantiaEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGarantiaEmpresa";
		inputMap = this.jButtonAnterioresTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGarantiaEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGarantiaEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoGarantiaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGarantiaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoGarantiaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGarantiaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoGarantiaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGarantiaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGarantiaEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoGarantiaEmpresa.setLayout(gridaBagLayoutPaginacionTipoGarantiaEmpresa);						
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonAnterioresTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
					
						
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
						
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonSiguientesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonNuevoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
				this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonNuevoRelacionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			}
			
			
			if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
				this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonDuplicarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonCopiarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonVerFormTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGarantiaEmpresa.add(this.jButtonCerrarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGarantiaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGarantiaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGarantiaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGarantiaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGarantiaEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGarantiaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGarantiaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGarantiaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGarantiaEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGarantiaEmpresa.setLayout(gridaBagParametrosReportesTipoGarantiaEmpresa);
			this.jPanelParametrosReportesAccionesTipoGarantiaEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoGarantiaEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoGarantiaEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoGarantiaEmpresa);
			this.jPanelParametrosAuxiliar2TipoGarantiaEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoGarantiaEmpresa);
			this.jPanelParametrosAuxiliar3TipoGarantiaEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoGarantiaEmpresa);
			this.jPanelParametrosAuxiliar4TipoGarantiaEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoGarantiaEmpresa);
			//this.jPanelParametrosAuxiliar5TipoGarantiaEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoGarantiaEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jButtonRecargarInformacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGarantiaEmpresa.add(this.jComboBoxTiposPaginacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGarantiaEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGarantiaEmpresa.add(this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jPanelParametrosAuxiliar1TipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGarantiaEmpresa.add(this.jComboBoxTiposReportesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jPanelParametrosAuxiliar4TipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jComboBoxTiposReportesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jCheckBoxGenerarReporteTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jPanelParametrosAuxiliar2TipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jLabelAccionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jButtonAbrirOrderByTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGarantiaEmpresa.add(this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);															
				
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGarantiaEmpresa.add(this.jCheckBoxSeleccionadosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jPanelParametrosAuxiliar3TipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jComboBoxTiposRelacionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
				
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jComboBoxTiposAccionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
	
				
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantiaEmpresa.add(this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGarantiaEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoGarantiaEmpresa.setLayout(gridaBagLayoutDatosTipoGarantiaEmpresa);
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoGarantiaEmpresa.add(this.jTableDatosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGarantiaEmpresa.setViewportView(this.jTableDatosTipoGarantiaEmpresa);
		this.jTableDatosTipoGarantiaEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoGarantiaEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGarantiaEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoGarantiaEmpresa.setLayout(gridaBagLayoutAccionesTipoGarantiaEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoGarantiaEmpresa.add(this.jButtonNuevoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoGarantiaEmpresa= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoGarantiaEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoGarantiaEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoGarantiaEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoGarantiaEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoGarantiaEmpresa.setLayout(gridaBagLayoutBusquedaPorCodigoTipoGarantiaEmpresa);

		gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
		jPanelBusquedaPorCodigoTipoGarantiaEmpresa.add(jLabelcodigoBusquedaPorCodigoTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);

		gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		gridBagConstraintsTipoGarantiaEmpresa.gridx = 1;
		jPanelBusquedaPorCodigoTipoGarantiaEmpresa.add(jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);

		gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
		gridBagConstraintsTipoGarantiaEmpresa.gridx =1;
		jPanelBusquedaPorCodigoTipoGarantiaEmpresa.add(jButtonBusquedaPorCodigoTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);

		jTabbedPaneBusquedasTipoGarantiaEmpresa.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoGarantiaEmpresa);
		jTabbedPaneBusquedasTipoGarantiaEmpresa.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoGarantiaEmpresa= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoGarantiaEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGarantiaEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGarantiaEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoGarantiaEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoGarantiaEmpresa.setLayout(gridaBagLayoutBusquedaPorNombreTipoGarantiaEmpresa);

		gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
		jPanelBusquedaPorNombreTipoGarantiaEmpresa.add(jLabelnombreBusquedaPorNombreTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);

		gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantiaEmpresa.gridy = 0;
		gridBagConstraintsTipoGarantiaEmpresa.gridx = 1;
		jPanelBusquedaPorNombreTipoGarantiaEmpresa.add(jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);

		gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantiaEmpresa.gridy = 1;
		gridBagConstraintsTipoGarantiaEmpresa.gridx =1;
		jPanelBusquedaPorNombreTipoGarantiaEmpresa.add(jButtonBusquedaPorNombreTipoGarantiaEmpresa, gridBagConstraintsTipoGarantiaEmpresa);

		jTabbedPaneBusquedasTipoGarantiaEmpresa.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoGarantiaEmpresa);
		jTabbedPaneBusquedasTipoGarantiaEmpresa.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGarantiaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGarantiaEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoGarantiaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoGarantiaEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGarantiaEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;		
			this.gridBagConstraintsTipoGarantiaEmpresa.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGarantiaEmpresa.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		*/		
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =0;
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGarantiaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
				
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGarantiaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGarantiaEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGarantiaEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoGarantiaEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
			
			
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
			
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGarantiaEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGarantiaEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGarantiaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.setName("jPanelReporteDinamicoTipoGarantiaEmpresa"); 
		
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoGarantiaEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGarantiaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantia Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGarantiaEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGarantiaEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jLabelColumnasSelectReporteTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGarantiaEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGarantiaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGarantiaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGarantiaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGarantiaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGarantiaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGarantiaEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoGarantiaEmpresa);
			
			this.jScrollColumnasSelectReporteTipoGarantiaEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGarantiaEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGarantiaEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jListColumnasSelectReporteTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jScrollColumnasSelectReporteTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGarantiaEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGarantiaEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jLabelRelacionesSelectReporteTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGarantiaEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGarantiaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGarantiaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGarantiaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGarantiaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGarantiaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGarantiaEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoGarantiaEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoGarantiaEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGarantiaEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGarantiaEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jListRelacionesSelectReporteTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jScrollRelacionesSelectReporteTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoGarantiaEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGarantiaEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGarantiaEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGarantiaEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGarantiaEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa.setToolTipText("Generar EXCEL"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGarantiaEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGarantiaEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGarantiaEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGarantiaEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGarantiaEmpresa.setToolTipText("Generar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jButtonGenerarReporteDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGarantiaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGarantiaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGarantiaEmpresa.setToolTipText("Cancelar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantiaEmpresa.add(this.jButtonCerrarReporteDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGarantiaEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa= new JScrollPane(jPanelReporteDinamicoTipoGarantiaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantia Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGarantiaEmpresa);
		this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGarantiaEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGarantiaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGarantiaEmpresa.setName("jPanelImportacionTipoGarantiaEmpresa"); 
		
		this.jPanelImportacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGarantiaEmpresa.setLayout(gridaBagLayoutImportacionTipoGarantiaEmpresa);
		
		
		this.jInternalFrameImportacionTipoGarantiaEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGarantiaEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGarantiaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGarantiaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGarantiaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGarantiaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGarantiaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGarantiaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGarantiaEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGarantiaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoGarantiaEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantia Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGarantiaEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoGarantiaEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGarantiaEmpresa.add(this.jLabelArchivoImportacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGarantiaEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoGarantiaEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoGarantiaEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGarantiaEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGarantiaEmpresa.setToolTipText("Generar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantiaEmpresa.add(this.jButtonAbrirImportacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGarantiaEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGarantiaEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGarantiaEmpresa.add(this.jLabelPathArchivoImportacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGarantiaEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGarantiaEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGarantiaEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGarantiaEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantiaEmpresa.add(this.jTextFieldPathArchivoImportacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoGarantiaEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGarantiaEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGarantiaEmpresa.setToolTipText("Generar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantiaEmpresa.add(this.jButtonGenerarImportacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGarantiaEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoGarantiaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGarantiaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGarantiaEmpresa.setToolTipText("Cancelar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantiaEmpresa.add(this.jButtonCerrarImportacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGarantiaEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGarantiaEmpresa= new JScrollPane(jPanelImportacionTipoGarantiaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGarantiaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGarantiaEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGarantiaEmpresa);
		this.jInternalFrameImportacionTipoGarantiaEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGarantiaEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGarantiaEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoGarantiaEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoGarantiaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGarantiaEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGarantiaEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoGarantiaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGarantiaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGarantiaEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGarantiaEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGarantiaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGarantiaEmpresa.setName("jPanelOrderByTipoGarantiaEmpresa"); 
			
			this.jPanelOrderByTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGarantiaEmpresa.setLayout(gridaBagLayoutOrderByTipoGarantiaEmpresa);
			
			
			this.jTableDatosTipoGarantiaEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoGarantiaEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGarantiaEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGarantiaEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGarantiaEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGarantiaEmpresaOrderBy.setViewportView(this.jTableDatosTipoGarantiaEmpresaOrderBy);
			this.jTableDatosTipoGarantiaEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGarantiaEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGarantiaEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGarantiaEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGarantiaEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGarantiaEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGarantiaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantia Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGarantiaEmpresa.ipady =150;
				
			this.jPanelOrderByTipoGarantiaEmpresa.add(jScrollPanelDatosTipoGarantiaEmpresaOrderBy, this.gridBagConstraintsTipoGarantiaEmpresa);//this.jTableDatosTipoGarantiaEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGarantiaEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoGarantiaEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGarantiaEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGarantiaEmpresa.setToolTipText("Cancelar"+" "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGarantiaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGarantiaEmpresa.add(this.jButtonCerrarOrderByTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGarantiaEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGarantiaEmpresa= new JScrollPane(jPanelOrderByTipoGarantiaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGarantiaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantiaEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGarantiaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGarantiaEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGarantiaEmpresa);
			
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoGarantiaEmpresa, this.gridBagConstraintsTipoGarantiaEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoGarantiaEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGarantiaEmpresa.getRowHeight();//TipoGarantiaEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa.isSelected()) {
					iHeightTable=TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGarantiaEmpresa.isSelected()) {
					iHeightTable=TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGarantiaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGarantiaEmpresa!=null && this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGarantiaEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGarantiaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGarantiaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGarantiaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogarantiaempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGarantiaEmpresa> TraerTipoGarantiaEmpresaBeans(List<TipoGarantiaEmpresa> tipogarantiaempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresas) {
					
				if(!(TipoGarantiaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGarantiaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogarantiaempresa.setsDetalleGeneralEntityReporte(TipoGarantiaEmpresaConstantesFunciones.getTipoGarantiaEmpresaDescripcion(tipogarantiaempresa));
										
					tipogarantiaempresa.setes_defecto_descripcion(TipoGarantiaEmpresaConstantesFunciones.getes_defectoDescripcion(tipogarantiaempresa));	
					
					

					if(tipogarantiaempresa.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{tipogarantiaempresa.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(tipogarantiaempresa.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogarantiaempresa.getGarantiaClientes()!=null && Funciones.existeClass(classes,GarantiaCliente.class)) {
						try{tipogarantiaempresa.setgarantiaclientesDescripcionReporte(new JRBeanCollectionDataSource(GarantiaClienteJInternalFrame.TraerGarantiaClienteBeans(tipogarantiaempresa.getGarantiaClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipogarantiaempresa.setsDetalleGeneralEntityReporte(tipogarantiaempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogarantiaempresabeans.add(tipogarantiaempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogarantiaempresas;
    }
	//PARA REPORTES FIN
}
