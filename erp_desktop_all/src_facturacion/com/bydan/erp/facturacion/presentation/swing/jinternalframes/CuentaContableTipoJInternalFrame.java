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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.CuentaContableTipoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class CuentaContableTipoJInternalFrame extends CuentaContableTipoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaContableTipo;
	
	protected JMenuBar jmenuBarCuentaContableTipo;
	
	protected JMenu jmenuCuentaContableTipo;
	protected JMenu jmenuDatosCuentaContableTipo;
	protected JMenu jmenuArchivoCuentaContableTipo;
	protected JMenu jmenuAccionesCuentaContableTipo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContableTipo;	
	protected GridBagConstraints gridBagConstraintsCuentaContableTipo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaContableTipoDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaContableTipo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaContableTipo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaContableTipo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoCuentaContableTipoBeanSwingJInternalFrame tipocuentacontabletipoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentacontabletipo="";

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";
	
	public CuentaContableTipoSessionBean cuentacontabletipoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoCuentaContableTipoSessionBean tipocuentacontabletipoSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaContableTipo> cuentacontabletipos;		
	public List<CuentaContableTipo> cuentacontabletiposEliminados;	
	public List<CuentaContableTipo> cuentacontabletiposAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaContableTipo;		
	protected JButton jButtonAbrirOrderByCuentaContableTipo;
	
	
	//protected JPanel jPanelOrderByCuentaContableTipo;
	//public JScrollPane jScrollPanelOrderByCuentaContableTipo;	
	//protected JButton jButtonCerrarOrderByCuentaContableTipo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaContableTipoLogic cuentacontabletipoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaContableTipo;
	public JScrollPane jScrollPanelDatosEdicionCuentaContableTipo;
	public JScrollPane jScrollPanelDatosGeneralCuentaContableTipo;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaContableTipoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaContableTipo;
	//public JScrollPane jScrollPanelImportacionCuentaContableTipo;
	
	
	
	protected JPanel jPanelAccionesCuentaContableTipo;
	
    protected JPanel jPanelPaginacionCuentaContableTipo;
    protected JPanel jPanelParametrosReportesCuentaContableTipo;
	protected JPanel jPanelParametrosReportesAccionesCuentaContableTipo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaContableTipo;
	protected JPanel jPanelParametrosAuxiliar2CuentaContableTipo;
	protected JPanel jPanelParametrosAuxiliar3CuentaContableTipo;
	protected JPanel jPanelParametrosAuxiliar4CuentaContableTipo;
	//protected JPanel jPanelParametrosAuxiliar5CuentaContableTipo;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaContableTipo;
	//protected JPanel jPanelImportacionCuentaContableTipo;
	
	
	public JTable jTableDatosCuentaContableTipo;
	
	
	
	//public JTable jTableDatosCuentaContableTipoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaContableTipo;
	protected JButton jButtonDuplicarCuentaContableTipo;
	protected JButton jButtonCopiarCuentaContableTipo;
	protected JButton jButtonVerFormCuentaContableTipo;
	protected JButton jButtonNuevoRelacionesCuentaContableTipo;
	protected JButton jButtonModificarCuentaContableTipo;
	
    protected JButton jButtonGuardarCambiosTablaCuentaContableTipo;
	protected JButton jButtonCerrarCuentaContableTipo;
	
	
	protected JButton jButtonRecargarInformacionCuentaContableTipo;
	protected JButton jButtonProcesarInformacionCuentaContableTipo;
	
	
	protected JButton jButtonAnterioresCuentaContableTipo;
	protected JButton jButtonSiguientesCuentaContableTipo;
	protected JButton jButtonNuevoGuardarCambiosCuentaContableTipo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaContableTipo;
	//protected JButton jButtonCerrarReporteDinamicoCuentaContableTipo;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaContableTipo;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaContableTipo;
	//protected JButton jButtonGenerarImportacionCuentaContableTipo;
	//protected JButton jButtonCerrarImportacionCuentaContableTipo;
	//protected JFileChooser jFileChooserImportacionCuentaContableTipo;
	//protected File fileImportacionCuentaContableTipo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContableTipo;
	protected JButton jButtonDuplicarToolBarCuentaContableTipo;
	protected JButton jButtonNuevoRelacionesToolBarCuentaContableTipo;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaContableTipo;
	protected JButton jButtonCopiarToolBarCuentaContableTipo;
	protected JButton jButtonVerFormToolBarCuentaContableTipo;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaContableTipo;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContableTipo;
	protected JButton jButtonCerrarToolBarCuentaContableTipo;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaContableTipo;
	protected JButton jButtonProcesarInformacionToolBarCuentaContableTipo;
	protected JButton jButtonAnterioresToolBarCuentaContableTipo;
	protected JButton jButtonSiguientesToolBarCuentaContableTipo;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaContableTipo;
	protected JButton jButtonAbrirOrderByToolBarCuentaContableTipo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContableTipo;
	protected JMenuItem jMenuItemDuplicarCuentaContableTipo;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaContableTipo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaContableTipo;
	protected JMenuItem jMenuItemCopiarCuentaContableTipo;
	protected JMenuItem jMenuItemVerFormCuentaContableTipo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContableTipo;
	protected JMenuItem jMenuItemCerrarCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContableTipo;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaContableTipo;
	protected JMenuItem jMenuItemProcesarInformacionCuentaContableTipo;
	protected JMenuItem jMenuItemAnterioresCuentaContableTipo;
	protected JMenuItem jMenuItemSiguientesCuentaContableTipo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContableTipo;
	protected JMenuItem jMenuItemAbrirOrderByCuentaContableTipo;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContableTipo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaContableTipo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaContableTipo;
	protected JCheckBox jCheckBoxSeleccionadosCuentaContableTipo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaContableTipo;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaContableTipo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaContableTipo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaContableTipo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaContableTipo;
	protected JTextField jTextFieldValorCampoGeneralCuentaContableTipo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaContableTipo;
	//public JList<Reporte> jListColumnasSelectReporteCuentaContableTipo;
	//public JScrollPane jScrollColumnasSelectReporteCuentaContableTipo;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaContableTipo;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaContableTipo;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaContableTipo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaContableTipo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaContableTipo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaContableTipo;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaContableTipo;
	
		
	//public JLabel jLabelArchivoImportacionCuentaContableTipo;	
	//public JLabel jLabelPathArchivoImportacionCuentaContableTipo;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaContableTipo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaContableTipo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaContableTipo;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaContableTipo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaContableTipo;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaContableTipo;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaContableTipo;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaContableTipo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaContableTipo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaContableTipo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaContableTipo;
	public JPanel jPanelBusquedaPorNombreCuentaContableTipo;
	public JButton jButtonBusquedaPorNombreCuentaContableTipo;
	public JPanel jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo;
	public JButton jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo;
	public JPanel jPanelFK_IdTipoProductoServicioCuentaContableTipo;
	public JButton jButtonFK_IdTipoProductoServicioCuentaContableTipo;
	
	public JPanel jPanelnombreBusquedaPorNombreCuentaContableTipo;
	public JLabel jLabelnombreBusquedaPorNombreCuentaContableTipo;
	public JTextArea jTextAreanombreBusquedaPorNombreCuentaContableTipo;
	public JButton jButtonnombreBusquedaPorNombreCuentaContableTipoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo;
	public JLabel jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo;
	public JButton jButtonid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo;
	public JLabel jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo;
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuentaContableTipoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableTipoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableTipoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableTipoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaContableTipo)	{
		this.jButtonRecargarInformacionCuentaContableTipo = jButtonRecargarInformacionCuentaContableTipo;
	}
	
	public JButton getjButtonProcesarInformacionCuentaContableTipo() {
		return this.jButtonProcesarInformacionCuentaContableTipo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContableTipo)	{
		this.jButtonProcesarInformacionCuentaContableTipo = jButtonProcesarInformacionCuentaContableTipo;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaContableTipo() {
		return this.jButtonRecargarInformacionCuentaContableTipo;
	}
	
	
	public List<CuentaContableTipo> getcuentacontabletipos() {
		return this.cuentacontabletipos;
	}

	public void setcuentacontabletipos(List<CuentaContableTipo> cuentacontabletipos) {
		this.cuentacontabletipos = cuentacontabletipos;
	}
	
	public List<CuentaContableTipo> getcuentacontabletiposAux() {
		return this.cuentacontabletiposAux;
	}

	public void setcuentacontabletiposAux(List<CuentaContableTipo> cuentacontabletiposAux) {
		this.cuentacontabletiposAux = cuentacontabletiposAux;
	}
	
	public List<CuentaContableTipo> getcuentacontabletiposEliminados() {
		return this.cuentacontabletiposEliminados;
	}

	public void setCuentaContableTiposEliminados(List<CuentaContableTipo> cuentacontabletiposEliminados) {
		this.cuentacontabletiposEliminados = cuentacontabletiposEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaContableTipo() {
		return jComboBoxTiposSeleccionarCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaContableTipo(
			JComboBox jComboBoxTiposSeleccionarCuentaContableTipo) {
		this.jComboBoxTiposSeleccionarCuentaContableTipo = jComboBoxTiposSeleccionarCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaContableTipo() {
		return jTextFieldValorCampoGeneralCuentaContableTipo;
	}

	public void setjTextFieldValorCampoGeneralCuentaContableTipo(
			JTextField jTextFieldValorCampoGeneralCuentaContableTipo) {
		this.jTextFieldValorCampoGeneralCuentaContableTipo = jTextFieldValorCampoGeneralCuentaContableTipo;
	}

	public void setBorderResaltarValorCampoGeneralCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaContableTipo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaContableTipo() {
		return this.jCheckBoxSeleccionarTodosCuentaContableTipo;
	}

	public void setjCheckBoxSeleccionarTodosCuentaContableTipo(
			JCheckBox jCheckBoxSeleccionarTodosCuentaContableTipo) {
		this.jCheckBoxSeleccionarTodosCuentaContableTipo = jCheckBoxSeleccionarTodosCuentaContableTipo;
	}

	public void setBorderResaltarSeleccionarTodosCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaContableTipo() {
		return this.jCheckBoxSeleccionadosCuentaContableTipo;
	}

	public void setjCheckBoxSeleccionadosCuentaContableTipo(
			JCheckBox jCheckBoxSeleccionadosCuentaContableTipo) {
		this.jCheckBoxSeleccionadosCuentaContableTipo = jCheckBoxSeleccionadosCuentaContableTipo;
	}
	
	public void setBorderResaltarSeleccionadosCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaContableTipo() {
		return this.jComboBoxTiposArchivosReportesCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaContableTipo(
			JComboBox jComboBoxTiposArchivosReportesCuentaContableTipo) {
		this.jComboBoxTiposArchivosReportesCuentaContableTipo = jComboBoxTiposArchivosReportesCuentaContableTipo;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaContableTipo() {
		return this.jComboBoxTiposReportesCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaContableTipo(
			JComboBox jComboBoxTiposReportesCuentaContableTipo) {
		this.jComboBoxTiposReportesCuentaContableTipo = jComboBoxTiposReportesCuentaContableTipo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaContableTipo() {
	//	return jComboBoxTiposReportesDinamicoCuentaContableTipo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaContableTipo(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaContableTipo) {
	//	this.jComboBoxTiposReportesDinamicoCuentaContableTipo = jComboBoxTiposReportesDinamicoCuentaContableTipo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaContableTipo() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaContableTipo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo = jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo;
	//}
	
	public void setBorderResaltarTiposReportesCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaContableTipo() {
		return this.jComboBoxTiposGraficosReportesCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaContableTipo(
			JComboBox jComboBoxTiposGraficosReportesCuentaContableTipo) {
		this.jComboBoxTiposGraficosReportesCuentaContableTipo = jComboBoxTiposGraficosReportesCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaContableTipo() {
		return this.jComboBoxTiposPaginacionCuentaContableTipo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaContableTipo(
			JComboBox jComboBoxTiposPaginacionCuentaContableTipo) {
		this.jComboBoxTiposPaginacionCuentaContableTipo = jComboBoxTiposPaginacionCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaContableTipo() {
		return this.jComboBoxTiposRelacionesCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContableTipo() {
		return this.jComboBoxTiposAccionesCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContableTipo(
			JComboBox jComboBoxTiposRelacionesCuentaContableTipo) {
		this.jComboBoxTiposRelacionesCuentaContableTipo = jComboBoxTiposRelacionesCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContableTipo(
			JComboBox jComboBoxTiposAccionesCuentaContableTipo) {
		this.jComboBoxTiposAccionesCuentaContableTipo = jComboBoxTiposAccionesCuentaContableTipo;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaContableTipo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaContableTipo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaContableTipo() {
	//	return jCheckBoxConGraficoDinamicoCuentaContableTipo;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaContableTipo(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaContableTipo) {
	//	this.jCheckBoxConGraficoDinamicoCuentaContableTipo = jCheckBoxConGraficoDinamicoCuentaContableTipo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaContableTipo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaContableTipo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaContableTipo .setBorder(borderResaltar);		
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
		this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		
		this.cuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontabletipoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContableTipoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Contable Tipo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaContableTipo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"nuevo","nuevo","Nuevo"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"duplicar","duplicar","Duplicar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"copiar","copiar","Copiar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"ver_form","ver_form","Ver"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"recargar","recargar","Recargar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaContableTipo,this.jTtoolBarCuentaContableTipo,
							"cerrar","cerrar","Salir"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaContableTipo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaContableTipo;
			
				this.jButtonProcesarInformacionToolBarCuentaContableTipo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaContableTipo;
				
		//protected JButton jButtonModificarToolBarCuentaContableTipo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaContableTipo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaContableTipo=new JMenuMe("General");
		this.jmenuArchivoCuentaContableTipo=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaContableTipo=new JMenuMe("Acciones");
		this.jmenuDatosCuentaContableTipo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContableTipo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContableTipo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContableTipo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaContableTipo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaContableTipo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaContableTipo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaContableTipo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaContableTipo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaContableTipo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaContableTipo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContableTipo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContableTipo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaContableTipo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaContableTipo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaContableTipo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaContableTipo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaContableTipo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaContableTipo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaContableTipo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaContableTipo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaContableTipo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContableTipo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContableTipo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContableTipo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaContableTipo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaContableTipo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaContableTipo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaContableTipo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaContableTipo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaContableTipo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaContableTipo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaContableTipo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaContableTipo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaContableTipo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaContableTipo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaContableTipo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaContableTipo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaContableTipo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaContableTipo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaContableTipo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaContableTipo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaContableTipo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaContableTipo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaContableTipo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaContableTipo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaContableTipo.add(this.jMenuItemCerrarCuentaContableTipo);
			
			this.jmenuAccionesCuentaContableTipo.add(this.jMenuItemNuevoCuentaContableTipo);
			this.jmenuAccionesCuentaContableTipo.add(this.jMenuItemNuevoGuardarCambiosCuentaContableTipo);
			this.jmenuAccionesCuentaContableTipo.add(this.jMenuItemNuevoRelacionesCuentaContableTipo);
			this.jmenuAccionesCuentaContableTipo.add(this.jMenuItemGuardarCambiosTablaCuentaContableTipo);		
			this.jmenuAccionesCuentaContableTipo.add(this.jMenuItemDuplicarCuentaContableTipo);		
			this.jmenuAccionesCuentaContableTipo.add(this.jMenuItemCopiarCuentaContableTipo);		
			this.jmenuAccionesCuentaContableTipo.add(this.jMenuItemVerFormCuentaContableTipo);		
			
			this.jmenuDatosCuentaContableTipo.add(this.jMenuItemRecargarInformacionCuentaContableTipo);				
			this.jmenuDatosCuentaContableTipo.add(this.jMenuItemAnterioresCuentaContableTipo);				
			this.jmenuDatosCuentaContableTipo.add(this.jMenuItemSiguientesCuentaContableTipo);				
			this.jmenuDatosCuentaContableTipo.add(this.jMenuItemAbrirOrderByCuentaContableTipo);				
			this.jmenuDatosCuentaContableTipo.add(this.jMenuItemMostrarOcultarCuentaContableTipo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaContableTipo.add(this.jMenuItemGuardarCambiosCuentaContableTipo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaContableTipo.add(this.jmenuArchivoCuentaContableTipo);		
			this.jmenuBarCuentaContableTipo.add(this.jmenuAccionesCuentaContableTipo);		
			this.jmenuBarCuentaContableTipo.add(this.jmenuDatosCuentaContableTipo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaContableTipo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaContableTipo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCuentaContableTipo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCuentaContableTipo= new JButtonMe();
		this.jButtonBusquedaPorNombreCuentaContableTipo.setText("Buscar");
		this.jButtonBusquedaPorNombreCuentaContableTipo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCuentaContableTipo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCuentaContableTipo = new JLabelMe();
		jLabelnombreBusquedaPorNombreCuentaContableTipo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCuentaContableTipo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreCuentaContableTipo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo.setToolTipText("Buscar Por T. Cuenta Contable Tipo ");
		this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo= new JButtonMe();
		this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo.setText("Buscar");
		this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo.setToolTipText("Buscar Por T. Cuenta Contable Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo,"buscar_button","Buscar Por T. Cuenta Contable Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo = new JLabelMe();
		jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setText("T. Cuenta Contable Tipo :");
		jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setToolTipText("T. Cuenta Contable Tipo");
		jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoServicioCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoServicioCuentaContableTipo.setToolTipText("Buscar Por T. Producto Servicio ");
		this.jButtonFK_IdTipoProductoServicioCuentaContableTipo= new JButtonMe();
		this.jButtonFK_IdTipoProductoServicioCuentaContableTipo.setText("Buscar");
		this.jButtonFK_IdTipoProductoServicioCuentaContableTipo.setToolTipText("Buscar Por T. Producto Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoServicioCuentaContableTipo,"buscar_button","Buscar Por T. Producto Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoServicioCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo = new JLabelMe();
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setText("T. Producto Servicio :");
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setToolTipText("T. Producto Servicio");
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaContableTipo=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaContableTipo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaContableTipo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaContableTipo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaContableTipo = new CuentaContableTipoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Contable Tipo DATOS");
			this.jInternalFrameDetalleFormCuentaContableTipo = new CuentaContableTipoDetalleFormJInternalFrame(jDesktopPane,this.cuentacontabletipoSessionBean.getConGuardarRelaciones(),this.cuentacontabletipoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaContableTipo = null;//new CuentaContableTipoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContableTipo= new GridBagLayout();
		
		
		this.jTableDatosCuentaContableTipo = new JTableMe();      
		
		String sToolTipCuentaContableTipo="";
		sToolTipCuentaContableTipo=CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContableTipo+="(Facturacion.CuentaContableTipo)";
		}
		
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContableTipo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaContableTipo.setToolTipText(sToolTipCuentaContableTipo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaContableTipo);
		this.jTableDatosCuentaContableTipo.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaContableTipo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaContableTipo.setRowSelectionAllowed(true);
		this.jTableDatosCuentaContableTipo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaContableTipo = new JButtonMe();
		this.jButtonDuplicarCuentaContableTipo = new JButtonMe();
		this.jButtonCopiarCuentaContableTipo = new JButtonMe();
		this.jButtonVerFormCuentaContableTipo = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaContableTipo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarCuentaContableTipo = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContableTipo = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaContableTipo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Contable Tipo";
		
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Tipos" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContableTipo.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContableTipo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuentaContableTipo=new ReporteDinamicoJInternalFrame(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaContableTipo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaContableTipo=new ImportacionJInternalFrame(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaContableTipo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaContableTipo = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaContableTipo.setText("Orden");
		this.jButtonAbrirOrderByCuentaContableTipo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContableTipo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContableTipo,false,this);
			
			//this.cargarOrderByCuentaContableTipo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContableTipo,true,this);
			
			//this.cargarOrderByCuentaContableTipo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaContableTipo.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosCuentaContableTipo.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosCuentaContableTipo.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosCuentaContableTipo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContableTipo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaContableTipo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaContableTipo.setText("Nuevo");
		this.jButtonDuplicarCuentaContableTipo.setText("Duplicar");
		this.jButtonCopiarCuentaContableTipo.setText("Copiar");
		this.jButtonVerFormCuentaContableTipo.setText("Ver");
		this.jButtonNuevoRelacionesCuentaContableTipo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo.setText("Guardar");
		this.jButtonCerrarCuentaContableTipo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContableTipo,"nuevo_button","Nuevo",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaContableTipo,"duplicar_button","Duplicar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaContableTipo,"copiar_button","Copiar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaContableTipo,"ver_form","Ver",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaContableTipo,"nuevorelaciones_button","Nuevo Rel",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContableTipo,"guardarcambiostabla_button","Guardar",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContableTipo,"cerrar_button","Salir",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaContableTipo.setToolTipText("Nuevo"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaContableTipo.setToolTipText("Duplicar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaContableTipo.setToolTipText("Copiar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaContableTipo.setToolTipText("Ver"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaContableTipo.setToolTipText("Nuevo Rel"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo.setToolTipText("Guardar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContableTipo.setToolTipText("Salir"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContableTipo";
		inputMap = this.jButtonNuevoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContableTipo"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaContableTipo";
		inputMap = this.jButtonDuplicarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaContableTipo"));
		
		//COPIAR
		sMapKey = "CopiarCuentaContableTipo";
		inputMap = this.jButtonCopiarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaContableTipo"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaContableTipo";
		inputMap = this.jButtonVerFormCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaContableTipo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaContableTipo";
		inputMap = this.jButtonNuevoRelacionesCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaContableTipo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaContableTipo";
		inputMap = this.jButtonModificarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaContableTipo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaContableTipo";
		inputMap = this.jButtonCerrarCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContableTipo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContableTipo";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContableTipo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaContableTipo.setName("jPanelParametrosReportesCuentaContableTipo"); 
		
		this.jPanelParametrosReportesAccionesCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaContableTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaContableTipo.setName("jPanelParametrosReportesAccionesCuentaContableTipo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaContableTipo = new JButtonMe();
		this.jButtonRecargarInformacionCuentaContableTipo.setText("Recargar");
		this.jButtonRecargarInformacionCuentaContableTipo.setToolTipText("Recargar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaContableTipo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaContableTipo = new JButtonMe();
		this.jButtonProcesarInformacionCuentaContableTipo.setText("Procesar");
		this.jButtonProcesarInformacionCuentaContableTipo.setToolTipText("Procesar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaContableTipo.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaContableTipo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContableTipo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaContableTipo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContableTipo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaContableTipo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContableTipo.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaContableTipo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaContableTipo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaContableTipo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaContableTipo.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaContableTipo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaContableTipo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContableTipo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaContableTipo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaContableTipo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaContableTipo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContableTipo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaContableTipo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaContableTipo = new JLabelMe();
		
		this.jLabelAccionesCuentaContableTipo.setText("Acciones");		
		this.jLabelAccionesCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaContableTipo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaContableTipo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaContableTipo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaContableTipo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaContableTipo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaContableTipo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaContableTipo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaContableTipo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaContableTipo.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaContableTipo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaContableTipo = new JButtonMe();
		//this.jButtonAnterioresCuentaContableTipo.setText("<<");
        this.jButtonAnterioresCuentaContableTipo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaContableTipo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaContableTipo = new JButtonMe();
		//this.jButtonSiguientesCuentaContableTipo.setText(">>");
        this.jButtonSiguientesCuentaContableTipo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaContableTipo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaContableTipo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaContableTipo.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaContableTipo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaContableTipo,"nuevoguardarcambios_button","Nue",this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaContableTipo";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaContableTipo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaContableTipo";
		inputMap = this.jButtonRecargarInformacionCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaContableTipo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaContableTipo";
		inputMap = this.jButtonSiguientesCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaContableTipo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaContableTipo";
		inputMap = this.jButtonAnterioresCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaContableTipo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaContableTipo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaContableTipo.setMinimumSize(new Dimension(this.getWidth(),CuentaContableTipoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContableTipoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContableTipo.setMaximumSize(new Dimension(this.getWidth(),CuentaContableTipoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContableTipoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaContableTipo.setPreferredSize(new Dimension(this.getWidth(),CuentaContableTipoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaContableTipoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaContableTipo = new GridBagLayout();

			this.jPanelPaginacionCuentaContableTipo.setLayout(gridaBagLayoutPaginacionCuentaContableTipo);						
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = 0;
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonAnterioresCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
					
						
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContableTipo.gridy = 0;
			
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonNuevoGuardarCambiosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
						
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaContableTipo.gridy = 0;
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonSiguientesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonNuevoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
						
			
			
			if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
				this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaContableTipo.gridy = 1;
				this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaContableTipo.add(this.jButtonGuardarCambiosTablaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			}
			
			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonDuplicarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonCopiarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonVerFormCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = 1;
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaContableTipo.add(this.jButtonCerrarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
		
		
		this.jButtonRecargarInformacionCuentaContableTipo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContableTipo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaContableTipo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaContableTipo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContableTipo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaContableTipo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaContableTipo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContableTipo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaContableTipo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaContableTipo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContableTipo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaContableTipo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaContableTipo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContableTipo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaContableTipo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaContableTipo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContableTipo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaContableTipo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaContableTipo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContableTipo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaContableTipo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaContableTipo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContableTipo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaContableTipo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaContableTipo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContableTipo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaContableTipo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaContableTipo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaContableTipo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaContableTipo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaContableTipo.setLayout(gridaBagParametrosReportesCuentaContableTipo);
			this.jPanelParametrosReportesAccionesCuentaContableTipo.setLayout(gridaBagParametrosReportesAccionesCuentaContableTipo);
			
			
			this.jPanelParametrosAuxiliar1CuentaContableTipo.setLayout(gridaBagParametrosAuxiliar1CuentaContableTipo);
			this.jPanelParametrosAuxiliar2CuentaContableTipo.setLayout(gridaBagParametrosAuxiliar2CuentaContableTipo);
			this.jPanelParametrosAuxiliar3CuentaContableTipo.setLayout(gridaBagParametrosAuxiliar3CuentaContableTipo);
			this.jPanelParametrosAuxiliar4CuentaContableTipo.setLayout(gridaBagParametrosAuxiliar4CuentaContableTipo);
			//this.jPanelParametrosAuxiliar5CuentaContableTipo.setLayout(gridaBagParametrosAuxiliar2CuentaContableTipo);			
			
			
			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jButtonRecargarInformacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContableTipo.add(this.jComboBoxTiposPaginacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContableTipo.add(this.jCheckBoxConAltoMaximoTablaCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaContableTipo.add(this.jComboBoxTiposArchivosReportesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jPanelParametrosAuxiliar1CuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContableTipo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaContableTipo.add(this.jComboBoxTiposReportesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jPanelParametrosAuxiliar4CuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jComboBoxTiposReportesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jCheckBoxGenerarReporteCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jPanelParametrosAuxiliar2CuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContableTipo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jLabelAccionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
				this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaContableTipo.add(this.jButtonAbrirOrderByCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jComboBoxTiposSeleccionarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
			
			
			/*
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContableTipo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jCheckBoxSeleccionarTodosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContableTipo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContableTipo.add(this.jCheckBoxSeleccionarTodosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);															
				
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaContableTipo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaContableTipo.add(this.jCheckBoxSeleccionadosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jPanelParametrosAuxiliar3CuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jComboBoxTiposAccionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
	
				
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaContableTipo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaContableTipo.add(this.jTextFieldValorCampoGeneralCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaContableTipo = new GridBagLayout();

			this.jScrollPanelDatosCuentaContableTipo.setLayout(gridaBagLayoutDatosCuentaContableTipo);
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = 0;
			this.gridBagConstraintsCuentaContableTipo.gridx = 0;
			
			this.jScrollPanelDatosCuentaContableTipo.add(this.jTableDatosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaContableTipo.setViewportView(this.jTableDatosCuentaContableTipo);
		this.jTableDatosCuentaContableTipo.setFillsViewportHeight(true);
		this.jTableDatosCuentaContableTipo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaContableTipo= new GridBagLayout();
		this.jPanelAccionesCuentaContableTipo.setLayout(gridaBagLayoutAccionesCuentaContableTipo);
		
		
		/*	
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
			
		this.jPanelAccionesCuentaContableTipo.add(this.jButtonNuevoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreCuentaContableTipo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCuentaContableTipo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCuentaContableTipo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCuentaContableTipo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCuentaContableTipo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCuentaContableTipo.setLayout(gridaBagLayoutBusquedaPorNombreCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 0;
		gridBagConstraintsCuentaContableTipo.gridx = 0;
		jPanelBusquedaPorNombreCuentaContableTipo.add(jLabelnombreBusquedaPorNombreCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 0;
		gridBagConstraintsCuentaContableTipo.gridx = 1;
		jPanelBusquedaPorNombreCuentaContableTipo.add(jTextAreanombreBusquedaPorNombreCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 1;
		gridBagConstraintsCuentaContableTipo.gridx =1;
		jPanelBusquedaPorNombreCuentaContableTipo.add(jButtonBusquedaPorNombreCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		jTabbedPaneBusquedasCuentaContableTipo.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreCuentaContableTipo);
		jTabbedPaneBusquedasCuentaContableTipo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaContableTipoCuentaContableTipo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaContableTipoCuentaContableTipo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaContableTipoCuentaContableTipo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaContableTipoCuentaContableTipo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaContableTipoCuentaContableTipo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo.setLayout(gridaBagLayoutFK_IdTipoCuentaContableTipoCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 0;
		gridBagConstraintsCuentaContableTipo.gridx = 0;
		jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo.add(jLabelid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 0;
		gridBagConstraintsCuentaContableTipo.gridx = 1;
		jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo.add(jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 1;
		gridBagConstraintsCuentaContableTipo.gridx =1;
		jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo.add(jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		jTabbedPaneBusquedasCuentaContableTipo.addTab("2.-Por T. Cuenta Contable Tipo ", jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);
		jTabbedPaneBusquedasCuentaContableTipo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoServicioCuentaContableTipo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoServicioCuentaContableTipo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioCuentaContableTipo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioCuentaContableTipo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoServicioCuentaContableTipo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoServicioCuentaContableTipo.setLayout(gridaBagLayoutFK_IdTipoProductoServicioCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 0;
		gridBagConstraintsCuentaContableTipo.gridx = 0;
		jPanelFK_IdTipoProductoServicioCuentaContableTipo.add(jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 0;
		gridBagConstraintsCuentaContableTipo.gridx = 1;
		jPanelFK_IdTipoProductoServicioCuentaContableTipo.add(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaContableTipo.gridy = 1;
		gridBagConstraintsCuentaContableTipo.gridx =1;
		jPanelFK_IdTipoProductoServicioCuentaContableTipo.add(jButtonFK_IdTipoProductoServicioCuentaContableTipo, gridBagConstraintsCuentaContableTipo);

		jTabbedPaneBusquedasCuentaContableTipo.addTab("3.-Por T. Producto Servicio ", jPanelFK_IdTipoProductoServicioCuentaContableTipo);
		jTabbedPaneBusquedasCuentaContableTipo.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContableTipo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContableTipo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContableTipo.gridx = 0;		
			//this.gridBagConstraintsCuentaContableTipo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContableTipo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;		
		//this.gridBagConstraintsCuentaContableTipo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaContableTipo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaContableTipo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContableTipo.gridx = 0;		
			this.gridBagConstraintsCuentaContableTipo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaContableTipo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);								
		
		
		/*
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		*/		
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContableTipo.gridx =0;
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContableTipo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
				
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaContableTipo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContableTipo = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaContableTipo.setLayout(gridaBagLayoutBusquedasParametrosCuentaContableTipo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaContableTipo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
			
			
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
			
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContableTipo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaContableTipo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaContableTipo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaContableTipo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaContableTipo.setName("jPanelReporteDinamicoCuentaContableTipo"); 
		
		this.jPanelReporteDinamicoCuentaContableTipo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContableTipo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaContableTipo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaContableTipo.setLayout(gridaBagLayoutReporteDinamicoCuentaContableTipo);
		
		
		this.jInternalFrameReporteDinamicoCuentaContableTipo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaContableTipo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContableTipo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaContableTipo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaContableTipo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaContableTipo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaContableTipo.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaContableTipo.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaContableTipo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaContableTipo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContableTipo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaContableTipo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Tipos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaContableTipo = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaContableTipo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jLabelColumnasSelectReporteCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaContableTipo = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaContableTipo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaContableTipo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaContableTipo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContableTipo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaContableTipo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaContableTipo=new JScrollPane(this.jListColumnasSelectReporteCuentaContableTipo);
			
			this.jScrollColumnasSelectReporteCuentaContableTipo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContableTipo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaContableTipo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaContableTipo.add(this.jListColumnasSelectReporteCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jScrollColumnasSelectReporteCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaContableTipo = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaContableTipo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaContableTipo = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaContableTipo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaContableTipo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaContableTipo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContableTipo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaContableTipo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaContableTipo=new JScrollPane(this.jListRelacionesSelectReporteCuentaContableTipo);
			
			this.jScrollRelacionesSelectReporteCuentaContableTipo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContableTipo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaContableTipo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuentaContableTipo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaContableTipo = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaContableTipo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaContableTipo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaContableTipo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaContableTipo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContableTipo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaContableTipo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaContableTipo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaContableTipo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jLabelGenerarExcelReporteDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaContableTipo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaContableTipo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaContableTipo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaContableTipo.setToolTipText("Generar EXCEL"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaContableTipo.add(this.jButtonGenerarExcelReporteDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jComboBoxTiposReportesDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaContableTipo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaContableTipo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jLabelTiposArchivoReporteDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaContableTipo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaContableTipo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaContableTipo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaContableTipo.setToolTipText("Generar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jButtonGenerarReporteDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaContableTipo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaContableTipo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaContableTipo.setToolTipText("Cancelar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaContableTipo.add(this.jButtonCerrarReporteDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaContableTipo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaContableTipo= new JScrollPane(jPanelReporteDinamicoCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaContableTipo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContableTipo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaContableTipo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Tipos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaContableTipo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaContableTipo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaContableTipo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaContableTipo);
		this.jInternalFrameReporteDinamicoCuentaContableTipo.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaContableTipo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaContableTipo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaContableTipo.setName("jPanelImportacionCuentaContableTipo"); 
		
		this.jPanelImportacionCuentaContableTipo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContableTipo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaContableTipo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaContableTipo.setLayout(gridaBagLayoutImportacionCuentaContableTipo);
		
		
		this.jInternalFrameImportacionCuentaContableTipo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaContableTipo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaContableTipo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaContableTipo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContableTipo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContableTipo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaContableTipo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContableTipo.setResizable(true);
	    this.jInternalFrameImportacionCuentaContableTipo.setClosable(true);
	    this.jInternalFrameImportacionCuentaContableTipo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaContableTipo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaContableTipo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaContableTipo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaContableTipo.setResizable(true);
	    this.jInternalFrameImportacionCuentaContableTipo.setClosable(true);
	    this.jInternalFrameImportacionCuentaContableTipo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaContableTipo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContableTipo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaContableTipo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Tipos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaContableTipo = new JLabelMe();

		this.jLabelArchivoImportacionCuentaContableTipo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContableTipo.add(this.jLabelArchivoImportacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaContableTipo = new JFileChooser();		
		this.jFileChooserImportacionCuentaContableTipo.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaContableTipo = new JButtonMe();
		this.jButtonAbrirImportacionCuentaContableTipo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaContableTipo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaContableTipo.setToolTipText("Generar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContableTipo.add(this.jButtonAbrirImportacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaContableTipo = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaContableTipo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaContableTipo.add(this.jLabelPathArchivoImportacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaContableTipo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaContableTipo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContableTipo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaContableTipo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContableTipo.add(this.jTextFieldPathArchivoImportacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaContableTipo = new JButtonMe();
		this.jButtonGenerarImportacionCuentaContableTipo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaContableTipo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaContableTipo.setToolTipText("Generar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContableTipo.add(this.jButtonGenerarImportacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarImportacionCuentaContableTipo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaContableTipo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaContableTipo.setToolTipText("Cancelar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContableTipo.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaContableTipo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaContableTipo.add(this.jButtonCerrarImportacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaContableTipo = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaContableTipo= new JScrollPane(jPanelImportacionCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsCuentaContableTipo.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaContableTipo.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaContableTipo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaContableTipo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaContableTipo);
		this.jInternalFrameImportacionCuentaContableTipo.getContentPane().add(this.jScrollPanelImportacionCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaContableTipo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaContableTipo = new JButtonMe();
			this.jButtonAbrirOrderByCuentaContableTipo.setText("Orden");
			this.jButtonAbrirOrderByCuentaContableTipo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaContableTipo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaContableTipo";
			inputMap = this.jButtonAbrirOrderByCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaContableTipo"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaContableTipo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaContableTipo.setName("jPanelOrderByCuentaContableTipo"); 
			
			this.jPanelOrderByCuentaContableTipo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContableTipo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaContableTipo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaContableTipo.setLayout(gridaBagLayoutOrderByCuentaContableTipo);
			
			
			this.jTableDatosCuentaContableTipoOrderBy = new JTableMe();        
			this.jTableDatosCuentaContableTipoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaContableTipoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaContableTipoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaContableTipoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaContableTipoOrderBy.setViewportView(this.jTableDatosCuentaContableTipoOrderBy);
			this.jTableDatosCuentaContableTipoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaContableTipoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaContableTipo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaContableTipo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaContableTipo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaContableTipo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaContableTipo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaContableTipo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaContableTipo.setTitle("Orden");
			this.jInternalFrameOrderByCuentaContableTipo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaContableTipo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaContableTipo.setResizable(true);
			this.jInternalFrameOrderByCuentaContableTipo.setClosable(true);
			this.jInternalFrameOrderByCuentaContableTipo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaContableTipo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContableTipo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaContableTipo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contable Tipos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaContableTipo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaContableTipo.ipady =150;
				
			this.jPanelOrderByCuentaContableTipo.add(jScrollPanelDatosCuentaContableTipoOrderBy, this.gridBagConstraintsCuentaContableTipo);//this.jTableDatosCuentaContableTipoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaContableTipo = new JButtonMe();
			this.jButtonCerrarOrderByCuentaContableTipo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaContableTipo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaContableTipo.setToolTipText("Cancelar"+" "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContableTipo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaContableTipo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaContableTipo.add(this.jButtonCerrarOrderByCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaContableTipo = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaContableTipo= new JScrollPane(jPanelOrderByCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsCuentaContableTipo.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaContableTipo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaContableTipo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaContableTipo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaContableTipo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaContableTipo);
			
			this.jInternalFrameOrderByCuentaContableTipo.getContentPane().add(this.jScrollPanelOrderByCuentaContableTipo, this.gridBagConstraintsCuentaContableTipo);			
		
		} else {
			this.jButtonAbrirOrderByCuentaContableTipo = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentacontabletipoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaContableTipo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaContableTipo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaContableTipo.getRowHeight();//CuentaContableTipoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContableTipo.isSelected()) {
					iHeightTable=CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaContableTipo.isSelected()) {
					iHeightTable=CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaContableTipoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaContableTipo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContableTipo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaContableTipo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaContableTipo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContableTipo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaContableTipo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaContableTipo!=null && this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaContableTipo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaContableTipo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaContableTipo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaContableTipo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContableTipo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaContableTipo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentacontabletipoLogic.getCuentaContableTipos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontabletipos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaContableTipo> TraerCuentaContableTipoBeans(List<CuentaContableTipo> cuentacontabletipos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaContableTipo cuentacontabletipo:cuentacontabletipos) {
					
				if(!(CuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentacontabletipo.setsDetalleGeneralEntityReporte(CuentaContableTipoConstantesFunciones.getCuentaContableTipoDescripcion(cuentacontabletipo));
										
						
					
						
					
				} else  {
							
					//cuentacontabletipo.setsDetalleGeneralEntityReporte(cuentacontabletipo.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentacontabletipobeans.add(cuentacontabletipobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentacontabletipos;
    }
	//PARA REPORTES FIN
}
