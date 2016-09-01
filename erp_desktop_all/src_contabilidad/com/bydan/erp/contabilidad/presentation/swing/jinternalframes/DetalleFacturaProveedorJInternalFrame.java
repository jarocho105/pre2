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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.contabilidad.util.DetalleFacturaProveedorConstantesFunciones;

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
public class DetalleFacturaProveedorJInternalFrame extends DetalleFacturaProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleFacturaProveedor;
	
	protected JMenuBar jmenuBarDetalleFacturaProveedor;
	
	protected JMenu jmenuDetalleFacturaProveedor;
	protected JMenu jmenuDatosDetalleFacturaProveedor;
	protected JMenu jmenuArchivoDetalleFacturaProveedor;
	protected JMenu jmenuAccionesDetalleFacturaProveedor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFacturaProveedor;	
	protected GridBagConstraints gridBagConstraintsDetalleFacturaProveedor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleFacturaProveedorDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleFacturaProveedor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleFacturaProveedor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleFacturaProveedor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturaproveedor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";

	protected BodegaBeanSwingJInternalFrame bodegaenviarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegaenviar="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleFacturaProveedorSessionBean detallefacturaproveedorSessionBean;
		
	
	
	public FacturaProveedorSessionBean facturaproveedorSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public BodegaSessionBean bodegaenviarSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleFacturaProveedor> detallefacturaproveedors;		
	public List<DetalleFacturaProveedor> detallefacturaproveedorsEliminados;	
	public List<DetalleFacturaProveedor> detallefacturaproveedorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleFacturaProveedor;		
	protected JButton jButtonAbrirOrderByDetalleFacturaProveedor;
	
	
	//protected JPanel jPanelOrderByDetalleFacturaProveedor;
	//public JScrollPane jScrollPanelOrderByDetalleFacturaProveedor;	
	//protected JButton jButtonCerrarOrderByDetalleFacturaProveedor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleFacturaProveedorLogic detallefacturaproveedorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleFacturaProveedor;
	public JScrollPane jScrollPanelDatosEdicionDetalleFacturaProveedor;
	public JScrollPane jScrollPanelDatosGeneralDetalleFacturaProveedor;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleFacturaProveedorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleFacturaProveedor;
	//public JScrollPane jScrollPanelImportacionDetalleFacturaProveedor;
	
	
	
	protected JPanel jPanelAccionesDetalleFacturaProveedor;
	
    protected JPanel jPanelPaginacionDetalleFacturaProveedor;
    protected JPanel jPanelParametrosReportesDetalleFacturaProveedor;
	protected JPanel jPanelParametrosReportesAccionesDetalleFacturaProveedor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleFacturaProveedor;
	protected JPanel jPanelParametrosAuxiliar2DetalleFacturaProveedor;
	protected JPanel jPanelParametrosAuxiliar3DetalleFacturaProveedor;
	protected JPanel jPanelParametrosAuxiliar4DetalleFacturaProveedor;
	//protected JPanel jPanelParametrosAuxiliar5DetalleFacturaProveedor;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleFacturaProveedor;
	//protected JPanel jPanelImportacionDetalleFacturaProveedor;
	
	
	public JTable jTableDatosDetalleFacturaProveedor;
	
	
	
	//public JTable jTableDatosDetalleFacturaProveedorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleFacturaProveedor;
	protected JButton jButtonDuplicarDetalleFacturaProveedor;
	protected JButton jButtonCopiarDetalleFacturaProveedor;
	protected JButton jButtonVerFormDetalleFacturaProveedor;
	protected JButton jButtonNuevoRelacionesDetalleFacturaProveedor;
	protected JButton jButtonModificarDetalleFacturaProveedor;
	
    protected JButton jButtonGuardarCambiosTablaDetalleFacturaProveedor;
	protected JButton jButtonCerrarDetalleFacturaProveedor;
	
	
	protected JButton jButtonRecargarInformacionDetalleFacturaProveedor;
	protected JButton jButtonProcesarInformacionDetalleFacturaProveedor;
	
	
	protected JButton jButtonAnterioresDetalleFacturaProveedor;
	protected JButton jButtonSiguientesDetalleFacturaProveedor;
	protected JButton jButtonNuevoGuardarCambiosDetalleFacturaProveedor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleFacturaProveedor;
	//protected JButton jButtonCerrarReporteDinamicoDetalleFacturaProveedor;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleFacturaProveedor;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleFacturaProveedor;
	//protected JButton jButtonGenerarImportacionDetalleFacturaProveedor;
	//protected JButton jButtonCerrarImportacionDetalleFacturaProveedor;
	//protected JFileChooser jFileChooserImportacionDetalleFacturaProveedor;
	//protected File fileImportacionDetalleFacturaProveedor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFacturaProveedor;
	protected JButton jButtonDuplicarToolBarDetalleFacturaProveedor;
	protected JButton jButtonNuevoRelacionesToolBarDetalleFacturaProveedor;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleFacturaProveedor;
	protected JButton jButtonCopiarToolBarDetalleFacturaProveedor;
	protected JButton jButtonVerFormToolBarDetalleFacturaProveedor;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleFacturaProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFacturaProveedor;
	protected JButton jButtonCerrarToolBarDetalleFacturaProveedor;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleFacturaProveedor;
	protected JButton jButtonProcesarInformacionToolBarDetalleFacturaProveedor;
	protected JButton jButtonAnterioresToolBarDetalleFacturaProveedor;
	protected JButton jButtonSiguientesToolBarDetalleFacturaProveedor;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleFacturaProveedor;
	protected JButton jButtonAbrirOrderByToolBarDetalleFacturaProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFacturaProveedor;
	protected JMenuItem jMenuItemDuplicarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleFacturaProveedor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleFacturaProveedor;
	protected JMenuItem jMenuItemCopiarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemVerFormDetalleFacturaProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFacturaProveedor;
	protected JMenuItem jMenuItemCerrarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleFacturaProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFacturaProveedor;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleFacturaProveedor;
	protected JMenuItem jMenuItemProcesarInformacionDetalleFacturaProveedor;
	protected JMenuItem jMenuItemAnterioresDetalleFacturaProveedor;
	protected JMenuItem jMenuItemSiguientesDetalleFacturaProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFacturaProveedor;
	protected JMenuItem jMenuItemAbrirOrderByDetalleFacturaProveedor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFacturaProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFacturaProveedor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleFacturaProveedor;
	protected JCheckBox jCheckBoxSeleccionadosDetalleFacturaProveedor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleFacturaProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleFacturaProveedor;
	protected JTextField jTextFieldValorCampoGeneralDetalleFacturaProveedor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleFacturaProveedor;
	//public JList<Reporte> jListColumnasSelectReporteDetalleFacturaProveedor;
	//public JScrollPane jScrollColumnasSelectReporteDetalleFacturaProveedor;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleFacturaProveedor;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleFacturaProveedor;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleFacturaProveedor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleFacturaProveedor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleFacturaProveedor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleFacturaProveedor;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleFacturaProveedor;
	
		
	//public JLabel jLabelArchivoImportacionDetalleFacturaProveedor;	
	//public JLabel jLabelPathArchivoImportacionDetalleFacturaProveedor;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleFacturaProveedor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleFacturaProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleFacturaProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleFacturaProveedor;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleFacturaProveedor;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleFacturaProveedor;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleFacturaProveedor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleFacturaProveedor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleFacturaProveedor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleFacturaProveedor;
	public JPanel jPanelFK_IdAnioDetalleFacturaProveedor;
	public JButton jButtonFK_IdAnioDetalleFacturaProveedor;
	public JPanel jPanelFK_IdBodegaDetalleFacturaProveedor;
	public JButton jButtonFK_IdBodegaDetalleFacturaProveedor;
	public JPanel jPanelFK_IdBodegaEnviarDetalleFacturaProveedor;
	public JButton jButtonFK_IdBodegaEnviarDetalleFacturaProveedor;
	public JPanel jPanelFK_IdCentroCostoDetalleFacturaProveedor;
	public JButton jButtonFK_IdCentroCostoDetalleFacturaProveedor;
	public JPanel jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor;
	public JButton jButtonFK_IdCuentaContableCostoDetalleFacturaProveedor;
	public JPanel jPanelFK_IdFacturaProveedorDetalleFacturaProveedor;
	public JButton jButtonFK_IdFacturaProveedorDetalleFacturaProveedor;
	public JPanel jPanelFK_IdMesDetalleFacturaProveedor;
	public JButton jButtonFK_IdMesDetalleFacturaProveedor;
	public JPanel jPanelFK_IdNovedadProductoDetalleFacturaProveedor;
	public JButton jButtonFK_IdNovedadProductoDetalleFacturaProveedor;
	public JPanel jPanelFK_IdProductoDetalleFacturaProveedor;
	public JButton jButtonFK_IdProductoDetalleFacturaProveedor;
	public JPanel jPanelFK_IdUnidadDetalleFacturaProveedor;
	public JButton jButtonFK_IdUnidadDetalleFacturaProveedor;
	
	public JPanel jPanelid_anioFK_IdAnioDetalleFacturaProveedor;
	public JLabel jLabelid_anioFK_IdAnioDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioDetalleFacturaProveedor;
	public JButton jButtonid_anioFK_IdAnioDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleFacturaProveedor;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleFacturaProveedor;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor;
	public JLabel jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor;
	public JButton jButtonid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleFacturaProveedorArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor;
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedorArbol= new JButtonMe();

	
	public JPanel jPanelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor;
	public JLabel jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor;
	public JButton jButtonid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesDetalleFacturaProveedor;
	public JLabel jLabelid_mesFK_IdMesDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesDetalleFacturaProveedor;
	public JButton jButtonid_mesFK_IdMesDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor;
	public JLabel jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor;
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleFacturaProveedor;
	public JLabel jLabelid_productoFK_IdProductoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleFacturaProveedor;
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleFacturaProveedor;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleFacturaProveedor;
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1480;//(screenSize.width-screenSize.width/2)+(250*3);
	//public int iHeightFormulario=561;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleFacturaProveedorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaProveedorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaProveedorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaProveedorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleFacturaProveedor)	{
		this.jButtonRecargarInformacionDetalleFacturaProveedor = jButtonRecargarInformacionDetalleFacturaProveedor;
	}
	
	public JButton getjButtonProcesarInformacionDetalleFacturaProveedor() {
		return this.jButtonProcesarInformacionDetalleFacturaProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFacturaProveedor)	{
		this.jButtonProcesarInformacionDetalleFacturaProveedor = jButtonProcesarInformacionDetalleFacturaProveedor;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleFacturaProveedor() {
		return this.jButtonRecargarInformacionDetalleFacturaProveedor;
	}
	
	
	public List<DetalleFacturaProveedor> getdetallefacturaproveedors() {
		return this.detallefacturaproveedors;
	}

	public void setdetallefacturaproveedors(List<DetalleFacturaProveedor> detallefacturaproveedors) {
		this.detallefacturaproveedors = detallefacturaproveedors;
	}
	
	public List<DetalleFacturaProveedor> getdetallefacturaproveedorsAux() {
		return this.detallefacturaproveedorsAux;
	}

	public void setdetallefacturaproveedorsAux(List<DetalleFacturaProveedor> detallefacturaproveedorsAux) {
		this.detallefacturaproveedorsAux = detallefacturaproveedorsAux;
	}
	
	public List<DetalleFacturaProveedor> getdetallefacturaproveedorsEliminados() {
		return this.detallefacturaproveedorsEliminados;
	}

	public void setDetalleFacturaProveedorsEliminados(List<DetalleFacturaProveedor> detallefacturaproveedorsEliminados) {
		this.detallefacturaproveedorsEliminados = detallefacturaproveedorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleFacturaProveedor() {
		return jComboBoxTiposSeleccionarDetalleFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleFacturaProveedor(
			JComboBox jComboBoxTiposSeleccionarDetalleFacturaProveedor) {
		this.jComboBoxTiposSeleccionarDetalleFacturaProveedor = jComboBoxTiposSeleccionarDetalleFacturaProveedor;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleFacturaProveedor() {
		return jTextFieldValorCampoGeneralDetalleFacturaProveedor;
	}

	public void setjTextFieldValorCampoGeneralDetalleFacturaProveedor(
			JTextField jTextFieldValorCampoGeneralDetalleFacturaProveedor) {
		this.jTextFieldValorCampoGeneralDetalleFacturaProveedor = jTextFieldValorCampoGeneralDetalleFacturaProveedor;
	}

	public void setBorderResaltarValorCampoGeneralDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleFacturaProveedor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleFacturaProveedor() {
		return this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor;
	}

	public void setjCheckBoxSeleccionarTodosDetalleFacturaProveedor(
			JCheckBox jCheckBoxSeleccionarTodosDetalleFacturaProveedor) {
		this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor = jCheckBoxSeleccionarTodosDetalleFacturaProveedor;
	}

	public void setBorderResaltarSeleccionarTodosDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleFacturaProveedor() {
		return this.jCheckBoxSeleccionadosDetalleFacturaProveedor;
	}

	public void setjCheckBoxSeleccionadosDetalleFacturaProveedor(
			JCheckBox jCheckBoxSeleccionadosDetalleFacturaProveedor) {
		this.jCheckBoxSeleccionadosDetalleFacturaProveedor = jCheckBoxSeleccionadosDetalleFacturaProveedor;
	}
	
	public void setBorderResaltarSeleccionadosDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleFacturaProveedor() {
		return this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleFacturaProveedor(
			JComboBox jComboBoxTiposArchivosReportesDetalleFacturaProveedor) {
		this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor = jComboBoxTiposArchivosReportesDetalleFacturaProveedor;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleFacturaProveedor() {
		return this.jComboBoxTiposReportesDetalleFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleFacturaProveedor(
			JComboBox jComboBoxTiposReportesDetalleFacturaProveedor) {
		this.jComboBoxTiposReportesDetalleFacturaProveedor = jComboBoxTiposReportesDetalleFacturaProveedor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleFacturaProveedor() {
	//	return jComboBoxTiposReportesDinamicoDetalleFacturaProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleFacturaProveedor(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleFacturaProveedor) {
	//	this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor = jComboBoxTiposReportesDinamicoDetalleFacturaProveedor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor = jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor;
	//}
	
	public void setBorderResaltarTiposReportesDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleFacturaProveedor() {
		return this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleFacturaProveedor(
			JComboBox jComboBoxTiposGraficosReportesDetalleFacturaProveedor) {
		this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor = jComboBoxTiposGraficosReportesDetalleFacturaProveedor;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleFacturaProveedor() {
		return this.jComboBoxTiposPaginacionDetalleFacturaProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleFacturaProveedor(
			JComboBox jComboBoxTiposPaginacionDetalleFacturaProveedor) {
		this.jComboBoxTiposPaginacionDetalleFacturaProveedor = jComboBoxTiposPaginacionDetalleFacturaProveedor;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleFacturaProveedor() {
		return this.jComboBoxTiposRelacionesDetalleFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFacturaProveedor() {
		return this.jComboBoxTiposAccionesDetalleFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFacturaProveedor(
			JComboBox jComboBoxTiposRelacionesDetalleFacturaProveedor) {
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor = jComboBoxTiposRelacionesDetalleFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFacturaProveedor(
			JComboBox jComboBoxTiposAccionesDetalleFacturaProveedor) {
		this.jComboBoxTiposAccionesDetalleFacturaProveedor = jComboBoxTiposAccionesDetalleFacturaProveedor;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleFacturaProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleFacturaProveedor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleFacturaProveedor() {
	//	return jCheckBoxConGraficoDinamicoDetalleFacturaProveedor;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleFacturaProveedor(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleFacturaProveedor) {
	//	this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor = jCheckBoxConGraficoDinamicoDetalleFacturaProveedor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleFacturaProveedor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleFacturaProveedor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor .setBorder(borderResaltar);		
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
		this.detallefacturaproveedorSessionBean=new DetalleFacturaProveedorSessionBean();
		
		this.detallefacturaproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturaProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Factura Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 3250) {
			iWidth=3250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaProveedor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"nuevo","nuevo","Nuevo"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"duplicar","duplicar","Duplicar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"copiar","copiar","Copiar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"ver_form","ver_form","Ver"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"recargar","recargar","Recargar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"cerrar","cerrar","Salir"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleFacturaProveedor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleFacturaProveedor;
			
				this.jButtonProcesarInformacionToolBarDetalleFacturaProveedor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleFacturaProveedor;
				
		//protected JButton jButtonModificarToolBarDetalleFacturaProveedor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleFacturaProveedor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleFacturaProveedor=new JMenuMe("General");
		this.jmenuArchivoDetalleFacturaProveedor=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleFacturaProveedor=new JMenuMe("Acciones");
		this.jmenuDatosDetalleFacturaProveedor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFacturaProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFacturaProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFacturaProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleFacturaProveedor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleFacturaProveedor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleFacturaProveedor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleFacturaProveedor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleFacturaProveedor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleFacturaProveedor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleFacturaProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFacturaProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFacturaProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleFacturaProveedor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleFacturaProveedor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleFacturaProveedor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleFacturaProveedor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleFacturaProveedor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleFacturaProveedor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleFacturaProveedor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleFacturaProveedor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleFacturaProveedor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFacturaProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFacturaProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFacturaProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleFacturaProveedor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleFacturaProveedor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleFacturaProveedor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleFacturaProveedor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleFacturaProveedor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleFacturaProveedor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleFacturaProveedor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleFacturaProveedor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleFacturaProveedor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleFacturaProveedor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleFacturaProveedor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleFacturaProveedor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleFacturaProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleFacturaProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleFacturaProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleFacturaProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleFacturaProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleFacturaProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleFacturaProveedor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleFacturaProveedor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleFacturaProveedor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleFacturaProveedor.add(this.jMenuItemCerrarDetalleFacturaProveedor);
			
			this.jmenuAccionesDetalleFacturaProveedor.add(this.jMenuItemNuevoDetalleFacturaProveedor);
			this.jmenuAccionesDetalleFacturaProveedor.add(this.jMenuItemNuevoGuardarCambiosDetalleFacturaProveedor);
			this.jmenuAccionesDetalleFacturaProveedor.add(this.jMenuItemNuevoRelacionesDetalleFacturaProveedor);
			this.jmenuAccionesDetalleFacturaProveedor.add(this.jMenuItemGuardarCambiosTablaDetalleFacturaProveedor);		
			this.jmenuAccionesDetalleFacturaProveedor.add(this.jMenuItemDuplicarDetalleFacturaProveedor);		
			this.jmenuAccionesDetalleFacturaProveedor.add(this.jMenuItemCopiarDetalleFacturaProveedor);		
			this.jmenuAccionesDetalleFacturaProveedor.add(this.jMenuItemVerFormDetalleFacturaProveedor);		
			
			this.jmenuDatosDetalleFacturaProveedor.add(this.jMenuItemRecargarInformacionDetalleFacturaProveedor);				
			this.jmenuDatosDetalleFacturaProveedor.add(this.jMenuItemAnterioresDetalleFacturaProveedor);				
			this.jmenuDatosDetalleFacturaProveedor.add(this.jMenuItemSiguientesDetalleFacturaProveedor);				
			this.jmenuDatosDetalleFacturaProveedor.add(this.jMenuItemAbrirOrderByDetalleFacturaProveedor);				
			this.jmenuDatosDetalleFacturaProveedor.add(this.jMenuItemMostrarOcultarDetalleFacturaProveedor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleFacturaProveedor.add(this.jMenuItemGuardarCambiosDetalleFacturaProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFacturaProveedor.add(this.jmenuArchivoDetalleFacturaProveedor);		
			this.jmenuBarDetalleFacturaProveedor.add(this.jmenuAccionesDetalleFacturaProveedor);		
			this.jmenuBarDetalleFacturaProveedor.add(this.jmenuDatosDetalleFacturaProveedor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleFacturaProveedor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleFacturaProveedor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioDetalleFacturaProveedor.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdAnioDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdAnioDetalleFacturaProveedor.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioDetalleFacturaProveedor,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioDetalleFacturaProveedor = new JLabelMe();
		jLabelid_anioFK_IdAnioDetalleFacturaProveedor.setText("Anio :");
		jLabelid_anioFK_IdAnioDetalleFacturaProveedor.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleFacturaProveedor.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleFacturaProveedor.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleFacturaProveedor,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaEnviarDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaEnviarDetalleFacturaProveedor.setToolTipText("Buscar Por Bodega Enviar ");
		this.jButtonFK_IdBodegaEnviarDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdBodegaEnviarDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdBodegaEnviarDetalleFacturaProveedor.setToolTipText("Buscar Por Bodega Enviar ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaEnviarDetalleFacturaProveedor,"buscar_button","Buscar Por Bodega Enviar ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaEnviarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor = new JLabelMe();
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setText("Bodega Enviar :");
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setToolTipText("Bodega Enviar");
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleFacturaProveedor.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleFacturaProveedor.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleFacturaProveedor,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor.setToolTipText("Buscar Por Cuenta Contable Costo ");
		this.jButtonFK_IdCuentaContableCostoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdCuentaContableCostoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdCuentaContableCostoDetalleFacturaProveedor.setToolTipText("Buscar Por Cuenta Contable Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCostoDetalleFacturaProveedor,"buscar_button","Buscar Por Cuenta Contable Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCostoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor = new JLabelMe();
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setText("Cuenta Contable Costo :");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setToolTipText("Cuenta Contable Costo");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaProveedorDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaProveedorDetalleFacturaProveedor.setToolTipText("Buscar Por Factura Proveedor ");
		this.jButtonFK_IdFacturaProveedorDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdFacturaProveedorDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdFacturaProveedorDetalleFacturaProveedor.setToolTipText("Buscar Por Factura Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaProveedorDetalleFacturaProveedor,"buscar_button","Buscar Por Factura Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaProveedorDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor = new JLabelMe();
		jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setText("Factura Proveedor :");
		jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setToolTipText("Factura Proveedor");
		jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesDetalleFacturaProveedor.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdMesDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdMesDetalleFacturaProveedor.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesDetalleFacturaProveedor,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesDetalleFacturaProveedor = new JLabelMe();
		jLabelid_mesFK_IdMesDetalleFacturaProveedor.setText("Mes :");
		jLabelid_mesFK_IdMesDetalleFacturaProveedor.setToolTipText("Mes");
		jLabelid_mesFK_IdMesDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNovedadProductoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNovedadProductoDetalleFacturaProveedor.setToolTipText("Buscar Por Novedad Producto ");
		this.jButtonFK_IdNovedadProductoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdNovedadProductoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdNovedadProductoDetalleFacturaProveedor.setToolTipText("Buscar Por Novedad Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNovedadProductoDetalleFacturaProveedor,"buscar_button","Buscar Por Novedad Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNovedadProductoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor = new JLabelMe();
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setText("Novedad Producto :");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setToolTipText("Novedad Producto");
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleFacturaProveedor.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdProductoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdProductoDetalleFacturaProveedor.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleFacturaProveedor,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleFacturaProveedor = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleFacturaProveedor.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleFacturaProveedor.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleFacturaProveedor.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadDetalleFacturaProveedor= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleFacturaProveedor.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleFacturaProveedor.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleFacturaProveedor,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor.setText("Unad :");
		jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleFacturaProveedor=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleFacturaProveedor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasDetalleFacturaProveedor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasDetalleFacturaProveedor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleFacturaProveedor = new DetalleFacturaProveedorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Factura Proveedor DATOS");
			this.jInternalFrameDetalleFormDetalleFacturaProveedor = new DetalleFacturaProveedorDetalleFormJInternalFrame(jDesktopPane,this.detallefacturaproveedorSessionBean.getConGuardarRelaciones(),this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleFacturaProveedor = null;//new DetalleFacturaProveedorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFacturaProveedor= new GridBagLayout();
		
		
		this.jTableDatosDetalleFacturaProveedor = new JTableMe();      
		
		String sToolTipDetalleFacturaProveedor="";
		sToolTipDetalleFacturaProveedor=DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFacturaProveedor+="(Contabilidad.DetalleFacturaProveedor)";
		}
		
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFacturaProveedor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleFacturaProveedor.setToolTipText(sToolTipDetalleFacturaProveedor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleFacturaProveedor);
		this.jTableDatosDetalleFacturaProveedor.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleFacturaProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleFacturaProveedor.setRowSelectionAllowed(true);
		this.jTableDatosDetalleFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleFacturaProveedor = new JButtonMe();
		this.jButtonDuplicarDetalleFacturaProveedor = new JButtonMe();
		this.jButtonCopiarDetalleFacturaProveedor = new JButtonMe();
		this.jButtonVerFormDetalleFacturaProveedor = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleFacturaProveedor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor = new JButtonMe();
		this.jButtonCerrarDetalleFacturaProveedor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFacturaProveedor = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleFacturaProveedor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Factura Proveedor";
		
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Factura Proveedores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFacturaProveedor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFacturaProveedor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleFacturaProveedor=new ReporteDinamicoJInternalFrame(DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleFacturaProveedor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleFacturaProveedor=new ImportacionJInternalFrame(DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleFacturaProveedor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleFacturaProveedor = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleFacturaProveedor.setText("Orden");
		this.jButtonAbrirOrderByDetalleFacturaProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFacturaProveedor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFacturaProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturaProveedor,false,this);
			
			//this.cargarOrderByDetalleFacturaProveedor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFacturaProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturaProveedor,true,this);
			
			//this.cargarOrderByDetalleFacturaProveedor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleFacturaProveedor.setMinimumSize(new Dimension(400,50));//3230
		this.jTableDatosDetalleFacturaProveedor.setMaximumSize(new Dimension(400,50));//3230
		this.jTableDatosDetalleFacturaProveedor.setPreferredSize(new Dimension(400,50));//3230
		
		this.jScrollPanelDatosDetalleFacturaProveedor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFacturaProveedor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFacturaProveedor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleFacturaProveedor.setText("Nuevo");
		this.jButtonDuplicarDetalleFacturaProveedor.setText("Duplicar");
		this.jButtonCopiarDetalleFacturaProveedor.setText("Copiar");
		this.jButtonVerFormDetalleFacturaProveedor.setText("Ver");
		this.jButtonNuevoRelacionesDetalleFacturaProveedor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.setText("Guardar");
		this.jButtonCerrarDetalleFacturaProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFacturaProveedor,"nuevo_button","Nuevo",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleFacturaProveedor,"duplicar_button","Duplicar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleFacturaProveedor,"copiar_button","Copiar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleFacturaProveedor,"ver_form","Ver",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleFacturaProveedor,"nuevorelaciones_button","Nuevo Rel",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFacturaProveedor,"guardarcambiostabla_button","Guardar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFacturaProveedor,"cerrar_button","Salir",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleFacturaProveedor.setToolTipText("Nuevo"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleFacturaProveedor.setToolTipText("Duplicar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleFacturaProveedor.setToolTipText("Copiar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleFacturaProveedor.setToolTipText("Ver"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleFacturaProveedor.setToolTipText("Nuevo Rel"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.setToolTipText("Guardar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFacturaProveedor.setToolTipText("Salir"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFacturaProveedor";
		inputMap = this.jButtonNuevoDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFacturaProveedor"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleFacturaProveedor";
		inputMap = this.jButtonDuplicarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleFacturaProveedor"));
		
		//COPIAR
		sMapKey = "CopiarDetalleFacturaProveedor";
		inputMap = this.jButtonCopiarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleFacturaProveedor"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleFacturaProveedor";
		inputMap = this.jButtonVerFormDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleFacturaProveedor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleFacturaProveedor";
		inputMap = this.jButtonNuevoRelacionesDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleFacturaProveedor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleFacturaProveedor";
		inputMap = this.jButtonModificarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleFacturaProveedor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleFacturaProveedor";
		inputMap = this.jButtonCerrarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFacturaProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFacturaProveedor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFacturaProveedor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleFacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleFacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleFacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleFacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleFacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleFacturaProveedor.setName("jPanelParametrosReportesDetalleFacturaProveedor"); 
		
		this.jPanelParametrosReportesAccionesDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleFacturaProveedor.setName("jPanelParametrosReportesAccionesDetalleFacturaProveedor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleFacturaProveedor = new JButtonMe();
		this.jButtonRecargarInformacionDetalleFacturaProveedor.setText("Recargar");
		this.jButtonRecargarInformacionDetalleFacturaProveedor.setToolTipText("Recargar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleFacturaProveedor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleFacturaProveedor = new JButtonMe();
		this.jButtonProcesarInformacionDetalleFacturaProveedor.setText("Procesar");
		this.jButtonProcesarInformacionDetalleFacturaProveedor.setToolTipText("Procesar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleFacturaProveedor.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleFacturaProveedor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFacturaProveedor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFacturaProveedor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleFacturaProveedor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleFacturaProveedor.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleFacturaProveedor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleFacturaProveedor.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFacturaProveedor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleFacturaProveedor.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleFacturaProveedor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleFacturaProveedor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleFacturaProveedor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFacturaProveedor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFacturaProveedor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleFacturaProveedor = new JLabelMe();
		
		this.jLabelAccionesDetalleFacturaProveedor.setText("Acciones");		
		this.jLabelAccionesDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleFacturaProveedor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleFacturaProveedor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleFacturaProveedor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleFacturaProveedor.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleFacturaProveedor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleFacturaProveedor = new JButtonMe();
		//this.jButtonAnterioresDetalleFacturaProveedor.setText("<<");
        this.jButtonAnterioresDetalleFacturaProveedor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleFacturaProveedor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleFacturaProveedor = new JButtonMe();
		//this.jButtonSiguientesDetalleFacturaProveedor.setText(">>");
        this.jButtonSiguientesDetalleFacturaProveedor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleFacturaProveedor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor,"nuevoguardarcambios_button","Nue",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleFacturaProveedor";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleFacturaProveedor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleFacturaProveedor";
		inputMap = this.jButtonRecargarInformacionDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleFacturaProveedor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleFacturaProveedor";
		inputMap = this.jButtonSiguientesDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleFacturaProveedor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleFacturaProveedor";
		inputMap = this.jButtonAnterioresDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleFacturaProveedor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleFacturaProveedor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleFacturaProveedor.setMinimumSize(new Dimension(this.getWidth(),DetalleFacturaProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFacturaProveedor.setMaximumSize(new Dimension(this.getWidth(),DetalleFacturaProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFacturaProveedor.setPreferredSize(new Dimension(this.getWidth(),DetalleFacturaProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturaProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleFacturaProveedor = new GridBagLayout();

			this.jPanelPaginacionDetalleFacturaProveedor.setLayout(gridaBagLayoutPaginacionDetalleFacturaProveedor);						
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonAnterioresDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
					
						
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
			
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonNuevoGuardarCambiosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
						
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonSiguientesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonNuevoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
						
			
			
			if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
				this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonGuardarCambiosTablaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			}
			
			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonDuplicarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonCopiarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonVerFormDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleFacturaProveedor.add(this.jButtonCerrarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		
		this.jButtonRecargarInformacionDetalleFacturaProveedor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFacturaProveedor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFacturaProveedor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleFacturaProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFacturaProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFacturaProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleFacturaProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFacturaProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFacturaProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleFacturaProveedor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFacturaProveedor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFacturaProveedor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleFacturaProveedor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFacturaProveedor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFacturaProveedor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleFacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleFacturaProveedor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleFacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleFacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleFacturaProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleFacturaProveedor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleFacturaProveedor.setLayout(gridaBagParametrosReportesDetalleFacturaProveedor);
			this.jPanelParametrosReportesAccionesDetalleFacturaProveedor.setLayout(gridaBagParametrosReportesAccionesDetalleFacturaProveedor);
			
			
			this.jPanelParametrosAuxiliar1DetalleFacturaProveedor.setLayout(gridaBagParametrosAuxiliar1DetalleFacturaProveedor);
			this.jPanelParametrosAuxiliar2DetalleFacturaProveedor.setLayout(gridaBagParametrosAuxiliar2DetalleFacturaProveedor);
			this.jPanelParametrosAuxiliar3DetalleFacturaProveedor.setLayout(gridaBagParametrosAuxiliar3DetalleFacturaProveedor);
			this.jPanelParametrosAuxiliar4DetalleFacturaProveedor.setLayout(gridaBagParametrosAuxiliar4DetalleFacturaProveedor);
			//this.jPanelParametrosAuxiliar5DetalleFacturaProveedor.setLayout(gridaBagParametrosAuxiliar2DetalleFacturaProveedor);			
			
			
			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jButtonRecargarInformacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturaProveedor.add(this.jComboBoxTiposPaginacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturaProveedor.add(this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturaProveedor.add(this.jComboBoxTiposArchivosReportesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jPanelParametrosAuxiliar1DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleFacturaProveedor.add(this.jComboBoxTiposReportesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);																		
			
			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleFacturaProveedor.add(this.jComboBoxTiposGraficosReportesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jPanelParametrosAuxiliar4DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jComboBoxTiposReportesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jCheckBoxGenerarReporteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jPanelParametrosAuxiliar2DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jLabelAccionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jButtonAbrirOrderByDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jComboBoxTiposSeleccionarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
			
			
			/*
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jCheckBoxConGraficoReporteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturaProveedor.add(this.jCheckBoxSeleccionarTodosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);															
				
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturaProveedor.add(this.jCheckBoxSeleccionadosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);															
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturaProveedor.add(this.jCheckBoxConGraficoReporteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jPanelParametrosAuxiliar3DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jComboBoxTiposAccionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
	
				
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturaProveedor.add(this.jTextFieldValorCampoGeneralDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleFacturaProveedor = new GridBagLayout();

			this.jScrollPanelDatosDetalleFacturaProveedor.setLayout(gridaBagLayoutDatosDetalleFacturaProveedor);
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
			
			this.jScrollPanelDatosDetalleFacturaProveedor.add(this.jTableDatosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleFacturaProveedor.setViewportView(this.jTableDatosDetalleFacturaProveedor);
		this.jTableDatosDetalleFacturaProveedor.setFillsViewportHeight(true);
		this.jTableDatosDetalleFacturaProveedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleFacturaProveedor= new GridBagLayout();
		this.jPanelAccionesDetalleFacturaProveedor.setLayout(gridaBagLayoutAccionesDetalleFacturaProveedor);
		
		
		/*	
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
			
		this.jPanelAccionesDetalleFacturaProveedor.add(this.jButtonNuevoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdAnioDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdAnioDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdAnioDetalleFacturaProveedor.add(jLabelid_anioFK_IdAnioDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdAnioDetalleFacturaProveedor.add(jComboBoxid_anioFK_IdAnioDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdAnioDetalleFacturaProveedor.add(jButtonFK_IdAnioDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("1.-Por Anio ", jPanelFK_IdAnioDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdBodegaDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdBodegaDetalleFacturaProveedor.add(jLabelid_bodegaFK_IdBodegaDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdBodegaDetalleFacturaProveedor.add(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdBodegaDetalleFacturaProveedor.add(jButtonFK_IdBodegaDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("2.-Por Bodega ", jPanelFK_IdBodegaDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdBodegaEnviarDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaEnviarDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaEnviarDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaEnviarDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaEnviarDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaEnviarDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdBodegaEnviarDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdBodegaEnviarDetalleFacturaProveedor.add(jLabelid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdBodegaEnviarDetalleFacturaProveedor.add(jComboBoxid_bodega_enviarFK_IdBodegaEnviarDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdBodegaEnviarDetalleFacturaProveedor.add(jButtonFK_IdBodegaEnviarDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("3.-Por Bodega Enviar ", jPanelFK_IdBodegaEnviarDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdCentroCostoDetalleFacturaProveedor.add(jLabelid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdCentroCostoDetalleFacturaProveedor.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdCentroCostoDetalleFacturaProveedor.add(jButtonFK_IdCentroCostoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("4.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCostoDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCostoDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCostoDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdCuentaContableCostoDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor.add(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor.add(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor.add(jButtonFK_IdCuentaContableCostoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("5.-Por Cuenta Contable Costo ", jPanelFK_IdCuentaContableCostoDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFacturaProveedorDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaProveedorDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaProveedorDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaProveedorDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaProveedorDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaProveedorDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdFacturaProveedorDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdFacturaProveedorDetalleFacturaProveedor.add(jLabelid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdFacturaProveedorDetalleFacturaProveedor.add(jComboBoxid_factura_proveedorFK_IdFacturaProveedorDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdFacturaProveedorDetalleFacturaProveedor.add(jButtonFK_IdFacturaProveedorDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("6.-Por Factura Proveedor ", jPanelFK_IdFacturaProveedorDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdMesDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdMesDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdMesDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdMesDetalleFacturaProveedor.add(jLabelid_mesFK_IdMesDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdMesDetalleFacturaProveedor.add(jComboBoxid_mesFK_IdMesDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdMesDetalleFacturaProveedor.add(jButtonFK_IdMesDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("7.-Por Mes ", jPanelFK_IdMesDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdNovedadProductoDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdNovedadProductoDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNovedadProductoDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNovedadProductoDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNovedadProductoDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdNovedadProductoDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdNovedadProductoDetalleFacturaProveedor.add(jLabelid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdNovedadProductoDetalleFacturaProveedor.add(jComboBoxid_novedad_productoFK_IdNovedadProductoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdNovedadProductoDetalleFacturaProveedor.add(jButtonFK_IdNovedadProductoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("8.-Por Novedad Producto ", jPanelFK_IdNovedadProductoDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdProductoDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdProductoDetalleFacturaProveedor.add(jLabelid_productoFK_IdProductoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdProductoDetalleFacturaProveedor.add(jComboBoxid_productoFK_IdProductoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);


		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdProductoDetalleFacturaProveedor.add(this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdProductoDetalleFacturaProveedor.add(jButtonFK_IdProductoDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("9.-Por Producto ", jPanelFK_IdProductoDetalleFacturaProveedor);
		jTabbedPaneBusquedasDetalleFacturaProveedor.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleFacturaProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleFacturaProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleFacturaProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleFacturaProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleFacturaProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleFacturaProveedor.setLayout(gridaBagLayoutFK_IdUnidadDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		jPanelFK_IdUnidadDetalleFacturaProveedor.add(jLabelid_unidadFK_IdUnidadDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
		jPanelFK_IdUnidadDetalleFacturaProveedor.add(jComboBoxid_unidadFK_IdUnidadDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturaProveedor.gridy = 1;
		gridBagConstraintsDetalleFacturaProveedor.gridx =1;
		jPanelFK_IdUnidadDetalleFacturaProveedor.add(jButtonFK_IdUnidadDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);

		jTabbedPaneBusquedasDetalleFacturaProveedor.addTab("10.-Por Unad ", jPanelFK_IdUnidadDetalleFacturaProveedor);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFacturaProveedor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;		
			//this.gridBagConstraintsDetalleFacturaProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;		
		//this.gridBagConstraintsDetalleFacturaProveedor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleFacturaProveedor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;		
			this.gridBagConstraintsDetalleFacturaProveedor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);								
		
		
		/*
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		*/		
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =0;
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFacturaProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
				
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleFacturaProveedorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleFacturaProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFacturaProveedor = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleFacturaProveedor.setLayout(gridaBagLayoutBusquedasParametrosDetalleFacturaProveedor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			
			
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
			
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleFacturaProveedor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleFacturaProveedor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleFacturaProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleFacturaProveedor.setName("jPanelReporteDinamicoDetalleFacturaProveedor"); 
		
		this.jPanelReporteDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleFacturaProveedor.setLayout(gridaBagLayoutReporteDinamicoDetalleFacturaProveedor);
		
		
		this.jInternalFrameReporteDinamicoDetalleFacturaProveedor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleFacturaProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFacturaProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Factura Proveedores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleFacturaProveedor = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleFacturaProveedor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelColumnasSelectReporteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleFacturaProveedor = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleFacturaProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleFacturaProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFacturaProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFacturaProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleFacturaProveedor=new JScrollPane(this.jListColumnasSelectReporteDetalleFacturaProveedor);
			
			this.jScrollColumnasSelectReporteDetalleFacturaProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFacturaProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFacturaProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jListColumnasSelectReporteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jScrollColumnasSelectReporteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleFacturaProveedor = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleFacturaProveedor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleFacturaProveedor = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleFacturaProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleFacturaProveedor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFacturaProveedor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFacturaProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleFacturaProveedor=new JScrollPane(this.jListRelacionesSelectReporteDetalleFacturaProveedor);
			
			this.jScrollRelacionesSelectReporteDetalleFacturaProveedor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFacturaProveedor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFacturaProveedor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleFacturaProveedor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleFacturaProveedor = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleFacturaProveedor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelConGraficoDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jCheckBoxConGraficoDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleFacturaProveedor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleFacturaProveedor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelColumnaCategoriaGraficoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleFacturaProveedor = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleFacturaProveedor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelColumnaCategoriaValorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleFacturaProveedor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleFacturaProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jComboBoxColumnaCategoriaValorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleFacturaProveedor = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleFacturaProveedor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelColumnasValoresGraficoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleFacturaProveedor = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleFacturaProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleFacturaProveedor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleFacturaProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFacturaProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFacturaProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleFacturaProveedor=new JScrollPane(this.jListColumnasValoresGraficoDetalleFacturaProveedor);
			
			this.jScrollColumnasValoresGraficoDetalleFacturaProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFacturaProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFacturaProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jListColumnasSelectReporteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jScrollColumnasValoresGraficoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaProveedor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaProveedor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelTiposGraficosReportesDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFacturaProveedor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaProveedor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaProveedor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaProveedor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelGenerarExcelReporteDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturaProveedor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturaProveedor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleFacturaProveedor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturaProveedor.setToolTipText("Generar EXCEL"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jButtonGenerarExcelReporteDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jComboBoxTiposReportesDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaProveedor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaProveedor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jLabelTiposArchivoReporteDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleFacturaProveedor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleFacturaProveedor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleFacturaProveedor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleFacturaProveedor.setToolTipText("Generar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jButtonGenerarReporteDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleFacturaProveedor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleFacturaProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleFacturaProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleFacturaProveedor.setToolTipText("Cancelar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturaProveedor.add(this.jButtonCerrarReporteDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleFacturaProveedor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleFacturaProveedor= new JScrollPane(jPanelReporteDinamicoDetalleFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Factura Proveedores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleFacturaProveedor);
		this.jInternalFrameReporteDinamicoDetalleFacturaProveedor.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleFacturaProveedor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleFacturaProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleFacturaProveedor.setName("jPanelImportacionDetalleFacturaProveedor"); 
		
		this.jPanelImportacionDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleFacturaProveedor.setLayout(gridaBagLayoutImportacionDetalleFacturaProveedor);
		
		
		this.jInternalFrameImportacionDetalleFacturaProveedor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleFacturaProveedor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleFacturaProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFacturaProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFacturaProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setResizable(true);
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setClosable(true);
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFacturaProveedor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setResizable(true);
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setClosable(true);
	    this.jInternalFrameImportacionDetalleFacturaProveedor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Factura Proveedores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleFacturaProveedor = new JLabelMe();

		this.jLabelArchivoImportacionDetalleFacturaProveedor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFacturaProveedor.add(this.jLabelArchivoImportacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleFacturaProveedor = new JFileChooser();		
		this.jFileChooserImportacionDetalleFacturaProveedor.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleFacturaProveedor = new JButtonMe();
		this.jButtonAbrirImportacionDetalleFacturaProveedor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleFacturaProveedor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleFacturaProveedor.setToolTipText("Generar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaProveedor.add(this.jButtonAbrirImportacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleFacturaProveedor = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleFacturaProveedor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFacturaProveedor.add(this.jLabelPathArchivoImportacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleFacturaProveedor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleFacturaProveedor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFacturaProveedor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFacturaProveedor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaProveedor.add(this.jTextFieldPathArchivoImportacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleFacturaProveedor = new JButtonMe();
		this.jButtonGenerarImportacionDetalleFacturaProveedor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleFacturaProveedor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleFacturaProveedor.setToolTipText("Generar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaProveedor.add(this.jButtonGenerarImportacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleFacturaProveedor = new JButtonMe();
		this.jButtonCerrarImportacionDetalleFacturaProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleFacturaProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleFacturaProveedor.setToolTipText("Cancelar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturaProveedor.add(this.jButtonCerrarImportacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleFacturaProveedor = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleFacturaProveedor= new JScrollPane(jPanelImportacionDetalleFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleFacturaProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleFacturaProveedor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleFacturaProveedor);
		this.jInternalFrameImportacionDetalleFacturaProveedor.getContentPane().add(this.jScrollPanelImportacionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleFacturaProveedor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleFacturaProveedor = new JButtonMe();
			this.jButtonAbrirOrderByDetalleFacturaProveedor.setText("Orden");
			this.jButtonAbrirOrderByDetalleFacturaProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFacturaProveedor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleFacturaProveedor";
			inputMap = this.jButtonAbrirOrderByDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleFacturaProveedor"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleFacturaProveedor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleFacturaProveedor.setName("jPanelOrderByDetalleFacturaProveedor"); 
			
			this.jPanelOrderByDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleFacturaProveedor.setLayout(gridaBagLayoutOrderByDetalleFacturaProveedor);
			
			
			this.jTableDatosDetalleFacturaProveedorOrderBy = new JTableMe();        
			this.jTableDatosDetalleFacturaProveedorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleFacturaProveedorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleFacturaProveedorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleFacturaProveedorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleFacturaProveedorOrderBy.setViewportView(this.jTableDatosDetalleFacturaProveedorOrderBy);
			this.jTableDatosDetalleFacturaProveedorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleFacturaProveedorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleFacturaProveedor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleFacturaProveedor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleFacturaProveedor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleFacturaProveedor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleFacturaProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleFacturaProveedor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleFacturaProveedor.setTitle("Orden");
			this.jInternalFrameOrderByDetalleFacturaProveedor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleFacturaProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleFacturaProveedor.setResizable(true);
			this.jInternalFrameOrderByDetalleFacturaProveedor.setClosable(true);
			this.jInternalFrameOrderByDetalleFacturaProveedor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Factura Proveedores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleFacturaProveedor.ipady =150;
				
			this.jPanelOrderByDetalleFacturaProveedor.add(jScrollPanelDatosDetalleFacturaProveedorOrderBy, this.gridBagConstraintsDetalleFacturaProveedor);//this.jTableDatosDetalleFacturaProveedorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleFacturaProveedor = new JButtonMe();
			this.jButtonCerrarOrderByDetalleFacturaProveedor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleFacturaProveedor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleFacturaProveedor.setToolTipText("Cancelar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleFacturaProveedor.add(this.jButtonCerrarOrderByDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleFacturaProveedor = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleFacturaProveedor= new JScrollPane(jPanelOrderByDetalleFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleFacturaProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleFacturaProveedor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleFacturaProveedor);
			
			this.jInternalFrameOrderByDetalleFacturaProveedor.getContentPane().add(this.jScrollPanelOrderByDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
		
		} else {
			this.jButtonAbrirOrderByDetalleFacturaProveedor = new JButtonMe();
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
		int iWidthTableCalculado=0;//6730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallefacturaproveedorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleFacturaProveedor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleFacturaProveedor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleFacturaProveedor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleFacturaProveedor.getRowHeight();//DetalleFacturaProveedorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor.isSelected()) {
					iHeightTable=DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFacturaProveedor.isSelected()) {
					iHeightTable=DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturaProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleFacturaProveedor!=null && this.jInternalFrameOrderByDetalleFacturaProveedor.getjTableDatosOrderBy()!=null) {
			//if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleFacturaProveedor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleFacturaProveedor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleFacturaProveedor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleFacturaProveedor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleFacturaProveedor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleFacturaProveedor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleFacturaProveedor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallefacturaproveedorLogic.getDetalleFacturaProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturaproveedors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleFacturaProveedor> TraerDetalleFacturaProveedorBeans(List<DetalleFacturaProveedor> detallefacturaproveedors,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleFacturaProveedor detallefacturaproveedor:detallefacturaproveedors) {
					
				if(!(DetalleFacturaProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleFacturaProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallefacturaproveedor.setsDetalleGeneralEntityReporte(DetalleFacturaProveedorConstantesFunciones.getDetalleFacturaProveedorDescripcion(detallefacturaproveedor));
										
					detallefacturaproveedor.setcosto_iva_descripcion(DetalleFacturaProveedorConstantesFunciones.getcosto_ivaDescripcion(detallefacturaproveedor));	
					
						
					
				} else  {
							
					//detallefacturaproveedor.setsDetalleGeneralEntityReporte(detallefacturaproveedor.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallefacturaproveedorbeans.add(detallefacturaproveedorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallefacturaproveedors;
    }
	//PARA REPORTES FIN
}
