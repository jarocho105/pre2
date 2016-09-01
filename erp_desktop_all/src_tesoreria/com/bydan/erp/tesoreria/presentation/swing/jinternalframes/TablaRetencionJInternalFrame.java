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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TablaRetencionConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TablaRetencionJInternalFrame extends TablaRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTablaRetencion;
	
	protected JMenuBar jmenuBarTablaRetencion;
	
	protected JMenu jmenuTablaRetencion;
	protected JMenu jmenuDatosTablaRetencion;
	protected JMenu jmenuArchivoTablaRetencion;
	protected JMenu jmenuAccionesTablaRetencion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTablaRetencion;	
	protected GridBagConstraints gridBagConstraintsTablaRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TablaRetencionDetalleFormJInternalFrame jInternalFrameDetalleFormTablaRetencion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTablaRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTablaRetencion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TablaRetencionSessionBean tablaretencionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TablaRetencion> tablaretencions;		
	public List<TablaRetencion> tablaretencionsEliminados;	
	public List<TablaRetencion> tablaretencionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTablaRetencion;		
	protected JButton jButtonAbrirOrderByTablaRetencion;
	
	
	//protected JPanel jPanelOrderByTablaRetencion;
	//public JScrollPane jScrollPanelOrderByTablaRetencion;	
	//protected JButton jButtonCerrarOrderByTablaRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TablaRetencionLogic tablaretencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTablaRetencion;
	public JScrollPane jScrollPanelDatosEdicionTablaRetencion;
	public JScrollPane jScrollPanelDatosGeneralTablaRetencion;
    
	
	
	//public JScrollPane jScrollPanelDatosTablaRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTablaRetencion;
	//public JScrollPane jScrollPanelImportacionTablaRetencion;
	
	
	
	protected JPanel jPanelAccionesTablaRetencion;
	
    protected JPanel jPanelPaginacionTablaRetencion;
    protected JPanel jPanelParametrosReportesTablaRetencion;
	protected JPanel jPanelParametrosReportesAccionesTablaRetencion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TablaRetencion;
	protected JPanel jPanelParametrosAuxiliar2TablaRetencion;
	protected JPanel jPanelParametrosAuxiliar3TablaRetencion;
	protected JPanel jPanelParametrosAuxiliar4TablaRetencion;
	//protected JPanel jPanelParametrosAuxiliar5TablaRetencion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTablaRetencion;
	//protected JPanel jPanelImportacionTablaRetencion;
	
	
	public JTable jTableDatosTablaRetencion;
	
	
	
	//public JTable jTableDatosTablaRetencionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTablaRetencion;
	protected JButton jButtonDuplicarTablaRetencion;
	protected JButton jButtonCopiarTablaRetencion;
	protected JButton jButtonVerFormTablaRetencion;
	protected JButton jButtonNuevoRelacionesTablaRetencion;
	protected JButton jButtonModificarTablaRetencion;
	
    protected JButton jButtonGuardarCambiosTablaTablaRetencion;
	protected JButton jButtonCerrarTablaRetencion;
	
	
	protected JButton jButtonRecargarInformacionTablaRetencion;
	protected JButton jButtonProcesarInformacionTablaRetencion;
	
	
	protected JButton jButtonAnterioresTablaRetencion;
	protected JButton jButtonSiguientesTablaRetencion;
	protected JButton jButtonNuevoGuardarCambiosTablaRetencion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTablaRetencion;
	//protected JButton jButtonCerrarReporteDinamicoTablaRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTablaRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTablaRetencion;
	//protected JButton jButtonGenerarImportacionTablaRetencion;
	//protected JButton jButtonCerrarImportacionTablaRetencion;
	//protected JFileChooser jFileChooserImportacionTablaRetencion;
	//protected File fileImportacionTablaRetencion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTablaRetencion;
	protected JButton jButtonDuplicarToolBarTablaRetencion;
	protected JButton jButtonNuevoRelacionesToolBarTablaRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarTablaRetencion;
	protected JButton jButtonCopiarToolBarTablaRetencion;
	protected JButton jButtonVerFormToolBarTablaRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarTablaRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarTablaRetencion;
	protected JButton jButtonCerrarToolBarTablaRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarTablaRetencion;
	protected JButton jButtonProcesarInformacionToolBarTablaRetencion;
	protected JButton jButtonAnterioresToolBarTablaRetencion;
	protected JButton jButtonSiguientesToolBarTablaRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTablaRetencion;
	protected JButton jButtonAbrirOrderByToolBarTablaRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTablaRetencion;
	protected JMenuItem jMenuItemDuplicarTablaRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesTablaRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencion;
	protected JMenuItem jMenuItemCopiarTablaRetencion;
	protected JMenuItem jMenuItemVerFormTablaRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTablaRetencion;
	protected JMenuItem jMenuItemCerrarTablaRetencion;
	protected JMenuItem jMenuItemDetalleCerrarTablaRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTablaRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTablaRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionTablaRetencion;
	protected JMenuItem jMenuItemProcesarInformacionTablaRetencion;
	protected JMenuItem jMenuItemAnterioresTablaRetencion;
	protected JMenuItem jMenuItemSiguientesTablaRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTablaRetencion;
	protected JMenuItem jMenuItemAbrirOrderByTablaRetencion;
	protected JMenuItem jMenuItemMostrarOcultarTablaRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTablaRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTablaRetencion;
	protected JCheckBox jCheckBoxSeleccionadosTablaRetencion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTablaRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteTablaRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTablaRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTablaRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTablaRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTablaRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTablaRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTablaRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTablaRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTablaRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTablaRetencion;
	protected JTextField jTextFieldValorCampoGeneralTablaRetencion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTablaRetencion;
	//public JList<Reporte> jListColumnasSelectReporteTablaRetencion;
	//public JScrollPane jScrollColumnasSelectReporteTablaRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteTablaRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteTablaRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteTablaRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTablaRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTablaRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTablaRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTablaRetencion;
	
		
	//public JLabel jLabelArchivoImportacionTablaRetencion;	
	//public JLabel jLabelPathArchivoImportacionTablaRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionTablaRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTablaRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTablaRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorTablaRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTablaRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoTablaRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoTablaRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoTablaRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTablaRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTablaRetencion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTablaRetencion;
	public JPanel jPanelBusquedaPorCodigoTablaRetencion;
	public JButton jButtonBusquedaPorCodigoTablaRetencion;
	public JPanel jPanelBusquedaPorNombreTablaRetencion;
	public JButton jButtonBusquedaPorNombreTablaRetencion;
	public JPanel jPanelFK_IdCuentaContableCreditoTablaRetencion;
	public JButton jButtonFK_IdCuentaContableCreditoTablaRetencion;
	public JPanel jPanelFK_IdCuentaContableDebitoTablaRetencion;
	public JButton jButtonFK_IdCuentaContableDebitoTablaRetencion;
	public JPanel jPanelFK_IdTipoRetencionTablaRetencion;
	public JButton jButtonFK_IdTipoRetencionTablaRetencion;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTablaRetencion;
	public JLabel jLabelcodigoBusquedaPorCodigoTablaRetencion;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTablaRetencion;
	public JButton jButtoncodigoBusquedaPorCodigoTablaRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTablaRetencion;
	public JLabel jLabelnombreBusquedaPorNombreTablaRetencion;
	public JTextArea jTextAreanombreBusquedaPorNombreTablaRetencion;
	public JButton jButtonnombreBusquedaPorNombreTablaRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion;
	
	public JPanel jPanelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion;
	public JLabel jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion;
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion;
	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionTablaRetencion;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTablaRetencion= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTablaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTablaRetencionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TablaRetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaRetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaRetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TablaRetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTablaRetencion)	{
		this.jButtonRecargarInformacionTablaRetencion = jButtonRecargarInformacionTablaRetencion;
	}
	
	public JButton getjButtonProcesarInformacionTablaRetencion() {
		return this.jButtonProcesarInformacionTablaRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTablaRetencion)	{
		this.jButtonProcesarInformacionTablaRetencion = jButtonProcesarInformacionTablaRetencion;
	}
	
	
	public JButton getjButtonRecargarInformacionTablaRetencion() {
		return this.jButtonRecargarInformacionTablaRetencion;
	}
	
	
	public List<TablaRetencion> gettablaretencions() {
		return this.tablaretencions;
	}

	public void settablaretencions(List<TablaRetencion> tablaretencions) {
		this.tablaretencions = tablaretencions;
	}
	
	public List<TablaRetencion> gettablaretencionsAux() {
		return this.tablaretencionsAux;
	}

	public void settablaretencionsAux(List<TablaRetencion> tablaretencionsAux) {
		this.tablaretencionsAux = tablaretencionsAux;
	}
	
	public List<TablaRetencion> gettablaretencionsEliminados() {
		return this.tablaretencionsEliminados;
	}

	public void setTablaRetencionsEliminados(List<TablaRetencion> tablaretencionsEliminados) {
		this.tablaretencionsEliminados = tablaretencionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTablaRetencion() {
		return jComboBoxTiposSeleccionarTablaRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTablaRetencion(
			JComboBox jComboBoxTiposSeleccionarTablaRetencion) {
		this.jComboBoxTiposSeleccionarTablaRetencion = jComboBoxTiposSeleccionarTablaRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTablaRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTablaRetencion() {
		return jTextFieldValorCampoGeneralTablaRetencion;
	}

	public void setjTextFieldValorCampoGeneralTablaRetencion(
			JTextField jTextFieldValorCampoGeneralTablaRetencion) {
		this.jTextFieldValorCampoGeneralTablaRetencion = jTextFieldValorCampoGeneralTablaRetencion;
	}

	public void setBorderResaltarValorCampoGeneralTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTablaRetencion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTablaRetencion() {
		return this.jCheckBoxSeleccionarTodosTablaRetencion;
	}

	public void setjCheckBoxSeleccionarTodosTablaRetencion(
			JCheckBox jCheckBoxSeleccionarTodosTablaRetencion) {
		this.jCheckBoxSeleccionarTodosTablaRetencion = jCheckBoxSeleccionarTodosTablaRetencion;
	}

	public void setBorderResaltarSeleccionarTodosTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTablaRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTablaRetencion() {
		return this.jCheckBoxSeleccionadosTablaRetencion;
	}

	public void setjCheckBoxSeleccionadosTablaRetencion(
			JCheckBox jCheckBoxSeleccionadosTablaRetencion) {
		this.jCheckBoxSeleccionadosTablaRetencion = jCheckBoxSeleccionadosTablaRetencion;
	}
	
	public void setBorderResaltarSeleccionadosTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTablaRetencion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTablaRetencion() {
		return this.jComboBoxTiposArchivosReportesTablaRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTablaRetencion(
			JComboBox jComboBoxTiposArchivosReportesTablaRetencion) {
		this.jComboBoxTiposArchivosReportesTablaRetencion = jComboBoxTiposArchivosReportesTablaRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTablaRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTablaRetencion() {
		return this.jComboBoxTiposReportesTablaRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTablaRetencion(
			JComboBox jComboBoxTiposReportesTablaRetencion) {
		this.jComboBoxTiposReportesTablaRetencion = jComboBoxTiposReportesTablaRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTablaRetencion() {
	//	return jComboBoxTiposReportesDinamicoTablaRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTablaRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoTablaRetencion) {
	//	this.jComboBoxTiposReportesDinamicoTablaRetencion = jComboBoxTiposReportesDinamicoTablaRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTablaRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTablaRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTablaRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTablaRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion = jComboBoxTiposArchivosReportesDinamicoTablaRetencion;
	//}
	
	public void setBorderResaltarTiposReportesTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTablaRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTablaRetencion() {
		return this.jComboBoxTiposGraficosReportesTablaRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTablaRetencion(
			JComboBox jComboBoxTiposGraficosReportesTablaRetencion) {
		this.jComboBoxTiposGraficosReportesTablaRetencion = jComboBoxTiposGraficosReportesTablaRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTablaRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTablaRetencion() {
		return this.jComboBoxTiposPaginacionTablaRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTablaRetencion(
			JComboBox jComboBoxTiposPaginacionTablaRetencion) {
		this.jComboBoxTiposPaginacionTablaRetencion = jComboBoxTiposPaginacionTablaRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTablaRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTablaRetencion() {
		return this.jComboBoxTiposRelacionesTablaRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTablaRetencion() {
		return this.jComboBoxTiposAccionesTablaRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTablaRetencion(
			JComboBox jComboBoxTiposRelacionesTablaRetencion) {
		this.jComboBoxTiposRelacionesTablaRetencion = jComboBoxTiposRelacionesTablaRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTablaRetencion(
			JComboBox jComboBoxTiposAccionesTablaRetencion) {
		this.jComboBoxTiposAccionesTablaRetencion = jComboBoxTiposAccionesTablaRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTablaRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTablaRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTablaRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTablaRetencion() {
	//	return jCheckBoxConGraficoDinamicoTablaRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTablaRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTablaRetencion) {
	//	this.jCheckBoxConGraficoDinamicoTablaRetencion = jCheckBoxConGraficoDinamicoTablaRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTablaRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTablaRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTablaRetencion .setBorder(borderResaltar);		
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
		this.tablaretencionSessionBean=new TablaRetencionSessionBean();
		
		this.tablaretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tablaretencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TablaRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TablaRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TablaRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TablaRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TablaRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tabla Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
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
		
		TablaRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TablaRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTablaRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"nuevo","nuevo","Nuevo"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"duplicar","duplicar","Duplicar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"copiar","copiar","Copiar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"ver_form","ver_form","Ver"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"recargar","recargar","Recargar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTablaRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTablaRetencion,this.jTtoolBarTablaRetencion,
							"cerrar","cerrar","Salir"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTablaRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTablaRetencion;
			
				this.jButtonProcesarInformacionToolBarTablaRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTablaRetencion;
				
		//protected JButton jButtonModificarToolBarTablaRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTablaRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTablaRetencion=new JMenuMe("General");
		this.jmenuArchivoTablaRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesTablaRetencion=new JMenuMe("Acciones");
		this.jmenuDatosTablaRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTablaRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTablaRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTablaRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTablaRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTablaRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTablaRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTablaRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTablaRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTablaRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTablaRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTablaRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTablaRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTablaRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTablaRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTablaRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTablaRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTablaRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTablaRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTablaRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTablaRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTablaRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTablaRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTablaRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTablaRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTablaRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTablaRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTablaRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTablaRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTablaRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTablaRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTablaRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTablaRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTablaRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTablaRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTablaRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTablaRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTablaRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTablaRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTablaRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTablaRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTablaRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTablaRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTablaRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTablaRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTablaRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTablaRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTablaRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTablaRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTablaRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTablaRetencion.add(this.jMenuItemCerrarTablaRetencion);
			
			this.jmenuAccionesTablaRetencion.add(this.jMenuItemNuevoTablaRetencion);
			this.jmenuAccionesTablaRetencion.add(this.jMenuItemNuevoGuardarCambiosTablaRetencion);
			this.jmenuAccionesTablaRetencion.add(this.jMenuItemNuevoRelacionesTablaRetencion);
			this.jmenuAccionesTablaRetencion.add(this.jMenuItemGuardarCambiosTablaTablaRetencion);		
			this.jmenuAccionesTablaRetencion.add(this.jMenuItemDuplicarTablaRetencion);		
			this.jmenuAccionesTablaRetencion.add(this.jMenuItemCopiarTablaRetencion);		
			this.jmenuAccionesTablaRetencion.add(this.jMenuItemVerFormTablaRetencion);		
			
			this.jmenuDatosTablaRetencion.add(this.jMenuItemRecargarInformacionTablaRetencion);				
			this.jmenuDatosTablaRetencion.add(this.jMenuItemAnterioresTablaRetencion);				
			this.jmenuDatosTablaRetencion.add(this.jMenuItemSiguientesTablaRetencion);				
			this.jmenuDatosTablaRetencion.add(this.jMenuItemAbrirOrderByTablaRetencion);				
			this.jmenuDatosTablaRetencion.add(this.jMenuItemMostrarOcultarTablaRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTablaRetencion.add(this.jMenuItemGuardarCambiosTablaRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTablaRetencion.add(this.jmenuArchivoTablaRetencion);		
			this.jmenuBarTablaRetencion.add(this.jmenuAccionesTablaRetencion);		
			this.jmenuBarTablaRetencion.add(this.jmenuDatosTablaRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTablaRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTablaRetencion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTablaRetencion.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTablaRetencion= new JButtonMe();
		this.jButtonBusquedaPorCodigoTablaRetencion.setText("Buscar");
		this.jButtonBusquedaPorCodigoTablaRetencion.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTablaRetencion,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTablaRetencion = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTablaRetencion.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTablaRetencion.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTablaRetencion= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTablaRetencion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTablaRetencion= new JButtonMe();
		this.jButtonBusquedaPorNombreTablaRetencion.setText("Buscar");
		this.jButtonBusquedaPorNombreTablaRetencion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTablaRetencion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTablaRetencion = new JLabelMe();
		jLabelnombreBusquedaPorNombreTablaRetencion.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTablaRetencion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTablaRetencion= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCreditoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoTablaRetencion.setToolTipText("Buscar Por Cuenta Contable Credito ");
		this.jButtonFK_IdCuentaContableCreditoTablaRetencion= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoTablaRetencion.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoTablaRetencion.setToolTipText("Buscar Por Cuenta Contable Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoTablaRetencion,"buscar_button","Buscar Por Cuenta Contable Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setText("Cuenta Contable Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setToolTipText("Cuenta Contable Credito");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.setFocusable(false);

		this.jPanelFK_IdCuentaContableDebitoTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDebitoTablaRetencion.setToolTipText("Buscar Por Cuenta Contable Debito ");
		this.jButtonFK_IdCuentaContableDebitoTablaRetencion= new JButtonMe();
		this.jButtonFK_IdCuentaContableDebitoTablaRetencion.setText("Buscar");
		this.jButtonFK_IdCuentaContableDebitoTablaRetencion.setToolTipText("Buscar Por Cuenta Contable Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDebitoTablaRetencion,"buscar_button","Buscar Por Cuenta Contable Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDebitoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion = new JLabelMe();
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setText("Cuenta Contable Debito :");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setToolTipText("Cuenta Contable Debito");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.setFocusable(false);

		this.jPanelFK_IdTipoRetencionTablaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionTablaRetencion.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionTablaRetencion= new JButtonMe();
		this.jButtonFK_IdTipoRetencionTablaRetencion.setText("Buscar");
		this.jButtonFK_IdTipoRetencionTablaRetencion.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionTablaRetencion,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTablaRetencion=new JTabbedPane();


		this.jTabbedPaneBusquedasTablaRetencion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTablaRetencion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTablaRetencion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTablaRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTablaRetencion = new TablaRetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tabla Retencion DATOS");
			this.jInternalFrameDetalleFormTablaRetencion = new TablaRetencionDetalleFormJInternalFrame(jDesktopPane,this.tablaretencionSessionBean.getConGuardarRelaciones(),this.tablaretencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTablaRetencion = null;//new TablaRetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTablaRetencion= new GridBagLayout();
		
		
		this.jTableDatosTablaRetencion = new JTableMe();      
		
		String sToolTipTablaRetencion="";
		sToolTipTablaRetencion=TablaRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTablaRetencion+="(Tesoreria.TablaRetencion)";
		}
		
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTablaRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTablaRetencion.setToolTipText(sToolTipTablaRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTablaRetencion);
		this.jTableDatosTablaRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosTablaRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTablaRetencion.setRowSelectionAllowed(true);
		this.jTableDatosTablaRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTablaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTablaRetencion = new JButtonMe();
		this.jButtonDuplicarTablaRetencion = new JButtonMe();
		this.jButtonCopiarTablaRetencion = new JButtonMe();
		this.jButtonVerFormTablaRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesTablaRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTablaRetencion = new JButtonMe();
		this.jButtonCerrarTablaRetencion = new JButtonMe();
		
		this.jScrollPanelDatosTablaRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTablaRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tabla Retencion";
		
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Retencions" + this.sPath));
		} else {
			this.jScrollPanelDatosTablaRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTablaRetencion.setToolTipText("Acciones");
        this.jPanelAccionesTablaRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTablaRetencion=new ReporteDinamicoJInternalFrame(TablaRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTablaRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTablaRetencion=new ImportacionJInternalFrame(TablaRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTablaRetencion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTablaRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByTablaRetencion.setText("Orden");
		this.jButtonAbrirOrderByTablaRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTablaRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTablaRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaRetencion,false,this);
			
			//this.cargarOrderByTablaRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTablaRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaRetencion,true,this);
			
			//this.cargarOrderByTablaRetencion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTablaRetencion.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosTablaRetencion.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosTablaRetencion.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosTablaRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTablaRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTablaRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTablaRetencion.setText("Nuevo");
		this.jButtonDuplicarTablaRetencion.setText("Duplicar");
		this.jButtonCopiarTablaRetencion.setText("Copiar");
		this.jButtonVerFormTablaRetencion.setText("Ver");
		this.jButtonNuevoRelacionesTablaRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTablaRetencion.setText("Guardar");
		this.jButtonCerrarTablaRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTablaRetencion,"nuevo_button","Nuevo",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTablaRetencion,"duplicar_button","Duplicar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTablaRetencion,"copiar_button","Copiar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTablaRetencion,"ver_form","Ver",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTablaRetencion,"nuevorelaciones_button","Nuevo Rel",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTablaRetencion,"guardarcambiostabla_button","Guardar",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTablaRetencion,"cerrar_button","Salir",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTablaRetencion.setToolTipText("Nuevo"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTablaRetencion.setToolTipText("Duplicar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTablaRetencion.setToolTipText("Copiar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTablaRetencion.setToolTipText("Ver"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTablaRetencion.setToolTipText("Nuevo Rel"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTablaRetencion.setToolTipText("Guardar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTablaRetencion.setToolTipText("Salir"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTablaRetencion";
		inputMap = this.jButtonNuevoTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTablaRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTablaRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTablaRetencion";
		inputMap = this.jButtonDuplicarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTablaRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTablaRetencion"));
		
		//COPIAR
		sMapKey = "CopiarTablaRetencion";
		inputMap = this.jButtonCopiarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTablaRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTablaRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormTablaRetencion";
		inputMap = this.jButtonVerFormTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTablaRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTablaRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTablaRetencion";
		inputMap = this.jButtonNuevoRelacionesTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTablaRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTablaRetencion";
		inputMap = this.jButtonModificarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTablaRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTablaRetencion";
		inputMap = this.jButtonCerrarTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTablaRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTablaRetencion";
		inputMap = this.jButtonGuardarCambiosTablaTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTablaRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TablaRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TablaRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TablaRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TablaRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TablaRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTablaRetencion.setName("jPanelParametrosReportesTablaRetencion"); 
		
		this.jPanelParametrosReportesAccionesTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTablaRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTablaRetencion.setName("jPanelParametrosReportesAccionesTablaRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTablaRetencion = new JButtonMe();
		this.jButtonRecargarInformacionTablaRetencion.setText("Recargar");
		this.jButtonRecargarInformacionTablaRetencion.setToolTipText("Recargar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTablaRetencion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTablaRetencion = new JButtonMe();
		this.jButtonProcesarInformacionTablaRetencion.setText("Procesar");
		this.jButtonProcesarInformacionTablaRetencion.setToolTipText("Procesar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTablaRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionTablaRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTablaRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTablaRetencion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTablaRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesTablaRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTablaRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTablaRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTablaRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTablaRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTablaRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesTablaRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTablaRetencion.setText("Accion");
		this.jComboBoxTiposAccionesTablaRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTablaRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTablaRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarTablaRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTablaRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTablaRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTablaRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTablaRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTablaRetencion = new JLabelMe();
		
		this.jLabelAccionesTablaRetencion.setText("Acciones");		
		this.jLabelAccionesTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTablaRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTablaRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTablaRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTablaRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTablaRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTablaRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTablaRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTablaRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTablaRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTablaRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTablaRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTablaRetencion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTablaRetencion = new JButtonMe();
		//this.jButtonAnterioresTablaRetencion.setText("<<");
        this.jButtonAnterioresTablaRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTablaRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTablaRetencion = new JButtonMe();
		//this.jButtonSiguientesTablaRetencion.setText(">>");
        this.jButtonSiguientesTablaRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTablaRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTablaRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTablaRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTablaRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTablaRetencion,"nuevoguardarcambios_button","Nue",this.tablaretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTablaRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTablaRetencion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTablaRetencion";
		inputMap = this.jButtonRecargarInformacionTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTablaRetencion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTablaRetencion";
		inputMap = this.jButtonSiguientesTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTablaRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTablaRetencion";
		inputMap = this.jButtonAnterioresTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTablaRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTablaRetencion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTablaRetencion.setMinimumSize(new Dimension(this.getWidth(),TablaRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTablaRetencion.setMaximumSize(new Dimension(this.getWidth(),TablaRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTablaRetencion.setPreferredSize(new Dimension(this.getWidth(),TablaRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TablaRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTablaRetencion = new GridBagLayout();

			this.jPanelPaginacionTablaRetencion.setLayout(gridaBagLayoutPaginacionTablaRetencion);						
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = 0;
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTablaRetencion.add(this.jButtonAnterioresTablaRetencion, this.gridBagConstraintsTablaRetencion);
					
						
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTablaRetencion.gridy = 0;
			
			this.jPanelPaginacionTablaRetencion.add(this.jButtonNuevoGuardarCambiosTablaRetencion, this.gridBagConstraintsTablaRetencion);
						
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTablaRetencion.gridy = 0;
			this.jPanelPaginacionTablaRetencion.add(this.jButtonSiguientesTablaRetencion, this.gridBagConstraintsTablaRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = 1;
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaRetencion.add(this.jButtonNuevoTablaRetencion, this.gridBagConstraintsTablaRetencion);
						
			
			
			if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
				this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTablaRetencion.gridy = 1;
				this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTablaRetencion.add(this.jButtonGuardarCambiosTablaTablaRetencion, this.gridBagConstraintsTablaRetencion);
			}
			
			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = 1;
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaRetencion.add(this.jButtonDuplicarTablaRetencion, this.gridBagConstraintsTablaRetencion);
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = 1;
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaRetencion.add(this.jButtonCopiarTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = 1;
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTablaRetencion.add(this.jButtonVerFormTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = 1;
			this.gridBagConstraintsTablaRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTablaRetencion.add(this.jButtonCerrarTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		
		this.jButtonRecargarInformacionTablaRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTablaRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTablaRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTablaRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTablaRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTablaRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTablaRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTablaRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTablaRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTablaRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTablaRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTablaRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTablaRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTablaRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTablaRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTablaRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTablaRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTablaRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTablaRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTablaRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTablaRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTablaRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTablaRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTablaRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTablaRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTablaRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTablaRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTablaRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTablaRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTablaRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTablaRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTablaRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTablaRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTablaRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTablaRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTablaRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTablaRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TablaRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TablaRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TablaRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TablaRetencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTablaRetencion.setLayout(gridaBagParametrosReportesTablaRetencion);
			this.jPanelParametrosReportesAccionesTablaRetencion.setLayout(gridaBagParametrosReportesAccionesTablaRetencion);
			
			
			this.jPanelParametrosAuxiliar1TablaRetencion.setLayout(gridaBagParametrosAuxiliar1TablaRetencion);
			this.jPanelParametrosAuxiliar2TablaRetencion.setLayout(gridaBagParametrosAuxiliar2TablaRetencion);
			this.jPanelParametrosAuxiliar3TablaRetencion.setLayout(gridaBagParametrosAuxiliar3TablaRetencion);
			this.jPanelParametrosAuxiliar4TablaRetencion.setLayout(gridaBagParametrosAuxiliar4TablaRetencion);
			//this.jPanelParametrosAuxiliar5TablaRetencion.setLayout(gridaBagParametrosAuxiliar2TablaRetencion);			
			
			
			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaRetencion.add(this.jButtonRecargarInformacionTablaRetencion, this.gridBagConstraintsTablaRetencion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaRetencion.add(this.jComboBoxTiposPaginacionTablaRetencion, this.gridBagConstraintsTablaRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaRetencion.add(this.jCheckBoxConAltoMaximoTablaTablaRetencion, this.gridBagConstraintsTablaRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TablaRetencion.add(this.jComboBoxTiposArchivosReportesTablaRetencion, this.gridBagConstraintsTablaRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaRetencion.add(this.jPanelParametrosAuxiliar1TablaRetencion, this.gridBagConstraintsTablaRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TablaRetencion.add(this.jComboBoxTiposReportesTablaRetencion, this.gridBagConstraintsTablaRetencion);																		
			
			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TablaRetencion.add(this.jComboBoxTiposGraficosReportesTablaRetencion, this.gridBagConstraintsTablaRetencion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaRetencion.add(this.jPanelParametrosAuxiliar4TablaRetencion, this.gridBagConstraintsTablaRetencion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaRetencion.add(this.jComboBoxTiposReportesTablaRetencion, this.gridBagConstraintsTablaRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaRetencion.add(this.jCheckBoxGenerarReporteTablaRetencion, this.gridBagConstraintsTablaRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaRetencion.add(this.jPanelParametrosAuxiliar2TablaRetencion, this.gridBagConstraintsTablaRetencion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaRetencion.add(this.jLabelAccionesTablaRetencion, this.gridBagConstraintsTablaRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
				this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTablaRetencion.add(this.jButtonAbrirOrderByTablaRetencion, this.gridBagConstraintsTablaRetencion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaRetencion.add(this.jComboBoxTiposSeleccionarTablaRetencion, this.gridBagConstraintsTablaRetencion);			
			
			
			/*
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaRetencion.add(this.jCheckBoxSeleccionarTodosTablaRetencion, this.gridBagConstraintsTablaRetencion);
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTablaRetencion.add(this.jCheckBoxConGraficoReporteTablaRetencion, this.gridBagConstraintsTablaRetencion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaRetencion.add(this.jCheckBoxSeleccionarTodosTablaRetencion, this.gridBagConstraintsTablaRetencion);															
				
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaRetencion.add(this.jCheckBoxSeleccionadosTablaRetencion, this.gridBagConstraintsTablaRetencion);															
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTablaRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TablaRetencion.add(this.jCheckBoxConGraficoReporteTablaRetencion, this.gridBagConstraintsTablaRetencion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTablaRetencion.add(this.jPanelParametrosAuxiliar3TablaRetencion, this.gridBagConstraintsTablaRetencion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaRetencion.add(this.jComboBoxTiposAccionesTablaRetencion, this.gridBagConstraintsTablaRetencion);
	
				
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTablaRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTablaRetencion.add(this.jTextFieldValorCampoGeneralTablaRetencion, this.gridBagConstraintsTablaRetencion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTablaRetencion = new GridBagLayout();

			this.jScrollPanelDatosTablaRetencion.setLayout(gridaBagLayoutDatosTablaRetencion);
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = 0;
			this.gridBagConstraintsTablaRetencion.gridx = 0;
			
			this.jScrollPanelDatosTablaRetencion.add(this.jTableDatosTablaRetencion, this.gridBagConstraintsTablaRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTablaRetencion.setViewportView(this.jTableDatosTablaRetencion);
		this.jTableDatosTablaRetencion.setFillsViewportHeight(true);
		this.jTableDatosTablaRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTablaRetencion= new GridBagLayout();
		this.jPanelAccionesTablaRetencion.setLayout(gridaBagLayoutAccionesTablaRetencion);
		
		
		/*	
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = 0;
		this.gridBagConstraintsTablaRetencion.gridx = 0;
			
		this.jPanelAccionesTablaRetencion.add(this.jButtonNuevoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTablaRetencion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTablaRetencion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTablaRetencion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTablaRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTablaRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTablaRetencion.setLayout(gridaBagLayoutBusquedaPorCodigoTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 0;
		jPanelBusquedaPorCodigoTablaRetencion.add(jLabelcodigoBusquedaPorCodigoTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 1;
		jPanelBusquedaPorCodigoTablaRetencion.add(jTextFieldcodigoBusquedaPorCodigoTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 1;
		gridBagConstraintsTablaRetencion.gridx =1;
		jPanelBusquedaPorCodigoTablaRetencion.add(jButtonBusquedaPorCodigoTablaRetencion, gridBagConstraintsTablaRetencion);

		jTabbedPaneBusquedasTablaRetencion.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTablaRetencion);
		jTabbedPaneBusquedasTablaRetencion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTablaRetencion= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTablaRetencion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTablaRetencion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTablaRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTablaRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTablaRetencion.setLayout(gridaBagLayoutBusquedaPorNombreTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 0;
		jPanelBusquedaPorNombreTablaRetencion.add(jLabelnombreBusquedaPorNombreTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 1;
		jPanelBusquedaPorNombreTablaRetencion.add(jTextAreanombreBusquedaPorNombreTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 1;
		gridBagConstraintsTablaRetencion.gridx =1;
		jPanelBusquedaPorNombreTablaRetencion.add(jButtonBusquedaPorNombreTablaRetencion, gridBagConstraintsTablaRetencion);

		jTabbedPaneBusquedasTablaRetencion.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTablaRetencion);
		jTabbedPaneBusquedasTablaRetencion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoTablaRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoTablaRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoTablaRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoTablaRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoTablaRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoTablaRetencion.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 0;
		jPanelFK_IdCuentaContableCreditoTablaRetencion.add(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 1;
		jPanelFK_IdCuentaContableCreditoTablaRetencion.add(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion, gridBagConstraintsTablaRetencion);


		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 0;
		jPanelFK_IdCuentaContableCreditoTablaRetencion.add(this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 1;
		gridBagConstraintsTablaRetencion.gridx =1;
		jPanelFK_IdCuentaContableCreditoTablaRetencion.add(jButtonFK_IdCuentaContableCreditoTablaRetencion, gridBagConstraintsTablaRetencion);

		jTabbedPaneBusquedasTablaRetencion.addTab("3.-Por Cuenta Contable Credito ", jPanelFK_IdCuentaContableCreditoTablaRetencion);
		jTabbedPaneBusquedasTablaRetencion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDebitoTablaRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDebitoTablaRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoTablaRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoTablaRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDebitoTablaRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDebitoTablaRetencion.setLayout(gridaBagLayoutFK_IdCuentaContableDebitoTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 0;
		jPanelFK_IdCuentaContableDebitoTablaRetencion.add(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 1;
		jPanelFK_IdCuentaContableDebitoTablaRetencion.add(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion, gridBagConstraintsTablaRetencion);


		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 0;
		jPanelFK_IdCuentaContableDebitoTablaRetencion.add(this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 1;
		gridBagConstraintsTablaRetencion.gridx =1;
		jPanelFK_IdCuentaContableDebitoTablaRetencion.add(jButtonFK_IdCuentaContableDebitoTablaRetencion, gridBagConstraintsTablaRetencion);

		jTabbedPaneBusquedasTablaRetencion.addTab("4.-Por Cuenta Contable Debito ", jPanelFK_IdCuentaContableDebitoTablaRetencion);
		jTabbedPaneBusquedasTablaRetencion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionTablaRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionTablaRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionTablaRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionTablaRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionTablaRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionTablaRetencion.setLayout(gridaBagLayoutFK_IdTipoRetencionTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 0;
		jPanelFK_IdTipoRetencionTablaRetencion.add(jLabelid_tipo_retencionFK_IdTipoRetencionTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 0;
		gridBagConstraintsTablaRetencion.gridx = 1;
		jPanelFK_IdTipoRetencionTablaRetencion.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion, gridBagConstraintsTablaRetencion);

		gridBagConstraintsTablaRetencion = new GridBagConstraints();
		gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTablaRetencion.gridy = 1;
		gridBagConstraintsTablaRetencion.gridx =1;
		jPanelFK_IdTipoRetencionTablaRetencion.add(jButtonFK_IdTipoRetencionTablaRetencion, gridBagConstraintsTablaRetencion);

		jTabbedPaneBusquedasTablaRetencion.addTab("5.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionTablaRetencion);
		jTabbedPaneBusquedasTablaRetencion.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTablaRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTablaRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();						
			this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaRetencion.gridx = 0;		
			//this.gridBagConstraintsTablaRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTablaRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTablaRetencion, this.gridBagConstraintsTablaRetencion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTablaRetencion.gridx = 0;		
		//this.gridBagConstraintsTablaRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTablaRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTablaRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTablaRetencion.gridx = 0;		
			this.gridBagConstraintsTablaRetencion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTablaRetencion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTablaRetencion, this.gridBagConstraintsTablaRetencion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTablaRetencion, this.gridBagConstraintsTablaRetencion);								
		
		
		/*
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTablaRetencion, this.gridBagConstraintsTablaRetencion);
		*/		
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTablaRetencion.gridx =0;
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTablaRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTablaRetencion, this.gridBagConstraintsTablaRetencion);
				
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTablaRetencion, this.gridBagConstraintsTablaRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTablaRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTablaRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosTablaRetencion.setLayout(gridaBagLayoutBusquedasParametrosTablaRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTablaRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTablaRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTablaRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTablaRetencion, this.gridBagConstraintsTablaRetencion);
			
			
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
			
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTablaRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTablaRetencion, this.gridBagConstraintsTablaRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTablaRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTablaRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTablaRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTablaRetencion.setName("jPanelReporteDinamicoTablaRetencion"); 
		
		this.jPanelReporteDinamicoTablaRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTablaRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTablaRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTablaRetencion.setLayout(gridaBagLayoutReporteDinamicoTablaRetencion);
		
		
		this.jInternalFrameReporteDinamicoTablaRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTablaRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTablaRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTablaRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTablaRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTablaRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTablaRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTablaRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTablaRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTablaRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTablaRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTablaRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTablaRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTablaRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Retencions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTablaRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteTablaRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelColumnasSelectReporteTablaRetencion, this.gridBagConstraintsTablaRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTablaRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteTablaRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTablaRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTablaRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTablaRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTablaRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTablaRetencion=new JScrollPane(this.jListColumnasSelectReporteTablaRetencion);
			
			this.jScrollColumnasSelectReporteTablaRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTablaRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTablaRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTablaRetencion.add(this.jListColumnasSelectReporteTablaRetencion, this.gridBagConstraintsTablaRetencion);
		this.jPanelReporteDinamicoTablaRetencion.add(this.jScrollColumnasSelectReporteTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTablaRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTablaRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTablaRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTablaRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTablaRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTablaRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTablaRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTablaRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTablaRetencion=new JScrollPane(this.jListRelacionesSelectReporteTablaRetencion);
			
			this.jScrollRelacionesSelectReporteTablaRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTablaRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTablaRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTablaRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTablaRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTablaRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTablaRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTablaRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTablaRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTablaRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTablaRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTablaRetencion = new JLabelMe();

		this.jLabelConGraficoDinamicoTablaRetencion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelConGraficoDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTablaRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTablaRetencion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTablaRetencion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTablaRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTablaRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTablaRetencion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaRetencion.add(this.jCheckBoxConGraficoDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTablaRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTablaRetencion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelColumnaCategoriaGraficoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTablaRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTablaRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTablaRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTablaRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTablaRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTablaRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTablaRetencion.add(this.jComboBoxColumnaCategoriaGraficoTablaRetencion, this.gridBagConstraintsTablaRetencion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTablaRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaValorTablaRetencion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelColumnaCategoriaValorTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTablaRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTablaRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTablaRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTablaRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTablaRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTablaRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTablaRetencion.add(this.jComboBoxColumnaCategoriaValorTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTablaRetencion = new JLabelMe();

		this.jLabelColumnasValoresGraficoTablaRetencion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelColumnasValoresGraficoTablaRetencion, this.gridBagConstraintsTablaRetencion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTablaRetencion = new JList<Reporte>();
		this.jListColumnasValoresGraficoTablaRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTablaRetencion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTablaRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTablaRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTablaRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTablaRetencion=new JScrollPane(this.jListColumnasValoresGraficoTablaRetencion);
			
			this.jScrollColumnasValoresGraficoTablaRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTablaRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTablaRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTablaRetencion.add(this.jListColumnasSelectReporteTablaRetencion, this.gridBagConstraintsTablaRetencion);
		this.jPanelReporteDinamicoTablaRetencion.add(this.jScrollColumnasValoresGraficoTablaRetencion, this.gridBagConstraintsTablaRetencion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTablaRetencion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTablaRetencion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelTiposGraficosReportesDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTablaRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTablaRetencion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTablaRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTablaRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTablaRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTablaRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaRetencion.add(this.jComboBoxTiposGraficosReportesDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTablaRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTablaRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelGenerarExcelReporteDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTablaRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTablaRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTablaRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTablaRetencion.setToolTipText("Generar EXCEL"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTablaRetencion.add(this.jButtonGenerarExcelReporteDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaRetencion.add(this.jComboBoxTiposReportesDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTablaRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTablaRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTablaRetencion.add(this.jLabelTiposArchivoReporteDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTablaRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTablaRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTablaRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTablaRetencion.setToolTipText("Generar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaRetencion.add(this.jButtonGenerarReporteDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTablaRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTablaRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTablaRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTablaRetencion.setToolTipText("Cancelar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTablaRetencion.add(this.jButtonCerrarReporteDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTablaRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTablaRetencion= new JScrollPane(jPanelReporteDinamicoTablaRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTablaRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTablaRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTablaRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Retencions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTablaRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTablaRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTablaRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTablaRetencion);
		this.jInternalFrameReporteDinamicoTablaRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoTablaRetencion, this.gridBagConstraintsTablaRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTablaRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTablaRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTablaRetencion.setName("jPanelImportacionTablaRetencion"); 
		
		this.jPanelImportacionTablaRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTablaRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTablaRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTablaRetencion.setLayout(gridaBagLayoutImportacionTablaRetencion);
		
		
		this.jInternalFrameImportacionTablaRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTablaRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTablaRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTablaRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTablaRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTablaRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTablaRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTablaRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTablaRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTablaRetencion.setResizable(true);
	    this.jInternalFrameImportacionTablaRetencion.setClosable(true);
	    this.jInternalFrameImportacionTablaRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTablaRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTablaRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTablaRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTablaRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTablaRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTablaRetencion.setResizable(true);
	    this.jInternalFrameImportacionTablaRetencion.setClosable(true);
	    this.jInternalFrameImportacionTablaRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTablaRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTablaRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTablaRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Retencions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTablaRetencion = new JLabelMe();

		this.jLabelArchivoImportacionTablaRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTablaRetencion.add(this.jLabelArchivoImportacionTablaRetencion, this.gridBagConstraintsTablaRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTablaRetencion = new JFileChooser();		
		this.jFileChooserImportacionTablaRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTablaRetencion = new JButtonMe();
		this.jButtonAbrirImportacionTablaRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTablaRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTablaRetencion.setToolTipText("Generar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaRetencion.add(this.jButtonAbrirImportacionTablaRetencion, this.gridBagConstraintsTablaRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTablaRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionTablaRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTablaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTablaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTablaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTablaRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTablaRetencion.add(this.jLabelPathArchivoImportacionTablaRetencion, this.gridBagConstraintsTablaRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTablaRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTablaRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTablaRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTablaRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaRetencion.add(this.jTextFieldPathArchivoImportacionTablaRetencion, this.gridBagConstraintsTablaRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTablaRetencion = new JButtonMe();
		this.jButtonGenerarImportacionTablaRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTablaRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTablaRetencion.setToolTipText("Generar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaRetencion.add(this.jButtonGenerarImportacionTablaRetencion, this.gridBagConstraintsTablaRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTablaRetencion = new JButtonMe();
		this.jButtonCerrarImportacionTablaRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTablaRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTablaRetencion.setToolTipText("Cancelar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTablaRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTablaRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTablaRetencion.add(this.jButtonCerrarImportacionTablaRetencion, this.gridBagConstraintsTablaRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTablaRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionTablaRetencion= new JScrollPane(jPanelImportacionTablaRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
		this.gridBagConstraintsTablaRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsTablaRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTablaRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTablaRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTablaRetencion);
		this.jInternalFrameImportacionTablaRetencion.getContentPane().add(this.jScrollPanelImportacionTablaRetencion, this.gridBagConstraintsTablaRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTablaRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTablaRetencion = new JButtonMe();
			this.jButtonAbrirOrderByTablaRetencion.setText("Orden");
			this.jButtonAbrirOrderByTablaRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTablaRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTablaRetencion";
			inputMap = this.jButtonAbrirOrderByTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTablaRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTablaRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTablaRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTablaRetencion.setName("jPanelOrderByTablaRetencion"); 
			
			this.jPanelOrderByTablaRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTablaRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTablaRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTablaRetencion.setLayout(gridaBagLayoutOrderByTablaRetencion);
			
			
			this.jTableDatosTablaRetencionOrderBy = new JTableMe();        
			this.jTableDatosTablaRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTablaRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTablaRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTablaRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTablaRetencionOrderBy.setViewportView(this.jTableDatosTablaRetencionOrderBy);
			this.jTableDatosTablaRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTablaRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTablaRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTablaRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTablaRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTablaRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTablaRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTablaRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTablaRetencion.setTitle("Orden");
			this.jInternalFrameOrderByTablaRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTablaRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTablaRetencion.setResizable(true);
			this.jInternalFrameOrderByTablaRetencion.setClosable(true);
			this.jInternalFrameOrderByTablaRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTablaRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTablaRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTablaRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTablaRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tabla Retencions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTablaRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTablaRetencion.ipady =150;
				
			this.jPanelOrderByTablaRetencion.add(jScrollPanelDatosTablaRetencionOrderBy, this.gridBagConstraintsTablaRetencion);//this.jTableDatosTablaRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTablaRetencion = new JButtonMe();
			this.jButtonCerrarOrderByTablaRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTablaRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTablaRetencion.setToolTipText("Cancelar"+" "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTablaRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTablaRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTablaRetencion.add(this.jButtonCerrarOrderByTablaRetencion, this.gridBagConstraintsTablaRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTablaRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByTablaRetencion= new JScrollPane(jPanelOrderByTablaRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTablaRetencion = new GridBagConstraints();
			this.gridBagConstraintsTablaRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTablaRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTablaRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTablaRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTablaRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTablaRetencion);
			
			this.jInternalFrameOrderByTablaRetencion.getContentPane().add(this.jScrollPanelOrderByTablaRetencion, this.gridBagConstraintsTablaRetencion);			
		
		} else {
			this.jButtonAbrirOrderByTablaRetencion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tablaretencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTablaRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTablaRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTablaRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTablaRetencion.getRowHeight();//TablaRetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TablaRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTablaRetencion.isSelected()) {
					iHeightTable=TablaRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TablaRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TablaRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TablaRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTablaRetencion.isSelected()) {
					iHeightTable=TablaRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TablaRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TablaRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTablaRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTablaRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTablaRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTablaRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTablaRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTablaRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTablaRetencion!=null && this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTablaRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTablaRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTablaRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTablaRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTablaRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTablaRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tablaretencionLogic.getTablaRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaretencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TablaRetencion> TraerTablaRetencionBeans(List<TablaRetencion> tablaretencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TablaRetencion tablaretencion:tablaretencions) {
					
				if(!(TablaRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TablaRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tablaretencion.setsDetalleGeneralEntityReporte(TablaRetencionConstantesFunciones.getTablaRetencionDescripcion(tablaretencion));
										
					tablaretencion.setes_debito_descripcion(TablaRetencionConstantesFunciones.getes_debitoDescripcion(tablaretencion));tablaretencion.setes_retencion_fuente_descripcion(TablaRetencionConstantesFunciones.getes_retencion_fuenteDescripcion(tablaretencion));tablaretencion.setcon_secuencial_descripcion(TablaRetencionConstantesFunciones.getcon_secuencialDescripcion(tablaretencion));tablaretencion.setcon_sub_total_factura_descripcion(TablaRetencionConstantesFunciones.getcon_sub_total_facturaDescripcion(tablaretencion));tablaretencion.setcon_iva_factura_descripcion(TablaRetencionConstantesFunciones.getcon_iva_facturaDescripcion(tablaretencion));	
					
						
					
				} else  {
							
					//tablaretencion.setsDetalleGeneralEntityReporte(tablaretencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tablaretencionbeans.add(tablaretencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tablaretencions;
    }
	//PARA REPORTES FIN
}
