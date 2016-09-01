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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.PedidoCompraImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class PedidoCompraImporJInternalFrame extends PedidoCompraImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidoCompraImpor;
	
	protected JMenuBar jmenuBarPedidoCompraImpor;
	
	protected JMenu jmenuPedidoCompraImpor;
	protected JMenu jmenuDatosPedidoCompraImpor;
	protected JMenu jmenuArchivoPedidoCompraImpor;
	protected JMenu jmenuAccionesPedidoCompraImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoCompraImpor;	
	protected GridBagConstraints gridBagConstraintsPedidoCompraImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidoCompraImporDetalleFormJInternalFrame jInternalFrameDetalleFormPedidoCompraImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidoCompraImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidoCompraImpor;	
	
	
	
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

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteproveedor="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoProrrateoImporBeanSwingJInternalFrame tipoprorrateoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprorrateoimpor="";

	protected EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_embarcador="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puerto="";

	protected PuertoBeanSwingJInternalFrame puertodestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puertodestino="";

	protected TipoTerminosImporBeanSwingJInternalFrame tipoterminosimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoterminosimpor="";

	protected EstadoPedidoCompraBeanSwingJInternalFrame estadopedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidocompra="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public PaisSessionBean paisSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoProrrateoImporSessionBean tipoprorrateoimporSessionBean;
	public EmbarcadorSessionBean embarcadorSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public PuertoSessionBean puertoSessionBean;
	public PuertoSessionBean puertodestinoSessionBean;
	public TipoTerminosImporSessionBean tipoterminosimporSessionBean;
	public EstadoPedidoCompraSessionBean estadopedidocompraSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PedidoCompraImpor> pedidocompraimpors;		
	public List<PedidoCompraImpor> pedidocompraimporsEliminados;	
	public List<PedidoCompraImpor> pedidocompraimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidoCompraImpor;		
	protected JButton jButtonAbrirOrderByPedidoCompraImpor;
	
	
	//protected JPanel jPanelOrderByPedidoCompraImpor;
	//public JScrollPane jScrollPanelOrderByPedidoCompraImpor;	
	//protected JButton jButtonCerrarOrderByPedidoCompraImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidoCompraImporLogic pedidocompraimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidoCompraImpor;
	public JScrollPane jScrollPanelDatosEdicionPedidoCompraImpor;
	public JScrollPane jScrollPanelDatosGeneralPedidoCompraImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidoCompraImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidoCompraImpor;
	//public JScrollPane jScrollPanelImportacionPedidoCompraImpor;
	
	
	
	protected JPanel jPanelAccionesPedidoCompraImpor;
	
    protected JPanel jPanelPaginacionPedidoCompraImpor;
    protected JPanel jPanelParametrosReportesPedidoCompraImpor;
	protected JPanel jPanelParametrosReportesAccionesPedidoCompraImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PedidoCompraImpor;
	protected JPanel jPanelParametrosAuxiliar2PedidoCompraImpor;
	protected JPanel jPanelParametrosAuxiliar3PedidoCompraImpor;
	protected JPanel jPanelParametrosAuxiliar4PedidoCompraImpor;
	//protected JPanel jPanelParametrosAuxiliar5PedidoCompraImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidoCompraImpor;
	//protected JPanel jPanelImportacionPedidoCompraImpor;
	
	
	public JTable jTableDatosPedidoCompraImpor;
	
	
	
	//public JTable jTableDatosPedidoCompraImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidoCompraImpor;
	protected JButton jButtonDuplicarPedidoCompraImpor;
	protected JButton jButtonCopiarPedidoCompraImpor;
	protected JButton jButtonVerFormPedidoCompraImpor;
	protected JButton jButtonNuevoRelacionesPedidoCompraImpor;
	protected JButton jButtonModificarPedidoCompraImpor;
	
    protected JButton jButtonGuardarCambiosTablaPedidoCompraImpor;
	protected JButton jButtonCerrarPedidoCompraImpor;
	
	
	protected JButton jButtonRecargarInformacionPedidoCompraImpor;
	protected JButton jButtonProcesarInformacionPedidoCompraImpor;
	
	
	protected JButton jButtonAnterioresPedidoCompraImpor;
	protected JButton jButtonSiguientesPedidoCompraImpor;
	protected JButton jButtonNuevoGuardarCambiosPedidoCompraImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidoCompraImpor;
	//protected JButton jButtonCerrarReporteDinamicoPedidoCompraImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidoCompraImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidoCompraImpor;
	//protected JButton jButtonGenerarImportacionPedidoCompraImpor;
	//protected JButton jButtonCerrarImportacionPedidoCompraImpor;
	//protected JFileChooser jFileChooserImportacionPedidoCompraImpor;
	//protected File fileImportacionPedidoCompraImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoCompraImpor;
	protected JButton jButtonDuplicarToolBarPedidoCompraImpor;
	protected JButton jButtonNuevoRelacionesToolBarPedidoCompraImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidoCompraImpor;
	protected JButton jButtonCopiarToolBarPedidoCompraImpor;
	protected JButton jButtonVerFormToolBarPedidoCompraImpor;
	public JButton jButtonGuardarCambiosTablaToolBarPedidoCompraImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoCompraImpor;
	protected JButton jButtonCerrarToolBarPedidoCompraImpor;
	
	protected JButton jButtonRecargarInformacionToolBarPedidoCompraImpor;
	protected JButton jButtonProcesarInformacionToolBarPedidoCompraImpor;
	protected JButton jButtonAnterioresToolBarPedidoCompraImpor;
	protected JButton jButtonSiguientesToolBarPedidoCompraImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidoCompraImpor;
	protected JButton jButtonAbrirOrderByToolBarPedidoCompraImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoCompraImpor;
	protected JMenuItem jMenuItemDuplicarPedidoCompraImpor;
	protected JMenuItem jMenuItemNuevoRelacionesPedidoCompraImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidoCompraImpor;
	protected JMenuItem jMenuItemCopiarPedidoCompraImpor;
	protected JMenuItem jMenuItemVerFormPedidoCompraImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoCompraImpor;
	protected JMenuItem jMenuItemCerrarPedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleCerrarPedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoCompraImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidoCompraImpor;
	protected JMenuItem jMenuItemProcesarInformacionPedidoCompraImpor;
	protected JMenuItem jMenuItemAnterioresPedidoCompraImpor;
	protected JMenuItem jMenuItemSiguientesPedidoCompraImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoCompraImpor;
	protected JMenuItem jMenuItemAbrirOrderByPedidoCompraImpor;
	protected JMenuItem jMenuItemMostrarOcultarPedidoCompraImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoCompraImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidoCompraImpor;
	protected JCheckBox jCheckBoxSeleccionadosPedidoCompraImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidoCompraImpor;
	protected JCheckBox jCheckBoxConGraficoReportePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidoCompraImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidoCompraImpor;
	protected JTextField jTextFieldValorCampoGeneralPedidoCompraImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidoCompraImpor;
	//public JList<Reporte> jListColumnasSelectReportePedidoCompraImpor;
	//public JScrollPane jScrollColumnasSelectReportePedidoCompraImpor;
	
	//public JLabel jLabelRelacionesSelectReportePedidoCompraImpor;
	//public JList<Reporte> jListRelacionesSelectReportePedidoCompraImpor;
	//public JScrollPane jScrollRelacionesSelectReportePedidoCompraImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidoCompraImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidoCompraImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidoCompraImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidoCompraImpor;
	
		
	//public JLabel jLabelArchivoImportacionPedidoCompraImpor;	
	//public JLabel jLabelPathArchivoImportacionPedidoCompraImpor;
	//protected JTextField jTextFieldPathArchivoImportacionPedidoCompraImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidoCompraImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidoCompraImpor;
	
	//public JLabel jLabelColumnaCategoriaValorPedidoCompraImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidoCompraImpor;
	
	//public JLabel jLabelColumnasValoresGraficoPedidoCompraImpor;
	//public JList<Reporte> jListColumnasValoresGraficoPedidoCompraImpor;
	//public JScrollPane jScrollColumnasValoresGraficoPedidoCompraImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidoCompraImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidoCompraImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidoCompraImpor;
	public JPanel jPanelFK_IdClientePedidoCompraImpor;
	public JButton jButtonFK_IdClientePedidoCompraImpor;
	public JPanel jPanelFK_IdClienteProveedorPedidoCompraImpor;
	public JButton jButtonFK_IdClienteProveedorPedidoCompraImpor;
	public JPanel jPanelFK_IdEmbarcadorPedidoCompraImpor;
	public JButton jButtonFK_IdEmbarcadorPedidoCompraImpor;
	public JPanel jPanelFK_IdEmpleadoPedidoCompraImpor;
	public JButton jButtonFK_IdEmpleadoPedidoCompraImpor;
	public JPanel jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor;
	public JButton jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor;
	public JPanel jPanelFK_IdPaisPedidoCompraImpor;
	public JButton jButtonFK_IdPaisPedidoCompraImpor;
	public JPanel jPanelFK_IdPuertoPedidoCompraImpor;
	public JButton jButtonFK_IdPuertoPedidoCompraImpor;
	public JPanel jPanelFK_IdPuertoDestinoPedidoCompraImpor;
	public JButton jButtonFK_IdPuertoDestinoPedidoCompraImpor;
	public JPanel jPanelFK_IdTipoProrrateoImporPedidoCompraImpor;
	public JButton jButtonFK_IdTipoProrrateoImporPedidoCompraImpor;
	public JPanel jPanelFK_IdTipoTerminosImporPedidoCompraImpor;
	public JButton jButtonFK_IdTipoTerminosImporPedidoCompraImpor;
	public JPanel jPanelFK_IdTipoViaTransportePedidoCompraImpor;
	public JButton jButtonFK_IdTipoViaTransportePedidoCompraImpor;
	
	public JPanel jPanelid_clienteFK_IdClientePedidoCompraImpor;
	public JLabel jLabelid_clienteFK_IdClientePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePedidoCompraImpor;
	public JButton jButtonid_clienteFK_IdClientePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoCompraImporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor;
	
	public JPanel jPanelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor;
	public JLabel jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor;
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor;
	
	public JPanel jPanelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor;
	public JLabel jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_embarcadorFK_IdEmbarcadorPedidoCompraImpor;
	public JButton jButtonid_embarcadorFK_IdEmbarcadorPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_embarcadorFK_IdEmbarcadorPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_embarcadorFK_IdEmbarcadorPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPedidoCompraImpor;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPedidoCompraImpor;
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoCompraImporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor;
	
	public JPanel jPanelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor;
	public JLabel jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor;
	public JButton jButtonid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisPedidoCompraImpor;
	public JLabel jLabelid_paisFK_IdPaisPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisPedidoCompraImpor;
	public JButton jButtonid_paisFK_IdPaisPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_puertoFK_IdPuertoPedidoCompraImpor;
	public JLabel jLabelid_puertoFK_IdPuertoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puertoFK_IdPuertoPedidoCompraImpor;
	public JButton jButtonid_puertoFK_IdPuertoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_puertoFK_IdPuertoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_puertoFK_IdPuertoPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor;
	public JLabel jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor;
	public JButton jButtonid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor;
	public JLabel jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor;
	public JButton jButtonid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor;
	public JLabel jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor;
	public JButton jButtonid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor;
	public JLabel jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor;
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImporBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1408;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PedidoCompraImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidoCompraImpor)	{
		this.jButtonRecargarInformacionPedidoCompraImpor = jButtonRecargarInformacionPedidoCompraImpor;
	}
	
	public JButton getjButtonProcesarInformacionPedidoCompraImpor() {
		return this.jButtonProcesarInformacionPedidoCompraImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoCompraImpor)	{
		this.jButtonProcesarInformacionPedidoCompraImpor = jButtonProcesarInformacionPedidoCompraImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidoCompraImpor() {
		return this.jButtonRecargarInformacionPedidoCompraImpor;
	}
	
	
	public List<PedidoCompraImpor> getpedidocompraimpors() {
		return this.pedidocompraimpors;
	}

	public void setpedidocompraimpors(List<PedidoCompraImpor> pedidocompraimpors) {
		this.pedidocompraimpors = pedidocompraimpors;
	}
	
	public List<PedidoCompraImpor> getpedidocompraimporsAux() {
		return this.pedidocompraimporsAux;
	}

	public void setpedidocompraimporsAux(List<PedidoCompraImpor> pedidocompraimporsAux) {
		this.pedidocompraimporsAux = pedidocompraimporsAux;
	}
	
	public List<PedidoCompraImpor> getpedidocompraimporsEliminados() {
		return this.pedidocompraimporsEliminados;
	}

	public void setPedidoCompraImporsEliminados(List<PedidoCompraImpor> pedidocompraimporsEliminados) {
		this.pedidocompraimporsEliminados = pedidocompraimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidoCompraImpor() {
		return jComboBoxTiposSeleccionarPedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidoCompraImpor(
			JComboBox jComboBoxTiposSeleccionarPedidoCompraImpor) {
		this.jComboBoxTiposSeleccionarPedidoCompraImpor = jComboBoxTiposSeleccionarPedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidoCompraImpor() {
		return jTextFieldValorCampoGeneralPedidoCompraImpor;
	}

	public void setjTextFieldValorCampoGeneralPedidoCompraImpor(
			JTextField jTextFieldValorCampoGeneralPedidoCompraImpor) {
		this.jTextFieldValorCampoGeneralPedidoCompraImpor = jTextFieldValorCampoGeneralPedidoCompraImpor;
	}

	public void setBorderResaltarValorCampoGeneralPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidoCompraImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidoCompraImpor() {
		return this.jCheckBoxSeleccionarTodosPedidoCompraImpor;
	}

	public void setjCheckBoxSeleccionarTodosPedidoCompraImpor(
			JCheckBox jCheckBoxSeleccionarTodosPedidoCompraImpor) {
		this.jCheckBoxSeleccionarTodosPedidoCompraImpor = jCheckBoxSeleccionarTodosPedidoCompraImpor;
	}

	public void setBorderResaltarSeleccionarTodosPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidoCompraImpor() {
		return this.jCheckBoxSeleccionadosPedidoCompraImpor;
	}

	public void setjCheckBoxSeleccionadosPedidoCompraImpor(
			JCheckBox jCheckBoxSeleccionadosPedidoCompraImpor) {
		this.jCheckBoxSeleccionadosPedidoCompraImpor = jCheckBoxSeleccionadosPedidoCompraImpor;
	}
	
	public void setBorderResaltarSeleccionadosPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidoCompraImpor() {
		return this.jComboBoxTiposArchivosReportesPedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidoCompraImpor(
			JComboBox jComboBoxTiposArchivosReportesPedidoCompraImpor) {
		this.jComboBoxTiposArchivosReportesPedidoCompraImpor = jComboBoxTiposArchivosReportesPedidoCompraImpor;
	}

	public void setBorderResaltarTiposArchivosReportesPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidoCompraImpor() {
		return this.jComboBoxTiposReportesPedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidoCompraImpor(
			JComboBox jComboBoxTiposReportesPedidoCompraImpor) {
		this.jComboBoxTiposReportesPedidoCompraImpor = jComboBoxTiposReportesPedidoCompraImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidoCompraImpor() {
	//	return jComboBoxTiposReportesDinamicoPedidoCompraImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidoCompraImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidoCompraImpor) {
	//	this.jComboBoxTiposReportesDinamicoPedidoCompraImpor = jComboBoxTiposReportesDinamicoPedidoCompraImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor = jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor;
	//}
	
	public void setBorderResaltarTiposReportesPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidoCompraImpor() {
		return this.jComboBoxTiposGraficosReportesPedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidoCompraImpor(
			JComboBox jComboBoxTiposGraficosReportesPedidoCompraImpor) {
		this.jComboBoxTiposGraficosReportesPedidoCompraImpor = jComboBoxTiposGraficosReportesPedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidoCompraImpor() {
		return this.jComboBoxTiposPaginacionPedidoCompraImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidoCompraImpor(
			JComboBox jComboBoxTiposPaginacionPedidoCompraImpor) {
		this.jComboBoxTiposPaginacionPedidoCompraImpor = jComboBoxTiposPaginacionPedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposPaginacionPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidoCompraImpor() {
		return this.jComboBoxTiposRelacionesPedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoCompraImpor() {
		return this.jComboBoxTiposAccionesPedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoCompraImpor(
			JComboBox jComboBoxTiposRelacionesPedidoCompraImpor) {
		this.jComboBoxTiposRelacionesPedidoCompraImpor = jComboBoxTiposRelacionesPedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoCompraImpor(
			JComboBox jComboBoxTiposAccionesPedidoCompraImpor) {
		this.jComboBoxTiposAccionesPedidoCompraImpor = jComboBoxTiposAccionesPedidoCompraImpor;
	}
	
	public void setBorderResaltarTiposRelacionesPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidoCompraImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidoCompraImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidoCompraImpor() {
	//	return jCheckBoxConGraficoDinamicoPedidoCompraImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidoCompraImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidoCompraImpor) {
	//	this.jCheckBoxConGraficoDinamicoPedidoCompraImpor = jCheckBoxConGraficoDinamicoPedidoCompraImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidoCompraImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidoCompraImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidoCompraImpor .setBorder(borderResaltar);		
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
		this.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
		
		this.pedidocompraimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidocompraimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidocompraimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoCompraImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 3850) {
			iWidth=3850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidoCompraImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"nuevo","nuevo","Nuevo"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"duplicar","duplicar","Duplicar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"copiar","copiar","Copiar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"ver_form","ver_form","Ver"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"recargar","recargar","Recargar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidoCompraImpor,this.jTtoolBarPedidoCompraImpor,
							"cerrar","cerrar","Salir"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidoCompraImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidoCompraImpor;
			
				this.jButtonProcesarInformacionToolBarPedidoCompraImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidoCompraImpor;
				
		//protected JButton jButtonModificarToolBarPedidoCompraImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidoCompraImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidoCompraImpor=new JMenuMe("General");
		this.jmenuArchivoPedidoCompraImpor=new JMenuMe("Archivo");
		this.jmenuAccionesPedidoCompraImpor=new JMenuMe("Acciones");
		this.jmenuDatosPedidoCompraImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoCompraImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoCompraImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoCompraImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidoCompraImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidoCompraImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidoCompraImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidoCompraImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidoCompraImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidoCompraImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidoCompraImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoCompraImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoCompraImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidoCompraImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidoCompraImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidoCompraImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidoCompraImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidoCompraImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidoCompraImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidoCompraImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidoCompraImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidoCompraImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoCompraImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoCompraImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoCompraImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidoCompraImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidoCompraImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidoCompraImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidoCompraImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidoCompraImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidoCompraImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidoCompraImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidoCompraImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidoCompraImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidoCompraImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidoCompraImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidoCompraImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidoCompraImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidoCompraImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidoCompraImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidoCompraImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidoCompraImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidoCompraImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidoCompraImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidoCompraImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidoCompraImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidoCompraImpor.add(this.jMenuItemCerrarPedidoCompraImpor);
			
			this.jmenuAccionesPedidoCompraImpor.add(this.jMenuItemNuevoPedidoCompraImpor);
			this.jmenuAccionesPedidoCompraImpor.add(this.jMenuItemNuevoGuardarCambiosPedidoCompraImpor);
			this.jmenuAccionesPedidoCompraImpor.add(this.jMenuItemNuevoRelacionesPedidoCompraImpor);
			this.jmenuAccionesPedidoCompraImpor.add(this.jMenuItemGuardarCambiosTablaPedidoCompraImpor);		
			this.jmenuAccionesPedidoCompraImpor.add(this.jMenuItemDuplicarPedidoCompraImpor);		
			this.jmenuAccionesPedidoCompraImpor.add(this.jMenuItemCopiarPedidoCompraImpor);		
			this.jmenuAccionesPedidoCompraImpor.add(this.jMenuItemVerFormPedidoCompraImpor);		
			
			this.jmenuDatosPedidoCompraImpor.add(this.jMenuItemRecargarInformacionPedidoCompraImpor);				
			this.jmenuDatosPedidoCompraImpor.add(this.jMenuItemAnterioresPedidoCompraImpor);				
			this.jmenuDatosPedidoCompraImpor.add(this.jMenuItemSiguientesPedidoCompraImpor);				
			this.jmenuDatosPedidoCompraImpor.add(this.jMenuItemAbrirOrderByPedidoCompraImpor);				
			this.jmenuDatosPedidoCompraImpor.add(this.jMenuItemMostrarOcultarPedidoCompraImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidoCompraImpor.add(this.jMenuItemGuardarCambiosPedidoCompraImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidoCompraImpor.add(this.jmenuArchivoPedidoCompraImpor);		
			this.jmenuBarPedidoCompraImpor.add(this.jmenuAccionesPedidoCompraImpor);		
			this.jmenuBarPedidoCompraImpor.add(this.jmenuDatosPedidoCompraImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidoCompraImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidoCompraImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClientePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePedidoCompraImpor.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdClientePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdClientePedidoCompraImpor.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePedidoCompraImpor,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePedidoCompraImpor = new JLabelMe();
		jLabelid_clienteFK_IdClientePedidoCompraImpor.setText("Cliente :");
		jLabelid_clienteFK_IdClientePedidoCompraImpor.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor.setFocusable(false);

		this.jPanelFK_IdClienteProveedorPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProveedorPedidoCompraImpor.setToolTipText("Buscar Por Cliente Proveedor ");
		this.jButtonFK_IdClienteProveedorPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdClienteProveedorPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdClienteProveedorPedidoCompraImpor.setToolTipText("Buscar Por Cliente Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProveedorPedidoCompraImpor,"buscar_button","Buscar Por Cliente Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProveedorPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor = new JLabelMe();
		jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setText("Cliente Proveedor :");
		jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setToolTipText("Cliente Proveedor");
		jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor= new JButtonMe();
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor.setText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor.setFocusable(false);

		this.jPanelFK_IdEmbarcadorPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmbarcadorPedidoCompraImpor.setToolTipText("Buscar Por Embarcador ");
		this.jButtonFK_IdEmbarcadorPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdEmbarcadorPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdEmbarcadorPedidoCompraImpor.setToolTipText("Buscar Por Embarcador ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmbarcadorPedidoCompraImpor,"buscar_button","Buscar Por Embarcador ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmbarcadorPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor = new JLabelMe();
		jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setText("Embarcador :");
		jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setToolTipText("Embarcador");
		jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_embarcadorFK_IdEmbarcadorPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorFK_IdEmbarcadorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_embarcadorFK_IdEmbarcadorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPedidoCompraImpor.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdEmpleadoPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdEmpleadoPedidoCompraImpor.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPedidoCompraImpor,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor.setFocusable(false);

		this.jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setToolTipText("Buscar Por Estado Pedo Compra ");
		this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setToolTipText("Buscar Por Estado Pedo Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor,"buscar_button","Buscar Por Estado Pedo Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor = new JLabelMe();
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setText("Estado Pedo Compra :");
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setToolTipText("Estado Pedo Compra");
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisPedidoCompraImpor.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdPaisPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdPaisPedidoCompraImpor.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisPedidoCompraImpor,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisPedidoCompraImpor = new JLabelMe();
		jLabelid_paisFK_IdPaisPedidoCompraImpor.setText("Pais :");
		jLabelid_paisFK_IdPaisPedidoCompraImpor.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPuertoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPuertoPedidoCompraImpor.setToolTipText("Buscar Por Puerto ");
		this.jButtonFK_IdPuertoPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdPuertoPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdPuertoPedidoCompraImpor.setToolTipText("Buscar Por Puerto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPuertoPedidoCompraImpor,"buscar_button","Buscar Por Puerto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPuertoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_puertoFK_IdPuertoPedidoCompraImpor = new JLabelMe();
		jLabelid_puertoFK_IdPuertoPedidoCompraImpor.setText("Puerto :");
		jLabelid_puertoFK_IdPuertoPedidoCompraImpor.setToolTipText("Puerto");
		jLabelid_puertoFK_IdPuertoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puertoFK_IdPuertoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puertoFK_IdPuertoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_puertoFK_IdPuertoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_puertoFK_IdPuertoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_puertoFK_IdPuertoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoFK_IdPuertoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoFK_IdPuertoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puertoFK_IdPuertoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPuertoDestinoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPuertoDestinoPedidoCompraImpor.setToolTipText("Buscar Por Puerto Destino ");
		this.jButtonFK_IdPuertoDestinoPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdPuertoDestinoPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdPuertoDestinoPedidoCompraImpor.setToolTipText("Buscar Por Puerto Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPuertoDestinoPedidoCompraImpor,"buscar_button","Buscar Por Puerto Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPuertoDestinoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor = new JLabelMe();
		jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setText("Puerto Destino :");
		jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setToolTipText("Puerto Destino");
		jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProrrateoImporPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProrrateoImporPedidoCompraImpor.setToolTipText("Buscar Por Tipo Prorrateo Impor ");
		this.jButtonFK_IdTipoProrrateoImporPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdTipoProrrateoImporPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdTipoProrrateoImporPedidoCompraImpor.setToolTipText("Buscar Por Tipo Prorrateo Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProrrateoImporPedidoCompraImpor,"buscar_button","Buscar Por Tipo Prorrateo Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProrrateoImporPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor = new JLabelMe();
		jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setText("Tipo Prorrateo Impor :");
		jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setToolTipText("Tipo Prorrateo Impor");
		jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTerminosImporPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTerminosImporPedidoCompraImpor.setToolTipText("Buscar Por Tipo Terminos Impor ");
		this.jButtonFK_IdTipoTerminosImporPedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdTipoTerminosImporPedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdTipoTerminosImporPedidoCompraImpor.setToolTipText("Buscar Por Tipo Terminos Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTerminosImporPedidoCompraImpor,"buscar_button","Buscar Por Tipo Terminos Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTerminosImporPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor = new JLabelMe();
		jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setText("Tipo Terminos Impor :");
		jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setToolTipText("Tipo Terminos Impor");
		jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoViaTransportePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoViaTransportePedidoCompraImpor.setToolTipText("Buscar Por Tipo Via Transporte ");
		this.jButtonFK_IdTipoViaTransportePedidoCompraImpor= new JButtonMe();
		this.jButtonFK_IdTipoViaTransportePedidoCompraImpor.setText("Buscar");
		this.jButtonFK_IdTipoViaTransportePedidoCompraImpor.setToolTipText("Buscar Por Tipo Via Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoViaTransportePedidoCompraImpor,"buscar_button","Buscar Por Tipo Via Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoViaTransportePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor = new JLabelMe();
		jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setText("Tipo Via Transporte :");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setToolTipText("Tipo Via Transporte");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPedidoCompraImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidoCompraImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasPedidoCompraImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasPedidoCompraImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedidoCompraImpor = new PedidoCompraImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedido Compra DATOS");
			this.jInternalFrameDetalleFormPedidoCompraImpor = new PedidoCompraImporDetalleFormJInternalFrame(jDesktopPane,this.pedidocompraimporSessionBean.getConGuardarRelaciones(),this.pedidocompraimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidoCompraImpor = null;//new PedidoCompraImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoCompraImpor= new GridBagLayout();
		
		
		this.jTableDatosPedidoCompraImpor = new JTableMe();      
		
		String sToolTipPedidoCompraImpor="";
		sToolTipPedidoCompraImpor=PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoCompraImpor+="(Importaciones.PedidoCompraImpor)";
		}
		
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoCompraImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidoCompraImpor.setToolTipText(sToolTipPedidoCompraImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidoCompraImpor);
		this.jTableDatosPedidoCompraImpor.setAutoCreateRowSorter(true);
		this.jTableDatosPedidoCompraImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidoCompraImpor.setRowSelectionAllowed(true);
		this.jTableDatosPedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidoCompraImpor = new JButtonMe();
		this.jButtonDuplicarPedidoCompraImpor = new JButtonMe();
		this.jButtonCopiarPedidoCompraImpor = new JButtonMe();
		this.jButtonVerFormPedidoCompraImpor = new JButtonMe();
		this.jButtonNuevoRelacionesPedidoCompraImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarPedidoCompraImpor = new JButtonMe();
		
		this.jScrollPanelDatosPedidoCompraImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidoCompraImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Compra";
		
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoCompraImpor.setToolTipText("Acciones");
        this.jPanelAccionesPedidoCompraImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPedidoCompraImpor=new ReporteDinamicoJInternalFrame(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidoCompraImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidoCompraImpor=new ImportacionJInternalFrame(PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidoCompraImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidoCompraImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidoCompraImpor.setText("Orden");
		this.jButtonAbrirOrderByPedidoCompraImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoCompraImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoCompraImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoCompraImpor,false,this);
			
			//this.cargarOrderByPedidoCompraImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoCompraImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoCompraImpor,true,this);
			
			//this.cargarOrderByPedidoCompraImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidoCompraImpor.setMinimumSize(new Dimension(400,50));//3830
		this.jTableDatosPedidoCompraImpor.setMaximumSize(new Dimension(400,50));//3830
		this.jTableDatosPedidoCompraImpor.setPreferredSize(new Dimension(400,50));//3830
		
		this.jScrollPanelDatosPedidoCompraImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoCompraImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoCompraImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidoCompraImpor.setText("Nuevo");
		this.jButtonDuplicarPedidoCompraImpor.setText("Duplicar");
		this.jButtonCopiarPedidoCompraImpor.setText("Copiar");
		this.jButtonVerFormPedidoCompraImpor.setText("Ver");
		this.jButtonNuevoRelacionesPedidoCompraImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidoCompraImpor.setText("Guardar");
		this.jButtonCerrarPedidoCompraImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoCompraImpor,"nuevo_button","Nuevo",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidoCompraImpor,"duplicar_button","Duplicar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidoCompraImpor,"copiar_button","Copiar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidoCompraImpor,"ver_form","Ver",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidoCompraImpor,"nuevorelaciones_button","Nuevo Rel",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoCompraImpor,"guardarcambiostabla_button","Guardar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoCompraImpor,"cerrar_button","Salir",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidoCompraImpor.setToolTipText("Nuevo"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidoCompraImpor.setToolTipText("Duplicar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidoCompraImpor.setToolTipText("Copiar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidoCompraImpor.setToolTipText("Ver"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidoCompraImpor.setToolTipText("Nuevo Rel"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidoCompraImpor.setToolTipText("Guardar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoCompraImpor.setToolTipText("Salir"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoCompraImpor";
		inputMap = this.jButtonNuevoPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoCompraImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidoCompraImpor";
		inputMap = this.jButtonDuplicarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidoCompraImpor"));
		
		//COPIAR
		sMapKey = "CopiarPedidoCompraImpor";
		inputMap = this.jButtonCopiarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidoCompraImpor"));
		
		//VEr FORM
		sMapKey = "VerFormPedidoCompraImpor";
		inputMap = this.jButtonVerFormPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidoCompraImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidoCompraImpor";
		inputMap = this.jButtonNuevoRelacionesPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidoCompraImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidoCompraImpor";
		inputMap = this.jButtonModificarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidoCompraImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidoCompraImpor";
		inputMap = this.jButtonCerrarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoCompraImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoCompraImpor";
		inputMap = this.jButtonGuardarCambiosTablaPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoCompraImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidoCompraImpor.setName("jPanelParametrosReportesPedidoCompraImpor"); 
		
		this.jPanelParametrosReportesAccionesPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidoCompraImpor.setName("jPanelParametrosReportesAccionesPedidoCompraImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidoCompraImpor = new JButtonMe();
		this.jButtonRecargarInformacionPedidoCompraImpor.setText("Recargar");
		this.jButtonRecargarInformacionPedidoCompraImpor.setToolTipText("Recargar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidoCompraImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPedidoCompraImpor = new JButtonMe();
		this.jButtonProcesarInformacionPedidoCompraImpor.setText("Procesar");
		this.jButtonProcesarInformacionPedidoCompraImpor.setToolTipText("Procesar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidoCompraImpor.setVisible(false);
			
		this.jButtonProcesarInformacionPedidoCompraImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoCompraImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoCompraImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoCompraImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidoCompraImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoCompraImpor.setText("TIPO");       
		this.jComboBoxTiposReportesPedidoCompraImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoCompraImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidoCompraImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidoCompraImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidoCompraImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposRelacionesPedidoCompraImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposAccionesPedidoCompraImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidoCompraImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidoCompraImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidoCompraImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoCompraImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoCompraImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidoCompraImpor = new JLabelMe();
		
		this.jLabelAccionesPedidoCompraImpor.setText("Acciones");		
		this.jLabelAccionesPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidoCompraImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidoCompraImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidoCompraImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidoCompraImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidoCompraImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidoCompraImpor.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidoCompraImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidoCompraImpor = new JButtonMe();
		//this.jButtonAnterioresPedidoCompraImpor.setText("<<");
        this.jButtonAnterioresPedidoCompraImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidoCompraImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidoCompraImpor = new JButtonMe();
		//this.jButtonSiguientesPedidoCompraImpor.setText(">>");
        this.jButtonSiguientesPedidoCompraImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidoCompraImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidoCompraImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidoCompraImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidoCompraImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidoCompraImpor,"nuevoguardarcambios_button","Nue",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidoCompraImpor";
		inputMap = this.jButtonNuevoGuardarCambiosPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidoCompraImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidoCompraImpor";
		inputMap = this.jButtonRecargarInformacionPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidoCompraImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidoCompraImpor";
		inputMap = this.jButtonSiguientesPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidoCompraImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidoCompraImpor";
		inputMap = this.jButtonAnterioresPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidoCompraImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidoCompraImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidoCompraImpor.setMinimumSize(new Dimension(this.getWidth(),PedidoCompraImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoCompraImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoCompraImpor.setMaximumSize(new Dimension(this.getWidth(),PedidoCompraImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoCompraImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoCompraImpor.setPreferredSize(new Dimension(this.getWidth(),PedidoCompraImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoCompraImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidoCompraImpor = new GridBagLayout();

			this.jPanelPaginacionPedidoCompraImpor.setLayout(gridaBagLayoutPaginacionPedidoCompraImpor);						
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonAnterioresPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
					
						
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsPedidoCompraImpor.gridy = 0;//
			
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonNuevoGuardarCambiosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);//
						
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonSiguientesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompraImpor.gridy = 1;//
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonNuevoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
				this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidoCompraImpor.gridy = 1;
				this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonNuevoRelacionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			}
			
			
			if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();//
				this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsPedidoCompraImpor.gridy = 1;//
				this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonGuardarCambiosTablaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);//
			}
			
			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompraImpor.gridy = 1;//
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonDuplicarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);//
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompraImpor.gridy = 1;//
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonCopiarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);//
		
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompraImpor.gridy = 1;//
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonVerFormPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);//
		
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = 1;
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidoCompraImpor.add(this.jButtonCerrarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		
		this.jButtonRecargarInformacionPedidoCompraImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoCompraImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoCompraImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidoCompraImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoCompraImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoCompraImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidoCompraImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoCompraImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoCompraImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidoCompraImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoCompraImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoCompraImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidoCompraImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoCompraImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoCompraImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidoCompraImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoCompraImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoCompraImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidoCompraImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoCompraImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoCompraImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidoCompraImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoCompraImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoCompraImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidoCompraImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PedidoCompraImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PedidoCompraImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidoCompraImpor.setLayout(gridaBagParametrosReportesPedidoCompraImpor);
			this.jPanelParametrosReportesAccionesPedidoCompraImpor.setLayout(gridaBagParametrosReportesAccionesPedidoCompraImpor);
			
			
			this.jPanelParametrosAuxiliar1PedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar1PedidoCompraImpor);
			this.jPanelParametrosAuxiliar2PedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar2PedidoCompraImpor);
			this.jPanelParametrosAuxiliar3PedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar3PedidoCompraImpor);
			this.jPanelParametrosAuxiliar4PedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar4PedidoCompraImpor);
			//this.jPanelParametrosAuxiliar5PedidoCompraImpor.setLayout(gridaBagParametrosAuxiliar2PedidoCompraImpor);			
			
			
			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jButtonRecargarInformacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoCompraImpor.add(this.jComboBoxTiposPaginacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoCompraImpor.add(this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoCompraImpor.add(this.jComboBoxTiposArchivosReportesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jPanelParametrosAuxiliar1PedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PedidoCompraImpor.add(this.jComboBoxTiposReportesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);																		
			
			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PedidoCompraImpor.add(this.jComboBoxTiposGraficosReportesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jPanelParametrosAuxiliar4PedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jComboBoxTiposReportesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jCheckBoxGenerarReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jPanelParametrosAuxiliar2PedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jLabelAccionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
				this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidoCompraImpor.add(this.jButtonAbrirOrderByPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jComboBoxTiposSeleccionarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
			
			
			/*
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jCheckBoxSeleccionarTodosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jCheckBoxConGraficoReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoCompraImpor.add(this.jCheckBoxSeleccionarTodosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);															
				
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoCompraImpor.add(this.jCheckBoxSeleccionadosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);															
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoCompraImpor.add(this.jCheckBoxConGraficoReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jPanelParametrosAuxiliar3PedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jComboBoxTiposRelacionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
				
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jComboBoxTiposAccionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
	
				
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompraImpor.add(this.jTextFieldValorCampoGeneralPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidoCompraImpor = new GridBagLayout();

			this.jScrollPanelDatosPedidoCompraImpor.setLayout(gridaBagLayoutDatosPedidoCompraImpor);
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
			this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
			
			this.jScrollPanelDatosPedidoCompraImpor.add(this.jTableDatosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidoCompraImpor.setViewportView(this.jTableDatosPedidoCompraImpor);
		this.jTableDatosPedidoCompraImpor.setFillsViewportHeight(true);
		this.jTableDatosPedidoCompraImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoCompraImpor= new GridBagLayout();
		this.jPanelAccionesPedidoCompraImpor.setLayout(gridaBagLayoutAccionesPedidoCompraImpor);
		
		
		/*	
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
			
		this.jPanelAccionesPedidoCompraImpor.add(this.jButtonNuevoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClientePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdClientePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdClientePedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdClientePedidoCompraImpor.add(jLabelid_clienteFK_IdClientePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdClientePedidoCompraImpor.add(jComboBoxid_clienteFK_IdClientePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);


		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdClientePedidoCompraImpor.add(this.jButtonBuscarFK_IdClienteid_clientePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdClientePedidoCompraImpor.add(jButtonFK_IdClientePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("1.-Por Cliente ", jPanelFK_IdClientePedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteProveedorPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProveedorPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProveedorPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProveedorPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdClienteProveedorPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdClienteProveedorPedidoCompraImpor.add(jLabelid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdClienteProveedorPedidoCompraImpor.add(jComboBoxid_cliente_proveedorFK_IdClienteProveedorPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);


		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdClienteProveedorPedidoCompraImpor.add(this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdClienteProveedorPedidoCompraImpor.add(jButtonFK_IdClienteProveedorPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("2.-Por Cliente Proveedor ", jPanelFK_IdClienteProveedorPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmbarcadorPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdEmbarcadorPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmbarcadorPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmbarcadorPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmbarcadorPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmbarcadorPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdEmbarcadorPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdEmbarcadorPedidoCompraImpor.add(jLabelid_embarcadorFK_IdEmbarcadorPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdEmbarcadorPedidoCompraImpor.add(jComboBoxid_embarcadorFK_IdEmbarcadorPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdEmbarcadorPedidoCompraImpor.add(jButtonFK_IdEmbarcadorPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("3.-Por Embarcador ", jPanelFK_IdEmbarcadorPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdEmpleadoPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdEmpleadoPedidoCompraImpor.add(jLabelid_empleadoFK_IdEmpleadoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdEmpleadoPedidoCompraImpor.add(jComboBoxid_empleadoFK_IdEmpleadoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);


		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdEmpleadoPedidoCompraImpor.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdEmpleadoPedidoCompraImpor.add(jButtonFK_IdEmpleadoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("4.-Por Empleado ", jPanelFK_IdEmpleadoPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.add(jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.add(jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor.add(jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("5.-Por Estado Pedo Compra ", jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdPaisPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPaisPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdPaisPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdPaisPedidoCompraImpor.add(jLabelid_paisFK_IdPaisPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdPaisPedidoCompraImpor.add(jComboBoxid_paisFK_IdPaisPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdPaisPedidoCompraImpor.add(jButtonFK_IdPaisPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("6.-Por Pais ", jPanelFK_IdPaisPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdPuertoPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPuertoPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPuertoPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPuertoPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPuertoPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPuertoPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdPuertoPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdPuertoPedidoCompraImpor.add(jLabelid_puertoFK_IdPuertoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdPuertoPedidoCompraImpor.add(jComboBoxid_puertoFK_IdPuertoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdPuertoPedidoCompraImpor.add(jButtonFK_IdPuertoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("7.-Por Puerto ", jPanelFK_IdPuertoPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdPuertoDestinoPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPuertoDestinoPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPuertoDestinoPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPuertoDestinoPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPuertoDestinoPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPuertoDestinoPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdPuertoDestinoPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdPuertoDestinoPedidoCompraImpor.add(jLabelid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdPuertoDestinoPedidoCompraImpor.add(jComboBoxid_puerto_destinoFK_IdPuertoDestinoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdPuertoDestinoPedidoCompraImpor.add(jButtonFK_IdPuertoDestinoPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("8.-Por Puerto Destino ", jPanelFK_IdPuertoDestinoPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoProrrateoImporPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProrrateoImporPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProrrateoImporPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProrrateoImporPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProrrateoImporPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProrrateoImporPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdTipoProrrateoImporPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdTipoProrrateoImporPedidoCompraImpor.add(jLabelid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdTipoProrrateoImporPedidoCompraImpor.add(jComboBoxid_tipo_prorrateo_imporFK_IdTipoProrrateoImporPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdTipoProrrateoImporPedidoCompraImpor.add(jButtonFK_IdTipoProrrateoImporPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("9.-Por Tipo Prorrateo Impor ", jPanelFK_IdTipoProrrateoImporPedidoCompraImpor);
		jTabbedPaneBusquedasPedidoCompraImpor.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoTerminosImporPedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTerminosImporPedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTerminosImporPedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTerminosImporPedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTerminosImporPedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTerminosImporPedidoCompraImpor.setLayout(gridaBagLayoutFK_IdTipoTerminosImporPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdTipoTerminosImporPedidoCompraImpor.add(jLabelid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdTipoTerminosImporPedidoCompraImpor.add(jComboBoxid_tipo_terminos_imporFK_IdTipoTerminosImporPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdTipoTerminosImporPedidoCompraImpor.add(jButtonFK_IdTipoTerminosImporPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("10.-Por Tipo Terminos Impor ", jPanelFK_IdTipoTerminosImporPedidoCompraImpor);

		GridBagLayout gridaBagLayoutFK_IdTipoViaTransportePedidoCompraImpor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoViaTransportePedidoCompraImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransportePedidoCompraImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransportePedidoCompraImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoViaTransportePedidoCompraImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoViaTransportePedidoCompraImpor.setLayout(gridaBagLayoutFK_IdTipoViaTransportePedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 0;
		jPanelFK_IdTipoViaTransportePedidoCompraImpor.add(jLabelid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 0;
		gridBagConstraintsPedidoCompraImpor.gridx = 1;
		jPanelFK_IdTipoViaTransportePedidoCompraImpor.add(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransportePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompraImpor.gridy = 1;
		gridBagConstraintsPedidoCompraImpor.gridx =1;
		jPanelFK_IdTipoViaTransportePedidoCompraImpor.add(jButtonFK_IdTipoViaTransportePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);

		jTabbedPaneBusquedasPedidoCompraImpor.addTab("11.-Por Tipo Via Transporte ", jPanelFK_IdTipoViaTransportePedidoCompraImpor);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoCompraImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();						
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoCompraImpor.gridx = 0;		
			//this.gridBagConstraintsPedidoCompraImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoCompraImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;		
		//this.gridBagConstraintsPedidoCompraImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidoCompraImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoCompraImpor.gridx = 0;		
			this.gridBagConstraintsPedidoCompraImpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidoCompraImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);								
		
		
		/*
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		*/		
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoCompraImpor.gridx =0;
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoCompraImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
				
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PedidoCompraImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidoCompraImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoCompraImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidoCompraImpor.setLayout(gridaBagLayoutBusquedasParametrosPedidoCompraImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidoCompraImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			
			
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
			
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidoCompraImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidoCompraImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidoCompraImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidoCompraImpor.setName("jPanelReporteDinamicoPedidoCompraImpor"); 
		
		this.jPanelReporteDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidoCompraImpor.setLayout(gridaBagLayoutReporteDinamicoPedidoCompraImpor);
		
		
		this.jInternalFrameReporteDinamicoPedidoCompraImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidoCompraImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoCompraImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidoCompraImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidoCompraImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidoCompraImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidoCompraImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidoCompraImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidoCompraImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidoCompraImpor = new JLabelMe();

		this.jLabelColumnasSelectReportePedidoCompraImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelColumnasSelectReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidoCompraImpor = new JList<Reporte>();
		this.jListColumnasSelectReportePedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidoCompraImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoCompraImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoCompraImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidoCompraImpor=new JScrollPane(this.jListColumnasSelectReportePedidoCompraImpor);
			
			this.jScrollColumnasSelectReportePedidoCompraImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoCompraImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoCompraImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jListColumnasSelectReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jScrollColumnasSelectReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidoCompraImpor = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidoCompraImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelRelacionesSelectReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidoCompraImpor = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidoCompraImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoCompraImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoCompraImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidoCompraImpor=new JScrollPane(this.jListRelacionesSelectReportePedidoCompraImpor);
			
			this.jScrollRelacionesSelectReportePedidoCompraImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoCompraImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoCompraImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jListRelacionesSelectReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jScrollRelacionesSelectReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPedidoCompraImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidoCompraImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidoCompraImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidoCompraImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPedidoCompraImpor = new JLabelMe();

		this.jLabelConGraficoDinamicoPedidoCompraImpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelConGraficoDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPedidoCompraImpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPedidoCompraImpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jCheckBoxConGraficoDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPedidoCompraImpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPedidoCompraImpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelColumnaCategoriaGraficoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPedidoCompraImpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorPedidoCompraImpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelColumnaCategoriaValorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPedidoCompraImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoCompraImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jComboBoxColumnaCategoriaValorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPedidoCompraImpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoPedidoCompraImpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelColumnasValoresGraficoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPedidoCompraImpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoPedidoCompraImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPedidoCompraImpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPedidoCompraImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoCompraImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoCompraImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPedidoCompraImpor=new JScrollPane(this.jListColumnasValoresGraficoPedidoCompraImpor);
			
			this.jScrollColumnasValoresGraficoPedidoCompraImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoCompraImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoCompraImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jListColumnasSelectReportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jScrollColumnasValoresGraficoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPedidoCompraImpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPedidoCompraImpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelTiposGraficosReportesDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoCompraImpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPedidoCompraImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jComboBoxTiposGraficosReportesDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidoCompraImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidoCompraImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelGenerarExcelReporteDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidoCompraImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidoCompraImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidoCompraImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidoCompraImpor.setToolTipText("Generar EXCEL"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jButtonGenerarExcelReporteDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jComboBoxTiposReportesDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidoCompraImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidoCompraImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jLabelTiposArchivoReporteDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jComboBoxTiposArchivosReportesDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidoCompraImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidoCompraImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidoCompraImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidoCompraImpor.setToolTipText("Generar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jButtonGenerarReporteDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidoCompraImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidoCompraImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidoCompraImpor.setToolTipText("Cancelar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompraImpor.add(this.jButtonCerrarReporteDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidoCompraImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidoCompraImpor= new JScrollPane(jPanelReporteDinamicoPedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidoCompraImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoCompraImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoCompraImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompraImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidoCompraImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidoCompraImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidoCompraImpor);
		this.jInternalFrameReporteDinamicoPedidoCompraImpor.getContentPane().add(this.jScrollPanelReporteDinamicoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidoCompraImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidoCompraImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidoCompraImpor.setName("jPanelImportacionPedidoCompraImpor"); 
		
		this.jPanelImportacionPedidoCompraImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoCompraImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoCompraImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidoCompraImpor.setLayout(gridaBagLayoutImportacionPedidoCompraImpor);
		
		
		this.jInternalFrameImportacionPedidoCompraImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidoCompraImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidoCompraImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoCompraImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoCompraImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoCompraImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidoCompraImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoCompraImpor.setResizable(true);
	    this.jInternalFrameImportacionPedidoCompraImpor.setClosable(true);
	    this.jInternalFrameImportacionPedidoCompraImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoCompraImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoCompraImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidoCompraImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoCompraImpor.setResizable(true);
	    this.jInternalFrameImportacionPedidoCompraImpor.setClosable(true);
	    this.jInternalFrameImportacionPedidoCompraImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidoCompraImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoCompraImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoCompraImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidoCompraImpor = new JLabelMe();

		this.jLabelArchivoImportacionPedidoCompraImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoCompraImpor.add(this.jLabelArchivoImportacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidoCompraImpor = new JFileChooser();		
		this.jFileChooserImportacionPedidoCompraImpor.setToolTipText("ESCOGER ARCHIVO"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidoCompraImpor = new JButtonMe();
		this.jButtonAbrirImportacionPedidoCompraImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidoCompraImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidoCompraImpor.setToolTipText("Generar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompraImpor.add(this.jButtonAbrirImportacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidoCompraImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidoCompraImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoCompraImpor.add(this.jLabelPathArchivoImportacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidoCompraImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidoCompraImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoCompraImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoCompraImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompraImpor.add(this.jTextFieldPathArchivoImportacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidoCompraImpor = new JButtonMe();
		this.jButtonGenerarImportacionPedidoCompraImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidoCompraImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidoCompraImpor.setToolTipText("Generar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompraImpor.add(this.jButtonGenerarImportacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarImportacionPedidoCompraImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidoCompraImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidoCompraImpor.setToolTipText("Cancelar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompraImpor.add(this.jButtonCerrarImportacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidoCompraImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidoCompraImpor= new JScrollPane(jPanelImportacionPedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidoCompraImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidoCompraImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidoCompraImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidoCompraImpor);
		this.jInternalFrameImportacionPedidoCompraImpor.getContentPane().add(this.jScrollPanelImportacionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidoCompraImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidoCompraImpor = new JButtonMe();
			this.jButtonAbrirOrderByPedidoCompraImpor.setText("Orden");
			this.jButtonAbrirOrderByPedidoCompraImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoCompraImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidoCompraImpor";
			inputMap = this.jButtonAbrirOrderByPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidoCompraImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidoCompraImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidoCompraImpor.setName("jPanelOrderByPedidoCompraImpor"); 
			
			this.jPanelOrderByPedidoCompraImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoCompraImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoCompraImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidoCompraImpor.setLayout(gridaBagLayoutOrderByPedidoCompraImpor);
			
			
			this.jTableDatosPedidoCompraImporOrderBy = new JTableMe();        
			this.jTableDatosPedidoCompraImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidoCompraImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidoCompraImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidoCompraImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidoCompraImporOrderBy.setViewportView(this.jTableDatosPedidoCompraImporOrderBy);
			this.jTableDatosPedidoCompraImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidoCompraImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidoCompraImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidoCompraImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidoCompraImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidoCompraImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidoCompraImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidoCompraImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidoCompraImpor.setTitle("Orden");
			this.jInternalFrameOrderByPedidoCompraImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidoCompraImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidoCompraImpor.setResizable(true);
			this.jInternalFrameOrderByPedidoCompraImpor.setClosable(true);
			this.jInternalFrameOrderByPedidoCompraImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidoCompraImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoCompraImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoCompraImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidoCompraImpor.ipady =150;
				
			this.jPanelOrderByPedidoCompraImpor.add(jScrollPanelDatosPedidoCompraImporOrderBy, this.gridBagConstraintsPedidoCompraImpor);//this.jTableDatosPedidoCompraImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidoCompraImpor = new JButtonMe();
			this.jButtonCerrarOrderByPedidoCompraImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidoCompraImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidoCompraImpor.setToolTipText("Cancelar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidoCompraImpor.add(this.jButtonCerrarOrderByPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidoCompraImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidoCompraImpor= new JScrollPane(jPanelOrderByPedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidoCompraImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidoCompraImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidoCompraImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidoCompraImpor);
			
			this.jInternalFrameOrderByPedidoCompraImpor.getContentPane().add(this.jScrollPanelOrderByPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
		
		} else {
			this.jButtonAbrirOrderByPedidoCompraImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//8530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.pedidocompraimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPedidoCompraImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidoCompraImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidoCompraImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPedidoCompraImpor.getRowHeight();//PedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor.isSelected()) {
					iHeightTable=PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoCompraImpor.isSelected()) {
					iHeightTable=PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoCompraImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidoCompraImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoCompraImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoCompraImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidoCompraImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoCompraImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoCompraImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidoCompraImpor!=null && this.jInternalFrameOrderByPedidoCompraImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidoCompraImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidoCompraImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidoCompraImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidoCompraImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidoCompraImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidoCompraImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidoCompraImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidoCompraImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoCompraImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoCompraImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pedidocompraimporLogic.getPedidoCompraImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidocompraimpors.size();
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
	public static List<PedidoCompraImpor> TraerPedidoCompraImporBeans(List<PedidoCompraImpor> pedidocompraimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(PedidoCompraImpor pedidocompraimpor:pedidocompraimpors) {
					
				if(!(PedidoCompraImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidoCompraImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidocompraimpor.setsDetalleGeneralEntityReporte(PedidoCompraImporConstantesFunciones.getPedidoCompraImporDescripcion(pedidocompraimpor));
										
						
					
					

					if(pedidocompraimpor.getDetallePedidoCompraImpors()!=null && Funciones.existeClass(classes,DetallePedidoCompraImpor.class)) {
						try{pedidocompraimpor.setdetallepedidocompraimporsDescripcionReporte(new JRBeanCollectionDataSource(DetallePedidoCompraImporJInternalFrame.TraerDetallePedidoCompraImporBeans(pedidocompraimpor.getDetallePedidoCompraImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(pedidocompraimpor.getLiquidacionImpuestoImpors()!=null && Funciones.existeClass(classes,LiquidacionImpuestoImpor.class)) {
						try{pedidocompraimpor.setliquidacionimpuestoimporsDescripcionReporte(new JRBeanCollectionDataSource(LiquidacionImpuestoImporJInternalFrame.TraerLiquidacionImpuestoImporBeans(pedidocompraimpor.getLiquidacionImpuestoImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//pedidocompraimpor.setsDetalleGeneralEntityReporte(pedidocompraimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidocompraimporbeans.add(pedidocompraimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidocompraimpors;
    }
	//PARA REPORTES FIN
}
