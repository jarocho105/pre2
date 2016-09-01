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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;

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
import com.bydan.erp.inventario.util.OrdenCompraConstantesFunciones;

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
public class OrdenCompraJInternalFrame extends OrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarOrdenCompra;
	
	protected JMenuBar jmenuBarOrdenCompra;
	
	protected JMenu jmenuOrdenCompra;
	protected JMenu jmenuDatosOrdenCompra;
	protected JMenu jmenuArchivoOrdenCompra;
	protected JMenu jmenuAccionesOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsOrdenCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public OrdenCompraDetalleFormJInternalFrame jInternalFrameDetalleFormOrdenCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoOrdenCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionOrdenCompra;	
	
	
	public OrdenCompraBeanSwingJInternalFrameTree jInternalFrameTreeOrdenCompra;	
	
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

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected EstadoOrdenCompraBeanSwingJInternalFrame estadoordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoordencompra="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public OrdenCompraSessionBean ordencompraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public EstadoOrdenCompraSessionBean estadoordencompraSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<OrdenCompra> ordencompras;		
	public List<OrdenCompra> ordencomprasEliminados;	
	public List<OrdenCompra> ordencomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByOrdenCompra;		
	protected JButton jButtonAbrirOrderByOrdenCompra;
	
	
	//protected JPanel jPanelOrderByOrdenCompra;
	//public JScrollPane jScrollPanelOrderByOrdenCompra;	
	//protected JButton jButtonCerrarOrderByOrdenCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public OrdenCompraLogic ordencompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralOrdenCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosOrdenCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoOrdenCompra;
	//public JScrollPane jScrollPanelImportacionOrdenCompra;
	
	
	
	protected JPanel jPanelAccionesOrdenCompra;
	
    protected JPanel jPanelPaginacionOrdenCompra;
    protected JPanel jPanelParametrosReportesOrdenCompra;
	protected JPanel jPanelParametrosReportesAccionesOrdenCompra;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalOrdenCompra;
	protected Integer iXPanelCamposFintotalOrdenCompra=0;
	protected Integer iYPanelCamposFintotalOrdenCompra=0;

	protected JPanel jPanelCamposIniciogeneralOrdenCompra;
	protected Integer iXPanelCamposIniciogeneralOrdenCompra=0;
	protected Integer iYPanelCamposIniciogeneralOrdenCompra=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1OrdenCompra;
	protected JPanel jPanelParametrosAuxiliar2OrdenCompra;
	protected JPanel jPanelParametrosAuxiliar3OrdenCompra;
	protected JPanel jPanelParametrosAuxiliar4OrdenCompra;
	//protected JPanel jPanelParametrosAuxiliar5OrdenCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoOrdenCompra;
	//protected JPanel jPanelImportacionOrdenCompra;
	
	
	public JTable jTableDatosOrdenCompra;
	
	
	
	//public JTable jTableDatosOrdenCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoOrdenCompra;
	protected JButton jButtonDuplicarOrdenCompra;
	protected JButton jButtonCopiarOrdenCompra;
	protected JButton jButtonVerFormOrdenCompra;
	protected JButton jButtonNuevoRelacionesOrdenCompra;
	protected JButton jButtonModificarOrdenCompra;
	
    protected JButton jButtonGuardarCambiosTablaOrdenCompra;
	protected JButton jButtonCerrarOrdenCompra;
	
	
	protected JButton jButtonRecargarInformacionOrdenCompra;
	protected JButton jButtonProcesarInformacionOrdenCompra;
	
	
	protected JButton jButtonAnterioresOrdenCompra;
	protected JButton jButtonSiguientesOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosOrdenCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoOrdenCompra;
	//protected JButton jButtonCerrarReporteDinamicoOrdenCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoOrdenCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionOrdenCompra;
	//protected JButton jButtonGenerarImportacionOrdenCompra;
	//protected JButton jButtonCerrarImportacionOrdenCompra;
	//protected JFileChooser jFileChooserImportacionOrdenCompra;
	//protected File fileImportacionOrdenCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOrdenCompra;
	protected JButton jButtonDuplicarToolBarOrdenCompra;
	protected JButton jButtonNuevoRelacionesToolBarOrdenCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarOrdenCompra;
	protected JButton jButtonCopiarToolBarOrdenCompra;
	protected JButton jButtonVerFormToolBarOrdenCompra;
	public JButton jButtonGuardarCambiosTablaToolBarOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarOrdenCompra;
	protected JButton jButtonCerrarToolBarOrdenCompra;
	
	protected JButton jButtonRecargarInformacionToolBarOrdenCompra;
	protected JButton jButtonProcesarInformacionToolBarOrdenCompra;
	protected JButton jButtonAnterioresToolBarOrdenCompra;
	protected JButton jButtonSiguientesToolBarOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarOrdenCompra;
	protected JButton jButtonAbrirOrderByToolBarOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOrdenCompra;
	protected JMenuItem jMenuItemDuplicarOrdenCompra;
	protected JMenuItem jMenuItemNuevoRelacionesOrdenCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosOrdenCompra;
	protected JMenuItem jMenuItemCopiarOrdenCompra;
	protected JMenuItem jMenuItemVerFormOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaOrdenCompra;
	protected JMenuItem jMenuItemCerrarOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarOrdenCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarOrdenCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionOrdenCompra;
	protected JMenuItem jMenuItemProcesarInformacionOrdenCompra;
	protected JMenuItem jMenuItemAnterioresOrdenCompra;
	protected JMenuItem jMenuItemSiguientesOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOrdenCompra;
	protected JMenuItem jMenuItemAbrirOrderByOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarOrdenCompra;
	
	
	//MENU
	
	protected JButton jButtonArbolOrdenCompra;	
	
	protected JLabel jLabelAccionesOrdenCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosOrdenCompra;
	protected JCheckBox jCheckBoxSeleccionadosOrdenCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaOrdenCompra;
	protected JCheckBox jCheckBoxConGraficoReporteOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarOrdenCompra;
	protected JTextField jTextFieldValorCampoGeneralOrdenCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteOrdenCompra;
	//public JList<Reporte> jListColumnasSelectReporteOrdenCompra;
	//public JScrollPane jScrollColumnasSelectReporteOrdenCompra;
	
	//public JLabel jLabelRelacionesSelectReporteOrdenCompra;
	//public JList<Reporte> jListRelacionesSelectReporteOrdenCompra;
	//public JScrollPane jScrollRelacionesSelectReporteOrdenCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoOrdenCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoOrdenCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoOrdenCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoOrdenCompra;
	
		
	//public JLabel jLabelArchivoImportacionOrdenCompra;	
	//public JLabel jLabelPathArchivoImportacionOrdenCompra;
	//protected JTextField jTextFieldPathArchivoImportacionOrdenCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoOrdenCompra;
	
	//public JLabel jLabelColumnaCategoriaValorOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorOrdenCompra;
	
	//public JLabel jLabelColumnasValoresGraficoOrdenCompra;
	//public JList<Reporte> jListColumnasValoresGraficoOrdenCompra;
	//public JScrollPane jScrollColumnasValoresGraficoOrdenCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoOrdenCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoOrdenCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasOrdenCompra;
	public JPanel jPanelFK_IdAsientoContableOrdenCompra;
	public JButton jButtonFK_IdAsientoContableOrdenCompra;
	public JPanel jPanelFK_IdClienteOrdenCompra;
	public JButton jButtonFK_IdClienteOrdenCompra;
	public JPanel jPanelFK_IdEmpleadoOrdenCompra;
	public JButton jButtonFK_IdEmpleadoOrdenCompra;
	public JPanel jPanelFK_IdEstadoOrdenCompraOrdenCompra;
	public JButton jButtonFK_IdEstadoOrdenCompraOrdenCompra;
	public JPanel jPanelFK_IdOrdenCompraOrdenCompra;
	public JButton jButtonFK_IdOrdenCompraOrdenCompra;
	public JPanel jPanelFK_IdTipoTransaccionModuloOrdenCompra;
	public JButton jButtonFK_IdTipoTransaccionModuloOrdenCompra;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableOrdenCompra;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableOrdenCompra;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableOrdenCompra= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableOrdenCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra;
	
	public JPanel jPanelid_clienteFK_IdClienteOrdenCompra;
	public JLabel jLabelid_clienteFK_IdClienteOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteOrdenCompra;
	public JButton jButtonid_clienteFK_IdClienteOrdenCompra= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteOrdenCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteOrdenCompra;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoOrdenCompra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoOrdenCompra;
	public JButton jButtonid_empleadoFK_IdEmpleadoOrdenCompra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoOrdenCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra;
	
	public JPanel jPanelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra;
	public JLabel jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra;
	public JButton jButtonid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra= new JButtonMe();
	public JButton jButtonid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_compraFK_IdOrdenCompraOrdenCompra;
	public JLabel jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraFK_IdOrdenCompraOrdenCompra;
	public JButton jButtonid_orden_compraFK_IdOrdenCompraOrdenCompra= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraOrdenCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraOrdenCompraArbol= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompraBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
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
	public OrdenCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionOrdenCompra)	{
		this.jButtonRecargarInformacionOrdenCompra = jButtonRecargarInformacionOrdenCompra;
	}
	
	public JButton getjButtonProcesarInformacionOrdenCompra() {
		return this.jButtonProcesarInformacionOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOrdenCompra)	{
		this.jButtonProcesarInformacionOrdenCompra = jButtonProcesarInformacionOrdenCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionOrdenCompra() {
		return this.jButtonRecargarInformacionOrdenCompra;
	}
	
	public JButton getjButtonArbolOrdenCompra() {
		return this.jButtonArbolOrdenCompra;
	}
	
	public void setjButtonArbol(JButton jButtonArbolOrdenCompra)	{
		this.jButtonArbolOrdenCompra = jButtonArbolOrdenCompra;
	}
	
	public List<OrdenCompra> getordencompras() {
		return this.ordencompras;
	}

	public void setordencompras(List<OrdenCompra> ordencompras) {
		this.ordencompras = ordencompras;
	}
	
	public List<OrdenCompra> getordencomprasAux() {
		return this.ordencomprasAux;
	}

	public void setordencomprasAux(List<OrdenCompra> ordencomprasAux) {
		this.ordencomprasAux = ordencomprasAux;
	}
	
	public List<OrdenCompra> getordencomprasEliminados() {
		return this.ordencomprasEliminados;
	}

	public void setOrdenComprasEliminados(List<OrdenCompra> ordencomprasEliminados) {
		this.ordencomprasEliminados = ordencomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarOrdenCompra() {
		return jComboBoxTiposSeleccionarOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarOrdenCompra(
			JComboBox jComboBoxTiposSeleccionarOrdenCompra) {
		this.jComboBoxTiposSeleccionarOrdenCompra = jComboBoxTiposSeleccionarOrdenCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralOrdenCompra() {
		return jTextFieldValorCampoGeneralOrdenCompra;
	}

	public void setjTextFieldValorCampoGeneralOrdenCompra(
			JTextField jTextFieldValorCampoGeneralOrdenCompra) {
		this.jTextFieldValorCampoGeneralOrdenCompra = jTextFieldValorCampoGeneralOrdenCompra;
	}

	public void setBorderResaltarValorCampoGeneralOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralOrdenCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosOrdenCompra() {
		return this.jCheckBoxSeleccionarTodosOrdenCompra;
	}

	public void setjCheckBoxSeleccionarTodosOrdenCompra(
			JCheckBox jCheckBoxSeleccionarTodosOrdenCompra) {
		this.jCheckBoxSeleccionarTodosOrdenCompra = jCheckBoxSeleccionarTodosOrdenCompra;
	}

	public void setBorderResaltarSeleccionarTodosOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosOrdenCompra() {
		return this.jCheckBoxSeleccionadosOrdenCompra;
	}

	public void setjCheckBoxSeleccionadosOrdenCompra(
			JCheckBox jCheckBoxSeleccionadosOrdenCompra) {
		this.jCheckBoxSeleccionadosOrdenCompra = jCheckBoxSeleccionadosOrdenCompra;
	}
	
	public void setBorderResaltarSeleccionadosOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesOrdenCompra() {
		return this.jComboBoxTiposArchivosReportesOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesOrdenCompra(
			JComboBox jComboBoxTiposArchivosReportesOrdenCompra) {
		this.jComboBoxTiposArchivosReportesOrdenCompra = jComboBoxTiposArchivosReportesOrdenCompra;
	}

	public void setBorderResaltarTiposArchivosReportesOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesOrdenCompra() {
		return this.jComboBoxTiposReportesOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesOrdenCompra(
			JComboBox jComboBoxTiposReportesOrdenCompra) {
		this.jComboBoxTiposReportesOrdenCompra = jComboBoxTiposReportesOrdenCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoOrdenCompra() {
	//	return jComboBoxTiposReportesDinamicoOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoOrdenCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoOrdenCompra) {
	//	this.jComboBoxTiposReportesDinamicoOrdenCompra = jComboBoxTiposReportesDinamicoOrdenCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoOrdenCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoOrdenCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoOrdenCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra = jComboBoxTiposArchivosReportesDinamicoOrdenCompra;
	//}
	
	public void setBorderResaltarTiposReportesOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesOrdenCompra() {
		return this.jComboBoxTiposGraficosReportesOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesOrdenCompra(
			JComboBox jComboBoxTiposGraficosReportesOrdenCompra) {
		this.jComboBoxTiposGraficosReportesOrdenCompra = jComboBoxTiposGraficosReportesOrdenCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionOrdenCompra() {
		return this.jComboBoxTiposPaginacionOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionOrdenCompra(
			JComboBox jComboBoxTiposPaginacionOrdenCompra) {
		this.jComboBoxTiposPaginacionOrdenCompra = jComboBoxTiposPaginacionOrdenCompra;
	}
	
	public void setBorderResaltarTiposPaginacionOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesOrdenCompra() {
		return this.jComboBoxTiposRelacionesOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOrdenCompra() {
		return this.jComboBoxTiposAccionesOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOrdenCompra(
			JComboBox jComboBoxTiposRelacionesOrdenCompra) {
		this.jComboBoxTiposRelacionesOrdenCompra = jComboBoxTiposRelacionesOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOrdenCompra(
			JComboBox jComboBoxTiposAccionesOrdenCompra) {
		this.jComboBoxTiposAccionesOrdenCompra = jComboBoxTiposAccionesOrdenCompra;
	}
	
	public void setBorderResaltarTiposRelacionesOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesOrdenCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoOrdenCompra() {
	//	return jCheckBoxConGraficoDinamicoOrdenCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoOrdenCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoOrdenCompra) {
	//	this.jCheckBoxConGraficoDinamicoOrdenCompra = jCheckBoxConGraficoDinamicoOrdenCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoOrdenCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarOrdenCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoOrdenCompra .setBorder(borderResaltar);		
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
		this.ordencompraSessionBean=new OrdenCompraSessionBean();
		
		this.ordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ordencompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"OrdenCompra MANTENIMIENTO"));
		
		
		if(iWidth > 2650) {
			iWidth=2650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {
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
		
		OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarOrdenCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"nuevo","nuevo","Nuevo"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"duplicar","duplicar","Duplicar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"copiar","copiar","Copiar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"ver_form","ver_form","Ver"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"recargar","recargar","Recargar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarOrdenCompra,this.jTtoolBarOrdenCompra,
							"cerrar","cerrar","Salir"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarOrdenCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarOrdenCompra;
			
				this.jButtonProcesarInformacionToolBarOrdenCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarOrdenCompra;
				
		//protected JButton jButtonModificarToolBarOrdenCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarOrdenCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuOrdenCompra=new JMenuMe("General");
		this.jmenuArchivoOrdenCompra=new JMenuMe("Archivo");
		this.jmenuAccionesOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDatosOrdenCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarOrdenCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarOrdenCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarOrdenCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesOrdenCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesOrdenCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesOrdenCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarOrdenCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarOrdenCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarOrdenCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormOrdenCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormOrdenCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormOrdenCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaOrdenCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaOrdenCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaOrdenCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionOrdenCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionOrdenCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionOrdenCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionOrdenCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionOrdenCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionOrdenCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresOrdenCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresOrdenCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresOrdenCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesOrdenCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesOrdenCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesOrdenCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosOrdenCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosOrdenCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosOrdenCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoOrdenCompra.add(this.jMenuItemCerrarOrdenCompra);
			
			this.jmenuAccionesOrdenCompra.add(this.jMenuItemNuevoOrdenCompra);
			this.jmenuAccionesOrdenCompra.add(this.jMenuItemNuevoGuardarCambiosOrdenCompra);
			this.jmenuAccionesOrdenCompra.add(this.jMenuItemNuevoRelacionesOrdenCompra);
			this.jmenuAccionesOrdenCompra.add(this.jMenuItemGuardarCambiosTablaOrdenCompra);		
			this.jmenuAccionesOrdenCompra.add(this.jMenuItemDuplicarOrdenCompra);		
			this.jmenuAccionesOrdenCompra.add(this.jMenuItemCopiarOrdenCompra);		
			this.jmenuAccionesOrdenCompra.add(this.jMenuItemVerFormOrdenCompra);		
			
			this.jmenuDatosOrdenCompra.add(this.jMenuItemRecargarInformacionOrdenCompra);				
			this.jmenuDatosOrdenCompra.add(this.jMenuItemAnterioresOrdenCompra);				
			this.jmenuDatosOrdenCompra.add(this.jMenuItemSiguientesOrdenCompra);				
			this.jmenuDatosOrdenCompra.add(this.jMenuItemAbrirOrderByOrdenCompra);				
			this.jmenuDatosOrdenCompra.add(this.jMenuItemMostrarOcultarOrdenCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesOrdenCompra.add(this.jMenuItemGuardarCambiosOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarOrdenCompra.add(this.jmenuArchivoOrdenCompra);		
			this.jmenuBarOrdenCompra.add(this.jmenuAccionesOrdenCompra);		
			this.jmenuBarOrdenCompra.add(this.jmenuDatosOrdenCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarOrdenCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasOrdenCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableOrdenCompra.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableOrdenCompra= new JButtonMe();
		this.jButtonFK_IdAsientoContableOrdenCompra.setText("Buscar");
		this.jButtonFK_IdAsientoContableOrdenCompra.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableOrdenCompra,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableOrdenCompra= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra.setFocusable(false);

		this.jPanelFK_IdClienteOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteOrdenCompra.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteOrdenCompra= new JButtonMe();
		this.jButtonFK_IdClienteOrdenCompra.setText("Buscar");
		this.jButtonFK_IdClienteOrdenCompra.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteOrdenCompra,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteOrdenCompra = new JLabelMe();
		jLabelid_clienteFK_IdClienteOrdenCompra.setText("Cliente :");
		jLabelid_clienteFK_IdClienteOrdenCompra.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteOrdenCompra= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra.setFocusable(false);

		this.jPanelFK_IdEmpleadoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoOrdenCompra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoOrdenCompra= new JButtonMe();
		this.jButtonFK_IdEmpleadoOrdenCompra.setText("Buscar");
		this.jButtonFK_IdEmpleadoOrdenCompra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoOrdenCompra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoOrdenCompra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoOrdenCompra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoOrdenCompra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoOrdenCompra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra.setFocusable(false);

		this.jPanelFK_IdEstadoOrdenCompraOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoOrdenCompraOrdenCompra.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoOrdenCompraOrdenCompra= new JButtonMe();
		this.jButtonFK_IdEstadoOrdenCompraOrdenCompra.setText("Buscar");
		this.jButtonFK_IdEstadoOrdenCompraOrdenCompra.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoOrdenCompraOrdenCompra,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoOrdenCompraOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra = new JLabelMe();
		jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setText("Estado :");
		jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setToolTipText("Estado");
		jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra= new JComboBoxMe();
		jComboBoxid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdOrdenCompraOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenCompraOrdenCompra.setToolTipText("Buscar Por Orden Compra ");
		this.jButtonFK_IdOrdenCompraOrdenCompra= new JButtonMe();
		this.jButtonFK_IdOrdenCompraOrdenCompra.setText("Buscar");
		this.jButtonFK_IdOrdenCompraOrdenCompra.setToolTipText("Buscar Por Orden Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenCompraOrdenCompra,"buscar_button","Buscar Por Orden Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenCompraOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra = new JLabelMe();
		jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra.setText("Orden Compra :");
		jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra.setToolTipText("Orden Compra");
		jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_compraFK_IdOrdenCompraOrdenCompra= new JComboBoxMe();
		jComboBoxid_orden_compraFK_IdOrdenCompraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraFK_IdOrdenCompraOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloOrdenCompra.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloOrdenCompra= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloOrdenCompra.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloOrdenCompra.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloOrdenCompra,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasOrdenCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleOrdenCompra = new OrdenCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("OrdenCompra DATOS");
			this.jInternalFrameDetalleFormOrdenCompra = new OrdenCompraDetalleFormJInternalFrame(jDesktopPane,this.ordencompraSessionBean.getConGuardarRelaciones(),this.ordencompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormOrdenCompra = null;//new OrdenCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOrdenCompra= new GridBagLayout();
		
		
		this.jTableDatosOrdenCompra = new JTableMe();      
		
		String sToolTipOrdenCompra="";
		sToolTipOrdenCompra=OrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOrdenCompra+="(Inventario.OrdenCompra)";
		}
		
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipOrdenCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosOrdenCompra.setToolTipText(sToolTipOrdenCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosOrdenCompra);
		this.jTableDatosOrdenCompra.setAutoCreateRowSorter(true);
		this.jTableDatosOrdenCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosOrdenCompra.setRowSelectionAllowed(true);
		this.jTableDatosOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoOrdenCompra = new JButtonMe();
		this.jButtonDuplicarOrdenCompra = new JButtonMe();
		this.jButtonCopiarOrdenCompra = new JButtonMe();
		this.jButtonVerFormOrdenCompra = new JButtonMe();
		this.jButtonNuevoRelacionesOrdenCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaOrdenCompra = new JButtonMe();
		this.jButtonCerrarOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralOrdenCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: OrdenCompra";
		
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos OrdenCompras" + this.sPath));
		} else {
			this.jScrollPanelDatosOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesOrdenCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalOrdenCompra.setName("jPanelCamposFintotalOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralOrdenCompra.setName("jPanelCamposFingeneralOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoOrdenCompra=new ReporteDinamicoJInternalFrame(OrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoOrdenCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionOrdenCompra=new ImportacionJInternalFrame(OrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionOrdenCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByOrdenCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByOrdenCompra.setText("Orden");
		this.jButtonAbrirOrderByOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOrdenCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenCompra,false,this);
			
			//this.cargarOrderByOrdenCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenCompra,true,this);
			
			//this.cargarOrderByOrdenCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosOrdenCompra.setMinimumSize(new Dimension(400,50));//2630
		this.jTableDatosOrdenCompra.setMaximumSize(new Dimension(400,50));//2630
		this.jTableDatosOrdenCompra.setPreferredSize(new Dimension(400,50));//2630
		
		this.jScrollPanelDatosOrdenCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosOrdenCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosOrdenCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoOrdenCompra.setText("Nuevo");
		this.jButtonDuplicarOrdenCompra.setText("Duplicar");
		this.jButtonCopiarOrdenCompra.setText("Copiar");
		this.jButtonVerFormOrdenCompra.setText("Ver");
		this.jButtonNuevoRelacionesOrdenCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaOrdenCompra.setText("Guardar");
		this.jButtonCerrarOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOrdenCompra,"nuevo_button","Nuevo",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarOrdenCompra,"duplicar_button","Duplicar",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarOrdenCompra,"copiar_button","Copiar",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormOrdenCompra,"ver_form","Ver",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesOrdenCompra,"nuevorelaciones_button","Nuevo Rel",this.ordencompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOrdenCompra,"guardarcambiostabla_button","Guardar",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrdenCompra,"cerrar_button","Salir",this.ordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoOrdenCompra.setToolTipText("Nuevo"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarOrdenCompra.setToolTipText("Duplicar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarOrdenCompra.setToolTipText("Copiar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormOrdenCompra.setToolTipText("Ver"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesOrdenCompra.setToolTipText("Nuevo Rel"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaOrdenCompra.setToolTipText("Guardar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOrdenCompra.setToolTipText("Salir"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOrdenCompra";
		inputMap = this.jButtonNuevoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOrdenCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarOrdenCompra";
		inputMap = this.jButtonDuplicarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarOrdenCompra"));
		
		//COPIAR
		sMapKey = "CopiarOrdenCompra";
		inputMap = this.jButtonCopiarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarOrdenCompra"));
		
		//VEr FORM
		sMapKey = "VerFormOrdenCompra";
		inputMap = this.jButtonVerFormOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormOrdenCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesOrdenCompra";
		inputMap = this.jButtonNuevoRelacionesOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesOrdenCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarOrdenCompra";
		inputMap = this.jButtonModificarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarOrdenCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarOrdenCompra";
		inputMap = this.jButtonCerrarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOrdenCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1OrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2OrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3OrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4OrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5OrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesOrdenCompra.setName("jPanelParametrosReportesOrdenCompra"); 
		
		this.jPanelParametrosReportesAccionesOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesOrdenCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesOrdenCompra.setName("jPanelParametrosReportesAccionesOrdenCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionOrdenCompra = new JButtonMe();
		this.jButtonRecargarInformacionOrdenCompra.setText("Recargar");
		this.jButtonRecargarInformacionOrdenCompra.setToolTipText("Recargar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionOrdenCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionOrdenCompra = new JButtonMe();
		this.jButtonProcesarInformacionOrdenCompra.setText("Procesar");
		this.jButtonProcesarInformacionOrdenCompra.setToolTipText("Procesar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionOrdenCompra.setVisible(false);
			
		this.jButtonProcesarInformacionOrdenCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOrdenCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionOrdenCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolOrdenCompra = new JButtonMe();
		this.jButtonArbolOrdenCompra.setText("Arbol");		
		this.jButtonArbolOrdenCompra.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesOrdenCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposReportesOrdenCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionOrdenCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionOrdenCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesOrdenCompra.setText("Accion");
		this.jComboBoxTiposRelacionesOrdenCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesOrdenCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarOrdenCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarOrdenCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralOrdenCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralOrdenCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOrdenCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralOrdenCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesOrdenCompra.setText("Acciones");		
		this.jLabelAccionesOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosOrdenCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosOrdenCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosOrdenCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosOrdenCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaOrdenCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaOrdenCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteOrdenCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresOrdenCompra = new JButtonMe();
		//this.jButtonAnterioresOrdenCompra.setText("<<");
        this.jButtonAnterioresOrdenCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresOrdenCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesOrdenCompra = new JButtonMe();
		//this.jButtonSiguientesOrdenCompra.setText(">>");
        this.jButtonSiguientesOrdenCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesOrdenCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosOrdenCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosOrdenCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosOrdenCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosOrdenCompra,"nuevoguardarcambios_button","Nue",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosOrdenCompra";
		inputMap = this.jButtonNuevoGuardarCambiosOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosOrdenCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionOrdenCompra";
		inputMap = this.jButtonRecargarInformacionOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionOrdenCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesOrdenCompra";
		inputMap = this.jButtonSiguientesOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesOrdenCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresOrdenCompra";
		inputMap = this.jButtonAnterioresOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresOrdenCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasOrdenCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),OrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),OrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),OrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(OrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionOrdenCompra = new GridBagLayout();

			this.jPanelPaginacionOrdenCompra.setLayout(gridaBagLayoutPaginacionOrdenCompra);						
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = 0;
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionOrdenCompra.add(this.jButtonAnterioresOrdenCompra, this.gridBagConstraintsOrdenCompra);
					
						
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();//
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsOrdenCompra.gridy = 0;//
			
			this.jPanelPaginacionOrdenCompra.add(this.jButtonNuevoGuardarCambiosOrdenCompra, this.gridBagConstraintsOrdenCompra);//
						
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsOrdenCompra.gridy = 0;
			this.jPanelPaginacionOrdenCompra.add(this.jButtonSiguientesOrdenCompra, this.gridBagConstraintsOrdenCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();//
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsOrdenCompra.gridy = 1;//
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionOrdenCompra.add(this.jButtonNuevoOrdenCompra, this.gridBagConstraintsOrdenCompra);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsOrdenCompra.gridy = 1;
				this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionOrdenCompra.add(this.jButtonNuevoRelacionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
			}
			
			
			if(!this.ordencompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsOrdenCompra = new GridBagConstraints();//
				this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsOrdenCompra.gridy = 1;//
				this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionOrdenCompra.add(this.jButtonGuardarCambiosTablaOrdenCompra, this.gridBagConstraintsOrdenCompra);//
			}
			
			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();//
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsOrdenCompra.gridy = 1;//
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionOrdenCompra.add(this.jButtonDuplicarOrdenCompra, this.gridBagConstraintsOrdenCompra);//
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();//
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsOrdenCompra.gridy = 1;//
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionOrdenCompra.add(this.jButtonCopiarOrdenCompra, this.gridBagConstraintsOrdenCompra);//
		
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();//
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsOrdenCompra.gridy = 1;//
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionOrdenCompra.add(this.jButtonVerFormOrdenCompra, this.gridBagConstraintsOrdenCompra);//
		
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = 1;
			this.gridBagConstraintsOrdenCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionOrdenCompra.add(this.jButtonCerrarOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		
		this.jButtonRecargarInformacionOrdenCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOrdenCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionOrdenCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolOrdenCompra.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolOrdenCompra.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolOrdenCompra.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesOrdenCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOrdenCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesOrdenCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaOrdenCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOrdenCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaOrdenCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteOrdenCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOrdenCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteOrdenCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosOrdenCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOrdenCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosOrdenCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesOrdenCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1OrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2OrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3OrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4OrdenCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesOrdenCompra.setLayout(gridaBagParametrosReportesOrdenCompra);
			this.jPanelParametrosReportesAccionesOrdenCompra.setLayout(gridaBagParametrosReportesAccionesOrdenCompra);
			
			
			this.jPanelParametrosAuxiliar1OrdenCompra.setLayout(gridaBagParametrosAuxiliar1OrdenCompra);
			this.jPanelParametrosAuxiliar2OrdenCompra.setLayout(gridaBagParametrosAuxiliar2OrdenCompra);
			this.jPanelParametrosAuxiliar3OrdenCompra.setLayout(gridaBagParametrosAuxiliar3OrdenCompra);
			this.jPanelParametrosAuxiliar4OrdenCompra.setLayout(gridaBagParametrosAuxiliar4OrdenCompra);
			//this.jPanelParametrosAuxiliar5OrdenCompra.setLayout(gridaBagParametrosAuxiliar2OrdenCompra);			
			
			
			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenCompra.add(this.jButtonRecargarInformacionOrdenCompra, this.gridBagConstraintsOrdenCompra);			
			
			

			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenCompra.add(this.jButtonArbolOrdenCompra, this.gridBagConstraintsOrdenCompra);
			
			
			
			//PAGINACION
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenCompra.add(this.jComboBoxTiposPaginacionOrdenCompra, this.gridBagConstraintsOrdenCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenCompra.add(this.jCheckBoxConAltoMaximoTablaOrdenCompra, this.gridBagConstraintsOrdenCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1OrdenCompra.add(this.jComboBoxTiposArchivosReportesOrdenCompra, this.gridBagConstraintsOrdenCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenCompra.add(this.jPanelParametrosAuxiliar1OrdenCompra, this.gridBagConstraintsOrdenCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4OrdenCompra.add(this.jComboBoxTiposReportesOrdenCompra, this.gridBagConstraintsOrdenCompra);																		
			
			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4OrdenCompra.add(this.jComboBoxTiposGraficosReportesOrdenCompra, this.gridBagConstraintsOrdenCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenCompra.add(this.jPanelParametrosAuxiliar4OrdenCompra, this.gridBagConstraintsOrdenCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenCompra.add(this.jComboBoxTiposReportesOrdenCompra, this.gridBagConstraintsOrdenCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenCompra.add(this.jCheckBoxGenerarReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenCompra.add(this.jPanelParametrosAuxiliar2OrdenCompra, this.gridBagConstraintsOrdenCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenCompra.add(this.jLabelAccionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesOrdenCompra.add(this.jButtonAbrirOrderByOrdenCompra, this.gridBagConstraintsOrdenCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenCompra.add(this.jComboBoxTiposSeleccionarOrdenCompra, this.gridBagConstraintsOrdenCompra);			
			
			
			/*
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenCompra.add(this.jCheckBoxSeleccionarTodosOrdenCompra, this.gridBagConstraintsOrdenCompra);
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesOrdenCompra.add(this.jCheckBoxConGraficoReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3OrdenCompra.add(this.jCheckBoxSeleccionarTodosOrdenCompra, this.gridBagConstraintsOrdenCompra);															
				
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3OrdenCompra.add(this.jCheckBoxSeleccionadosOrdenCompra, this.gridBagConstraintsOrdenCompra);															
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3OrdenCompra.add(this.jCheckBoxConGraficoReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesOrdenCompra.add(this.jPanelParametrosAuxiliar3OrdenCompra, this.gridBagConstraintsOrdenCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenCompra.add(this.jComboBoxTiposRelacionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
				
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenCompra.add(this.jComboBoxTiposAccionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
	
				
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesOrdenCompra.add(this.jTextFieldValorCampoGeneralOrdenCompra, this.gridBagConstraintsOrdenCompra);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalOrdenCompra= new GridBagLayout();
		this.jPanelCamposFintotalOrdenCompra.setLayout(gridaBagLayoutCamposFintotalOrdenCompra);

		GridBagLayout gridaBagLayoutCamposIniciogeneralOrdenCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralOrdenCompra.setLayout(gridaBagLayoutCamposIniciogeneralOrdenCompra);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosOrdenCompra = new GridBagLayout();

			this.jScrollPanelDatosOrdenCompra.setLayout(gridaBagLayoutDatosOrdenCompra);
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = 0;
			this.gridBagConstraintsOrdenCompra.gridx = 0;
			
			this.jScrollPanelDatosOrdenCompra.add(this.jTableDatosOrdenCompra, this.gridBagConstraintsOrdenCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosOrdenCompra.setViewportView(this.jTableDatosOrdenCompra);
		this.jTableDatosOrdenCompra.setFillsViewportHeight(true);
		this.jTableDatosOrdenCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesOrdenCompra= new GridBagLayout();
		this.jPanelAccionesOrdenCompra.setLayout(gridaBagLayoutAccionesOrdenCompra);
		
		
		/*	
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 0;
			
		this.jPanelAccionesOrdenCompra.add(this.jButtonNuevoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableOrdenCompra.setLayout(gridaBagLayoutFK_IdAsientoContableOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdAsientoContableOrdenCompra.add(jLabelid_asiento_contableFK_IdAsientoContableOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 1;
		jPanelFK_IdAsientoContableOrdenCompra.add(jComboBoxid_asiento_contableFK_IdAsientoContableOrdenCompra, gridBagConstraintsOrdenCompra);


		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdAsientoContableOrdenCompra.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 1;
		gridBagConstraintsOrdenCompra.gridx =1;
		jPanelFK_IdAsientoContableOrdenCompra.add(jButtonFK_IdAsientoContableOrdenCompra, gridBagConstraintsOrdenCompra);

		jTabbedPaneBusquedasOrdenCompra.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableOrdenCompra);
		jTabbedPaneBusquedasOrdenCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdClienteOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteOrdenCompra.setLayout(gridaBagLayoutFK_IdClienteOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdClienteOrdenCompra.add(jLabelid_clienteFK_IdClienteOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 1;
		jPanelFK_IdClienteOrdenCompra.add(jComboBoxid_clienteFK_IdClienteOrdenCompra, gridBagConstraintsOrdenCompra);


		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdClienteOrdenCompra.add(this.jButtonBuscarFK_IdClienteid_clienteOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 1;
		gridBagConstraintsOrdenCompra.gridx =1;
		jPanelFK_IdClienteOrdenCompra.add(jButtonFK_IdClienteOrdenCompra, gridBagConstraintsOrdenCompra);

		jTabbedPaneBusquedasOrdenCompra.addTab("2.-Por Cliente ", jPanelFK_IdClienteOrdenCompra);
		jTabbedPaneBusquedasOrdenCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoOrdenCompra.setLayout(gridaBagLayoutFK_IdEmpleadoOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdEmpleadoOrdenCompra.add(jLabelid_empleadoFK_IdEmpleadoOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 1;
		jPanelFK_IdEmpleadoOrdenCompra.add(jComboBoxid_empleadoFK_IdEmpleadoOrdenCompra, gridBagConstraintsOrdenCompra);


		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdEmpleadoOrdenCompra.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 1;
		gridBagConstraintsOrdenCompra.gridx =1;
		jPanelFK_IdEmpleadoOrdenCompra.add(jButtonFK_IdEmpleadoOrdenCompra, gridBagConstraintsOrdenCompra);

		jTabbedPaneBusquedasOrdenCompra.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoOrdenCompra);
		jTabbedPaneBusquedasOrdenCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoOrdenCompraOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoOrdenCompraOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoOrdenCompraOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoOrdenCompraOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoOrdenCompraOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoOrdenCompraOrdenCompra.setLayout(gridaBagLayoutFK_IdEstadoOrdenCompraOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdEstadoOrdenCompraOrdenCompra.add(jLabelid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 1;
		jPanelFK_IdEstadoOrdenCompraOrdenCompra.add(jComboBoxid_estado_orden_compraFK_IdEstadoOrdenCompraOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 1;
		gridBagConstraintsOrdenCompra.gridx =1;
		jPanelFK_IdEstadoOrdenCompraOrdenCompra.add(jButtonFK_IdEstadoOrdenCompraOrdenCompra, gridBagConstraintsOrdenCompra);

		jTabbedPaneBusquedasOrdenCompra.addTab("4.-Por Estado ", jPanelFK_IdEstadoOrdenCompraOrdenCompra);
		jTabbedPaneBusquedasOrdenCompra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdOrdenCompraOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenCompraOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenCompraOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenCompraOrdenCompra.setLayout(gridaBagLayoutFK_IdOrdenCompraOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdOrdenCompraOrdenCompra.add(jLabelid_orden_compraFK_IdOrdenCompraOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 1;
		jPanelFK_IdOrdenCompraOrdenCompra.add(jComboBoxid_orden_compraFK_IdOrdenCompraOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 1;
		gridBagConstraintsOrdenCompra.gridx =1;
		jPanelFK_IdOrdenCompraOrdenCompra.add(jButtonFK_IdOrdenCompraOrdenCompra, gridBagConstraintsOrdenCompra);

		jTabbedPaneBusquedasOrdenCompra.addTab("5.-Por Orden Compra ", jPanelFK_IdOrdenCompraOrdenCompra);
		jTabbedPaneBusquedasOrdenCompra.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloOrdenCompra= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloOrdenCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloOrdenCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloOrdenCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloOrdenCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloOrdenCompra.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloOrdenCompra.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 0;
		gridBagConstraintsOrdenCompra.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloOrdenCompra.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloOrdenCompra, gridBagConstraintsOrdenCompra);

		gridBagConstraintsOrdenCompra = new GridBagConstraints();
		gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsOrdenCompra.gridy = 1;
		gridBagConstraintsOrdenCompra.gridx =1;
		jPanelFK_IdTipoTransaccionModuloOrdenCompra.add(jButtonFK_IdTipoTransaccionModuloOrdenCompra, gridBagConstraintsOrdenCompra);

		jTabbedPaneBusquedasOrdenCompra.addTab("6.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloOrdenCompra);
		jTabbedPaneBusquedasOrdenCompra.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOrdenCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOrdenCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarOrdenCompra, this.gridBagConstraintsOrdenCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsOrdenCompra.gridx = 0;		
		//this.gridBagConstraintsOrdenCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsOrdenCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsOrdenCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenCompra.gridx = 0;		
			this.gridBagConstraintsOrdenCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsOrdenCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasOrdenCompra, this.gridBagConstraintsOrdenCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesOrdenCompra, this.gridBagConstraintsOrdenCompra);								
		
		
		/*
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
		*/		
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOrdenCompra.gridx =0;
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOrdenCompra, this.gridBagConstraintsOrdenCompra);
				
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionOrdenCompra, this.gridBagConstraintsOrdenCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeOrdenCompra = new OrdenCompraBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeOrdenCompra.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeOrdenCompra.setTitle("OrdenCompra ARBOL");
		this.jInternalFrameTreeOrdenCompra.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"OrdenCompra Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeOrdenCompra.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeOrdenCompra.setResizable(true);
	    this.jInternalFrameTreeOrdenCompra.setClosable(true);
	    this.jInternalFrameTreeOrdenCompra.setMaximizable(true);
			
			
		if(OrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOrdenCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosOrdenCompra.setLayout(gridaBagLayoutBusquedasParametrosOrdenCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOrdenCompra, this.gridBagConstraintsOrdenCompra);
			
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralOrdenCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoOrdenCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoOrdenCompra.setName("jPanelReporteDinamicoOrdenCompra"); 
		
		this.jPanelReporteDinamicoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoOrdenCompra.setLayout(gridaBagLayoutReporteDinamicoOrdenCompra);
		
		
		this.jInternalFrameReporteDinamicoOrdenCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoOrdenCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoOrdenCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoOrdenCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoOrdenCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos OrdenCompras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteOrdenCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteOrdenCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelColumnasSelectReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteOrdenCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteOrdenCompra=new JScrollPane(this.jListColumnasSelectReporteOrdenCompra);
			
			this.jScrollColumnasSelectReporteOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOrdenCompra.add(this.jListColumnasSelectReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
		this.jPanelReporteDinamicoOrdenCompra.add(this.jScrollColumnasSelectReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteOrdenCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteOrdenCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelRelacionesSelectReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteOrdenCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteOrdenCompra=new JScrollPane(this.jListRelacionesSelectReporteOrdenCompra);
			
			this.jScrollRelacionesSelectReporteOrdenCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOrdenCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteOrdenCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoOrdenCompra.add(this.jListRelacionesSelectReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
		this.jPanelReporteDinamicoOrdenCompra.add(this.jScrollRelacionesSelectReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoOrdenCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoOrdenCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoOrdenCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoOrdenCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoOrdenCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelConGraficoDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoOrdenCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenCompra.add(this.jCheckBoxConGraficoDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoOrdenCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoOrdenCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelColumnaCategoriaGraficoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoOrdenCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoOrdenCompra.add(this.jComboBoxColumnaCategoriaGraficoOrdenCompra, this.gridBagConstraintsOrdenCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorOrdenCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorOrdenCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelColumnaCategoriaValorOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorOrdenCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoOrdenCompra.add(this.jComboBoxColumnaCategoriaValorOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoOrdenCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoOrdenCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelColumnasValoresGraficoOrdenCompra, this.gridBagConstraintsOrdenCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoOrdenCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoOrdenCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoOrdenCompra=new JScrollPane(this.jListColumnasValoresGraficoOrdenCompra);
			
			this.jScrollColumnasValoresGraficoOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoOrdenCompra.add(this.jListColumnasSelectReporteOrdenCompra, this.gridBagConstraintsOrdenCompra);
		this.jPanelReporteDinamicoOrdenCompra.add(this.jScrollColumnasValoresGraficoOrdenCompra, this.gridBagConstraintsOrdenCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoOrdenCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoOrdenCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelTiposGraficosReportesDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoOrdenCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoOrdenCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoOrdenCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenCompra.add(this.jComboBoxTiposGraficosReportesDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoOrdenCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoOrdenCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelGenerarExcelReporteDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoOrdenCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoOrdenCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoOrdenCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoOrdenCompra.setToolTipText("Generar EXCEL"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoOrdenCompra.add(this.jButtonGenerarExcelReporteDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenCompra.add(this.jComboBoxTiposReportesDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoOrdenCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoOrdenCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoOrdenCompra.add(this.jLabelTiposArchivoReporteDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenCompra.add(this.jComboBoxTiposArchivosReportesDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoOrdenCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoOrdenCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoOrdenCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoOrdenCompra.setToolTipText("Generar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenCompra.add(this.jButtonGenerarReporteDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoOrdenCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoOrdenCompra.setToolTipText("Cancelar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoOrdenCompra.add(this.jButtonCerrarReporteDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoOrdenCompra= new JScrollPane(jPanelReporteDinamicoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos OrdenCompras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsOrdenCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoOrdenCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalOrdenCompra);
		this.jInternalFrameReporteDinamicoOrdenCompra.getContentPane().add(this.jScrollPanelReporteDinamicoOrdenCompra, this.gridBagConstraintsOrdenCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionOrdenCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionOrdenCompra.setName("jPanelImportacionOrdenCompra"); 
		
		this.jPanelImportacionOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionOrdenCompra.setLayout(gridaBagLayoutImportacionOrdenCompra);
		
		
		this.jInternalFrameImportacionOrdenCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionOrdenCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionOrdenCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionOrdenCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionOrdenCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos OrdenCompras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionOrdenCompra = new JLabelMe();

		this.jLabelArchivoImportacionOrdenCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOrdenCompra.add(this.jLabelArchivoImportacionOrdenCompra, this.gridBagConstraintsOrdenCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionOrdenCompra = new JFileChooser();		
		this.jFileChooserImportacionOrdenCompra.setToolTipText("ESCOGER ARCHIVO"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionOrdenCompra = new JButtonMe();
		this.jButtonAbrirImportacionOrdenCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionOrdenCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionOrdenCompra.setToolTipText("Generar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenCompra.add(this.jButtonAbrirImportacionOrdenCompra, this.gridBagConstraintsOrdenCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionOrdenCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionOrdenCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionOrdenCompra.add(this.jLabelPathArchivoImportacionOrdenCompra, this.gridBagConstraintsOrdenCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionOrdenCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionOrdenCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOrdenCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionOrdenCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenCompra.add(this.jTextFieldPathArchivoImportacionOrdenCompra, this.gridBagConstraintsOrdenCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionOrdenCompra = new JButtonMe();
		this.jButtonGenerarImportacionOrdenCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionOrdenCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionOrdenCompra.setToolTipText("Generar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenCompra.add(this.jButtonGenerarImportacionOrdenCompra, this.gridBagConstraintsOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionOrdenCompra = new JButtonMe();
		this.jButtonCerrarImportacionOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionOrdenCompra.setToolTipText("Cancelar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionOrdenCompra.add(this.jButtonCerrarImportacionOrdenCompra, this.gridBagConstraintsOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionOrdenCompra= new JScrollPane(jPanelImportacionOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsOrdenCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionOrdenCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalOrdenCompra);
		this.jInternalFrameImportacionOrdenCompra.getContentPane().add(this.jScrollPanelImportacionOrdenCompra, this.gridBagConstraintsOrdenCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByOrdenCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByOrdenCompra = new JButtonMe();
			this.jButtonAbrirOrderByOrdenCompra.setText("Orden");
			this.jButtonAbrirOrderByOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByOrdenCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByOrdenCompra";
			inputMap = this.jButtonAbrirOrderByOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByOrdenCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByOrdenCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByOrdenCompra.setName("jPanelOrderByOrdenCompra"); 
			
			this.jPanelOrderByOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByOrdenCompra.setLayout(gridaBagLayoutOrderByOrdenCompra);
			
			
			this.jTableDatosOrdenCompraOrderBy = new JTableMe();        
			this.jTableDatosOrdenCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosOrdenCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosOrdenCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosOrdenCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosOrdenCompraOrderBy.setViewportView(this.jTableDatosOrdenCompraOrderBy);
			this.jTableDatosOrdenCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosOrdenCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByOrdenCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByOrdenCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByOrdenCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteOrdenCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByOrdenCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByOrdenCompra.setTitle("Orden");
			this.jInternalFrameOrderByOrdenCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByOrdenCompra.setResizable(true);
			this.jInternalFrameOrderByOrdenCompra.setClosable(true);
			this.jInternalFrameOrderByOrdenCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos OrdenCompras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsOrdenCompra.ipady =150;
				
			this.jPanelOrderByOrdenCompra.add(jScrollPanelDatosOrdenCompraOrderBy, this.gridBagConstraintsOrdenCompra);//this.jTableDatosOrdenCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByOrdenCompra = new JButtonMe();
			this.jButtonCerrarOrderByOrdenCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByOrdenCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByOrdenCompra.setToolTipText("Cancelar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsOrdenCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByOrdenCompra.add(this.jButtonCerrarOrderByOrdenCompra, this.gridBagConstraintsOrdenCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalOrdenCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByOrdenCompra= new JScrollPane(jPanelOrderByOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByOrdenCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalOrdenCompra);
			
			this.jInternalFrameOrderByOrdenCompra.getContentPane().add(this.jScrollPanelOrderByOrdenCompra, this.gridBagConstraintsOrdenCompra);			
		
		} else {
			this.jButtonAbrirOrderByOrdenCompra = new JButtonMe();
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
		iWidthTableCalculado+=2630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.ordencompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosOrdenCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosOrdenCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosOrdenCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosOrdenCompra.getRowHeight();//OrdenCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > OrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOrdenCompra.isSelected()) {
					iHeightTable=OrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > OrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaOrdenCompra.isSelected()) {
					iHeightTable=OrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < OrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=OrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosOrdenCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOrdenCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosOrdenCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByOrdenCompra!=null && this.jInternalFrameOrderByOrdenCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByOrdenCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByOrdenCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByOrdenCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByOrdenCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByOrdenCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByOrdenCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByOrdenCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ordencompraLogic.getOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ordencompras.size();
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
	public static List<OrdenCompra> TraerOrdenCompraBeans(List<OrdenCompra> ordencompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(OrdenCompra ordencompra:ordencompras) {
					
				if(!(OrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || OrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ordencompra.setsDetalleGeneralEntityReporte(OrdenCompraConstantesFunciones.getOrdenCompraDescripcion(ordencompra));
										
						
					
					

					if(ordencompra.getDetalleOrdenCompras()!=null && Funciones.existeClass(classes,DetalleOrdenCompra.class)) {
						try{ordencompra.setdetalleordencomprasDescripcionReporte(new JRBeanCollectionDataSource(DetalleOrdenCompraJInternalFrame.TraerDetalleOrdenCompraBeans(ordencompra.getDetalleOrdenCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//ordencompra.setsDetalleGeneralEntityReporte(ordencompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//ordencomprabeans.add(ordencomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ordencompras;
    }
	//PARA REPORTES FIN
}
