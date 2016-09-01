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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
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
import com.bydan.erp.contabilidad.util.FacturaProveedorConstantesFunciones;

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
public class FacturaProveedorJInternalFrame extends FacturaProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturaProveedor;
	
	protected JMenuBar jmenuBarFacturaProveedor;
	
	protected JMenu jmenuFacturaProveedor;
	protected JMenu jmenuDatosFacturaProveedor;
	protected JMenu jmenuArchivoFacturaProveedor;
	protected JMenu jmenuAccionesFacturaProveedor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaProveedor;	
	protected GridBagConstraints gridBagConstraintsFacturaProveedor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturaProveedorDetalleFormJInternalFrame jInternalFrameDetalleFormFacturaProveedor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturaProveedor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturaProveedor;	
	
	
	
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

	protected PlantillaFacturaBeanSwingJInternalFrame plantillafacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_plantillafactura="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpleadoBeanSwingJInternalFrame empleadosolicitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosolicita="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuente1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuente1="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuente2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuente2="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencioniva1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva1="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencioniva2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva2="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalbienesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscalbienes="";

	protected ResponsableFondoBeanSwingJInternalFrame responsablefondoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsablefondo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalserviciosBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscalservicios="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegasto2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofin="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofin2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofin2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public FacturaProveedorSessionBean facturaproveedorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public PlantillaFacturaSessionBean plantillafacturaSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EmpleadoSessionBean empleadosolicitaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoRetencionSessionBean tiporetencionfuente1SessionBean;
	public TipoRetencionSessionBean tiporetencionfuente2SessionBean;
	public TipoRetencionSessionBean tiporetencioniva1SessionBean;
	public TipoRetencionSessionBean tiporetencioniva2SessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalbienesSessionBean;
	public ResponsableFondoSessionBean responsablefondoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalserviciosSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;
	public CuentaContableSessionBean cuentacontablegasto2SessionBean;
	public CuentaContableSessionBean cuentacontablecreditofinSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofin2SessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturaProveedor> facturaproveedors;		
	public List<FacturaProveedor> facturaproveedorsEliminados;	
	public List<FacturaProveedor> facturaproveedorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturaProveedor;		
	protected JButton jButtonAbrirOrderByFacturaProveedor;
	
	
	//protected JPanel jPanelOrderByFacturaProveedor;
	//public JScrollPane jScrollPanelOrderByFacturaProveedor;	
	//protected JButton jButtonCerrarOrderByFacturaProveedor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturaProveedorLogic facturaproveedorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturaProveedor;
	public JScrollPane jScrollPanelDatosEdicionFacturaProveedor;
	public JScrollPane jScrollPanelDatosGeneralFacturaProveedor;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturaProveedorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturaProveedor;
	//public JScrollPane jScrollPanelImportacionFacturaProveedor;
	
	
	
	protected JPanel jPanelAccionesFacturaProveedor;
	
    protected JPanel jPanelPaginacionFacturaProveedor;
    protected JPanel jPanelParametrosReportesFacturaProveedor;
	protected JPanel jPanelParametrosReportesAccionesFacturaProveedor;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralFacturaProveedor;
	protected Integer iXPanelCamposIniciogeneralFacturaProveedor=0;
	protected Integer iYPanelCamposIniciogeneralFacturaProveedor=0;

	protected JPanel jPanelCamposIniciodatos_facturaFacturaProveedor;
	protected Integer iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
	protected Integer iYPanelCamposIniciodatos_facturaFacturaProveedor=0;

	protected JPanel jPanelCamposIniciodatos_retencion_0FacturaProveedor;
	protected Integer iXPanelCamposIniciodatos_retencion_0FacturaProveedor=0;
	protected Integer iYPanelCamposIniciodatos_retencion_0FacturaProveedor=0;

	protected JPanel jPanelCamposIniciodatos_retencionFacturaProveedor;
	protected Integer iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
	protected Integer iYPanelCamposIniciodatos_retencionFacturaProveedor=0;

	protected JPanel jPanelCamposInicioanexos_ivaFacturaProveedor;
	protected Integer iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
	protected Integer iYPanelCamposInicioanexos_ivaFacturaProveedor=0;

	protected JPanel jPanelCamposIniciocuentas_contablesFacturaProveedor;
	protected Integer iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
	protected Integer iYPanelCamposIniciocuentas_contablesFacturaProveedor=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturaProveedor;
	protected JPanel jPanelParametrosAuxiliar2FacturaProveedor;
	protected JPanel jPanelParametrosAuxiliar3FacturaProveedor;
	protected JPanel jPanelParametrosAuxiliar4FacturaProveedor;
	//protected JPanel jPanelParametrosAuxiliar5FacturaProveedor;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturaProveedor;
	//protected JPanel jPanelImportacionFacturaProveedor;
	
	
	public JTable jTableDatosFacturaProveedor;
	
	
	
	//public JTable jTableDatosFacturaProveedorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturaProveedor;
	protected JButton jButtonDuplicarFacturaProveedor;
	protected JButton jButtonCopiarFacturaProveedor;
	protected JButton jButtonVerFormFacturaProveedor;
	protected JButton jButtonNuevoRelacionesFacturaProveedor;
	protected JButton jButtonModificarFacturaProveedor;
	
    protected JButton jButtonGuardarCambiosTablaFacturaProveedor;
	protected JButton jButtonCerrarFacturaProveedor;
	
	
	protected JButton jButtonRecargarInformacionFacturaProveedor;
	protected JButton jButtonProcesarInformacionFacturaProveedor;
	
	
	protected JButton jButtonAnterioresFacturaProveedor;
	protected JButton jButtonSiguientesFacturaProveedor;
	protected JButton jButtonNuevoGuardarCambiosFacturaProveedor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturaProveedor;
	//protected JButton jButtonCerrarReporteDinamicoFacturaProveedor;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturaProveedor;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturaProveedor;
	//protected JButton jButtonGenerarImportacionFacturaProveedor;
	//protected JButton jButtonCerrarImportacionFacturaProveedor;
	//protected JFileChooser jFileChooserImportacionFacturaProveedor;
	//protected File fileImportacionFacturaProveedor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaProveedor;
	protected JButton jButtonDuplicarToolBarFacturaProveedor;
	protected JButton jButtonNuevoRelacionesToolBarFacturaProveedor;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturaProveedor;
	protected JButton jButtonCopiarToolBarFacturaProveedor;
	protected JButton jButtonVerFormToolBarFacturaProveedor;
	public JButton jButtonGuardarCambiosTablaToolBarFacturaProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaProveedor;
	protected JButton jButtonCerrarToolBarFacturaProveedor;
	
	protected JButton jButtonRecargarInformacionToolBarFacturaProveedor;
	protected JButton jButtonProcesarInformacionToolBarFacturaProveedor;
	protected JButton jButtonAnterioresToolBarFacturaProveedor;
	protected JButton jButtonSiguientesToolBarFacturaProveedor;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturaProveedor;
	protected JButton jButtonAbrirOrderByToolBarFacturaProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaProveedor;
	protected JMenuItem jMenuItemDuplicarFacturaProveedor;
	protected JMenuItem jMenuItemNuevoRelacionesFacturaProveedor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturaProveedor;
	protected JMenuItem jMenuItemCopiarFacturaProveedor;
	protected JMenuItem jMenuItemVerFormFacturaProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaProveedor;
	protected JMenuItem jMenuItemCerrarFacturaProveedor;
	protected JMenuItem jMenuItemDetalleCerrarFacturaProveedor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturaProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaProveedor;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturaProveedor;
	protected JMenuItem jMenuItemProcesarInformacionFacturaProveedor;
	protected JMenuItem jMenuItemAnterioresFacturaProveedor;
	protected JMenuItem jMenuItemSiguientesFacturaProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaProveedor;
	protected JMenuItem jMenuItemAbrirOrderByFacturaProveedor;
	protected JMenuItem jMenuItemMostrarOcultarFacturaProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaProveedor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturaProveedor;
	protected JCheckBox jCheckBoxSeleccionadosFacturaProveedor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturaProveedor;
	protected JCheckBox jCheckBoxConGraficoReporteFacturaProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturaProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturaProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturaProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturaProveedor;
	protected JTextField jTextFieldValorCampoGeneralFacturaProveedor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturaProveedor;
	//public JList<Reporte> jListColumnasSelectReporteFacturaProveedor;
	//public JScrollPane jScrollColumnasSelectReporteFacturaProveedor;
	
	//public JLabel jLabelRelacionesSelectReporteFacturaProveedor;
	//public JList<Reporte> jListRelacionesSelectReporteFacturaProveedor;
	//public JScrollPane jScrollRelacionesSelectReporteFacturaProveedor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturaProveedor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturaProveedor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturaProveedor;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturaProveedor;
	
		
	//public JLabel jLabelArchivoImportacionFacturaProveedor;	
	//public JLabel jLabelPathArchivoImportacionFacturaProveedor;
	//protected JTextField jTextFieldPathArchivoImportacionFacturaProveedor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturaProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturaProveedor;
	
	//public JLabel jLabelColumnaCategoriaValorFacturaProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturaProveedor;
	
	//public JLabel jLabelColumnasValoresGraficoFacturaProveedor;
	//public JList<Reporte> jListColumnasValoresGraficoFacturaProveedor;
	//public JScrollPane jScrollColumnasValoresGraficoFacturaProveedor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturaProveedor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturaProveedor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturaProveedor;
	public JPanel jPanelFK_IdClienteFacturaProveedor;
	public JButton jButtonFK_IdClienteFacturaProveedor;
	public JPanel jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor;
	public JButton jButtonFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor;
	public JPanel jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor;
	public JButton jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor;
	public JPanel jPanelFK_IdCuentaContableGasto2FacturaProveedor;
	public JButton jButtonFK_IdCuentaContableGasto2FacturaProveedor;
	public JPanel jPanelFK_IdEmpleadoFacturaProveedor;
	public JButton jButtonFK_IdEmpleadoFacturaProveedor;
	public JPanel jPanelFK_IdPlantillaFacturaFacturaProveedor;
	public JButton jButtonFK_IdPlantillaFacturaFacturaProveedor;
	public JPanel jPanelFK_IdResponsableFondoFacturaProveedor;
	public JButton jButtonFK_IdResponsableFondoFacturaProveedor;
	public JPanel jPanelFK_IdTipoDocumentoFacturaProveedor;
	public JButton jButtonFK_IdTipoDocumentoFacturaProveedor;
	public JPanel jPanelFK_IdTipoMovimientoModuloFacturaProveedor;
	public JButton jButtonFK_IdTipoMovimientoModuloFacturaProveedor;
	public JPanel jPanelFK_IdTipoRetencionFuente1FacturaProveedor;
	public JButton jButtonFK_IdTipoRetencionFuente1FacturaProveedor;
	public JPanel jPanelFK_IdTipoRetencionIva1FacturaProveedor;
	public JButton jButtonFK_IdTipoRetencionIva1FacturaProveedor;
	public JPanel jPanelFK_IdTipoTransaccionModuloFacturaProveedor;
	public JButton jButtonFK_IdTipoTransaccionModuloFacturaProveedor;
	public JPanel jPanelFK_IdTipoTributarioFacturaProveedor;
	public JButton jButtonFK_IdTipoTributarioFacturaProveedor;
	public JPanel jPanelFK_IdTransaccionFacturaProveedor;
	public JButton jButtonFK_IdTransaccionFacturaProveedor;
	
	public JPanel jPanelid_clienteFK_IdClienteFacturaProveedor;
	public JLabel jLabelid_clienteFK_IdClienteFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteFacturaProveedor;
	public JButton jButtonid_clienteFK_IdClienteFacturaProveedor= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaProveedorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteFacturaProveedor;
	
	public JPanel jPanelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor;
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedorArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor;
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedorArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor;
	public JLabel jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor;
	public JButton jButtonid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedorArbol= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoFacturaProveedor;
	public JLabel jLabelid_empleadoFK_IdEmpleadoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedor;
	public JButton jButtonid_empleadoFK_IdEmpleadoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoFacturaProveedorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor;
	
	public JPanel jPanelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor;
	public JLabel jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor;
	public JButton jButtonid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor= new JButtonMe();
	public JButton jButtonid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor;
	
	public JPanel jPanelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor;
	public JLabel jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsable_fondoFK_IdResponsableFondoFacturaProveedor;
	public JButton jButtonid_responsable_fondoFK_IdResponsableFondoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_responsable_fondoFK_IdResponsableFondoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_responsable_fondoFK_IdResponsableFondoFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor;
	public JLabel jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor;
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor;
	public JLabel jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor;
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor;
	public JLabel jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor;
	public JButton jButtonid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor;
	public JLabel jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor;
	public JButton jButtonid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor;
	public JLabel jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor;
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionFacturaProveedor;
	public JLabel jLabelid_transaccionFK_IdTransaccionFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionFacturaProveedor;
	public JButton jButtonid_transaccionFK_IdTransaccionFacturaProveedor= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionFacturaProveedorBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=1327;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturaProveedorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturaProveedor)	{
		this.jButtonRecargarInformacionFacturaProveedor = jButtonRecargarInformacionFacturaProveedor;
	}
	
	public JButton getjButtonProcesarInformacionFacturaProveedor() {
		return this.jButtonProcesarInformacionFacturaProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaProveedor)	{
		this.jButtonProcesarInformacionFacturaProveedor = jButtonProcesarInformacionFacturaProveedor;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturaProveedor() {
		return this.jButtonRecargarInformacionFacturaProveedor;
	}
	
	
	public List<FacturaProveedor> getfacturaproveedors() {
		return this.facturaproveedors;
	}

	public void setfacturaproveedors(List<FacturaProveedor> facturaproveedors) {
		this.facturaproveedors = facturaproveedors;
	}
	
	public List<FacturaProveedor> getfacturaproveedorsAux() {
		return this.facturaproveedorsAux;
	}

	public void setfacturaproveedorsAux(List<FacturaProveedor> facturaproveedorsAux) {
		this.facturaproveedorsAux = facturaproveedorsAux;
	}
	
	public List<FacturaProveedor> getfacturaproveedorsEliminados() {
		return this.facturaproveedorsEliminados;
	}

	public void setFacturaProveedorsEliminados(List<FacturaProveedor> facturaproveedorsEliminados) {
		this.facturaproveedorsEliminados = facturaproveedorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturaProveedor() {
		return jComboBoxTiposSeleccionarFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturaProveedor(
			JComboBox jComboBoxTiposSeleccionarFacturaProveedor) {
		this.jComboBoxTiposSeleccionarFacturaProveedor = jComboBoxTiposSeleccionarFacturaProveedor;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturaProveedor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturaProveedor() {
		return jTextFieldValorCampoGeneralFacturaProveedor;
	}

	public void setjTextFieldValorCampoGeneralFacturaProveedor(
			JTextField jTextFieldValorCampoGeneralFacturaProveedor) {
		this.jTextFieldValorCampoGeneralFacturaProveedor = jTextFieldValorCampoGeneralFacturaProveedor;
	}

	public void setBorderResaltarValorCampoGeneralFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturaProveedor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturaProveedor() {
		return this.jCheckBoxSeleccionarTodosFacturaProveedor;
	}

	public void setjCheckBoxSeleccionarTodosFacturaProveedor(
			JCheckBox jCheckBoxSeleccionarTodosFacturaProveedor) {
		this.jCheckBoxSeleccionarTodosFacturaProveedor = jCheckBoxSeleccionarTodosFacturaProveedor;
	}

	public void setBorderResaltarSeleccionarTodosFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturaProveedor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturaProveedor() {
		return this.jCheckBoxSeleccionadosFacturaProveedor;
	}

	public void setjCheckBoxSeleccionadosFacturaProveedor(
			JCheckBox jCheckBoxSeleccionadosFacturaProveedor) {
		this.jCheckBoxSeleccionadosFacturaProveedor = jCheckBoxSeleccionadosFacturaProveedor;
	}
	
	public void setBorderResaltarSeleccionadosFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturaProveedor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturaProveedor() {
		return this.jComboBoxTiposArchivosReportesFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturaProveedor(
			JComboBox jComboBoxTiposArchivosReportesFacturaProveedor) {
		this.jComboBoxTiposArchivosReportesFacturaProveedor = jComboBoxTiposArchivosReportesFacturaProveedor;
	}

	public void setBorderResaltarTiposArchivosReportesFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturaProveedor() {
		return this.jComboBoxTiposReportesFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturaProveedor(
			JComboBox jComboBoxTiposReportesFacturaProveedor) {
		this.jComboBoxTiposReportesFacturaProveedor = jComboBoxTiposReportesFacturaProveedor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturaProveedor() {
	//	return jComboBoxTiposReportesDinamicoFacturaProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturaProveedor(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturaProveedor) {
	//	this.jComboBoxTiposReportesDinamicoFacturaProveedor = jComboBoxTiposReportesDinamicoFacturaProveedor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturaProveedor() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturaProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturaProveedor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaProveedor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor = jComboBoxTiposArchivosReportesDinamicoFacturaProveedor;
	//}
	
	public void setBorderResaltarTiposReportesFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturaProveedor() {
		return this.jComboBoxTiposGraficosReportesFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturaProveedor(
			JComboBox jComboBoxTiposGraficosReportesFacturaProveedor) {
		this.jComboBoxTiposGraficosReportesFacturaProveedor = jComboBoxTiposGraficosReportesFacturaProveedor;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturaProveedor() {
		return this.jComboBoxTiposPaginacionFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturaProveedor(
			JComboBox jComboBoxTiposPaginacionFacturaProveedor) {
		this.jComboBoxTiposPaginacionFacturaProveedor = jComboBoxTiposPaginacionFacturaProveedor;
	}
	
	public void setBorderResaltarTiposPaginacionFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturaProveedor() {
		return this.jComboBoxTiposRelacionesFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaProveedor() {
		return this.jComboBoxTiposAccionesFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaProveedor(
			JComboBox jComboBoxTiposRelacionesFacturaProveedor) {
		this.jComboBoxTiposRelacionesFacturaProveedor = jComboBoxTiposRelacionesFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaProveedor(
			JComboBox jComboBoxTiposAccionesFacturaProveedor) {
		this.jComboBoxTiposAccionesFacturaProveedor = jComboBoxTiposAccionesFacturaProveedor;
	}
	
	public void setBorderResaltarTiposRelacionesFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturaProveedor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturaProveedor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturaProveedor() {
	//	return jCheckBoxConGraficoDinamicoFacturaProveedor;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturaProveedor(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturaProveedor) {
	//	this.jCheckBoxConGraficoDinamicoFacturaProveedor = jCheckBoxConGraficoDinamicoFacturaProveedor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturaProveedor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturaProveedor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturaProveedor .setBorder(borderResaltar);		
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
		this.facturaproveedorSessionBean=new FacturaProveedorSessionBean();
		
		this.facturaproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaproveedorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 6650) {
			iWidth=6650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturaProveedor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"nuevo","nuevo","Nuevo"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"duplicar","duplicar","Duplicar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"copiar","copiar","Copiar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"ver_form","ver_form","Ver"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"recargar","recargar","Recargar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturaProveedor,this.jTtoolBarFacturaProveedor,
							"cerrar","cerrar","Salir"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturaProveedor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturaProveedor;
			
				this.jButtonProcesarInformacionToolBarFacturaProveedor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturaProveedor;
				
		//protected JButton jButtonModificarToolBarFacturaProveedor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturaProveedor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturaProveedor=new JMenuMe("General");
		this.jmenuArchivoFacturaProveedor=new JMenuMe("Archivo");
		this.jmenuAccionesFacturaProveedor=new JMenuMe("Acciones");
		this.jmenuDatosFacturaProveedor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturaProveedor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturaProveedor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturaProveedor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturaProveedor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturaProveedor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturaProveedor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturaProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturaProveedor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturaProveedor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturaProveedor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturaProveedor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturaProveedor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturaProveedor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturaProveedor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturaProveedor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturaProveedor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturaProveedor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturaProveedor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturaProveedor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturaProveedor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturaProveedor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturaProveedor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturaProveedor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturaProveedor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturaProveedor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturaProveedor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturaProveedor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturaProveedor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturaProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturaProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturaProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturaProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturaProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturaProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturaProveedor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturaProveedor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturaProveedor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturaProveedor.add(this.jMenuItemCerrarFacturaProveedor);
			
			this.jmenuAccionesFacturaProveedor.add(this.jMenuItemNuevoFacturaProveedor);
			this.jmenuAccionesFacturaProveedor.add(this.jMenuItemNuevoGuardarCambiosFacturaProveedor);
			this.jmenuAccionesFacturaProveedor.add(this.jMenuItemNuevoRelacionesFacturaProveedor);
			this.jmenuAccionesFacturaProveedor.add(this.jMenuItemGuardarCambiosTablaFacturaProveedor);		
			this.jmenuAccionesFacturaProveedor.add(this.jMenuItemDuplicarFacturaProveedor);		
			this.jmenuAccionesFacturaProveedor.add(this.jMenuItemCopiarFacturaProveedor);		
			this.jmenuAccionesFacturaProveedor.add(this.jMenuItemVerFormFacturaProveedor);		
			
			this.jmenuDatosFacturaProveedor.add(this.jMenuItemRecargarInformacionFacturaProveedor);				
			this.jmenuDatosFacturaProveedor.add(this.jMenuItemAnterioresFacturaProveedor);				
			this.jmenuDatosFacturaProveedor.add(this.jMenuItemSiguientesFacturaProveedor);				
			this.jmenuDatosFacturaProveedor.add(this.jMenuItemAbrirOrderByFacturaProveedor);				
			this.jmenuDatosFacturaProveedor.add(this.jMenuItemMostrarOcultarFacturaProveedor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturaProveedor.add(this.jMenuItemGuardarCambiosFacturaProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturaProveedor.add(this.jmenuArchivoFacturaProveedor);		
			this.jmenuBarFacturaProveedor.add(this.jmenuAccionesFacturaProveedor);		
			this.jmenuBarFacturaProveedor.add(this.jmenuDatosFacturaProveedor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturaProveedor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturaProveedor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteFacturaProveedor.setToolTipText("Buscar Por Proveedor ");
		this.jButtonFK_IdClienteFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdClienteFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdClienteFacturaProveedor.setToolTipText("Buscar Por Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteFacturaProveedor,"buscar_button","Buscar Por Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteFacturaProveedor = new JLabelMe();
		jLabelid_clienteFK_IdClienteFacturaProveedor.setText("Proveedor :");
		jLabelid_clienteFK_IdClienteFacturaProveedor.setToolTipText("Proveedor");
		jLabelid_clienteFK_IdClienteFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteFacturaProveedor= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor.setFocusable(false);

		this.jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setToolTipText("Buscar Por Credito Fiscal Bienes ");
		this.jButtonFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setToolTipText("Buscar Por Credito Fiscal Bienes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor,"buscar_button","Buscar Por Credito Fiscal Bienes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor = new JLabelMe();
		jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setText("Credito Fiscal Bienes :");
		jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setToolTipText("Credito Fiscal Bienes");
		jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setToolTipText("Buscar Por Credito Fiscal Servicios ");
		this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setToolTipText("Buscar Por Credito Fiscal Servicios ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor,"buscar_button","Buscar Por Credito Fiscal Servicios ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor = new JLabelMe();
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setText("Credito Fiscal Servicios :");
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setToolTipText("Credito Fiscal Servicios");
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableGasto2FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableGasto2FacturaProveedor.setToolTipText("Buscar Por C. Gasto 2 ");
		this.jButtonFK_IdCuentaContableGasto2FacturaProveedor= new JButtonMe();
		this.jButtonFK_IdCuentaContableGasto2FacturaProveedor.setText("Buscar");
		this.jButtonFK_IdCuentaContableGasto2FacturaProveedor.setToolTipText("Buscar Por C. Gasto 2 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableGasto2FacturaProveedor,"buscar_button","Buscar Por C. Gasto 2 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableGasto2FacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor = new JLabelMe();
		jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setText("C. Gasto 2 :");
		jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setToolTipText("C. Gasto 2");
		jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoFacturaProveedor.setToolTipText("Buscar Por Empl.Autoriza ");
		this.jButtonFK_IdEmpleadoFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdEmpleadoFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdEmpleadoFacturaProveedor.setToolTipText("Buscar Por Empl.Autoriza ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoFacturaProveedor,"buscar_button","Buscar Por Empl.Autoriza ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedor = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedor.setText("Empl.Autoriza :");
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedor.setToolTipText("Empl.Autoriza");
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor.setFocusable(false);

		this.jPanelFK_IdPlantillaFacturaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPlantillaFacturaFacturaProveedor.setToolTipText("Buscar Por Plantilla Factura ");
		this.jButtonFK_IdPlantillaFacturaFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdPlantillaFacturaFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdPlantillaFacturaFacturaProveedor.setToolTipText("Buscar Por Plantilla Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPlantillaFacturaFacturaProveedor,"buscar_button","Buscar Por Plantilla Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPlantillaFacturaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor = new JLabelMe();
		jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setText("Plantilla Factura :");
		jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setToolTipText("Plantilla Factura");
		jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor= new JComboBoxMe();
		jComboBoxid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor= new JButtonMe();
		this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor.setText("Buscar");
		this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor.setFocusable(false);

		this.jPanelFK_IdResponsableFondoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdResponsableFondoFacturaProveedor.setToolTipText("Buscar Por Responsable ");
		this.jButtonFK_IdResponsableFondoFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdResponsableFondoFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdResponsableFondoFacturaProveedor.setToolTipText("Buscar Por Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdResponsableFondoFacturaProveedor,"buscar_button","Buscar Por Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdResponsableFondoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor = new JLabelMe();
		jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setText("Responsable :");
		jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setToolTipText("Responsable");
		jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_responsable_fondoFK_IdResponsableFondoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsable_fondoFK_IdResponsableFondoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsable_fondoFK_IdResponsableFondoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoFacturaProveedor.setToolTipText("Buscar Por T. Documento ");
		this.jButtonFK_IdTipoDocumentoFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoFacturaProveedor.setToolTipText("Buscar Por T. Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoFacturaProveedor,"buscar_button","Buscar Por T. Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor = new JLabelMe();
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setText("T. Documento :");
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setToolTipText("T. Documento");
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoModuloFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoModuloFacturaProveedor.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		this.jButtonFK_IdTipoMovimientoModuloFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoModuloFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoModuloFacturaProveedor.setToolTipText("Buscar Por Tipo Movimiento Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoModuloFacturaProveedor,"buscar_button","Buscar Por Tipo Movimiento Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoModuloFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor = new JLabelMe();
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setText("Tipo Movimiento Modulo :");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setToolTipText("Tipo Movimiento Modulo");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionFuente1FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionFuente1FacturaProveedor.setToolTipText("Buscar Por Ret. Fuente 1 ");
		this.jButtonFK_IdTipoRetencionFuente1FacturaProveedor= new JButtonMe();
		this.jButtonFK_IdTipoRetencionFuente1FacturaProveedor.setText("Buscar");
		this.jButtonFK_IdTipoRetencionFuente1FacturaProveedor.setToolTipText("Buscar Por Ret. Fuente 1 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionFuente1FacturaProveedor,"buscar_button","Buscar Por Ret. Fuente 1 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionFuente1FacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor = new JLabelMe();
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setText("Ret. Fuente 1 :");
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setToolTipText("Ret. Fuente 1");
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIva1FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIva1FacturaProveedor.setToolTipText("Buscar Por Ret Iva B. ");
		this.jButtonFK_IdTipoRetencionIva1FacturaProveedor= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIva1FacturaProveedor.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIva1FacturaProveedor.setToolTipText("Buscar Por Ret Iva B. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIva1FacturaProveedor,"buscar_button","Buscar Por Ret Iva B. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIva1FacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor = new JLabelMe();
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setText("Ret Iva B. :");
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setToolTipText("Ret Iva B.");
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloFacturaProveedor.setToolTipText("Buscar Por Tipo Comprobante ");
		this.jButtonFK_IdTipoTransaccionModuloFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloFacturaProveedor.setToolTipText("Buscar Por Tipo Comprobante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloFacturaProveedor,"buscar_button","Buscar Por Tipo Comprobante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setText("Tipo Comprobante :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setToolTipText("Tipo Comprobante");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTributarioFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTributarioFacturaProveedor.setToolTipText("Buscar Por Sustento Trib. ");
		this.jButtonFK_IdTipoTributarioFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdTipoTributarioFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdTipoTributarioFacturaProveedor.setToolTipText("Buscar Por Sustento Trib. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTributarioFacturaProveedor,"buscar_button","Buscar Por Sustento Trib. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTributarioFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor = new JLabelMe();
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setText("Sustento Trib. :");
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setToolTipText("Sustento Trib.");
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionFacturaProveedor.setToolTipText("Buscar Por T.Comprobante ");
		this.jButtonFK_IdTransaccionFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdTransaccionFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdTransaccionFacturaProveedor.setToolTipText("Buscar Por T.Comprobante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionFacturaProveedor,"buscar_button","Buscar Por T.Comprobante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionFacturaProveedor = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionFacturaProveedor.setText("T.Comprobante :");
		jLabelid_transaccionFK_IdTransaccionFacturaProveedor.setToolTipText("T.Comprobante");
		jLabelid_transaccionFK_IdTransaccionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedor= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFacturaProveedor=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturaProveedor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasFacturaProveedor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasFacturaProveedor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleFacturaProveedor = new FacturaProveedorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factura Proveedor DATOS");
			this.jInternalFrameDetalleFormFacturaProveedor = new FacturaProveedorDetalleFormJInternalFrame(jDesktopPane,this.facturaproveedorSessionBean.getConGuardarRelaciones(),this.facturaproveedorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturaProveedor = null;//new FacturaProveedorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaProveedor= new GridBagLayout();
		
		
		this.jTableDatosFacturaProveedor = new JTableMe();      
		
		String sToolTipFacturaProveedor="";
		sToolTipFacturaProveedor=FacturaProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaProveedor+="(Contabilidad.FacturaProveedor)";
		}
		
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaProveedor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturaProveedor.setToolTipText(sToolTipFacturaProveedor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturaProveedor);
		this.jTableDatosFacturaProveedor.setAutoCreateRowSorter(true);
		this.jTableDatosFacturaProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturaProveedor.setRowSelectionAllowed(true);
		this.jTableDatosFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturaProveedor = new JButtonMe();
		this.jButtonDuplicarFacturaProveedor = new JButtonMe();
		this.jButtonCopiarFacturaProveedor = new JButtonMe();
		this.jButtonVerFormFacturaProveedor = new JButtonMe();
		this.jButtonNuevoRelacionesFacturaProveedor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturaProveedor = new JButtonMe();
		this.jButtonCerrarFacturaProveedor = new JButtonMe();
		
		this.jScrollPanelDatosFacturaProveedor = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturaProveedor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_facturaFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_retencionFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioanexos_ivaFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_contablesFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Factura Proveedor";
		
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaProveedor.setToolTipText("Acciones");
        this.jPanelAccionesFacturaProveedor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFacturaProveedor.setName("jPanelCamposFingeneralFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_facturaFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura"));
		this.jPanelCamposIniciodatos_facturaFacturaProveedor.setName("jPanelCamposFindatos_facturaFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_facturaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion 0"));
		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.setName("jPanelCamposFindatos_retencion_0FacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_retencion_0FacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_retencionFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion"));
		this.jPanelCamposIniciodatos_retencionFacturaProveedor.setName("jPanelCamposFindatos_retencionFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_retencionFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioanexos_ivaFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Anexos Iva"));
		this.jPanelCamposInicioanexos_ivaFacturaProveedor.setName("jPanelCamposFinanexos_ivaFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioanexos_ivaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_contablesFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Contables"));
		this.jPanelCamposIniciocuentas_contablesFacturaProveedor.setName("jPanelCamposFincuentas_contablesFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_contablesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoFacturaProveedor=new ReporteDinamicoJInternalFrame(FacturaProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturaProveedor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturaProveedor=new ImportacionJInternalFrame(FacturaProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturaProveedor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturaProveedor = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturaProveedor.setText("Orden");
		this.jButtonAbrirOrderByFacturaProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaProveedor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaProveedor,false,this);
			
			//this.cargarOrderByFacturaProveedor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaProveedor,true,this);
			
			//this.cargarOrderByFacturaProveedor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturaProveedor.setMinimumSize(new Dimension(400,50));//6630
		this.jTableDatosFacturaProveedor.setMaximumSize(new Dimension(400,50));//6630
		this.jTableDatosFacturaProveedor.setPreferredSize(new Dimension(400,50));//6630
		
		this.jScrollPanelDatosFacturaProveedor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaProveedor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaProveedor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturaProveedor.setText("Nuevo");
		this.jButtonDuplicarFacturaProveedor.setText("Duplicar");
		this.jButtonCopiarFacturaProveedor.setText("Copiar");
		this.jButtonVerFormFacturaProveedor.setText("Ver");
		this.jButtonNuevoRelacionesFacturaProveedor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturaProveedor.setText("Guardar");
		this.jButtonCerrarFacturaProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaProveedor,"nuevo_button","Nuevo",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturaProveedor,"duplicar_button","Duplicar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturaProveedor,"copiar_button","Copiar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturaProveedor,"ver_form","Ver",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturaProveedor,"nuevorelaciones_button","Nuevo Rel",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaProveedor,"guardarcambiostabla_button","Guardar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaProveedor,"cerrar_button","Salir",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturaProveedor.setToolTipText("Nuevo"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturaProveedor.setToolTipText("Duplicar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturaProveedor.setToolTipText("Copiar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturaProveedor.setToolTipText("Ver"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturaProveedor.setToolTipText("Nuevo Rel"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturaProveedor.setToolTipText("Guardar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaProveedor.setToolTipText("Salir"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaProveedor";
		inputMap = this.jButtonNuevoFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaProveedor"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturaProveedor";
		inputMap = this.jButtonDuplicarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturaProveedor"));
		
		//COPIAR
		sMapKey = "CopiarFacturaProveedor";
		inputMap = this.jButtonCopiarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturaProveedor"));
		
		//VEr FORM
		sMapKey = "VerFormFacturaProveedor";
		inputMap = this.jButtonVerFormFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturaProveedor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturaProveedor";
		inputMap = this.jButtonNuevoRelacionesFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturaProveedor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturaProveedor";
		inputMap = this.jButtonModificarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturaProveedor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturaProveedor";
		inputMap = this.jButtonCerrarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaProveedor";
		inputMap = this.jButtonGuardarCambiosTablaFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaProveedor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturaProveedor.setName("jPanelParametrosReportesFacturaProveedor"); 
		
		this.jPanelParametrosReportesAccionesFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturaProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturaProveedor.setName("jPanelParametrosReportesAccionesFacturaProveedor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturaProveedor = new JButtonMe();
		this.jButtonRecargarInformacionFacturaProveedor.setText("Recargar");
		this.jButtonRecargarInformacionFacturaProveedor.setToolTipText("Recargar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturaProveedor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFacturaProveedor = new JButtonMe();
		this.jButtonProcesarInformacionFacturaProveedor.setText("Procesar");
		this.jButtonProcesarInformacionFacturaProveedor.setToolTipText("Procesar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturaProveedor.setVisible(false);
			
		this.jButtonProcesarInformacionFacturaProveedor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaProveedor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaProveedor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaProveedor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturaProveedor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaProveedor.setText("TIPO");       
		this.jComboBoxTiposReportesFacturaProveedor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaProveedor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturaProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturaProveedor.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturaProveedor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturaProveedor.setText("Accion");
		this.jComboBoxTiposRelacionesFacturaProveedor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaProveedor.setText("Accion");
		this.jComboBoxTiposAccionesFacturaProveedor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturaProveedor.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturaProveedor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturaProveedor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturaProveedor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaProveedor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaProveedor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturaProveedor = new JLabelMe();
		
		this.jLabelAccionesFacturaProveedor.setText("Acciones");		
		this.jLabelAccionesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturaProveedor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturaProveedor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturaProveedor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturaProveedor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturaProveedor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturaProveedor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturaProveedor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturaProveedor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturaProveedor.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturaProveedor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturaProveedor = new JButtonMe();
		//this.jButtonAnterioresFacturaProveedor.setText("<<");
        this.jButtonAnterioresFacturaProveedor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturaProveedor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturaProveedor = new JButtonMe();
		//this.jButtonSiguientesFacturaProveedor.setText(">>");
        this.jButtonSiguientesFacturaProveedor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturaProveedor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturaProveedor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturaProveedor.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturaProveedor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturaProveedor,"nuevoguardarcambios_button","Nue",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturaProveedor";
		inputMap = this.jButtonNuevoGuardarCambiosFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturaProveedor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturaProveedor";
		inputMap = this.jButtonRecargarInformacionFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturaProveedor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturaProveedor";
		inputMap = this.jButtonSiguientesFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturaProveedor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturaProveedor";
		inputMap = this.jButtonAnterioresFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturaProveedor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturaProveedor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturaProveedor.setMinimumSize(new Dimension(this.getWidth(),FacturaProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaProveedor.setMaximumSize(new Dimension(this.getWidth(),FacturaProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaProveedor.setPreferredSize(new Dimension(this.getWidth(),FacturaProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturaProveedor = new GridBagLayout();

			this.jPanelPaginacionFacturaProveedor.setLayout(gridaBagLayoutPaginacionFacturaProveedor);						
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = 0;
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonAnterioresFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
					
						
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();//
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsFacturaProveedor.gridy = 0;//
			
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonNuevoGuardarCambiosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);//
						
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaProveedor.gridy = 0;
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonSiguientesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();//
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaProveedor.gridy = 1;//
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonNuevoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
				this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturaProveedor.gridy = 1;
				this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFacturaProveedor.add(this.jButtonNuevoRelacionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			}
			
			
			if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();//
				this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsFacturaProveedor.gridy = 1;//
				this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionFacturaProveedor.add(this.jButtonGuardarCambiosTablaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);//
			}
			
			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();//
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaProveedor.gridy = 1;//
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonDuplicarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);//
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();//
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaProveedor.gridy = 1;//
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonCopiarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);//
		
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();//
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaProveedor.gridy = 1;//
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonVerFormFacturaProveedor, this.gridBagConstraintsFacturaProveedor);//
		
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = 1;
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturaProveedor.add(this.jButtonCerrarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		
		this.jButtonRecargarInformacionFacturaProveedor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaProveedor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaProveedor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturaProveedor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaProveedor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaProveedor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturaProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturaProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturaProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturaProveedor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaProveedor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaProveedor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturaProveedor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaProveedor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaProveedor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturaProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaProveedor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturaProveedor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaProveedor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaProveedor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturaProveedor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturaProveedor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturaProveedor.setLayout(gridaBagParametrosReportesFacturaProveedor);
			this.jPanelParametrosReportesAccionesFacturaProveedor.setLayout(gridaBagParametrosReportesAccionesFacturaProveedor);
			
			
			this.jPanelParametrosAuxiliar1FacturaProveedor.setLayout(gridaBagParametrosAuxiliar1FacturaProveedor);
			this.jPanelParametrosAuxiliar2FacturaProveedor.setLayout(gridaBagParametrosAuxiliar2FacturaProveedor);
			this.jPanelParametrosAuxiliar3FacturaProveedor.setLayout(gridaBagParametrosAuxiliar3FacturaProveedor);
			this.jPanelParametrosAuxiliar4FacturaProveedor.setLayout(gridaBagParametrosAuxiliar4FacturaProveedor);
			//this.jPanelParametrosAuxiliar5FacturaProveedor.setLayout(gridaBagParametrosAuxiliar2FacturaProveedor);			
			
			
			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedor.add(this.jButtonRecargarInformacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaProveedor.add(this.jComboBoxTiposPaginacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaProveedor.add(this.jCheckBoxConAltoMaximoTablaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaProveedor.add(this.jComboBoxTiposArchivosReportesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedor.add(this.jPanelParametrosAuxiliar1FacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturaProveedor.add(this.jComboBoxTiposReportesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);																		
			
			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturaProveedor.add(this.jComboBoxTiposGraficosReportesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedor.add(this.jPanelParametrosAuxiliar4FacturaProveedor, this.gridBagConstraintsFacturaProveedor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedor.add(this.jComboBoxTiposReportesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedor.add(this.jCheckBoxGenerarReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedor.add(this.jPanelParametrosAuxiliar2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedor.add(this.jLabelAccionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
				this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturaProveedor.add(this.jButtonAbrirOrderByFacturaProveedor, this.gridBagConstraintsFacturaProveedor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedor.add(this.jComboBoxTiposSeleccionarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
			
			
			/*
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedor.add(this.jCheckBoxSeleccionarTodosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaProveedor.add(this.jCheckBoxConGraficoReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaProveedor.add(this.jCheckBoxSeleccionarTodosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);															
				
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaProveedor.add(this.jCheckBoxSeleccionadosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);															
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaProveedor.add(this.jCheckBoxConGraficoReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaProveedor.add(this.jPanelParametrosAuxiliar3FacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedor.add(this.jComboBoxTiposRelacionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
				
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedor.add(this.jComboBoxTiposAccionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	
				
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaProveedor.add(this.jTextFieldValorCampoGeneralFacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciogeneralFacturaProveedor.setLayout(gridaBagLayoutCamposIniciogeneralFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciodatos_facturaFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciodatos_facturaFacturaProveedor.setLayout(gridaBagLayoutCamposIniciodatos_facturaFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciodatos_retencion_0FacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.setLayout(gridaBagLayoutCamposIniciodatos_retencion_0FacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciodatos_retencionFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciodatos_retencionFacturaProveedor.setLayout(gridaBagLayoutCamposIniciodatos_retencionFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposInicioanexos_ivaFacturaProveedor= new GridBagLayout();
		this.jPanelCamposInicioanexos_ivaFacturaProveedor.setLayout(gridaBagLayoutCamposInicioanexos_ivaFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_contablesFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciocuentas_contablesFacturaProveedor.setLayout(gridaBagLayoutCamposIniciocuentas_contablesFacturaProveedor);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturaProveedor = new GridBagLayout();

			this.jScrollPanelDatosFacturaProveedor.setLayout(gridaBagLayoutDatosFacturaProveedor);
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = 0;
			this.gridBagConstraintsFacturaProveedor.gridx = 0;
			
			this.jScrollPanelDatosFacturaProveedor.add(this.jTableDatosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturaProveedor.setViewportView(this.jTableDatosFacturaProveedor);
		this.jTableDatosFacturaProveedor.setFillsViewportHeight(true);
		this.jTableDatosFacturaProveedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturaProveedor= new GridBagLayout();
		this.jPanelAccionesFacturaProveedor.setLayout(gridaBagLayoutAccionesFacturaProveedor);
		
		
		/*	
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
			
		this.jPanelAccionesFacturaProveedor.add(this.jButtonNuevoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdClienteFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteFacturaProveedor.setLayout(gridaBagLayoutFK_IdClienteFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdClienteFacturaProveedor.add(jLabelid_clienteFK_IdClienteFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdClienteFacturaProveedor.add(jComboBoxid_clienteFK_IdClienteFacturaProveedor, gridBagConstraintsFacturaProveedor);


		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdClienteFacturaProveedor.add(this.jButtonBuscarFK_IdClienteid_clienteFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdClienteFacturaProveedor.add(jButtonFK_IdClienteFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("1.-Por Proveedor ", jPanelFK_IdClienteFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.add(jLabelid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.add(jComboBoxid_cuenta_contable_credito_fiscal_bienesFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor.add(jButtonFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("2.-Por Credito Fiscal Bienes ", jPanelFK_IdCuentaContableCreditoFiscalBienesFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.add(jLabelid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.add(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor.add(jButtonFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("3.-Por Credito Fiscal Servicios ", jPanelFK_IdCuentaContableCreditoFiscalServiciosFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableGasto2FacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableGasto2FacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableGasto2FacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableGasto2FacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableGasto2FacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableGasto2FacturaProveedor.setLayout(gridaBagLayoutFK_IdCuentaContableGasto2FacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdCuentaContableGasto2FacturaProveedor.add(jLabelid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdCuentaContableGasto2FacturaProveedor.add(jComboBoxid_cuenta_contable_gasto2FK_IdCuentaContableGasto2FacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdCuentaContableGasto2FacturaProveedor.add(jButtonFK_IdCuentaContableGasto2FacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("4.-Por C. Gasto 2 ", jPanelFK_IdCuentaContableGasto2FacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoFacturaProveedor.setLayout(gridaBagLayoutFK_IdEmpleadoFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdEmpleadoFacturaProveedor.add(jLabelid_empleadoFK_IdEmpleadoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdEmpleadoFacturaProveedor.add(jComboBoxid_empleadoFK_IdEmpleadoFacturaProveedor, gridBagConstraintsFacturaProveedor);


		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdEmpleadoFacturaProveedor.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdEmpleadoFacturaProveedor.add(jButtonFK_IdEmpleadoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("5.-Por Empl.Autoriza ", jPanelFK_IdEmpleadoFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdPlantillaFacturaFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdPlantillaFacturaFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPlantillaFacturaFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPlantillaFacturaFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPlantillaFacturaFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPlantillaFacturaFacturaProveedor.setLayout(gridaBagLayoutFK_IdPlantillaFacturaFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdPlantillaFacturaFacturaProveedor.add(jLabelid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdPlantillaFacturaFacturaProveedor.add(jComboBoxid_plantilla_facturaFK_IdPlantillaFacturaFacturaProveedor, gridBagConstraintsFacturaProveedor);


		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdPlantillaFacturaFacturaProveedor.add(this.jButtonBuscarFK_IdPlantillaFacturaid_plantilla_facturaFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdPlantillaFacturaFacturaProveedor.add(jButtonFK_IdPlantillaFacturaFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("6.-Por Plantilla Factura ", jPanelFK_IdPlantillaFacturaFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdResponsableFondoFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdResponsableFondoFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdResponsableFondoFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdResponsableFondoFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdResponsableFondoFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdResponsableFondoFacturaProveedor.setLayout(gridaBagLayoutFK_IdResponsableFondoFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdResponsableFondoFacturaProveedor.add(jLabelid_responsable_fondoFK_IdResponsableFondoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdResponsableFondoFacturaProveedor.add(jComboBoxid_responsable_fondoFK_IdResponsableFondoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdResponsableFondoFacturaProveedor.add(jButtonFK_IdResponsableFondoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("7.-Por Responsable ", jPanelFK_IdResponsableFondoFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoFacturaProveedor.setLayout(gridaBagLayoutFK_IdTipoDocumentoFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdTipoDocumentoFacturaProveedor.add(jLabelid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdTipoDocumentoFacturaProveedor.add(jComboBoxid_tipo_documentoFK_IdTipoDocumentoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdTipoDocumentoFacturaProveedor.add(jButtonFK_IdTipoDocumentoFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("8.-Por T. Documento ", jPanelFK_IdTipoDocumentoFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoModuloFacturaProveedor.setLayout(gridaBagLayoutFK_IdTipoMovimientoModuloFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdTipoMovimientoModuloFacturaProveedor.add(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdTipoMovimientoModuloFacturaProveedor.add(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdTipoMovimientoModuloFacturaProveedor.add(jButtonFK_IdTipoMovimientoModuloFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("9.-Por Tipo Movimiento Modulo ", jPanelFK_IdTipoMovimientoModuloFacturaProveedor);
		jTabbedPaneBusquedasFacturaProveedor.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionFuente1FacturaProveedor.setLayout(gridaBagLayoutFK_IdTipoRetencionFuente1FacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdTipoRetencionFuente1FacturaProveedor.add(jLabelid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdTipoRetencionFuente1FacturaProveedor.add(jComboBoxid_tipo_retencion_fuente1FK_IdTipoRetencionFuente1FacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdTipoRetencionFuente1FacturaProveedor.add(jButtonFK_IdTipoRetencionFuente1FacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("10.-Por Ret. Fuente 1 ", jPanelFK_IdTipoRetencionFuente1FacturaProveedor);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIva1FacturaProveedor.setLayout(gridaBagLayoutFK_IdTipoRetencionIva1FacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdTipoRetencionIva1FacturaProveedor.add(jLabelid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdTipoRetencionIva1FacturaProveedor.add(jComboBoxid_tipo_retencion_iva1FK_IdTipoRetencionIva1FacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdTipoRetencionIva1FacturaProveedor.add(jButtonFK_IdTipoRetencionIva1FacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("11.-Por Ret Iva B. ", jPanelFK_IdTipoRetencionIva1FacturaProveedor);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloFacturaProveedor.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloFacturaProveedor.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloFacturaProveedor.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdTipoTransaccionModuloFacturaProveedor.add(jButtonFK_IdTipoTransaccionModuloFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("12.-Por Tipo Comprobante ", jPanelFK_IdTipoTransaccionModuloFacturaProveedor);

		GridBagLayout gridaBagLayoutFK_IdTipoTributarioFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTributarioFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTributarioFacturaProveedor.setLayout(gridaBagLayoutFK_IdTipoTributarioFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdTipoTributarioFacturaProveedor.add(jLabelid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdTipoTributarioFacturaProveedor.add(jComboBoxid_tipo_tributarioFK_IdTipoTributarioFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdTipoTributarioFacturaProveedor.add(jButtonFK_IdTipoTributarioFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("13.-Por Sustento Trib. ", jPanelFK_IdTipoTributarioFacturaProveedor);

		GridBagLayout gridaBagLayoutFK_IdTransaccionFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionFacturaProveedor.setLayout(gridaBagLayoutFK_IdTransaccionFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 0;
		jPanelFK_IdTransaccionFacturaProveedor.add(jLabelid_transaccionFK_IdTransaccionFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 0;
		gridBagConstraintsFacturaProveedor.gridx = 1;
		jPanelFK_IdTransaccionFacturaProveedor.add(jComboBoxid_transaccionFK_IdTransaccionFacturaProveedor, gridBagConstraintsFacturaProveedor);

		gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaProveedor.gridy = 1;
		gridBagConstraintsFacturaProveedor.gridx =1;
		jPanelFK_IdTransaccionFacturaProveedor.add(jButtonFK_IdTransaccionFacturaProveedor, gridBagConstraintsFacturaProveedor);

		jTabbedPaneBusquedasFacturaProveedor.addTab("14.-Por T.Comprobante ", jPanelFK_IdTransaccionFacturaProveedor);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaProveedor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();						
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaProveedor.gridx = 0;		
			//this.gridBagConstraintsFacturaProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaProveedor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturaProveedor.gridx = 0;		
		//this.gridBagConstraintsFacturaProveedor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturaProveedor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturaProveedor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaProveedor.gridx = 0;		
			this.gridBagConstraintsFacturaProveedor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturaProveedor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturaProveedor, this.gridBagConstraintsFacturaProveedor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);								
		
		
		/*
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		*/		
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaProveedor.gridx =0;
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
				
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FacturaProveedorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaProveedor = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturaProveedor.setLayout(gridaBagLayoutBusquedasParametrosFacturaProveedor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturaProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			
			
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
			
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturaProveedor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturaProveedor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturaProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturaProveedor.setName("jPanelReporteDinamicoFacturaProveedor"); 
		
		this.jPanelReporteDinamicoFacturaProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturaProveedor.setLayout(gridaBagLayoutReporteDinamicoFacturaProveedor);
		
		
		this.jInternalFrameReporteDinamicoFacturaProveedor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturaProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturaProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturaProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturaProveedor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturaProveedor.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturaProveedor.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturaProveedor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturaProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturaProveedor = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturaProveedor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelColumnasSelectReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturaProveedor = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturaProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturaProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturaProveedor=new JScrollPane(this.jListColumnasSelectReporteFacturaProveedor);
			
			this.jScrollColumnasSelectReporteFacturaProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaProveedor.add(this.jListColumnasSelectReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jScrollColumnasSelectReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturaProveedor = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturaProveedor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelRelacionesSelectReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturaProveedor = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturaProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturaProveedor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaProveedor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturaProveedor=new JScrollPane(this.jListRelacionesSelectReporteFacturaProveedor);
			
			this.jScrollRelacionesSelectReporteFacturaProveedor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaProveedor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaProveedor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaProveedor.add(this.jListRelacionesSelectReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jScrollRelacionesSelectReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFacturaProveedor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturaProveedor = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturaProveedor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturaProveedor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturaProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturaProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturaProveedor = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturaProveedor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelConGraficoDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturaProveedor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturaProveedor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturaProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaProveedor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jCheckBoxConGraficoDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturaProveedor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturaProveedor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelColumnaCategoriaGraficoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaProveedor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturaProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jComboBoxColumnaCategoriaGraficoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturaProveedor = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturaProveedor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelColumnaCategoriaValorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturaProveedor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturaProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jComboBoxColumnaCategoriaValorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturaProveedor = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturaProveedor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelColumnasValoresGraficoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturaProveedor = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturaProveedor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturaProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturaProveedor=new JScrollPane(this.jListColumnasValoresGraficoFacturaProveedor);
			
			this.jScrollColumnasValoresGraficoFacturaProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturaProveedor.add(this.jListColumnasSelectReporteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jScrollColumnasValoresGraficoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturaProveedor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelTiposGraficosReportesDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaProveedor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jComboBoxTiposGraficosReportesDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturaProveedor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelGenerarExcelReporteDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturaProveedor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturaProveedor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturaProveedor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturaProveedor.setToolTipText("Generar EXCEL"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturaProveedor.add(this.jButtonGenerarExcelReporteDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jComboBoxTiposReportesDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturaProveedor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jLabelTiposArchivoReporteDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jComboBoxTiposArchivosReportesDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturaProveedor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturaProveedor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturaProveedor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturaProveedor.setToolTipText("Generar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jButtonGenerarReporteDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturaProveedor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturaProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturaProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturaProveedor.setToolTipText("Cancelar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaProveedor.add(this.jButtonCerrarReporteDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturaProveedor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturaProveedor= new JScrollPane(jPanelReporteDinamicoFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturaProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturaProveedor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturaProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturaProveedor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturaProveedor);
		this.jInternalFrameReporteDinamicoFacturaProveedor.getContentPane().add(this.jScrollPanelReporteDinamicoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturaProveedor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturaProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturaProveedor.setName("jPanelImportacionFacturaProveedor"); 
		
		this.jPanelImportacionFacturaProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturaProveedor.setLayout(gridaBagLayoutImportacionFacturaProveedor);
		
		
		this.jInternalFrameImportacionFacturaProveedor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturaProveedor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturaProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturaProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaProveedor.setResizable(true);
	    this.jInternalFrameImportacionFacturaProveedor.setClosable(true);
	    this.jInternalFrameImportacionFacturaProveedor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaProveedor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturaProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaProveedor.setResizable(true);
	    this.jInternalFrameImportacionFacturaProveedor.setClosable(true);
	    this.jInternalFrameImportacionFacturaProveedor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturaProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturaProveedor = new JLabelMe();

		this.jLabelArchivoImportacionFacturaProveedor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaProveedor.add(this.jLabelArchivoImportacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturaProveedor = new JFileChooser();		
		this.jFileChooserImportacionFacturaProveedor.setToolTipText("ESCOGER ARCHIVO"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturaProveedor = new JButtonMe();
		this.jButtonAbrirImportacionFacturaProveedor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturaProveedor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturaProveedor.setToolTipText("Generar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedor.add(this.jButtonAbrirImportacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturaProveedor = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturaProveedor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaProveedor.add(this.jLabelPathArchivoImportacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturaProveedor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturaProveedor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaProveedor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaProveedor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedor.add(this.jTextFieldPathArchivoImportacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturaProveedor = new JButtonMe();
		this.jButtonGenerarImportacionFacturaProveedor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturaProveedor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturaProveedor.setToolTipText("Generar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedor.add(this.jButtonGenerarImportacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturaProveedor = new JButtonMe();
		this.jButtonCerrarImportacionFacturaProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturaProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturaProveedor.setToolTipText("Cancelar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaProveedor.add(this.jButtonCerrarImportacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturaProveedor = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturaProveedor= new JScrollPane(jPanelImportacionFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturaProveedor.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturaProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturaProveedor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturaProveedor);
		this.jInternalFrameImportacionFacturaProveedor.getContentPane().add(this.jScrollPanelImportacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturaProveedor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturaProveedor = new JButtonMe();
			this.jButtonAbrirOrderByFacturaProveedor.setText("Orden");
			this.jButtonAbrirOrderByFacturaProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaProveedor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturaProveedor";
			inputMap = this.jButtonAbrirOrderByFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturaProveedor"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturaProveedor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturaProveedor.setName("jPanelOrderByFacturaProveedor"); 
			
			this.jPanelOrderByFacturaProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturaProveedor.setLayout(gridaBagLayoutOrderByFacturaProveedor);
			
			
			this.jTableDatosFacturaProveedorOrderBy = new JTableMe();        
			this.jTableDatosFacturaProveedorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturaProveedorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturaProveedorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturaProveedorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturaProveedorOrderBy.setViewportView(this.jTableDatosFacturaProveedorOrderBy);
			this.jTableDatosFacturaProveedorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturaProveedorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturaProveedor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturaProveedor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturaProveedor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturaProveedor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturaProveedor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturaProveedor.setTitle("Orden");
			this.jInternalFrameOrderByFacturaProveedor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturaProveedor.setResizable(true);
			this.jInternalFrameOrderByFacturaProveedor.setClosable(true);
			this.jInternalFrameOrderByFacturaProveedor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturaProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturaProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturaProveedor.ipady =150;
				
			this.jPanelOrderByFacturaProveedor.add(jScrollPanelDatosFacturaProveedorOrderBy, this.gridBagConstraintsFacturaProveedor);//this.jTableDatosFacturaProveedorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturaProveedor = new JButtonMe();
			this.jButtonCerrarOrderByFacturaProveedor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturaProveedor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturaProveedor.setToolTipText("Cancelar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturaProveedor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturaProveedor.add(this.jButtonCerrarOrderByFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturaProveedor = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturaProveedor= new JScrollPane(jPanelOrderByFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturaProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturaProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturaProveedor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturaProveedor);
			
			this.jInternalFrameOrderByFacturaProveedor.getContentPane().add(this.jScrollPanelOrderByFacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
		
		} else {
			this.jButtonAbrirOrderByFacturaProveedor = new JButtonMe();
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
		int iWidthTableCalculado=0;//15230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=6630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=8500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.facturaproveedorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturaProveedor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturaProveedor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturaProveedor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFacturaProveedor.getRowHeight();//FacturaProveedorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaProveedor.isSelected()) {
					iHeightTable=FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaProveedor.isSelected()) {
					iHeightTable=FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturaProveedor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaProveedor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaProveedor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturaProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturaProveedor!=null && this.jInternalFrameOrderByFacturaProveedor.getjTableDatosOrderBy()!=null) {
			//if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturaProveedor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturaProveedor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturaProveedor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturaProveedor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturaProveedor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturaProveedor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturaProveedor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturaProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=facturaproveedorLogic.getFacturaProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaproveedors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<FacturaProveedor> TraerFacturaProveedorBeans(List<FacturaProveedor> facturaproveedors,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturaProveedor facturaproveedor:facturaproveedors) {
					
				if(!(FacturaProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturaProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturaproveedor.setsDetalleGeneralEntityReporte(FacturaProveedorConstantesFunciones.getFacturaProveedorDescripcion(facturaproveedor));
										
					facturaproveedor.setcon_activos_descripcion(FacturaProveedorConstantesFunciones.getcon_activosDescripcion(facturaproveedor));facturaproveedor.setcon_rise_descripcion(FacturaProveedorConstantesFunciones.getcon_riseDescripcion(facturaproveedor));facturaproveedor.setcon_sitios_descripcion(FacturaProveedorConstantesFunciones.getcon_sitiosDescripcion(facturaproveedor));facturaproveedor.setcon_monto_objeto_iva_descripcion(FacturaProveedorConstantesFunciones.getcon_monto_objeto_ivaDescripcion(facturaproveedor));	
					
					

					if(facturaproveedor.getDetalleFacturaProveedors()!=null && Funciones.existeClass(classes,DetalleFacturaProveedor.class)) {
						try{facturaproveedor.setdetallefacturaproveedorsDescripcionReporte(new JRBeanCollectionDataSource(DetalleFacturaProveedorJInternalFrame.TraerDetalleFacturaProveedorBeans(facturaproveedor.getDetalleFacturaProveedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//facturaproveedor.setsDetalleGeneralEntityReporte(facturaproveedor.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturaproveedorbeans.add(facturaproveedorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturaproveedors;
    }
	//PARA REPORTES FIN
}
