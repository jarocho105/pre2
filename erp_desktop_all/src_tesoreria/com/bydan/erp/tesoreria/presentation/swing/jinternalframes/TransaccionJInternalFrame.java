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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

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
import com.bydan.erp.tesoreria.util.TransaccionConstantesFunciones;

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
public class TransaccionJInternalFrame extends TransaccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransaccion;
	
	protected JMenuBar jmenuBarTransaccion;
	
	protected JMenu jmenuTransaccion;
	protected JMenu jmenuDatosTransaccion;
	protected JMenu jmenuArchivoTransaccion;
	protected JMenu jmenuAccionesTransaccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccion;	
	protected GridBagConstraints gridBagConstraintsTransaccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransaccionDetalleFormJInternalFrame jInternalFrameDetalleFormTransaccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransaccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransaccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoTransaBeanSwingJInternalFrame tipotransaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransa="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public TransaccionSessionBean transaccionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoTransaSessionBean tipotransaSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Transaccion> transaccions;		
	public List<Transaccion> transaccionsEliminados;	
	public List<Transaccion> transaccionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransaccion;		
	protected JButton jButtonAbrirOrderByTransaccion;
	
	
	//protected JPanel jPanelOrderByTransaccion;
	//public JScrollPane jScrollPanelOrderByTransaccion;	
	//protected JButton jButtonCerrarOrderByTransaccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransaccionLogic transaccionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransaccion;
	public JScrollPane jScrollPanelDatosEdicionTransaccion;
	public JScrollPane jScrollPanelDatosGeneralTransaccion;
    
	
	
	//public JScrollPane jScrollPanelDatosTransaccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransaccion;
	//public JScrollPane jScrollPanelImportacionTransaccion;
	
	
	
	protected JPanel jPanelAccionesTransaccion;
	
    protected JPanel jPanelPaginacionTransaccion;
    protected JPanel jPanelParametrosReportesTransaccion;
	protected JPanel jPanelParametrosReportesAccionesTransaccion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Transaccion;
	protected JPanel jPanelParametrosAuxiliar2Transaccion;
	protected JPanel jPanelParametrosAuxiliar3Transaccion;
	protected JPanel jPanelParametrosAuxiliar4Transaccion;
	//protected JPanel jPanelParametrosAuxiliar5Transaccion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransaccion;
	//protected JPanel jPanelImportacionTransaccion;
	
	
	public JTable jTableDatosTransaccion;
	
	
	
	//public JTable jTableDatosTransaccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransaccion;
	protected JButton jButtonDuplicarTransaccion;
	protected JButton jButtonCopiarTransaccion;
	protected JButton jButtonVerFormTransaccion;
	protected JButton jButtonNuevoRelacionesTransaccion;
	protected JButton jButtonModificarTransaccion;
	
    protected JButton jButtonGuardarCambiosTablaTransaccion;
	protected JButton jButtonCerrarTransaccion;
	
	
	protected JButton jButtonRecargarInformacionTransaccion;
	protected JButton jButtonProcesarInformacionTransaccion;
	
	
	protected JButton jButtonAnterioresTransaccion;
	protected JButton jButtonSiguientesTransaccion;
	protected JButton jButtonNuevoGuardarCambiosTransaccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransaccion;
	//protected JButton jButtonCerrarReporteDinamicoTransaccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransaccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransaccion;
	//protected JButton jButtonGenerarImportacionTransaccion;
	//protected JButton jButtonCerrarImportacionTransaccion;
	//protected JFileChooser jFileChooserImportacionTransaccion;
	//protected File fileImportacionTransaccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccion;
	protected JButton jButtonDuplicarToolBarTransaccion;
	protected JButton jButtonNuevoRelacionesToolBarTransaccion;
	
	
	public JButton jButtonGuardarCambiosToolBarTransaccion;
	protected JButton jButtonCopiarToolBarTransaccion;
	protected JButton jButtonVerFormToolBarTransaccion;
	public JButton jButtonGuardarCambiosTablaToolBarTransaccion;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccion;
	protected JButton jButtonCerrarToolBarTransaccion;
	
	protected JButton jButtonRecargarInformacionToolBarTransaccion;
	protected JButton jButtonProcesarInformacionToolBarTransaccion;
	protected JButton jButtonAnterioresToolBarTransaccion;
	protected JButton jButtonSiguientesToolBarTransaccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransaccion;
	protected JButton jButtonAbrirOrderByToolBarTransaccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccion;
	protected JMenuItem jMenuItemDuplicarTransaccion;
	protected JMenuItem jMenuItemNuevoRelacionesTransaccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransaccion;
	protected JMenuItem jMenuItemCopiarTransaccion;
	protected JMenuItem jMenuItemVerFormTransaccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccion;
	protected JMenuItem jMenuItemCerrarTransaccion;
	protected JMenuItem jMenuItemDetalleCerrarTransaccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransaccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccion;
	
	protected JMenuItem jMenuItemRecargarInformacionTransaccion;
	protected JMenuItem jMenuItemProcesarInformacionTransaccion;
	protected JMenuItem jMenuItemAnterioresTransaccion;
	protected JMenuItem jMenuItemSiguientesTransaccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccion;
	protected JMenuItem jMenuItemAbrirOrderByTransaccion;
	protected JMenuItem jMenuItemMostrarOcultarTransaccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransaccion;
	protected JCheckBox jCheckBoxSeleccionadosTransaccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransaccion;
	protected JCheckBox jCheckBoxConGraficoReporteTransaccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransaccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransaccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransaccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransaccion;
	protected JTextField jTextFieldValorCampoGeneralTransaccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransaccion;
	//public JList<Reporte> jListColumnasSelectReporteTransaccion;
	//public JScrollPane jScrollColumnasSelectReporteTransaccion;
	
	//public JLabel jLabelRelacionesSelectReporteTransaccion;
	//public JList<Reporte> jListRelacionesSelectReporteTransaccion;
	//public JScrollPane jScrollRelacionesSelectReporteTransaccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransaccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransaccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransaccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransaccion;
	
		
	//public JLabel jLabelArchivoImportacionTransaccion;	
	//public JLabel jLabelPathArchivoImportacionTransaccion;
	//protected JTextField jTextFieldPathArchivoImportacionTransaccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransaccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransaccion;
	
	//public JLabel jLabelColumnaCategoriaValorTransaccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransaccion;
	
	//public JLabel jLabelColumnasValoresGraficoTransaccion;
	//public JList<Reporte> jListColumnasValoresGraficoTransaccion;
	//public JScrollPane jScrollColumnasValoresGraficoTransaccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransaccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransaccion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransaccion;
	public JPanel jPanelBusquedaPorCodigoTransaccion;
	public JButton jButtonBusquedaPorCodigoTransaccion;
	public JPanel jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	public JButton jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	public JPanel jPanelBusquedaPorNombreTransaccion;
	public JButton jButtonBusquedaPorNombreTransaccion;
	public JPanel jPanelFK_IdCuentaContableTransaccion;
	public JButton jButtonFK_IdCuentaContableTransaccion;
	public JPanel jPanelFK_IdTipoComprobanteTransaccion;
	public JButton jButtonFK_IdTipoComprobanteTransaccion;
	public JPanel jPanelFK_IdTipoRetencionTransaccion;
	public JButton jButtonFK_IdTipoRetencionTransaccion;
	public JPanel jPanelFK_IdTipoTransaTransaccion;
	public JButton jButtonFK_IdTipoTransaTransaccion;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTransaccion;
	public JLabel jLabelcodigoBusquedaPorCodigoTransaccion;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTransaccion;
	public JButton jButtoncodigoBusquedaPorCodigoTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	public JLabel jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	public JButton jButtonid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	public JLabel jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion;
	public JButton jButtonid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTransaccion;
	public JLabel jLabelnombreBusquedaPorNombreTransaccion;
	public JTextArea jTextAreanombreBusquedaPorNombreTransaccion;
	public JButton jButtonnombreBusquedaPorNombreTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableTransaccion;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTransaccion= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTransaccionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTransaccionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion;
	
	public JPanel jPanelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion;
	public JLabel jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion;
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionTransaccion;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaFK_IdTipoTransaTransaccion;
	public JLabel jLabelid_tipo_transaFK_IdTipoTransaTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion;
	public JButton jButtonid_tipo_transaFK_IdTipoTransaTransaccion= new JButtonMe();
	public JButton jButtonid_tipo_transaFK_IdTipoTransaTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaFK_IdTipoTransaTransaccionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransaccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransaccion)	{
		this.jButtonRecargarInformacionTransaccion = jButtonRecargarInformacionTransaccion;
	}
	
	public JButton getjButtonProcesarInformacionTransaccion() {
		return this.jButtonProcesarInformacionTransaccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccion)	{
		this.jButtonProcesarInformacionTransaccion = jButtonProcesarInformacionTransaccion;
	}
	
	
	public JButton getjButtonRecargarInformacionTransaccion() {
		return this.jButtonRecargarInformacionTransaccion;
	}
	
	
	public List<Transaccion> gettransaccions() {
		return this.transaccions;
	}

	public void settransaccions(List<Transaccion> transaccions) {
		this.transaccions = transaccions;
	}
	
	public List<Transaccion> gettransaccionsAux() {
		return this.transaccionsAux;
	}

	public void settransaccionsAux(List<Transaccion> transaccionsAux) {
		this.transaccionsAux = transaccionsAux;
	}
	
	public List<Transaccion> gettransaccionsEliminados() {
		return this.transaccionsEliminados;
	}

	public void setTransaccionsEliminados(List<Transaccion> transaccionsEliminados) {
		this.transaccionsEliminados = transaccionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransaccion() {
		return jComboBoxTiposSeleccionarTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransaccion(
			JComboBox jComboBoxTiposSeleccionarTransaccion) {
		this.jComboBoxTiposSeleccionarTransaccion = jComboBoxTiposSeleccionarTransaccion;
	}
	
	public void setBorderResaltarTiposSeleccionarTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransaccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransaccion() {
		return jTextFieldValorCampoGeneralTransaccion;
	}

	public void setjTextFieldValorCampoGeneralTransaccion(
			JTextField jTextFieldValorCampoGeneralTransaccion) {
		this.jTextFieldValorCampoGeneralTransaccion = jTextFieldValorCampoGeneralTransaccion;
	}

	public void setBorderResaltarValorCampoGeneralTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransaccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransaccion() {
		return this.jCheckBoxSeleccionarTodosTransaccion;
	}

	public void setjCheckBoxSeleccionarTodosTransaccion(
			JCheckBox jCheckBoxSeleccionarTodosTransaccion) {
		this.jCheckBoxSeleccionarTodosTransaccion = jCheckBoxSeleccionarTodosTransaccion;
	}

	public void setBorderResaltarSeleccionarTodosTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransaccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransaccion() {
		return this.jCheckBoxSeleccionadosTransaccion;
	}

	public void setjCheckBoxSeleccionadosTransaccion(
			JCheckBox jCheckBoxSeleccionadosTransaccion) {
		this.jCheckBoxSeleccionadosTransaccion = jCheckBoxSeleccionadosTransaccion;
	}
	
	public void setBorderResaltarSeleccionadosTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransaccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransaccion() {
		return this.jComboBoxTiposArchivosReportesTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransaccion(
			JComboBox jComboBoxTiposArchivosReportesTransaccion) {
		this.jComboBoxTiposArchivosReportesTransaccion = jComboBoxTiposArchivosReportesTransaccion;
	}

	public void setBorderResaltarTiposArchivosReportesTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransaccion() {
		return this.jComboBoxTiposReportesTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransaccion(
			JComboBox jComboBoxTiposReportesTransaccion) {
		this.jComboBoxTiposReportesTransaccion = jComboBoxTiposReportesTransaccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransaccion() {
	//	return jComboBoxTiposReportesDinamicoTransaccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransaccion(
	//		JComboBox jComboBoxTiposReportesDinamicoTransaccion) {
	//	this.jComboBoxTiposReportesDinamicoTransaccion = jComboBoxTiposReportesDinamicoTransaccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransaccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransaccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransaccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransaccion = jComboBoxTiposArchivosReportesDinamicoTransaccion;
	//}
	
	public void setBorderResaltarTiposReportesTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransaccion() {
		return this.jComboBoxTiposGraficosReportesTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransaccion(
			JComboBox jComboBoxTiposGraficosReportesTransaccion) {
		this.jComboBoxTiposGraficosReportesTransaccion = jComboBoxTiposGraficosReportesTransaccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransaccion() {
		return this.jComboBoxTiposPaginacionTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransaccion(
			JComboBox jComboBoxTiposPaginacionTransaccion) {
		this.jComboBoxTiposPaginacionTransaccion = jComboBoxTiposPaginacionTransaccion;
	}
	
	public void setBorderResaltarTiposPaginacionTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransaccion() {
		return this.jComboBoxTiposRelacionesTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccion() {
		return this.jComboBoxTiposAccionesTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccion(
			JComboBox jComboBoxTiposRelacionesTransaccion) {
		this.jComboBoxTiposRelacionesTransaccion = jComboBoxTiposRelacionesTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccion(
			JComboBox jComboBoxTiposAccionesTransaccion) {
		this.jComboBoxTiposAccionesTransaccion = jComboBoxTiposAccionesTransaccion;
	}
	
	public void setBorderResaltarTiposRelacionesTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransaccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransaccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransaccion() {
	//	return jCheckBoxConGraficoDinamicoTransaccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransaccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransaccion) {
	//	this.jCheckBoxConGraficoDinamicoTransaccion = jCheckBoxConGraficoDinamicoTransaccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransaccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransaccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransaccion .setBorder(borderResaltar);		
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
		this.transaccionSessionBean=new TransaccionSessionBean();
		
		this.transaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
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
		
		TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Transaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransaccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransaccion,this.jTtoolBarTransaccion,
							"nuevo","nuevo","Nuevo"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransaccion,this.jTtoolBarTransaccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransaccion,this.jTtoolBarTransaccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransaccion,this.jTtoolBarTransaccion,
							"duplicar","duplicar","Duplicar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransaccion,this.jTtoolBarTransaccion,
							"copiar","copiar","Copiar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransaccion,this.jTtoolBarTransaccion,
							"ver_form","ver_form","Ver"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccion,this.jTtoolBarTransaccion,
							"recargar","recargar","Recargar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccion,this.jTtoolBarTransaccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccion,this.jTtoolBarTransaccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransaccion,this.jTtoolBarTransaccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransaccion,this.jTtoolBarTransaccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransaccion,this.jTtoolBarTransaccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransaccion,this.jTtoolBarTransaccion,
							"cerrar","cerrar","Salir"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransaccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransaccion;
			
				this.jButtonProcesarInformacionToolBarTransaccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransaccion;
				
		//protected JButton jButtonModificarToolBarTransaccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransaccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransaccion=new JMenuMe("General");
		this.jmenuArchivoTransaccion=new JMenuMe("Archivo");
		this.jmenuAccionesTransaccion=new JMenuMe("Acciones");
		this.jmenuDatosTransaccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransaccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransaccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransaccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransaccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransaccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransaccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransaccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransaccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransaccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransaccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransaccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransaccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransaccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransaccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransaccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransaccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransaccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransaccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransaccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransaccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransaccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransaccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransaccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransaccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransaccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransaccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransaccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransaccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransaccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransaccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransaccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransaccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransaccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransaccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransaccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransaccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransaccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransaccion.add(this.jMenuItemCerrarTransaccion);
			
			this.jmenuAccionesTransaccion.add(this.jMenuItemNuevoTransaccion);
			this.jmenuAccionesTransaccion.add(this.jMenuItemNuevoGuardarCambiosTransaccion);
			this.jmenuAccionesTransaccion.add(this.jMenuItemNuevoRelacionesTransaccion);
			this.jmenuAccionesTransaccion.add(this.jMenuItemGuardarCambiosTablaTransaccion);		
			this.jmenuAccionesTransaccion.add(this.jMenuItemDuplicarTransaccion);		
			this.jmenuAccionesTransaccion.add(this.jMenuItemCopiarTransaccion);		
			this.jmenuAccionesTransaccion.add(this.jMenuItemVerFormTransaccion);		
			
			this.jmenuDatosTransaccion.add(this.jMenuItemRecargarInformacionTransaccion);				
			this.jmenuDatosTransaccion.add(this.jMenuItemAnterioresTransaccion);				
			this.jmenuDatosTransaccion.add(this.jMenuItemSiguientesTransaccion);				
			this.jmenuDatosTransaccion.add(this.jMenuItemAbrirOrderByTransaccion);				
			this.jmenuDatosTransaccion.add(this.jMenuItemMostrarOcultarTransaccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransaccion.add(this.jMenuItemGuardarCambiosTransaccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransaccion.add(this.jmenuArchivoTransaccion);		
			this.jmenuBarTransaccion.add(this.jmenuAccionesTransaccion);		
			this.jmenuBarTransaccion.add(this.jmenuDatosTransaccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransaccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransaccion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTransaccion.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTransaccion= new JButtonMe();
		this.jButtonBusquedaPorCodigoTransaccion.setText("Buscar");
		this.jButtonBusquedaPorCodigoTransaccion.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTransaccion,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTransaccion = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTransaccion.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTransaccion.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTransaccion= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion.setToolTipText("Buscar Por Modulo Por Tipo Transaccion Modulo ");
		this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion= new JButtonMe();
		this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion.setText("Buscar");
		this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion.setToolTipText("Buscar Por Modulo Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion,"buscar_button","Buscar Por Modulo Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion = new JLabelMe();
		jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion = new JLabelMe();
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTransaccion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTransaccion= new JButtonMe();
		this.jButtonBusquedaPorNombreTransaccion.setText("Buscar");
		this.jButtonBusquedaPorNombreTransaccion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTransaccion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTransaccion = new JLabelMe();
		jLabelnombreBusquedaPorNombreTransaccion.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTransaccion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTransaccion= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableTransaccion.setToolTipText("Buscar Por Cuenta C. ");
		this.jButtonFK_IdCuentaContableTransaccion= new JButtonMe();
		this.jButtonFK_IdCuentaContableTransaccion.setText("Buscar");
		this.jButtonFK_IdCuentaContableTransaccion.setToolTipText("Buscar Por Cuenta C. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableTransaccion,"buscar_button","Buscar Por Cuenta C. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableTransaccion = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableTransaccion.setText("Cuenta C. :");
		jLabelid_cuenta_contableFK_IdCuentaContableTransaccion.setToolTipText("Cuenta C.");
		jLabelid_cuenta_contableFK_IdCuentaContableTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contableFK_IdCuentaContableTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contableFK_IdCuentaContableTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.setFocusable(false);

		this.jPanelFK_IdTipoComprobanteTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoComprobanteTransaccion.setToolTipText("Buscar Por Tipo Compr. ");
		this.jButtonFK_IdTipoComprobanteTransaccion= new JButtonMe();
		this.jButtonFK_IdTipoComprobanteTransaccion.setText("Buscar");
		this.jButtonFK_IdTipoComprobanteTransaccion.setToolTipText("Buscar Por Tipo Compr. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoComprobanteTransaccion,"buscar_button","Buscar Por Tipo Compr. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoComprobanteTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion = new JLabelMe();
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setText("Tipo Compr. :");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setToolTipText("Tipo Compr.");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionTransaccion.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionTransaccion= new JButtonMe();
		this.jButtonFK_IdTipoRetencionTransaccion.setText("Buscar");
		this.jButtonFK_IdTipoRetencionTransaccion.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionTransaccion,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaTransaccion.setToolTipText("Buscar Por Movimiento ");
		this.jButtonFK_IdTipoTransaTransaccion= new JButtonMe();
		this.jButtonFK_IdTipoTransaTransaccion.setText("Buscar");
		this.jButtonFK_IdTipoTransaTransaccion.setToolTipText("Buscar Por Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaTransaccion,"buscar_button","Buscar Por Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaFK_IdTipoTransaTransaccion = new JLabelMe();
		jLabelid_tipo_transaFK_IdTipoTransaTransaccion.setText("Movimiento :");
		jLabelid_tipo_transaFK_IdTipoTransaTransaccion.setToolTipText("Movimiento");
		jLabelid_tipo_transaFK_IdTipoTransaTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_transaFK_IdTipoTransaTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_transaFK_IdTipoTransaTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaFK_IdTipoTransaTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion= new JComboBoxMe();
		jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransaccion=new JTabbedPane();


		this.jTabbedPaneBusquedasTransaccion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransaccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransaccion = new TransaccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transaccion DATOS");
			this.jInternalFrameDetalleFormTransaccion = new TransaccionDetalleFormJInternalFrame(jDesktopPane,this.transaccionSessionBean.getConGuardarRelaciones(),this.transaccionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransaccion = null;//new TransaccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccion= new GridBagLayout();
		
		
		this.jTableDatosTransaccion = new JTableMe();      
		
		String sToolTipTransaccion="";
		sToolTipTransaccion=TransaccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccion+="(Tesoreria.Transaccion)";
		}
		
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransaccion.setToolTipText(sToolTipTransaccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransaccion);
		this.jTableDatosTransaccion.setAutoCreateRowSorter(true);
		this.jTableDatosTransaccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransaccion.setRowSelectionAllowed(true);
		this.jTableDatosTransaccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransaccion = new JButtonMe();
		this.jButtonDuplicarTransaccion = new JButtonMe();
		this.jButtonCopiarTransaccion = new JButtonMe();
		this.jButtonVerFormTransaccion = new JButtonMe();
		this.jButtonNuevoRelacionesTransaccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransaccion = new JButtonMe();
		this.jButtonCerrarTransaccion = new JButtonMe();
		
		this.jScrollPanelDatosTransaccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransaccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transaccion";
		
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccion.setToolTipText("Acciones");
        this.jPanelAccionesTransaccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransaccion=new ReporteDinamicoJInternalFrame(TransaccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransaccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransaccion=new ImportacionJInternalFrame(TransaccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransaccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransaccion = new JButtonMe();
		
		this.jButtonAbrirOrderByTransaccion.setText("Orden");
		this.jButtonAbrirOrderByTransaccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccion,false,this);
			
			//this.cargarOrderByTransaccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccion,true,this);
			
			//this.cargarOrderByTransaccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransaccion.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosTransaccion.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosTransaccion.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosTransaccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransaccion.setText("Nuevo");
		this.jButtonDuplicarTransaccion.setText("Duplicar");
		this.jButtonCopiarTransaccion.setText("Copiar");
		this.jButtonVerFormTransaccion.setText("Ver");
		this.jButtonNuevoRelacionesTransaccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransaccion.setText("Guardar");
		this.jButtonCerrarTransaccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccion,"nuevo_button","Nuevo",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransaccion,"duplicar_button","Duplicar",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransaccion,"copiar_button","Copiar",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransaccion,"ver_form","Ver",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransaccion,"nuevorelaciones_button","Nuevo Rel",this.transaccionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccion,"guardarcambiostabla_button","Guardar",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccion,"cerrar_button","Salir",this.transaccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransaccion.setToolTipText("Nuevo"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransaccion.setToolTipText("Duplicar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransaccion.setToolTipText("Copiar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransaccion.setToolTipText("Ver"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransaccion.setToolTipText("Nuevo Rel"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransaccion.setToolTipText("Guardar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccion.setToolTipText("Salir"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccion";
		inputMap = this.jButtonNuevoTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransaccion";
		inputMap = this.jButtonDuplicarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransaccion"));
		
		//COPIAR
		sMapKey = "CopiarTransaccion";
		inputMap = this.jButtonCopiarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransaccion"));
		
		//VEr FORM
		sMapKey = "VerFormTransaccion";
		inputMap = this.jButtonVerFormTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransaccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransaccion";
		inputMap = this.jButtonNuevoRelacionesTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransaccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransaccion";
		inputMap = this.jButtonModificarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransaccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransaccion";
		inputMap = this.jButtonCerrarTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccion";
		inputMap = this.jButtonGuardarCambiosTablaTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Transaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Transaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Transaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Transaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Transaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransaccion.setName("jPanelParametrosReportesTransaccion"); 
		
		this.jPanelParametrosReportesAccionesTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransaccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransaccion.setName("jPanelParametrosReportesAccionesTransaccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransaccion = new JButtonMe();
		this.jButtonRecargarInformacionTransaccion.setText("Recargar");
		this.jButtonRecargarInformacionTransaccion.setToolTipText("Recargar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransaccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransaccion = new JButtonMe();
		this.jButtonProcesarInformacionTransaccion.setText("Procesar");
		this.jButtonProcesarInformacionTransaccion.setToolTipText("Procesar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransaccion.setVisible(false);
			
		this.jButtonProcesarInformacionTransaccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransaccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccion.setText("TIPO");       
		this.jComboBoxTiposReportesTransaccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransaccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransaccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransaccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransaccion.setText("Accion");
		this.jComboBoxTiposRelacionesTransaccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccion.setText("Accion");
		this.jComboBoxTiposAccionesTransaccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransaccion.setText("Accion");
		this.jComboBoxTiposSeleccionarTransaccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransaccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransaccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransaccion = new JLabelMe();
		
		this.jLabelAccionesTransaccion.setText("Acciones");		
		this.jLabelAccionesTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransaccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransaccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransaccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransaccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransaccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransaccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransaccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransaccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransaccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransaccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransaccion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransaccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransaccion = new JButtonMe();
		//this.jButtonAnterioresTransaccion.setText("<<");
        this.jButtonAnterioresTransaccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransaccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransaccion = new JButtonMe();
		//this.jButtonSiguientesTransaccion.setText(">>");
        this.jButtonSiguientesTransaccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransaccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransaccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransaccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransaccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransaccion,"nuevoguardarcambios_button","Nue",this.transaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransaccion";
		inputMap = this.jButtonNuevoGuardarCambiosTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransaccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransaccion";
		inputMap = this.jButtonRecargarInformacionTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransaccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransaccion";
		inputMap = this.jButtonSiguientesTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransaccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransaccion";
		inputMap = this.jButtonAnterioresTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransaccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransaccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransaccion.setMinimumSize(new Dimension(this.getWidth(),TransaccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccion.setMaximumSize(new Dimension(this.getWidth(),TransaccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccion.setPreferredSize(new Dimension(this.getWidth(),TransaccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransaccion = new GridBagLayout();

			this.jPanelPaginacionTransaccion.setLayout(gridaBagLayoutPaginacionTransaccion);						
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = 0;
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransaccion.add(this.jButtonAnterioresTransaccion, this.gridBagConstraintsTransaccion);
					
						
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccion.gridy = 0;
			
			this.jPanelPaginacionTransaccion.add(this.jButtonNuevoGuardarCambiosTransaccion, this.gridBagConstraintsTransaccion);
						
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccion.gridy = 0;
			this.jPanelPaginacionTransaccion.add(this.jButtonSiguientesTransaccion, this.gridBagConstraintsTransaccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = 1;
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccion.add(this.jButtonNuevoTransaccion, this.gridBagConstraintsTransaccion);
						
			
			
			if(!this.transaccionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransaccion = new GridBagConstraints();
				this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccion.gridy = 1;
				this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransaccion.add(this.jButtonGuardarCambiosTablaTransaccion, this.gridBagConstraintsTransaccion);
			}
			
			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = 1;
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccion.add(this.jButtonDuplicarTransaccion, this.gridBagConstraintsTransaccion);
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = 1;
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccion.add(this.jButtonCopiarTransaccion, this.gridBagConstraintsTransaccion);
		
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = 1;
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccion.add(this.jButtonVerFormTransaccion, this.gridBagConstraintsTransaccion);
		
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = 1;
			this.gridBagConstraintsTransaccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransaccion.add(this.jButtonCerrarTransaccion, this.gridBagConstraintsTransaccion);
		
		
		
		this.jButtonRecargarInformacionTransaccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransaccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransaccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransaccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransaccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransaccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransaccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransaccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransaccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransaccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Transaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Transaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Transaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Transaccion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransaccion.setLayout(gridaBagParametrosReportesTransaccion);
			this.jPanelParametrosReportesAccionesTransaccion.setLayout(gridaBagParametrosReportesAccionesTransaccion);
			
			
			this.jPanelParametrosAuxiliar1Transaccion.setLayout(gridaBagParametrosAuxiliar1Transaccion);
			this.jPanelParametrosAuxiliar2Transaccion.setLayout(gridaBagParametrosAuxiliar2Transaccion);
			this.jPanelParametrosAuxiliar3Transaccion.setLayout(gridaBagParametrosAuxiliar3Transaccion);
			this.jPanelParametrosAuxiliar4Transaccion.setLayout(gridaBagParametrosAuxiliar4Transaccion);
			//this.jPanelParametrosAuxiliar5Transaccion.setLayout(gridaBagParametrosAuxiliar2Transaccion);			
			
			
			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccion.add(this.jButtonRecargarInformacionTransaccion, this.gridBagConstraintsTransaccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transaccion.add(this.jComboBoxTiposPaginacionTransaccion, this.gridBagConstraintsTransaccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transaccion.add(this.jCheckBoxConAltoMaximoTablaTransaccion, this.gridBagConstraintsTransaccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transaccion.add(this.jComboBoxTiposArchivosReportesTransaccion, this.gridBagConstraintsTransaccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccion.add(this.jPanelParametrosAuxiliar1Transaccion, this.gridBagConstraintsTransaccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Transaccion.add(this.jComboBoxTiposReportesTransaccion, this.gridBagConstraintsTransaccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccion.add(this.jPanelParametrosAuxiliar4Transaccion, this.gridBagConstraintsTransaccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccion.add(this.jComboBoxTiposReportesTransaccion, this.gridBagConstraintsTransaccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccion.add(this.jCheckBoxGenerarReporteTransaccion, this.gridBagConstraintsTransaccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccion.add(this.jPanelParametrosAuxiliar2Transaccion, this.gridBagConstraintsTransaccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccion.add(this.jLabelAccionesTransaccion, this.gridBagConstraintsTransaccion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransaccion = new GridBagConstraints();
				this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransaccion.add(this.jButtonAbrirOrderByTransaccion, this.gridBagConstraintsTransaccion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccion.add(this.jComboBoxTiposSeleccionarTransaccion, this.gridBagConstraintsTransaccion);			
			
			
			/*
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccion.add(this.jCheckBoxSeleccionarTodosTransaccion, this.gridBagConstraintsTransaccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transaccion.add(this.jCheckBoxSeleccionarTodosTransaccion, this.gridBagConstraintsTransaccion);															
				
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transaccion.add(this.jCheckBoxSeleccionadosTransaccion, this.gridBagConstraintsTransaccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccion.add(this.jPanelParametrosAuxiliar3Transaccion, this.gridBagConstraintsTransaccion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccion.add(this.jComboBoxTiposRelacionesTransaccion, this.gridBagConstraintsTransaccion);
				
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccion.add(this.jComboBoxTiposAccionesTransaccion, this.gridBagConstraintsTransaccion);
	
				
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccion.add(this.jTextFieldValorCampoGeneralTransaccion, this.gridBagConstraintsTransaccion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransaccion = new GridBagLayout();

			this.jScrollPanelDatosTransaccion.setLayout(gridaBagLayoutDatosTransaccion);
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = 0;
			this.gridBagConstraintsTransaccion.gridx = 0;
			
			this.jScrollPanelDatosTransaccion.add(this.jTableDatosTransaccion, this.gridBagConstraintsTransaccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransaccion.setViewportView(this.jTableDatosTransaccion);
		this.jTableDatosTransaccion.setFillsViewportHeight(true);
		this.jTableDatosTransaccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccion= new GridBagLayout();
		this.jPanelAccionesTransaccion.setLayout(gridaBagLayoutAccionesTransaccion);
		
		
		/*	
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = 0;
		this.gridBagConstraintsTransaccion.gridx = 0;
			
		this.jPanelAccionesTransaccion.add(this.jButtonNuevoTransaccion, this.gridBagConstraintsTransaccion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTransaccion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTransaccion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTransaccion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTransaccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTransaccion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTransaccion.setLayout(gridaBagLayoutBusquedaPorCodigoTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelBusquedaPorCodigoTransaccion.add(jLabelcodigoBusquedaPorCodigoTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelBusquedaPorCodigoTransaccion.add(jTextFieldcodigoBusquedaPorCodigoTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx =1;
		jPanelBusquedaPorCodigoTransaccion.add(jButtonBusquedaPorCodigoTransaccion, gridBagConstraintsTransaccion);

		jTabbedPaneBusquedasTransaccion.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTransaccion);
		jTabbedPaneBusquedasTransaccion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdModuloPorTipoTransaccionTransaccion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdModuloPorTipoTransaccionTransaccion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorTipoTransaccionTransaccion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorTipoTransaccionTransaccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdModuloPorTipoTransaccionTransaccion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion.setLayout(gridaBagLayoutBusquedaPorIdModuloPorTipoTransaccionTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion.add(jLabelid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion.add(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion, gridBagConstraintsTransaccion);


		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion.add(jLabelid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion.add(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 2;
		gridBagConstraintsTransaccion.gridx =1;
		jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion.add(jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion, gridBagConstraintsTransaccion);

		jTabbedPaneBusquedasTransaccion.addTab("2.-Por Modulo Por Tipo Transaccion Modulo ", jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);
		jTabbedPaneBusquedasTransaccion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTransaccion= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTransaccion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransaccion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransaccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTransaccion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTransaccion.setLayout(gridaBagLayoutBusquedaPorNombreTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelBusquedaPorNombreTransaccion.add(jLabelnombreBusquedaPorNombreTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelBusquedaPorNombreTransaccion.add(jTextAreanombreBusquedaPorNombreTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx =1;
		jPanelBusquedaPorNombreTransaccion.add(jButtonBusquedaPorNombreTransaccion, gridBagConstraintsTransaccion);

		jTabbedPaneBusquedasTransaccion.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreTransaccion);
		jTabbedPaneBusquedasTransaccion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableTransaccion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableTransaccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableTransaccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableTransaccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableTransaccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableTransaccion.setLayout(gridaBagLayoutFK_IdCuentaContableTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelFK_IdCuentaContableTransaccion.add(jLabelid_cuenta_contableFK_IdCuentaContableTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelFK_IdCuentaContableTransaccion.add(jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion, gridBagConstraintsTransaccion);


		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.NONE;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelFK_IdCuentaContableTransaccion.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx =1;
		jPanelFK_IdCuentaContableTransaccion.add(jButtonFK_IdCuentaContableTransaccion, gridBagConstraintsTransaccion);

		jTabbedPaneBusquedasTransaccion.addTab("4.-Por Cuenta C. ", jPanelFK_IdCuentaContableTransaccion);
		jTabbedPaneBusquedasTransaccion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoComprobanteTransaccion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoComprobanteTransaccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteTransaccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteTransaccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoComprobanteTransaccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoComprobanteTransaccion.setLayout(gridaBagLayoutFK_IdTipoComprobanteTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelFK_IdTipoComprobanteTransaccion.add(jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelFK_IdTipoComprobanteTransaccion.add(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx =1;
		jPanelFK_IdTipoComprobanteTransaccion.add(jButtonFK_IdTipoComprobanteTransaccion, gridBagConstraintsTransaccion);

		jTabbedPaneBusquedasTransaccion.addTab("5.-Por Tipo Compr. ", jPanelFK_IdTipoComprobanteTransaccion);
		jTabbedPaneBusquedasTransaccion.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionTransaccion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionTransaccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionTransaccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionTransaccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionTransaccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionTransaccion.setLayout(gridaBagLayoutFK_IdTipoRetencionTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelFK_IdTipoRetencionTransaccion.add(jLabelid_tipo_retencionFK_IdTipoRetencionTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelFK_IdTipoRetencionTransaccion.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx =1;
		jPanelFK_IdTipoRetencionTransaccion.add(jButtonFK_IdTipoRetencionTransaccion, gridBagConstraintsTransaccion);

		jTabbedPaneBusquedasTransaccion.addTab("6.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionTransaccion);
		jTabbedPaneBusquedasTransaccion.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaTransaccion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaTransaccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaTransaccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaTransaccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaTransaccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaTransaccion.setLayout(gridaBagLayoutFK_IdTipoTransaTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 0;
		jPanelFK_IdTipoTransaTransaccion.add(jLabelid_tipo_transaFK_IdTipoTransaTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 0;
		gridBagConstraintsTransaccion.gridx = 1;
		jPanelFK_IdTipoTransaTransaccion.add(jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion, gridBagConstraintsTransaccion);

		gridBagConstraintsTransaccion = new GridBagConstraints();
		gridBagConstraintsTransaccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccion.gridy = 1;
		gridBagConstraintsTransaccion.gridx =1;
		jPanelFK_IdTipoTransaTransaccion.add(jButtonFK_IdTipoTransaTransaccion, gridBagConstraintsTransaccion);

		jTabbedPaneBusquedasTransaccion.addTab("7.-Por Movimiento ", jPanelFK_IdTipoTransaTransaccion);
		jTabbedPaneBusquedasTransaccion.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccion = new GridBagConstraints();						
			this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccion.gridx = 0;		
			//this.gridBagConstraintsTransaccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransaccion, this.gridBagConstraintsTransaccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransaccion.gridx = 0;		
		//this.gridBagConstraintsTransaccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransaccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransaccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccion.gridx = 0;		
			this.gridBagConstraintsTransaccion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransaccion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransaccion, this.gridBagConstraintsTransaccion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransaccion, this.gridBagConstraintsTransaccion);								
		
		
		/*
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransaccion, this.gridBagConstraintsTransaccion);
		*/		
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccion.gridx =0;
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccion, this.gridBagConstraintsTransaccion);
				
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransaccion, this.gridBagConstraintsTransaccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransaccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccion = new GridBagLayout();
			this.jPanelBusquedasParametrosTransaccion.setLayout(gridaBagLayoutBusquedasParametrosTransaccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransaccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccion, this.gridBagConstraintsTransaccion);
			
			
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccion, this.gridBagConstraintsTransaccion);
		
			
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccion, this.gridBagConstraintsTransaccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransaccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransaccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransaccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransaccion.setName("jPanelReporteDinamicoTransaccion"); 
		
		this.jPanelReporteDinamicoTransaccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransaccion.setLayout(gridaBagLayoutReporteDinamicoTransaccion);
		
		
		this.jInternalFrameReporteDinamicoTransaccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransaccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransaccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransaccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransaccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransaccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransaccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransaccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransaccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransaccion = new JLabelMe();

		this.jLabelColumnasSelectReporteTransaccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccion.add(this.jLabelColumnasSelectReporteTransaccion, this.gridBagConstraintsTransaccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransaccion = new JList<Reporte>();
		this.jListColumnasSelectReporteTransaccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransaccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransaccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransaccion=new JScrollPane(this.jListColumnasSelectReporteTransaccion);
			
			this.jScrollColumnasSelectReporteTransaccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccion.add(this.jListColumnasSelectReporteTransaccion, this.gridBagConstraintsTransaccion);
		this.jPanelReporteDinamicoTransaccion.add(this.jScrollColumnasSelectReporteTransaccion, this.gridBagConstraintsTransaccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransaccion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransaccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransaccion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransaccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransaccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransaccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransaccion=new JScrollPane(this.jListRelacionesSelectReporteTransaccion);
			
			this.jScrollRelacionesSelectReporteTransaccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransaccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransaccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransaccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransaccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransaccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransaccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransaccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransaccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransaccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccion.add(this.jLabelGenerarExcelReporteDinamicoTransaccion, this.gridBagConstraintsTransaccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransaccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransaccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransaccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransaccion.setToolTipText("Generar EXCEL"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransaccion.add(this.jButtonGenerarExcelReporteDinamicoTransaccion, this.gridBagConstraintsTransaccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccion.add(this.jComboBoxTiposReportesDinamicoTransaccion, this.gridBagConstraintsTransaccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransaccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransaccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccion.add(this.jLabelTiposArchivoReporteDinamicoTransaccion, this.gridBagConstraintsTransaccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccion.add(this.jComboBoxTiposArchivosReportesDinamicoTransaccion, this.gridBagConstraintsTransaccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransaccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransaccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransaccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransaccion.setToolTipText("Generar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccion.add(this.jButtonGenerarReporteDinamicoTransaccion, this.gridBagConstraintsTransaccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransaccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransaccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransaccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransaccion.setToolTipText("Cancelar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccion.add(this.jButtonCerrarReporteDinamicoTransaccion, this.gridBagConstraintsTransaccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransaccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransaccion= new JScrollPane(jPanelReporteDinamicoTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransaccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransaccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransaccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransaccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransaccion);
		this.jInternalFrameReporteDinamicoTransaccion.getContentPane().add(this.jScrollPanelReporteDinamicoTransaccion, this.gridBagConstraintsTransaccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransaccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransaccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransaccion.setName("jPanelImportacionTransaccion"); 
		
		this.jPanelImportacionTransaccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransaccion.setLayout(gridaBagLayoutImportacionTransaccion);
		
		
		this.jInternalFrameImportacionTransaccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransaccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransaccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransaccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccion.setResizable(true);
	    this.jInternalFrameImportacionTransaccion.setClosable(true);
	    this.jInternalFrameImportacionTransaccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransaccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccion.setResizable(true);
	    this.jInternalFrameImportacionTransaccion.setClosable(true);
	    this.jInternalFrameImportacionTransaccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransaccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransaccion = new JLabelMe();

		this.jLabelArchivoImportacionTransaccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccion.add(this.jLabelArchivoImportacionTransaccion, this.gridBagConstraintsTransaccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransaccion = new JFileChooser();		
		this.jFileChooserImportacionTransaccion.setToolTipText("ESCOGER ARCHIVO"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransaccion = new JButtonMe();
		this.jButtonAbrirImportacionTransaccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransaccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransaccion.setToolTipText("Generar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccion.add(this.jButtonAbrirImportacionTransaccion, this.gridBagConstraintsTransaccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransaccion = new JLabelMe();

		this.jLabelPathArchivoImportacionTransaccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccion.add(this.jLabelPathArchivoImportacionTransaccion, this.gridBagConstraintsTransaccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransaccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransaccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccion.add(this.jTextFieldPathArchivoImportacionTransaccion, this.gridBagConstraintsTransaccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransaccion = new JButtonMe();
		this.jButtonGenerarImportacionTransaccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransaccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransaccion.setToolTipText("Generar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccion.add(this.jButtonGenerarImportacionTransaccion, this.gridBagConstraintsTransaccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransaccion = new JButtonMe();
		this.jButtonCerrarImportacionTransaccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransaccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransaccion.setToolTipText("Cancelar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccion.add(this.jButtonCerrarImportacionTransaccion, this.gridBagConstraintsTransaccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransaccion = new GridBagLayout();
		
		this.jScrollPanelImportacionTransaccion= new JScrollPane(jPanelImportacionTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransaccion = new GridBagConstraints();
		this.gridBagConstraintsTransaccion.gridy =iPosYImportacion;
		this.gridBagConstraintsTransaccion.gridx =iPosXImportacion;
		this.gridBagConstraintsTransaccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransaccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransaccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransaccion);
		this.jInternalFrameImportacionTransaccion.getContentPane().add(this.jScrollPanelImportacionTransaccion, this.gridBagConstraintsTransaccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransaccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransaccion = new JButtonMe();
			this.jButtonAbrirOrderByTransaccion.setText("Orden");
			this.jButtonAbrirOrderByTransaccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransaccion";
			inputMap = this.jButtonAbrirOrderByTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransaccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransaccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransaccion.setName("jPanelOrderByTransaccion"); 
			
			this.jPanelOrderByTransaccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransaccion.setLayout(gridaBagLayoutOrderByTransaccion);
			
			
			this.jTableDatosTransaccionOrderBy = new JTableMe();        
			this.jTableDatosTransaccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransaccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransaccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransaccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransaccionOrderBy.setViewportView(this.jTableDatosTransaccionOrderBy);
			this.jTableDatosTransaccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransaccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransaccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransaccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransaccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransaccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransaccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransaccion.setTitle("Orden");
			this.jInternalFrameOrderByTransaccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransaccion.setResizable(true);
			this.jInternalFrameOrderByTransaccion.setClosable(true);
			this.jInternalFrameOrderByTransaccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransaccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransaccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransaccion.ipady =150;
				
			this.jPanelOrderByTransaccion.add(jScrollPanelDatosTransaccionOrderBy, this.gridBagConstraintsTransaccion);//this.jTableDatosTransaccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransaccion = new JButtonMe();
			this.jButtonCerrarOrderByTransaccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransaccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransaccion.setToolTipText("Cancelar"+" "+TransaccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransaccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransaccion.add(this.jButtonCerrarOrderByTransaccion, this.gridBagConstraintsTransaccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransaccion = new GridBagLayout();
			
			this.jScrollPanelOrderByTransaccion= new JScrollPane(jPanelOrderByTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransaccion = new GridBagConstraints();
			this.gridBagConstraintsTransaccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransaccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransaccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransaccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransaccion);
			
			this.jInternalFrameOrderByTransaccion.getContentPane().add(this.jScrollPanelOrderByTransaccion, this.gridBagConstraintsTransaccion);			
		
		} else {
			this.jButtonAbrirOrderByTransaccion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transaccionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransaccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransaccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransaccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransaccion.getRowHeight();//TransaccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccion.isSelected()) {
					iHeightTable=TransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccion.isSelected()) {
					iHeightTable=TransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransaccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransaccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransaccion!=null && this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy()!=null) {
			//if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransaccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransaccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransaccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransaccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transaccionLogic.getTransaccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Transaccion> TraerTransaccionBeans(List<Transaccion> transaccions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Transaccion transaccion:transaccions) {
					
				if(!(TransaccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransaccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transaccion.setsDetalleGeneralEntityReporte(TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion));
										
						
					
						
					
				} else  {
							
					//transaccion.setsDetalleGeneralEntityReporte(transaccion.getsDetalleGeneralEntityReporte());
										
				}
				
				//transaccionbeans.add(transaccionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transaccions;
    }
	//PARA REPORTES FIN
}
