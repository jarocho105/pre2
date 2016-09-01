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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.contabilidad.util.FacturaProveedorServicioConstantesFunciones;

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
public class FacturaProveedorServicioJInternalFrame extends FacturaProveedorServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturaProveedorServicio;
	
	protected JMenuBar jmenuBarFacturaProveedorServicio;
	
	protected JMenu jmenuFacturaProveedorServicio;
	protected JMenu jmenuDatosFacturaProveedorServicio;
	protected JMenu jmenuArchivoFacturaProveedorServicio;
	protected JMenu jmenuAccionesFacturaProveedorServicio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaProveedorServicio;	
	protected GridBagConstraints gridBagConstraintsFacturaProveedorServicio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturaProveedorServicioDetalleFormJInternalFrame jInternalFrameDetalleFormFacturaProveedorServicio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturaProveedorServicio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturaProveedorServicio;	
	
	
	
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

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected EmpleadoBeanSwingJInternalFrame empleadosolicitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosolicita="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuente1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuente1="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencioniva1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva1="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalserviciosBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscalservicios="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public FacturaProveedorServicioSessionBean facturaproveedorservicioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public EmpleadoSessionBean empleadosolicitaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoRetencionSessionBean tiporetencionfuente1SessionBean;
	public TipoRetencionSessionBean tiporetencioniva1SessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalserviciosSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturaProveedorServicio> facturaproveedorservicios;		
	public List<FacturaProveedorServicio> facturaproveedorserviciosEliminados;	
	public List<FacturaProveedorServicio> facturaproveedorserviciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturaProveedorServicio;		
	protected JButton jButtonAbrirOrderByFacturaProveedorServicio;
	
	
	//protected JPanel jPanelOrderByFacturaProveedorServicio;
	//public JScrollPane jScrollPanelOrderByFacturaProveedorServicio;	
	//protected JButton jButtonCerrarOrderByFacturaProveedorServicio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturaProveedorServicioLogic facturaproveedorservicioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturaProveedorServicio;
	public JScrollPane jScrollPanelDatosEdicionFacturaProveedorServicio;
	public JScrollPane jScrollPanelDatosGeneralFacturaProveedorServicio;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturaProveedorServicioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturaProveedorServicio;
	//public JScrollPane jScrollPanelImportacionFacturaProveedorServicio;
	
	
	
	protected JPanel jPanelAccionesFacturaProveedorServicio;
	
    protected JPanel jPanelPaginacionFacturaProveedorServicio;
    protected JPanel jPanelParametrosReportesFacturaProveedorServicio;
	protected JPanel jPanelParametrosReportesAccionesFacturaProveedorServicio;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralFacturaProveedorServicio;
	protected Integer iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
	protected Integer iYPanelCamposIniciogeneralFacturaProveedorServicio=0;

	protected JPanel jPanelCamposIniciodatos_retencionFacturaProveedorServicio;
	protected Integer iXPanelCamposIniciodatos_retencionFacturaProveedorServicio=0;
	protected Integer iYPanelCamposIniciodatos_retencionFacturaProveedorServicio=0;

	protected JPanel jPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	protected Integer iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
	protected Integer iYPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturaProveedorServicio;
	protected JPanel jPanelParametrosAuxiliar2FacturaProveedorServicio;
	protected JPanel jPanelParametrosAuxiliar3FacturaProveedorServicio;
	protected JPanel jPanelParametrosAuxiliar4FacturaProveedorServicio;
	//protected JPanel jPanelParametrosAuxiliar5FacturaProveedorServicio;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturaProveedorServicio;
	//protected JPanel jPanelImportacionFacturaProveedorServicio;
	
	
	public JTable jTableDatosFacturaProveedorServicio;
	
	
	
	//public JTable jTableDatosFacturaProveedorServicioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturaProveedorServicio;
	protected JButton jButtonDuplicarFacturaProveedorServicio;
	protected JButton jButtonCopiarFacturaProveedorServicio;
	protected JButton jButtonVerFormFacturaProveedorServicio;
	protected JButton jButtonNuevoRelacionesFacturaProveedorServicio;
	protected JButton jButtonModificarFacturaProveedorServicio;
	
    protected JButton jButtonGuardarCambiosTablaFacturaProveedorServicio;
	protected JButton jButtonCerrarFacturaProveedorServicio;
	
	
	protected JButton jButtonRecargarInformacionFacturaProveedorServicio;
	protected JButton jButtonProcesarInformacionFacturaProveedorServicio;
	
	
	protected JButton jButtonAnterioresFacturaProveedorServicio;
	protected JButton jButtonSiguientesFacturaProveedorServicio;
	protected JButton jButtonNuevoGuardarCambiosFacturaProveedorServicio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturaProveedorServicio;
	//protected JButton jButtonCerrarReporteDinamicoFacturaProveedorServicio;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturaProveedorServicio;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturaProveedorServicio;
	//protected JButton jButtonGenerarImportacionFacturaProveedorServicio;
	//protected JButton jButtonCerrarImportacionFacturaProveedorServicio;
	//protected JFileChooser jFileChooserImportacionFacturaProveedorServicio;
	//protected File fileImportacionFacturaProveedorServicio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaProveedorServicio;
	protected JButton jButtonDuplicarToolBarFacturaProveedorServicio;
	protected JButton jButtonNuevoRelacionesToolBarFacturaProveedorServicio;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturaProveedorServicio;
	protected JButton jButtonCopiarToolBarFacturaProveedorServicio;
	protected JButton jButtonVerFormToolBarFacturaProveedorServicio;
	public JButton jButtonGuardarCambiosTablaToolBarFacturaProveedorServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaProveedorServicio;
	protected JButton jButtonCerrarToolBarFacturaProveedorServicio;
	
	protected JButton jButtonRecargarInformacionToolBarFacturaProveedorServicio;
	protected JButton jButtonProcesarInformacionToolBarFacturaProveedorServicio;
	protected JButton jButtonAnterioresToolBarFacturaProveedorServicio;
	protected JButton jButtonSiguientesToolBarFacturaProveedorServicio;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturaProveedorServicio;
	protected JButton jButtonAbrirOrderByToolBarFacturaProveedorServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaProveedorServicio;
	protected JMenuItem jMenuItemDuplicarFacturaProveedorServicio;
	protected JMenuItem jMenuItemNuevoRelacionesFacturaProveedorServicio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturaProveedorServicio;
	protected JMenuItem jMenuItemCopiarFacturaProveedorServicio;
	protected JMenuItem jMenuItemVerFormFacturaProveedorServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaProveedorServicio;
	protected JMenuItem jMenuItemCerrarFacturaProveedorServicio;
	protected JMenuItem jMenuItemDetalleCerrarFacturaProveedorServicio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturaProveedorServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaProveedorServicio;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturaProveedorServicio;
	protected JMenuItem jMenuItemProcesarInformacionFacturaProveedorServicio;
	protected JMenuItem jMenuItemAnterioresFacturaProveedorServicio;
	protected JMenuItem jMenuItemSiguientesFacturaProveedorServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaProveedorServicio;
	protected JMenuItem jMenuItemAbrirOrderByFacturaProveedorServicio;
	protected JMenuItem jMenuItemMostrarOcultarFacturaProveedorServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaProveedorServicio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturaProveedorServicio;
	protected JCheckBox jCheckBoxSeleccionadosFacturaProveedorServicio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturaProveedorServicio;
	protected JCheckBox jCheckBoxConGraficoReporteFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturaProveedorServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturaProveedorServicio;
	protected JTextField jTextFieldValorCampoGeneralFacturaProveedorServicio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturaProveedorServicio;
	//public JList<Reporte> jListColumnasSelectReporteFacturaProveedorServicio;
	//public JScrollPane jScrollColumnasSelectReporteFacturaProveedorServicio;
	
	//public JLabel jLabelRelacionesSelectReporteFacturaProveedorServicio;
	//public JList<Reporte> jListRelacionesSelectReporteFacturaProveedorServicio;
	//public JScrollPane jScrollRelacionesSelectReporteFacturaProveedorServicio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturaProveedorServicio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturaProveedorServicio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturaProveedorServicio;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturaProveedorServicio;
	
		
	//public JLabel jLabelArchivoImportacionFacturaProveedorServicio;	
	//public JLabel jLabelPathArchivoImportacionFacturaProveedorServicio;
	//protected JTextField jTextFieldPathArchivoImportacionFacturaProveedorServicio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturaProveedorServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio;
	
	//public JLabel jLabelColumnaCategoriaValorFacturaProveedorServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturaProveedorServicio;
	
	//public JLabel jLabelColumnasValoresGraficoFacturaProveedorServicio;
	//public JList<Reporte> jListColumnasValoresGraficoFacturaProveedorServicio;
	//public JScrollPane jScrollColumnasValoresGraficoFacturaProveedorServicio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturaProveedorServicio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturaProveedorServicio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturaProveedorServicio;
	public JPanel jPanelFK_IdClienteFacturaProveedorServicio;
	public JButton jButtonFK_IdClienteFacturaProveedorServicio;
	public JPanel jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio;
	public JButton jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio;
	public JPanel jPanelFK_IdEmpleadoFacturaProveedorServicio;
	public JButton jButtonFK_IdEmpleadoFacturaProveedorServicio;
	public JPanel jPanelFK_IdTipoDocumentoFacturaProveedorServicio;
	public JButton jButtonFK_IdTipoDocumentoFacturaProveedorServicio;
	public JPanel jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio;
	public JButton jButtonFK_IdTipoMovimientoModuloFacturaProveedorServicio;
	public JPanel jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio;
	public JButton jButtonFK_IdTipoRetencionFuente1FacturaProveedorServicio;
	public JPanel jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio;
	public JButton jButtonFK_IdTipoRetencionIva1FacturaProveedorServicio;
	public JPanel jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio;
	public JButton jButtonFK_IdTipoTransaccionModuloFacturaProveedorServicio;
	public JPanel jPanelFK_IdTipoTributarioFacturaProveedorServicio;
	public JButton jButtonFK_IdTipoTributarioFacturaProveedorServicio;
	public JPanel jPanelFK_IdTransaccionFacturaProveedorServicio;
	public JButton jButtonFK_IdTransaccionFacturaProveedorServicio;
	
	public JPanel jPanelid_clienteFK_IdClienteFacturaProveedorServicio;
	public JLabel jLabelid_clienteFK_IdClienteFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteFacturaProveedorServicio;
	public JButton jButtonid_clienteFK_IdClienteFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaProveedorServicioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio;
	
	public JPanel jPanelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio;
	public JLabel jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio;
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicioArbol= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoFacturaProveedorServicio;
	public JLabel jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedorServicio;
	public JButton jButtonid_empleadoFK_IdEmpleadoFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoFacturaProveedorServicioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio;
	
	public JPanel jPanelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio;
	public JLabel jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio;
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio;
	public JLabel jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio;
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio;
	public JLabel jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio;
	public JButton jButtonid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio;
	public JLabel jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio;
	public JButton jButtonid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio;
	public JLabel jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio;
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionFacturaProveedorServicio;
	public JLabel jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionFacturaProveedorServicio;
	public JButton jButtonid_transaccionFK_IdTransaccionFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionFacturaProveedorServicioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturaProveedorServicioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorServicioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorServicioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorServicioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturaProveedorServicio)	{
		this.jButtonRecargarInformacionFacturaProveedorServicio = jButtonRecargarInformacionFacturaProveedorServicio;
	}
	
	public JButton getjButtonProcesarInformacionFacturaProveedorServicio() {
		return this.jButtonProcesarInformacionFacturaProveedorServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaProveedorServicio)	{
		this.jButtonProcesarInformacionFacturaProveedorServicio = jButtonProcesarInformacionFacturaProveedorServicio;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturaProveedorServicio() {
		return this.jButtonRecargarInformacionFacturaProveedorServicio;
	}
	
	
	public List<FacturaProveedorServicio> getfacturaproveedorservicios() {
		return this.facturaproveedorservicios;
	}

	public void setfacturaproveedorservicios(List<FacturaProveedorServicio> facturaproveedorservicios) {
		this.facturaproveedorservicios = facturaproveedorservicios;
	}
	
	public List<FacturaProveedorServicio> getfacturaproveedorserviciosAux() {
		return this.facturaproveedorserviciosAux;
	}

	public void setfacturaproveedorserviciosAux(List<FacturaProveedorServicio> facturaproveedorserviciosAux) {
		this.facturaproveedorserviciosAux = facturaproveedorserviciosAux;
	}
	
	public List<FacturaProveedorServicio> getfacturaproveedorserviciosEliminados() {
		return this.facturaproveedorserviciosEliminados;
	}

	public void setFacturaProveedorServiciosEliminados(List<FacturaProveedorServicio> facturaproveedorserviciosEliminados) {
		this.facturaproveedorserviciosEliminados = facturaproveedorserviciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturaProveedorServicio() {
		return jComboBoxTiposSeleccionarFacturaProveedorServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturaProveedorServicio(
			JComboBox jComboBoxTiposSeleccionarFacturaProveedorServicio) {
		this.jComboBoxTiposSeleccionarFacturaProveedorServicio = jComboBoxTiposSeleccionarFacturaProveedorServicio;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturaProveedorServicio() {
		return jTextFieldValorCampoGeneralFacturaProveedorServicio;
	}

	public void setjTextFieldValorCampoGeneralFacturaProveedorServicio(
			JTextField jTextFieldValorCampoGeneralFacturaProveedorServicio) {
		this.jTextFieldValorCampoGeneralFacturaProveedorServicio = jTextFieldValorCampoGeneralFacturaProveedorServicio;
	}

	public void setBorderResaltarValorCampoGeneralFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturaProveedorServicio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturaProveedorServicio() {
		return this.jCheckBoxSeleccionarTodosFacturaProveedorServicio;
	}

	public void setjCheckBoxSeleccionarTodosFacturaProveedorServicio(
			JCheckBox jCheckBoxSeleccionarTodosFacturaProveedorServicio) {
		this.jCheckBoxSeleccionarTodosFacturaProveedorServicio = jCheckBoxSeleccionarTodosFacturaProveedorServicio;
	}

	public void setBorderResaltarSeleccionarTodosFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturaProveedorServicio() {
		return this.jCheckBoxSeleccionadosFacturaProveedorServicio;
	}

	public void setjCheckBoxSeleccionadosFacturaProveedorServicio(
			JCheckBox jCheckBoxSeleccionadosFacturaProveedorServicio) {
		this.jCheckBoxSeleccionadosFacturaProveedorServicio = jCheckBoxSeleccionadosFacturaProveedorServicio;
	}
	
	public void setBorderResaltarSeleccionadosFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturaProveedorServicio() {
		return this.jComboBoxTiposArchivosReportesFacturaProveedorServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturaProveedorServicio(
			JComboBox jComboBoxTiposArchivosReportesFacturaProveedorServicio) {
		this.jComboBoxTiposArchivosReportesFacturaProveedorServicio = jComboBoxTiposArchivosReportesFacturaProveedorServicio;
	}

	public void setBorderResaltarTiposArchivosReportesFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturaProveedorServicio() {
		return this.jComboBoxTiposReportesFacturaProveedorServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturaProveedorServicio(
			JComboBox jComboBoxTiposReportesFacturaProveedorServicio) {
		this.jComboBoxTiposReportesFacturaProveedorServicio = jComboBoxTiposReportesFacturaProveedorServicio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturaProveedorServicio() {
	//	return jComboBoxTiposReportesDinamicoFacturaProveedorServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturaProveedorServicio(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturaProveedorServicio) {
	//	this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio = jComboBoxTiposReportesDinamicoFacturaProveedorServicio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio = jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio;
	//}
	
	public void setBorderResaltarTiposReportesFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturaProveedorServicio() {
		return this.jComboBoxTiposGraficosReportesFacturaProveedorServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturaProveedorServicio(
			JComboBox jComboBoxTiposGraficosReportesFacturaProveedorServicio) {
		this.jComboBoxTiposGraficosReportesFacturaProveedorServicio = jComboBoxTiposGraficosReportesFacturaProveedorServicio;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturaProveedorServicio() {
		return this.jComboBoxTiposPaginacionFacturaProveedorServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturaProveedorServicio(
			JComboBox jComboBoxTiposPaginacionFacturaProveedorServicio) {
		this.jComboBoxTiposPaginacionFacturaProveedorServicio = jComboBoxTiposPaginacionFacturaProveedorServicio;
	}
	
	public void setBorderResaltarTiposPaginacionFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturaProveedorServicio() {
		return this.jComboBoxTiposRelacionesFacturaProveedorServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaProveedorServicio() {
		return this.jComboBoxTiposAccionesFacturaProveedorServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaProveedorServicio(
			JComboBox jComboBoxTiposRelacionesFacturaProveedorServicio) {
		this.jComboBoxTiposRelacionesFacturaProveedorServicio = jComboBoxTiposRelacionesFacturaProveedorServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaProveedorServicio(
			JComboBox jComboBoxTiposAccionesFacturaProveedorServicio) {
		this.jComboBoxTiposAccionesFacturaProveedorServicio = jComboBoxTiposAccionesFacturaProveedorServicio;
	}
	
	public void setBorderResaltarTiposRelacionesFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturaProveedorServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturaProveedorServicio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturaProveedorServicio() {
	//	return jCheckBoxConGraficoDinamicoFacturaProveedorServicio;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturaProveedorServicio(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturaProveedorServicio) {
	//	this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio = jCheckBoxConGraficoDinamicoFacturaProveedorServicio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturaProveedorServicio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturaProveedorServicio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio .setBorder(borderResaltar);		
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
		this.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
		
		this.facturaproveedorservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaProveedorServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturaProveedorServicio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"nuevo","nuevo","Nuevo"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"duplicar","duplicar","Duplicar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"copiar","copiar","Copiar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"ver_form","ver_form","Ver"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"recargar","recargar","Recargar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturaProveedorServicio,this.jTtoolBarFacturaProveedorServicio,
							"cerrar","cerrar","Salir"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturaProveedorServicio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturaProveedorServicio;
			
				this.jButtonProcesarInformacionToolBarFacturaProveedorServicio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturaProveedorServicio;
				
		//protected JButton jButtonModificarToolBarFacturaProveedorServicio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturaProveedorServicio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturaProveedorServicio=new JMenuMe("General");
		this.jmenuArchivoFacturaProveedorServicio=new JMenuMe("Archivo");
		this.jmenuAccionesFacturaProveedorServicio=new JMenuMe("Acciones");
		this.jmenuDatosFacturaProveedorServicio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaProveedorServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaProveedorServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaProveedorServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturaProveedorServicio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturaProveedorServicio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturaProveedorServicio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturaProveedorServicio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturaProveedorServicio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturaProveedorServicio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturaProveedorServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaProveedorServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaProveedorServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturaProveedorServicio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturaProveedorServicio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturaProveedorServicio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturaProveedorServicio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturaProveedorServicio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturaProveedorServicio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturaProveedorServicio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturaProveedorServicio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturaProveedorServicio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaProveedorServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaProveedorServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaProveedorServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturaProveedorServicio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturaProveedorServicio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturaProveedorServicio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturaProveedorServicio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturaProveedorServicio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturaProveedorServicio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturaProveedorServicio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturaProveedorServicio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturaProveedorServicio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturaProveedorServicio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturaProveedorServicio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturaProveedorServicio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturaProveedorServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturaProveedorServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturaProveedorServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaProveedorServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaProveedorServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaProveedorServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturaProveedorServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturaProveedorServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturaProveedorServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturaProveedorServicio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturaProveedorServicio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturaProveedorServicio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturaProveedorServicio.add(this.jMenuItemCerrarFacturaProveedorServicio);
			
			this.jmenuAccionesFacturaProveedorServicio.add(this.jMenuItemNuevoFacturaProveedorServicio);
			this.jmenuAccionesFacturaProveedorServicio.add(this.jMenuItemNuevoGuardarCambiosFacturaProveedorServicio);
			this.jmenuAccionesFacturaProveedorServicio.add(this.jMenuItemNuevoRelacionesFacturaProveedorServicio);
			this.jmenuAccionesFacturaProveedorServicio.add(this.jMenuItemGuardarCambiosTablaFacturaProveedorServicio);		
			this.jmenuAccionesFacturaProveedorServicio.add(this.jMenuItemDuplicarFacturaProveedorServicio);		
			this.jmenuAccionesFacturaProveedorServicio.add(this.jMenuItemCopiarFacturaProveedorServicio);		
			this.jmenuAccionesFacturaProveedorServicio.add(this.jMenuItemVerFormFacturaProveedorServicio);		
			
			this.jmenuDatosFacturaProveedorServicio.add(this.jMenuItemRecargarInformacionFacturaProveedorServicio);				
			this.jmenuDatosFacturaProveedorServicio.add(this.jMenuItemAnterioresFacturaProveedorServicio);				
			this.jmenuDatosFacturaProveedorServicio.add(this.jMenuItemSiguientesFacturaProveedorServicio);				
			this.jmenuDatosFacturaProveedorServicio.add(this.jMenuItemAbrirOrderByFacturaProveedorServicio);				
			this.jmenuDatosFacturaProveedorServicio.add(this.jMenuItemMostrarOcultarFacturaProveedorServicio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturaProveedorServicio.add(this.jMenuItemGuardarCambiosFacturaProveedorServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturaProveedorServicio.add(this.jmenuArchivoFacturaProveedorServicio);		
			this.jmenuBarFacturaProveedorServicio.add(this.jmenuAccionesFacturaProveedorServicio);		
			this.jmenuBarFacturaProveedorServicio.add(this.jmenuDatosFacturaProveedorServicio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturaProveedorServicio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturaProveedorServicio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteFacturaProveedorServicio.setToolTipText("Buscar Por Proveedor ");
		this.jButtonFK_IdClienteFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdClienteFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdClienteFacturaProveedorServicio.setToolTipText("Buscar Por Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteFacturaProveedorServicio,"buscar_button","Buscar Por Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteFacturaProveedorServicio = new JLabelMe();
		jLabelid_clienteFK_IdClienteFacturaProveedorServicio.setText("Proveedor :");
		jLabelid_clienteFK_IdClienteFacturaProveedorServicio.setToolTipText("Proveedor");
		jLabelid_clienteFK_IdClienteFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio.setFocusable(false);

		this.jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setToolTipText("Buscar Por Idcuenta Contable Credito Fiscal Servicios ");
		this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setToolTipText("Buscar Por Idcuenta Contable Credito Fiscal Servicios ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio,"buscar_button","Buscar Por Idcuenta Contable Credito Fiscal Servicios ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio = new JLabelMe();
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setText("Idcuenta Contable Credito Fiscal Servicios :");
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setToolTipText("Idcuenta Contable Credito Fiscal Servicios");
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoFacturaProveedorServicio.setToolTipText("Buscar Por Empl. Autoriza ");
		this.jButtonFK_IdEmpleadoFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdEmpleadoFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdEmpleadoFacturaProveedorServicio.setToolTipText("Buscar Por Empl. Autoriza ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoFacturaProveedorServicio,"buscar_button","Buscar Por Empl. Autoriza ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setText("Empl. Autoriza :");
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setToolTipText("Empl. Autoriza");
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio.setFocusable(false);

		this.jPanelFK_IdTipoDocumentoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoFacturaProveedorServicio.setToolTipText("Buscar Por T. Documento ");
		this.jButtonFK_IdTipoDocumentoFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoFacturaProveedorServicio.setToolTipText("Buscar Por T. Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoFacturaProveedorServicio,"buscar_button","Buscar Por T. Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio = new JLabelMe();
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setText("T. Documento :");
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setToolTipText("T. Documento");
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		this.jButtonFK_IdTipoMovimientoModuloFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoModuloFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoModuloFacturaProveedorServicio.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoModuloFacturaProveedorServicio,"buscar_button","Buscar Por Tipo Movimiento Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoModuloFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio = new JLabelMe();
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setText("Tipo Movimiento Modulo :");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setToolTipText("Tipo Movimiento Modulo");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio.setToolTipText("Buscar Por Tipo Retencion Fuente1 ");
		this.jButtonFK_IdTipoRetencionFuente1FacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdTipoRetencionFuente1FacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdTipoRetencionFuente1FacturaProveedorServicio.setToolTipText("Buscar Por Tipo Retencion Fuente1 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionFuente1FacturaProveedorServicio,"buscar_button","Buscar Por Tipo Retencion Fuente1 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionFuente1FacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio = new JLabelMe();
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setText("Tipo Retencion Fuente1 :");
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setToolTipText("Tipo Retencion Fuente1");
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio.setToolTipText("Buscar Por Tipo Retencion Iva1 ");
		this.jButtonFK_IdTipoRetencionIva1FacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIva1FacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIva1FacturaProveedorServicio.setToolTipText("Buscar Por Tipo Retencion Iva1 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIva1FacturaProveedorServicio,"buscar_button","Buscar Por Tipo Retencion Iva1 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIva1FacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio = new JLabelMe();
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setText("Tipo Retencion Iva1 :");
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setToolTipText("Tipo Retencion Iva1");
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio.setToolTipText("Buscar Por Tipo Comprobante ");
		this.jButtonFK_IdTipoTransaccionModuloFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloFacturaProveedorServicio.setToolTipText("Buscar Por Tipo Comprobante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloFacturaProveedorServicio,"buscar_button","Buscar Por Tipo Comprobante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setText("Tipo Comprobante :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setToolTipText("Tipo Comprobante");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTributarioFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTributarioFacturaProveedorServicio.setToolTipText("Buscar Por T. Tributario ");
		this.jButtonFK_IdTipoTributarioFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdTipoTributarioFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdTipoTributarioFacturaProveedorServicio.setToolTipText("Buscar Por T. Tributario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTributarioFacturaProveedorServicio,"buscar_button","Buscar Por T. Tributario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTributarioFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio = new JLabelMe();
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setText("T. Tributario :");
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setToolTipText("T. Tributario");
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionFacturaProveedorServicio.setToolTipText("Buscar Por Comprobante ");
		this.jButtonFK_IdTransaccionFacturaProveedorServicio= new JButtonMe();
		this.jButtonFK_IdTransaccionFacturaProveedorServicio.setText("Buscar");
		this.jButtonFK_IdTransaccionFacturaProveedorServicio.setToolTipText("Buscar Por Comprobante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionFacturaProveedorServicio,"buscar_button","Buscar Por Comprobante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio.setText("Comprobante :");
		jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio.setToolTipText("Comprobante");
		jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFacturaProveedorServicio=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturaProveedorServicio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasFacturaProveedorServicio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasFacturaProveedorServicio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturaProveedorServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturaProveedorServicio = new FacturaProveedorServicioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factura Proveedor DATOS");
			this.jInternalFrameDetalleFormFacturaProveedorServicio = new FacturaProveedorServicioDetalleFormJInternalFrame(jDesktopPane,this.facturaproveedorservicioSessionBean.getConGuardarRelaciones(),this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturaProveedorServicio = null;//new FacturaProveedorServicioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaProveedorServicio= new GridBagLayout();
		
		
		this.jTableDatosFacturaProveedorServicio = new JTableMe();      
		
		String sToolTipFacturaProveedorServicio="";
		sToolTipFacturaProveedorServicio=FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaProveedorServicio+="(Contabilidad.FacturaProveedorServicio)";
		}
		
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaProveedorServicio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturaProveedorServicio.setToolTipText(sToolTipFacturaProveedorServicio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturaProveedorServicio);
		this.jTableDatosFacturaProveedorServicio.setAutoCreateRowSorter(true);
		this.jTableDatosFacturaProveedorServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturaProveedorServicio.setRowSelectionAllowed(true);
		this.jTableDatosFacturaProveedorServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturaProveedorServicio = new JButtonMe();
		this.jButtonDuplicarFacturaProveedorServicio = new JButtonMe();
		this.jButtonCopiarFacturaProveedorServicio = new JButtonMe();
		this.jButtonVerFormFacturaProveedorServicio = new JButtonMe();
		this.jButtonNuevoRelacionesFacturaProveedorServicio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio = new JButtonMe();
		this.jButtonCerrarFacturaProveedorServicio = new JButtonMe();
		
		this.jScrollPanelDatosFacturaProveedorServicio = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturaProveedorServicio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Factura Proveedor";
		
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaProveedorServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaProveedorServicio.setToolTipText("Acciones");
        this.jPanelAccionesFacturaProveedorServicio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFacturaProveedorServicio.setName("jPanelCamposFingeneralFacturaProveedorServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion"));
		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio.setName("jPanelCamposFindatos_retencionFacturaProveedorServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Anexos Iva"));
		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.setName("jPanelCamposFinanexos_ivaFacturaProveedorServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoFacturaProveedorServicio=new ReporteDinamicoJInternalFrame(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturaProveedorServicio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturaProveedorServicio=new ImportacionJInternalFrame(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturaProveedorServicio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturaProveedorServicio = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturaProveedorServicio.setText("Orden");
		this.jButtonAbrirOrderByFacturaProveedorServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaProveedorServicio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaProveedorServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaProveedorServicio,false,this);
			
			//this.cargarOrderByFacturaProveedorServicio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaProveedorServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaProveedorServicio,true,this);
			
			//this.cargarOrderByFacturaProveedorServicio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturaProveedorServicio.setMinimumSize(new Dimension(400,50));//2230
		this.jTableDatosFacturaProveedorServicio.setMaximumSize(new Dimension(400,50));//2230
		this.jTableDatosFacturaProveedorServicio.setPreferredSize(new Dimension(400,50));//2230
		
		this.jScrollPanelDatosFacturaProveedorServicio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaProveedorServicio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaProveedorServicio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturaProveedorServicio.setText("Nuevo");
		this.jButtonDuplicarFacturaProveedorServicio.setText("Duplicar");
		this.jButtonCopiarFacturaProveedorServicio.setText("Copiar");
		this.jButtonVerFormFacturaProveedorServicio.setText("Ver");
		this.jButtonNuevoRelacionesFacturaProveedorServicio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio.setText("Guardar");
		this.jButtonCerrarFacturaProveedorServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaProveedorServicio,"nuevo_button","Nuevo",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturaProveedorServicio,"duplicar_button","Duplicar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturaProveedorServicio,"copiar_button","Copiar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturaProveedorServicio,"ver_form","Ver",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturaProveedorServicio,"nuevorelaciones_button","Nuevo Rel",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaProveedorServicio,"guardarcambiostabla_button","Guardar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaProveedorServicio,"cerrar_button","Salir",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturaProveedorServicio.setToolTipText("Nuevo"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturaProveedorServicio.setToolTipText("Duplicar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturaProveedorServicio.setToolTipText("Copiar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturaProveedorServicio.setToolTipText("Ver"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturaProveedorServicio.setToolTipText("Nuevo Rel"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio.setToolTipText("Guardar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaProveedorServicio.setToolTipText("Salir"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaProveedorServicio";
		inputMap = this.jButtonNuevoFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaProveedorServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaProveedorServicio"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturaProveedorServicio";
		inputMap = this.jButtonDuplicarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturaProveedorServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturaProveedorServicio"));
		
		//COPIAR
		sMapKey = "CopiarFacturaProveedorServicio";
		inputMap = this.jButtonCopiarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturaProveedorServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturaProveedorServicio"));
		
		//VEr FORM
		sMapKey = "VerFormFacturaProveedorServicio";
		inputMap = this.jButtonVerFormFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturaProveedorServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturaProveedorServicio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturaProveedorServicio";
		inputMap = this.jButtonNuevoRelacionesFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturaProveedorServicio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturaProveedorServicio";
		inputMap = this.jButtonModificarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturaProveedorServicio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturaProveedorServicio";
		inputMap = this.jButtonCerrarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaProveedorServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaProveedorServicio";
		inputMap = this.jButtonGuardarCambiosTablaFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaProveedorServicio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturaProveedorServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturaProveedorServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturaProveedorServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturaProveedorServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturaProveedorServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturaProveedorServicio.setName("jPanelParametrosReportesFacturaProveedorServicio"); 
		
		this.jPanelParametrosReportesAccionesFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturaProveedorServicio.setName("jPanelParametrosReportesAccionesFacturaProveedorServicio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturaProveedorServicio = new JButtonMe();
		this.jButtonRecargarInformacionFacturaProveedorServicio.setText("Recargar");
		this.jButtonRecargarInformacionFacturaProveedorServicio.setToolTipText("Recargar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturaProveedorServicio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFacturaProveedorServicio = new JButtonMe();
		this.jButtonProcesarInformacionFacturaProveedorServicio.setText("Procesar");
		this.jButtonProcesarInformacionFacturaProveedorServicio.setToolTipText("Procesar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturaProveedorServicio.setVisible(false);
			
		this.jButtonProcesarInformacionFacturaProveedorServicio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaProveedorServicio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaProveedorServicio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaProveedorServicio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturaProveedorServicio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaProveedorServicio.setText("TIPO");       
		this.jComboBoxTiposReportesFacturaProveedorServicio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaProveedorServicio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturaProveedorServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturaProveedorServicio.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturaProveedorServicio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturaProveedorServicio.setText("Accion");
		this.jComboBoxTiposRelacionesFacturaProveedorServicio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaProveedorServicio.setText("Accion");
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturaProveedorServicio.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturaProveedorServicio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturaProveedorServicio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturaProveedorServicio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaProveedorServicio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaProveedorServicio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturaProveedorServicio = new JLabelMe();
		
		this.jLabelAccionesFacturaProveedorServicio.setText("Acciones");		
		this.jLabelAccionesFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturaProveedorServicio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturaProveedorServicio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturaProveedorServicio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturaProveedorServicio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturaProveedorServicio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturaProveedorServicio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturaProveedorServicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturaProveedorServicio.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturaProveedorServicio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturaProveedorServicio = new JButtonMe();
		//this.jButtonAnterioresFacturaProveedorServicio.setText("<<");
        this.jButtonAnterioresFacturaProveedorServicio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturaProveedorServicio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturaProveedorServicio = new JButtonMe();
		//this.jButtonSiguientesFacturaProveedorServicio.setText(">>");
        this.jButtonSiguientesFacturaProveedorServicio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturaProveedorServicio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturaProveedorServicio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturaProveedorServicio.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturaProveedorServicio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturaProveedorServicio,"nuevoguardarcambios_button","Nue",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturaProveedorServicio";
		inputMap = this.jButtonNuevoGuardarCambiosFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturaProveedorServicio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturaProveedorServicio";
		inputMap = this.jButtonRecargarInformacionFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturaProveedorServicio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturaProveedorServicio";
		inputMap = this.jButtonSiguientesFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturaProveedorServicio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturaProveedorServicio";
		inputMap = this.jButtonAnterioresFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturaProveedorServicio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturaProveedorServicio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturaProveedorServicio.setMinimumSize(new Dimension(this.getWidth(),FacturaProveedorServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaProveedorServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaProveedorServicio.setMaximumSize(new Dimension(this.getWidth(),FacturaProveedorServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaProveedorServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaProveedorServicio.setPreferredSize(new Dimension(this.getWidth(),FacturaProveedorServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaProveedorServicioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturaProveedorServicio = new GridBagLayout();

			this.jPanelPaginacionFacturaProveedorServicio.setLayout(gridaBagLayoutPaginacionFacturaProveedorServicio);						
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonAnterioresFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
					
						
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
			
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonNuevoGuardarCambiosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
						
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonSiguientesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 1;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonNuevoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
						
			
			
			if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
				this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturaProveedorServicio.gridy = 1;
				this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonGuardarCambiosTablaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			}
			
			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 1;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonDuplicarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 1;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonCopiarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 1;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonVerFormFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 1;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturaProveedorServicio.add(this.jButtonCerrarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		
		this.jButtonRecargarInformacionFacturaProveedorServicio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaProveedorServicio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaProveedorServicio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturaProveedorServicio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaProveedorServicio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaProveedorServicio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturaProveedorServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaProveedorServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaProveedorServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturaProveedorServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaProveedorServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaProveedorServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturaProveedorServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaProveedorServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaProveedorServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturaProveedorServicio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaProveedorServicio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaProveedorServicio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturaProveedorServicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaProveedorServicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaProveedorServicio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturaProveedorServicio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaProveedorServicio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaProveedorServicio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturaProveedorServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturaProveedorServicio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturaProveedorServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturaProveedorServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturaProveedorServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturaProveedorServicio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturaProveedorServicio.setLayout(gridaBagParametrosReportesFacturaProveedorServicio);
			this.jPanelParametrosReportesAccionesFacturaProveedorServicio.setLayout(gridaBagParametrosReportesAccionesFacturaProveedorServicio);
			
			
			this.jPanelParametrosAuxiliar1FacturaProveedorServicio.setLayout(gridaBagParametrosAuxiliar1FacturaProveedorServicio);
			this.jPanelParametrosAuxiliar2FacturaProveedorServicio.setLayout(gridaBagParametrosAuxiliar2FacturaProveedorServicio);
			this.jPanelParametrosAuxiliar3FacturaProveedorServicio.setLayout(gridaBagParametrosAuxiliar3FacturaProveedorServicio);
			this.jPanelParametrosAuxiliar4FacturaProveedorServicio.setLayout(gridaBagParametrosAuxiliar4FacturaProveedorServicio);
			//this.jPanelParametrosAuxiliar5FacturaProveedorServicio.setLayout(gridaBagParametrosAuxiliar2FacturaProveedorServicio);			
			
			
			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jButtonRecargarInformacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaProveedorServicio.add(this.jComboBoxTiposPaginacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaProveedorServicio.add(this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaProveedorServicio.add(this.jComboBoxTiposArchivosReportesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jPanelParametrosAuxiliar1FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturaProveedorServicio.add(this.jComboBoxTiposReportesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);																		
			
			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturaProveedorServicio.add(this.jComboBoxTiposGraficosReportesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jPanelParametrosAuxiliar4FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jComboBoxTiposReportesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jCheckBoxGenerarReporteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jPanelParametrosAuxiliar2FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jLabelAccionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
				this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jButtonAbrirOrderByFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jComboBoxTiposSeleccionarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
			
			
			/*
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jCheckBoxSeleccionarTodosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jCheckBoxConGraficoReporteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaProveedorServicio.add(this.jCheckBoxSeleccionarTodosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);															
				
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaProveedorServicio.add(this.jCheckBoxSeleccionadosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);															
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaProveedorServicio.add(this.jCheckBoxConGraficoReporteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jPanelParametrosAuxiliar3FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jComboBoxTiposAccionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
	
				
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedorServicio.add(this.jTextFieldValorCampoGeneralFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFacturaProveedorServicio= new GridBagLayout();
		this.jPanelCamposIniciogeneralFacturaProveedorServicio.setLayout(gridaBagLayoutCamposIniciogeneralFacturaProveedorServicio);

		GridBagLayout gridaBagLayoutCamposIniciodatos_retencionFacturaProveedorServicio= new GridBagLayout();
		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio.setLayout(gridaBagLayoutCamposIniciodatos_retencionFacturaProveedorServicio);

		GridBagLayout gridaBagLayoutCamposInicioanexos_ivaFacturaProveedorServicio= new GridBagLayout();
		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.setLayout(gridaBagLayoutCamposInicioanexos_ivaFacturaProveedorServicio);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturaProveedorServicio = new GridBagLayout();

			this.jScrollPanelDatosFacturaProveedorServicio.setLayout(gridaBagLayoutDatosFacturaProveedorServicio);
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
			
			this.jScrollPanelDatosFacturaProveedorServicio.add(this.jTableDatosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturaProveedorServicio.setViewportView(this.jTableDatosFacturaProveedorServicio);
		this.jTableDatosFacturaProveedorServicio.setFillsViewportHeight(true);
		this.jTableDatosFacturaProveedorServicio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturaProveedorServicio= new GridBagLayout();
		this.jPanelAccionesFacturaProveedorServicio.setLayout(gridaBagLayoutAccionesFacturaProveedorServicio);
		
		
		/*	
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
			
		this.jPanelAccionesFacturaProveedorServicio.add(this.jButtonNuevoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdClienteFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdClienteFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdClienteFacturaProveedorServicio.add(jLabelid_clienteFK_IdClienteFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdClienteFacturaProveedorServicio.add(jComboBoxid_clienteFK_IdClienteFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);


		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdClienteFacturaProveedorServicio.add(this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdClienteFacturaProveedorServicio.add(jButtonFK_IdClienteFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("1.-Por Proveedor ", jPanelFK_IdClienteFacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.add(jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.add(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio.add(jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("2.-Por Idcuenta Contable Credito Fiscal Servicios ", jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdEmpleadoFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdEmpleadoFacturaProveedorServicio.add(jLabelid_empleadoFK_IdEmpleadoFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdEmpleadoFacturaProveedorServicio.add(jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);


		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdEmpleadoFacturaProveedorServicio.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdEmpleadoFacturaProveedorServicio.add(jButtonFK_IdEmpleadoFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("3.-Por Empl. Autoriza ", jPanelFK_IdEmpleadoFacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdTipoDocumentoFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdTipoDocumentoFacturaProveedorServicio.add(jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdTipoDocumentoFacturaProveedorServicio.add(jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdTipoDocumentoFacturaProveedorServicio.add(jButtonFK_IdTipoDocumentoFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("4.-Por T. Documento ", jPanelFK_IdTipoDocumentoFacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio.add(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio.add(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio.add(jButtonFK_IdTipoMovimientoModuloFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("5.-Por Tipo Movimiento Modulo ", jPanelFK_IdTipoMovimientoModuloFacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio.add(jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio.add(jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio.add(jButtonFK_IdTipoRetencionFuente1FacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("6.-Por Tipo Retencion Fuente1 ", jPanelFK_IdTipoRetencionFuente1FacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio.add(jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio.add(jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio.add(jButtonFK_IdTipoRetencionIva1FacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("7.-Por Tipo Retencion Iva1 ", jPanelFK_IdTipoRetencionIva1FacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio.add(jButtonFK_IdTipoTransaccionModuloFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("8.-Por Tipo Comprobante ", jPanelFK_IdTipoTransaccionModuloFacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoTributarioFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTributarioFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdTipoTributarioFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdTipoTributarioFacturaProveedorServicio.add(jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdTipoTributarioFacturaProveedorServicio.add(jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdTipoTributarioFacturaProveedorServicio.add(jButtonFK_IdTipoTributarioFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("9.-Por T. Tributario ", jPanelFK_IdTipoTributarioFacturaProveedorServicio);
		jTabbedPaneBusquedasFacturaProveedorServicio.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTransaccionFacturaProveedorServicio= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionFacturaProveedorServicio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFacturaProveedorServicio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFacturaProveedorServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionFacturaProveedorServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionFacturaProveedorServicio.setLayout(gridaBagLayoutFK_IdTransaccionFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		jPanelFK_IdTransaccionFacturaProveedorServicio.add(jLabelid_transaccionFK_IdTransaccionFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		gridBagConstraintsFacturaProveedorServicio.gridx = 1;
		jPanelFK_IdTransaccionFacturaProveedorServicio.add(jComboBoxid_transaccionFK_IdTransaccionFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedorServicio.gridy = 1;
		gridBagConstraintsFacturaProveedorServicio.gridx =1;
		jPanelFK_IdTransaccionFacturaProveedorServicio.add(jButtonFK_IdTransaccionFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);

		jTabbedPaneBusquedasFacturaProveedorServicio.addTab("10.-Por Comprobante ", jPanelFK_IdTransaccionFacturaProveedorServicio);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaProveedorServicio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();						
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;		
			//this.gridBagConstraintsFacturaProveedorServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaProveedorServicio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;		
		//this.gridBagConstraintsFacturaProveedorServicio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturaProveedorServicio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;		
			this.gridBagConstraintsFacturaProveedorServicio.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturaProveedorServicio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);								
		
		
		/*
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		*/		
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaProveedorServicio.gridx =0;
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaProveedorServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
				
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturaProveedorServicioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturaProveedorServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaProveedorServicio = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturaProveedorServicio.setLayout(gridaBagLayoutBusquedasParametrosFacturaProveedorServicio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturaProveedorServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			
			
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
			
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturaProveedorServicio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturaProveedorServicio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturaProveedorServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturaProveedorServicio.setName("jPanelReporteDinamicoFacturaProveedorServicio"); 
		
		this.jPanelReporteDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturaProveedorServicio.setLayout(gridaBagLayoutReporteDinamicoFacturaProveedorServicio);
		
		
		this.jInternalFrameReporteDinamicoFacturaProveedorServicio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturaProveedorServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaProveedorServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturaProveedorServicio = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturaProveedorServicio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelColumnasSelectReporteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturaProveedorServicio = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturaProveedorServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturaProveedorServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturaProveedorServicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaProveedorServicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaProveedorServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturaProveedorServicio=new JScrollPane(this.jListColumnasSelectReporteFacturaProveedorServicio);
			
			this.jScrollColumnasSelectReporteFacturaProveedorServicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaProveedorServicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaProveedorServicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jListColumnasSelectReporteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jScrollColumnasSelectReporteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturaProveedorServicio = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturaProveedorServicio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturaProveedorServicio = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturaProveedorServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturaProveedorServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturaProveedorServicio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaProveedorServicio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaProveedorServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturaProveedorServicio=new JScrollPane(this.jListRelacionesSelectReporteFacturaProveedorServicio);
			
			this.jScrollRelacionesSelectReporteFacturaProveedorServicio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaProveedorServicio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaProveedorServicio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturaProveedorServicio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturaProveedorServicio = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturaProveedorServicio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelConGraficoDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jCheckBoxConGraficoDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturaProveedorServicio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturaProveedorServicio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelColumnaCategoriaGraficoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturaProveedorServicio = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturaProveedorServicio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelColumnaCategoriaValorFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturaProveedorServicio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturaProveedorServicio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jComboBoxColumnaCategoriaValorFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturaProveedorServicio = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturaProveedorServicio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelColumnasValoresGraficoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturaProveedorServicio = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturaProveedorServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturaProveedorServicio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturaProveedorServicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaProveedorServicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaProveedorServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturaProveedorServicio=new JScrollPane(this.jListColumnasValoresGraficoFacturaProveedorServicio);
			
			this.jScrollColumnasValoresGraficoFacturaProveedorServicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaProveedorServicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaProveedorServicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jListColumnasSelectReporteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jScrollColumnasValoresGraficoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedorServicio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturaProveedorServicio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelTiposGraficosReportesDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaProveedorServicio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedorServicio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedorServicio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturaProveedorServicio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelGenerarExcelReporteDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturaProveedorServicio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturaProveedorServicio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturaProveedorServicio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturaProveedorServicio.setToolTipText("Generar EXCEL"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jButtonGenerarExcelReporteDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jComboBoxTiposReportesDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedorServicio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturaProveedorServicio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jLabelTiposArchivoReporteDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturaProveedorServicio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturaProveedorServicio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturaProveedorServicio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturaProveedorServicio.setToolTipText("Generar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jButtonGenerarReporteDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturaProveedorServicio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturaProveedorServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturaProveedorServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturaProveedorServicio.setToolTipText("Cancelar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedorServicio.add(this.jButtonCerrarReporteDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturaProveedorServicio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturaProveedorServicio= new JScrollPane(jPanelReporteDinamicoFacturaProveedorServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedorServicio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturaProveedorServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturaProveedorServicio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturaProveedorServicio);
		this.jInternalFrameReporteDinamicoFacturaProveedorServicio.getContentPane().add(this.jScrollPanelReporteDinamicoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturaProveedorServicio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturaProveedorServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturaProveedorServicio.setName("jPanelImportacionFacturaProveedorServicio"); 
		
		this.jPanelImportacionFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturaProveedorServicio.setLayout(gridaBagLayoutImportacionFacturaProveedorServicio);
		
		
		this.jInternalFrameImportacionFacturaProveedorServicio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturaProveedorServicio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturaProveedorServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaProveedorServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturaProveedorServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaProveedorServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaProveedorServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturaProveedorServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaProveedorServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaProveedorServicio.setResizable(true);
	    this.jInternalFrameImportacionFacturaProveedorServicio.setClosable(true);
	    this.jInternalFrameImportacionFacturaProveedorServicio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturaProveedorServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaProveedorServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaProveedorServicio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturaProveedorServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaProveedorServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaProveedorServicio.setResizable(true);
	    this.jInternalFrameImportacionFacturaProveedorServicio.setClosable(true);
	    this.jInternalFrameImportacionFacturaProveedorServicio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturaProveedorServicio = new JLabelMe();

		this.jLabelArchivoImportacionFacturaProveedorServicio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaProveedorServicio.add(this.jLabelArchivoImportacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturaProveedorServicio = new JFileChooser();		
		this.jFileChooserImportacionFacturaProveedorServicio.setToolTipText("ESCOGER ARCHIVO"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturaProveedorServicio = new JButtonMe();
		this.jButtonAbrirImportacionFacturaProveedorServicio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturaProveedorServicio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturaProveedorServicio.setToolTipText("Generar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedorServicio.add(this.jButtonAbrirImportacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturaProveedorServicio = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturaProveedorServicio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaProveedorServicio.add(this.jLabelPathArchivoImportacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturaProveedorServicio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturaProveedorServicio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaProveedorServicio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaProveedorServicio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedorServicio.add(this.jTextFieldPathArchivoImportacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturaProveedorServicio = new JButtonMe();
		this.jButtonGenerarImportacionFacturaProveedorServicio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturaProveedorServicio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturaProveedorServicio.setToolTipText("Generar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedorServicio.add(this.jButtonGenerarImportacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturaProveedorServicio = new JButtonMe();
		this.jButtonCerrarImportacionFacturaProveedorServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturaProveedorServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturaProveedorServicio.setToolTipText("Cancelar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedorServicio.add(this.jButtonCerrarImportacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturaProveedorServicio = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturaProveedorServicio= new JScrollPane(jPanelImportacionFacturaProveedorServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturaProveedorServicio.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturaProveedorServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturaProveedorServicio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturaProveedorServicio);
		this.jInternalFrameImportacionFacturaProveedorServicio.getContentPane().add(this.jScrollPanelImportacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturaProveedorServicio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturaProveedorServicio = new JButtonMe();
			this.jButtonAbrirOrderByFacturaProveedorServicio.setText("Orden");
			this.jButtonAbrirOrderByFacturaProveedorServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaProveedorServicio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturaProveedorServicio";
			inputMap = this.jButtonAbrirOrderByFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturaProveedorServicio"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturaProveedorServicio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturaProveedorServicio.setName("jPanelOrderByFacturaProveedorServicio"); 
			
			this.jPanelOrderByFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturaProveedorServicio.setLayout(gridaBagLayoutOrderByFacturaProveedorServicio);
			
			
			this.jTableDatosFacturaProveedorServicioOrderBy = new JTableMe();        
			this.jTableDatosFacturaProveedorServicioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturaProveedorServicioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturaProveedorServicioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturaProveedorServicioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturaProveedorServicioOrderBy.setViewportView(this.jTableDatosFacturaProveedorServicioOrderBy);
			this.jTableDatosFacturaProveedorServicioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturaProveedorServicioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturaProveedorServicio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturaProveedorServicio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturaProveedorServicio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturaProveedorServicio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturaProveedorServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturaProveedorServicio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturaProveedorServicio.setTitle("Orden");
			this.jInternalFrameOrderByFacturaProveedorServicio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturaProveedorServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturaProveedorServicio.setResizable(true);
			this.jInternalFrameOrderByFacturaProveedorServicio.setClosable(true);
			this.jInternalFrameOrderByFacturaProveedorServicio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturaProveedorServicio.ipady =150;
				
			this.jPanelOrderByFacturaProveedorServicio.add(jScrollPanelDatosFacturaProveedorServicioOrderBy, this.gridBagConstraintsFacturaProveedorServicio);//this.jTableDatosFacturaProveedorServicioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturaProveedorServicio = new JButtonMe();
			this.jButtonCerrarOrderByFacturaProveedorServicio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturaProveedorServicio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturaProveedorServicio.setToolTipText("Cancelar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturaProveedorServicio.add(this.jButtonCerrarOrderByFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturaProveedorServicio = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturaProveedorServicio= new JScrollPane(jPanelOrderByFacturaProveedorServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturaProveedorServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturaProveedorServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturaProveedorServicio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturaProveedorServicio);
			
			this.jInternalFrameOrderByFacturaProveedorServicio.getContentPane().add(this.jScrollPanelOrderByFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
		
		} else {
			this.jButtonAbrirOrderByFacturaProveedorServicio = new JButtonMe();
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
		int iWidthTableCalculado=0;//6630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.facturaproveedorservicioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturaProveedorServicio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturaProveedorServicio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturaProveedorServicio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFacturaProveedorServicio.getRowHeight();//FacturaProveedorServicioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio.isSelected()) {
					iHeightTable=FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaProveedorServicio.isSelected()) {
					iHeightTable=FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaProveedorServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturaProveedorServicio!=null && this.jInternalFrameOrderByFacturaProveedorServicio.getjTableDatosOrderBy()!=null) {
			//if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturaProveedorServicio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturaProveedorServicio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturaProveedorServicio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturaProveedorServicio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturaProveedorServicio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturaProveedorServicio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturaProveedorServicio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=facturaproveedorservicioLogic.getFacturaProveedorServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaproveedorservicios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturaProveedorServicio> TraerFacturaProveedorServicioBeans(List<FacturaProveedorServicio> facturaproveedorservicios,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturaProveedorServicio facturaproveedorservicio:facturaproveedorservicios) {
					
				if(!(FacturaProveedorServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturaProveedorServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturaproveedorservicio.setsDetalleGeneralEntityReporte(FacturaProveedorServicioConstantesFunciones.getFacturaProveedorServicioDescripcion(facturaproveedorservicio));
										
					facturaproveedorservicio.setcon_rise_descripcion(FacturaProveedorServicioConstantesFunciones.getcon_riseDescripcion(facturaproveedorservicio));	
					
						
					
				} else  {
							
					//facturaproveedorservicio.setsDetalleGeneralEntityReporte(facturaproveedorservicio.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturaproveedorserviciobeans.add(facturaproveedorserviciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturaproveedorservicios;
    }
	//PARA REPORTES FIN
}
