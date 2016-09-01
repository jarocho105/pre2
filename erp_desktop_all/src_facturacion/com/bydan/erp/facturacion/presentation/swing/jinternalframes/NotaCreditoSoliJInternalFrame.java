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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.NotaCreditoSoliConstantesFunciones;

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
public class NotaCreditoSoliJInternalFrame extends NotaCreditoSoliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNotaCreditoSoli;
	
	protected JMenuBar jmenuBarNotaCreditoSoli;
	
	protected JMenu jmenuNotaCreditoSoli;
	protected JMenu jmenuDatosNotaCreditoSoli;
	protected JMenu jmenuArchivoNotaCreditoSoli;
	protected JMenu jmenuAccionesNotaCreditoSoli;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotaCreditoSoli;	
	protected GridBagConstraints gridBagConstraintsNotaCreditoSoli;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NotaCreditoSoliDetalleFormJInternalFrame jInternalFrameDetalleFormNotaCreditoSoli;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNotaCreditoSoli;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNotaCreditoSoli;	
	
	
	
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

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TipoNotaCreditoSoliBeanSwingJInternalFrame tiponotacreditosoliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponotacreditosoli="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoNotaCreditoBeanSwingJInternalFrame estadonotacreditosoliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonotacreditosoli="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";
	
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TipoNotaCreditoSoliSessionBean tiponotacreditosoliSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoNotaCreditoSessionBean estadonotacreditosoliSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NotaCreditoSoli> notacreditosolis;		
	public List<NotaCreditoSoli> notacreditosolisEliminados;	
	public List<NotaCreditoSoli> notacreditosolisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNotaCreditoSoli;		
	protected JButton jButtonAbrirOrderByNotaCreditoSoli;
	
	
	//protected JPanel jPanelOrderByNotaCreditoSoli;
	//public JScrollPane jScrollPanelOrderByNotaCreditoSoli;	
	//protected JButton jButtonCerrarOrderByNotaCreditoSoli;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NotaCreditoSoliLogic notacreditosoliLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosEdicionNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosGeneralNotaCreditoSoli;
    
	
	
	//public JScrollPane jScrollPanelDatosNotaCreditoSoliOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNotaCreditoSoli;
	//public JScrollPane jScrollPanelImportacionNotaCreditoSoli;
	
	
	
	protected JPanel jPanelAccionesNotaCreditoSoli;
	
    protected JPanel jPanelPaginacionNotaCreditoSoli;
    protected JPanel jPanelParametrosReportesNotaCreditoSoli;
	protected JPanel jPanelParametrosReportesAccionesNotaCreditoSoli;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalNotaCreditoSoli;
	protected Integer iXPanelCamposFintotalNotaCreditoSoli=0;
	protected Integer iYPanelCamposFintotalNotaCreditoSoli=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar2NotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar3NotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar4NotaCreditoSoli;
	//protected JPanel jPanelParametrosAuxiliar5NotaCreditoSoli;
	
	
	
	//protected JPanel jPanelReporteDinamicoNotaCreditoSoli;
	//protected JPanel jPanelImportacionNotaCreditoSoli;
	
	
	public JTable jTableDatosNotaCreditoSoli;
	
	
	
	//public JTable jTableDatosNotaCreditoSoliOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNotaCreditoSoli;
	protected JButton jButtonDuplicarNotaCreditoSoli;
	protected JButton jButtonCopiarNotaCreditoSoli;
	protected JButton jButtonVerFormNotaCreditoSoli;
	protected JButton jButtonNuevoRelacionesNotaCreditoSoli;
	protected JButton jButtonModificarNotaCreditoSoli;
	
    protected JButton jButtonGuardarCambiosTablaNotaCreditoSoli;
	protected JButton jButtonCerrarNotaCreditoSoli;
	
	
	protected JButton jButtonRecargarInformacionNotaCreditoSoli;
	protected JButton jButtonProcesarInformacionNotaCreditoSoli;
	
	
	protected JButton jButtonAnterioresNotaCreditoSoli;
	protected JButton jButtonSiguientesNotaCreditoSoli;
	protected JButton jButtonNuevoGuardarCambiosNotaCreditoSoli;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNotaCreditoSoli;
	//protected JButton jButtonCerrarReporteDinamicoNotaCreditoSoli;
	//protected JButton jButtonGenerarExcelReporteDinamicoNotaCreditoSoli;	
	
	
	
	//protected JButton jButtonAbrirImportacionNotaCreditoSoli;
	//protected JButton jButtonGenerarImportacionNotaCreditoSoli;
	//protected JButton jButtonCerrarImportacionNotaCreditoSoli;
	//protected JFileChooser jFileChooserImportacionNotaCreditoSoli;
	//protected File fileImportacionNotaCreditoSoli;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotaCreditoSoli;
	protected JButton jButtonDuplicarToolBarNotaCreditoSoli;
	protected JButton jButtonNuevoRelacionesToolBarNotaCreditoSoli;
	
	
	public JButton jButtonGuardarCambiosToolBarNotaCreditoSoli;
	protected JButton jButtonCopiarToolBarNotaCreditoSoli;
	protected JButton jButtonVerFormToolBarNotaCreditoSoli;
	public JButton jButtonGuardarCambiosTablaToolBarNotaCreditoSoli;
	protected JButton jButtonMostrarOcultarTablaToolBarNotaCreditoSoli;
	protected JButton jButtonCerrarToolBarNotaCreditoSoli;
	
	protected JButton jButtonRecargarInformacionToolBarNotaCreditoSoli;
	protected JButton jButtonProcesarInformacionToolBarNotaCreditoSoli;
	protected JButton jButtonAnterioresToolBarNotaCreditoSoli;
	protected JButton jButtonSiguientesToolBarNotaCreditoSoli;
	protected JButton jButtonNuevoGuardarCambiosToolBarNotaCreditoSoli;
	protected JButton jButtonAbrirOrderByToolBarNotaCreditoSoli;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotaCreditoSoli;
	protected JMenuItem jMenuItemDuplicarNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoRelacionesNotaCreditoSoli;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNotaCreditoSoli;
	protected JMenuItem jMenuItemCopiarNotaCreditoSoli;
	protected JMenuItem jMenuItemVerFormNotaCreditoSoli;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotaCreditoSoli;
	protected JMenuItem jMenuItemCerrarNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleCerrarNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotaCreditoSoli;
	
	protected JMenuItem jMenuItemRecargarInformacionNotaCreditoSoli;
	protected JMenuItem jMenuItemProcesarInformacionNotaCreditoSoli;
	protected JMenuItem jMenuItemAnterioresNotaCreditoSoli;
	protected JMenuItem jMenuItemSiguientesNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotaCreditoSoli;
	protected JMenuItem jMenuItemAbrirOrderByNotaCreditoSoli;
	protected JMenuItem jMenuItemMostrarOcultarNotaCreditoSoli;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotaCreditoSoli;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNotaCreditoSoli;
	protected JCheckBox jCheckBoxSeleccionadosNotaCreditoSoli;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNotaCreditoSoli;
	protected JCheckBox jCheckBoxConGraficoReporteNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNotaCreditoSoli;
	protected JTextField jTextFieldValorCampoGeneralNotaCreditoSoli;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNotaCreditoSoli;
	//public JList<Reporte> jListColumnasSelectReporteNotaCreditoSoli;
	//public JScrollPane jScrollColumnasSelectReporteNotaCreditoSoli;
	
	//public JLabel jLabelRelacionesSelectReporteNotaCreditoSoli;
	//public JList<Reporte> jListRelacionesSelectReporteNotaCreditoSoli;
	//public JScrollPane jScrollRelacionesSelectReporteNotaCreditoSoli;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNotaCreditoSoli;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNotaCreditoSoli;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNotaCreditoSoli;
	//public JLabel jLabelTiposArchivoReporteDinamicoNotaCreditoSoli;
	
		
	//public JLabel jLabelArchivoImportacionNotaCreditoSoli;	
	//public JLabel jLabelPathArchivoImportacionNotaCreditoSoli;
	//protected JTextField jTextFieldPathArchivoImportacionNotaCreditoSoli;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNotaCreditoSoli;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNotaCreditoSoli;
	
	//public JLabel jLabelColumnaCategoriaValorNotaCreditoSoli;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNotaCreditoSoli;
	
	//public JLabel jLabelColumnasValoresGraficoNotaCreditoSoli;
	//public JList<Reporte> jListColumnasValoresGraficoNotaCreditoSoli;
	//public JScrollPane jScrollColumnasValoresGraficoNotaCreditoSoli;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNotaCreditoSoli;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNotaCreditoSoli;
	public JPanel jPanelFK_IdClienteNotaCreditoSoli;
	public JButton jButtonFK_IdClienteNotaCreditoSoli;
	public JPanel jPanelFK_IdEmpleadoNotaCreditoSoli;
	public JButton jButtonFK_IdEmpleadoNotaCreditoSoli;
	public JPanel jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli;
	public JButton jButtonFK_IdEstadoNotaCreditoSoliNotaCreditoSoli;
	public JPanel jPanelFK_IdFacturaNotaCreditoSoli;
	public JButton jButtonFK_IdFacturaNotaCreditoSoli;
	public JPanel jPanelFK_IdResponsableNotaCreditoSoli;
	public JButton jButtonFK_IdResponsableNotaCreditoSoli;
	public JPanel jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli;
	public JButton jButtonFK_IdTipoNotaCreditoSoliNotaCreditoSoli;
	public JPanel jPanelFK_IdTransportistaNotaCreditoSoli;
	public JButton jButtonFK_IdTransportistaNotaCreditoSoli;
	public JPanel jPanelFK_IdVendedorNotaCreditoSoli;
	public JButton jButtonFK_IdVendedorNotaCreditoSoli;
	
	public JPanel jPanelid_clienteFK_IdClienteNotaCreditoSoli;
	public JLabel jLabelid_clienteFK_IdClienteNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteNotaCreditoSoli;
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoSoliBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoNotaCreditoSoli;
	public JLabel jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoNotaCreditoSoli;
	public JButton jButtonid_empleadoFK_IdEmpleadoNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoNotaCreditoSoliBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli;
	
	public JPanel jPanelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli;
	public JLabel jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli;
	public JButton jButtonid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaNotaCreditoSoli;
	public JLabel jLabelid_facturaFK_IdFacturaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaNotaCreditoSoli;
	public JButton jButtonid_facturaFK_IdFacturaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaNotaCreditoSoliBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli;
	
	public JPanel jPanelid_responsableFK_IdResponsableNotaCreditoSoli;
	public JLabel jLabelid_responsableFK_IdResponsableNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableFK_IdResponsableNotaCreditoSoli;
	public JButton jButtonid_responsableFK_IdResponsableNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsableNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsableNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli;
	public JLabel jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli;
	public JButton jButtonid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transportistaFK_IdTransportistaNotaCreditoSoli;
	public JLabel jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaNotaCreditoSoli;
	public JButton jButtonid_transportistaFK_IdTransportistaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorNotaCreditoSoli;
	public JLabel jLabelid_vendedorFK_IdVendedorNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorNotaCreditoSoli;
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoSoliBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoSoliArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli;
	
	
	
	
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
	public NotaCreditoSoliJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoSoliJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoSoliJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoSoliJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNotaCreditoSoli)	{
		this.jButtonRecargarInformacionNotaCreditoSoli = jButtonRecargarInformacionNotaCreditoSoli;
	}
	
	public JButton getjButtonProcesarInformacionNotaCreditoSoli() {
		return this.jButtonProcesarInformacionNotaCreditoSoli;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotaCreditoSoli)	{
		this.jButtonProcesarInformacionNotaCreditoSoli = jButtonProcesarInformacionNotaCreditoSoli;
	}
	
	
	public JButton getjButtonRecargarInformacionNotaCreditoSoli() {
		return this.jButtonRecargarInformacionNotaCreditoSoli;
	}
	
	
	public List<NotaCreditoSoli> getnotacreditosolis() {
		return this.notacreditosolis;
	}

	public void setnotacreditosolis(List<NotaCreditoSoli> notacreditosolis) {
		this.notacreditosolis = notacreditosolis;
	}
	
	public List<NotaCreditoSoli> getnotacreditosolisAux() {
		return this.notacreditosolisAux;
	}

	public void setnotacreditosolisAux(List<NotaCreditoSoli> notacreditosolisAux) {
		this.notacreditosolisAux = notacreditosolisAux;
	}
	
	public List<NotaCreditoSoli> getnotacreditosolisEliminados() {
		return this.notacreditosolisEliminados;
	}

	public void setNotaCreditoSolisEliminados(List<NotaCreditoSoli> notacreditosolisEliminados) {
		this.notacreditosolisEliminados = notacreditosolisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNotaCreditoSoli() {
		return jComboBoxTiposSeleccionarNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNotaCreditoSoli(
			JComboBox jComboBoxTiposSeleccionarNotaCreditoSoli) {
		this.jComboBoxTiposSeleccionarNotaCreditoSoli = jComboBoxTiposSeleccionarNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposSeleccionarNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNotaCreditoSoli() {
		return jTextFieldValorCampoGeneralNotaCreditoSoli;
	}

	public void setjTextFieldValorCampoGeneralNotaCreditoSoli(
			JTextField jTextFieldValorCampoGeneralNotaCreditoSoli) {
		this.jTextFieldValorCampoGeneralNotaCreditoSoli = jTextFieldValorCampoGeneralNotaCreditoSoli;
	}

	public void setBorderResaltarValorCampoGeneralNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNotaCreditoSoli .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNotaCreditoSoli() {
		return this.jCheckBoxSeleccionarTodosNotaCreditoSoli;
	}

	public void setjCheckBoxSeleccionarTodosNotaCreditoSoli(
			JCheckBox jCheckBoxSeleccionarTodosNotaCreditoSoli) {
		this.jCheckBoxSeleccionarTodosNotaCreditoSoli = jCheckBoxSeleccionarTodosNotaCreditoSoli;
	}

	public void setBorderResaltarSeleccionarTodosNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNotaCreditoSoli() {
		return this.jCheckBoxSeleccionadosNotaCreditoSoli;
	}

	public void setjCheckBoxSeleccionadosNotaCreditoSoli(
			JCheckBox jCheckBoxSeleccionadosNotaCreditoSoli) {
		this.jCheckBoxSeleccionadosNotaCreditoSoli = jCheckBoxSeleccionadosNotaCreditoSoli;
	}
	
	public void setBorderResaltarSeleccionadosNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNotaCreditoSoli() {
		return this.jComboBoxTiposArchivosReportesNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNotaCreditoSoli(
			JComboBox jComboBoxTiposArchivosReportesNotaCreditoSoli) {
		this.jComboBoxTiposArchivosReportesNotaCreditoSoli = jComboBoxTiposArchivosReportesNotaCreditoSoli;
	}

	public void setBorderResaltarTiposArchivosReportesNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNotaCreditoSoli() {
		return this.jComboBoxTiposReportesNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNotaCreditoSoli(
			JComboBox jComboBoxTiposReportesNotaCreditoSoli) {
		this.jComboBoxTiposReportesNotaCreditoSoli = jComboBoxTiposReportesNotaCreditoSoli;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNotaCreditoSoli() {
	//	return jComboBoxTiposReportesDinamicoNotaCreditoSoli;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNotaCreditoSoli(
	//		JComboBox jComboBoxTiposReportesDinamicoNotaCreditoSoli) {
	//	this.jComboBoxTiposReportesDinamicoNotaCreditoSoli = jComboBoxTiposReportesDinamicoNotaCreditoSoli;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli() {
	//	return jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli = jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli;
	//}
	
	public void setBorderResaltarTiposReportesNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNotaCreditoSoli() {
		return this.jComboBoxTiposGraficosReportesNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNotaCreditoSoli(
			JComboBox jComboBoxTiposGraficosReportesNotaCreditoSoli) {
		this.jComboBoxTiposGraficosReportesNotaCreditoSoli = jComboBoxTiposGraficosReportesNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposGraficosReportesNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNotaCreditoSoli() {
		return this.jComboBoxTiposPaginacionNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNotaCreditoSoli(
			JComboBox jComboBoxTiposPaginacionNotaCreditoSoli) {
		this.jComboBoxTiposPaginacionNotaCreditoSoli = jComboBoxTiposPaginacionNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposPaginacionNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNotaCreditoSoli() {
		return this.jComboBoxTiposRelacionesNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotaCreditoSoli(
			JComboBox jComboBoxTiposRelacionesNotaCreditoSoli) {
		this.jComboBoxTiposRelacionesNotaCreditoSoli = jComboBoxTiposRelacionesNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesNotaCreditoSoli) {
		this.jComboBoxTiposAccionesNotaCreditoSoli = jComboBoxTiposAccionesNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposRelacionesNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNotaCreditoSoli() {
	//	return jCheckBoxConGraficoDinamicoNotaCreditoSoli;
	//}

	//public void setjCheckBoxConGraficoDinamicoNotaCreditoSoli(
	//		JCheckBox jCheckBoxConGraficoDinamicoNotaCreditoSoli) {
	//	this.jCheckBoxConGraficoDinamicoNotaCreditoSoli = jCheckBoxConGraficoDinamicoNotaCreditoSoli;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNotaCreditoSoli() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNotaCreditoSoli.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNotaCreditoSoli .setBorder(borderResaltar);		
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
		this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		
		this.notacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notacreditosoliSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotaCreditoSoliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 3550) {
			iWidth=3550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
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
		
		NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNotaCreditoSoli= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"nuevo","nuevo","Nuevo"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"duplicar","duplicar","Duplicar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"copiar","copiar","Copiar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"ver_form","ver_form","Ver"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"recargar","recargar","Recargar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNotaCreditoSoli,this.jTtoolBarNotaCreditoSoli,
							"cerrar","cerrar","Salir"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNotaCreditoSoli=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNotaCreditoSoli;
			
				this.jButtonProcesarInformacionToolBarNotaCreditoSoli=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNotaCreditoSoli;
				
		//protected JButton jButtonModificarToolBarNotaCreditoSoli;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNotaCreditoSoli=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNotaCreditoSoli=new JMenuMe("General");
		this.jmenuArchivoNotaCreditoSoli=new JMenuMe("Archivo");
		this.jmenuAccionesNotaCreditoSoli=new JMenuMe("Acciones");
		this.jmenuDatosNotaCreditoSoli=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotaCreditoSoli= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotaCreditoSoli.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotaCreditoSoli,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNotaCreditoSoli= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNotaCreditoSoli.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNotaCreditoSoli,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNotaCreditoSoli= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNotaCreditoSoli.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNotaCreditoSoli,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNotaCreditoSoli= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotaCreditoSoli.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotaCreditoSoli,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNotaCreditoSoli= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNotaCreditoSoli.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNotaCreditoSoli,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNotaCreditoSoli= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNotaCreditoSoli.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNotaCreditoSoli,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNotaCreditoSoli= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNotaCreditoSoli.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNotaCreditoSoli,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNotaCreditoSoli= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNotaCreditoSoli.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNotaCreditoSoli,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNotaCreditoSoli= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNotaCreditoSoli.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNotaCreditoSoli,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNotaCreditoSoli= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNotaCreditoSoli.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNotaCreditoSoli,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNotaCreditoSoli= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNotaCreditoSoli.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNotaCreditoSoli,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNotaCreditoSoli= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNotaCreditoSoli.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNotaCreditoSoli,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNotaCreditoSoli= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNotaCreditoSoli.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNotaCreditoSoli,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNotaCreditoSoli= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNotaCreditoSoli.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNotaCreditoSoli,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNotaCreditoSoli.add(this.jMenuItemCerrarNotaCreditoSoli);
			
			this.jmenuAccionesNotaCreditoSoli.add(this.jMenuItemNuevoNotaCreditoSoli);
			this.jmenuAccionesNotaCreditoSoli.add(this.jMenuItemNuevoGuardarCambiosNotaCreditoSoli);
			this.jmenuAccionesNotaCreditoSoli.add(this.jMenuItemNuevoRelacionesNotaCreditoSoli);
			this.jmenuAccionesNotaCreditoSoli.add(this.jMenuItemGuardarCambiosTablaNotaCreditoSoli);		
			this.jmenuAccionesNotaCreditoSoli.add(this.jMenuItemDuplicarNotaCreditoSoli);		
			this.jmenuAccionesNotaCreditoSoli.add(this.jMenuItemCopiarNotaCreditoSoli);		
			this.jmenuAccionesNotaCreditoSoli.add(this.jMenuItemVerFormNotaCreditoSoli);		
			
			this.jmenuDatosNotaCreditoSoli.add(this.jMenuItemRecargarInformacionNotaCreditoSoli);				
			this.jmenuDatosNotaCreditoSoli.add(this.jMenuItemAnterioresNotaCreditoSoli);				
			this.jmenuDatosNotaCreditoSoli.add(this.jMenuItemSiguientesNotaCreditoSoli);				
			this.jmenuDatosNotaCreditoSoli.add(this.jMenuItemAbrirOrderByNotaCreditoSoli);				
			this.jmenuDatosNotaCreditoSoli.add(this.jMenuItemMostrarOcultarNotaCreditoSoli);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNotaCreditoSoli.add(this.jMenuItemGuardarCambiosNotaCreditoSoli);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNotaCreditoSoli.add(this.jmenuArchivoNotaCreditoSoli);		
			this.jmenuBarNotaCreditoSoli.add(this.jmenuAccionesNotaCreditoSoli);		
			this.jmenuBarNotaCreditoSoli.add(this.jmenuDatosNotaCreditoSoli);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNotaCreditoSoli);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNotaCreditoSoli() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteNotaCreditoSoli.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdClienteNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdClienteNotaCreditoSoli.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteNotaCreditoSoli,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteNotaCreditoSoli = new JLabelMe();
		jLabelid_clienteFK_IdClienteNotaCreditoSoli.setText("Cliente :");
		jLabelid_clienteFK_IdClienteNotaCreditoSoli.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli.setFocusable(false);

		this.jPanelFK_IdEmpleadoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoNotaCreditoSoli.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdEmpleadoNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdEmpleadoNotaCreditoSoli.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoNotaCreditoSoli,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli.setFocusable(false);

		this.jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoNotaCreditoSoliNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoNotaCreditoSoliNotaCreditoSoli,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoNotaCreditoSoliNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli = new JLabelMe();
		jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setText("Estado :");
		jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setToolTipText("Estado");
		jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaNotaCreditoSoli.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdFacturaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdFacturaNotaCreditoSoli.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaNotaCreditoSoli,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaNotaCreditoSoli = new JLabelMe();
		jLabelid_facturaFK_IdFacturaNotaCreditoSoli.setText("Factura :");
		jLabelid_facturaFK_IdFacturaNotaCreditoSoli.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli.setFocusable(false);

		this.jPanelFK_IdResponsableNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdResponsableNotaCreditoSoli.setToolTipText("Buscar Por Responsable ");
		this.jButtonFK_IdResponsableNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdResponsableNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdResponsableNotaCreditoSoli.setToolTipText("Buscar Por Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdResponsableNotaCreditoSoli,"buscar_button","Buscar Por Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdResponsableNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_responsableFK_IdResponsableNotaCreditoSoli = new JLabelMe();
		jLabelid_responsableFK_IdResponsableNotaCreditoSoli.setText("Responsable :");
		jLabelid_responsableFK_IdResponsableNotaCreditoSoli.setToolTipText("Responsable");
		jLabelid_responsableFK_IdResponsableNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsableNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsableNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_responsableFK_IdResponsableNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_responsableFK_IdResponsableNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_responsableFK_IdResponsableNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsableNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsableNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableFK_IdResponsableNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTipoNotaCreditoSoliNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoNotaCreditoSoliNotaCreditoSoli,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoNotaCreditoSoliNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli = new JLabelMe();
		jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setText("Tipo :");
		jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setToolTipText("Tipo");
		jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportistaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaNotaCreditoSoli.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdTransportistaNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdTransportistaNotaCreditoSoli.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaNotaCreditoSoli,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorNotaCreditoSoli.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorNotaCreditoSoli= new JButtonMe();
		this.jButtonFK_IdVendedorNotaCreditoSoli.setText("Buscar");
		this.jButtonFK_IdVendedorNotaCreditoSoli.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorNotaCreditoSoli,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorNotaCreditoSoli = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorNotaCreditoSoli.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorNotaCreditoSoli.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli.setFocusable(false);


		this.jTabbedPaneBusquedasNotaCreditoSoli=new JTabbedPane();


		this.jTabbedPaneBusquedasNotaCreditoSoli.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotaCreditoSoli.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotaCreditoSoli.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNotaCreditoSoli = new NotaCreditoSoliDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Solicitud Nota Credito DATOS");
			this.jInternalFrameDetalleFormNotaCreditoSoli = new NotaCreditoSoliDetalleFormJInternalFrame(jDesktopPane,this.notacreditosoliSessionBean.getConGuardarRelaciones(),this.notacreditosoliSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNotaCreditoSoli = null;//new NotaCreditoSoliDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotaCreditoSoli= new GridBagLayout();
		
		
		this.jTableDatosNotaCreditoSoli = new JTableMe();      
		
		String sToolTipNotaCreditoSoli="";
		sToolTipNotaCreditoSoli=NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotaCreditoSoli+="(Facturacion.NotaCreditoSoli)";
		}
		
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotaCreditoSoli+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNotaCreditoSoli.setToolTipText(sToolTipNotaCreditoSoli);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNotaCreditoSoli);
		this.jTableDatosNotaCreditoSoli.setAutoCreateRowSorter(true);
		this.jTableDatosNotaCreditoSoli.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNotaCreditoSoli.setRowSelectionAllowed(true);
		this.jTableDatosNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNotaCreditoSoli = new JButtonMe();
		this.jButtonDuplicarNotaCreditoSoli = new JButtonMe();
		this.jButtonCopiarNotaCreditoSoli = new JButtonMe();
		this.jButtonVerFormNotaCreditoSoli = new JButtonMe();
		this.jButtonNuevoRelacionesNotaCreditoSoli = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarNotaCreditoSoli = new JButtonMe();
		
		this.jScrollPanelDatosNotaCreditoSoli = new JScrollPane();   
        this.jScrollPanelDatosGeneralNotaCreditoSoli = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Nota Credito";
		
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesNotaCreditoSoli.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalNotaCreditoSoli.setName("jPanelCamposFintotalNotaCreditoSoli");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoNotaCreditoSoli=new ReporteDinamicoJInternalFrame(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNotaCreditoSoli();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNotaCreditoSoli=new ImportacionJInternalFrame(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNotaCreditoSoli();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNotaCreditoSoli = new JButtonMe();
		
		this.jButtonAbrirOrderByNotaCreditoSoli.setText("Orden");
		this.jButtonAbrirOrderByNotaCreditoSoli.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotaCreditoSoli,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotaCreditoSoli,false,this);
			
			//this.cargarOrderByNotaCreditoSoli(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotaCreditoSoli,true,this);
			
			//this.cargarOrderByNotaCreditoSoli(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNotaCreditoSoli.setMinimumSize(new Dimension(400,50));//3530
		this.jTableDatosNotaCreditoSoli.setMaximumSize(new Dimension(400,50));//3530
		this.jTableDatosNotaCreditoSoli.setPreferredSize(new Dimension(400,50));//3530
		
		this.jScrollPanelDatosNotaCreditoSoli.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotaCreditoSoli.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotaCreditoSoli.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNotaCreditoSoli.setText("Nuevo");
		this.jButtonDuplicarNotaCreditoSoli.setText("Duplicar");
		this.jButtonCopiarNotaCreditoSoli.setText("Copiar");
		this.jButtonVerFormNotaCreditoSoli.setText("Ver");
		this.jButtonNuevoRelacionesNotaCreditoSoli.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNotaCreditoSoli.setText("Guardar");
		this.jButtonCerrarNotaCreditoSoli.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotaCreditoSoli,"nuevo_button","Nuevo",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNotaCreditoSoli,"duplicar_button","Duplicar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNotaCreditoSoli,"copiar_button","Copiar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNotaCreditoSoli,"ver_form","Ver",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNotaCreditoSoli,"nuevorelaciones_button","Nuevo Rel",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotaCreditoSoli,"guardarcambiostabla_button","Guardar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotaCreditoSoli,"cerrar_button","Salir",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNotaCreditoSoli.setToolTipText("Nuevo"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNotaCreditoSoli.setToolTipText("Duplicar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNotaCreditoSoli.setToolTipText("Copiar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNotaCreditoSoli.setToolTipText("Ver"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNotaCreditoSoli.setToolTipText("Nuevo Rel"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNotaCreditoSoli.setToolTipText("Guardar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotaCreditoSoli.setToolTipText("Salir"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotaCreditoSoli";
		inputMap = this.jButtonNuevoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotaCreditoSoli"));
		
		//DUPLICAR
		sMapKey = "DuplicarNotaCreditoSoli";
		inputMap = this.jButtonDuplicarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNotaCreditoSoli"));
		
		//COPIAR
		sMapKey = "CopiarNotaCreditoSoli";
		inputMap = this.jButtonCopiarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNotaCreditoSoli"));
		
		//VEr FORM
		sMapKey = "VerFormNotaCreditoSoli";
		inputMap = this.jButtonVerFormNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNotaCreditoSoli"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNotaCreditoSoli";
		inputMap = this.jButtonNuevoRelacionesNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNotaCreditoSoli"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNotaCreditoSoli";
		inputMap = this.jButtonModificarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNotaCreditoSoli"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNotaCreditoSoli";
		inputMap = this.jButtonCerrarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotaCreditoSoli"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotaCreditoSoli";
		inputMap = this.jButtonGuardarCambiosTablaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotaCreditoSoli"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNotaCreditoSoli.setName("jPanelParametrosReportesNotaCreditoSoli"); 
		
		this.jPanelParametrosReportesAccionesNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNotaCreditoSoli.setName("jPanelParametrosReportesAccionesNotaCreditoSoli"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNotaCreditoSoli = new JButtonMe();
		this.jButtonRecargarInformacionNotaCreditoSoli.setText("Recargar");
		this.jButtonRecargarInformacionNotaCreditoSoli.setToolTipText("Recargar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNotaCreditoSoli,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNotaCreditoSoli = new JButtonMe();
		this.jButtonProcesarInformacionNotaCreditoSoli.setText("Procesar");
		this.jButtonProcesarInformacionNotaCreditoSoli.setToolTipText("Procesar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNotaCreditoSoli.setVisible(false);
			
		this.jButtonProcesarInformacionNotaCreditoSoli.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotaCreditoSoli.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotaCreditoSoli.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNotaCreditoSoli.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposReportesNotaCreditoSoli.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNotaCreditoSoli.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNotaCreditoSoli.setText("Paginacion");
		this.jComboBoxTiposPaginacionNotaCreditoSoli.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposRelacionesNotaCreditoSoli.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposAccionesNotaCreditoSoli.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposSeleccionarNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNotaCreditoSoli=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNotaCreditoSoli.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotaCreditoSoli.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotaCreditoSoli.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNotaCreditoSoli = new JLabelMe();
		
		this.jLabelAccionesNotaCreditoSoli.setText("Acciones");		
		this.jLabelAccionesNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNotaCreditoSoli.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNotaCreditoSoli.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNotaCreditoSoli = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNotaCreditoSoli.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNotaCreditoSoli.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNotaCreditoSoli.setText("Graf.");
		this.jCheckBoxConGraficoReporteNotaCreditoSoli.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNotaCreditoSoli = new JButtonMe();
		//this.jButtonAnterioresNotaCreditoSoli.setText("<<");
        this.jButtonAnterioresNotaCreditoSoli.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNotaCreditoSoli,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNotaCreditoSoli = new JButtonMe();
		//this.jButtonSiguientesNotaCreditoSoli.setText(">>");
        this.jButtonSiguientesNotaCreditoSoli.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNotaCreditoSoli,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNotaCreditoSoli = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNotaCreditoSoli.setText("Nue");
        this.jButtonNuevoGuardarCambiosNotaCreditoSoli.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNotaCreditoSoli,"nuevoguardarcambios_button","Nue",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNotaCreditoSoli";
		inputMap = this.jButtonNuevoGuardarCambiosNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNotaCreditoSoli"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNotaCreditoSoli";
		inputMap = this.jButtonRecargarInformacionNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNotaCreditoSoli"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNotaCreditoSoli";
		inputMap = this.jButtonSiguientesNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNotaCreditoSoli"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNotaCreditoSoli";
		inputMap = this.jButtonAnterioresNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNotaCreditoSoli"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNotaCreditoSoli();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNotaCreditoSoli.setMinimumSize(new Dimension(this.getWidth(),NotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotaCreditoSoli.setMaximumSize(new Dimension(this.getWidth(),NotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotaCreditoSoli.setPreferredSize(new Dimension(this.getWidth(),NotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNotaCreditoSoli = new GridBagLayout();

			this.jPanelPaginacionNotaCreditoSoli.setLayout(gridaBagLayoutPaginacionNotaCreditoSoli);						
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonAnterioresNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
					
						
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsNotaCreditoSoli.gridy = 0;//
			
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonNuevoGuardarCambiosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);//
						
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonSiguientesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoSoli.gridy = 1;//
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonNuevoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNotaCreditoSoli.gridy = 1;
				this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonNuevoRelacionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			}
			
			
			if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();//
				this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsNotaCreditoSoli.gridy = 1;//
				this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonGuardarCambiosTablaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);//
			}
			
			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoSoli.gridy = 1;//
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonDuplicarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);//
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoSoli.gridy = 1;//
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonCopiarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);//
		
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoSoli.gridy = 1;//
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonVerFormNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);//
		
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNotaCreditoSoli.add(this.jButtonCerrarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		
		this.jButtonRecargarInformacionNotaCreditoSoli.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotaCreditoSoli.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotaCreditoSoli.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNotaCreditoSoli.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotaCreditoSoli.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotaCreditoSoli.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNotaCreditoSoli.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotaCreditoSoli.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotaCreditoSoli.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNotaCreditoSoli.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotaCreditoSoli.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotaCreditoSoli.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNotaCreditoSoli.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotaCreditoSoli.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotaCreditoSoli.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotaCreditoSoli.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNotaCreditoSoli.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotaCreditoSoli.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotaCreditoSoli.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNotaCreditoSoli = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NotaCreditoSoli = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNotaCreditoSoli.setLayout(gridaBagParametrosReportesNotaCreditoSoli);
			this.jPanelParametrosReportesAccionesNotaCreditoSoli.setLayout(gridaBagParametrosReportesAccionesNotaCreditoSoli);
			
			
			this.jPanelParametrosAuxiliar1NotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar1NotaCreditoSoli);
			this.jPanelParametrosAuxiliar2NotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar2NotaCreditoSoli);
			this.jPanelParametrosAuxiliar3NotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar3NotaCreditoSoli);
			this.jPanelParametrosAuxiliar4NotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar4NotaCreditoSoli);
			//this.jPanelParametrosAuxiliar5NotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar2NotaCreditoSoli);			
			
			
			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jButtonRecargarInformacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCreditoSoli.add(this.jComboBoxTiposPaginacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCreditoSoli.add(this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCreditoSoli.add(this.jComboBoxTiposArchivosReportesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jPanelParametrosAuxiliar1NotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NotaCreditoSoli.add(this.jComboBoxTiposReportesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);																		
			
			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4NotaCreditoSoli.add(this.jComboBoxTiposGraficosReportesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jPanelParametrosAuxiliar4NotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jComboBoxTiposReportesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jCheckBoxGenerarReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jPanelParametrosAuxiliar2NotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jLabelAccionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNotaCreditoSoli.add(this.jButtonAbrirOrderByNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jComboBoxTiposSeleccionarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
			
			
			/*
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jCheckBoxSeleccionarTodosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jCheckBoxConGraficoReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCreditoSoli.add(this.jCheckBoxSeleccionarTodosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);															
				
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCreditoSoli.add(this.jCheckBoxSeleccionadosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);															
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCreditoSoli.add(this.jCheckBoxConGraficoReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jPanelParametrosAuxiliar3NotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jComboBoxTiposRelacionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
				
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jComboBoxTiposAccionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	
				
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoSoli.add(this.jTextFieldValorCampoGeneralNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalNotaCreditoSoli= new GridBagLayout();
		this.jPanelCamposFintotalNotaCreditoSoli.setLayout(gridaBagLayoutCamposFintotalNotaCreditoSoli);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNotaCreditoSoli = new GridBagLayout();

			this.jScrollPanelDatosNotaCreditoSoli.setLayout(gridaBagLayoutDatosNotaCreditoSoli);
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
			this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
			
			this.jScrollPanelDatosNotaCreditoSoli.add(this.jTableDatosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNotaCreditoSoli.setViewportView(this.jTableDatosNotaCreditoSoli);
		this.jTableDatosNotaCreditoSoli.setFillsViewportHeight(true);
		this.jTableDatosNotaCreditoSoli.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesNotaCreditoSoli.setLayout(gridaBagLayoutAccionesNotaCreditoSoli);
		
		
		/*	
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
			
		this.jPanelAccionesNotaCreditoSoli.add(this.jButtonNuevoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdClienteNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdClienteNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdClienteNotaCreditoSoli.add(jLabelid_clienteFK_IdClienteNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdClienteNotaCreditoSoli.add(jComboBoxid_clienteFK_IdClienteNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);


		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdClienteNotaCreditoSoli.add(this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdClienteNotaCreditoSoli.add(jButtonFK_IdClienteNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("1.-Por Cliente ", jPanelFK_IdClienteNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdEmpleadoNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdEmpleadoNotaCreditoSoli.add(jLabelid_empleadoFK_IdEmpleadoNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdEmpleadoNotaCreditoSoli.add(jComboBoxid_empleadoFK_IdEmpleadoNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);


		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdEmpleadoNotaCreditoSoli.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdEmpleadoNotaCreditoSoli.add(jButtonFK_IdEmpleadoNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoNotaCreditoSoliNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdEstadoNotaCreditoSoliNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.add(jLabelid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.add(jComboBoxid_estado_nota_creditoFK_IdEstadoNotaCreditoSoliNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli.add(jButtonFK_IdEstadoNotaCreditoSoliNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("3.-Por Estado ", jPanelFK_IdEstadoNotaCreditoSoliNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFacturaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdFacturaNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdFacturaNotaCreditoSoli.add(jLabelid_facturaFK_IdFacturaNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdFacturaNotaCreditoSoli.add(jComboBoxid_facturaFK_IdFacturaNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);


		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdFacturaNotaCreditoSoli.add(this.jButtonBuscarFK_IdFacturaid_facturaNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdFacturaNotaCreditoSoli.add(jButtonFK_IdFacturaNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("4.-Por Factura ", jPanelFK_IdFacturaNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdResponsableNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdResponsableNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdResponsableNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdResponsableNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdResponsableNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdResponsableNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdResponsableNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdResponsableNotaCreditoSoli.add(jLabelid_responsableFK_IdResponsableNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdResponsableNotaCreditoSoli.add(jComboBoxid_responsableFK_IdResponsableNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdResponsableNotaCreditoSoli.add(jButtonFK_IdResponsableNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("5.-Por Responsable ", jPanelFK_IdResponsableNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoNotaCreditoSoliNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdTipoNotaCreditoSoliNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoNotaCreditoSoliNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoNotaCreditoSoliNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoNotaCreditoSoliNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdTipoNotaCreditoSoliNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli.add(jLabelid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli.add(jComboBoxid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoliNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli.add(jButtonFK_IdTipoNotaCreditoSoliNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("6.-Por Tipo ", jPanelFK_IdTipoNotaCreditoSoliNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTransportistaNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdTransportistaNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdTransportistaNotaCreditoSoli.add(jLabelid_transportistaFK_IdTransportistaNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdTransportistaNotaCreditoSoli.add(jComboBoxid_transportistaFK_IdTransportistaNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdTransportistaNotaCreditoSoli.add(jButtonFK_IdTransportistaNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("7.-Por Transportista ", jPanelFK_IdTransportistaNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdVendedorNotaCreditoSoli= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorNotaCreditoSoli.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorNotaCreditoSoli.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorNotaCreditoSoli.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorNotaCreditoSoli.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorNotaCreditoSoli.setLayout(gridaBagLayoutFK_IdVendedorNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdVendedorNotaCreditoSoli.add(jLabelid_vendedorFK_IdVendedorNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 1;
		jPanelFK_IdVendedorNotaCreditoSoli.add(jComboBoxid_vendedorFK_IdVendedorNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);


		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCreditoSoli.gridy = 0;
		gridBagConstraintsNotaCreditoSoli.gridx = 0;
		jPanelFK_IdVendedorNotaCreditoSoli.add(this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoSoli.gridy = 1;
		gridBagConstraintsNotaCreditoSoli.gridx =1;
		jPanelFK_IdVendedorNotaCreditoSoli.add(jButtonFK_IdVendedorNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);

		jTabbedPaneBusquedasNotaCreditoSoli.addTab("8.-Por Vendedor ", jPanelFK_IdVendedorNotaCreditoSoli);
		jTabbedPaneBusquedasNotaCreditoSoli.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotaCreditoSoli);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();						
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCreditoSoli.gridx = 0;		
			//this.gridBagConstraintsNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotaCreditoSoli.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;		
		//this.gridBagConstraintsNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNotaCreditoSoli);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCreditoSoli.gridx = 0;		
			this.gridBagConstraintsNotaCreditoSoli.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNotaCreditoSoli.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);								
		
		
		/*
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		*/		
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotaCreditoSoli.gridx =0;
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotaCreditoSoli.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
				
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(NotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotaCreditoSoli = new GridBagLayout();
			this.jPanelBusquedasParametrosNotaCreditoSoli.setLayout(gridaBagLayoutBusquedasParametrosNotaCreditoSoli);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNotaCreditoSoli=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNotaCreditoSoli;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNotaCreditoSoli() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNotaCreditoSoli = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNotaCreditoSoli.setName("jPanelReporteDinamicoNotaCreditoSoli"); 
		
		this.jPanelReporteDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNotaCreditoSoli.setLayout(gridaBagLayoutReporteDinamicoNotaCreditoSoli);
		
		
		this.jInternalFrameReporteDinamicoNotaCreditoSoli= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNotaCreditoSoli = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotaCreditoSoli= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNotaCreditoSoli.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNotaCreditoSoli.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameReporteDinamicoNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameReporteDinamicoNotaCreditoSoli.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnasSelectReporteNotaCreditoSoli.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelColumnasSelectReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNotaCreditoSoli = new JList<Reporte>();
		this.jListColumnasSelectReporteNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNotaCreditoSoli=new JScrollPane(this.jListColumnasSelectReporteNotaCreditoSoli);
			
			this.jScrollColumnasSelectReporteNotaCreditoSoli.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotaCreditoSoli.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotaCreditoSoli.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jListColumnasSelectReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jScrollColumnasSelectReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNotaCreditoSoli = new JLabelMe();

		this.jLabelRelacionesSelectReporteNotaCreditoSoli.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelRelacionesSelectReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNotaCreditoSoli = new JList<Reporte>();
		this.jListRelacionesSelectReporteNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNotaCreditoSoli=new JScrollPane(this.jListRelacionesSelectReporteNotaCreditoSoli);
			
			this.jScrollRelacionesSelectReporteNotaCreditoSoli.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotaCreditoSoli.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotaCreditoSoli.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jListRelacionesSelectReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jScrollRelacionesSelectReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoNotaCreditoSoli = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli = new JComboBoxMe();
		this.jListColumnasValoresGraficoNotaCreditoSoli = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNotaCreditoSoli = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNotaCreditoSoli.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoNotaCreditoSoli = new JLabelMe();

		this.jLabelConGraficoDinamicoNotaCreditoSoli.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelConGraficoDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoNotaCreditoSoli.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoNotaCreditoSoli.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jCheckBoxConGraficoDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoNotaCreditoSoli.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelColumnaCategoriaGraficoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnaCategoriaValorNotaCreditoSoli.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelColumnaCategoriaValorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorNotaCreditoSoli.setText("Accion");
        this.jComboBoxColumnaCategoriaValorNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotaCreditoSoli.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jComboBoxColumnaCategoriaValorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnasValoresGraficoNotaCreditoSoli.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelColumnasValoresGraficoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoNotaCreditoSoli = new JList<Reporte>();
		this.jListColumnasValoresGraficoNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoNotaCreditoSoli.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoNotaCreditoSoli=new JScrollPane(this.jListColumnasValoresGraficoNotaCreditoSoli);
			
			this.jScrollColumnasValoresGraficoNotaCreditoSoli.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotaCreditoSoli.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotaCreditoSoli.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jListColumnasSelectReporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jScrollColumnasValoresGraficoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoSoli = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoNotaCreditoSoli.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelTiposGraficosReportesDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotaCreditoSoli.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoSoli = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNotaCreditoSoli.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelGenerarExcelReporteDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNotaCreditoSoli.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNotaCreditoSoli,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNotaCreditoSoli.setToolTipText("Generar EXCEL"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jButtonGenerarExcelReporteDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jComboBoxTiposReportesDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoSoli = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNotaCreditoSoli.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jLabelTiposArchivoReporteDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNotaCreditoSoli.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNotaCreditoSoli,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNotaCreditoSoli.setToolTipText("Generar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jButtonGenerarReporteDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNotaCreditoSoli.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNotaCreditoSoli,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNotaCreditoSoli.setToolTipText("Cancelar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoSoli.add(this.jButtonCerrarReporteDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNotaCreditoSoli = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNotaCreditoSoli= new JScrollPane(jPanelReporteDinamicoNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoSoli.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNotaCreditoSoli);
		this.jInternalFrameReporteDinamicoNotaCreditoSoli.getContentPane().add(this.jScrollPanelReporteDinamicoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNotaCreditoSoli() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNotaCreditoSoli = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNotaCreditoSoli.setName("jPanelImportacionNotaCreditoSoli"); 
		
		this.jPanelImportacionNotaCreditoSoli.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotaCreditoSoli.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotaCreditoSoli.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNotaCreditoSoli.setLayout(gridaBagLayoutImportacionNotaCreditoSoli);
		
		
		this.jInternalFrameImportacionNotaCreditoSoli= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNotaCreditoSoli= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNotaCreditoSoli = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotaCreditoSoli= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotaCreditoSoli.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNotaCreditoSoli.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameImportacionNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameImportacionNotaCreditoSoli.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotaCreditoSoli.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNotaCreditoSoli.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameImportacionNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameImportacionNotaCreditoSoli.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNotaCreditoSoli.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotaCreditoSoli.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotaCreditoSoli.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNotaCreditoSoli = new JLabelMe();

		this.jLabelArchivoImportacionNotaCreditoSoli.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotaCreditoSoli.add(this.jLabelArchivoImportacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNotaCreditoSoli = new JFileChooser();		
		this.jFileChooserImportacionNotaCreditoSoli.setToolTipText("ESCOGER ARCHIVO"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNotaCreditoSoli = new JButtonMe();
		this.jButtonAbrirImportacionNotaCreditoSoli.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNotaCreditoSoli,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNotaCreditoSoli.setToolTipText("Generar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoSoli.add(this.jButtonAbrirImportacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNotaCreditoSoli = new JLabelMe();

		this.jLabelPathArchivoImportacionNotaCreditoSoli.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotaCreditoSoli.add(this.jLabelPathArchivoImportacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNotaCreditoSoli=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNotaCreditoSoli.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotaCreditoSoli.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotaCreditoSoli.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoSoli.add(this.jTextFieldPathArchivoImportacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarImportacionNotaCreditoSoli.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNotaCreditoSoli,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNotaCreditoSoli.setToolTipText("Generar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoSoli.add(this.jButtonGenerarImportacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarImportacionNotaCreditoSoli.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNotaCreditoSoli,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNotaCreditoSoli.setToolTipText("Cancelar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoSoli.add(this.jButtonCerrarImportacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNotaCreditoSoli = new GridBagLayout();
		
		this.jScrollPanelImportacionNotaCreditoSoli= new JScrollPane(jPanelImportacionNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy =iPosYImportacion;
		this.gridBagConstraintsNotaCreditoSoli.gridx =iPosXImportacion;
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNotaCreditoSoli);
		this.jInternalFrameImportacionNotaCreditoSoli.getContentPane().add(this.jScrollPanelImportacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNotaCreditoSoli(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNotaCreditoSoli = new JButtonMe();
			this.jButtonAbrirOrderByNotaCreditoSoli.setText("Orden");
			this.jButtonAbrirOrderByNotaCreditoSoli.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotaCreditoSoli,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNotaCreditoSoli";
			inputMap = this.jButtonAbrirOrderByNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNotaCreditoSoli"));
		
		
			GridBagLayout gridaBagLayoutOrderByNotaCreditoSoli = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNotaCreditoSoli.setName("jPanelOrderByNotaCreditoSoli"); 
			
			this.jPanelOrderByNotaCreditoSoli.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotaCreditoSoli.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotaCreditoSoli.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNotaCreditoSoli.setLayout(gridaBagLayoutOrderByNotaCreditoSoli);
			
			
			this.jTableDatosNotaCreditoSoliOrderBy = new JTableMe();        
			this.jTableDatosNotaCreditoSoliOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNotaCreditoSoliOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNotaCreditoSoliOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNotaCreditoSoliOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNotaCreditoSoliOrderBy.setViewportView(this.jTableDatosNotaCreditoSoliOrderBy);
			this.jTableDatosNotaCreditoSoliOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNotaCreditoSoliOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNotaCreditoSoli= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNotaCreditoSoli= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNotaCreditoSoli = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNotaCreditoSoli= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNotaCreditoSoli.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNotaCreditoSoli.setTitle("Orden");
			this.jInternalFrameOrderByNotaCreditoSoli.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNotaCreditoSoli.setResizable(true);
			this.jInternalFrameOrderByNotaCreditoSoli.setClosable(true);
			this.jInternalFrameOrderByNotaCreditoSoli.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNotaCreditoSoli.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotaCreditoSoli.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotaCreditoSoli.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNotaCreditoSoli.ipady =150;
				
			this.jPanelOrderByNotaCreditoSoli.add(jScrollPanelDatosNotaCreditoSoliOrderBy, this.gridBagConstraintsNotaCreditoSoli);//this.jTableDatosNotaCreditoSoliTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNotaCreditoSoli = new JButtonMe();
			this.jButtonCerrarOrderByNotaCreditoSoli.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNotaCreditoSoli,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNotaCreditoSoli.setToolTipText("Cancelar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNotaCreditoSoli.add(this.jButtonCerrarOrderByNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNotaCreditoSoli = new GridBagLayout();
			
			this.jScrollPanelOrderByNotaCreditoSoli= new JScrollPane(jPanelOrderByNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy =iPosYOrderBy;
			this.gridBagConstraintsNotaCreditoSoli.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNotaCreditoSoli);
			
			this.jInternalFrameOrderByNotaCreditoSoli.getContentPane().add(this.jScrollPanelOrderByNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
		
		} else {
			this.jButtonAbrirOrderByNotaCreditoSoli = new JButtonMe();
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
		int iWidthTableCalculado=0;//8730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=5100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.notacreditosoliSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNotaCreditoSoli.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNotaCreditoSoli.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNotaCreditoSoli.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNotaCreditoSoli.getRowHeight();//NotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli.isSelected()) {
					iHeightTable=NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotaCreditoSoli.isSelected()) {
					iHeightTable=NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNotaCreditoSoli!=null && this.jInternalFrameOrderByNotaCreditoSoli.getjTableDatosOrderBy()!=null) {
			//if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNotaCreditoSoli.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNotaCreditoSoli.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNotaCreditoSoli.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNotaCreditoSoli.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNotaCreditoSoli.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNotaCreditoSoli.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNotaCreditoSoli.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=notacreditosoliLogic.getNotaCreditoSolis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=notacreditosolis.size();
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
	public static List<NotaCreditoSoli> TraerNotaCreditoSoliBeans(List<NotaCreditoSoli> notacreditosolis,ArrayList<Classe> classes)throws Exception {
		try {
			for(NotaCreditoSoli notacreditosoli:notacreditosolis) {
					
				if(!(NotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					notacreditosoli.setsDetalleGeneralEntityReporte(NotaCreditoSoliConstantesFunciones.getNotaCreditoSoliDescripcion(notacreditosoli));
										
					notacreditosoli.setpenalizado_descripcion(NotaCreditoSoliConstantesFunciones.getpenalizadoDescripcion(notacreditosoli));	
					
					

					if(notacreditosoli.getDetaNotaCreditoSolis()!=null && Funciones.existeClass(classes,DetaNotaCreditoSoli.class)) {
						try{notacreditosoli.setdetanotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(DetaNotaCreditoSoliJInternalFrame.TraerDetaNotaCreditoSoliBeans(notacreditosoli.getDetaNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//notacreditosoli.setsDetalleGeneralEntityReporte(notacreditosoli.getsDetalleGeneralEntityReporte());
										
				}
				
				//notacreditosolibeans.add(notacreditosolibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return notacreditosolis;
    }
	//PARA REPORTES FIN
}
