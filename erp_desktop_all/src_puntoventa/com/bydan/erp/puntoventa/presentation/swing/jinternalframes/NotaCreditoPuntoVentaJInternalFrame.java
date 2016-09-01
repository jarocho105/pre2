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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.NotaCreditoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class NotaCreditoPuntoVentaJInternalFrame extends NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNotaCreditoPuntoVenta;
	
	protected JMenuBar jmenuBarNotaCreditoPuntoVenta;
	
	protected JMenu jmenuNotaCreditoPuntoVenta;
	protected JMenu jmenuDatosNotaCreditoPuntoVenta;
	protected JMenu jmenuArchivoNotaCreditoPuntoVenta;
	protected JMenu jmenuAccionesNotaCreditoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotaCreditoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsNotaCreditoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NotaCreditoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormNotaCreditoPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNotaCreditoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNotaCreditoPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoFacturaPuntoVentaBeanSwingJInternalFrame tipofacturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofacturapuntoventa="";

	protected EstadoNotaCreditoBeanSwingJInternalFrame estadonotacreditopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonotacreditopuntoventa="";
	
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MesaSessionBean mesaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean;
	public EstadoNotaCreditoSessionBean estadonotacreditopuntoventaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NotaCreditoPuntoVenta> notacreditopuntoventas;		
	public List<NotaCreditoPuntoVenta> notacreditopuntoventasEliminados;	
	public List<NotaCreditoPuntoVenta> notacreditopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNotaCreditoPuntoVenta;		
	protected JButton jButtonAbrirOrderByNotaCreditoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByNotaCreditoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByNotaCreditoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByNotaCreditoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NotaCreditoPuntoVentaLogic notacreditopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralNotaCreditoPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosNotaCreditoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNotaCreditoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionNotaCreditoPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesNotaCreditoPuntoVenta;
	
    protected JPanel jPanelPaginacionNotaCreditoPuntoVenta;
    protected JPanel jPanelParametrosReportesNotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesNotaCreditoPuntoVenta;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalNotaCreditoPuntoVenta;
	protected Integer iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
	protected Integer iYPanelCamposFintotalNotaCreditoPuntoVenta=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2NotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3NotaCreditoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4NotaCreditoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5NotaCreditoPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoNotaCreditoPuntoVenta;
	//protected JPanel jPanelImportacionNotaCreditoPuntoVenta;
	
	
	public JTable jTableDatosNotaCreditoPuntoVenta;
	
	
	
	//public JTable jTableDatosNotaCreditoPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNotaCreditoPuntoVenta;
	protected JButton jButtonDuplicarNotaCreditoPuntoVenta;
	protected JButton jButtonCopiarNotaCreditoPuntoVenta;
	protected JButton jButtonVerFormNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoRelacionesNotaCreditoPuntoVenta;
	protected JButton jButtonModificarNotaCreditoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarNotaCreditoPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionNotaCreditoPuntoVenta;
	protected JButton jButtonProcesarInformacionNotaCreditoPuntoVenta;
	
	
	protected JButton jButtonAnterioresNotaCreditoPuntoVenta;
	protected JButton jButtonSiguientesNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNotaCreditoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoNotaCreditoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoNotaCreditoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionNotaCreditoPuntoVenta;
	//protected JButton jButtonGenerarImportacionNotaCreditoPuntoVenta;
	//protected JButton jButtonCerrarImportacionNotaCreditoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionNotaCreditoPuntoVenta;
	//protected File fileImportacionNotaCreditoPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonDuplicarToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarNotaCreditoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonCopiarToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonVerFormToolBarNotaCreditoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarToolBarNotaCreditoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonAnterioresToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonSiguientesToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarNotaCreditoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesNotaCreditoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCopiarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemVerFormNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCerrarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarNotaCreditoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotaCreditoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosNotaCreditoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNotaCreditoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNotaCreditoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralNotaCreditoPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNotaCreditoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteNotaCreditoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteNotaCreditoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteNotaCreditoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteNotaCreditoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteNotaCreditoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNotaCreditoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNotaCreditoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoNotaCreditoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionNotaCreditoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionNotaCreditoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionNotaCreditoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNotaCreditoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorNotaCreditoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoNotaCreditoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoNotaCreditoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoNotaCreditoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNotaCreditoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNotaCreditoPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdAsientoContableNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdAsientoContableNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdCajaNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdCajaNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdClienteNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdClienteNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdFormatoNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdFormatoNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdMesaNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdMesaNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdTipoPrecioNotaCreditoPuntoVenta;
	public JPanel jPanelFK_IdVendedorNotaCreditoPuntoVenta;
	public JButton jButtonFK_IdVendedorNotaCreditoPuntoVenta;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta;
	
	public JPanel jPanelid_cajaFK_IdCajaNotaCreditoPuntoVenta;
	public JLabel jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaNotaCreditoPuntoVenta;
	public JButton jButtonid_cajaFK_IdCajaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteNotaCreditoPuntoVenta;
	public JLabel jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteNotaCreditoPuntoVenta;
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta;
	
	public JPanel jPanelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta;
	public JLabel jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta;
	public JButton jButtonid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoNotaCreditoPuntoVenta;
	public JLabel jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoNotaCreditoPuntoVenta;
	public JButton jButtonid_formatoFK_IdFormatoNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesaFK_IdMesaNotaCreditoPuntoVenta;
	public JLabel jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaFK_IdMesaNotaCreditoPuntoVenta;
	public JButton jButtonid_mesaFK_IdMesaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta;
	public JLabel jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta;
	public JButton jButtonid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta;
	public JLabel jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorNotaCreditoPuntoVenta;
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorNotaCreditoPuntoVentaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta;
	
	
	
	
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
		
	//public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NotaCreditoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNotaCreditoPuntoVenta)	{
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta = jButtonRecargarInformacionNotaCreditoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionNotaCreditoPuntoVenta() {
		return this.jButtonProcesarInformacionNotaCreditoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotaCreditoPuntoVenta)	{
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta = jButtonProcesarInformacionNotaCreditoPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionNotaCreditoPuntoVenta() {
		return this.jButtonRecargarInformacionNotaCreditoPuntoVenta;
	}
	
	
	public List<NotaCreditoPuntoVenta> getnotacreditopuntoventas() {
		return this.notacreditopuntoventas;
	}

	public void setnotacreditopuntoventas(List<NotaCreditoPuntoVenta> notacreditopuntoventas) {
		this.notacreditopuntoventas = notacreditopuntoventas;
	}
	
	public List<NotaCreditoPuntoVenta> getnotacreditopuntoventasAux() {
		return this.notacreditopuntoventasAux;
	}

	public void setnotacreditopuntoventasAux(List<NotaCreditoPuntoVenta> notacreditopuntoventasAux) {
		this.notacreditopuntoventasAux = notacreditopuntoventasAux;
	}
	
	public List<NotaCreditoPuntoVenta> getnotacreditopuntoventasEliminados() {
		return this.notacreditopuntoventasEliminados;
	}

	public void setNotaCreditoPuntoVentasEliminados(List<NotaCreditoPuntoVenta> notacreditopuntoventasEliminados) {
		this.notacreditopuntoventasEliminados = notacreditopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNotaCreditoPuntoVenta() {
		return jComboBoxTiposSeleccionarNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarNotaCreditoPuntoVenta) {
		this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta = jComboBoxTiposSeleccionarNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNotaCreditoPuntoVenta() {
		return jTextFieldValorCampoGeneralNotaCreditoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralNotaCreditoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralNotaCreditoPuntoVenta) {
		this.jTextFieldValorCampoGeneralNotaCreditoPuntoVenta = jTextFieldValorCampoGeneralNotaCreditoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNotaCreditoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosNotaCreditoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta = jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNotaCreditoPuntoVenta() {
		return this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosNotaCreditoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosNotaCreditoPuntoVenta) {
		this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta = jCheckBoxSeleccionadosNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta = jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposReportesNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposReportesNotaCreditoPuntoVenta) {
		this.jComboBoxTiposReportesNotaCreditoPuntoVenta = jComboBoxTiposReportesNotaCreditoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta = jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta = jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionNotaCreditoPuntoVenta) {
		this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta = jComboBoxTiposPaginacionNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposAccionesNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesNotaCreditoPuntoVenta) {
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta = jComboBoxTiposRelacionesNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposAccionesNotaCreditoPuntoVenta) {
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta = jComboBoxTiposAccionesNotaCreditoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNotaCreditoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta = jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNotaCreditoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNotaCreditoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta .setBorder(borderResaltar);		
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
		this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		
		this.notacreditopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotaCreditoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 2850) {
			iWidth=2850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNotaCreditoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"copiar","copiar","Copiar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"recargar","recargar","Recargar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNotaCreditoPuntoVenta,this.jTtoolBarNotaCreditoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNotaCreditoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNotaCreditoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarNotaCreditoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNotaCreditoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarNotaCreditoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNotaCreditoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNotaCreditoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoNotaCreditoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesNotaCreditoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosNotaCreditoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotaCreditoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotaCreditoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotaCreditoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNotaCreditoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNotaCreditoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNotaCreditoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNotaCreditoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNotaCreditoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNotaCreditoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNotaCreditoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNotaCreditoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNotaCreditoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNotaCreditoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNotaCreditoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNotaCreditoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNotaCreditoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNotaCreditoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNotaCreditoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotaCreditoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotaCreditoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotaCreditoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNotaCreditoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNotaCreditoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNotaCreditoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNotaCreditoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNotaCreditoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNotaCreditoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNotaCreditoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNotaCreditoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNotaCreditoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNotaCreditoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNotaCreditoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNotaCreditoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNotaCreditoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNotaCreditoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNotaCreditoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNotaCreditoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNotaCreditoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNotaCreditoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNotaCreditoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNotaCreditoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNotaCreditoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNotaCreditoPuntoVenta.add(this.jMenuItemCerrarNotaCreditoPuntoVenta);
			
			this.jmenuAccionesNotaCreditoPuntoVenta.add(this.jMenuItemNuevoNotaCreditoPuntoVenta);
			this.jmenuAccionesNotaCreditoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosNotaCreditoPuntoVenta);
			this.jmenuAccionesNotaCreditoPuntoVenta.add(this.jMenuItemNuevoRelacionesNotaCreditoPuntoVenta);
			this.jmenuAccionesNotaCreditoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaNotaCreditoPuntoVenta);		
			this.jmenuAccionesNotaCreditoPuntoVenta.add(this.jMenuItemDuplicarNotaCreditoPuntoVenta);		
			this.jmenuAccionesNotaCreditoPuntoVenta.add(this.jMenuItemCopiarNotaCreditoPuntoVenta);		
			this.jmenuAccionesNotaCreditoPuntoVenta.add(this.jMenuItemVerFormNotaCreditoPuntoVenta);		
			
			this.jmenuDatosNotaCreditoPuntoVenta.add(this.jMenuItemRecargarInformacionNotaCreditoPuntoVenta);				
			this.jmenuDatosNotaCreditoPuntoVenta.add(this.jMenuItemAnterioresNotaCreditoPuntoVenta);				
			this.jmenuDatosNotaCreditoPuntoVenta.add(this.jMenuItemSiguientesNotaCreditoPuntoVenta);				
			this.jmenuDatosNotaCreditoPuntoVenta.add(this.jMenuItemAbrirOrderByNotaCreditoPuntoVenta);				
			this.jmenuDatosNotaCreditoPuntoVenta.add(this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNotaCreditoPuntoVenta.add(this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNotaCreditoPuntoVenta.add(this.jmenuArchivoNotaCreditoPuntoVenta);		
			this.jmenuBarNotaCreditoPuntoVenta.add(this.jmenuAccionesNotaCreditoPuntoVenta);		
			this.jmenuBarNotaCreditoPuntoVenta.add(this.jmenuDatosNotaCreditoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNotaCreditoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNotaCreditoPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableNotaCreditoPuntoVenta.setToolTipText("Buscar Por Asiento C ");
		this.jButtonFK_IdAsientoContableNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdAsientoContableNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdAsientoContableNotaCreditoPuntoVenta.setToolTipText("Buscar Por Asiento C ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableNotaCreditoPuntoVenta,"buscar_button","Buscar Por Asiento C ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setText("Asiento C :");
		jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setToolTipText("Asiento C");
		jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta.setFocusable(false);

		this.jPanelFK_IdCajaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdCajaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdCajaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaNotaCreditoPuntoVenta,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta.setText("Caja :");
		jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteNotaCreditoPuntoVenta.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdClienteNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdClienteNotaCreditoPuntoVenta.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteNotaCreditoPuntoVenta,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta.setText("Cliente :");
		jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta.setFocusable(false);

		this.jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setText("Estado :");
		jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setToolTipText("Estado");
		jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNotaCreditoPuntoVenta.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdFormatoNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdFormatoNotaCreditoPuntoVenta.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNotaCreditoPuntoVenta,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setText("Formato :");
		jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Mesa ");
		this.jButtonFK_IdMesaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdMesaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdMesaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Mesa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesaNotaCreditoPuntoVenta,"buscar_button","Buscar Por Mesa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta.setText("Mesa :");
		jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta.setToolTipText("Mesa");
		jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesaFK_IdMesaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_mesaFK_IdMesaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaFK_IdMesaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setText("Tipo :");
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setToolTipText("Tipo");
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoPrecioNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoPrecioNotaCreditoPuntoVenta.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioNotaCreditoPuntoVenta,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorNotaCreditoPuntoVenta.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdVendedorNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdVendedorNotaCreditoPuntoVenta.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorNotaCreditoPuntoVenta,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta.setFocusable(false);


		this.jTabbedPaneBusquedasNotaCreditoPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNotaCreditoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNotaCreditoPuntoVenta = new NotaCreditoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Nota Credito DATOS");
			this.jInternalFrameDetalleFormNotaCreditoPuntoVenta = new NotaCreditoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.notacreditopuntoventaSessionBean.getConGuardarRelaciones(),this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNotaCreditoPuntoVenta = null;//new NotaCreditoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotaCreditoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosNotaCreditoPuntoVenta = new JTableMe();      
		
		String sToolTipNotaCreditoPuntoVenta="";
		sToolTipNotaCreditoPuntoVenta=NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotaCreditoPuntoVenta+="(PuntoVenta.NotaCreditoPuntoVenta)";
		}
		
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotaCreditoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNotaCreditoPuntoVenta.setToolTipText(sToolTipNotaCreditoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNotaCreditoPuntoVenta);
		this.jTableDatosNotaCreditoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosNotaCreditoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNotaCreditoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCopiarNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonVerFormNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesNotaCreditoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarNotaCreditoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosNotaCreditoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Nota Credito";
		
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotaCreditoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesNotaCreditoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalNotaCreditoPuntoVenta.setName("jPanelCamposFintotalNotaCreditoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta=new ReporteDinamicoJInternalFrame(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNotaCreditoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNotaCreditoPuntoVenta=new ImportacionJInternalFrame(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNotaCreditoPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNotaCreditoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByNotaCreditoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByNotaCreditoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotaCreditoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotaCreditoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotaCreditoPuntoVenta,false,this);
			
			//this.cargarOrderByNotaCreditoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNotaCreditoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotaCreditoPuntoVenta,true,this);
			
			//this.cargarOrderByNotaCreditoPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(400,50));//2830
		this.jTableDatosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(400,50));//2830
		this.jTableDatosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(400,50));//2830
		
		this.jScrollPanelDatosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNotaCreditoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarNotaCreditoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarNotaCreditoPuntoVenta.setText("Copiar");
		this.jButtonVerFormNotaCreditoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesNotaCreditoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.setText("Guardar");
		this.jButtonCerrarNotaCreditoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotaCreditoPuntoVenta,"nuevo_button","Nuevo",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNotaCreditoPuntoVenta,"duplicar_button","Duplicar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNotaCreditoPuntoVenta,"copiar_button","Copiar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNotaCreditoPuntoVenta,"ver_form","Ver",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNotaCreditoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta,"guardarcambiostabla_button","Guardar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotaCreditoPuntoVenta,"cerrar_button","Salir",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNotaCreditoPuntoVenta.setToolTipText("Nuevo"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNotaCreditoPuntoVenta.setToolTipText("Duplicar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNotaCreditoPuntoVenta.setToolTipText("Copiar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNotaCreditoPuntoVenta.setToolTipText("Ver"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNotaCreditoPuntoVenta.setToolTipText("Nuevo Rel"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.setToolTipText("Guardar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotaCreditoPuntoVenta.setToolTipText("Salir"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotaCreditoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarNotaCreditoPuntoVenta";
		inputMap = this.jButtonDuplicarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNotaCreditoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarNotaCreditoPuntoVenta";
		inputMap = this.jButtonCopiarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNotaCreditoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormNotaCreditoPuntoVenta";
		inputMap = this.jButtonVerFormNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNotaCreditoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNotaCreditoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNotaCreditoPuntoVenta";
		inputMap = this.jButtonModificarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNotaCreditoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNotaCreditoPuntoVenta";
		inputMap = this.jButtonCerrarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotaCreditoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotaCreditoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotaCreditoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNotaCreditoPuntoVenta.setName("jPanelParametrosReportesNotaCreditoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNotaCreditoPuntoVenta.setName("jPanelParametrosReportesAccionesNotaCreditoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta.setToolTipText("Recargar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNotaCreditoPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta.setToolTipText("Procesar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesNotaCreditoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNotaCreditoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNotaCreditoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesNotaCreditoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNotaCreditoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresNotaCreditoPuntoVenta.setText("<<");
        this.jButtonAnterioresNotaCreditoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNotaCreditoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNotaCreditoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesNotaCreditoPuntoVenta.setText(">>");
        this.jButtonSiguientesNotaCreditoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNotaCreditoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta,"nuevoguardarcambios_button","Nue",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNotaCreditoPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNotaCreditoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNotaCreditoPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNotaCreditoPuntoVenta";
		inputMap = this.jButtonSiguientesNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNotaCreditoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNotaCreditoPuntoVenta";
		inputMap = this.jButtonAnterioresNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNotaCreditoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNotaCreditoPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),NotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),NotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),NotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NotaCreditoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNotaCreditoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionNotaCreditoPuntoVenta.setLayout(gridaBagLayoutPaginacionNotaCreditoPuntoVenta);						
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonAnterioresNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
					
						
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;//
			
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonNuevoGuardarCambiosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);//
						
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonSiguientesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonNuevoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
				this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonNuevoRelacionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			}
			
			
			if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();//
				this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;//
				this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);//
			}
			
			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonDuplicarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);//
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonCopiarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);//
		
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonVerFormNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);//
		
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNotaCreditoPuntoVenta.add(this.jButtonCerrarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNotaCreditoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NotaCreditoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NotaCreditoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.setLayout(gridaBagParametrosReportesNotaCreditoPuntoVenta);
			this.jPanelParametrosReportesAccionesNotaCreditoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesNotaCreditoPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1NotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1NotaCreditoPuntoVenta);
			this.jPanelParametrosAuxiliar2NotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2NotaCreditoPuntoVenta);
			this.jPanelParametrosAuxiliar3NotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3NotaCreditoPuntoVenta);
			this.jPanelParametrosAuxiliar4NotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4NotaCreditoPuntoVenta);
			//this.jPanelParametrosAuxiliar5NotaCreditoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2NotaCreditoPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jButtonRecargarInformacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCreditoPuntoVenta.add(this.jComboBoxTiposPaginacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCreditoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NotaCreditoPuntoVenta.add(this.jComboBoxTiposArchivosReportesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar1NotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NotaCreditoPuntoVenta.add(this.jComboBoxTiposReportesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);																		
			
			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4NotaCreditoPuntoVenta.add(this.jComboBoxTiposGraficosReportesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar4NotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jComboBoxTiposReportesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jCheckBoxGenerarReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar2NotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jLabelAccionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jButtonAbrirOrderByNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jComboBoxTiposSeleccionarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCreditoPuntoVenta.add(this.jCheckBoxSeleccionarTodosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);															
				
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCreditoPuntoVenta.add(this.jCheckBoxSeleccionadosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);															
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NotaCreditoPuntoVenta.add(this.jCheckBoxConGraficoReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jPanelParametrosAuxiliar3NotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
				
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jComboBoxTiposAccionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
	
				
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNotaCreditoPuntoVenta.add(this.jTextFieldValorCampoGeneralNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelCamposFintotalNotaCreditoPuntoVenta.setLayout(gridaBagLayoutCamposFintotalNotaCreditoPuntoVenta);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNotaCreditoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosNotaCreditoPuntoVenta.setLayout(gridaBagLayoutDatosNotaCreditoPuntoVenta);
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosNotaCreditoPuntoVenta.add(this.jTableDatosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNotaCreditoPuntoVenta.setViewportView(this.jTableDatosNotaCreditoPuntoVenta);
		this.jTableDatosNotaCreditoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosNotaCreditoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesNotaCreditoPuntoVenta.setLayout(gridaBagLayoutAccionesNotaCreditoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesNotaCreditoPuntoVenta.add(this.jButtonNuevoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdAsientoContableNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdAsientoContableNotaCreditoPuntoVenta.add(jLabelid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdAsientoContableNotaCreditoPuntoVenta.add(jComboBoxid_asiento_contableFK_IdAsientoContableNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);


		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdAsientoContableNotaCreditoPuntoVenta.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdAsientoContableNotaCreditoPuntoVenta.add(jButtonFK_IdAsientoContableNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("1.-Por Asiento C ", jPanelFK_IdAsientoContableNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCajaNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdCajaNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdCajaNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdCajaNotaCreditoPuntoVenta.add(jLabelid_cajaFK_IdCajaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdCajaNotaCreditoPuntoVenta.add(jComboBoxid_cajaFK_IdCajaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdCajaNotaCreditoPuntoVenta.add(jButtonFK_IdCajaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("2.-Por Caja ", jPanelFK_IdCajaNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdClienteNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdClienteNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdClienteNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdClienteNotaCreditoPuntoVenta.add(jLabelid_clienteFK_IdClienteNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdClienteNotaCreditoPuntoVenta.add(jComboBoxid_clienteFK_IdClienteNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);


		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdClienteNotaCreditoPuntoVenta.add(this.jButtonBuscarFK_IdClienteid_clienteNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdClienteNotaCreditoPuntoVenta.add(jButtonFK_IdClienteNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("3.-Por Cliente ", jPanelFK_IdClienteNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.add(jLabelid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.add(jComboBoxid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta.add(jButtonFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("4.-Por Estado ", jPanelFK_IdEstadoNotaCreditoPuntoVentaNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFormatoNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdFormatoNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdFormatoNotaCreditoPuntoVenta.add(jLabelid_formatoFK_IdFormatoNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdFormatoNotaCreditoPuntoVenta.add(jComboBoxid_formatoFK_IdFormatoNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdFormatoNotaCreditoPuntoVenta.add(jButtonFK_IdFormatoNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("5.-Por Formato ", jPanelFK_IdFormatoNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdMesaNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdMesaNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesaNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesaNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesaNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesaNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdMesaNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdMesaNotaCreditoPuntoVenta.add(jLabelid_mesaFK_IdMesaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdMesaNotaCreditoPuntoVenta.add(jComboBoxid_mesaFK_IdMesaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdMesaNotaCreditoPuntoVenta.add(jButtonFK_IdMesaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("6.-Por Mesa ", jPanelFK_IdMesaNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.add(jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.add(jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta.add(jButtonFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("7.-Por Tipo ", jPanelFK_IdTipoFacturaPuntoVentaNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoPrecioNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta.add(jLabelid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta.add(jComboBoxid_tipo_precioFK_IdTipoPrecioNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta.add(jButtonFK_IdTipoPrecioNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("8.-Por Tipo Precio ", jPanelFK_IdTipoPrecioNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdVendedorNotaCreditoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorNotaCreditoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorNotaCreditoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorNotaCreditoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorNotaCreditoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorNotaCreditoPuntoVenta.setLayout(gridaBagLayoutFK_IdVendedorNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdVendedorNotaCreditoPuntoVenta.add(jLabelid_vendedorFK_IdVendedorNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
		jPanelFK_IdVendedorNotaCreditoPuntoVenta.add(jComboBoxid_vendedorFK_IdVendedorNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);


		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		jPanelFK_IdVendedorNotaCreditoPuntoVenta.add(this.jButtonBuscarFK_IdVendedorid_vendedorNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNotaCreditoPuntoVenta.gridy = 1;
		gridBagConstraintsNotaCreditoPuntoVenta.gridx =1;
		jPanelFK_IdVendedorNotaCreditoPuntoVenta.add(jButtonFK_IdVendedorNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);

		jTabbedPaneBusquedasNotaCreditoPuntoVenta.addTab("9.-Por Vendedor ", jPanelFK_IdVendedorNotaCreditoPuntoVenta);
		jTabbedPaneBusquedasNotaCreditoPuntoVenta.setMnemonicAt(8, KeyEvent.VK_9);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotaCreditoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsNotaCreditoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNotaCreditoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		*/		
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotaCreditoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
				
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(NotaCreditoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNotaCreditoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotaCreditoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosNotaCreditoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosNotaCreditoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNotaCreditoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNotaCreditoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.setName("jPanelReporteDinamicoNotaCreditoPuntoVenta"); 
		
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoNotaCreditoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteNotaCreditoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelColumnasSelectReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNotaCreditoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteNotaCreditoPuntoVenta);
			
			this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jListColumnasSelectReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteNotaCreditoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelRelacionesSelectReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNotaCreditoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNotaCreditoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteNotaCreditoPuntoVenta);
			
			this.jScrollRelacionesSelectReporteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jListRelacionesSelectReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jScrollRelacionesSelectReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoNotaCreditoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoNotaCreditoPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelConGraficoDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jCheckBoxConGraficoDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoNotaCreditoPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelColumnaCategoriaGraficoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorNotaCreditoPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelColumnaCategoriaValorNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jComboBoxColumnaCategoriaValorNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoNotaCreditoPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelColumnasValoresGraficoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoNotaCreditoPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoNotaCreditoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoNotaCreditoPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoNotaCreditoPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoNotaCreditoPuntoVenta);
			
			this.jScrollColumnasValoresGraficoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jListColumnasSelectReporteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jScrollColumnasValoresGraficoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNotaCreditoPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNotaCreditoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNotaCreditoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNotaCreditoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNotaCreditoPuntoVenta.setToolTipText("Generar EXCEL"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNotaCreditoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNotaCreditoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNotaCreditoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNotaCreditoPuntoVenta.setToolTipText("Generar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jButtonGenerarReporteDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNotaCreditoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNotaCreditoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNotaCreditoPuntoVenta.add(this.jButtonCerrarReporteDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta= new JScrollPane(jPanelReporteDinamicoNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNotaCreditoPuntoVenta);
		this.jInternalFrameReporteDinamicoNotaCreditoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNotaCreditoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNotaCreditoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNotaCreditoPuntoVenta.setName("jPanelImportacionNotaCreditoPuntoVenta"); 
		
		this.jPanelImportacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNotaCreditoPuntoVenta.setLayout(gridaBagLayoutImportacionNotaCreditoPuntoVenta);
		
		
		this.jInternalFrameImportacionNotaCreditoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNotaCreditoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNotaCreditoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionNotaCreditoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionNotaCreditoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotaCreditoPuntoVenta.add(this.jLabelArchivoImportacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNotaCreditoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionNotaCreditoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionNotaCreditoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNotaCreditoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNotaCreditoPuntoVenta.setToolTipText("Generar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoPuntoVenta.add(this.jButtonAbrirImportacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNotaCreditoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionNotaCreditoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNotaCreditoPuntoVenta.add(this.jLabelPathArchivoImportacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNotaCreditoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoPuntoVenta.add(this.jTextFieldPathArchivoImportacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionNotaCreditoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNotaCreditoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNotaCreditoPuntoVenta.setToolTipText("Generar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoPuntoVenta.add(this.jButtonGenerarImportacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionNotaCreditoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNotaCreditoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNotaCreditoPuntoVenta.add(this.jButtonCerrarImportacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionNotaCreditoPuntoVenta= new JScrollPane(jPanelImportacionNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNotaCreditoPuntoVenta);
		this.jInternalFrameImportacionNotaCreditoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNotaCreditoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNotaCreditoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByNotaCreditoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByNotaCreditoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNotaCreditoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNotaCreditoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNotaCreditoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByNotaCreditoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNotaCreditoPuntoVenta.setName("jPanelOrderByNotaCreditoPuntoVenta"); 
			
			this.jPanelOrderByNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNotaCreditoPuntoVenta.setLayout(gridaBagLayoutOrderByNotaCreditoPuntoVenta);
			
			
			this.jTableDatosNotaCreditoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosNotaCreditoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNotaCreditoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNotaCreditoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNotaCreditoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNotaCreditoPuntoVentaOrderBy.setViewportView(this.jTableDatosNotaCreditoPuntoVentaOrderBy);
			this.jTableDatosNotaCreditoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNotaCreditoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNotaCreditoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNotaCreditoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNotaCreditoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNotaCreditoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNotaCreditoPuntoVenta.ipady =150;
				
			this.jPanelOrderByNotaCreditoPuntoVenta.add(jScrollPanelDatosNotaCreditoPuntoVentaOrderBy, this.gridBagConstraintsNotaCreditoPuntoVenta);//this.jTableDatosNotaCreditoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNotaCreditoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByNotaCreditoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNotaCreditoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNotaCreditoPuntoVenta.add(this.jButtonCerrarOrderByNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNotaCreditoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByNotaCreditoPuntoVenta= new JScrollPane(jPanelOrderByNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNotaCreditoPuntoVenta);
			
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByNotaCreditoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//6030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.notacreditopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNotaCreditoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNotaCreditoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNotaCreditoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNotaCreditoPuntoVenta.getRowHeight();//NotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta.isSelected()) {
					iHeightTable=NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNotaCreditoPuntoVenta.isSelected()) {
					iHeightTable=NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NotaCreditoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNotaCreditoPuntoVenta!=null && this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNotaCreditoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=notacreditopuntoventaLogic.getNotaCreditoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=notacreditopuntoventas.size();
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
	public static List<NotaCreditoPuntoVenta> TraerNotaCreditoPuntoVentaBeans(List<NotaCreditoPuntoVenta> notacreditopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(NotaCreditoPuntoVenta notacreditopuntoventa:notacreditopuntoventas) {
					
				if(!(NotaCreditoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NotaCreditoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					notacreditopuntoventa.setsDetalleGeneralEntityReporte(NotaCreditoPuntoVentaConstantesFunciones.getNotaCreditoPuntoVentaDescripcion(notacreditopuntoventa));
										
						
					
					

					if(notacreditopuntoventa.getDetalleNotaCreditoPuntoVentas()!=null && Funciones.existeClass(classes,DetalleNotaCreditoPuntoVenta.class)) {
						try{notacreditopuntoventa.setdetallenotacreditopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(DetalleNotaCreditoPuntoVentaJInternalFrame.TraerDetalleNotaCreditoPuntoVentaBeans(notacreditopuntoventa.getDetalleNotaCreditoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//notacreditopuntoventa.setsDetalleGeneralEntityReporte(notacreditopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//notacreditopuntoventabeans.add(notacreditopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return notacreditopuntoventas;
    }
	//PARA REPORTES FIN
}
