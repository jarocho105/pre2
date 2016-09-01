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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.inventario.util.ServicioConstantesFunciones;

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
public class ServicioJInternalFrame extends ServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarServicio;
	
	protected JMenuBar jmenuBarServicio;
	
	protected JMenu jmenuServicio;
	protected JMenu jmenuDatosServicio;
	protected JMenu jmenuArchivoServicio;
	protected JMenu jmenuAccionesServicio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutServicio;	
	protected GridBagConstraints gridBagConstraintsServicio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ServicioDetalleFormJInternalFrame jInternalFrameDetalleFormServicio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoServicio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionServicio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoServicioBeanSwingJInternalFrame tiposervicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiposervicio="";

	protected EstadoServicioBeanSwingJInternalFrame estadoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscal2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscal2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencion2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencion2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableiva="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableiva2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableiva2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public ServicioSessionBean servicioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoServicioSessionBean tiposervicioSessionBean;
	public EstadoServicioSessionBean estadoservicioSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;
	public CuentaContableSessionBean cuentacontablefiscalSessionBean;
	public CuentaContableSessionBean cuentacontablefiscal2SessionBean;
	public CuentaContableSessionBean cuentacontableretencionSessionBean;
	public CuentaContableSessionBean cuentacontableretencion2SessionBean;
	public CuentaContableSessionBean cuentacontableivaSessionBean;
	public CuentaContableSessionBean cuentacontableiva2SessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Servicio> servicios;		
	public List<Servicio> serviciosEliminados;	
	public List<Servicio> serviciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByServicio;		
	protected JButton jButtonAbrirOrderByServicio;
	
	
	//protected JPanel jPanelOrderByServicio;
	//public JScrollPane jScrollPanelOrderByServicio;	
	//protected JButton jButtonCerrarOrderByServicio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ServicioLogic servicioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosServicio;
	public JScrollPane jScrollPanelDatosEdicionServicio;
	public JScrollPane jScrollPanelDatosGeneralServicio;
    
	
	
	//public JScrollPane jScrollPanelDatosServicioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoServicio;
	//public JScrollPane jScrollPanelImportacionServicio;
	
	
	
	protected JPanel jPanelAccionesServicio;
	
    protected JPanel jPanelPaginacionServicio;
    protected JPanel jPanelParametrosReportesServicio;
	protected JPanel jPanelParametrosReportesAccionesServicio;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralServicio;
	protected Integer iXPanelCamposIniciogeneralServicio=0;
	protected Integer iYPanelCamposIniciogeneralServicio=0;

	protected JPanel jPanelCamposIniciocuenta_contableServicio;
	protected Integer iXPanelCamposIniciocuenta_contableServicio=0;
	protected Integer iYPanelCamposIniciocuenta_contableServicio=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Servicio;
	protected JPanel jPanelParametrosAuxiliar2Servicio;
	protected JPanel jPanelParametrosAuxiliar3Servicio;
	protected JPanel jPanelParametrosAuxiliar4Servicio;
	//protected JPanel jPanelParametrosAuxiliar5Servicio;
	
	
	
	//protected JPanel jPanelReporteDinamicoServicio;
	//protected JPanel jPanelImportacionServicio;
	
	
	public JTable jTableDatosServicio;
	
	
	
	//public JTable jTableDatosServicioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoServicio;
	protected JButton jButtonDuplicarServicio;
	protected JButton jButtonCopiarServicio;
	protected JButton jButtonVerFormServicio;
	protected JButton jButtonNuevoRelacionesServicio;
	protected JButton jButtonModificarServicio;
	
    protected JButton jButtonGuardarCambiosTablaServicio;
	protected JButton jButtonCerrarServicio;
	
	
	protected JButton jButtonRecargarInformacionServicio;
	protected JButton jButtonProcesarInformacionServicio;
	
	
	protected JButton jButtonAnterioresServicio;
	protected JButton jButtonSiguientesServicio;
	protected JButton jButtonNuevoGuardarCambiosServicio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoServicio;
	//protected JButton jButtonCerrarReporteDinamicoServicio;
	//protected JButton jButtonGenerarExcelReporteDinamicoServicio;	
	
	
	
	//protected JButton jButtonAbrirImportacionServicio;
	//protected JButton jButtonGenerarImportacionServicio;
	//protected JButton jButtonCerrarImportacionServicio;
	//protected JFileChooser jFileChooserImportacionServicio;
	//protected File fileImportacionServicio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarServicio;
	protected JButton jButtonDuplicarToolBarServicio;
	protected JButton jButtonNuevoRelacionesToolBarServicio;
	
	
	public JButton jButtonGuardarCambiosToolBarServicio;
	protected JButton jButtonCopiarToolBarServicio;
	protected JButton jButtonVerFormToolBarServicio;
	public JButton jButtonGuardarCambiosTablaToolBarServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarServicio;
	protected JButton jButtonCerrarToolBarServicio;
	
	protected JButton jButtonRecargarInformacionToolBarServicio;
	protected JButton jButtonProcesarInformacionToolBarServicio;
	protected JButton jButtonAnterioresToolBarServicio;
	protected JButton jButtonSiguientesToolBarServicio;
	protected JButton jButtonNuevoGuardarCambiosToolBarServicio;
	protected JButton jButtonAbrirOrderByToolBarServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoServicio;
	protected JMenuItem jMenuItemDuplicarServicio;
	protected JMenuItem jMenuItemNuevoRelacionesServicio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosServicio;
	protected JMenuItem jMenuItemCopiarServicio;
	protected JMenuItem jMenuItemVerFormServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaServicio;
	protected JMenuItem jMenuItemCerrarServicio;
	protected JMenuItem jMenuItemDetalleCerrarServicio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarServicio;
	
	protected JMenuItem jMenuItemRecargarInformacionServicio;
	protected JMenuItem jMenuItemProcesarInformacionServicio;
	protected JMenuItem jMenuItemAnterioresServicio;
	protected JMenuItem jMenuItemSiguientesServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosServicio;
	protected JMenuItem jMenuItemAbrirOrderByServicio;
	protected JMenuItem jMenuItemMostrarOcultarServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesServicio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosServicio;
	protected JCheckBox jCheckBoxSeleccionadosServicio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaServicio;
	protected JCheckBox jCheckBoxConGraficoReporteServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarServicio;
	protected JTextField jTextFieldValorCampoGeneralServicio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteServicio;
	//public JList<Reporte> jListColumnasSelectReporteServicio;
	//public JScrollPane jScrollColumnasSelectReporteServicio;
	
	//public JLabel jLabelRelacionesSelectReporteServicio;
	//public JList<Reporte> jListRelacionesSelectReporteServicio;
	//public JScrollPane jScrollRelacionesSelectReporteServicio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoServicio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoServicio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoServicio;
	//public JLabel jLabelTiposArchivoReporteDinamicoServicio;
	
		
	//public JLabel jLabelArchivoImportacionServicio;	
	//public JLabel jLabelPathArchivoImportacionServicio;
	//protected JTextField jTextFieldPathArchivoImportacionServicio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoServicio;
	
	//public JLabel jLabelColumnaCategoriaValorServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorServicio;
	
	//public JLabel jLabelColumnasValoresGraficoServicio;
	//public JList<Reporte> jListColumnasValoresGraficoServicio;
	//public JScrollPane jScrollColumnasValoresGraficoServicio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoServicio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoServicio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasServicio;
	public JPanel jPanelBusquedaPorCodigoServicio;
	public JButton jButtonBusquedaPorCodigoServicio;
	public JPanel jPanelBusquedaPorNombreServicio;
	public JButton jButtonBusquedaPorNombreServicio;
	public JPanel jPanelFK_IdCuentaContableFiscal2Servicio;
	public JButton jButtonFK_IdCuentaContableFiscal2Servicio;
	public JPanel jPanelFK_IdCuentaContableIva2Servicio;
	public JButton jButtonFK_IdCuentaContableIva2Servicio;
	public JPanel jPanelFK_IdCuentaContableRetencion2Servicio;
	public JButton jButtonFK_IdCuentaContableRetencion2Servicio;
	public JPanel jPanelFK_IdEstadoServicioServicio;
	public JButton jButtonFK_IdEstadoServicioServicio;
	public JPanel jPanelFK_IdTipoServicioServicio;
	public JButton jButtonFK_IdTipoServicioServicio;
	
	public JPanel jPanelcodigoBusquedaPorCodigoServicio;
	public JLabel jLabelcodigoBusquedaPorCodigoServicio;
	public JTextArea jTextAreacodigoBusquedaPorCodigoServicio;
	public JButton jButtoncodigoBusquedaPorCodigoServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreServicio;
	public JLabel jLabelnombreBusquedaPorNombreServicio;
	public JTextArea jTextAreanombreBusquedaPorNombreServicio;
	public JButton jButtonnombreBusquedaPorNombreServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio;
	public JLabel jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio;
	public JButton jButtonid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2ServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2ServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2ServicioArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio;
	
	public JPanel jPanelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio;
	public JLabel jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio;
	public JButton jButtonid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva2FK_IdCuentaContableIva2ServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva2FK_IdCuentaContableIva2ServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva2FK_IdCuentaContableIva2ServicioArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio;
	
	public JPanel jPanelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio;
	public JLabel jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio;
	public JButton jButtonid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2ServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2ServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2ServicioArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio;
	
	public JPanel jPanelid_estado_servicioFK_IdEstadoServicioServicio;
	public JLabel jLabelid_estado_servicioFK_IdEstadoServicioServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_servicioFK_IdEstadoServicioServicio;
	public JButton jButtonid_estado_servicioFK_IdEstadoServicioServicio= new JButtonMe();
	public JButton jButtonid_estado_servicioFK_IdEstadoServicioServicioUpdate= new JButtonMe();
	public JButton jButtonid_estado_servicioFK_IdEstadoServicioServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_servicioFK_IdTipoServicioServicio;
	public JLabel jLabelid_tipo_servicioFK_IdTipoServicioServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_servicioFK_IdTipoServicioServicio;
	public JButton jButtonid_tipo_servicioFK_IdTipoServicioServicio= new JButtonMe();
	public JButton jButtonid_tipo_servicioFK_IdTipoServicioServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_servicioFK_IdTipoServicioServicioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1122;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ServicioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionServicio)	{
		this.jButtonRecargarInformacionServicio = jButtonRecargarInformacionServicio;
	}
	
	public JButton getjButtonProcesarInformacionServicio() {
		return this.jButtonProcesarInformacionServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionServicio)	{
		this.jButtonProcesarInformacionServicio = jButtonProcesarInformacionServicio;
	}
	
	
	public JButton getjButtonRecargarInformacionServicio() {
		return this.jButtonRecargarInformacionServicio;
	}
	
	
	public List<Servicio> getservicios() {
		return this.servicios;
	}

	public void setservicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	public List<Servicio> getserviciosAux() {
		return this.serviciosAux;
	}

	public void setserviciosAux(List<Servicio> serviciosAux) {
		this.serviciosAux = serviciosAux;
	}
	
	public List<Servicio> getserviciosEliminados() {
		return this.serviciosEliminados;
	}

	public void setServiciosEliminados(List<Servicio> serviciosEliminados) {
		this.serviciosEliminados = serviciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarServicio() {
		return jComboBoxTiposSeleccionarServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarServicio(
			JComboBox jComboBoxTiposSeleccionarServicio) {
		this.jComboBoxTiposSeleccionarServicio = jComboBoxTiposSeleccionarServicio;
	}
	
	public void setBorderResaltarTiposSeleccionarServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarServicio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralServicio() {
		return jTextFieldValorCampoGeneralServicio;
	}

	public void setjTextFieldValorCampoGeneralServicio(
			JTextField jTextFieldValorCampoGeneralServicio) {
		this.jTextFieldValorCampoGeneralServicio = jTextFieldValorCampoGeneralServicio;
	}

	public void setBorderResaltarValorCampoGeneralServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralServicio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosServicio() {
		return this.jCheckBoxSeleccionarTodosServicio;
	}

	public void setjCheckBoxSeleccionarTodosServicio(
			JCheckBox jCheckBoxSeleccionarTodosServicio) {
		this.jCheckBoxSeleccionarTodosServicio = jCheckBoxSeleccionarTodosServicio;
	}

	public void setBorderResaltarSeleccionarTodosServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosServicio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosServicio() {
		return this.jCheckBoxSeleccionadosServicio;
	}

	public void setjCheckBoxSeleccionadosServicio(
			JCheckBox jCheckBoxSeleccionadosServicio) {
		this.jCheckBoxSeleccionadosServicio = jCheckBoxSeleccionadosServicio;
	}
	
	public void setBorderResaltarSeleccionadosServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosServicio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesServicio() {
		return this.jComboBoxTiposArchivosReportesServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesServicio(
			JComboBox jComboBoxTiposArchivosReportesServicio) {
		this.jComboBoxTiposArchivosReportesServicio = jComboBoxTiposArchivosReportesServicio;
	}

	public void setBorderResaltarTiposArchivosReportesServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesServicio() {
		return this.jComboBoxTiposReportesServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesServicio(
			JComboBox jComboBoxTiposReportesServicio) {
		this.jComboBoxTiposReportesServicio = jComboBoxTiposReportesServicio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoServicio() {
	//	return jComboBoxTiposReportesDinamicoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoServicio(
	//		JComboBox jComboBoxTiposReportesDinamicoServicio) {
	//	this.jComboBoxTiposReportesDinamicoServicio = jComboBoxTiposReportesDinamicoServicio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoServicio() {
	//	return jComboBoxTiposArchivosReportesDinamicoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoServicio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoServicio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoServicio = jComboBoxTiposArchivosReportesDinamicoServicio;
	//}
	
	public void setBorderResaltarTiposReportesServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesServicio() {
		return this.jComboBoxTiposGraficosReportesServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesServicio(
			JComboBox jComboBoxTiposGraficosReportesServicio) {
		this.jComboBoxTiposGraficosReportesServicio = jComboBoxTiposGraficosReportesServicio;
	}
	
	public void setBorderResaltarTiposGraficosReportesServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionServicio() {
		return this.jComboBoxTiposPaginacionServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionServicio(
			JComboBox jComboBoxTiposPaginacionServicio) {
		this.jComboBoxTiposPaginacionServicio = jComboBoxTiposPaginacionServicio;
	}
	
	public void setBorderResaltarTiposPaginacionServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesServicio() {
		return this.jComboBoxTiposRelacionesServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesServicio() {
		return this.jComboBoxTiposAccionesServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesServicio(
			JComboBox jComboBoxTiposRelacionesServicio) {
		this.jComboBoxTiposRelacionesServicio = jComboBoxTiposRelacionesServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesServicio(
			JComboBox jComboBoxTiposAccionesServicio) {
		this.jComboBoxTiposAccionesServicio = jComboBoxTiposAccionesServicio;
	}
	
	public void setBorderResaltarTiposRelacionesServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesServicio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesServicio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoServicio() {
	//	return jCheckBoxConGraficoDinamicoServicio;
	//}

	//public void setjCheckBoxConGraficoDinamicoServicio(
	//		JCheckBox jCheckBoxConGraficoDinamicoServicio) {
	//	this.jCheckBoxConGraficoDinamicoServicio = jCheckBoxConGraficoDinamicoServicio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoServicio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarServicio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoServicio .setBorder(borderResaltar);		
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
		this.servicioSessionBean=new ServicioSessionBean();
		
		this.servicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.servicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.servicioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.servicioSessionBean.getEsGuardarRelacionado()) {
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
		
		ServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Servicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarServicio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarServicio,this.jTtoolBarServicio,
							"nuevo","nuevo","Nuevo"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarServicio,this.jTtoolBarServicio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarServicio,this.jTtoolBarServicio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarServicio,this.jTtoolBarServicio,
							"duplicar","duplicar","Duplicar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarServicio,this.jTtoolBarServicio,
							"copiar","copiar","Copiar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarServicio,this.jTtoolBarServicio,
							"ver_form","ver_form","Ver"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicio,this.jTtoolBarServicio,
							"recargar","recargar","Recargar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicio,this.jTtoolBarServicio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarServicio,this.jTtoolBarServicio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarServicio,this.jTtoolBarServicio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarServicio,this.jTtoolBarServicio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarServicio,this.jTtoolBarServicio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarServicio,this.jTtoolBarServicio,
							"cerrar","cerrar","Salir"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarServicio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarServicio;
			
				this.jButtonProcesarInformacionToolBarServicio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarServicio;
				
		//protected JButton jButtonModificarToolBarServicio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarServicio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuServicio=new JMenuMe("General");
		this.jmenuArchivoServicio=new JMenuMe("Archivo");
		this.jmenuAccionesServicio=new JMenuMe("Acciones");
		this.jmenuDatosServicio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarServicio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarServicio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarServicio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesServicio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesServicio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesServicio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarServicio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarServicio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarServicio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormServicio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormServicio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormServicio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaServicio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaServicio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaServicio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionServicio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionServicio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionServicio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionServicio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionServicio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionServicio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresServicio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresServicio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresServicio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesServicio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesServicio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesServicio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosServicio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosServicio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosServicio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoServicio.add(this.jMenuItemCerrarServicio);
			
			this.jmenuAccionesServicio.add(this.jMenuItemNuevoServicio);
			this.jmenuAccionesServicio.add(this.jMenuItemNuevoGuardarCambiosServicio);
			this.jmenuAccionesServicio.add(this.jMenuItemNuevoRelacionesServicio);
			this.jmenuAccionesServicio.add(this.jMenuItemGuardarCambiosTablaServicio);		
			this.jmenuAccionesServicio.add(this.jMenuItemDuplicarServicio);		
			this.jmenuAccionesServicio.add(this.jMenuItemCopiarServicio);		
			this.jmenuAccionesServicio.add(this.jMenuItemVerFormServicio);		
			
			this.jmenuDatosServicio.add(this.jMenuItemRecargarInformacionServicio);				
			this.jmenuDatosServicio.add(this.jMenuItemAnterioresServicio);				
			this.jmenuDatosServicio.add(this.jMenuItemSiguientesServicio);				
			this.jmenuDatosServicio.add(this.jMenuItemAbrirOrderByServicio);				
			this.jmenuDatosServicio.add(this.jMenuItemMostrarOcultarServicio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesServicio.add(this.jMenuItemGuardarCambiosServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarServicio.add(this.jmenuArchivoServicio);		
			this.jmenuBarServicio.add(this.jmenuAccionesServicio);		
			this.jmenuBarServicio.add(this.jmenuDatosServicio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarServicio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasServicio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoServicio.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoServicio= new JButtonMe();
		this.jButtonBusquedaPorCodigoServicio.setText("Buscar");
		this.jButtonBusquedaPorCodigoServicio.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoServicio,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoServicio = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoServicio.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoServicio.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacodigoBusquedaPorCodigoServicio= new JTextAreaMe();
		jTextAreacodigoBusquedaPorCodigoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBusquedaPorCodigoServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreServicio.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreServicio= new JButtonMe();
		this.jButtonBusquedaPorNombreServicio.setText("Buscar");
		this.jButtonBusquedaPorNombreServicio.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreServicio,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreServicio = new JLabelMe();
		jLabelnombreBusquedaPorNombreServicio.setText("Nombre :");
		jLabelnombreBusquedaPorNombreServicio.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreServicio= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableFiscal2Servicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFiscal2Servicio.setToolTipText("Buscar Por Cuenta C. Fiscal 2 ");
		this.jButtonFK_IdCuentaContableFiscal2Servicio= new JButtonMe();
		this.jButtonFK_IdCuentaContableFiscal2Servicio.setText("Buscar");
		this.jButtonFK_IdCuentaContableFiscal2Servicio.setToolTipText("Buscar Por Cuenta C. Fiscal 2 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFiscal2Servicio,"buscar_button","Buscar Por Cuenta C. Fiscal 2 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFiscal2Servicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio = new JLabelMe();
		jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setText("Cuenta C. Fiscal 2 :");
		jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setToolTipText("Cuenta C. Fiscal 2");
		jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio.setFocusable(false);

		this.jPanelFK_IdCuentaContableIva2Servicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIva2Servicio.setToolTipText("Buscar Por Cuenta C. Iva 2 ");
		this.jButtonFK_IdCuentaContableIva2Servicio= new JButtonMe();
		this.jButtonFK_IdCuentaContableIva2Servicio.setText("Buscar");
		this.jButtonFK_IdCuentaContableIva2Servicio.setToolTipText("Buscar Por Cuenta C. Iva 2 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIva2Servicio,"buscar_button","Buscar Por Cuenta C. Iva 2 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIva2Servicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio = new JLabelMe();
		jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setText("Cuenta C. Iva 2 :");
		jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setToolTipText("Cuenta C. Iva 2");
		jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio.setFocusable(false);

		this.jPanelFK_IdCuentaContableRetencion2Servicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableRetencion2Servicio.setToolTipText("Buscar Por Cuenta C. Retencion 2 ");
		this.jButtonFK_IdCuentaContableRetencion2Servicio= new JButtonMe();
		this.jButtonFK_IdCuentaContableRetencion2Servicio.setText("Buscar");
		this.jButtonFK_IdCuentaContableRetencion2Servicio.setToolTipText("Buscar Por Cuenta C. Retencion 2 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableRetencion2Servicio,"buscar_button","Buscar Por Cuenta C. Retencion 2 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableRetencion2Servicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio = new JLabelMe();
		jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setText("Cuenta C. Retencion 2 :");
		jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setToolTipText("Cuenta C. Retencion 2");
		jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio.setFocusable(false);

		this.jPanelFK_IdEstadoServicioServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoServicioServicio.setToolTipText("Buscar Por Estado Servicio ");
		this.jButtonFK_IdEstadoServicioServicio= new JButtonMe();
		this.jButtonFK_IdEstadoServicioServicio.setText("Buscar");
		this.jButtonFK_IdEstadoServicioServicio.setToolTipText("Buscar Por Estado Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoServicioServicio,"buscar_button","Buscar Por Estado Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoServicioServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_servicioFK_IdEstadoServicioServicio = new JLabelMe();
		jLabelid_estado_servicioFK_IdEstadoServicioServicio.setText("Estado Servicio :");
		jLabelid_estado_servicioFK_IdEstadoServicioServicio.setToolTipText("Estado Servicio");
		jLabelid_estado_servicioFK_IdEstadoServicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_servicioFK_IdEstadoServicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_servicioFK_IdEstadoServicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_servicioFK_IdEstadoServicioServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_servicioFK_IdEstadoServicioServicio= new JComboBoxMe();
		jComboBoxid_estado_servicioFK_IdEstadoServicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_servicioFK_IdEstadoServicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_servicioFK_IdEstadoServicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_servicioFK_IdEstadoServicioServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoServicioServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoServicioServicio.setToolTipText("Buscar Por Tipo Servicio ");
		this.jButtonFK_IdTipoServicioServicio= new JButtonMe();
		this.jButtonFK_IdTipoServicioServicio.setText("Buscar");
		this.jButtonFK_IdTipoServicioServicio.setToolTipText("Buscar Por Tipo Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoServicioServicio,"buscar_button","Buscar Por Tipo Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoServicioServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_servicioFK_IdTipoServicioServicio = new JLabelMe();
		jLabelid_tipo_servicioFK_IdTipoServicioServicio.setText("Tipo Servicio :");
		jLabelid_tipo_servicioFK_IdTipoServicioServicio.setToolTipText("Tipo Servicio");
		jLabelid_tipo_servicioFK_IdTipoServicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_servicioFK_IdTipoServicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_servicioFK_IdTipoServicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_servicioFK_IdTipoServicioServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_servicioFK_IdTipoServicioServicio= new JComboBoxMe();
		jComboBoxid_tipo_servicioFK_IdTipoServicioServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioFK_IdTipoServicioServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioFK_IdTipoServicioServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_servicioFK_IdTipoServicioServicio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasServicio=new JTabbedPane();


		this.jTabbedPaneBusquedasServicio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasServicio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasServicio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasServicio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleServicio = new ServicioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Servicio DATOS");
			this.jInternalFrameDetalleFormServicio = new ServicioDetalleFormJInternalFrame(jDesktopPane,this.servicioSessionBean.getConGuardarRelaciones(),this.servicioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormServicio = null;//new ServicioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutServicio= new GridBagLayout();
		
		
		this.jTableDatosServicio = new JTableMe();      
		
		String sToolTipServicio="";
		sToolTipServicio=ServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipServicio+="(Inventario.Servicio)";
		}
		
		if(!this.servicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipServicio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosServicio.setToolTipText(sToolTipServicio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosServicio);
		this.jTableDatosServicio.setAutoCreateRowSorter(true);
		this.jTableDatosServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosServicio.setRowSelectionAllowed(true);
		this.jTableDatosServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosServicio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoServicio = new JButtonMe();
		this.jButtonDuplicarServicio = new JButtonMe();
		this.jButtonCopiarServicio = new JButtonMe();
		this.jButtonVerFormServicio = new JButtonMe();
		this.jButtonNuevoRelacionesServicio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaServicio = new JButtonMe();
		this.jButtonCerrarServicio = new JButtonMe();
		
		this.jScrollPanelDatosServicio = new JScrollPane();   
        this.jScrollPanelDatosGeneralServicio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Servicio";
		
		if(!this.servicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicioes" + this.sPath));
		} else {
			this.jScrollPanelDatosServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesServicio.setToolTipText("Acciones");
        this.jPanelAccionesServicio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralServicio.setName("jPanelCamposFingeneralServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralServicio, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableServicio.setName("jPanelCamposFincuenta_contableServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableServicio, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoServicio=new ReporteDinamicoJInternalFrame(ServicioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoServicio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionServicio=new ImportacionJInternalFrame(ServicioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionServicio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByServicio = new JButtonMe();
		
		this.jButtonAbrirOrderByServicio.setText("Orden");
		this.jButtonAbrirOrderByServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByServicio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicio,false,this);
			
			//this.cargarOrderByServicio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicio,true,this);
			
			//this.cargarOrderByServicio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosServicio.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosServicio.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosServicio.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosServicio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosServicio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosServicio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoServicio.setText("Nuevo");
		this.jButtonDuplicarServicio.setText("Duplicar");
		this.jButtonCopiarServicio.setText("Copiar");
		this.jButtonVerFormServicio.setText("Ver");
		this.jButtonNuevoRelacionesServicio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaServicio.setText("Guardar");
		this.jButtonCerrarServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoServicio,"nuevo_button","Nuevo",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarServicio,"duplicar_button","Duplicar",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarServicio,"copiar_button","Copiar",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormServicio,"ver_form","Ver",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesServicio,"nuevorelaciones_button","Nuevo Rel",this.servicioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaServicio,"guardarcambiostabla_button","Guardar",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarServicio,"cerrar_button","Salir",this.servicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoServicio.setToolTipText("Nuevo"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarServicio.setToolTipText("Duplicar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarServicio.setToolTipText("Copiar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormServicio.setToolTipText("Ver"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesServicio.setToolTipText("Nuevo Rel"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaServicio.setToolTipText("Guardar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarServicio.setToolTipText("Salir"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoServicio";
		inputMap = this.jButtonNuevoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoServicio"));
		
		//DUPLICAR
		sMapKey = "DuplicarServicio";
		inputMap = this.jButtonDuplicarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarServicio"));
		
		//COPIAR
		sMapKey = "CopiarServicio";
		inputMap = this.jButtonCopiarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarServicio"));
		
		//VEr FORM
		sMapKey = "VerFormServicio";
		inputMap = this.jButtonVerFormServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormServicio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesServicio";
		inputMap = this.jButtonNuevoRelacionesServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesServicio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarServicio";
		inputMap = this.jButtonModificarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarServicio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarServicio";
		inputMap = this.jButtonCerrarServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaServicio";
		inputMap = this.jButtonGuardarCambiosTablaServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaServicio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Servicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Servicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Servicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Servicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Servicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesServicio.setName("jPanelParametrosReportesServicio"); 
		
		this.jPanelParametrosReportesAccionesServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesServicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesServicio.setName("jPanelParametrosReportesAccionesServicio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesServicio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesServicio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionServicio = new JButtonMe();
		this.jButtonRecargarInformacionServicio.setText("Recargar");
		this.jButtonRecargarInformacionServicio.setToolTipText("Recargar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionServicio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionServicio = new JButtonMe();
		this.jButtonProcesarInformacionServicio.setText("Procesar");
		this.jButtonProcesarInformacionServicio.setToolTipText("Procesar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionServicio.setVisible(false);
			
		this.jButtonProcesarInformacionServicio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionServicio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionServicio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesServicio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicio.setText("TIPO");       
		this.jComboBoxTiposReportesServicio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesServicio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionServicio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionServicio.setText("Paginacion");
		this.jComboBoxTiposPaginacionServicio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesServicio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesServicio.setText("Accion");
		this.jComboBoxTiposRelacionesServicio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesServicio.setText("Accion");
		this.jComboBoxTiposAccionesServicio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarServicio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarServicio.setText("Accion");
		this.jComboBoxTiposSeleccionarServicio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralServicio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralServicio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralServicio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralServicio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesServicio = new JLabelMe();
		
		this.jLabelAccionesServicio.setText("Acciones");		
		this.jLabelAccionesServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosServicio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosServicio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosServicio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosServicio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosServicio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosServicio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaServicio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaServicio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaServicio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteServicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteServicio.setText("Graf.");
		this.jCheckBoxConGraficoReporteServicio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresServicio = new JButtonMe();
		//this.jButtonAnterioresServicio.setText("<<");
        this.jButtonAnterioresServicio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresServicio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesServicio = new JButtonMe();
		//this.jButtonSiguientesServicio.setText(">>");
        this.jButtonSiguientesServicio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesServicio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosServicio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosServicio.setText("Nue");
        this.jButtonNuevoGuardarCambiosServicio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosServicio,"nuevoguardarcambios_button","Nue",this.servicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosServicio";
		inputMap = this.jButtonNuevoGuardarCambiosServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosServicio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionServicio";
		inputMap = this.jButtonRecargarInformacionServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionServicio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesServicio";
		inputMap = this.jButtonSiguientesServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesServicio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresServicio";
		inputMap = this.jButtonAnterioresServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresServicio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasServicio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesServicio.setMinimumSize(new Dimension(this.getWidth(),ServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesServicio.setMaximumSize(new Dimension(this.getWidth(),ServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesServicio.setPreferredSize(new Dimension(this.getWidth(),ServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ServicioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionServicio = new GridBagLayout();

			this.jPanelPaginacionServicio.setLayout(gridaBagLayoutPaginacionServicio);						
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = 0;
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionServicio.add(this.jButtonAnterioresServicio, this.gridBagConstraintsServicio);
					
						
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsServicio.gridy = 0;
			
			this.jPanelPaginacionServicio.add(this.jButtonNuevoGuardarCambiosServicio, this.gridBagConstraintsServicio);
						
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsServicio.gridy = 0;
			this.jPanelPaginacionServicio.add(this.jButtonSiguientesServicio, this.gridBagConstraintsServicio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = 1;
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicio.add(this.jButtonNuevoServicio, this.gridBagConstraintsServicio);
						
			
			
			if(!this.servicioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsServicio = new GridBagConstraints();
				this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsServicio.gridy = 1;
				this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionServicio.add(this.jButtonGuardarCambiosTablaServicio, this.gridBagConstraintsServicio);
			}
			
			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = 1;
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicio.add(this.jButtonDuplicarServicio, this.gridBagConstraintsServicio);
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = 1;
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicio.add(this.jButtonCopiarServicio, this.gridBagConstraintsServicio);
		
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = 1;
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionServicio.add(this.jButtonVerFormServicio, this.gridBagConstraintsServicio);
		
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = 1;
			this.gridBagConstraintsServicio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionServicio.add(this.jButtonCerrarServicio, this.gridBagConstraintsServicio);
		
		
		
		this.jButtonRecargarInformacionServicio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionServicio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionServicio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesServicio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesServicio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesServicio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaServicio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaServicio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaServicio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteServicio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteServicio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteServicio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosServicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosServicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosServicio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosServicio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosServicio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosServicio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesServicio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Servicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Servicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Servicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Servicio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesServicio.setLayout(gridaBagParametrosReportesServicio);
			this.jPanelParametrosReportesAccionesServicio.setLayout(gridaBagParametrosReportesAccionesServicio);
			
			
			this.jPanelParametrosAuxiliar1Servicio.setLayout(gridaBagParametrosAuxiliar1Servicio);
			this.jPanelParametrosAuxiliar2Servicio.setLayout(gridaBagParametrosAuxiliar2Servicio);
			this.jPanelParametrosAuxiliar3Servicio.setLayout(gridaBagParametrosAuxiliar3Servicio);
			this.jPanelParametrosAuxiliar4Servicio.setLayout(gridaBagParametrosAuxiliar4Servicio);
			//this.jPanelParametrosAuxiliar5Servicio.setLayout(gridaBagParametrosAuxiliar2Servicio);			
			
			
			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicio.add(this.jButtonRecargarInformacionServicio, this.gridBagConstraintsServicio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Servicio.add(this.jComboBoxTiposPaginacionServicio, this.gridBagConstraintsServicio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Servicio.add(this.jCheckBoxConAltoMaximoTablaServicio, this.gridBagConstraintsServicio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Servicio.add(this.jComboBoxTiposArchivosReportesServicio, this.gridBagConstraintsServicio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicio.add(this.jPanelParametrosAuxiliar1Servicio, this.gridBagConstraintsServicio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Servicio.add(this.jComboBoxTiposReportesServicio, this.gridBagConstraintsServicio);																		
			
			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Servicio.add(this.jComboBoxTiposGraficosReportesServicio, this.gridBagConstraintsServicio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicio.add(this.jPanelParametrosAuxiliar4Servicio, this.gridBagConstraintsServicio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicio.add(this.jComboBoxTiposReportesServicio, this.gridBagConstraintsServicio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicio.add(this.jCheckBoxGenerarReporteServicio, this.gridBagConstraintsServicio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicio.add(this.jPanelParametrosAuxiliar2Servicio, this.gridBagConstraintsServicio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicio.add(this.jLabelAccionesServicio, this.gridBagConstraintsServicio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsServicio = new GridBagConstraints();
				this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesServicio.add(this.jButtonAbrirOrderByServicio, this.gridBagConstraintsServicio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicio.add(this.jComboBoxTiposSeleccionarServicio, this.gridBagConstraintsServicio);			
			
			
			/*
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicio.add(this.jCheckBoxSeleccionarTodosServicio, this.gridBagConstraintsServicio);
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesServicio.add(this.jCheckBoxConGraficoReporteServicio, this.gridBagConstraintsServicio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Servicio.add(this.jCheckBoxSeleccionarTodosServicio, this.gridBagConstraintsServicio);															
				
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Servicio.add(this.jCheckBoxSeleccionadosServicio, this.gridBagConstraintsServicio);															
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Servicio.add(this.jCheckBoxConGraficoReporteServicio, this.gridBagConstraintsServicio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesServicio.add(this.jPanelParametrosAuxiliar3Servicio, this.gridBagConstraintsServicio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicio.add(this.jComboBoxTiposRelacionesServicio, this.gridBagConstraintsServicio);
				
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicio.add(this.jComboBoxTiposAccionesServicio, this.gridBagConstraintsServicio);
	
				
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesServicio.add(this.jTextFieldValorCampoGeneralServicio, this.gridBagConstraintsServicio);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralServicio= new GridBagLayout();
		this.jPanelCamposIniciogeneralServicio.setLayout(gridaBagLayoutCamposIniciogeneralServicio);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableServicio= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableServicio.setLayout(gridaBagLayoutCamposIniciocuenta_contableServicio);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosServicio = new GridBagLayout();

			this.jScrollPanelDatosServicio.setLayout(gridaBagLayoutDatosServicio);
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = 0;
			this.gridBagConstraintsServicio.gridx = 0;
			
			this.jScrollPanelDatosServicio.add(this.jTableDatosServicio, this.gridBagConstraintsServicio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosServicio.setViewportView(this.jTableDatosServicio);
		this.jTableDatosServicio.setFillsViewportHeight(true);
		this.jTableDatosServicio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesServicio= new GridBagLayout();
		this.jPanelAccionesServicio.setLayout(gridaBagLayoutAccionesServicio);
		
		
		/*	
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = 0;
		this.gridBagConstraintsServicio.gridx = 0;
			
		this.jPanelAccionesServicio.add(this.jButtonNuevoServicio, this.gridBagConstraintsServicio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoServicio= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoServicio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoServicio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoServicio.setLayout(gridaBagLayoutBusquedaPorCodigoServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelBusquedaPorCodigoServicio.add(jLabelcodigoBusquedaPorCodigoServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 1;
		jPanelBusquedaPorCodigoServicio.add(jTextAreacodigoBusquedaPorCodigoServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 1;
		gridBagConstraintsServicio.gridx =1;
		jPanelBusquedaPorCodigoServicio.add(jButtonBusquedaPorCodigoServicio, gridBagConstraintsServicio);

		jTabbedPaneBusquedasServicio.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoServicio);
		jTabbedPaneBusquedasServicio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreServicio= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreServicio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreServicio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreServicio.setLayout(gridaBagLayoutBusquedaPorNombreServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelBusquedaPorNombreServicio.add(jLabelnombreBusquedaPorNombreServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 1;
		jPanelBusquedaPorNombreServicio.add(jTextAreanombreBusquedaPorNombreServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 1;
		gridBagConstraintsServicio.gridx =1;
		jPanelBusquedaPorNombreServicio.add(jButtonBusquedaPorNombreServicio, gridBagConstraintsServicio);

		jTabbedPaneBusquedasServicio.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreServicio);
		jTabbedPaneBusquedasServicio.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableFiscal2Servicio= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFiscal2Servicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFiscal2Servicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFiscal2Servicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFiscal2Servicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFiscal2Servicio.setLayout(gridaBagLayoutFK_IdCuentaContableFiscal2Servicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdCuentaContableFiscal2Servicio.add(jLabelid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 1;
		jPanelFK_IdCuentaContableFiscal2Servicio.add(jComboBoxid_cuenta_contable_fiscal2FK_IdCuentaContableFiscal2Servicio, gridBagConstraintsServicio);


		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdCuentaContableFiscal2Servicio.add(this.jButtonBuscarFK_IdCuentaContableFiscal2id_cuenta_contable_fiscal2Servicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 1;
		gridBagConstraintsServicio.gridx =1;
		jPanelFK_IdCuentaContableFiscal2Servicio.add(jButtonFK_IdCuentaContableFiscal2Servicio, gridBagConstraintsServicio);

		jTabbedPaneBusquedasServicio.addTab("3.-Por Cuenta C. Fiscal 2 ", jPanelFK_IdCuentaContableFiscal2Servicio);
		jTabbedPaneBusquedasServicio.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableIva2Servicio= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableIva2Servicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIva2Servicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIva2Servicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableIva2Servicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableIva2Servicio.setLayout(gridaBagLayoutFK_IdCuentaContableIva2Servicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdCuentaContableIva2Servicio.add(jLabelid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 1;
		jPanelFK_IdCuentaContableIva2Servicio.add(jComboBoxid_cuenta_contable_iva2FK_IdCuentaContableIva2Servicio, gridBagConstraintsServicio);


		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdCuentaContableIva2Servicio.add(this.jButtonBuscarFK_IdCuentaContableIva2id_cuenta_contable_iva2Servicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 1;
		gridBagConstraintsServicio.gridx =1;
		jPanelFK_IdCuentaContableIva2Servicio.add(jButtonFK_IdCuentaContableIva2Servicio, gridBagConstraintsServicio);

		jTabbedPaneBusquedasServicio.addTab("4.-Por Cuenta C. Iva 2 ", jPanelFK_IdCuentaContableIva2Servicio);
		jTabbedPaneBusquedasServicio.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableRetencion2Servicio= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableRetencion2Servicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRetencion2Servicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRetencion2Servicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableRetencion2Servicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableRetencion2Servicio.setLayout(gridaBagLayoutFK_IdCuentaContableRetencion2Servicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdCuentaContableRetencion2Servicio.add(jLabelid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 1;
		jPanelFK_IdCuentaContableRetencion2Servicio.add(jComboBoxid_cuenta_contable_retencion2FK_IdCuentaContableRetencion2Servicio, gridBagConstraintsServicio);


		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsServicio.fill = GridBagConstraints.NONE;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdCuentaContableRetencion2Servicio.add(this.jButtonBuscarFK_IdCuentaContableRetencion2id_cuenta_contable_retencion2Servicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 1;
		gridBagConstraintsServicio.gridx =1;
		jPanelFK_IdCuentaContableRetencion2Servicio.add(jButtonFK_IdCuentaContableRetencion2Servicio, gridBagConstraintsServicio);

		jTabbedPaneBusquedasServicio.addTab("5.-Por Cuenta C. Retencion 2 ", jPanelFK_IdCuentaContableRetencion2Servicio);
		jTabbedPaneBusquedasServicio.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdEstadoServicioServicio= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoServicioServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoServicioServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoServicioServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoServicioServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoServicioServicio.setLayout(gridaBagLayoutFK_IdEstadoServicioServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdEstadoServicioServicio.add(jLabelid_estado_servicioFK_IdEstadoServicioServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 1;
		jPanelFK_IdEstadoServicioServicio.add(jComboBoxid_estado_servicioFK_IdEstadoServicioServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 1;
		gridBagConstraintsServicio.gridx =1;
		jPanelFK_IdEstadoServicioServicio.add(jButtonFK_IdEstadoServicioServicio, gridBagConstraintsServicio);

		jTabbedPaneBusquedasServicio.addTab("6.-Por Estado Servicio ", jPanelFK_IdEstadoServicioServicio);
		jTabbedPaneBusquedasServicio.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoServicioServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoServicioServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoServicioServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoServicioServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoServicioServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoServicioServicio.setLayout(gridaBagLayoutFK_IdTipoServicioServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 0;
		jPanelFK_IdTipoServicioServicio.add(jLabelid_tipo_servicioFK_IdTipoServicioServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 0;
		gridBagConstraintsServicio.gridx = 1;
		jPanelFK_IdTipoServicioServicio.add(jComboBoxid_tipo_servicioFK_IdTipoServicioServicio, gridBagConstraintsServicio);

		gridBagConstraintsServicio = new GridBagConstraints();
		gridBagConstraintsServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsServicio.gridy = 1;
		gridBagConstraintsServicio.gridx =1;
		jPanelFK_IdTipoServicioServicio.add(jButtonFK_IdTipoServicioServicio, gridBagConstraintsServicio);

		jTabbedPaneBusquedasServicio.addTab("7.-Por Tipo Servicio ", jPanelFK_IdTipoServicioServicio);
		jTabbedPaneBusquedasServicio.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutServicio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.servicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsServicio = new GridBagConstraints();						
			this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicio.gridx = 0;		
			//this.gridBagConstraintsServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsServicio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarServicio, this.gridBagConstraintsServicio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsServicio.gridx = 0;		
		//this.gridBagConstraintsServicio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsServicio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsServicio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicio.gridx = 0;		
			this.gridBagConstraintsServicio.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsServicio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasServicio, this.gridBagConstraintsServicio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesServicio, this.gridBagConstraintsServicio);								
		
		
		/*
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesServicio, this.gridBagConstraintsServicio);
		*/		
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsServicio.gridx =0;
		this.gridBagConstraintsServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosServicio, this.gridBagConstraintsServicio);
				
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionServicio, this.gridBagConstraintsServicio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ServicioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosServicio = new GridBagLayout();
			this.jPanelBusquedasParametrosServicio.setLayout(gridaBagLayoutBusquedasParametrosServicio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposServicio, this.gridBagConstraintsServicio);
			
			
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosServicio, this.gridBagConstraintsServicio);
		
			
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesServicio, this.gridBagConstraintsServicio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralServicio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoServicio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoServicio.setName("jPanelReporteDinamicoServicio"); 
		
		this.jPanelReporteDinamicoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoServicio.setLayout(gridaBagLayoutReporteDinamicoServicio);
		
		
		this.jInternalFrameReporteDinamicoServicio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoServicio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoServicio.setResizable(true);
	    this.jInternalFrameReporteDinamicoServicio.setClosable(true);
	    this.jInternalFrameReporteDinamicoServicio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteServicio = new JLabelMe();

		this.jLabelColumnasSelectReporteServicio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicio.add(this.jLabelColumnasSelectReporteServicio, this.gridBagConstraintsServicio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteServicio = new JList<Reporte>();
		this.jListColumnasSelectReporteServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteServicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteServicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteServicio=new JScrollPane(this.jListColumnasSelectReporteServicio);
			
			this.jScrollColumnasSelectReporteServicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteServicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteServicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoServicio.add(this.jListColumnasSelectReporteServicio, this.gridBagConstraintsServicio);
		this.jPanelReporteDinamicoServicio.add(this.jScrollColumnasSelectReporteServicio, this.gridBagConstraintsServicio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteServicio = new JLabelMe();

		this.jLabelRelacionesSelectReporteServicio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteServicio = new JList<Reporte>();
		this.jListRelacionesSelectReporteServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteServicio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteServicio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteServicio=new JScrollPane(this.jListRelacionesSelectReporteServicio);
			
			this.jScrollRelacionesSelectReporteServicio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteServicio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteServicio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoServicio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoServicio = new JComboBoxMe();
		this.jListColumnasValoresGraficoServicio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoServicio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoServicio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoServicio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoServicio = new JLabelMe();

		this.jLabelConGraficoDinamicoServicio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicio.add(this.jLabelConGraficoDinamicoServicio, this.gridBagConstraintsServicio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoServicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoServicio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoServicio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoServicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoServicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoServicio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicio.add(this.jCheckBoxConGraficoDinamicoServicio, this.gridBagConstraintsServicio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoServicio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoServicio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoServicio.add(this.jLabelColumnaCategoriaGraficoServicio, this.gridBagConstraintsServicio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoServicio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoServicio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoServicio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoServicio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoServicio.add(this.jComboBoxColumnaCategoriaGraficoServicio, this.gridBagConstraintsServicio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorServicio = new JLabelMe();

		this.jLabelColumnaCategoriaValorServicio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicio.add(this.jLabelColumnaCategoriaValorServicio, this.gridBagConstraintsServicio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorServicio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorServicio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorServicio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorServicio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoServicio.add(this.jComboBoxColumnaCategoriaValorServicio, this.gridBagConstraintsServicio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoServicio = new JLabelMe();

		this.jLabelColumnasValoresGraficoServicio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicio.add(this.jLabelColumnasValoresGraficoServicio, this.gridBagConstraintsServicio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoServicio = new JList<Reporte>();
		this.jListColumnasValoresGraficoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoServicio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoServicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoServicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoServicio=new JScrollPane(this.jListColumnasValoresGraficoServicio);
			
			this.jScrollColumnasValoresGraficoServicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoServicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoServicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoServicio.add(this.jListColumnasSelectReporteServicio, this.gridBagConstraintsServicio);
		this.jPanelReporteDinamicoServicio.add(this.jScrollColumnasValoresGraficoServicio, this.gridBagConstraintsServicio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoServicio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoServicio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicio.add(this.jLabelTiposGraficosReportesDinamicoServicio, this.gridBagConstraintsServicio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoServicio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoServicio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoServicio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoServicio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicio.add(this.jComboBoxTiposGraficosReportesDinamicoServicio, this.gridBagConstraintsServicio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoServicio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoServicio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicio.add(this.jLabelGenerarExcelReporteDinamicoServicio, this.gridBagConstraintsServicio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoServicio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoServicio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoServicio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoServicio.setToolTipText("Generar EXCEL"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsServicio = new GridBagConstraints();
		//this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoServicio.add(this.jButtonGenerarExcelReporteDinamicoServicio, this.gridBagConstraintsServicio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicio.add(this.jComboBoxTiposReportesDinamicoServicio, this.gridBagConstraintsServicio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoServicio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoServicio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoServicio.add(this.jLabelTiposArchivoReporteDinamicoServicio, this.gridBagConstraintsServicio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicio.add(this.jComboBoxTiposArchivosReportesDinamicoServicio, this.gridBagConstraintsServicio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoServicio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoServicio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoServicio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoServicio.setToolTipText("Generar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicio.add(this.jButtonGenerarReporteDinamicoServicio, this.gridBagConstraintsServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoServicio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoServicio.setToolTipText("Cancelar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoServicio.add(this.jButtonCerrarReporteDinamicoServicio, this.gridBagConstraintsServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalServicio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoServicio= new JScrollPane(jPanelReporteDinamicoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsServicio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoServicio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalServicio);
		this.jInternalFrameReporteDinamicoServicio.getContentPane().add(this.jScrollPanelReporteDinamicoServicio, this.gridBagConstraintsServicio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionServicio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionServicio.setName("jPanelImportacionServicio"); 
		
		this.jPanelImportacionServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionServicio.setLayout(gridaBagLayoutImportacionServicio);
		
		
		this.jInternalFrameImportacionServicio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionServicio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionServicio.setResizable(true);
	    this.jInternalFrameImportacionServicio.setClosable(true);
	    this.jInternalFrameImportacionServicio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionServicio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionServicio.setResizable(true);
	    this.jInternalFrameImportacionServicio.setClosable(true);
	    this.jInternalFrameImportacionServicio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionServicio = new JLabelMe();

		this.jLabelArchivoImportacionServicio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionServicio.add(this.jLabelArchivoImportacionServicio, this.gridBagConstraintsServicio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionServicio = new JFileChooser();		
		this.jFileChooserImportacionServicio.setToolTipText("ESCOGER ARCHIVO"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionServicio = new JButtonMe();
		this.jButtonAbrirImportacionServicio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionServicio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionServicio.setToolTipText("Generar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicio.add(this.jButtonAbrirImportacionServicio, this.gridBagConstraintsServicio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionServicio = new JLabelMe();

		this.jLabelPathArchivoImportacionServicio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionServicio.add(this.jLabelPathArchivoImportacionServicio, this.gridBagConstraintsServicio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionServicio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionServicio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionServicio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionServicio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicio.add(this.jTextFieldPathArchivoImportacionServicio, this.gridBagConstraintsServicio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionServicio = new JButtonMe();
		this.jButtonGenerarImportacionServicio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionServicio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionServicio.setToolTipText("Generar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicio.add(this.jButtonGenerarImportacionServicio, this.gridBagConstraintsServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionServicio = new JButtonMe();
		this.jButtonCerrarImportacionServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionServicio.setToolTipText("Cancelar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionServicio.add(this.jButtonCerrarImportacionServicio, this.gridBagConstraintsServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalServicio = new GridBagLayout();
		
		this.jScrollPanelImportacionServicio= new JScrollPane(jPanelImportacionServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsServicio = new GridBagConstraints();
		this.gridBagConstraintsServicio.gridy =iPosYImportacion;
		this.gridBagConstraintsServicio.gridx =iPosXImportacion;
		this.gridBagConstraintsServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionServicio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalServicio);
		this.jInternalFrameImportacionServicio.getContentPane().add(this.jScrollPanelImportacionServicio, this.gridBagConstraintsServicio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByServicio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByServicio = new JButtonMe();
			this.jButtonAbrirOrderByServicio.setText("Orden");
			this.jButtonAbrirOrderByServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByServicio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByServicio";
			inputMap = this.jButtonAbrirOrderByServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByServicio"));
		
		
			GridBagLayout gridaBagLayoutOrderByServicio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByServicio.setName("jPanelOrderByServicio"); 
			
			this.jPanelOrderByServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByServicio.setLayout(gridaBagLayoutOrderByServicio);
			
			
			this.jTableDatosServicioOrderBy = new JTableMe();        
			this.jTableDatosServicioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosServicioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosServicioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosServicioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosServicioOrderBy.setViewportView(this.jTableDatosServicioOrderBy);
			this.jTableDatosServicioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosServicioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByServicio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByServicio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByServicio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteServicio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByServicio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByServicio.setTitle("Orden");
			this.jInternalFrameOrderByServicio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByServicio.setResizable(true);
			this.jInternalFrameOrderByServicio.setClosable(true);
			this.jInternalFrameOrderByServicio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsServicio.ipady =150;
				
			this.jPanelOrderByServicio.add(jScrollPanelDatosServicioOrderBy, this.gridBagConstraintsServicio);//this.jTableDatosServicioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByServicio = new JButtonMe();
			this.jButtonCerrarOrderByServicio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByServicio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByServicio.setToolTipText("Cancelar"+" "+ServicioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsServicio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByServicio.add(this.jButtonCerrarOrderByServicio, this.gridBagConstraintsServicio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalServicio = new GridBagLayout();
			
			this.jScrollPanelOrderByServicio= new JScrollPane(jPanelOrderByServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsServicio = new GridBagConstraints();
			this.gridBagConstraintsServicio.gridy =iPosYOrderBy;
			this.gridBagConstraintsServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsServicio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByServicio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalServicio);
			
			this.jInternalFrameOrderByServicio.getContentPane().add(this.jScrollPanelOrderByServicio, this.gridBagConstraintsServicio);			
		
		} else {
			this.jButtonAbrirOrderByServicio = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.servicioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosServicio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosServicio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosServicio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosServicio.getRowHeight();//ServicioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.servicioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaServicio.isSelected()) {
					iHeightTable=ServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaServicio.isSelected()) {
					iHeightTable=ServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosServicio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosServicio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosServicio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByServicio!=null && this.jInternalFrameOrderByServicio.getjTableDatosOrderBy()!=null) {
			//if(!this.servicioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByServicio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByServicio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByServicio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByServicio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByServicio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByServicio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByServicio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=servicioLogic.getServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=servicios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Servicio> TraerServicioBeans(List<Servicio> servicios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Servicio servicio:servicios) {
					
				if(!(ServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					servicio.setsDetalleGeneralEntityReporte(ServicioConstantesFunciones.getServicioDescripcion(servicio));
										
					servicio.setes_bien_descripcion(ServicioConstantesFunciones.getes_bienDescripcion(servicio));	
					
						
					
				} else  {
							
					//servicio.setsDetalleGeneralEntityReporte(servicio.getsDetalleGeneralEntityReporte());
										
				}
				
				//serviciobeans.add(serviciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return servicios;
    }
	//PARA REPORTES FIN
}
