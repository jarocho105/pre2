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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.facturacion.util.DetaFormaPagoConstantesFunciones;

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
public class DetaFormaPagoJInternalFrame extends DetaFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetaFormaPago;
	
	protected JMenuBar jmenuBarDetaFormaPago;
	
	protected JMenu jmenuDetaFormaPago;
	protected JMenu jmenuDatosDetaFormaPago;
	protected JMenu jmenuArchivoDetaFormaPago;
	protected JMenu jmenuAccionesDetaFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaFormaPago;	
	protected GridBagConstraints gridBagConstraintsDetaFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetaFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormDetaFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetaFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetaFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected TipoDetaFormaPagoBeanSwingJInternalFrame tipodetaformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetaformapago="";

	protected DetaFormaPagoFactuBeanSwingJInternalFrame detaformapagofactuBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detaformapagofactu="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetaFormaPagoSessionBean detaformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public TipoDetaFormaPagoSessionBean tipodetaformapagoSessionBean;
	public DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetaFormaPago> detaformapagos;		
	public List<DetaFormaPago> detaformapagosEliminados;	
	public List<DetaFormaPago> detaformapagosAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDetaFormaPago;		
	protected JButton jButtonAbrirTotalesDetaFormaPago;		
	
	/*
	protected JPanel jPanelTotalesDetaFormaPago;
	public JScrollPane jScrollPanelTotalesDetaFormaPago;	
	protected JButton jButtonCerrarTotalesDetaFormaPago;
	*/
	
	public List<DetaFormaPago> detaformapagosTotal= new ArrayList<DetaFormaPago>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetaFormaPago;		
	protected JButton jButtonAbrirOrderByDetaFormaPago;
	
	
	//protected JPanel jPanelOrderByDetaFormaPago;
	//public JScrollPane jScrollPanelOrderByDetaFormaPago;	
	//protected JButton jButtonCerrarOrderByDetaFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetaFormaPagoLogic detaformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetaFormaPago;
	public JScrollPane jScrollPanelDatosEdicionDetaFormaPago;
	public JScrollPane jScrollPanelDatosGeneralDetaFormaPago;
    //public JScrollPane jScrollPanelDatosDetaFormaPagoTotales;
	
	
	//public JScrollPane jScrollPanelDatosDetaFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetaFormaPago;
	//public JScrollPane jScrollPanelImportacionDetaFormaPago;
	
	
	
	protected JPanel jPanelAccionesDetaFormaPago;
	
    protected JPanel jPanelPaginacionDetaFormaPago;
    protected JPanel jPanelParametrosReportesDetaFormaPago;
	protected JPanel jPanelParametrosReportesAccionesDetaFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetaFormaPago;
	protected JPanel jPanelParametrosAuxiliar2DetaFormaPago;
	protected JPanel jPanelParametrosAuxiliar3DetaFormaPago;
	protected JPanel jPanelParametrosAuxiliar4DetaFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5DetaFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetaFormaPago;
	//protected JPanel jPanelImportacionDetaFormaPago;
	
	
	public JTable jTableDatosDetaFormaPago;
	//public JTable jTableDatosDetaFormaPagoTotales;
	
	
	//public JTable jTableDatosDetaFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetaFormaPago;
	protected JButton jButtonDuplicarDetaFormaPago;
	protected JButton jButtonCopiarDetaFormaPago;
	protected JButton jButtonVerFormDetaFormaPago;
	protected JButton jButtonNuevoRelacionesDetaFormaPago;
	protected JButton jButtonModificarDetaFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaDetaFormaPago;
	protected JButton jButtonCerrarDetaFormaPago;
	
	
	protected JButton jButtonRecargarInformacionDetaFormaPago;
	protected JButton jButtonProcesarInformacionDetaFormaPago;
	
	
	protected JButton jButtonAnterioresDetaFormaPago;
	protected JButton jButtonSiguientesDetaFormaPago;
	protected JButton jButtonNuevoGuardarCambiosDetaFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetaFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoDetaFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetaFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetaFormaPago;
	//protected JButton jButtonGenerarImportacionDetaFormaPago;
	//protected JButton jButtonCerrarImportacionDetaFormaPago;
	//protected JFileChooser jFileChooserImportacionDetaFormaPago;
	//protected File fileImportacionDetaFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaFormaPago;
	protected JButton jButtonDuplicarToolBarDetaFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarDetaFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarDetaFormaPago;
	protected JButton jButtonCopiarToolBarDetaFormaPago;
	protected JButton jButtonVerFormToolBarDetaFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarDetaFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaFormaPago;
	protected JButton jButtonCerrarToolBarDetaFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarDetaFormaPago;
	protected JButton jButtonProcesarInformacionToolBarDetaFormaPago;
	protected JButton jButtonAnterioresToolBarDetaFormaPago;
	protected JButton jButtonSiguientesToolBarDetaFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetaFormaPago;
	protected JButton jButtonAbrirOrderByToolBarDetaFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaFormaPago;
	protected JMenuItem jMenuItemDuplicarDetaFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesDetaFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetaFormaPago;
	protected JMenuItem jMenuItemCopiarDetaFormaPago;
	protected JMenuItem jMenuItemVerFormDetaFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaFormaPago;
	protected JMenuItem jMenuItemCerrarDetaFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarDetaFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetaFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionDetaFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionDetaFormaPago;
	protected JMenuItem jMenuItemAnterioresDetaFormaPago;
	protected JMenuItem jMenuItemSiguientesDetaFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByDetaFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarDetaFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetaFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosDetaFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetaFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteDetaFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetaFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetaFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetaFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetaFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetaFormaPago;
	protected JTextField jTextFieldValorCampoGeneralDetaFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetaFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteDetaFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteDetaFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteDetaFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteDetaFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteDetaFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetaFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetaFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetaFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetaFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionDetaFormaPago;	
	//public JLabel jLabelPathArchivoImportacionDetaFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionDetaFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetaFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetaFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorDetaFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetaFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoDetaFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoDetaFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoDetaFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetaFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetaFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetaFormaPago;
	public JPanel jPanelFK_IdCuentaContableDetaFormaPago;
	public JButton jButtonFK_IdCuentaContableDetaFormaPago;
	public JPanel jPanelFK_IdDetaFormaPagoFactuDetaFormaPago;
	public JButton jButtonFK_IdDetaFormaPagoFactuDetaFormaPago;
	public JPanel jPanelFK_IdFacturaDetaFormaPago;
	public JButton jButtonFK_IdFacturaDetaFormaPago;
	public JPanel jPanelFK_IdTipoDetaFormaPagoDetaFormaPago;
	public JButton jButtonFK_IdTipoDetaFormaPagoDetaFormaPago;
	public JPanel jPanelFK_IdTipoFormaPagoDetaFormaPago;
	public JButton jButtonFK_IdTipoFormaPagoDetaFormaPago;
	public JPanel jPanelFK_IdTipoRetencionDetaFormaPago;
	public JButton jButtonFK_IdTipoRetencionDetaFormaPago;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableDetaFormaPago;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableDetaFormaPago;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetaFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetaFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetaFormaPagoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago;
	
	public JPanel jPanelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago;
	public JLabel jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago;
	public JButton jButtonid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago= new JButtonMe();
	public JButton jButtonid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaDetaFormaPago;
	public JLabel jLabelid_facturaFK_IdFacturaDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaDetaFormaPago;
	public JButton jButtonid_facturaFK_IdFacturaDetaFormaPago= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetaFormaPagoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago;
	
	public JPanel jPanelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago;
	public JLabel jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago;
	public JButton jButtonid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionDetaFormaPago;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionDetaFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionDetaFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetaFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetaFormaPago)	{
		this.jButtonRecargarInformacionDetaFormaPago = jButtonRecargarInformacionDetaFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionDetaFormaPago() {
		return this.jButtonProcesarInformacionDetaFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaFormaPago)	{
		this.jButtonProcesarInformacionDetaFormaPago = jButtonProcesarInformacionDetaFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionDetaFormaPago() {
		return this.jButtonRecargarInformacionDetaFormaPago;
	}
	
	
	public List<DetaFormaPago> getdetaformapagos() {
		return this.detaformapagos;
	}

	public void setdetaformapagos(List<DetaFormaPago> detaformapagos) {
		this.detaformapagos = detaformapagos;
	}
	
	public List<DetaFormaPago> getdetaformapagosAux() {
		return this.detaformapagosAux;
	}

	public void setdetaformapagosAux(List<DetaFormaPago> detaformapagosAux) {
		this.detaformapagosAux = detaformapagosAux;
	}
	
	public List<DetaFormaPago> getdetaformapagosEliminados() {
		return this.detaformapagosEliminados;
	}

	public void setDetaFormaPagosEliminados(List<DetaFormaPago> detaformapagosEliminados) {
		this.detaformapagosEliminados = detaformapagosEliminados;
	}
	
	public List<DetaFormaPago> getdetaformapagosTotal() {
		return this.detaformapagosTotal;
	}

	public void setdetaformapagosTotal(List<DetaFormaPago> detaformapagosTotal) {
		this.detaformapagosTotal = detaformapagosTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetaFormaPago() {
		return jComboBoxTiposSeleccionarDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetaFormaPago(
			JComboBox jComboBoxTiposSeleccionarDetaFormaPago) {
		this.jComboBoxTiposSeleccionarDetaFormaPago = jComboBoxTiposSeleccionarDetaFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetaFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetaFormaPago() {
		return jTextFieldValorCampoGeneralDetaFormaPago;
	}

	public void setjTextFieldValorCampoGeneralDetaFormaPago(
			JTextField jTextFieldValorCampoGeneralDetaFormaPago) {
		this.jTextFieldValorCampoGeneralDetaFormaPago = jTextFieldValorCampoGeneralDetaFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetaFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetaFormaPago() {
		return this.jCheckBoxSeleccionarTodosDetaFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosDetaFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosDetaFormaPago) {
		this.jCheckBoxSeleccionarTodosDetaFormaPago = jCheckBoxSeleccionarTodosDetaFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetaFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetaFormaPago() {
		return this.jCheckBoxSeleccionadosDetaFormaPago;
	}

	public void setjCheckBoxSeleccionadosDetaFormaPago(
			JCheckBox jCheckBoxSeleccionadosDetaFormaPago) {
		this.jCheckBoxSeleccionadosDetaFormaPago = jCheckBoxSeleccionadosDetaFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetaFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetaFormaPago() {
		return this.jComboBoxTiposArchivosReportesDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetaFormaPago(
			JComboBox jComboBoxTiposArchivosReportesDetaFormaPago) {
		this.jComboBoxTiposArchivosReportesDetaFormaPago = jComboBoxTiposArchivosReportesDetaFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetaFormaPago() {
		return this.jComboBoxTiposReportesDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetaFormaPago(
			JComboBox jComboBoxTiposReportesDetaFormaPago) {
		this.jComboBoxTiposReportesDetaFormaPago = jComboBoxTiposReportesDetaFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetaFormaPago() {
	//	return jComboBoxTiposReportesDinamicoDetaFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetaFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoDetaFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoDetaFormaPago = jComboBoxTiposReportesDinamicoDetaFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetaFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetaFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetaFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetaFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago = jComboBoxTiposArchivosReportesDinamicoDetaFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetaFormaPago() {
		return this.jComboBoxTiposGraficosReportesDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetaFormaPago(
			JComboBox jComboBoxTiposGraficosReportesDetaFormaPago) {
		this.jComboBoxTiposGraficosReportesDetaFormaPago = jComboBoxTiposGraficosReportesDetaFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetaFormaPago() {
		return this.jComboBoxTiposPaginacionDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetaFormaPago(
			JComboBox jComboBoxTiposPaginacionDetaFormaPago) {
		this.jComboBoxTiposPaginacionDetaFormaPago = jComboBoxTiposPaginacionDetaFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetaFormaPago() {
		return this.jComboBoxTiposRelacionesDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaFormaPago() {
		return this.jComboBoxTiposAccionesDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaFormaPago(
			JComboBox jComboBoxTiposRelacionesDetaFormaPago) {
		this.jComboBoxTiposRelacionesDetaFormaPago = jComboBoxTiposRelacionesDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaFormaPago(
			JComboBox jComboBoxTiposAccionesDetaFormaPago) {
		this.jComboBoxTiposAccionesDetaFormaPago = jComboBoxTiposAccionesDetaFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetaFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetaFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetaFormaPago() {
	//	return jCheckBoxConGraficoDinamicoDetaFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetaFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetaFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoDetaFormaPago = jCheckBoxConGraficoDinamicoDetaFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetaFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetaFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetaFormaPago .setBorder(borderResaltar);		
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
		this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		
		this.detaformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detaformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detaformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deta Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetaFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"nuevo","nuevo","Nuevo"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"duplicar","duplicar","Duplicar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"copiar","copiar","Copiar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"ver_form","ver_form","Ver"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"recargar","recargar","Recargar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetaFormaPago,this.jTtoolBarDetaFormaPago,
							"cerrar","cerrar","Salir"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetaFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetaFormaPago;
			
				this.jButtonProcesarInformacionToolBarDetaFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetaFormaPago;
				
		//protected JButton jButtonModificarToolBarDetaFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetaFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetaFormaPago=new JMenuMe("General");
		this.jmenuArchivoDetaFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesDetaFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosDetaFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetaFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetaFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetaFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetaFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetaFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetaFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetaFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetaFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetaFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetaFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetaFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetaFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetaFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetaFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetaFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetaFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetaFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetaFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetaFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetaFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetaFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetaFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetaFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetaFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetaFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetaFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetaFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetaFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetaFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetaFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetaFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetaFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetaFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetaFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetaFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetaFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetaFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetaFormaPago.add(this.jMenuItemCerrarDetaFormaPago);
			
			this.jmenuAccionesDetaFormaPago.add(this.jMenuItemNuevoDetaFormaPago);
			this.jmenuAccionesDetaFormaPago.add(this.jMenuItemNuevoGuardarCambiosDetaFormaPago);
			this.jmenuAccionesDetaFormaPago.add(this.jMenuItemNuevoRelacionesDetaFormaPago);
			this.jmenuAccionesDetaFormaPago.add(this.jMenuItemGuardarCambiosTablaDetaFormaPago);		
			this.jmenuAccionesDetaFormaPago.add(this.jMenuItemDuplicarDetaFormaPago);		
			this.jmenuAccionesDetaFormaPago.add(this.jMenuItemCopiarDetaFormaPago);		
			this.jmenuAccionesDetaFormaPago.add(this.jMenuItemVerFormDetaFormaPago);		
			
			this.jmenuDatosDetaFormaPago.add(this.jMenuItemRecargarInformacionDetaFormaPago);				
			this.jmenuDatosDetaFormaPago.add(this.jMenuItemAnterioresDetaFormaPago);				
			this.jmenuDatosDetaFormaPago.add(this.jMenuItemSiguientesDetaFormaPago);				
			this.jmenuDatosDetaFormaPago.add(this.jMenuItemAbrirOrderByDetaFormaPago);				
			this.jmenuDatosDetaFormaPago.add(this.jMenuItemMostrarOcultarDetaFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetaFormaPago.add(this.jMenuItemGuardarCambiosDetaFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetaFormaPago.add(this.jmenuArchivoDetaFormaPago);		
			this.jmenuBarDetaFormaPago.add(this.jmenuAccionesDetaFormaPago);		
			this.jmenuBarDetaFormaPago.add(this.jmenuDatosDetaFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetaFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetaFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDetaFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableDetaFormaPago= new JButtonMe();
		this.jButtonFK_IdCuentaContableDetaFormaPago.setText("Buscar");
		this.jButtonFK_IdCuentaContableDetaFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDetaFormaPago,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableDetaFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago.setFocusable(false);

		this.jPanelFK_IdDetaFormaPagoFactuDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetaFormaPagoFactuDetaFormaPago.setToolTipText("Buscar Por Deta Forma Pago Factu ");
		this.jButtonFK_IdDetaFormaPagoFactuDetaFormaPago= new JButtonMe();
		this.jButtonFK_IdDetaFormaPagoFactuDetaFormaPago.setText("Buscar");
		this.jButtonFK_IdDetaFormaPagoFactuDetaFormaPago.setToolTipText("Buscar Por Deta Forma Pago Factu ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetaFormaPagoFactuDetaFormaPago,"buscar_button","Buscar Por Deta Forma Pago Factu ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetaFormaPagoFactuDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago = new JLabelMe();
		jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setText("Deta Forma Pago Factu :");
		jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setToolTipText("Deta Forma Pago Factu");
		jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago= new JComboBoxMe();
		jComboBoxid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaDetaFormaPago.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaDetaFormaPago= new JButtonMe();
		this.jButtonFK_IdFacturaDetaFormaPago.setText("Buscar");
		this.jButtonFK_IdFacturaDetaFormaPago.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaDetaFormaPago,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaDetaFormaPago = new JLabelMe();
		jLabelid_facturaFK_IdFacturaDetaFormaPago.setText("Factura :");
		jLabelid_facturaFK_IdFacturaDetaFormaPago.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaDetaFormaPago= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago.setFocusable(false);

		this.jPanelFK_IdTipoDetaFormaPagoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDetaFormaPagoDetaFormaPago.setToolTipText("Buscar Por Tipo Deta Forma Pago ");
		this.jButtonFK_IdTipoDetaFormaPagoDetaFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoDetaFormaPagoDetaFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoDetaFormaPagoDetaFormaPago.setToolTipText("Buscar Por Tipo Deta Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDetaFormaPagoDetaFormaPago,"buscar_button","Buscar Por Tipo Deta Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDetaFormaPagoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago = new JLabelMe();
		jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setText("Tipo Deta Forma Pago :");
		jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setToolTipText("Tipo Deta Forma Pago");
		jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFormaPagoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoDetaFormaPago.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoDetaFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoDetaFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoDetaFormaPago.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoDetaFormaPago,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionDetaFormaPago.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionDetaFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoRetencionDetaFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoRetencionDetaFormaPago.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionDetaFormaPago,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionDetaFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetaFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasDetaFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetaFormaPago = new DetaFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Deta Forma Pago DATOS");
			this.jInternalFrameDetalleFormDetaFormaPago = new DetaFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.detaformapagoSessionBean.getConGuardarRelaciones(),this.detaformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetaFormaPago = null;//new DetaFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaFormaPago= new GridBagLayout();
		
		
		this.jTableDatosDetaFormaPago = new JTableMe();      
		
		String sToolTipDetaFormaPago="";
		sToolTipDetaFormaPago=DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaFormaPago+="(Facturacion.DetaFormaPago)";
		}
		
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetaFormaPago.setToolTipText(sToolTipDetaFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetaFormaPago);
		this.jTableDatosDetaFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosDetaFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetaFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosDetaFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDetaFormaPagoTotales = new JTableMe();        
		//this.jTableDatosDetaFormaPagoTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDetaFormaPagoTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetaFormaPago = new JButtonMe();
		this.jButtonDuplicarDetaFormaPago = new JButtonMe();
		this.jButtonCopiarDetaFormaPago = new JButtonMe();
		this.jButtonVerFormDetaFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesDetaFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetaFormaPago = new JButtonMe();
		this.jButtonCerrarDetaFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosDetaFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetaFormaPago = new JScrollPane();
		
		//this.jScrollPanelDatosDetaFormaPagoTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Deta Forma Pago";
		
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetaFormaPagoTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesDetaFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetaFormaPago=new ReporteDinamicoJInternalFrame(DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetaFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetaFormaPago=new ImportacionJInternalFrame(DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetaFormaPago();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDetaFormaPago = new JButtonMe();
		
		this.jButtonAbrirTotalesDetaFormaPago.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetaFormaPago,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDetaFormaPago=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetaFormaPago,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDetaFormaPago();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetaFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByDetaFormaPago.setText("Orden");
		this.jButtonAbrirOrderByDetaFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaFormaPago,false,this);
			
			//this.cargarOrderByDetaFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaFormaPago,true,this);
			
			//this.cargarOrderByDetaFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetaFormaPago.setMinimumSize(new Dimension(400,50));//2030
		this.jTableDatosDetaFormaPago.setMaximumSize(new Dimension(400,50));//2030
		this.jTableDatosDetaFormaPago.setPreferredSize(new Dimension(400,50));//2030
		
		this.jScrollPanelDatosDetaFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetaFormaPago.setText("Nuevo");
		this.jButtonDuplicarDetaFormaPago.setText("Duplicar");
		this.jButtonCopiarDetaFormaPago.setText("Copiar");
		this.jButtonVerFormDetaFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesDetaFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetaFormaPago.setText("Guardar");
		this.jButtonCerrarDetaFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaFormaPago,"nuevo_button","Nuevo",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetaFormaPago,"duplicar_button","Duplicar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetaFormaPago,"copiar_button","Copiar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetaFormaPago,"ver_form","Ver",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetaFormaPago,"nuevorelaciones_button","Nuevo Rel",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaFormaPago,"guardarcambiostabla_button","Guardar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaFormaPago,"cerrar_button","Salir",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetaFormaPago.setToolTipText("Nuevo"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetaFormaPago.setToolTipText("Duplicar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetaFormaPago.setToolTipText("Copiar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetaFormaPago.setToolTipText("Ver"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetaFormaPago.setToolTipText("Nuevo Rel"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetaFormaPago.setToolTipText("Guardar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaFormaPago.setToolTipText("Salir"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaFormaPago";
		inputMap = this.jButtonNuevoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetaFormaPago";
		inputMap = this.jButtonDuplicarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetaFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarDetaFormaPago";
		inputMap = this.jButtonCopiarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetaFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormDetaFormaPago";
		inputMap = this.jButtonVerFormDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetaFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetaFormaPago";
		inputMap = this.jButtonNuevoRelacionesDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetaFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetaFormaPago";
		inputMap = this.jButtonModificarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetaFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetaFormaPago";
		inputMap = this.jButtonCerrarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetaFormaPago.setName("jPanelParametrosReportesDetaFormaPago"); 
		
		this.jPanelParametrosReportesAccionesDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetaFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetaFormaPago.setName("jPanelParametrosReportesAccionesDetaFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetaFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionDetaFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionDetaFormaPago.setToolTipText("Recargar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetaFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetaFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionDetaFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionDetaFormaPago.setToolTipText("Procesar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetaFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionDetaFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetaFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesDetaFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetaFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetaFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetaFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetaFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesDetaFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesDetaFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetaFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarDetaFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetaFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetaFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetaFormaPago = new JLabelMe();
		
		this.jLabelAccionesDetaFormaPago.setText("Acciones");		
		this.jLabelAccionesDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetaFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetaFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetaFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetaFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetaFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetaFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetaFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetaFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetaFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetaFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetaFormaPago = new JButtonMe();
		//this.jButtonAnterioresDetaFormaPago.setText("<<");
        this.jButtonAnterioresDetaFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetaFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetaFormaPago = new JButtonMe();
		//this.jButtonSiguientesDetaFormaPago.setText(">>");
        this.jButtonSiguientesDetaFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetaFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetaFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetaFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetaFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetaFormaPago,"nuevoguardarcambios_button","Nue",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetaFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetaFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetaFormaPago";
		inputMap = this.jButtonRecargarInformacionDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetaFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetaFormaPago";
		inputMap = this.jButtonSiguientesDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetaFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetaFormaPago";
		inputMap = this.jButtonAnterioresDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetaFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetaFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetaFormaPago.setMinimumSize(new Dimension(this.getWidth(),DetaFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaFormaPago.setMaximumSize(new Dimension(this.getWidth(),DetaFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaFormaPago.setPreferredSize(new Dimension(this.getWidth(),DetaFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetaFormaPago = new GridBagLayout();

			this.jPanelPaginacionDetaFormaPago.setLayout(gridaBagLayoutPaginacionDetaFormaPago);						
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 0;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonAnterioresDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
					
						
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaFormaPago.gridy = 0;
			
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonNuevoGuardarCambiosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
						
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaFormaPago.gridy = 0;
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonSiguientesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 0;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonAbrirTotalesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 1;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonNuevoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetaFormaPago.gridy = 1;
				this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDetaFormaPago.add(this.jButtonNuevoRelacionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			}
			
			
			if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetaFormaPago.gridy = 1;
				this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetaFormaPago.add(this.jButtonGuardarCambiosTablaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			}
			
			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 1;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonDuplicarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 1;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonCopiarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 1;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonVerFormDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 1;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetaFormaPago.add(this.jButtonCerrarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		
		this.jButtonRecargarInformacionDetaFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetaFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetaFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetaFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetaFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetaFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetaFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetaFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetaFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetaFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetaFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetaFormaPago.setLayout(gridaBagParametrosReportesDetaFormaPago);
			this.jPanelParametrosReportesAccionesDetaFormaPago.setLayout(gridaBagParametrosReportesAccionesDetaFormaPago);
			
			
			this.jPanelParametrosAuxiliar1DetaFormaPago.setLayout(gridaBagParametrosAuxiliar1DetaFormaPago);
			this.jPanelParametrosAuxiliar2DetaFormaPago.setLayout(gridaBagParametrosAuxiliar2DetaFormaPago);
			this.jPanelParametrosAuxiliar3DetaFormaPago.setLayout(gridaBagParametrosAuxiliar3DetaFormaPago);
			this.jPanelParametrosAuxiliar4DetaFormaPago.setLayout(gridaBagParametrosAuxiliar4DetaFormaPago);
			//this.jPanelParametrosAuxiliar5DetaFormaPago.setLayout(gridaBagParametrosAuxiliar2DetaFormaPago);			
			
			
			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPago.add(this.jButtonRecargarInformacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaFormaPago.add(this.jComboBoxTiposPaginacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaFormaPago.add(this.jCheckBoxConAltoMaximoTablaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaFormaPago.add(this.jComboBoxTiposArchivosReportesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPago.add(this.jPanelParametrosAuxiliar1DetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetaFormaPago.add(this.jComboBoxTiposReportesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);																		
			
			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetaFormaPago.add(this.jComboBoxTiposGraficosReportesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPago.add(this.jPanelParametrosAuxiliar4DetaFormaPago, this.gridBagConstraintsDetaFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPago.add(this.jComboBoxTiposReportesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaFormaPago.add(this.jCheckBoxGenerarReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPago.add(this.jPanelParametrosAuxiliar2DetaFormaPago, this.gridBagConstraintsDetaFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaFormaPago.add(this.jLabelAccionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetaFormaPago.add(this.jButtonAbrirOrderByDetaFormaPago, this.gridBagConstraintsDetaFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPago.add(this.jComboBoxTiposSeleccionarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
			
			
			/*
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaFormaPago.add(this.jCheckBoxSeleccionarTodosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaFormaPago.add(this.jCheckBoxConGraficoReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaFormaPago.add(this.jCheckBoxSeleccionarTodosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);															
				
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaFormaPago.add(this.jCheckBoxSeleccionadosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);															
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaFormaPago.add(this.jCheckBoxConGraficoReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPago.add(this.jPanelParametrosAuxiliar3DetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPago.add(this.jComboBoxTiposRelacionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
				
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPago.add(this.jComboBoxTiposAccionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
	
				
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPago.add(this.jTextFieldValorCampoGeneralDetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetaFormaPago = new GridBagLayout();

			this.jScrollPanelDatosDetaFormaPago.setLayout(gridaBagLayoutDatosDetaFormaPago);
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = 0;
			this.gridBagConstraintsDetaFormaPago.gridx = 0;
			
			this.jScrollPanelDatosDetaFormaPago.add(this.jTableDatosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetaFormaPago.setViewportView(this.jTableDatosDetaFormaPago);
		this.jTableDatosDetaFormaPago.setFillsViewportHeight(true);
		this.jTableDatosDetaFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDetaFormaPagoTotales.setViewportView(this.jTableDatosDetaFormaPagoTotales);
		//this.jTableDatosDetaFormaPagoTotales.setFillsViewportHeight(true);
		//this.jTableDatosDetaFormaPagoTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetaFormaPago= new GridBagLayout();
		this.jPanelAccionesDetaFormaPago.setLayout(gridaBagLayoutAccionesDetaFormaPago);
		
		
		/*	
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
			
		this.jPanelAccionesDetaFormaPago.add(this.jButtonNuevoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableDetaFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDetaFormaPago.setLayout(gridaBagLayoutFK_IdCuentaContableDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableDetaFormaPago.add(jLabelid_cuenta_contableFK_IdCuentaContableDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 1;
		jPanelFK_IdCuentaContableDetaFormaPago.add(jComboBoxid_cuenta_contableFK_IdCuentaContableDetaFormaPago, gridBagConstraintsDetaFormaPago);


		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableDetaFormaPago.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 1;
		gridBagConstraintsDetaFormaPago.gridx =1;
		jPanelFK_IdCuentaContableDetaFormaPago.add(jButtonFK_IdCuentaContableDetaFormaPago, gridBagConstraintsDetaFormaPago);

		jTabbedPaneBusquedasDetaFormaPago.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableDetaFormaPago);
		jTabbedPaneBusquedasDetaFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetaFormaPagoFactuDetaFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdDetaFormaPagoFactuDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetaFormaPagoFactuDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetaFormaPagoFactuDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetaFormaPagoFactuDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetaFormaPagoFactuDetaFormaPago.setLayout(gridaBagLayoutFK_IdDetaFormaPagoFactuDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdDetaFormaPagoFactuDetaFormaPago.add(jLabelid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 1;
		jPanelFK_IdDetaFormaPagoFactuDetaFormaPago.add(jComboBoxid_deta_forma_pago_factuFK_IdDetaFormaPagoFactuDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 1;
		gridBagConstraintsDetaFormaPago.gridx =1;
		jPanelFK_IdDetaFormaPagoFactuDetaFormaPago.add(jButtonFK_IdDetaFormaPagoFactuDetaFormaPago, gridBagConstraintsDetaFormaPago);

		jTabbedPaneBusquedasDetaFormaPago.addTab("2.-Por Deta Forma Pago Factu ", jPanelFK_IdDetaFormaPagoFactuDetaFormaPago);
		jTabbedPaneBusquedasDetaFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFacturaDetaFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaDetaFormaPago.setLayout(gridaBagLayoutFK_IdFacturaDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdFacturaDetaFormaPago.add(jLabelid_facturaFK_IdFacturaDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 1;
		jPanelFK_IdFacturaDetaFormaPago.add(jComboBoxid_facturaFK_IdFacturaDetaFormaPago, gridBagConstraintsDetaFormaPago);


		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdFacturaDetaFormaPago.add(this.jButtonBuscarFK_IdFacturaid_facturaDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 1;
		gridBagConstraintsDetaFormaPago.gridx =1;
		jPanelFK_IdFacturaDetaFormaPago.add(jButtonFK_IdFacturaDetaFormaPago, gridBagConstraintsDetaFormaPago);

		jTabbedPaneBusquedasDetaFormaPago.addTab("3.-Por Factura ", jPanelFK_IdFacturaDetaFormaPago);
		jTabbedPaneBusquedasDetaFormaPago.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoDetaFormaPagoDetaFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDetaFormaPagoDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDetaFormaPagoDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDetaFormaPagoDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDetaFormaPagoDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDetaFormaPagoDetaFormaPago.setLayout(gridaBagLayoutFK_IdTipoDetaFormaPagoDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdTipoDetaFormaPagoDetaFormaPago.add(jLabelid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 1;
		jPanelFK_IdTipoDetaFormaPagoDetaFormaPago.add(jComboBoxid_tipo_deta_forma_pagoFK_IdTipoDetaFormaPagoDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 1;
		gridBagConstraintsDetaFormaPago.gridx =1;
		jPanelFK_IdTipoDetaFormaPagoDetaFormaPago.add(jButtonFK_IdTipoDetaFormaPagoDetaFormaPago, gridBagConstraintsDetaFormaPago);

		jTabbedPaneBusquedasDetaFormaPago.addTab("4.-Por Tipo Deta Forma Pago ", jPanelFK_IdTipoDetaFormaPagoDetaFormaPago);
		jTabbedPaneBusquedasDetaFormaPago.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoDetaFormaPago.setLayout(gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdTipoFormaPagoDetaFormaPago.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 1;
		jPanelFK_IdTipoFormaPagoDetaFormaPago.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 1;
		gridBagConstraintsDetaFormaPago.gridx =1;
		jPanelFK_IdTipoFormaPagoDetaFormaPago.add(jButtonFK_IdTipoFormaPagoDetaFormaPago, gridBagConstraintsDetaFormaPago);

		jTabbedPaneBusquedasDetaFormaPago.addTab("5.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoDetaFormaPago);
		jTabbedPaneBusquedasDetaFormaPago.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionDetaFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionDetaFormaPago.setLayout(gridaBagLayoutFK_IdTipoRetencionDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 0;
		jPanelFK_IdTipoRetencionDetaFormaPago.add(jLabelid_tipo_retencionFK_IdTipoRetencionDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 0;
		gridBagConstraintsDetaFormaPago.gridx = 1;
		jPanelFK_IdTipoRetencionDetaFormaPago.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionDetaFormaPago, gridBagConstraintsDetaFormaPago);

		gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPago.gridy = 1;
		gridBagConstraintsDetaFormaPago.gridx =1;
		jPanelFK_IdTipoRetencionDetaFormaPago.add(jButtonFK_IdTipoRetencionDetaFormaPago, gridBagConstraintsDetaFormaPago);

		jTabbedPaneBusquedasDetaFormaPago.addTab("6.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionDetaFormaPago);
		jTabbedPaneBusquedasDetaFormaPago.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detaformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaFormaPago.gridx = 0;		
			//this.gridBagConstraintsDetaFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetaFormaPago.gridx = 0;		
		//this.gridBagConstraintsDetaFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetaFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetaFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaFormaPago.gridx = 0;		
			this.gridBagConstraintsDetaFormaPago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetaFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetaFormaPago, this.gridBagConstraintsDetaFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);								
		
		
		/*
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		*/		
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaFormaPago.gridx =0;
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
				
		//this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDetaFormaPago.gridx =0;
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetaFormaPago.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDetaFormaPagoTotales/*this.jTableDatosDetaFormaPagoTotales*/, this.gridBagConstraintsDetaFormaPago);				
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosDetaFormaPago.setLayout(gridaBagLayoutBusquedasParametrosDetaFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetaFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			
			
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
			
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetaFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetaFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetaFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetaFormaPago.setName("jPanelReporteDinamicoDetaFormaPago"); 
		
		this.jPanelReporteDinamicoDetaFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetaFormaPago.setLayout(gridaBagLayoutReporteDinamicoDetaFormaPago);
		
		
		this.jInternalFrameReporteDinamicoDetaFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetaFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetaFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetaFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetaFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetaFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetaFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetaFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetaFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetaFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteDetaFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelColumnasSelectReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetaFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteDetaFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetaFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetaFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetaFormaPago=new JScrollPane(this.jListColumnasSelectReporteDetaFormaPago);
			
			this.jScrollColumnasSelectReporteDetaFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetaFormaPago.add(this.jListColumnasSelectReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jScrollColumnasSelectReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetaFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetaFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelRelacionesSelectReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetaFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetaFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetaFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetaFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetaFormaPago=new JScrollPane(this.jListRelacionesSelectReporteDetaFormaPago);
			
			this.jScrollRelacionesSelectReporteDetaFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetaFormaPago.add(this.jListRelacionesSelectReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jScrollRelacionesSelectReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDetaFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetaFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetaFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetaFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetaFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetaFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetaFormaPago = new JLabelMe();

		this.jLabelConGraficoDinamicoDetaFormaPago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelConGraficoDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetaFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetaFormaPago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetaFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetaFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetaFormaPago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jCheckBoxConGraficoDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetaFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetaFormaPago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelColumnaCategoriaGraficoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetaFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetaFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetaFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetaFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetaFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jComboBoxColumnaCategoriaGraficoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetaFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetaFormaPago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelColumnaCategoriaValorDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetaFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetaFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetaFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetaFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetaFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jComboBoxColumnaCategoriaValorDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetaFormaPago = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetaFormaPago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelColumnasValoresGraficoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetaFormaPago = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetaFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetaFormaPago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetaFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetaFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetaFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetaFormaPago=new JScrollPane(this.jListColumnasValoresGraficoDetaFormaPago);
			
			this.jScrollColumnasValoresGraficoDetaFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetaFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetaFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetaFormaPago.add(this.jListColumnasSelectReporteDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jScrollColumnasValoresGraficoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetaFormaPago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetaFormaPago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelTiposGraficosReportesDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetaFormaPago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetaFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetaFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetaFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetaFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jComboBoxTiposGraficosReportesDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetaFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelGenerarExcelReporteDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetaFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetaFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetaFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetaFormaPago.setToolTipText("Generar EXCEL"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetaFormaPago.add(this.jButtonGenerarExcelReporteDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jComboBoxTiposReportesDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetaFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jLabelTiposArchivoReporteDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetaFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetaFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetaFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetaFormaPago.setToolTipText("Generar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jButtonGenerarReporteDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetaFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetaFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetaFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetaFormaPago.setToolTipText("Cancelar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPago.add(this.jButtonCerrarReporteDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetaFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetaFormaPago= new JScrollPane(jPanelReporteDinamicoDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetaFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetaFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetaFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetaFormaPago);
		this.jInternalFrameReporteDinamicoDetaFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetaFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetaFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetaFormaPago.setName("jPanelImportacionDetaFormaPago"); 
		
		this.jPanelImportacionDetaFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetaFormaPago.setLayout(gridaBagLayoutImportacionDetaFormaPago);
		
		
		this.jInternalFrameImportacionDetaFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetaFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetaFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetaFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaFormaPago.setResizable(true);
	    this.jInternalFrameImportacionDetaFormaPago.setClosable(true);
	    this.jInternalFrameImportacionDetaFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetaFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaFormaPago.setResizable(true);
	    this.jInternalFrameImportacionDetaFormaPago.setClosable(true);
	    this.jInternalFrameImportacionDetaFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetaFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetaFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionDetaFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaFormaPago.add(this.jLabelArchivoImportacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetaFormaPago = new JFileChooser();		
		this.jFileChooserImportacionDetaFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetaFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionDetaFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetaFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetaFormaPago.setToolTipText("Generar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPago.add(this.jButtonAbrirImportacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetaFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionDetaFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaFormaPago.add(this.jLabelPathArchivoImportacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetaFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetaFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPago.add(this.jTextFieldPathArchivoImportacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetaFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionDetaFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetaFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetaFormaPago.setToolTipText("Generar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPago.add(this.jButtonGenerarImportacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetaFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionDetaFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetaFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetaFormaPago.setToolTipText("Cancelar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPago.add(this.jButtonCerrarImportacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetaFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionDetaFormaPago= new JScrollPane(jPanelImportacionDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsDetaFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetaFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetaFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetaFormaPago);
		this.jInternalFrameImportacionDetaFormaPago.getContentPane().add(this.jScrollPanelImportacionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDetaFormaPago() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDetaFormaPago = new JButtonMe();
		this.jButtonAbrirTotalesDetaFormaPago.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDetaFormaPago,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDetaFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDetaFormaPago.setName("jPanelTotalesDetaFormaPago"); 
		
		this.jPanelTotalesDetaFormaPago.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetaFormaPago.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDetaFormaPago.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDetaFormaPago.setLayout(gridaBagLayoutTotalesDetaFormaPago);
		
		
		this.jInternalFrameTotalesDetaFormaPago= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDetaFormaPago= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDetaFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDetaFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDetaFormaPago.setTitle("Totales");
	    this.jInternalFrameTotalesDetaFormaPago.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDetaFormaPago.setResizable(true);
	    this.jInternalFrameTotalesDetaFormaPago.setClosable(true);
	    this.jInternalFrameTotalesDetaFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDetaFormaPago.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetaFormaPago.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDetaFormaPago.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pagos"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iPosYTotales++;
		this.gridBagConstraintsDetaFormaPago.gridx =iPosXTotales;
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDetaFormaPago.ipady =150;
		
		this.jPanelTotalesDetaFormaPago.add(jScrollPanelDatosDetaFormaPagoTotales, this.gridBagConstraintsDetaFormaPago);//this.jTableDatosDetaFormaPagoTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDetaFormaPago = new JButtonMe();
		this.jButtonCerrarTotalesDetaFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDetaFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDetaFormaPago.setToolTipText("Cancelar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = iPosYTotales++;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXTotales;
							
		this.jPanelTotalesDetaFormaPago.add(this.jButtonCerrarTotalesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetaFormaPago = new GridBagLayout();
		
		this.jScrollPanelTotalesDetaFormaPago= new JScrollPane(jPanelTotalesDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iPosYTotales;
		this.gridBagConstraintsDetaFormaPago.gridx =iPosXTotales;
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDetaFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDetaFormaPago.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetaFormaPago);
		this.jInternalFrameTotalesDetaFormaPago.getContentPane().add(this.jScrollPanelTotalesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDetaFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetaFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByDetaFormaPago.setText("Orden");
			this.jButtonAbrirOrderByDetaFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetaFormaPago";
			inputMap = this.jButtonAbrirOrderByDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetaFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetaFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetaFormaPago.setName("jPanelOrderByDetaFormaPago"); 
			
			this.jPanelOrderByDetaFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetaFormaPago.setLayout(gridaBagLayoutOrderByDetaFormaPago);
			
			
			this.jTableDatosDetaFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosDetaFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetaFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetaFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetaFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetaFormaPagoOrderBy.setViewportView(this.jTableDatosDetaFormaPagoOrderBy);
			this.jTableDatosDetaFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetaFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetaFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetaFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetaFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetaFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetaFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetaFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByDetaFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetaFormaPago.setResizable(true);
			this.jInternalFrameOrderByDetaFormaPago.setClosable(true);
			this.jInternalFrameOrderByDetaFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetaFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetaFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetaFormaPago.ipady =150;
				
			this.jPanelOrderByDetaFormaPago.add(jScrollPanelDatosDetaFormaPagoOrderBy, this.gridBagConstraintsDetaFormaPago);//this.jTableDatosDetaFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetaFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByDetaFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetaFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetaFormaPago.setToolTipText("Cancelar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetaFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetaFormaPago.add(this.jButtonCerrarOrderByDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetaFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByDetaFormaPago= new JScrollPane(jPanelOrderByDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetaFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetaFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetaFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetaFormaPago);
			
			this.jInternalFrameOrderByDetaFormaPago.getContentPane().add(this.jScrollPanelOrderByDetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByDetaFormaPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//4630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detaformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetaFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetaFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetaFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetaFormaPago.getRowHeight();//DetaFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaFormaPago.isSelected()) {
					iHeightTable=DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaFormaPago.isSelected()) {
					iHeightTable=DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetaFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetaFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetaFormaPago!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetaFormaPago.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetaFormaPago.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetaFormaPago.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetaFormaPago!=null && this.jInternalFrameOrderByDetaFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetaFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetaFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetaFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetaFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetaFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetaFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetaFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetaFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
	
	public void redimensionarTablaTotales() {
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDetaFormaPago!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDetaFormaPago.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDetaFormaPago.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDetaFormaPago.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDetaFormaPago.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detaformapagoLogic.getDetaFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detaformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetaFormaPago> TraerDetaFormaPagoBeans(List<DetaFormaPago> detaformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetaFormaPago detaformapago:detaformapagos) {
					
				if(!(DetaFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetaFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detaformapago.setsDetalleGeneralEntityReporte(DetaFormaPagoConstantesFunciones.getDetaFormaPagoDescripcion(detaformapago));
										
						
					
					

					if(detaformapago.getBancoFormaPagos()!=null && Funciones.existeClass(classes,BancoFormaPago.class)) {
						try{detaformapago.setbancoformapagosDescripcionReporte(new JRBeanCollectionDataSource(BancoFormaPagoJInternalFrame.TraerBancoFormaPagoBeans(detaformapago.getBancoFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//detaformapago.setsDetalleGeneralEntityReporte(detaformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//detaformapagobeans.add(detaformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detaformapagos;
    }
	//PARA REPORTES FIN
}
