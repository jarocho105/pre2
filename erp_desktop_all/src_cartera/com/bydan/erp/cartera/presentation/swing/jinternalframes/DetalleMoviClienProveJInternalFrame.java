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
import com.bydan.erp.cartera.util.DetalleMoviClienProveConstantesFunciones;

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
public class DetalleMoviClienProveJInternalFrame extends DetalleMoviClienProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarDetalleMoviClienProve;
	
	protected JMenuBar jmenuBarDetalleMoviClienProve;
	
	protected JMenu jmenuDetalleMoviClienProve;
	protected JMenu jmenuDatosDetalleMoviClienProve;
	protected JMenu jmenuArchivoDetalleMoviClienProve;
	protected JMenu jmenuAccionesDetalleMoviClienProve;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleMoviClienProve;	
	protected GridBagConstraints gridBagConstraintsDetalleMoviClienProve;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleMoviClienProveDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleMoviClienProve;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleMoviClienProve;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleMoviClienProve;	
	*/
	
	
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

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected SucursalBeanSwingJInternalFrame sucursalmovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmovimiento="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected EstadoDetalleClienteBeanSwingJInternalFrame estadodetalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallecliente="";
	
	public DetalleMoviClienProveSessionBean detallemoviclienproveSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public SucursalSessionBean sucursalmovimientoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleMoviClienProve> detallemoviclienproves;		
	public List<DetalleMoviClienProve> detallemoviclienprovesEliminados;	
	public List<DetalleMoviClienProve> detallemoviclienprovesAux;
	
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleMoviClienProve;		
	protected JButton jButtonAbrirOrderByDetalleMoviClienProve;
	
	
	//protected JPanel jPanelOrderByDetalleMoviClienProve;
	//public JScrollPane jScrollPanelOrderByDetalleMoviClienProve;	
	//protected JButton jButtonCerrarOrderByDetalleMoviClienProve;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public DetalleMoviClienProveLogic detallemoviclienproveLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleMoviClienProve;
	public JScrollPane jScrollPanelDatosEdicionDetalleMoviClienProve;
	public JScrollPane jScrollPanelDatosGeneralDetalleMoviClienProve;
    
	
	/*
	//public JScrollPane jScrollPanelDatosDetalleMoviClienProveOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleMoviClienProve;
	//public JScrollPane jScrollPanelImportacionDetalleMoviClienProve;
	*/
	
	
	protected JPanel jPanelAccionesDetalleMoviClienProve;
	
    protected JPanel jPanelPaginacionDetalleMoviClienProve;
    protected JPanel jPanelParametrosReportesDetalleMoviClienProve;
	protected JPanel jPanelParametrosReportesAccionesDetalleMoviClienProve;
	
	
	
	
	
	;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1DetalleMoviClienProve;
	protected JPanel jPanelParametrosAuxiliar2DetalleMoviClienProve;
	protected JPanel jPanelParametrosAuxiliar3DetalleMoviClienProve;
	protected JPanel jPanelParametrosAuxiliar4DetalleMoviClienProve;
	//protected JPanel jPanelParametrosAuxiliar5DetalleMoviClienProve;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoDetalleMoviClienProve;
	//protected JPanel jPanelImportacionDetalleMoviClienProve;
	*/
	
	public JTable jTableDatosDetalleMoviClienProve;
	
	
	/*
	//public JTable jTableDatosDetalleMoviClienProveOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleMoviClienProve;
	protected JButton jButtonDuplicarDetalleMoviClienProve;
	protected JButton jButtonCopiarDetalleMoviClienProve;
	protected JButton jButtonVerFormDetalleMoviClienProve;
	protected JButton jButtonNuevoRelacionesDetalleMoviClienProve;
	protected JButton jButtonModificarDetalleMoviClienProve;
	
    protected JButton jButtonGuardarCambiosTablaDetalleMoviClienProve;
	protected JButton jButtonCerrarDetalleMoviClienProve;
	
	/*
	protected JButton jButtonRecargarInformacionDetalleMoviClienProve;
	protected JButton jButtonProcesarInformacionDetalleMoviClienProve;
	*/
	
	protected JButton jButtonAnterioresDetalleMoviClienProve;
	protected JButton jButtonSiguientesDetalleMoviClienProve;
	protected JButton jButtonNuevoGuardarCambiosDetalleMoviClienProve;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleMoviClienProve;
	//protected JButton jButtonCerrarReporteDinamicoDetalleMoviClienProve;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleMoviClienProve;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleMoviClienProve;
	//protected JButton jButtonGenerarImportacionDetalleMoviClienProve;
	//protected JButton jButtonCerrarImportacionDetalleMoviClienProve;
	//protected JFileChooser jFileChooserImportacionDetalleMoviClienProve;
	//protected File fileImportacionDetalleMoviClienProve;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleMoviClienProve;
	protected JButton jButtonDuplicarToolBarDetalleMoviClienProve;
	protected JButton jButtonNuevoRelacionesToolBarDetalleMoviClienProve;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleMoviClienProve;
	protected JButton jButtonCopiarToolBarDetalleMoviClienProve;
	protected JButton jButtonVerFormToolBarDetalleMoviClienProve;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleMoviClienProve;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleMoviClienProve;
	protected JButton jButtonCerrarToolBarDetalleMoviClienProve;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleMoviClienProve;
	protected JButton jButtonProcesarInformacionToolBarDetalleMoviClienProve;
	protected JButton jButtonAnterioresToolBarDetalleMoviClienProve;
	protected JButton jButtonSiguientesToolBarDetalleMoviClienProve;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleMoviClienProve;
	protected JButton jButtonAbrirOrderByToolBarDetalleMoviClienProve;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleMoviClienProve;
	protected JMenuItem jMenuItemDuplicarDetalleMoviClienProve;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleMoviClienProve;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleMoviClienProve;
	protected JMenuItem jMenuItemCopiarDetalleMoviClienProve;
	protected JMenuItem jMenuItemVerFormDetalleMoviClienProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleMoviClienProve;
	protected JMenuItem jMenuItemCerrarDetalleMoviClienProve;
	protected JMenuItem jMenuItemDetalleCerrarDetalleMoviClienProve;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleMoviClienProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleMoviClienProve;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleMoviClienProve;
	protected JMenuItem jMenuItemProcesarInformacionDetalleMoviClienProve;
	protected JMenuItem jMenuItemAnterioresDetalleMoviClienProve;
	protected JMenuItem jMenuItemSiguientesDetalleMoviClienProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleMoviClienProve;
	protected JMenuItem jMenuItemAbrirOrderByDetalleMoviClienProve;
	protected JMenuItem jMenuItemMostrarOcultarDetalleMoviClienProve;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleMoviClienProve;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleMoviClienProve;
	protected JCheckBox jCheckBoxSeleccionadosDetalleMoviClienProve;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleMoviClienProve;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleMoviClienProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleMoviClienProve;
	protected JTextField jTextFieldValorCampoGeneralDetalleMoviClienProve;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteDetalleMoviClienProve;
	//public JList<Reporte> jListColumnasSelectReporteDetalleMoviClienProve;
	//public JScrollPane jScrollColumnasSelectReporteDetalleMoviClienProve;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleMoviClienProve;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleMoviClienProve;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleMoviClienProve;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleMoviClienProve;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleMoviClienProve;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleMoviClienProve;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleMoviClienProve;
	
		
	//public JLabel jLabelArchivoImportacionDetalleMoviClienProve;	
	//public JLabel jLabelPathArchivoImportacionDetalleMoviClienProve;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleMoviClienProve;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleMoviClienProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleMoviClienProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleMoviClienProve;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleMoviClienProve;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleMoviClienProve;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleMoviClienProve;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleMoviClienProve;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleMoviClienProve;	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	/*
	
	public JTabbedPane jTabbedPaneBusquedasDetalleMoviClienProve;
	public JPanel jPanelFK_IdAsientoContableDetalleMoviClienProve;
	public JButton jButtonFK_IdAsientoContableDetalleMoviClienProve;
	public JPanel jPanelFK_IdClienteDetalleMoviClienProve;
	public JButton jButtonFK_IdClienteDetalleMoviClienProve;
	public JPanel jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve;
	public JButton jButtonFK_IdDetalleMoviClienProveDetalleMoviClienProve;
	public JPanel jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve;
	public JButton jButtonFK_IdEstadoDetalleClienteDetalleMoviClienProve;
	public JPanel jPanelFK_IdFacturaDetalleMoviClienProve;
	public JButton jButtonFK_IdFacturaDetalleMoviClienProve;
	public JPanel jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve;
	public JButton jButtonFK_IdTipoTransaccionModuloDetalleMoviClienProve;
	public JPanel jPanelFK_IdTransaccionDetalleMoviClienProve;
	public JButton jButtonFK_IdTransaccionDetalleMoviClienProve;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleMoviClienProveBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve;
	
	public JPanel jPanelid_clienteFK_IdClienteDetalleMoviClienProve;
	public JLabel jLabelid_clienteFK_IdClienteDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteDetalleMoviClienProve;
	public JButton jButtonid_clienteFK_IdClienteDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleMoviClienProveBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve;
	
	public JPanel jPanelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve;
	public JLabel jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve;
	public JButton jButtonid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve;
	public JLabel jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve;
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaDetalleMoviClienProve;
	public JLabel jLabelid_facturaFK_IdFacturaDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaDetalleMoviClienProve;
	public JButton jButtonid_facturaFK_IdFacturaDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleMoviClienProveBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve;
	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionDetalleMoviClienProve;
	public JLabel jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionDetalleMoviClienProve;
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleMoviClienProveBusqueda= new JButtonMe();

	
	*/
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public DetalleMoviClienProveJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMoviClienProveJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMoviClienProveJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMoviClienProveJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleMoviClienProve)	{
		this.jButtonRecargarInformacionDetalleMoviClienProve = jButtonRecargarInformacionDetalleMoviClienProve;
	}
	
	public JButton getjButtonProcesarInformacionDetalleMoviClienProve() {
		return this.jButtonProcesarInformacionDetalleMoviClienProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleMoviClienProve)	{
		this.jButtonProcesarInformacionDetalleMoviClienProve = jButtonProcesarInformacionDetalleMoviClienProve;
	}
	*/
	
	public JButton getjButtonRecargarInformacionDetalleMoviClienProve() {
		return new JButton();
	}
	
	
	public List<DetalleMoviClienProve> getdetallemoviclienproves() {
		return this.detallemoviclienproves;
	}

	public void setdetallemoviclienproves(List<DetalleMoviClienProve> detallemoviclienproves) {
		this.detallemoviclienproves = detallemoviclienproves;
	}
	
	public List<DetalleMoviClienProve> getdetallemoviclienprovesAux() {
		return this.detallemoviclienprovesAux;
	}

	public void setdetallemoviclienprovesAux(List<DetalleMoviClienProve> detallemoviclienprovesAux) {
		this.detallemoviclienprovesAux = detallemoviclienprovesAux;
	}
	
	public List<DetalleMoviClienProve> getdetallemoviclienprovesEliminados() {
		return this.detallemoviclienprovesEliminados;
	}

	public void setDetalleMoviClienProvesEliminados(List<DetalleMoviClienProve> detallemoviclienprovesEliminados) {
		this.detallemoviclienprovesEliminados = detallemoviclienprovesEliminados;
	}
	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleMoviClienProve() {
		return jComboBoxTiposSeleccionarDetalleMoviClienProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleMoviClienProve(
			JComboBox jComboBoxTiposSeleccionarDetalleMoviClienProve) {
		this.jComboBoxTiposSeleccionarDetalleMoviClienProve = jComboBoxTiposSeleccionarDetalleMoviClienProve;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleMoviClienProve() {
		return jTextFieldValorCampoGeneralDetalleMoviClienProve;
	}

	public void setjTextFieldValorCampoGeneralDetalleMoviClienProve(
			JTextField jTextFieldValorCampoGeneralDetalleMoviClienProve) {
		this.jTextFieldValorCampoGeneralDetalleMoviClienProve = jTextFieldValorCampoGeneralDetalleMoviClienProve;
	}

	public void setBorderResaltarValorCampoGeneralDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleMoviClienProve .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleMoviClienProve() {
		return this.jCheckBoxSeleccionarTodosDetalleMoviClienProve;
	}

	public void setjCheckBoxSeleccionarTodosDetalleMoviClienProve(
			JCheckBox jCheckBoxSeleccionarTodosDetalleMoviClienProve) {
		this.jCheckBoxSeleccionarTodosDetalleMoviClienProve = jCheckBoxSeleccionarTodosDetalleMoviClienProve;
	}

	public void setBorderResaltarSeleccionarTodosDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleMoviClienProve() {
		return this.jCheckBoxSeleccionadosDetalleMoviClienProve;
	}

	public void setjCheckBoxSeleccionadosDetalleMoviClienProve(
			JCheckBox jCheckBoxSeleccionadosDetalleMoviClienProve) {
		this.jCheckBoxSeleccionadosDetalleMoviClienProve = jCheckBoxSeleccionadosDetalleMoviClienProve;
	}
	
	public void setBorderResaltarSeleccionadosDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleMoviClienProve() {
		return this.jComboBoxTiposArchivosReportesDetalleMoviClienProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleMoviClienProve(
			JComboBox jComboBoxTiposArchivosReportesDetalleMoviClienProve) {
		this.jComboBoxTiposArchivosReportesDetalleMoviClienProve = jComboBoxTiposArchivosReportesDetalleMoviClienProve;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleMoviClienProve() {
		return this.jComboBoxTiposReportesDetalleMoviClienProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleMoviClienProve(
			JComboBox jComboBoxTiposReportesDetalleMoviClienProve) {
		this.jComboBoxTiposReportesDetalleMoviClienProve = jComboBoxTiposReportesDetalleMoviClienProve;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleMoviClienProve() {
	//	return jComboBoxTiposReportesDinamicoDetalleMoviClienProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleMoviClienProve(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleMoviClienProve) {
	//	this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve = jComboBoxTiposReportesDinamicoDetalleMoviClienProve;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve = jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve;
	//}
	
	public void setBorderResaltarTiposReportesDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleMoviClienProve() {
		return this.jComboBoxTiposGraficosReportesDetalleMoviClienProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleMoviClienProve(
			JComboBox jComboBoxTiposGraficosReportesDetalleMoviClienProve) {
		this.jComboBoxTiposGraficosReportesDetalleMoviClienProve = jComboBoxTiposGraficosReportesDetalleMoviClienProve;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleMoviClienProve() {
		return this.jComboBoxTiposPaginacionDetalleMoviClienProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleMoviClienProve(
			JComboBox jComboBoxTiposPaginacionDetalleMoviClienProve) {
		this.jComboBoxTiposPaginacionDetalleMoviClienProve = jComboBoxTiposPaginacionDetalleMoviClienProve;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleMoviClienProve() {
		return this.jComboBoxTiposRelacionesDetalleMoviClienProve;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleMoviClienProve() {
		return this.jComboBoxTiposAccionesDetalleMoviClienProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleMoviClienProve(
			JComboBox jComboBoxTiposRelacionesDetalleMoviClienProve) {
		this.jComboBoxTiposRelacionesDetalleMoviClienProve = jComboBoxTiposRelacionesDetalleMoviClienProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleMoviClienProve(
			JComboBox jComboBoxTiposAccionesDetalleMoviClienProve) {
		this.jComboBoxTiposAccionesDetalleMoviClienProve = jComboBoxTiposAccionesDetalleMoviClienProve;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleMoviClienProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleMoviClienProve .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleMoviClienProve() {
	//	return jCheckBoxConGraficoDinamicoDetalleMoviClienProve;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleMoviClienProve(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleMoviClienProve) {
	//	this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve = jCheckBoxConGraficoDinamicoDetalleMoviClienProve;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleMoviClienProve() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleMoviClienProve.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve .setBorder(borderResaltar);		
	//}
	
	
	
	*/		
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallemoviclienproveSessionBean=new DetalleMoviClienProveSessionBean();
		
		this.detallemoviclienproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallemoviclienproveSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleMoviClienProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMoviClienProve= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"nuevo","nuevo","Nuevo"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"duplicar","duplicar","Duplicar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"copiar","copiar","Copiar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"ver_form","ver_form","Ver"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"recargar","recargar","Recargar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleMoviClienProve,this.jTtoolBarDetalleMoviClienProve,
							"cerrar","cerrar","Salir"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleMoviClienProve=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleMoviClienProve;
			
				this.jButtonProcesarInformacionToolBarDetalleMoviClienProve=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleMoviClienProve;
				
		//protected JButton jButtonModificarToolBarDetalleMoviClienProve;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarDetalleMoviClienProve=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleMoviClienProve=new JMenuMe("General");
		this.jmenuArchivoDetalleMoviClienProve=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleMoviClienProve=new JMenuMe("Acciones");
		this.jmenuDatosDetalleMoviClienProve=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleMoviClienProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleMoviClienProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleMoviClienProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleMoviClienProve= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleMoviClienProve.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleMoviClienProve,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleMoviClienProve= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleMoviClienProve.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleMoviClienProve,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleMoviClienProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleMoviClienProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleMoviClienProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleMoviClienProve= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleMoviClienProve.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleMoviClienProve,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleMoviClienProve= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleMoviClienProve.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleMoviClienProve,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleMoviClienProve= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleMoviClienProve.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleMoviClienProve,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleMoviClienProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleMoviClienProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleMoviClienProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleMoviClienProve= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleMoviClienProve.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleMoviClienProve,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleMoviClienProve= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleMoviClienProve.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleMoviClienProve,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleMoviClienProve= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleMoviClienProve.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleMoviClienProve,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleMoviClienProve= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleMoviClienProve.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleMoviClienProve,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleMoviClienProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleMoviClienProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleMoviClienProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleMoviClienProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleMoviClienProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleMoviClienProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleMoviClienProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleMoviClienProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleMoviClienProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleMoviClienProve= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleMoviClienProve.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleMoviClienProve,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleMoviClienProve.add(this.jMenuItemCerrarDetalleMoviClienProve);
			
			this.jmenuAccionesDetalleMoviClienProve.add(this.jMenuItemNuevoDetalleMoviClienProve);
			this.jmenuAccionesDetalleMoviClienProve.add(this.jMenuItemNuevoGuardarCambiosDetalleMoviClienProve);
			this.jmenuAccionesDetalleMoviClienProve.add(this.jMenuItemNuevoRelacionesDetalleMoviClienProve);
			this.jmenuAccionesDetalleMoviClienProve.add(this.jMenuItemGuardarCambiosTablaDetalleMoviClienProve);		
			this.jmenuAccionesDetalleMoviClienProve.add(this.jMenuItemDuplicarDetalleMoviClienProve);		
			this.jmenuAccionesDetalleMoviClienProve.add(this.jMenuItemCopiarDetalleMoviClienProve);		
			this.jmenuAccionesDetalleMoviClienProve.add(this.jMenuItemVerFormDetalleMoviClienProve);		
			
			this.jmenuDatosDetalleMoviClienProve.add(this.jMenuItemRecargarInformacionDetalleMoviClienProve);				
			this.jmenuDatosDetalleMoviClienProve.add(this.jMenuItemAnterioresDetalleMoviClienProve);				
			this.jmenuDatosDetalleMoviClienProve.add(this.jMenuItemSiguientesDetalleMoviClienProve);				
			this.jmenuDatosDetalleMoviClienProve.add(this.jMenuItemAbrirOrderByDetalleMoviClienProve);				
			this.jmenuDatosDetalleMoviClienProve.add(this.jMenuItemMostrarOcultarDetalleMoviClienProve);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleMoviClienProve.add(this.jMenuItemGuardarCambiosDetalleMoviClienProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMoviClienProve.add(this.jmenuArchivoDetalleMoviClienProve);		
			this.jmenuBarDetalleMoviClienProve.add(this.jmenuAccionesDetalleMoviClienProve);		
			this.jmenuBarDetalleMoviClienProve.add(this.jmenuDatosDetalleMoviClienProve);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleMoviClienProve);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasDetalleMoviClienProve() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetalleMoviClienProve.setToolTipText("Buscar Por Asiento C. ");
		this.jButtonFK_IdAsientoContableDetalleMoviClienProve= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetalleMoviClienProve.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetalleMoviClienProve.setToolTipText("Buscar Por Asiento C. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetalleMoviClienProve,"buscar_button","Buscar Por Asiento C. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setText("Asiento C. :");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setToolTipText("Asiento C.");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve.setFocusable(false);

		this.jPanelFK_IdClienteDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDetalleMoviClienProve.setToolTipText("Buscar Por Cliente/Prove ");
		this.jButtonFK_IdClienteDetalleMoviClienProve= new JButtonMe();
		this.jButtonFK_IdClienteDetalleMoviClienProve.setText("Buscar");
		this.jButtonFK_IdClienteDetalleMoviClienProve.setToolTipText("Buscar Por Cliente/Prove ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDetalleMoviClienProve,"buscar_button","Buscar Por Cliente/Prove ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteDetalleMoviClienProve = new JLabelMe();
		jLabelid_clienteFK_IdClienteDetalleMoviClienProve.setText("Cliente/Prove :");
		jLabelid_clienteFK_IdClienteDetalleMoviClienProve.setToolTipText("Cliente/Prove");
		jLabelid_clienteFK_IdClienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve.setFocusable(false);

		this.jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve.setToolTipText("Buscar Por Sucursal Movimiento ");
		this.jButtonFK_IdDetalleMoviClienProveDetalleMoviClienProve= new JButtonMe();
		this.jButtonFK_IdDetalleMoviClienProveDetalleMoviClienProve.setText("Buscar");
		this.jButtonFK_IdDetalleMoviClienProveDetalleMoviClienProve.setToolTipText("Buscar Por Sucursal Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleMoviClienProveDetalleMoviClienProve,"buscar_button","Buscar Por Sucursal Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleMoviClienProveDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve = new JLabelMe();
		jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setText("Sucursal Movimiento :");
		jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setToolTipText("Sucursal Movimiento");
		jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve.setToolTipText("Buscar Por Estado Detalle Cliente ");
		this.jButtonFK_IdEstadoDetalleClienteDetalleMoviClienProve= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleClienteDetalleMoviClienProve.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleClienteDetalleMoviClienProve.setToolTipText("Buscar Por Estado Detalle Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleClienteDetalleMoviClienProve,"buscar_button","Buscar Por Estado Detalle Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleClienteDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve = new JLabelMe();
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setText("Estado Detalle Cliente :");
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setToolTipText("Estado Detalle Cliente");
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaDetalleMoviClienProve.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaDetalleMoviClienProve= new JButtonMe();
		this.jButtonFK_IdFacturaDetalleMoviClienProve.setText("Buscar");
		this.jButtonFK_IdFacturaDetalleMoviClienProve.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaDetalleMoviClienProve,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaDetalleMoviClienProve = new JLabelMe();
		jLabelid_facturaFK_IdFacturaDetalleMoviClienProve.setText("Factura :");
		jLabelid_facturaFK_IdFacturaDetalleMoviClienProve.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve.setFocusable(false);

		this.jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloDetalleMoviClienProve= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloDetalleMoviClienProve.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloDetalleMoviClienProve.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloDetalleMoviClienProve,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionDetalleMoviClienProve.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTransaccionDetalleMoviClienProve= new JButtonMe();
		this.jButtonFK_IdTransaccionDetalleMoviClienProve.setText("Buscar");
		this.jButtonFK_IdTransaccionDetalleMoviClienProve.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionDetalleMoviClienProve,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve.setText("Tipo :");
		jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve.setToolTipText("Tipo");
		jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleMoviClienProve=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleMoviClienProve.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleMoviClienProve.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleMoviClienProve.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleMoviClienProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	*/
	
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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleDetalleMoviClienProve = new DetalleMoviClienProveDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Cliente DATOS");
			this.jInternalFrameDetalleFormDetalleMoviClienProve = new DetalleMoviClienProveDetalleFormJInternalFrame(jDesktopPane,this.detallemoviclienproveSessionBean.getConGuardarRelaciones(),this.detallemoviclienproveSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleMoviClienProve = null;//new DetalleMoviClienProveDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleMoviClienProve= new GridBagLayout();
		
		
		this.jTableDatosDetalleMoviClienProve = new JTableMe();      
		
		String sToolTipDetalleMoviClienProve="";
		sToolTipDetalleMoviClienProve=DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleMoviClienProve+="(Cartera.DetalleMoviClienProve)";
		}
		
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleMoviClienProve+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleMoviClienProve.setToolTipText(sToolTipDetalleMoviClienProve);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleMoviClienProve);
		this.jTableDatosDetalleMoviClienProve.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleMoviClienProve.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleMoviClienProve.setRowSelectionAllowed(true);
		this.jTableDatosDetalleMoviClienProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleMoviClienProve = new JButtonMe();
		this.jButtonDuplicarDetalleMoviClienProve = new JButtonMe();
		this.jButtonCopiarDetalleMoviClienProve = new JButtonMe();
		this.jButtonVerFormDetalleMoviClienProve = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleMoviClienProve = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve = new JButtonMe();
		this.jButtonCerrarDetalleMoviClienProve = new JButtonMe();
		
		this.jScrollPanelDatosDetalleMoviClienProve = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleMoviClienProve = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cliente";
		
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleMoviClienProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleMoviClienProve.setToolTipText("Acciones");
        this.jPanelAccionesDetalleMoviClienProve.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoDetalleMoviClienProve=new ReporteDinamicoJInternalFrame(DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleMoviClienProve();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleMoviClienProve=new ImportacionJInternalFrame(DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleMoviClienProve();
			
			*/		
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByDetalleMoviClienProve = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleMoviClienProve.setText("Orden");
		this.jButtonAbrirOrderByDetalleMoviClienProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleMoviClienProve,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleMoviClienProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMoviClienProve,false,this);
			
			//this.cargarOrderByDetalleMoviClienProve(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleMoviClienProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMoviClienProve,true,this);
			
			//this.cargarOrderByDetalleMoviClienProve(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleMoviClienProve.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosDetalleMoviClienProve.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosDetalleMoviClienProve.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosDetalleMoviClienProve.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleMoviClienProve.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleMoviClienProve.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleMoviClienProve.setText("Nuevo");
		this.jButtonDuplicarDetalleMoviClienProve.setText("Duplicar");
		this.jButtonCopiarDetalleMoviClienProve.setText("Copiar");
		this.jButtonVerFormDetalleMoviClienProve.setText("Ver");
		this.jButtonNuevoRelacionesDetalleMoviClienProve.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve.setText("Guardar");
		this.jButtonCerrarDetalleMoviClienProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleMoviClienProve,"nuevo_button","Nuevo",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleMoviClienProve,"duplicar_button","Duplicar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleMoviClienProve,"copiar_button","Copiar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleMoviClienProve,"ver_form","Ver",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleMoviClienProve,"nuevorelaciones_button","Nuevo Rel",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleMoviClienProve,"guardarcambiostabla_button","Guardar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleMoviClienProve,"cerrar_button","Salir",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleMoviClienProve.setToolTipText("Nuevo"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleMoviClienProve.setToolTipText("Duplicar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleMoviClienProve.setToolTipText("Copiar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleMoviClienProve.setToolTipText("Ver"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleMoviClienProve.setToolTipText("Nuevo Rel"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve.setToolTipText("Guardar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleMoviClienProve.setToolTipText("Salir"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleMoviClienProve";
		inputMap = this.jButtonNuevoDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleMoviClienProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleMoviClienProve"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleMoviClienProve";
		inputMap = this.jButtonDuplicarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleMoviClienProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleMoviClienProve"));
		
		//COPIAR
		sMapKey = "CopiarDetalleMoviClienProve";
		inputMap = this.jButtonCopiarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleMoviClienProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleMoviClienProve"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleMoviClienProve";
		inputMap = this.jButtonVerFormDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleMoviClienProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleMoviClienProve"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleMoviClienProve";
		inputMap = this.jButtonNuevoRelacionesDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleMoviClienProve"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleMoviClienProve";
		inputMap = this.jButtonModificarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleMoviClienProve"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleMoviClienProve";
		inputMap = this.jButtonCerrarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleMoviClienProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleMoviClienProve";
		inputMap = this.jButtonGuardarCambiosTablaDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleMoviClienProve"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1DetalleMoviClienProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleMoviClienProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleMoviClienProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleMoviClienProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleMoviClienProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleMoviClienProve.setName("jPanelParametrosReportesDetalleMoviClienProve"); 
		
		this.jPanelParametrosReportesAccionesDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleMoviClienProve.setName("jPanelParametrosReportesAccionesDetalleMoviClienProve"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionDetalleMoviClienProve = new JButtonMe();
		this.jButtonRecargarInformacionDetalleMoviClienProve.setText("Recargar");
		this.jButtonRecargarInformacionDetalleMoviClienProve.setToolTipText("Recargar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleMoviClienProve,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionDetalleMoviClienProve = new JButtonMe();
		this.jButtonProcesarInformacionDetalleMoviClienProve.setText("Procesar");
		this.jButtonProcesarInformacionDetalleMoviClienProve.setToolTipText("Procesar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleMoviClienProve.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleMoviClienProve.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleMoviClienProve.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleMoviClienProve.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMoviClienProve.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleMoviClienProve.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMoviClienProve.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleMoviClienProve.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleMoviClienProve.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleMoviClienProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleMoviClienProve.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleMoviClienProve.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleMoviClienProve.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleMoviClienProve.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleMoviClienProve.setText("Accion");
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleMoviClienProve.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleMoviClienProve.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleMoviClienProve=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleMoviClienProve.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleMoviClienProve.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleMoviClienProve.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesDetalleMoviClienProve = new JLabelMe();
		
		this.jLabelAccionesDetalleMoviClienProve.setText("Acciones");		
		this.jLabelAccionesDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleMoviClienProve = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleMoviClienProve.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleMoviClienProve.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleMoviClienProve = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleMoviClienProve.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleMoviClienProve.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleMoviClienProve = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleMoviClienProve.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleMoviClienProve.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresDetalleMoviClienProve = new JButtonMe();
		//this.jButtonAnterioresDetalleMoviClienProve.setText("<<");
        this.jButtonAnterioresDetalleMoviClienProve.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleMoviClienProve,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleMoviClienProve = new JButtonMe();
		//this.jButtonSiguientesDetalleMoviClienProve.setText(">>");
        this.jButtonSiguientesDetalleMoviClienProve.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleMoviClienProve,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleMoviClienProve = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleMoviClienProve.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleMoviClienProve.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleMoviClienProve,"nuevoguardarcambios_button","Nue",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleMoviClienProve";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleMoviClienProve"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionDetalleMoviClienProve";
		inputMap = this.jButtonRecargarInformacionDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleMoviClienProve"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleMoviClienProve";
		inputMap = this.jButtonSiguientesDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleMoviClienProve"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleMoviClienProve";
		inputMap = this.jButtonAnterioresDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleMoviClienProve"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasDetalleMoviClienProve();			
			*/
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleMoviClienProve.setMinimumSize(new Dimension(this.getWidth(),DetalleMoviClienProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMoviClienProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleMoviClienProve.setMaximumSize(new Dimension(this.getWidth(),DetalleMoviClienProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMoviClienProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleMoviClienProve.setPreferredSize(new Dimension(this.getWidth(),DetalleMoviClienProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleMoviClienProveBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleMoviClienProve = new GridBagLayout();

			this.jPanelPaginacionDetalleMoviClienProve.setLayout(gridaBagLayoutPaginacionDetalleMoviClienProve);						
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonAnterioresDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
					
						
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
			
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonNuevoGuardarCambiosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
						
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonSiguientesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 1;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonNuevoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
						
			
			
			if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
				this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleMoviClienProve.gridy = 1;
				this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonGuardarCambiosTablaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			}
			
			
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 1;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonDuplicarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 1;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonCopiarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 1;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonVerFormDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 1;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleMoviClienProve.add(this.jButtonCerrarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		/*
		this.jButtonRecargarInformacionDetalleMoviClienProve.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleMoviClienProve.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleMoviClienProve.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesDetalleMoviClienProve.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleMoviClienProve.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleMoviClienProve.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleMoviClienProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleMoviClienProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleMoviClienProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleMoviClienProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleMoviClienProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleMoviClienProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleMoviClienProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleMoviClienProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleMoviClienProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleMoviClienProve.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleMoviClienProve.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleMoviClienProve.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosDetalleMoviClienProve.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleMoviClienProve.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleMoviClienProve.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleMoviClienProve.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleMoviClienProve.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleMoviClienProve.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleMoviClienProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleMoviClienProve = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleMoviClienProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleMoviClienProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleMoviClienProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleMoviClienProve = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleMoviClienProve.setLayout(gridaBagParametrosReportesDetalleMoviClienProve);
			this.jPanelParametrosReportesAccionesDetalleMoviClienProve.setLayout(gridaBagParametrosReportesAccionesDetalleMoviClienProve);
			
			/*
			this.jPanelParametrosAuxiliar1DetalleMoviClienProve.setLayout(gridaBagParametrosAuxiliar1DetalleMoviClienProve);
			this.jPanelParametrosAuxiliar2DetalleMoviClienProve.setLayout(gridaBagParametrosAuxiliar2DetalleMoviClienProve);
			this.jPanelParametrosAuxiliar3DetalleMoviClienProve.setLayout(gridaBagParametrosAuxiliar3DetalleMoviClienProve);
			this.jPanelParametrosAuxiliar4DetalleMoviClienProve.setLayout(gridaBagParametrosAuxiliar4DetalleMoviClienProve);
			//this.jPanelParametrosAuxiliar5DetalleMoviClienProve.setLayout(gridaBagParametrosAuxiliar2DetalleMoviClienProve);			
			*/
			
			
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jButtonRecargarInformacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMoviClienProve.add(this.jComboBoxTiposPaginacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMoviClienProve.add(this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleMoviClienProve.add(this.jComboBoxTiposArchivosReportesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jPanelParametrosAuxiliar1DetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleMoviClienProve.add(this.jComboBoxTiposReportesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);																		
			*/
			
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleMoviClienProve.add(this.jComboBoxTiposGraficosReportesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jPanelParametrosAuxiliar4DetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jComboBoxTiposReportesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jCheckBoxGenerarReporteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jPanelParametrosAuxiliar2DetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jLabelAccionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
				this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jButtonAbrirOrderByDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jComboBoxTiposSeleccionarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
			*/
			
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jCheckBoxSeleccionarTodosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jCheckBoxConGraficoReporteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMoviClienProve.add(this.jCheckBoxSeleccionarTodosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);															
				
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMoviClienProve.add(this.jCheckBoxSeleccionadosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);															
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleMoviClienProve.add(this.jCheckBoxConGraficoReporteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jPanelParametrosAuxiliar3DetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jComboBoxTiposAccionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
	
				
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleMoviClienProve.add(this.jTextFieldValorCampoGeneralDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
			
			*/
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleMoviClienProve = new GridBagLayout();

			this.jScrollPanelDatosDetalleMoviClienProve.setLayout(gridaBagLayoutDatosDetalleMoviClienProve);
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
			
			this.jScrollPanelDatosDetalleMoviClienProve.add(this.jTableDatosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleMoviClienProve.setViewportView(this.jTableDatosDetalleMoviClienProve);
		this.jTableDatosDetalleMoviClienProve.setFillsViewportHeight(true);
		this.jTableDatosDetalleMoviClienProve.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleMoviClienProve= new GridBagLayout();
		this.jPanelAccionesDetalleMoviClienProve.setLayout(gridaBagLayoutAccionesDetalleMoviClienProve);
		
		
		/*	
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
			
		this.jPanelAccionesDetalleMoviClienProve.add(this.jButtonNuevoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetalleMoviClienProve= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetalleMoviClienProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleMoviClienProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleMoviClienProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetalleMoviClienProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetalleMoviClienProve.setLayout(gridaBagLayoutFK_IdAsientoContableDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdAsientoContableDetalleMoviClienProve.add(jLabelid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 1;
		jPanelFK_IdAsientoContableDetalleMoviClienProve.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);


		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdAsientoContableDetalleMoviClienProve.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 1;
		gridBagConstraintsDetalleMoviClienProve.gridx =1;
		jPanelFK_IdAsientoContableDetalleMoviClienProve.add(jButtonFK_IdAsientoContableDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		jTabbedPaneBusquedasDetalleMoviClienProve.addTab("1.-Por Asiento C. ", jPanelFK_IdAsientoContableDetalleMoviClienProve);
		jTabbedPaneBusquedasDetalleMoviClienProve.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteDetalleMoviClienProve= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDetalleMoviClienProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleMoviClienProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleMoviClienProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDetalleMoviClienProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDetalleMoviClienProve.setLayout(gridaBagLayoutFK_IdClienteDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdClienteDetalleMoviClienProve.add(jLabelid_clienteFK_IdClienteDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 1;
		jPanelFK_IdClienteDetalleMoviClienProve.add(jComboBoxid_clienteFK_IdClienteDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);


		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdClienteDetalleMoviClienProve.add(this.jButtonBuscarFK_IdClienteid_clienteDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 1;
		gridBagConstraintsDetalleMoviClienProve.gridx =1;
		jPanelFK_IdClienteDetalleMoviClienProve.add(jButtonFK_IdClienteDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		jTabbedPaneBusquedasDetalleMoviClienProve.addTab("2.-Por Cliente/Prove ", jPanelFK_IdClienteDetalleMoviClienProve);
		jTabbedPaneBusquedasDetalleMoviClienProve.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdDetalleMoviClienProveDetalleMoviClienProve= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleMoviClienProveDetalleMoviClienProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleMoviClienProveDetalleMoviClienProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleMoviClienProveDetalleMoviClienProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleMoviClienProveDetalleMoviClienProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve.setLayout(gridaBagLayoutFK_IdDetalleMoviClienProveDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve.add(jLabelid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 1;
		jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve.add(jComboBoxid_sucursal_movimientoFK_IdDetalleMoviClienProveDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 1;
		gridBagConstraintsDetalleMoviClienProve.gridx =1;
		jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve.add(jButtonFK_IdDetalleMoviClienProveDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		jTabbedPaneBusquedasDetalleMoviClienProve.addTab("3.-Por Sucursal Movimiento ", jPanelFK_IdDetalleMoviClienProveDetalleMoviClienProve);
		jTabbedPaneBusquedasDetalleMoviClienProve.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleClienteDetalleMoviClienProve= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleMoviClienProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleMoviClienProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleMoviClienProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleMoviClienProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve.setLayout(gridaBagLayoutFK_IdEstadoDetalleClienteDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve.add(jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 1;
		jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve.add(jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 1;
		gridBagConstraintsDetalleMoviClienProve.gridx =1;
		jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve.add(jButtonFK_IdEstadoDetalleClienteDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		jTabbedPaneBusquedasDetalleMoviClienProve.addTab("4.-Por Estado Detalle Cliente ", jPanelFK_IdEstadoDetalleClienteDetalleMoviClienProve);
		jTabbedPaneBusquedasDetalleMoviClienProve.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFacturaDetalleMoviClienProve= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaDetalleMoviClienProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleMoviClienProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleMoviClienProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaDetalleMoviClienProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaDetalleMoviClienProve.setLayout(gridaBagLayoutFK_IdFacturaDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdFacturaDetalleMoviClienProve.add(jLabelid_facturaFK_IdFacturaDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 1;
		jPanelFK_IdFacturaDetalleMoviClienProve.add(jComboBoxid_facturaFK_IdFacturaDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);


		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdFacturaDetalleMoviClienProve.add(this.jButtonBuscarFK_IdFacturaid_facturaDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 1;
		gridBagConstraintsDetalleMoviClienProve.gridx =1;
		jPanelFK_IdFacturaDetalleMoviClienProve.add(jButtonFK_IdFacturaDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		jTabbedPaneBusquedasDetalleMoviClienProve.addTab("5.-Por Factura ", jPanelFK_IdFacturaDetalleMoviClienProve);
		jTabbedPaneBusquedasDetalleMoviClienProve.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloDetalleMoviClienProve= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleMoviClienProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleMoviClienProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleMoviClienProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleMoviClienProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 1;
		gridBagConstraintsDetalleMoviClienProve.gridx =1;
		jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve.add(jButtonFK_IdTipoTransaccionModuloDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		jTabbedPaneBusquedasDetalleMoviClienProve.addTab("6.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloDetalleMoviClienProve);
		jTabbedPaneBusquedasDetalleMoviClienProve.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTransaccionDetalleMoviClienProve= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionDetalleMoviClienProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleMoviClienProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleMoviClienProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionDetalleMoviClienProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionDetalleMoviClienProve.setLayout(gridaBagLayoutFK_IdTransaccionDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		jPanelFK_IdTransaccionDetalleMoviClienProve.add(jLabelid_transaccionFK_IdTransaccionDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		gridBagConstraintsDetalleMoviClienProve.gridx = 1;
		jPanelFK_IdTransaccionDetalleMoviClienProve.add(jComboBoxid_transaccionFK_IdTransaccionDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleMoviClienProve.gridy = 1;
		gridBagConstraintsDetalleMoviClienProve.gridx =1;
		jPanelFK_IdTransaccionDetalleMoviClienProve.add(jButtonFK_IdTransaccionDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);

		jTabbedPaneBusquedasDetalleMoviClienProve.addTab("7.-Por Tipo ", jPanelFK_IdTransaccionDetalleMoviClienProve);
		jTabbedPaneBusquedasDetalleMoviClienProve.setMnemonicAt(6, KeyEvent.VK_7);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleMoviClienProve);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();						
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;		
			//this.gridBagConstraintsDetalleMoviClienProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleMoviClienProve.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;		
		//this.gridBagConstraintsDetalleMoviClienProve.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleMoviClienProve);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;		
			this.gridBagConstraintsDetalleMoviClienProve.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleMoviClienProve.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);								
		*/
		
		/*
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		*/		
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleMoviClienProve.gridx =0;
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleMoviClienProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
				
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleMoviClienProveJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleMoviClienProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleMoviClienProve = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleMoviClienProve.setLayout(gridaBagLayoutBusquedasParametrosDetalleMoviClienProve);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleMoviClienProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			
			
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
			
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleMoviClienProve;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleMoviClienProve() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleMoviClienProve = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleMoviClienProve.setName("jPanelReporteDinamicoDetalleMoviClienProve"); 
		
		this.jPanelReporteDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleMoviClienProve.setLayout(gridaBagLayoutReporteDinamicoDetalleMoviClienProve);
		
		
		this.jInternalFrameReporteDinamicoDetalleMoviClienProve= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleMoviClienProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleMoviClienProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleMoviClienProve = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleMoviClienProve.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelColumnasSelectReporteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleMoviClienProve = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleMoviClienProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleMoviClienProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleMoviClienProve.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleMoviClienProve.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleMoviClienProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleMoviClienProve=new JScrollPane(this.jListColumnasSelectReporteDetalleMoviClienProve);
			
			this.jScrollColumnasSelectReporteDetalleMoviClienProve.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleMoviClienProve.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleMoviClienProve.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jListColumnasSelectReporteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jScrollColumnasSelectReporteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleMoviClienProve = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleMoviClienProve.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleMoviClienProve = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleMoviClienProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleMoviClienProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleMoviClienProve.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleMoviClienProve.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleMoviClienProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleMoviClienProve=new JScrollPane(this.jListRelacionesSelectReporteDetalleMoviClienProve);
			
			this.jScrollRelacionesSelectReporteDetalleMoviClienProve.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleMoviClienProve.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleMoviClienProve.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleMoviClienProve = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleMoviClienProve = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleMoviClienProve.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelConGraficoDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jCheckBoxConGraficoDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleMoviClienProve = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleMoviClienProve.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelColumnaCategoriaGraficoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleMoviClienProve = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleMoviClienProve.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelColumnaCategoriaValorDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleMoviClienProve.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleMoviClienProve.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jComboBoxColumnaCategoriaValorDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleMoviClienProve = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleMoviClienProve.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelColumnasValoresGraficoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleMoviClienProve = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleMoviClienProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleMoviClienProve.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleMoviClienProve.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleMoviClienProve.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleMoviClienProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleMoviClienProve=new JScrollPane(this.jListColumnasValoresGraficoDetalleMoviClienProve);
			
			this.jScrollColumnasValoresGraficoDetalleMoviClienProve.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleMoviClienProve.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleMoviClienProve.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jListColumnasSelectReporteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jScrollColumnasValoresGraficoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleMoviClienProve = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleMoviClienProve.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelTiposGraficosReportesDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleMoviClienProve.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleMoviClienProve.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleMoviClienProve = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleMoviClienProve.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelGenerarExcelReporteDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleMoviClienProve = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleMoviClienProve.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleMoviClienProve,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleMoviClienProve.setToolTipText("Generar EXCEL"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jButtonGenerarExcelReporteDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jComboBoxTiposReportesDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleMoviClienProve = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleMoviClienProve.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jLabelTiposArchivoReporteDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleMoviClienProve = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleMoviClienProve.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleMoviClienProve,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleMoviClienProve.setToolTipText("Generar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jButtonGenerarReporteDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleMoviClienProve = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleMoviClienProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleMoviClienProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleMoviClienProve.setToolTipText("Cancelar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleMoviClienProve.add(this.jButtonCerrarReporteDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleMoviClienProve = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleMoviClienProve= new JScrollPane(jPanelReporteDinamicoDetalleMoviClienProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleMoviClienProve.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleMoviClienProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleMoviClienProve.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleMoviClienProve);
		this.jInternalFrameReporteDinamicoDetalleMoviClienProve.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleMoviClienProve() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleMoviClienProve = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleMoviClienProve.setName("jPanelImportacionDetalleMoviClienProve"); 
		
		this.jPanelImportacionDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleMoviClienProve.setLayout(gridaBagLayoutImportacionDetalleMoviClienProve);
		
		
		this.jInternalFrameImportacionDetalleMoviClienProve= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleMoviClienProve= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleMoviClienProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleMoviClienProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleMoviClienProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleMoviClienProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleMoviClienProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleMoviClienProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleMoviClienProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleMoviClienProve.setResizable(true);
	    this.jInternalFrameImportacionDetalleMoviClienProve.setClosable(true);
	    this.jInternalFrameImportacionDetalleMoviClienProve.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleMoviClienProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleMoviClienProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleMoviClienProve.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleMoviClienProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleMoviClienProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleMoviClienProve.setResizable(true);
	    this.jInternalFrameImportacionDetalleMoviClienProve.setClosable(true);
	    this.jInternalFrameImportacionDetalleMoviClienProve.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleMoviClienProve = new JLabelMe();

		this.jLabelArchivoImportacionDetalleMoviClienProve.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleMoviClienProve.add(this.jLabelArchivoImportacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleMoviClienProve = new JFileChooser();		
		this.jFileChooserImportacionDetalleMoviClienProve.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleMoviClienProve = new JButtonMe();
		this.jButtonAbrirImportacionDetalleMoviClienProve.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleMoviClienProve,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleMoviClienProve.setToolTipText("Generar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMoviClienProve.add(this.jButtonAbrirImportacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleMoviClienProve = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleMoviClienProve.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleMoviClienProve.add(this.jLabelPathArchivoImportacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleMoviClienProve=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleMoviClienProve.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleMoviClienProve.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleMoviClienProve.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMoviClienProve.add(this.jTextFieldPathArchivoImportacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleMoviClienProve = new JButtonMe();
		this.jButtonGenerarImportacionDetalleMoviClienProve.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleMoviClienProve,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleMoviClienProve.setToolTipText("Generar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMoviClienProve.add(this.jButtonGenerarImportacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleMoviClienProve = new JButtonMe();
		this.jButtonCerrarImportacionDetalleMoviClienProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleMoviClienProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleMoviClienProve.setToolTipText("Cancelar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleMoviClienProve.add(this.jButtonCerrarImportacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleMoviClienProve = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleMoviClienProve= new JScrollPane(jPanelImportacionDetalleMoviClienProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleMoviClienProve.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleMoviClienProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleMoviClienProve.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleMoviClienProve);
		this.jInternalFrameImportacionDetalleMoviClienProve.getContentPane().add(this.jScrollPanelImportacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleMoviClienProve(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleMoviClienProve = new JButtonMe();
			this.jButtonAbrirOrderByDetalleMoviClienProve.setText("Orden");
			this.jButtonAbrirOrderByDetalleMoviClienProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleMoviClienProve,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleMoviClienProve";
			inputMap = this.jButtonAbrirOrderByDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleMoviClienProve"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleMoviClienProve = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleMoviClienProve.setName("jPanelOrderByDetalleMoviClienProve"); 
			
			this.jPanelOrderByDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleMoviClienProve.setLayout(gridaBagLayoutOrderByDetalleMoviClienProve);
			
			
			this.jTableDatosDetalleMoviClienProveOrderBy = new JTableMe();        
			this.jTableDatosDetalleMoviClienProveOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleMoviClienProveOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleMoviClienProveOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleMoviClienProveOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleMoviClienProveOrderBy.setViewportView(this.jTableDatosDetalleMoviClienProveOrderBy);
			this.jTableDatosDetalleMoviClienProveOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleMoviClienProveOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleMoviClienProve= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleMoviClienProve= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleMoviClienProve = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleMoviClienProve= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleMoviClienProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleMoviClienProve.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleMoviClienProve.setTitle("Orden");
			this.jInternalFrameOrderByDetalleMoviClienProve.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleMoviClienProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleMoviClienProve.setResizable(true);
			this.jInternalFrameOrderByDetalleMoviClienProve.setClosable(true);
			this.jInternalFrameOrderByDetalleMoviClienProve.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleMoviClienProve.ipady =150;
				
			this.jPanelOrderByDetalleMoviClienProve.add(jScrollPanelDatosDetalleMoviClienProveOrderBy, this.gridBagConstraintsDetalleMoviClienProve);//this.jTableDatosDetalleMoviClienProveTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleMoviClienProve = new JButtonMe();
			this.jButtonCerrarOrderByDetalleMoviClienProve.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleMoviClienProve,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleMoviClienProve.setToolTipText("Cancelar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleMoviClienProve.add(this.jButtonCerrarOrderByDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleMoviClienProve = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleMoviClienProve= new JScrollPane(jPanelOrderByDetalleMoviClienProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleMoviClienProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleMoviClienProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleMoviClienProve.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleMoviClienProve);
			
			this.jInternalFrameOrderByDetalleMoviClienProve.getContentPane().add(this.jScrollPanelOrderByDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
		
		} else {
			this.jButtonAbrirOrderByDetalleMoviClienProve = new JButtonMe();
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
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallemoviclienproveSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleMoviClienProve.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleMoviClienProve.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleMoviClienProve.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleMoviClienProve.getRowHeight();//DetalleMoviClienProveConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve.isSelected()) {
					iHeightTable=DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaDetalleMoviClienProve.isSelected()) {
					iHeightTable=DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleMoviClienProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleMoviClienProve!=null && this.jInternalFrameOrderByDetalleMoviClienProve.getjTableDatosOrderBy()!=null) {
			//if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleMoviClienProve.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleMoviClienProve.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleMoviClienProve.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleMoviClienProve.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleMoviClienProve.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleMoviClienProve.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleMoviClienProve.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallemoviclienproveLogic.getDetalleMoviClienProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallemoviclienproves.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleMoviClienProve> TraerDetalleMoviClienProveBeans(List<DetalleMoviClienProve> detallemoviclienproves,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleMoviClienProve detallemoviclienprove:detallemoviclienproves) {
					
				if(!(DetalleMoviClienProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleMoviClienProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallemoviclienprove.setsDetalleGeneralEntityReporte(DetalleMoviClienProveConstantesFunciones.getDetalleMoviClienProveDescripcion(detallemoviclienprove));
										
						
					
						
					
				} else  {
							
					//detallemoviclienprove.setsDetalleGeneralEntityReporte(detallemoviclienprove.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallemoviclienprovebeans.add(detallemoviclienprovebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallemoviclienproves;
    }
	//PARA REPORTES FIN
}
