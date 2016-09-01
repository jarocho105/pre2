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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.cartera.util.ClienteRetencionConstantesFunciones;

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
public class ClienteRetencionJInternalFrame extends ClienteRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarClienteRetencion;
	
	protected JMenuBar jmenuBarClienteRetencion;
	
	protected JMenu jmenuClienteRetencion;
	protected JMenu jmenuDatosClienteRetencion;
	protected JMenu jmenuArchivoClienteRetencion;
	protected JMenu jmenuAccionesClienteRetencion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteRetencion;	
	protected GridBagConstraints gridBagConstraintsClienteRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ClienteRetencionDetalleFormJInternalFrame jInternalFrameDetalleFormClienteRetencion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoClienteRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionClienteRetencion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableclienteretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableclienteretencion="";

	protected EstadoRetencionBeanSwingJInternalFrame estadoretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoretencion="";
	
	public ClienteRetencionSessionBean clienteretencionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CuentaContableSessionBean cuentacontableclienteretencionSessionBean;
	public EstadoRetencionSessionBean estadoretencionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ClienteRetencion> clienteretencions;		
	public List<ClienteRetencion> clienteretencionsEliminados;	
	public List<ClienteRetencion> clienteretencionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByClienteRetencion;		
	protected JButton jButtonAbrirOrderByClienteRetencion;
	
	
	//protected JPanel jPanelOrderByClienteRetencion;
	//public JScrollPane jScrollPanelOrderByClienteRetencion;	
	//protected JButton jButtonCerrarOrderByClienteRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ClienteRetencionLogic clienteretencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosClienteRetencion;
	public JScrollPane jScrollPanelDatosEdicionClienteRetencion;
	public JScrollPane jScrollPanelDatosGeneralClienteRetencion;
    
	
	
	//public JScrollPane jScrollPanelDatosClienteRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoClienteRetencion;
	//public JScrollPane jScrollPanelImportacionClienteRetencion;
	
	
	
	protected JPanel jPanelAccionesClienteRetencion;
	
    protected JPanel jPanelPaginacionClienteRetencion;
    protected JPanel jPanelParametrosReportesClienteRetencion;
	protected JPanel jPanelParametrosReportesAccionesClienteRetencion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ClienteRetencion;
	protected JPanel jPanelParametrosAuxiliar2ClienteRetencion;
	protected JPanel jPanelParametrosAuxiliar3ClienteRetencion;
	protected JPanel jPanelParametrosAuxiliar4ClienteRetencion;
	//protected JPanel jPanelParametrosAuxiliar5ClienteRetencion;
	
	
	
	//protected JPanel jPanelReporteDinamicoClienteRetencion;
	//protected JPanel jPanelImportacionClienteRetencion;
	
	
	public JTable jTableDatosClienteRetencion;
	
	
	
	//public JTable jTableDatosClienteRetencionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoClienteRetencion;
	protected JButton jButtonDuplicarClienteRetencion;
	protected JButton jButtonCopiarClienteRetencion;
	protected JButton jButtonVerFormClienteRetencion;
	protected JButton jButtonNuevoRelacionesClienteRetencion;
	protected JButton jButtonModificarClienteRetencion;
	
    protected JButton jButtonGuardarCambiosTablaClienteRetencion;
	protected JButton jButtonCerrarClienteRetencion;
	
	
	protected JButton jButtonRecargarInformacionClienteRetencion;
	protected JButton jButtonProcesarInformacionClienteRetencion;
	
	
	protected JButton jButtonAnterioresClienteRetencion;
	protected JButton jButtonSiguientesClienteRetencion;
	protected JButton jButtonNuevoGuardarCambiosClienteRetencion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoClienteRetencion;
	//protected JButton jButtonCerrarReporteDinamicoClienteRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoClienteRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionClienteRetencion;
	//protected JButton jButtonGenerarImportacionClienteRetencion;
	//protected JButton jButtonCerrarImportacionClienteRetencion;
	//protected JFileChooser jFileChooserImportacionClienteRetencion;
	//protected File fileImportacionClienteRetencion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteRetencion;
	protected JButton jButtonDuplicarToolBarClienteRetencion;
	protected JButton jButtonNuevoRelacionesToolBarClienteRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarClienteRetencion;
	protected JButton jButtonCopiarToolBarClienteRetencion;
	protected JButton jButtonVerFormToolBarClienteRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarClienteRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteRetencion;
	protected JButton jButtonCerrarToolBarClienteRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarClienteRetencion;
	protected JButton jButtonProcesarInformacionToolBarClienteRetencion;
	protected JButton jButtonAnterioresToolBarClienteRetencion;
	protected JButton jButtonSiguientesToolBarClienteRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarClienteRetencion;
	protected JButton jButtonAbrirOrderByToolBarClienteRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteRetencion;
	protected JMenuItem jMenuItemDuplicarClienteRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesClienteRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosClienteRetencion;
	protected JMenuItem jMenuItemCopiarClienteRetencion;
	protected JMenuItem jMenuItemVerFormClienteRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteRetencion;
	protected JMenuItem jMenuItemCerrarClienteRetencion;
	protected JMenuItem jMenuItemDetalleCerrarClienteRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByClienteRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionClienteRetencion;
	protected JMenuItem jMenuItemProcesarInformacionClienteRetencion;
	protected JMenuItem jMenuItemAnterioresClienteRetencion;
	protected JMenuItem jMenuItemSiguientesClienteRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteRetencion;
	protected JMenuItem jMenuItemAbrirOrderByClienteRetencion;
	protected JMenuItem jMenuItemMostrarOcultarClienteRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosClienteRetencion;
	protected JCheckBox jCheckBoxSeleccionadosClienteRetencion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaClienteRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteClienteRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesClienteRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesClienteRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoClienteRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoClienteRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesClienteRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionClienteRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarClienteRetencion;
	protected JTextField jTextFieldValorCampoGeneralClienteRetencion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteClienteRetencion;
	//public JList<Reporte> jListColumnasSelectReporteClienteRetencion;
	//public JScrollPane jScrollColumnasSelectReporteClienteRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteClienteRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteClienteRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteClienteRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoClienteRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoClienteRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoClienteRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoClienteRetencion;
	
		
	//public JLabel jLabelArchivoImportacionClienteRetencion;	
	//public JLabel jLabelPathArchivoImportacionClienteRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionClienteRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoClienteRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoClienteRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorClienteRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorClienteRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoClienteRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoClienteRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoClienteRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoClienteRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoClienteRetencion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasClienteRetencion;
	public JPanel jPanelFK_IdAsientoContableClienteRetencion;
	public JButton jButtonFK_IdAsientoContableClienteRetencion;
	public JPanel jPanelFK_IdClienteClienteRetencion;
	public JButton jButtonFK_IdClienteClienteRetencion;
	public JPanel jPanelFK_IdCuentaContableClienteRetencionClienteRetencion;
	public JButton jButtonFK_IdCuentaContableClienteRetencionClienteRetencion;
	public JPanel jPanelFK_IdEstadoRetencionClienteRetencion;
	public JButton jButtonFK_IdEstadoRetencionClienteRetencion;
	public JPanel jPanelFK_IdFacturaClienteRetencion;
	public JButton jButtonFK_IdFacturaClienteRetencion;
	public JPanel jPanelFK_IdTipoRetencionClienteRetencion;
	public JButton jButtonFK_IdTipoRetencionClienteRetencion;
	public JPanel jPanelFK_IdTransaccionClienteRetencion;
	public JButton jButtonFK_IdTransaccionClienteRetencion;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableClienteRetencion;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableClienteRetencion;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableClienteRetencion= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableClienteRetencionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion;
	
	public JPanel jPanelid_clienteFK_IdClienteClienteRetencion;
	public JLabel jLabelid_clienteFK_IdClienteClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteClienteRetencion;
	public JButton jButtonid_clienteFK_IdClienteClienteRetencion= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteRetencionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteClienteRetencion;
	
	public JPanel jPanelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion;
	public JLabel jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion;
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion;
	
	public JPanel jPanelid_estado_retencionFK_IdEstadoRetencionClienteRetencion;
	public JLabel jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_retencionFK_IdEstadoRetencionClienteRetencion;
	public JButton jButtonid_estado_retencionFK_IdEstadoRetencionClienteRetencion= new JButtonMe();
	public JButton jButtonid_estado_retencionFK_IdEstadoRetencionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_estado_retencionFK_IdEstadoRetencionClienteRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaClienteRetencion;
	public JLabel jLabelid_facturaFK_IdFacturaClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaClienteRetencion;
	public JButton jButtonid_facturaFK_IdFacturaClienteRetencion= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaClienteRetencionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaClienteRetencion;
	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionClienteRetencion;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionClienteRetencion;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionClienteRetencion= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionClienteRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionClienteRetencion;
	public JLabel jLabelid_transaccionFK_IdTransaccionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionClienteRetencion;
	public JButton jButtonid_transaccionFK_IdTransaccionClienteRetencion= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionClienteRetencionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ClienteRetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteRetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteRetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteRetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionClienteRetencion)	{
		this.jButtonRecargarInformacionClienteRetencion = jButtonRecargarInformacionClienteRetencion;
	}
	
	public JButton getjButtonProcesarInformacionClienteRetencion() {
		return this.jButtonProcesarInformacionClienteRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteRetencion)	{
		this.jButtonProcesarInformacionClienteRetencion = jButtonProcesarInformacionClienteRetencion;
	}
	
	
	public JButton getjButtonRecargarInformacionClienteRetencion() {
		return this.jButtonRecargarInformacionClienteRetencion;
	}
	
	
	public List<ClienteRetencion> getclienteretencions() {
		return this.clienteretencions;
	}

	public void setclienteretencions(List<ClienteRetencion> clienteretencions) {
		this.clienteretencions = clienteretencions;
	}
	
	public List<ClienteRetencion> getclienteretencionsAux() {
		return this.clienteretencionsAux;
	}

	public void setclienteretencionsAux(List<ClienteRetencion> clienteretencionsAux) {
		this.clienteretencionsAux = clienteretencionsAux;
	}
	
	public List<ClienteRetencion> getclienteretencionsEliminados() {
		return this.clienteretencionsEliminados;
	}

	public void setClienteRetencionsEliminados(List<ClienteRetencion> clienteretencionsEliminados) {
		this.clienteretencionsEliminados = clienteretencionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarClienteRetencion() {
		return jComboBoxTiposSeleccionarClienteRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarClienteRetencion(
			JComboBox jComboBoxTiposSeleccionarClienteRetencion) {
		this.jComboBoxTiposSeleccionarClienteRetencion = jComboBoxTiposSeleccionarClienteRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarClienteRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralClienteRetencion() {
		return jTextFieldValorCampoGeneralClienteRetencion;
	}

	public void setjTextFieldValorCampoGeneralClienteRetencion(
			JTextField jTextFieldValorCampoGeneralClienteRetencion) {
		this.jTextFieldValorCampoGeneralClienteRetencion = jTextFieldValorCampoGeneralClienteRetencion;
	}

	public void setBorderResaltarValorCampoGeneralClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralClienteRetencion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosClienteRetencion() {
		return this.jCheckBoxSeleccionarTodosClienteRetencion;
	}

	public void setjCheckBoxSeleccionarTodosClienteRetencion(
			JCheckBox jCheckBoxSeleccionarTodosClienteRetencion) {
		this.jCheckBoxSeleccionarTodosClienteRetencion = jCheckBoxSeleccionarTodosClienteRetencion;
	}

	public void setBorderResaltarSeleccionarTodosClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosClienteRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosClienteRetencion() {
		return this.jCheckBoxSeleccionadosClienteRetencion;
	}

	public void setjCheckBoxSeleccionadosClienteRetencion(
			JCheckBox jCheckBoxSeleccionadosClienteRetencion) {
		this.jCheckBoxSeleccionadosClienteRetencion = jCheckBoxSeleccionadosClienteRetencion;
	}
	
	public void setBorderResaltarSeleccionadosClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosClienteRetencion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesClienteRetencion() {
		return this.jComboBoxTiposArchivosReportesClienteRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesClienteRetencion(
			JComboBox jComboBoxTiposArchivosReportesClienteRetencion) {
		this.jComboBoxTiposArchivosReportesClienteRetencion = jComboBoxTiposArchivosReportesClienteRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesClienteRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesClienteRetencion() {
		return this.jComboBoxTiposReportesClienteRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesClienteRetencion(
			JComboBox jComboBoxTiposReportesClienteRetencion) {
		this.jComboBoxTiposReportesClienteRetencion = jComboBoxTiposReportesClienteRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoClienteRetencion() {
	//	return jComboBoxTiposReportesDinamicoClienteRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoClienteRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoClienteRetencion) {
	//	this.jComboBoxTiposReportesDinamicoClienteRetencion = jComboBoxTiposReportesDinamicoClienteRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoClienteRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoClienteRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoClienteRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoClienteRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion = jComboBoxTiposArchivosReportesDinamicoClienteRetencion;
	//}
	
	public void setBorderResaltarTiposReportesClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesClienteRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesClienteRetencion() {
		return this.jComboBoxTiposGraficosReportesClienteRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesClienteRetencion(
			JComboBox jComboBoxTiposGraficosReportesClienteRetencion) {
		this.jComboBoxTiposGraficosReportesClienteRetencion = jComboBoxTiposGraficosReportesClienteRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesClienteRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionClienteRetencion() {
		return this.jComboBoxTiposPaginacionClienteRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionClienteRetencion(
			JComboBox jComboBoxTiposPaginacionClienteRetencion) {
		this.jComboBoxTiposPaginacionClienteRetencion = jComboBoxTiposPaginacionClienteRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionClienteRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesClienteRetencion() {
		return this.jComboBoxTiposRelacionesClienteRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteRetencion() {
		return this.jComboBoxTiposAccionesClienteRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteRetencion(
			JComboBox jComboBoxTiposRelacionesClienteRetencion) {
		this.jComboBoxTiposRelacionesClienteRetencion = jComboBoxTiposRelacionesClienteRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteRetencion(
			JComboBox jComboBoxTiposAccionesClienteRetencion) {
		this.jComboBoxTiposAccionesClienteRetencion = jComboBoxTiposAccionesClienteRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesClienteRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesClienteRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesClienteRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoClienteRetencion() {
	//	return jCheckBoxConGraficoDinamicoClienteRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoClienteRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoClienteRetencion) {
	//	this.jCheckBoxConGraficoDinamicoClienteRetencion = jCheckBoxConGraficoDinamicoClienteRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoClienteRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarClienteRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoClienteRetencion .setBorder(borderResaltar);		
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
		this.clienteretencionSessionBean=new ClienteRetencionSessionBean();
		
		this.clienteretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clienteretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clienteretencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {
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
		
		ClienteRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarClienteRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"nuevo","nuevo","Nuevo"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"duplicar","duplicar","Duplicar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"copiar","copiar","Copiar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"ver_form","ver_form","Ver"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"recargar","recargar","Recargar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarClienteRetencion,this.jTtoolBarClienteRetencion,
							"cerrar","cerrar","Salir"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarClienteRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarClienteRetencion;
			
				this.jButtonProcesarInformacionToolBarClienteRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarClienteRetencion;
				
		//protected JButton jButtonModificarToolBarClienteRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarClienteRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuClienteRetencion=new JMenuMe("General");
		this.jmenuArchivoClienteRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesClienteRetencion=new JMenuMe("Acciones");
		this.jmenuDatosClienteRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarClienteRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarClienteRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarClienteRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesClienteRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesClienteRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesClienteRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosClienteRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarClienteRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarClienteRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarClienteRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormClienteRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormClienteRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormClienteRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaClienteRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaClienteRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaClienteRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionClienteRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionClienteRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionClienteRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionClienteRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionClienteRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionClienteRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresClienteRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresClienteRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresClienteRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesClienteRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesClienteRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesClienteRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByClienteRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByClienteRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByClienteRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByClienteRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByClienteRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByClienteRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosClienteRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosClienteRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosClienteRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoClienteRetencion.add(this.jMenuItemCerrarClienteRetencion);
			
			this.jmenuAccionesClienteRetencion.add(this.jMenuItemNuevoClienteRetencion);
			this.jmenuAccionesClienteRetencion.add(this.jMenuItemNuevoGuardarCambiosClienteRetencion);
			this.jmenuAccionesClienteRetencion.add(this.jMenuItemNuevoRelacionesClienteRetencion);
			this.jmenuAccionesClienteRetencion.add(this.jMenuItemGuardarCambiosTablaClienteRetencion);		
			this.jmenuAccionesClienteRetencion.add(this.jMenuItemDuplicarClienteRetencion);		
			this.jmenuAccionesClienteRetencion.add(this.jMenuItemCopiarClienteRetencion);		
			this.jmenuAccionesClienteRetencion.add(this.jMenuItemVerFormClienteRetencion);		
			
			this.jmenuDatosClienteRetencion.add(this.jMenuItemRecargarInformacionClienteRetencion);				
			this.jmenuDatosClienteRetencion.add(this.jMenuItemAnterioresClienteRetencion);				
			this.jmenuDatosClienteRetencion.add(this.jMenuItemSiguientesClienteRetencion);				
			this.jmenuDatosClienteRetencion.add(this.jMenuItemAbrirOrderByClienteRetencion);				
			this.jmenuDatosClienteRetencion.add(this.jMenuItemMostrarOcultarClienteRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesClienteRetencion.add(this.jMenuItemGuardarCambiosClienteRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarClienteRetencion.add(this.jmenuArchivoClienteRetencion);		
			this.jmenuBarClienteRetencion.add(this.jmenuAccionesClienteRetencion);		
			this.jmenuBarClienteRetencion.add(this.jmenuDatosClienteRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarClienteRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasClienteRetencion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableClienteRetencion.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableClienteRetencion= new JButtonMe();
		this.jButtonFK_IdAsientoContableClienteRetencion.setText("Buscar");
		this.jButtonFK_IdAsientoContableClienteRetencion.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableClienteRetencion,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableClienteRetencion= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion.setFocusable(false);

		this.jPanelFK_IdClienteClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteClienteRetencion.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteClienteRetencion= new JButtonMe();
		this.jButtonFK_IdClienteClienteRetencion.setText("Buscar");
		this.jButtonFK_IdClienteClienteRetencion.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteClienteRetencion,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteClienteRetencion = new JLabelMe();
		jLabelid_clienteFK_IdClienteClienteRetencion.setText("Cliente :");
		jLabelid_clienteFK_IdClienteClienteRetencion.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteClienteRetencion= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion.setFocusable(false);

		this.jPanelFK_IdCuentaContableClienteRetencionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableClienteRetencionClienteRetencion.setToolTipText("Buscar Por Cuenta Retencion ");
		this.jButtonFK_IdCuentaContableClienteRetencionClienteRetencion= new JButtonMe();
		this.jButtonFK_IdCuentaContableClienteRetencionClienteRetencion.setText("Buscar");
		this.jButtonFK_IdCuentaContableClienteRetencionClienteRetencion.setToolTipText("Buscar Por Cuenta Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableClienteRetencionClienteRetencion,"buscar_button","Buscar Por Cuenta Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableClienteRetencionClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion = new JLabelMe();
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setText("Cuenta Retencion :");
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setToolTipText("Cuenta Retencion");
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion.setFocusable(false);

		this.jPanelFK_IdEstadoRetencionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoRetencionClienteRetencion.setToolTipText("Buscar Por Estado Retencion ");
		this.jButtonFK_IdEstadoRetencionClienteRetencion= new JButtonMe();
		this.jButtonFK_IdEstadoRetencionClienteRetencion.setText("Buscar");
		this.jButtonFK_IdEstadoRetencionClienteRetencion.setToolTipText("Buscar Por Estado Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoRetencionClienteRetencion,"buscar_button","Buscar Por Estado Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoRetencionClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion = new JLabelMe();
		jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setText("Estado Retencion :");
		jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setToolTipText("Estado Retencion");
		jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_retencionFK_IdEstadoRetencionClienteRetencion= new JComboBoxMe();
		jComboBoxid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionFK_IdEstadoRetencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_retencionFK_IdEstadoRetencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaClienteRetencion.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaClienteRetencion= new JButtonMe();
		this.jButtonFK_IdFacturaClienteRetencion.setText("Buscar");
		this.jButtonFK_IdFacturaClienteRetencion.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaClienteRetencion,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaClienteRetencion = new JLabelMe();
		jLabelid_facturaFK_IdFacturaClienteRetencion.setText("Factura :");
		jLabelid_facturaFK_IdFacturaClienteRetencion.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaClienteRetencion= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion.setFocusable(false);

		this.jPanelFK_IdTipoRetencionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionClienteRetencion.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionClienteRetencion= new JButtonMe();
		this.jButtonFK_IdTipoRetencionClienteRetencion.setText("Buscar");
		this.jButtonFK_IdTipoRetencionClienteRetencion.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionClienteRetencion,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionClienteRetencion= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionClienteRetencion.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTransaccionClienteRetencion= new JButtonMe();
		this.jButtonFK_IdTransaccionClienteRetencion.setText("Buscar");
		this.jButtonFK_IdTransaccionClienteRetencion.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionClienteRetencion,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionClienteRetencion = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionClienteRetencion.setText("Tipo :");
		jLabelid_transaccionFK_IdTransaccionClienteRetencion.setToolTipText("Tipo");
		jLabelid_transaccionFK_IdTransaccionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionClienteRetencion= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasClienteRetencion=new JTabbedPane();


		this.jTabbedPaneBusquedasClienteRetencion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteRetencion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteRetencion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasClienteRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleClienteRetencion = new ClienteRetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Retencion DATOS");
			this.jInternalFrameDetalleFormClienteRetencion = new ClienteRetencionDetalleFormJInternalFrame(jDesktopPane,this.clienteretencionSessionBean.getConGuardarRelaciones(),this.clienteretencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormClienteRetencion = null;//new ClienteRetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteRetencion= new GridBagLayout();
		
		
		this.jTableDatosClienteRetencion = new JTableMe();      
		
		String sToolTipClienteRetencion="";
		sToolTipClienteRetencion=ClienteRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteRetencion+="(Cartera.ClienteRetencion)";
		}
		
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosClienteRetencion.setToolTipText(sToolTipClienteRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosClienteRetencion);
		this.jTableDatosClienteRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosClienteRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosClienteRetencion.setRowSelectionAllowed(true);
		this.jTableDatosClienteRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoClienteRetencion = new JButtonMe();
		this.jButtonDuplicarClienteRetencion = new JButtonMe();
		this.jButtonCopiarClienteRetencion = new JButtonMe();
		this.jButtonVerFormClienteRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesClienteRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaClienteRetencion = new JButtonMe();
		this.jButtonCerrarClienteRetencion = new JButtonMe();
		
		this.jScrollPanelDatosClienteRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralClienteRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Retencion";
		
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteRetencion.setToolTipText("Acciones");
        this.jPanelAccionesClienteRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoClienteRetencion=new ReporteDinamicoJInternalFrame(ClienteRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoClienteRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionClienteRetencion=new ImportacionJInternalFrame(ClienteRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionClienteRetencion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByClienteRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByClienteRetencion.setText("Orden");
		this.jButtonAbrirOrderByClienteRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteRetencion,false,this);
			
			//this.cargarOrderByClienteRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteRetencion,true,this);
			
			//this.cargarOrderByClienteRetencion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosClienteRetencion.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosClienteRetencion.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosClienteRetencion.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosClienteRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoClienteRetencion.setText("Nuevo");
		this.jButtonDuplicarClienteRetencion.setText("Duplicar");
		this.jButtonCopiarClienteRetencion.setText("Copiar");
		this.jButtonVerFormClienteRetencion.setText("Ver");
		this.jButtonNuevoRelacionesClienteRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaClienteRetencion.setText("Guardar");
		this.jButtonCerrarClienteRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteRetencion,"nuevo_button","Nuevo",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarClienteRetencion,"duplicar_button","Duplicar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarClienteRetencion,"copiar_button","Copiar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormClienteRetencion,"ver_form","Ver",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesClienteRetencion,"nuevorelaciones_button","Nuevo Rel",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteRetencion,"guardarcambiostabla_button","Guardar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteRetencion,"cerrar_button","Salir",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoClienteRetencion.setToolTipText("Nuevo"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarClienteRetencion.setToolTipText("Duplicar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarClienteRetencion.setToolTipText("Copiar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormClienteRetencion.setToolTipText("Ver"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesClienteRetencion.setToolTipText("Nuevo Rel"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaClienteRetencion.setToolTipText("Guardar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteRetencion.setToolTipText("Salir"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClienteRetencion";
		inputMap = this.jButtonNuevoClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarClienteRetencion";
		inputMap = this.jButtonDuplicarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarClienteRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarClienteRetencion"));
		
		//COPIAR
		sMapKey = "CopiarClienteRetencion";
		inputMap = this.jButtonCopiarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarClienteRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarClienteRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormClienteRetencion";
		inputMap = this.jButtonVerFormClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormClienteRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormClienteRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesClienteRetencion";
		inputMap = this.jButtonNuevoRelacionesClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesClienteRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarClienteRetencion";
		inputMap = this.jButtonModificarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarClienteRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarClienteRetencion";
		inputMap = this.jButtonCerrarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteRetencion";
		inputMap = this.jButtonGuardarCambiosTablaClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ClienteRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ClienteRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ClienteRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ClienteRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ClienteRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesClienteRetencion.setName("jPanelParametrosReportesClienteRetencion"); 
		
		this.jPanelParametrosReportesAccionesClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesClienteRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesClienteRetencion.setName("jPanelParametrosReportesAccionesClienteRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionClienteRetencion = new JButtonMe();
		this.jButtonRecargarInformacionClienteRetencion.setText("Recargar");
		this.jButtonRecargarInformacionClienteRetencion.setToolTipText("Recargar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionClienteRetencion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionClienteRetencion = new JButtonMe();
		this.jButtonProcesarInformacionClienteRetencion.setText("Procesar");
		this.jButtonProcesarInformacionClienteRetencion.setToolTipText("Procesar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionClienteRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionClienteRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteRetencion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesClienteRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesClienteRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesClienteRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionClienteRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionClienteRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesClienteRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesClienteRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteRetencion.setText("Accion");
		this.jComboBoxTiposAccionesClienteRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarClienteRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarClienteRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralClienteRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralClienteRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesClienteRetencion = new JLabelMe();
		
		this.jLabelAccionesClienteRetencion.setText("Acciones");		
		this.jLabelAccionesClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosClienteRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosClienteRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosClienteRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosClienteRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosClienteRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosClienteRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaClienteRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaClienteRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaClienteRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteClienteRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteClienteRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteClienteRetencion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresClienteRetencion = new JButtonMe();
		//this.jButtonAnterioresClienteRetencion.setText("<<");
        this.jButtonAnterioresClienteRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresClienteRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesClienteRetencion = new JButtonMe();
		//this.jButtonSiguientesClienteRetencion.setText(">>");
        this.jButtonSiguientesClienteRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesClienteRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosClienteRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosClienteRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosClienteRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosClienteRetencion,"nuevoguardarcambios_button","Nue",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosClienteRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosClienteRetencion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionClienteRetencion";
		inputMap = this.jButtonRecargarInformacionClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionClienteRetencion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesClienteRetencion";
		inputMap = this.jButtonSiguientesClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesClienteRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresClienteRetencion";
		inputMap = this.jButtonAnterioresClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresClienteRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasClienteRetencion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesClienteRetencion.setMinimumSize(new Dimension(this.getWidth(),ClienteRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteRetencion.setMaximumSize(new Dimension(this.getWidth(),ClienteRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteRetencion.setPreferredSize(new Dimension(this.getWidth(),ClienteRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionClienteRetencion = new GridBagLayout();

			this.jPanelPaginacionClienteRetencion.setLayout(gridaBagLayoutPaginacionClienteRetencion);						
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = 0;
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionClienteRetencion.add(this.jButtonAnterioresClienteRetencion, this.gridBagConstraintsClienteRetencion);
					
						
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteRetencion.gridy = 0;
			
			this.jPanelPaginacionClienteRetencion.add(this.jButtonNuevoGuardarCambiosClienteRetencion, this.gridBagConstraintsClienteRetencion);
						
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteRetencion.gridy = 0;
			this.jPanelPaginacionClienteRetencion.add(this.jButtonSiguientesClienteRetencion, this.gridBagConstraintsClienteRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = 1;
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteRetencion.add(this.jButtonNuevoClienteRetencion, this.gridBagConstraintsClienteRetencion);
						
			
			
			if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
				this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsClienteRetencion.gridy = 1;
				this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionClienteRetencion.add(this.jButtonGuardarCambiosTablaClienteRetencion, this.gridBagConstraintsClienteRetencion);
			}
			
			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = 1;
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteRetencion.add(this.jButtonDuplicarClienteRetencion, this.gridBagConstraintsClienteRetencion);
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = 1;
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteRetencion.add(this.jButtonCopiarClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = 1;
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteRetencion.add(this.jButtonVerFormClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = 1;
			this.gridBagConstraintsClienteRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionClienteRetencion.add(this.jButtonCerrarClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		
		this.jButtonRecargarInformacionClienteRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesClienteRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesClienteRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesClienteRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionClienteRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesClienteRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesClienteRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarClienteRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaClienteRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteClienteRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosClienteRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosClienteRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesClienteRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesClienteRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ClienteRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ClienteRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ClienteRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ClienteRetencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesClienteRetencion.setLayout(gridaBagParametrosReportesClienteRetencion);
			this.jPanelParametrosReportesAccionesClienteRetencion.setLayout(gridaBagParametrosReportesAccionesClienteRetencion);
			
			
			this.jPanelParametrosAuxiliar1ClienteRetencion.setLayout(gridaBagParametrosAuxiliar1ClienteRetencion);
			this.jPanelParametrosAuxiliar2ClienteRetencion.setLayout(gridaBagParametrosAuxiliar2ClienteRetencion);
			this.jPanelParametrosAuxiliar3ClienteRetencion.setLayout(gridaBagParametrosAuxiliar3ClienteRetencion);
			this.jPanelParametrosAuxiliar4ClienteRetencion.setLayout(gridaBagParametrosAuxiliar4ClienteRetencion);
			//this.jPanelParametrosAuxiliar5ClienteRetencion.setLayout(gridaBagParametrosAuxiliar2ClienteRetencion);			
			
			
			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteRetencion.add(this.jButtonRecargarInformacionClienteRetencion, this.gridBagConstraintsClienteRetencion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteRetencion.add(this.jComboBoxTiposPaginacionClienteRetencion, this.gridBagConstraintsClienteRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteRetencion.add(this.jCheckBoxConAltoMaximoTablaClienteRetencion, this.gridBagConstraintsClienteRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteRetencion.add(this.jComboBoxTiposArchivosReportesClienteRetencion, this.gridBagConstraintsClienteRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteRetencion.add(this.jPanelParametrosAuxiliar1ClienteRetencion, this.gridBagConstraintsClienteRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ClienteRetencion.add(this.jComboBoxTiposReportesClienteRetencion, this.gridBagConstraintsClienteRetencion);																		
			
			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ClienteRetencion.add(this.jComboBoxTiposGraficosReportesClienteRetencion, this.gridBagConstraintsClienteRetencion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteRetencion.add(this.jPanelParametrosAuxiliar4ClienteRetencion, this.gridBagConstraintsClienteRetencion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteRetencion.add(this.jComboBoxTiposReportesClienteRetencion, this.gridBagConstraintsClienteRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteRetencion.add(this.jCheckBoxGenerarReporteClienteRetencion, this.gridBagConstraintsClienteRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteRetencion.add(this.jPanelParametrosAuxiliar2ClienteRetencion, this.gridBagConstraintsClienteRetencion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteRetencion.add(this.jLabelAccionesClienteRetencion, this.gridBagConstraintsClienteRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
				this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesClienteRetencion.add(this.jButtonAbrirOrderByClienteRetencion, this.gridBagConstraintsClienteRetencion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteRetencion.add(this.jComboBoxTiposSeleccionarClienteRetencion, this.gridBagConstraintsClienteRetencion);			
			
			
			/*
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteRetencion.add(this.jCheckBoxSeleccionarTodosClienteRetencion, this.gridBagConstraintsClienteRetencion);
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteRetencion.add(this.jCheckBoxConGraficoReporteClienteRetencion, this.gridBagConstraintsClienteRetencion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteRetencion.add(this.jCheckBoxSeleccionarTodosClienteRetencion, this.gridBagConstraintsClienteRetencion);															
				
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteRetencion.add(this.jCheckBoxSeleccionadosClienteRetencion, this.gridBagConstraintsClienteRetencion);															
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteRetencion.add(this.jCheckBoxConGraficoReporteClienteRetencion, this.gridBagConstraintsClienteRetencion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteRetencion.add(this.jPanelParametrosAuxiliar3ClienteRetencion, this.gridBagConstraintsClienteRetencion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteRetencion.add(this.jComboBoxTiposAccionesClienteRetencion, this.gridBagConstraintsClienteRetencion);
	
				
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteRetencion.add(this.jTextFieldValorCampoGeneralClienteRetencion, this.gridBagConstraintsClienteRetencion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosClienteRetencion = new GridBagLayout();

			this.jScrollPanelDatosClienteRetencion.setLayout(gridaBagLayoutDatosClienteRetencion);
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = 0;
			this.gridBagConstraintsClienteRetencion.gridx = 0;
			
			this.jScrollPanelDatosClienteRetencion.add(this.jTableDatosClienteRetencion, this.gridBagConstraintsClienteRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosClienteRetencion.setViewportView(this.jTableDatosClienteRetencion);
		this.jTableDatosClienteRetencion.setFillsViewportHeight(true);
		this.jTableDatosClienteRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesClienteRetencion= new GridBagLayout();
		this.jPanelAccionesClienteRetencion.setLayout(gridaBagLayoutAccionesClienteRetencion);
		
		
		/*	
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 0;
			
		this.jPanelAccionesClienteRetencion.add(this.jButtonNuevoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableClienteRetencion.setLayout(gridaBagLayoutFK_IdAsientoContableClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdAsientoContableClienteRetencion.add(jLabelid_asiento_contableFK_IdAsientoContableClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 1;
		jPanelFK_IdAsientoContableClienteRetencion.add(jComboBoxid_asiento_contableFK_IdAsientoContableClienteRetencion, gridBagConstraintsClienteRetencion);


		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdAsientoContableClienteRetencion.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 1;
		gridBagConstraintsClienteRetencion.gridx =1;
		jPanelFK_IdAsientoContableClienteRetencion.add(jButtonFK_IdAsientoContableClienteRetencion, gridBagConstraintsClienteRetencion);

		jTabbedPaneBusquedasClienteRetencion.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableClienteRetencion);
		jTabbedPaneBusquedasClienteRetencion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdClienteClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteClienteRetencion.setLayout(gridaBagLayoutFK_IdClienteClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdClienteClienteRetencion.add(jLabelid_clienteFK_IdClienteClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 1;
		jPanelFK_IdClienteClienteRetencion.add(jComboBoxid_clienteFK_IdClienteClienteRetencion, gridBagConstraintsClienteRetencion);


		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdClienteClienteRetencion.add(this.jButtonBuscarFK_IdClienteid_clienteClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 1;
		gridBagConstraintsClienteRetencion.gridx =1;
		jPanelFK_IdClienteClienteRetencion.add(jButtonFK_IdClienteClienteRetencion, gridBagConstraintsClienteRetencion);

		jTabbedPaneBusquedasClienteRetencion.addTab("2.-Por Cliente ", jPanelFK_IdClienteClienteRetencion);
		jTabbedPaneBusquedasClienteRetencion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableClienteRetencionClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableClienteRetencionClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableClienteRetencionClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableClienteRetencionClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableClienteRetencionClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableClienteRetencionClienteRetencion.setLayout(gridaBagLayoutFK_IdCuentaContableClienteRetencionClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdCuentaContableClienteRetencionClienteRetencion.add(jLabelid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 1;
		jPanelFK_IdCuentaContableClienteRetencionClienteRetencion.add(jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableClienteRetencionClienteRetencion, gridBagConstraintsClienteRetencion);


		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdCuentaContableClienteRetencionClienteRetencion.add(this.jButtonBuscarFK_IdCuentaContableClienteRetencionid_cuenta_contable_retencionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 1;
		gridBagConstraintsClienteRetencion.gridx =1;
		jPanelFK_IdCuentaContableClienteRetencionClienteRetencion.add(jButtonFK_IdCuentaContableClienteRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		jTabbedPaneBusquedasClienteRetencion.addTab("3.-Por Cuenta Retencion ", jPanelFK_IdCuentaContableClienteRetencionClienteRetencion);
		jTabbedPaneBusquedasClienteRetencion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoRetencionClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoRetencionClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoRetencionClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoRetencionClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoRetencionClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoRetencionClienteRetencion.setLayout(gridaBagLayoutFK_IdEstadoRetencionClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdEstadoRetencionClienteRetencion.add(jLabelid_estado_retencionFK_IdEstadoRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 1;
		jPanelFK_IdEstadoRetencionClienteRetencion.add(jComboBoxid_estado_retencionFK_IdEstadoRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 1;
		gridBagConstraintsClienteRetencion.gridx =1;
		jPanelFK_IdEstadoRetencionClienteRetencion.add(jButtonFK_IdEstadoRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		jTabbedPaneBusquedasClienteRetencion.addTab("4.-Por Estado Retencion ", jPanelFK_IdEstadoRetencionClienteRetencion);
		jTabbedPaneBusquedasClienteRetencion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFacturaClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaClienteRetencion.setLayout(gridaBagLayoutFK_IdFacturaClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdFacturaClienteRetencion.add(jLabelid_facturaFK_IdFacturaClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 1;
		jPanelFK_IdFacturaClienteRetencion.add(jComboBoxid_facturaFK_IdFacturaClienteRetencion, gridBagConstraintsClienteRetencion);


		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdFacturaClienteRetencion.add(this.jButtonBuscarFK_IdFacturaid_facturaClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 1;
		gridBagConstraintsClienteRetencion.gridx =1;
		jPanelFK_IdFacturaClienteRetencion.add(jButtonFK_IdFacturaClienteRetencion, gridBagConstraintsClienteRetencion);

		jTabbedPaneBusquedasClienteRetencion.addTab("5.-Por Factura ", jPanelFK_IdFacturaClienteRetencion);
		jTabbedPaneBusquedasClienteRetencion.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionClienteRetencion.setLayout(gridaBagLayoutFK_IdTipoRetencionClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdTipoRetencionClienteRetencion.add(jLabelid_tipo_retencionFK_IdTipoRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 1;
		jPanelFK_IdTipoRetencionClienteRetencion.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 1;
		gridBagConstraintsClienteRetencion.gridx =1;
		jPanelFK_IdTipoRetencionClienteRetencion.add(jButtonFK_IdTipoRetencionClienteRetencion, gridBagConstraintsClienteRetencion);

		jTabbedPaneBusquedasClienteRetencion.addTab("6.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionClienteRetencion);
		jTabbedPaneBusquedasClienteRetencion.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTransaccionClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionClienteRetencion.setLayout(gridaBagLayoutFK_IdTransaccionClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 0;
		jPanelFK_IdTransaccionClienteRetencion.add(jLabelid_transaccionFK_IdTransaccionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 0;
		gridBagConstraintsClienteRetencion.gridx = 1;
		jPanelFK_IdTransaccionClienteRetencion.add(jComboBoxid_transaccionFK_IdTransaccionClienteRetencion, gridBagConstraintsClienteRetencion);

		gridBagConstraintsClienteRetencion = new GridBagConstraints();
		gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteRetencion.gridy = 1;
		gridBagConstraintsClienteRetencion.gridx =1;
		jPanelFK_IdTransaccionClienteRetencion.add(jButtonFK_IdTransaccionClienteRetencion, gridBagConstraintsClienteRetencion);

		jTabbedPaneBusquedasClienteRetencion.addTab("7.-Por Tipo ", jPanelFK_IdTransaccionClienteRetencion);
		jTabbedPaneBusquedasClienteRetencion.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clienteretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();						
			this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteRetencion.gridx = 0;		
			//this.gridBagConstraintsClienteRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarClienteRetencion, this.gridBagConstraintsClienteRetencion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsClienteRetencion.gridx = 0;		
		//this.gridBagConstraintsClienteRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsClienteRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsClienteRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteRetencion.gridx = 0;		
			this.gridBagConstraintsClienteRetencion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsClienteRetencion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasClienteRetencion, this.gridBagConstraintsClienteRetencion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesClienteRetencion, this.gridBagConstraintsClienteRetencion);								
		
		
		/*
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesClienteRetencion, this.gridBagConstraintsClienteRetencion);
		*/		
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteRetencion.gridx =0;
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteRetencion, this.gridBagConstraintsClienteRetencion);
				
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionClienteRetencion, this.gridBagConstraintsClienteRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ClienteRetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosClienteRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosClienteRetencion.setLayout(gridaBagLayoutBusquedasParametrosClienteRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralClienteRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteRetencion, this.gridBagConstraintsClienteRetencion);
			
			
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
			
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteRetencion, this.gridBagConstraintsClienteRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralClienteRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoClienteRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoClienteRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoClienteRetencion.setName("jPanelReporteDinamicoClienteRetencion"); 
		
		this.jPanelReporteDinamicoClienteRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoClienteRetencion.setLayout(gridaBagLayoutReporteDinamicoClienteRetencion);
		
		
		this.jInternalFrameReporteDinamicoClienteRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoClienteRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoClienteRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoClienteRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoClienteRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoClienteRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoClienteRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoClienteRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoClienteRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoClienteRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoClienteRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteClienteRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteClienteRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelColumnasSelectReporteClienteRetencion, this.gridBagConstraintsClienteRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteClienteRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteClienteRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteClienteRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteClienteRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteClienteRetencion=new JScrollPane(this.jListColumnasSelectReporteClienteRetencion);
			
			this.jScrollColumnasSelectReporteClienteRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoClienteRetencion.add(this.jListColumnasSelectReporteClienteRetencion, this.gridBagConstraintsClienteRetencion);
		this.jPanelReporteDinamicoClienteRetencion.add(this.jScrollColumnasSelectReporteClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteClienteRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteClienteRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteClienteRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteClienteRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteClienteRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteClienteRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteClienteRetencion=new JScrollPane(this.jListRelacionesSelectReporteClienteRetencion);
			
			this.jScrollRelacionesSelectReporteClienteRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoClienteRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoClienteRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoClienteRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoClienteRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoClienteRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoClienteRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoClienteRetencion = new JLabelMe();

		this.jLabelConGraficoDinamicoClienteRetencion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelConGraficoDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoClienteRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoClienteRetencion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoClienteRetencion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoClienteRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoClienteRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoClienteRetencion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteRetencion.add(this.jCheckBoxConGraficoDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoClienteRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoClienteRetencion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelColumnaCategoriaGraficoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoClienteRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoClienteRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoClienteRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoClienteRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoClienteRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoClienteRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoClienteRetencion.add(this.jComboBoxColumnaCategoriaGraficoClienteRetencion, this.gridBagConstraintsClienteRetencion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorClienteRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaValorClienteRetencion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelColumnaCategoriaValorClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorClienteRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorClienteRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorClienteRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorClienteRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorClienteRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorClienteRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoClienteRetencion.add(this.jComboBoxColumnaCategoriaValorClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoClienteRetencion = new JLabelMe();

		this.jLabelColumnasValoresGraficoClienteRetencion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelColumnasValoresGraficoClienteRetencion, this.gridBagConstraintsClienteRetencion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoClienteRetencion = new JList<Reporte>();
		this.jListColumnasValoresGraficoClienteRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoClienteRetencion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoClienteRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoClienteRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoClienteRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoClienteRetencion=new JScrollPane(this.jListColumnasValoresGraficoClienteRetencion);
			
			this.jScrollColumnasValoresGraficoClienteRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoClienteRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoClienteRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoClienteRetencion.add(this.jListColumnasSelectReporteClienteRetencion, this.gridBagConstraintsClienteRetencion);
		this.jPanelReporteDinamicoClienteRetencion.add(this.jScrollColumnasValoresGraficoClienteRetencion, this.gridBagConstraintsClienteRetencion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoClienteRetencion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoClienteRetencion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelTiposGraficosReportesDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoClienteRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoClienteRetencion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoClienteRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoClienteRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoClienteRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoClienteRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteRetencion.add(this.jComboBoxTiposGraficosReportesDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoClienteRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoClienteRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelGenerarExcelReporteDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoClienteRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoClienteRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoClienteRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoClienteRetencion.setToolTipText("Generar EXCEL"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoClienteRetencion.add(this.jButtonGenerarExcelReporteDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteRetencion.add(this.jComboBoxTiposReportesDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoClienteRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoClienteRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteRetencion.add(this.jLabelTiposArchivoReporteDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoClienteRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoClienteRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoClienteRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoClienteRetencion.setToolTipText("Generar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteRetencion.add(this.jButtonGenerarReporteDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoClienteRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoClienteRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoClienteRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoClienteRetencion.setToolTipText("Cancelar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteRetencion.add(this.jButtonCerrarReporteDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalClienteRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoClienteRetencion= new JScrollPane(jPanelReporteDinamicoClienteRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoClienteRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsClienteRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoClienteRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoClienteRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalClienteRetencion);
		this.jInternalFrameReporteDinamicoClienteRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoClienteRetencion, this.gridBagConstraintsClienteRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionClienteRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionClienteRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionClienteRetencion.setName("jPanelImportacionClienteRetencion"); 
		
		this.jPanelImportacionClienteRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionClienteRetencion.setLayout(gridaBagLayoutImportacionClienteRetencion);
		
		
		this.jInternalFrameImportacionClienteRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionClienteRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionClienteRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionClienteRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionClienteRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteRetencion.setResizable(true);
	    this.jInternalFrameImportacionClienteRetencion.setClosable(true);
	    this.jInternalFrameImportacionClienteRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionClienteRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionClienteRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteRetencion.setResizable(true);
	    this.jInternalFrameImportacionClienteRetencion.setClosable(true);
	    this.jInternalFrameImportacionClienteRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionClienteRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionClienteRetencion = new JLabelMe();

		this.jLabelArchivoImportacionClienteRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteRetencion.add(this.jLabelArchivoImportacionClienteRetencion, this.gridBagConstraintsClienteRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionClienteRetencion = new JFileChooser();		
		this.jFileChooserImportacionClienteRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionClienteRetencion = new JButtonMe();
		this.jButtonAbrirImportacionClienteRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionClienteRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionClienteRetencion.setToolTipText("Generar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteRetencion.add(this.jButtonAbrirImportacionClienteRetencion, this.gridBagConstraintsClienteRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionClienteRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionClienteRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteRetencion.add(this.jLabelPathArchivoImportacionClienteRetencion, this.gridBagConstraintsClienteRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionClienteRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionClienteRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteRetencion.add(this.jTextFieldPathArchivoImportacionClienteRetencion, this.gridBagConstraintsClienteRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionClienteRetencion = new JButtonMe();
		this.jButtonGenerarImportacionClienteRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionClienteRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionClienteRetencion.setToolTipText("Generar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteRetencion.add(this.jButtonGenerarImportacionClienteRetencion, this.gridBagConstraintsClienteRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionClienteRetencion = new JButtonMe();
		this.jButtonCerrarImportacionClienteRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionClienteRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionClienteRetencion.setToolTipText("Cancelar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteRetencion.add(this.jButtonCerrarImportacionClienteRetencion, this.gridBagConstraintsClienteRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalClienteRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionClienteRetencion= new JScrollPane(jPanelImportacionClienteRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsClienteRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionClienteRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionClienteRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalClienteRetencion);
		this.jInternalFrameImportacionClienteRetencion.getContentPane().add(this.jScrollPanelImportacionClienteRetencion, this.gridBagConstraintsClienteRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByClienteRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByClienteRetencion = new JButtonMe();
			this.jButtonAbrirOrderByClienteRetencion.setText("Orden");
			this.jButtonAbrirOrderByClienteRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByClienteRetencion";
			inputMap = this.jButtonAbrirOrderByClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByClienteRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByClienteRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByClienteRetencion.setName("jPanelOrderByClienteRetencion"); 
			
			this.jPanelOrderByClienteRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByClienteRetencion.setLayout(gridaBagLayoutOrderByClienteRetencion);
			
			
			this.jTableDatosClienteRetencionOrderBy = new JTableMe();        
			this.jTableDatosClienteRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosClienteRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosClienteRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosClienteRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosClienteRetencionOrderBy.setViewportView(this.jTableDatosClienteRetencionOrderBy);
			this.jTableDatosClienteRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosClienteRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByClienteRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByClienteRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByClienteRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteClienteRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByClienteRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByClienteRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByClienteRetencion.setTitle("Orden");
			this.jInternalFrameOrderByClienteRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByClienteRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByClienteRetencion.setResizable(true);
			this.jInternalFrameOrderByClienteRetencion.setClosable(true);
			this.jInternalFrameOrderByClienteRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByClienteRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsClienteRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsClienteRetencion.ipady =150;
				
			this.jPanelOrderByClienteRetencion.add(jScrollPanelDatosClienteRetencionOrderBy, this.gridBagConstraintsClienteRetencion);//this.jTableDatosClienteRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByClienteRetencion = new JButtonMe();
			this.jButtonCerrarOrderByClienteRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByClienteRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByClienteRetencion.setToolTipText("Cancelar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsClienteRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByClienteRetencion.add(this.jButtonCerrarOrderByClienteRetencion, this.gridBagConstraintsClienteRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalClienteRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByClienteRetencion= new JScrollPane(jPanelOrderByClienteRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsClienteRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByClienteRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByClienteRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalClienteRetencion);
			
			this.jInternalFrameOrderByClienteRetencion.getContentPane().add(this.jScrollPanelOrderByClienteRetencion, this.gridBagConstraintsClienteRetencion);			
		
		} else {
			this.jButtonAbrirOrderByClienteRetencion = new JButtonMe();
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
		int iWidthTableCalculado=0;//4230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.clienteretencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosClienteRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosClienteRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosClienteRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosClienteRetencion.getRowHeight();//ClienteRetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteRetencion.isSelected()) {
					iHeightTable=ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteRetencion.isSelected()) {
					iHeightTable=ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosClienteRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosClienteRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByClienteRetencion!=null && this.jInternalFrameOrderByClienteRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByClienteRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByClienteRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByClienteRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByClienteRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByClienteRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByClienteRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByClienteRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosClienteRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=clienteretencionLogic.getClienteRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clienteretencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ClienteRetencion> TraerClienteRetencionBeans(List<ClienteRetencion> clienteretencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(ClienteRetencion clienteretencion:clienteretencions) {
					
				if(!(ClienteRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ClienteRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					clienteretencion.setsDetalleGeneralEntityReporte(ClienteRetencionConstantesFunciones.getClienteRetencionDescripcion(clienteretencion));
										
						
					
						
					
				} else  {
							
					//clienteretencion.setsDetalleGeneralEntityReporte(clienteretencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//clienteretencionbeans.add(clienteretencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return clienteretencions;
    }
	//PARA REPORTES FIN
}
