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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.inventario.util.MovimientoInventarioConstantesFunciones;

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
public class MovimientoInventarioJInternalFrame extends MovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMovimientoInventario;
	
	protected JMenuBar jmenuBarMovimientoInventario;
	
	protected JMenu jmenuMovimientoInventario;
	protected JMenu jmenuDatosMovimientoInventario;
	protected JMenu jmenuArchivoMovimientoInventario;
	protected JMenu jmenuAccionesMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsMovimientoInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MovimientoInventarioDetalleFormJInternalFrame jInternalFrameDetalleFormMovimientoInventario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMovimientoInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMovimientoInventario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected EstadoMovimientoInventarioBeanSwingJInternalFrame estadomovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadomovimientoinventario="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_guiaremision="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public MovimientoInventarioSessionBean movimientoinventarioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public EstadoMovimientoInventarioSessionBean estadomovimientoinventarioSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public GuiaRemisionSessionBean guiaremisionSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public CompraSessionBean compraSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MovimientoInventario> movimientoinventarios;		
	public List<MovimientoInventario> movimientoinventariosEliminados;	
	public List<MovimientoInventario> movimientoinventariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMovimientoInventario;		
	protected JButton jButtonAbrirOrderByMovimientoInventario;
	
	
	//protected JPanel jPanelOrderByMovimientoInventario;
	//public JScrollPane jScrollPanelOrderByMovimientoInventario;	
	//protected JButton jButtonCerrarOrderByMovimientoInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MovimientoInventarioLogic movimientoinventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralMovimientoInventario;
    
	
	
	//public JScrollPane jScrollPanelDatosMovimientoInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMovimientoInventario;
	//public JScrollPane jScrollPanelImportacionMovimientoInventario;
	
	
	
	protected JPanel jPanelAccionesMovimientoInventario;
	
    protected JPanel jPanelPaginacionMovimientoInventario;
    protected JPanel jPanelParametrosReportesMovimientoInventario;
	protected JPanel jPanelParametrosReportesAccionesMovimientoInventario;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalMovimientoInventario;
	protected Integer iXPanelCamposFintotalMovimientoInventario=0;
	protected Integer iYPanelCamposFintotalMovimientoInventario=0;

	protected JPanel jPanelCamposIniciogeneralMovimientoInventario;
	protected Integer iXPanelCamposIniciogeneralMovimientoInventario=0;
	protected Integer iYPanelCamposIniciogeneralMovimientoInventario=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar2MovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar3MovimientoInventario;
	protected JPanel jPanelParametrosAuxiliar4MovimientoInventario;
	//protected JPanel jPanelParametrosAuxiliar5MovimientoInventario;
	
	
	
	//protected JPanel jPanelReporteDinamicoMovimientoInventario;
	//protected JPanel jPanelImportacionMovimientoInventario;
	
	
	public JTable jTableDatosMovimientoInventario;
	
	
	
	//public JTable jTableDatosMovimientoInventarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMovimientoInventario;
	protected JButton jButtonDuplicarMovimientoInventario;
	protected JButton jButtonCopiarMovimientoInventario;
	protected JButton jButtonVerFormMovimientoInventario;
	protected JButton jButtonNuevoRelacionesMovimientoInventario;
	protected JButton jButtonModificarMovimientoInventario;
	
    protected JButton jButtonGuardarCambiosTablaMovimientoInventario;
	protected JButton jButtonCerrarMovimientoInventario;
	
	
	protected JButton jButtonRecargarInformacionMovimientoInventario;
	protected JButton jButtonProcesarInformacionMovimientoInventario;
	
	
	protected JButton jButtonAnterioresMovimientoInventario;
	protected JButton jButtonSiguientesMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosMovimientoInventario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMovimientoInventario;
	//protected JButton jButtonCerrarReporteDinamicoMovimientoInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoMovimientoInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionMovimientoInventario;
	//protected JButton jButtonGenerarImportacionMovimientoInventario;
	//protected JButton jButtonCerrarImportacionMovimientoInventario;
	//protected JFileChooser jFileChooserImportacionMovimientoInventario;
	//protected File fileImportacionMovimientoInventario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientoInventario;
	protected JButton jButtonDuplicarToolBarMovimientoInventario;
	protected JButton jButtonNuevoRelacionesToolBarMovimientoInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarMovimientoInventario;
	protected JButton jButtonCopiarToolBarMovimientoInventario;
	protected JButton jButtonVerFormToolBarMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaToolBarMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientoInventario;
	protected JButton jButtonCerrarToolBarMovimientoInventario;
	
	protected JButton jButtonRecargarInformacionToolBarMovimientoInventario;
	protected JButton jButtonProcesarInformacionToolBarMovimientoInventario;
	protected JButton jButtonAnterioresToolBarMovimientoInventario;
	protected JButton jButtonSiguientesToolBarMovimientoInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarMovimientoInventario;
	protected JButton jButtonAbrirOrderByToolBarMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientoInventario;
	protected JMenuItem jMenuItemDuplicarMovimientoInventario;
	protected JMenuItem jMenuItemNuevoRelacionesMovimientoInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMovimientoInventario;
	protected JMenuItem jMenuItemCopiarMovimientoInventario;
	protected JMenuItem jMenuItemVerFormMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientoInventario;
	protected JMenuItem jMenuItemCerrarMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarMovimientoInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientoInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionMovimientoInventario;
	protected JMenuItem jMenuItemProcesarInformacionMovimientoInventario;
	protected JMenuItem jMenuItemAnterioresMovimientoInventario;
	protected JMenuItem jMenuItemSiguientesMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientoInventario;
	protected JMenuItem jMenuItemAbrirOrderByMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientoInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMovimientoInventario;
	protected JCheckBox jCheckBoxSeleccionadosMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMovimientoInventario;
	protected JCheckBox jCheckBoxConGraficoReporteMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMovimientoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMovimientoInventario;
	protected JTextField jTextFieldValorCampoGeneralMovimientoInventario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMovimientoInventario;
	//public JList<Reporte> jListColumnasSelectReporteMovimientoInventario;
	//public JScrollPane jScrollColumnasSelectReporteMovimientoInventario;
	
	//public JLabel jLabelRelacionesSelectReporteMovimientoInventario;
	//public JList<Reporte> jListRelacionesSelectReporteMovimientoInventario;
	//public JScrollPane jScrollRelacionesSelectReporteMovimientoInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMovimientoInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMovimientoInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMovimientoInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoMovimientoInventario;
	
		
	//public JLabel jLabelArchivoImportacionMovimientoInventario;	
	//public JLabel jLabelPathArchivoImportacionMovimientoInventario;
	//protected JTextField jTextFieldPathArchivoImportacionMovimientoInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMovimientoInventario;
	
	//public JLabel jLabelColumnaCategoriaValorMovimientoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMovimientoInventario;
	
	//public JLabel jLabelColumnasValoresGraficoMovimientoInventario;
	//public JList<Reporte> jListColumnasValoresGraficoMovimientoInventario;
	//public JScrollPane jScrollColumnasValoresGraficoMovimientoInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMovimientoInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMovimientoInventario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMovimientoInventario;
	public JPanel jPanelFK_IdAsientoContableMovimientoInventario;
	public JButton jButtonFK_IdAsientoContableMovimientoInventario;
	public JPanel jPanelFK_IdCompraMovimientoInventario;
	public JButton jButtonFK_IdCompraMovimientoInventario;
	public JPanel jPanelFK_IdEmpleadoMovimientoInventario;
	public JButton jButtonFK_IdEmpleadoMovimientoInventario;
	public JPanel jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario;
	public JButton jButtonFK_IdEstadoMovimientoInventarioMovimientoInventario;
	public JPanel jPanelFK_IdFacturaMovimientoInventario;
	public JButton jButtonFK_IdFacturaMovimientoInventario;
	public JPanel jPanelFK_IdGuiaRemisionMovimientoInventario;
	public JButton jButtonFK_IdGuiaRemisionMovimientoInventario;
	public JPanel jPanelFK_IdTipoTransaccionModuloMovimientoInventario;
	public JButton jButtonFK_IdTipoTransaccionModuloMovimientoInventario;
	public JPanel jPanelFK_IdTransaccionMovimientoInventario;
	public JButton jButtonFK_IdTransaccionMovimientoInventario;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableMovimientoInventario;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableMovimientoInventario;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableMovimientoInventario= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableMovimientoInventarioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario;
	
	public JPanel jPanelid_compraFK_IdCompraMovimientoInventario;
	public JLabel jLabelid_compraFK_IdCompraMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraFK_IdCompraMovimientoInventario;
	public JButton jButtonid_compraFK_IdCompraMovimientoInventario= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoMovimientoInventario;
	public JLabel jLabelid_empleadoFK_IdEmpleadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoMovimientoInventario;
	public JButton jButtonid_empleadoFK_IdEmpleadoMovimientoInventario= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoMovimientoInventarioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario;
	
	public JPanel jPanelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario;
	public JLabel jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario;
	public JButton jButtonid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario= new JButtonMe();
	public JButton jButtonid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaMovimientoInventario;
	public JLabel jLabelid_facturaFK_IdFacturaMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaMovimientoInventario;
	public JButton jButtonid_facturaFK_IdFacturaMovimientoInventario= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaMovimientoInventarioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario;
	
	public JPanel jPanelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario;
	public JLabel jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_guia_remisionFK_IdGuiaRemisionMovimientoInventario;
	public JButton jButtonid_guia_remisionFK_IdGuiaRemisionMovimientoInventario= new JButtonMe();
	public JButton jButtonid_guia_remisionFK_IdGuiaRemisionMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_guia_remisionFK_IdGuiaRemisionMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionMovimientoInventario;
	public JLabel jLabelid_transaccionFK_IdTransaccionMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionMovimientoInventario;
	public JButton jButtonid_transaccionFK_IdTransaccionMovimientoInventario= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionMovimientoInventarioBusqueda= new JButtonMe();

	
	
	
	
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
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=535;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MovimientoInventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoInventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoInventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoInventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMovimientoInventario)	{
		this.jButtonRecargarInformacionMovimientoInventario = jButtonRecargarInformacionMovimientoInventario;
	}
	
	public JButton getjButtonProcesarInformacionMovimientoInventario() {
		return this.jButtonProcesarInformacionMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientoInventario)	{
		this.jButtonProcesarInformacionMovimientoInventario = jButtonProcesarInformacionMovimientoInventario;
	}
	
	
	public JButton getjButtonRecargarInformacionMovimientoInventario() {
		return this.jButtonRecargarInformacionMovimientoInventario;
	}
	
	
	public List<MovimientoInventario> getmovimientoinventarios() {
		return this.movimientoinventarios;
	}

	public void setmovimientoinventarios(List<MovimientoInventario> movimientoinventarios) {
		this.movimientoinventarios = movimientoinventarios;
	}
	
	public List<MovimientoInventario> getmovimientoinventariosAux() {
		return this.movimientoinventariosAux;
	}

	public void setmovimientoinventariosAux(List<MovimientoInventario> movimientoinventariosAux) {
		this.movimientoinventariosAux = movimientoinventariosAux;
	}
	
	public List<MovimientoInventario> getmovimientoinventariosEliminados() {
		return this.movimientoinventariosEliminados;
	}

	public void setMovimientoInventariosEliminados(List<MovimientoInventario> movimientoinventariosEliminados) {
		this.movimientoinventariosEliminados = movimientoinventariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMovimientoInventario() {
		return jComboBoxTiposSeleccionarMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMovimientoInventario(
			JComboBox jComboBoxTiposSeleccionarMovimientoInventario) {
		this.jComboBoxTiposSeleccionarMovimientoInventario = jComboBoxTiposSeleccionarMovimientoInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMovimientoInventario() {
		return jTextFieldValorCampoGeneralMovimientoInventario;
	}

	public void setjTextFieldValorCampoGeneralMovimientoInventario(
			JTextField jTextFieldValorCampoGeneralMovimientoInventario) {
		this.jTextFieldValorCampoGeneralMovimientoInventario = jTextFieldValorCampoGeneralMovimientoInventario;
	}

	public void setBorderResaltarValorCampoGeneralMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMovimientoInventario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMovimientoInventario() {
		return this.jCheckBoxSeleccionarTodosMovimientoInventario;
	}

	public void setjCheckBoxSeleccionarTodosMovimientoInventario(
			JCheckBox jCheckBoxSeleccionarTodosMovimientoInventario) {
		this.jCheckBoxSeleccionarTodosMovimientoInventario = jCheckBoxSeleccionarTodosMovimientoInventario;
	}

	public void setBorderResaltarSeleccionarTodosMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMovimientoInventario() {
		return this.jCheckBoxSeleccionadosMovimientoInventario;
	}

	public void setjCheckBoxSeleccionadosMovimientoInventario(
			JCheckBox jCheckBoxSeleccionadosMovimientoInventario) {
		this.jCheckBoxSeleccionadosMovimientoInventario = jCheckBoxSeleccionadosMovimientoInventario;
	}
	
	public void setBorderResaltarSeleccionadosMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMovimientoInventario() {
		return this.jComboBoxTiposArchivosReportesMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMovimientoInventario(
			JComboBox jComboBoxTiposArchivosReportesMovimientoInventario) {
		this.jComboBoxTiposArchivosReportesMovimientoInventario = jComboBoxTiposArchivosReportesMovimientoInventario;
	}

	public void setBorderResaltarTiposArchivosReportesMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMovimientoInventario() {
		return this.jComboBoxTiposReportesMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMovimientoInventario(
			JComboBox jComboBoxTiposReportesMovimientoInventario) {
		this.jComboBoxTiposReportesMovimientoInventario = jComboBoxTiposReportesMovimientoInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMovimientoInventario() {
	//	return jComboBoxTiposReportesDinamicoMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMovimientoInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoMovimientoInventario) {
	//	this.jComboBoxTiposReportesDinamicoMovimientoInventario = jComboBoxTiposReportesDinamicoMovimientoInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMovimientoInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoMovimientoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMovimientoInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientoInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario = jComboBoxTiposArchivosReportesDinamicoMovimientoInventario;
	//}
	
	public void setBorderResaltarTiposReportesMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMovimientoInventario() {
		return this.jComboBoxTiposGraficosReportesMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMovimientoInventario(
			JComboBox jComboBoxTiposGraficosReportesMovimientoInventario) {
		this.jComboBoxTiposGraficosReportesMovimientoInventario = jComboBoxTiposGraficosReportesMovimientoInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMovimientoInventario() {
		return this.jComboBoxTiposPaginacionMovimientoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMovimientoInventario(
			JComboBox jComboBoxTiposPaginacionMovimientoInventario) {
		this.jComboBoxTiposPaginacionMovimientoInventario = jComboBoxTiposPaginacionMovimientoInventario;
	}
	
	public void setBorderResaltarTiposPaginacionMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMovimientoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMovimientoInventario() {
		return this.jComboBoxTiposRelacionesMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientoInventario() {
		return this.jComboBoxTiposAccionesMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesMovimientoInventario) {
		this.jComboBoxTiposRelacionesMovimientoInventario = jComboBoxTiposRelacionesMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientoInventario(
			JComboBox jComboBoxTiposAccionesMovimientoInventario) {
		this.jComboBoxTiposAccionesMovimientoInventario = jComboBoxTiposAccionesMovimientoInventario;
	}
	
	public void setBorderResaltarTiposRelacionesMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMovimientoInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMovimientoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMovimientoInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMovimientoInventario() {
	//	return jCheckBoxConGraficoDinamicoMovimientoInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoMovimientoInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoMovimientoInventario) {
	//	this.jCheckBoxConGraficoDinamicoMovimientoInventario = jCheckBoxConGraficoDinamicoMovimientoInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMovimientoInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMovimientoInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMovimientoInventario .setBorder(borderResaltar);		
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
		this.movimientoinventarioSessionBean=new MovimientoInventarioSessionBean();
		
		this.movimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientoinventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 2650) {
			iWidth=2650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		MovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMovimientoInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"nuevo","nuevo","Nuevo"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"duplicar","duplicar","Duplicar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"copiar","copiar","Copiar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"ver_form","ver_form","Ver"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"recargar","recargar","Recargar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMovimientoInventario,this.jTtoolBarMovimientoInventario,
							"cerrar","cerrar","Salir"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMovimientoInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMovimientoInventario;
			
				this.jButtonProcesarInformacionToolBarMovimientoInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMovimientoInventario;
				
		//protected JButton jButtonModificarToolBarMovimientoInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMovimientoInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMovimientoInventario=new JMenuMe("General");
		this.jmenuArchivoMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuAccionesMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDatosMovimientoInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMovimientoInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMovimientoInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMovimientoInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMovimientoInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMovimientoInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMovimientoInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMovimientoInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMovimientoInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMovimientoInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMovimientoInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMovimientoInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMovimientoInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMovimientoInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMovimientoInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMovimientoInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMovimientoInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMovimientoInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMovimientoInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMovimientoInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMovimientoInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMovimientoInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMovimientoInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMovimientoInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMovimientoInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMovimientoInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMovimientoInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMovimientoInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMovimientoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMovimientoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMovimientoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMovimientoInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMovimientoInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMovimientoInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMovimientoInventario.add(this.jMenuItemCerrarMovimientoInventario);
			
			this.jmenuAccionesMovimientoInventario.add(this.jMenuItemNuevoMovimientoInventario);
			this.jmenuAccionesMovimientoInventario.add(this.jMenuItemNuevoGuardarCambiosMovimientoInventario);
			this.jmenuAccionesMovimientoInventario.add(this.jMenuItemNuevoRelacionesMovimientoInventario);
			this.jmenuAccionesMovimientoInventario.add(this.jMenuItemGuardarCambiosTablaMovimientoInventario);		
			this.jmenuAccionesMovimientoInventario.add(this.jMenuItemDuplicarMovimientoInventario);		
			this.jmenuAccionesMovimientoInventario.add(this.jMenuItemCopiarMovimientoInventario);		
			this.jmenuAccionesMovimientoInventario.add(this.jMenuItemVerFormMovimientoInventario);		
			
			this.jmenuDatosMovimientoInventario.add(this.jMenuItemRecargarInformacionMovimientoInventario);				
			this.jmenuDatosMovimientoInventario.add(this.jMenuItemAnterioresMovimientoInventario);				
			this.jmenuDatosMovimientoInventario.add(this.jMenuItemSiguientesMovimientoInventario);				
			this.jmenuDatosMovimientoInventario.add(this.jMenuItemAbrirOrderByMovimientoInventario);				
			this.jmenuDatosMovimientoInventario.add(this.jMenuItemMostrarOcultarMovimientoInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMovimientoInventario.add(this.jMenuItemGuardarCambiosMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMovimientoInventario.add(this.jmenuArchivoMovimientoInventario);		
			this.jmenuBarMovimientoInventario.add(this.jmenuAccionesMovimientoInventario);		
			this.jmenuBarMovimientoInventario.add(this.jmenuDatosMovimientoInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMovimientoInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMovimientoInventario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableMovimientoInventario.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdAsientoContableMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdAsientoContableMovimientoInventario.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableMovimientoInventario,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableMovimientoInventario= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario.setFocusable(false);

		this.jPanelFK_IdCompraMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCompraMovimientoInventario.setToolTipText("Buscar Por Compra ");
		this.jButtonFK_IdCompraMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdCompraMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdCompraMovimientoInventario.setToolTipText("Buscar Por Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCompraMovimientoInventario,"buscar_button","Buscar Por Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCompraMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_compraFK_IdCompraMovimientoInventario = new JLabelMe();
		jLabelid_compraFK_IdCompraMovimientoInventario.setText("Compra :");
		jLabelid_compraFK_IdCompraMovimientoInventario.setToolTipText("Compra");
		jLabelid_compraFK_IdCompraMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_compraFK_IdCompraMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_compraFK_IdCompraMovimientoInventario= new JComboBoxMe();
		jComboBoxid_compraFK_IdCompraMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraFK_IdCompraMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoMovimientoInventario.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdEmpleadoMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdEmpleadoMovimientoInventario.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoMovimientoInventario,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoMovimientoInventario = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoMovimientoInventario.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoMovimientoInventario.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoMovimientoInventario= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario.setFocusable(false);

		this.jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoMovimientoInventarioMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdEstadoMovimientoInventarioMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdEstadoMovimientoInventarioMovimientoInventario.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoMovimientoInventarioMovimientoInventario,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoMovimientoInventarioMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario = new JLabelMe();
		jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setText("Estado :");
		jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setToolTipText("Estado");
		jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario= new JComboBoxMe();
		jComboBoxid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaMovimientoInventario.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdFacturaMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdFacturaMovimientoInventario.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaMovimientoInventario,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaMovimientoInventario = new JLabelMe();
		jLabelid_facturaFK_IdFacturaMovimientoInventario.setText("Factura :");
		jLabelid_facturaFK_IdFacturaMovimientoInventario.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaMovimientoInventario= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario.setFocusable(false);

		this.jPanelFK_IdGuiaRemisionMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGuiaRemisionMovimientoInventario.setToolTipText("Buscar Por Guia Remision ");
		this.jButtonFK_IdGuiaRemisionMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdGuiaRemisionMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdGuiaRemisionMovimientoInventario.setToolTipText("Buscar Por Guia Remision ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGuiaRemisionMovimientoInventario,"buscar_button","Buscar Por Guia Remision ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGuiaRemisionMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario = new JLabelMe();
		jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setText("Guia Remision :");
		jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setToolTipText("Guia Remision");
		jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_guia_remisionFK_IdGuiaRemisionMovimientoInventario= new JComboBoxMe();
		jComboBoxid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionFK_IdGuiaRemisionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_guia_remisionFK_IdGuiaRemisionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloMovimientoInventario.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloMovimientoInventario.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloMovimientoInventario,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionMovimientoInventario.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTransaccionMovimientoInventario= new JButtonMe();
		this.jButtonFK_IdTransaccionMovimientoInventario.setText("Buscar");
		this.jButtonFK_IdTransaccionMovimientoInventario.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionMovimientoInventario,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionMovimientoInventario = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionMovimientoInventario.setText("Tipo :");
		jLabelid_transaccionFK_IdTransaccionMovimientoInventario.setToolTipText("Tipo");
		jLabelid_transaccionFK_IdTransaccionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionMovimientoInventario= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMovimientoInventario=new JTabbedPane();


		this.jTabbedPaneBusquedasMovimientoInventario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMovimientoInventario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMovimientoInventario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMovimientoInventario = new MovimientoInventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Movimiento Inventario DATOS");
			this.jInternalFrameDetalleFormMovimientoInventario = new MovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.movimientoinventarioSessionBean.getConGuardarRelaciones(),this.movimientoinventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMovimientoInventario = null;//new MovimientoInventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientoInventario= new GridBagLayout();
		
		
		this.jTableDatosMovimientoInventario = new JTableMe();      
		
		String sToolTipMovimientoInventario="";
		sToolTipMovimientoInventario=MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientoInventario+="(Inventario.MovimientoInventario)";
		}
		
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientoInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMovimientoInventario.setToolTipText(sToolTipMovimientoInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMovimientoInventario);
		this.jTableDatosMovimientoInventario.setAutoCreateRowSorter(true);
		this.jTableDatosMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMovimientoInventario.setRowSelectionAllowed(true);
		this.jTableDatosMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMovimientoInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMovimientoInventario = new JButtonMe();
		this.jButtonDuplicarMovimientoInventario = new JButtonMe();
		this.jButtonCopiarMovimientoInventario = new JButtonMe();
		this.jButtonVerFormMovimientoInventario = new JButtonMe();
		this.jButtonNuevoRelacionesMovimientoInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMovimientoInventario = new JButtonMe();
		this.jButtonCerrarMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralMovimientoInventario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Movimiento Inventario";
		
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesMovimientoInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalMovimientoInventario.setName("jPanelCamposFintotalMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralMovimientoInventario.setName("jPanelCamposFingeneralMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoMovimientoInventario=new ReporteDinamicoJInternalFrame(MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMovimientoInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMovimientoInventario=new ImportacionJInternalFrame(MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMovimientoInventario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMovimientoInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByMovimientoInventario.setText("Orden");
		this.jButtonAbrirOrderByMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientoInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientoInventario,false,this);
			
			//this.cargarOrderByMovimientoInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientoInventario,true,this);
			
			//this.cargarOrderByMovimientoInventario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMovimientoInventario.setMinimumSize(new Dimension(400,50));//2630
		this.jTableDatosMovimientoInventario.setMaximumSize(new Dimension(400,50));//2630
		this.jTableDatosMovimientoInventario.setPreferredSize(new Dimension(400,50));//2630
		
		this.jScrollPanelDatosMovimientoInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientoInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientoInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMovimientoInventario.setText("Nuevo");
		this.jButtonDuplicarMovimientoInventario.setText("Duplicar");
		this.jButtonCopiarMovimientoInventario.setText("Copiar");
		this.jButtonVerFormMovimientoInventario.setText("Ver");
		this.jButtonNuevoRelacionesMovimientoInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMovimientoInventario.setText("Guardar");
		this.jButtonCerrarMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientoInventario,"nuevo_button","Nuevo",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMovimientoInventario,"duplicar_button","Duplicar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMovimientoInventario,"copiar_button","Copiar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMovimientoInventario,"ver_form","Ver",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMovimientoInventario,"nuevorelaciones_button","Nuevo Rel",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientoInventario,"guardarcambiostabla_button","Guardar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientoInventario,"cerrar_button","Salir",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMovimientoInventario.setToolTipText("Nuevo"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMovimientoInventario.setToolTipText("Duplicar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMovimientoInventario.setToolTipText("Copiar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMovimientoInventario.setToolTipText("Ver"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMovimientoInventario.setToolTipText("Nuevo Rel"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMovimientoInventario.setToolTipText("Guardar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientoInventario.setToolTipText("Salir"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientoInventario";
		inputMap = this.jButtonNuevoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientoInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarMovimientoInventario";
		inputMap = this.jButtonDuplicarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMovimientoInventario"));
		
		//COPIAR
		sMapKey = "CopiarMovimientoInventario";
		inputMap = this.jButtonCopiarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMovimientoInventario"));
		
		//VEr FORM
		sMapKey = "VerFormMovimientoInventario";
		inputMap = this.jButtonVerFormMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMovimientoInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMovimientoInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMovimientoInventario";
		inputMap = this.jButtonModificarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMovimientoInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMovimientoInventario";
		inputMap = this.jButtonCerrarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientoInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMovimientoInventario.setName("jPanelParametrosReportesMovimientoInventario"); 
		
		this.jPanelParametrosReportesAccionesMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMovimientoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMovimientoInventario.setName("jPanelParametrosReportesAccionesMovimientoInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMovimientoInventario = new JButtonMe();
		this.jButtonRecargarInformacionMovimientoInventario.setText("Recargar");
		this.jButtonRecargarInformacionMovimientoInventario.setToolTipText("Recargar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMovimientoInventario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMovimientoInventario = new JButtonMe();
		this.jButtonProcesarInformacionMovimientoInventario.setText("Procesar");
		this.jButtonProcesarInformacionMovimientoInventario.setToolTipText("Procesar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMovimientoInventario.setVisible(false);
			
		this.jButtonProcesarInformacionMovimientoInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientoInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientoInventario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMovimientoInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposReportesMovimientoInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientoInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMovimientoInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionMovimientoInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMovimientoInventario.setText("Accion");
		this.jComboBoxTiposRelacionesMovimientoInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesMovimientoInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMovimientoInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarMovimientoInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMovimientoInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMovimientoInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientoInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientoInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMovimientoInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMovimientoInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMovimientoInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMovimientoInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMovimientoInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMovimientoInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMovimientoInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMovimientoInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteMovimientoInventario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMovimientoInventario = new JButtonMe();
		//this.jButtonAnterioresMovimientoInventario.setText("<<");
        this.jButtonAnterioresMovimientoInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMovimientoInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMovimientoInventario = new JButtonMe();
		//this.jButtonSiguientesMovimientoInventario.setText(">>");
        this.jButtonSiguientesMovimientoInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMovimientoInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMovimientoInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMovimientoInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosMovimientoInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMovimientoInventario,"nuevoguardarcambios_button","Nue",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMovimientoInventario";
		inputMap = this.jButtonNuevoGuardarCambiosMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMovimientoInventario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMovimientoInventario";
		inputMap = this.jButtonRecargarInformacionMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMovimientoInventario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMovimientoInventario";
		inputMap = this.jButtonSiguientesMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMovimientoInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMovimientoInventario";
		inputMap = this.jButtonAnterioresMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMovimientoInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMovimientoInventario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMovimientoInventario.setMinimumSize(new Dimension(this.getWidth(),MovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientoInventario.setMaximumSize(new Dimension(this.getWidth(),MovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientoInventario.setPreferredSize(new Dimension(this.getWidth(),MovimientoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMovimientoInventario = new GridBagLayout();

			this.jPanelPaginacionMovimientoInventario.setLayout(gridaBagLayoutPaginacionMovimientoInventario);						
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = 0;
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonAnterioresMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
					
						
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();//
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsMovimientoInventario.gridy = 0;//
			
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonNuevoGuardarCambiosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);//
						
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMovimientoInventario.gridy = 0;
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonSiguientesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();//
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsMovimientoInventario.gridy = 1;//
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonNuevoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMovimientoInventario.gridy = 1;
				this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionMovimientoInventario.add(this.jButtonNuevoRelacionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			}
			
			
			if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();//
				this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsMovimientoInventario.gridy = 1;//
				this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionMovimientoInventario.add(this.jButtonGuardarCambiosTablaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);//
			}
			
			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();//
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsMovimientoInventario.gridy = 1;//
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonDuplicarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);//
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();//
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsMovimientoInventario.gridy = 1;//
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonCopiarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);//
		
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();//
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsMovimientoInventario.gridy = 1;//
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonVerFormMovimientoInventario, this.gridBagConstraintsMovimientoInventario);//
		
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = 1;
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMovimientoInventario.add(this.jButtonCerrarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		
		this.jButtonRecargarInformacionMovimientoInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientoInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientoInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMovimientoInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientoInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientoInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMovimientoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMovimientoInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientoInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientoInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMovimientoInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientoInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientoInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMovimientoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientoInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMovimientoInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientoInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientoInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMovimientoInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MovimientoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MovimientoInventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMovimientoInventario.setLayout(gridaBagParametrosReportesMovimientoInventario);
			this.jPanelParametrosReportesAccionesMovimientoInventario.setLayout(gridaBagParametrosReportesAccionesMovimientoInventario);
			
			
			this.jPanelParametrosAuxiliar1MovimientoInventario.setLayout(gridaBagParametrosAuxiliar1MovimientoInventario);
			this.jPanelParametrosAuxiliar2MovimientoInventario.setLayout(gridaBagParametrosAuxiliar2MovimientoInventario);
			this.jPanelParametrosAuxiliar3MovimientoInventario.setLayout(gridaBagParametrosAuxiliar3MovimientoInventario);
			this.jPanelParametrosAuxiliar4MovimientoInventario.setLayout(gridaBagParametrosAuxiliar4MovimientoInventario);
			//this.jPanelParametrosAuxiliar5MovimientoInventario.setLayout(gridaBagParametrosAuxiliar2MovimientoInventario);			
			
			
			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoInventario.add(this.jButtonRecargarInformacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientoInventario.add(this.jComboBoxTiposPaginacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientoInventario.add(this.jCheckBoxConAltoMaximoTablaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientoInventario.add(this.jComboBoxTiposArchivosReportesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoInventario.add(this.jPanelParametrosAuxiliar1MovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MovimientoInventario.add(this.jComboBoxTiposReportesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);																		
			
			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MovimientoInventario.add(this.jComboBoxTiposGraficosReportesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoInventario.add(this.jPanelParametrosAuxiliar4MovimientoInventario, this.gridBagConstraintsMovimientoInventario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoInventario.add(this.jComboBoxTiposReportesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoInventario.add(this.jCheckBoxGenerarReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoInventario.add(this.jPanelParametrosAuxiliar2MovimientoInventario, this.gridBagConstraintsMovimientoInventario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoInventario.add(this.jLabelAccionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMovimientoInventario.add(this.jButtonAbrirOrderByMovimientoInventario, this.gridBagConstraintsMovimientoInventario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoInventario.add(this.jComboBoxTiposSeleccionarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
			
			
			/*
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoInventario.add(this.jCheckBoxSeleccionarTodosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientoInventario.add(this.jCheckBoxConGraficoReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientoInventario.add(this.jCheckBoxSeleccionarTodosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);															
				
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientoInventario.add(this.jCheckBoxSeleccionadosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);															
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientoInventario.add(this.jCheckBoxConGraficoReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientoInventario.add(this.jPanelParametrosAuxiliar3MovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoInventario.add(this.jComboBoxTiposRelacionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
				
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoInventario.add(this.jComboBoxTiposAccionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
	
				
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientoInventario.add(this.jTextFieldValorCampoGeneralMovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalMovimientoInventario= new GridBagLayout();
		this.jPanelCamposFintotalMovimientoInventario.setLayout(gridaBagLayoutCamposFintotalMovimientoInventario);

		GridBagLayout gridaBagLayoutCamposIniciogeneralMovimientoInventario= new GridBagLayout();
		this.jPanelCamposIniciogeneralMovimientoInventario.setLayout(gridaBagLayoutCamposIniciogeneralMovimientoInventario);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMovimientoInventario = new GridBagLayout();

			this.jScrollPanelDatosMovimientoInventario.setLayout(gridaBagLayoutDatosMovimientoInventario);
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = 0;
			this.gridBagConstraintsMovimientoInventario.gridx = 0;
			
			this.jScrollPanelDatosMovimientoInventario.add(this.jTableDatosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMovimientoInventario.setViewportView(this.jTableDatosMovimientoInventario);
		this.jTableDatosMovimientoInventario.setFillsViewportHeight(true);
		this.jTableDatosMovimientoInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesMovimientoInventario.setLayout(gridaBagLayoutAccionesMovimientoInventario);
		
		
		/*	
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
			
		this.jPanelAccionesMovimientoInventario.add(this.jButtonNuevoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableMovimientoInventario.setLayout(gridaBagLayoutFK_IdAsientoContableMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdAsientoContableMovimientoInventario.add(jLabelid_asiento_contableFK_IdAsientoContableMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdAsientoContableMovimientoInventario.add(jComboBoxid_asiento_contableFK_IdAsientoContableMovimientoInventario, gridBagConstraintsMovimientoInventario);


		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdAsientoContableMovimientoInventario.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdAsientoContableMovimientoInventario.add(jButtonFK_IdAsientoContableMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCompraMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdCompraMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCompraMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCompraMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCompraMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCompraMovimientoInventario.setLayout(gridaBagLayoutFK_IdCompraMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdCompraMovimientoInventario.add(jLabelid_compraFK_IdCompraMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdCompraMovimientoInventario.add(jComboBoxid_compraFK_IdCompraMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdCompraMovimientoInventario.add(jButtonFK_IdCompraMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("2.-Por Compra ", jPanelFK_IdCompraMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoMovimientoInventario.setLayout(gridaBagLayoutFK_IdEmpleadoMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdEmpleadoMovimientoInventario.add(jLabelid_empleadoFK_IdEmpleadoMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdEmpleadoMovimientoInventario.add(jComboBoxid_empleadoFK_IdEmpleadoMovimientoInventario, gridBagConstraintsMovimientoInventario);


		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdEmpleadoMovimientoInventario.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdEmpleadoMovimientoInventario.add(jButtonFK_IdEmpleadoMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoMovimientoInventarioMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoMovimientoInventarioMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoMovimientoInventarioMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoMovimientoInventarioMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoMovimientoInventarioMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario.setLayout(gridaBagLayoutFK_IdEstadoMovimientoInventarioMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario.add(jLabelid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario.add(jComboBoxid_estado_movimiento_inventarioFK_IdEstadoMovimientoInventarioMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario.add(jButtonFK_IdEstadoMovimientoInventarioMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("4.-Por Estado ", jPanelFK_IdEstadoMovimientoInventarioMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFacturaMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaMovimientoInventario.setLayout(gridaBagLayoutFK_IdFacturaMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdFacturaMovimientoInventario.add(jLabelid_facturaFK_IdFacturaMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdFacturaMovimientoInventario.add(jComboBoxid_facturaFK_IdFacturaMovimientoInventario, gridBagConstraintsMovimientoInventario);


		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdFacturaMovimientoInventario.add(this.jButtonBuscarFK_IdFacturaid_facturaMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdFacturaMovimientoInventario.add(jButtonFK_IdFacturaMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("5.-Por Factura ", jPanelFK_IdFacturaMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdGuiaRemisionMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdGuiaRemisionMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGuiaRemisionMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGuiaRemisionMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGuiaRemisionMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGuiaRemisionMovimientoInventario.setLayout(gridaBagLayoutFK_IdGuiaRemisionMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdGuiaRemisionMovimientoInventario.add(jLabelid_guia_remisionFK_IdGuiaRemisionMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdGuiaRemisionMovimientoInventario.add(jComboBoxid_guia_remisionFK_IdGuiaRemisionMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdGuiaRemisionMovimientoInventario.add(jButtonFK_IdGuiaRemisionMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("6.-Por Guia Remision ", jPanelFK_IdGuiaRemisionMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloMovimientoInventario.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloMovimientoInventario.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloMovimientoInventario.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdTipoTransaccionModuloMovimientoInventario.add(jButtonFK_IdTipoTransaccionModuloMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("7.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTransaccionMovimientoInventario= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionMovimientoInventario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionMovimientoInventario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionMovimientoInventario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionMovimientoInventario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionMovimientoInventario.setLayout(gridaBagLayoutFK_IdTransaccionMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 0;
		jPanelFK_IdTransaccionMovimientoInventario.add(jLabelid_transaccionFK_IdTransaccionMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 0;
		gridBagConstraintsMovimientoInventario.gridx = 1;
		jPanelFK_IdTransaccionMovimientoInventario.add(jComboBoxid_transaccionFK_IdTransaccionMovimientoInventario, gridBagConstraintsMovimientoInventario);

		gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientoInventario.gridy = 1;
		gridBagConstraintsMovimientoInventario.gridx =1;
		jPanelFK_IdTransaccionMovimientoInventario.add(jButtonFK_IdTransaccionMovimientoInventario, gridBagConstraintsMovimientoInventario);

		jTabbedPaneBusquedasMovimientoInventario.addTab("8.-Por Tipo ", jPanelFK_IdTransaccionMovimientoInventario);
		jTabbedPaneBusquedasMovimientoInventario.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientoInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientoInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMovimientoInventario.gridx = 0;		
		//this.gridBagConstraintsMovimientoInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMovimientoInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMovimientoInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientoInventario.gridx = 0;		
			this.gridBagConstraintsMovimientoInventario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMovimientoInventario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMovimientoInventario, this.gridBagConstraintsMovimientoInventario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);								
		
		
		/*
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		*/		
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientoInventario.gridx =0;
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
				
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(MovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMovimientoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientoInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosMovimientoInventario.setLayout(gridaBagLayoutBusquedasParametrosMovimientoInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMovimientoInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMovimientoInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMovimientoInventario.setName("jPanelReporteDinamicoMovimientoInventario"); 
		
		this.jPanelReporteDinamicoMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMovimientoInventario.setLayout(gridaBagLayoutReporteDinamicoMovimientoInventario);
		
		
		this.jInternalFrameReporteDinamicoMovimientoInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMovimientoInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMovimientoInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoMovimientoInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoMovimientoInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMovimientoInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteMovimientoInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelColumnasSelectReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMovimientoInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMovimientoInventario=new JScrollPane(this.jListColumnasSelectReporteMovimientoInventario);
			
			this.jScrollColumnasSelectReporteMovimientoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMovimientoInventario.add(this.jListColumnasSelectReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jScrollColumnasSelectReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMovimientoInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteMovimientoInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelRelacionesSelectReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMovimientoInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMovimientoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMovimientoInventario=new JScrollPane(this.jListRelacionesSelectReporteMovimientoInventario);
			
			this.jScrollRelacionesSelectReporteMovimientoInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientoInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientoInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMovimientoInventario.add(this.jListRelacionesSelectReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jScrollRelacionesSelectReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoMovimientoInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMovimientoInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoMovimientoInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMovimientoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMovimientoInventario = new JLabelMe();

		this.jLabelConGraficoDinamicoMovimientoInventario.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelConGraficoDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMovimientoInventario.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMovimientoInventario.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMovimientoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientoInventario.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jCheckBoxConGraficoDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMovimientoInventario = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMovimientoInventario.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelColumnaCategoriaGraficoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientoInventario.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMovimientoInventario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientoInventario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jComboBoxColumnaCategoriaGraficoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMovimientoInventario = new JLabelMe();

		this.jLabelColumnaCategoriaValorMovimientoInventario.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelColumnaCategoriaValorMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMovimientoInventario.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMovimientoInventario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientoInventario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jComboBoxColumnaCategoriaValorMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMovimientoInventario = new JLabelMe();

		this.jLabelColumnasValoresGraficoMovimientoInventario.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelColumnasValoresGraficoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMovimientoInventario = new JList<Reporte>();
		this.jListColumnasValoresGraficoMovimientoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMovimientoInventario.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMovimientoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMovimientoInventario=new JScrollPane(this.jListColumnasValoresGraficoMovimientoInventario);
			
			this.jScrollColumnasValoresGraficoMovimientoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMovimientoInventario.add(this.jListColumnasSelectReporteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jScrollColumnasValoresGraficoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMovimientoInventario = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMovimientoInventario.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelTiposGraficosReportesDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientoInventario.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMovimientoInventario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientoInventario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jComboBoxTiposGraficosReportesDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMovimientoInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMovimientoInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelGenerarExcelReporteDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMovimientoInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMovimientoInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMovimientoInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMovimientoInventario.setToolTipText("Generar EXCEL"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMovimientoInventario.add(this.jButtonGenerarExcelReporteDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jComboBoxTiposReportesDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMovimientoInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMovimientoInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jLabelTiposArchivoReporteDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jComboBoxTiposArchivosReportesDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMovimientoInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMovimientoInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMovimientoInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMovimientoInventario.setToolTipText("Generar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jButtonGenerarReporteDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMovimientoInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMovimientoInventario.setToolTipText("Cancelar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientoInventario.add(this.jButtonCerrarReporteDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMovimientoInventario= new JScrollPane(jPanelReporteDinamicoMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMovimientoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMovimientoInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMovimientoInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMovimientoInventario);
		this.jInternalFrameReporteDinamicoMovimientoInventario.getContentPane().add(this.jScrollPanelReporteDinamicoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMovimientoInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMovimientoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMovimientoInventario.setName("jPanelImportacionMovimientoInventario"); 
		
		this.jPanelImportacionMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMovimientoInventario.setLayout(gridaBagLayoutImportacionMovimientoInventario);
		
		
		this.jInternalFrameImportacionMovimientoInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMovimientoInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMovimientoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionMovimientoInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientoInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMovimientoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientoInventario.setResizable(true);
	    this.jInternalFrameImportacionMovimientoInventario.setClosable(true);
	    this.jInternalFrameImportacionMovimientoInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMovimientoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMovimientoInventario = new JLabelMe();

		this.jLabelArchivoImportacionMovimientoInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientoInventario.add(this.jLabelArchivoImportacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMovimientoInventario = new JFileChooser();		
		this.jFileChooserImportacionMovimientoInventario.setToolTipText("ESCOGER ARCHIVO"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMovimientoInventario = new JButtonMe();
		this.jButtonAbrirImportacionMovimientoInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMovimientoInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMovimientoInventario.setToolTipText("Generar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoInventario.add(this.jButtonAbrirImportacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMovimientoInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionMovimientoInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientoInventario.add(this.jLabelPathArchivoImportacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMovimientoInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMovimientoInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientoInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientoInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoInventario.add(this.jTextFieldPathArchivoImportacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMovimientoInventario = new JButtonMe();
		this.jButtonGenerarImportacionMovimientoInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMovimientoInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMovimientoInventario.setToolTipText("Generar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoInventario.add(this.jButtonGenerarImportacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMovimientoInventario = new JButtonMe();
		this.jButtonCerrarImportacionMovimientoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMovimientoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMovimientoInventario.setToolTipText("Cancelar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientoInventario.add(this.jButtonCerrarImportacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMovimientoInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionMovimientoInventario= new JScrollPane(jPanelImportacionMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsMovimientoInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMovimientoInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMovimientoInventario);
		this.jInternalFrameImportacionMovimientoInventario.getContentPane().add(this.jScrollPanelImportacionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMovimientoInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMovimientoInventario = new JButtonMe();
			this.jButtonAbrirOrderByMovimientoInventario.setText("Orden");
			this.jButtonAbrirOrderByMovimientoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientoInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMovimientoInventario";
			inputMap = this.jButtonAbrirOrderByMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMovimientoInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByMovimientoInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMovimientoInventario.setName("jPanelOrderByMovimientoInventario"); 
			
			this.jPanelOrderByMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMovimientoInventario.setLayout(gridaBagLayoutOrderByMovimientoInventario);
			
			
			this.jTableDatosMovimientoInventarioOrderBy = new JTableMe();        
			this.jTableDatosMovimientoInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMovimientoInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMovimientoInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMovimientoInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMovimientoInventarioOrderBy.setViewportView(this.jTableDatosMovimientoInventarioOrderBy);
			this.jTableDatosMovimientoInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMovimientoInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMovimientoInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMovimientoInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMovimientoInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMovimientoInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMovimientoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMovimientoInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMovimientoInventario.setTitle("Orden");
			this.jInternalFrameOrderByMovimientoInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMovimientoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMovimientoInventario.setResizable(true);
			this.jInternalFrameOrderByMovimientoInventario.setClosable(true);
			this.jInternalFrameOrderByMovimientoInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMovimientoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMovimientoInventario.ipady =150;
				
			this.jPanelOrderByMovimientoInventario.add(jScrollPanelDatosMovimientoInventarioOrderBy, this.gridBagConstraintsMovimientoInventario);//this.jTableDatosMovimientoInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMovimientoInventario = new JButtonMe();
			this.jButtonCerrarOrderByMovimientoInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMovimientoInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMovimientoInventario.setToolTipText("Cancelar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMovimientoInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMovimientoInventario.add(this.jButtonCerrarOrderByMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMovimientoInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByMovimientoInventario= new JScrollPane(jPanelOrderByMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsMovimientoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMovimientoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMovimientoInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMovimientoInventario);
			
			this.jInternalFrameOrderByMovimientoInventario.getContentPane().add(this.jScrollPanelOrderByMovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
		
		} else {
			this.jButtonAbrirOrderByMovimientoInventario = new JButtonMe();
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
		int iWidthTableCalculado=0;//7230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.movimientoinventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMovimientoInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMovimientoInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMovimientoInventario.getRowHeight();//MovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientoInventario.isSelected()) {
					iHeightTable=MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientoInventario.isSelected()) {
					iHeightTable=MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMovimientoInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientoInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientoInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMovimientoInventario!=null && this.jInternalFrameOrderByMovimientoInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMovimientoInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMovimientoInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMovimientoInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMovimientoInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMovimientoInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMovimientoInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMovimientoInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMovimientoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=movimientoinventarioLogic.getMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientoinventarios.size();
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
	public static List<MovimientoInventario> TraerMovimientoInventarioBeans(List<MovimientoInventario> movimientoinventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(MovimientoInventario movimientoinventario:movimientoinventarios) {
					
				if(!(MovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					movimientoinventario.setsDetalleGeneralEntityReporte(MovimientoInventarioConstantesFunciones.getMovimientoInventarioDescripcion(movimientoinventario));
										
						
					
					

					if(movimientoinventario.getDetalleMovimientoInventarios()!=null && Funciones.existeClass(classes,DetalleMovimientoInventario.class)) {
						try{movimientoinventario.setdetallemovimientoinventariosDescripcionReporte(new JRBeanCollectionDataSource(DetalleMovimientoInventarioJInternalFrame.TraerDetalleMovimientoInventarioBeans(movimientoinventario.getDetalleMovimientoInventarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//movimientoinventario.setsDetalleGeneralEntityReporte(movimientoinventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//movimientoinventariobeans.add(movimientoinventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return movimientoinventarios;
    }
	//PARA REPORTES FIN
}
