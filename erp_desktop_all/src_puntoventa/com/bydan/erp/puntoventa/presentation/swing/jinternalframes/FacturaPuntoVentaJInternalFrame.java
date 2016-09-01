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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.puntoventa.util.FacturaPuntoVentaConstantesFunciones;

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
public class FacturaPuntoVentaJInternalFrame extends FacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarFacturaPuntoVenta;
	
	protected JMenu jmenuFacturaPuntoVenta;
	protected JMenu jmenuDatosFacturaPuntoVenta;
	protected JMenu jmenuArchivoFacturaPuntoVenta;
	protected JMenu jmenuAccionesFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsFacturaPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturaPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormFacturaPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturaPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturaPuntoVenta;	
	
	
	
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

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoFacturaPuntoVentaBeanSwingJInternalFrame tipofacturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofacturapuntoventa="";

	protected EstadoFacturaPuntoVentaBeanSwingJInternalFrame estadofacturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadofacturapuntoventa="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MesaSessionBean mesaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean;
	public EstadoFacturaPuntoVentaSessionBean estadofacturapuntoventaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturaPuntoVenta> facturapuntoventas;		
	public List<FacturaPuntoVenta> facturapuntoventasEliminados;	
	public List<FacturaPuntoVenta> facturapuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturaPuntoVenta;		
	protected JButton jButtonAbrirOrderByFacturaPuntoVenta;
	
	
	//protected JPanel jPanelOrderByFacturaPuntoVenta;
	//public JScrollPane jScrollPanelOrderByFacturaPuntoVenta;	
	//protected JButton jButtonCerrarOrderByFacturaPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturaPuntoVentaLogic facturapuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralFacturaPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturaPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturaPuntoVenta;
	//public JScrollPane jScrollPanelImportacionFacturaPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesFacturaPuntoVenta;
	
    protected JPanel jPanelPaginacionFacturaPuntoVenta;
    protected JPanel jPanelParametrosReportesFacturaPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesFacturaPuntoVenta;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalFacturaPuntoVenta;
	protected Integer iXPanelCamposFintotalFacturaPuntoVenta=0;
	protected Integer iYPanelCamposFintotalFacturaPuntoVenta=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2FacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3FacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4FacturaPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5FacturaPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturaPuntoVenta;
	//protected JPanel jPanelImportacionFacturaPuntoVenta;
	
	
	public JTable jTableDatosFacturaPuntoVenta;
	
	
	
	//public JTable jTableDatosFacturaPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturaPuntoVenta;
	protected JButton jButtonDuplicarFacturaPuntoVenta;
	protected JButton jButtonCopiarFacturaPuntoVenta;
	protected JButton jButtonVerFormFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesFacturaPuntoVenta;
	protected JButton jButtonModificarFacturaPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaFacturaPuntoVenta;
	protected JButton jButtonCerrarFacturaPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionFacturaPuntoVenta;
	
	
	protected JButton jButtonAnterioresFacturaPuntoVenta;
	protected JButton jButtonSiguientesFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosFacturaPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturaPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoFacturaPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturaPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturaPuntoVenta;
	//protected JButton jButtonGenerarImportacionFacturaPuntoVenta;
	//protected JButton jButtonCerrarImportacionFacturaPuntoVenta;
	//protected JFileChooser jFileChooserImportacionFacturaPuntoVenta;
	//protected File fileImportacionFacturaPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaPuntoVenta;
	protected JButton jButtonDuplicarToolBarFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarFacturaPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturaPuntoVenta;
	protected JButton jButtonCopiarToolBarFacturaPuntoVenta;
	protected JButton jButtonVerFormToolBarFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarFacturaPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarFacturaPuntoVenta;
	protected JButton jButtonAnterioresToolBarFacturaPuntoVenta;
	protected JButton jButtonSiguientesToolBarFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturaPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDuplicarFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesFacturaPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturaPuntoVenta;
	protected JMenuItem jMenuItemCopiarFacturaPuntoVenta;
	protected JMenuItem jMenuItemVerFormFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturaPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionFacturaPuntoVenta;
	protected JMenuItem jMenuItemAnterioresFacturaPuntoVenta;
	protected JMenuItem jMenuItemSiguientesFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturaPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturaPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturaPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralFacturaPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteFacturaPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteFacturaPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteFacturaPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteFacturaPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturaPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturaPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturaPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturaPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionFacturaPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionFacturaPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionFacturaPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturaPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoFacturaPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturaPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturaPuntoVenta;
	public JPanel jPanelFK_IdAsientoContableFacturaPuntoVenta;
	public JButton jButtonFK_IdAsientoContableFacturaPuntoVenta;
	public JPanel jPanelFK_IdCajaFacturaPuntoVenta;
	public JButton jButtonFK_IdCajaFacturaPuntoVenta;
	public JPanel jPanelFK_IdClienteFacturaPuntoVenta;
	public JButton jButtonFK_IdClienteFacturaPuntoVenta;
	public JPanel jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta;
	public JButton jButtonFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta;
	public JPanel jPanelFK_IdFormatoFacturaPuntoVenta;
	public JButton jButtonFK_IdFormatoFacturaPuntoVenta;
	public JPanel jPanelFK_IdMesaFacturaPuntoVenta;
	public JButton jButtonFK_IdMesaFacturaPuntoVenta;
	public JPanel jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta;
	public JButton jButtonFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta;
	public JPanel jPanelFK_IdTipoPrecioFacturaPuntoVenta;
	public JButton jButtonFK_IdTipoPrecioFacturaPuntoVenta;
	public JPanel jPanelFK_IdVendedorFacturaPuntoVenta;
	public JButton jButtonFK_IdVendedorFacturaPuntoVenta;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableFacturaPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta;
	
	public JPanel jPanelid_cajaFK_IdCajaFacturaPuntoVenta;
	public JLabel jLabelid_cajaFK_IdCajaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaFacturaPuntoVenta;
	public JButton jButtonid_cajaFK_IdCajaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteFacturaPuntoVenta;
	public JLabel jLabelid_clienteFK_IdClienteFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteFacturaPuntoVenta;
	public JButton jButtonid_clienteFK_IdClienteFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta;
	
	public JPanel jPanelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta;
	public JLabel jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta;
	public JButton jButtonid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoFacturaPuntoVenta;
	public JLabel jLabelid_formatoFK_IdFormatoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoFacturaPuntoVenta;
	public JButton jButtonid_formatoFK_IdFormatoFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesaFK_IdMesaFacturaPuntoVenta;
	public JLabel jLabelid_mesaFK_IdMesaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaFK_IdMesaFacturaPuntoVenta;
	public JButton jButtonid_mesaFK_IdMesaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta;
	public JLabel jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta;
	public JButton jButtonid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorFacturaPuntoVenta;
	public JLabel jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorFacturaPuntoVenta;
	public JButton jButtonid_vendedorFK_IdVendedorFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorFacturaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorFacturaPuntoVentaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta;
	
	
	
	
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
	public FacturaPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturaPuntoVenta)	{
		this.jButtonRecargarInformacionFacturaPuntoVenta = jButtonRecargarInformacionFacturaPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionFacturaPuntoVenta = jButtonProcesarInformacionFacturaPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturaPuntoVenta() {
		return this.jButtonRecargarInformacionFacturaPuntoVenta;
	}
	
	
	public List<FacturaPuntoVenta> getfacturapuntoventas() {
		return this.facturapuntoventas;
	}

	public void setfacturapuntoventas(List<FacturaPuntoVenta> facturapuntoventas) {
		this.facturapuntoventas = facturapuntoventas;
	}
	
	public List<FacturaPuntoVenta> getfacturapuntoventasAux() {
		return this.facturapuntoventasAux;
	}

	public void setfacturapuntoventasAux(List<FacturaPuntoVenta> facturapuntoventasAux) {
		this.facturapuntoventasAux = facturapuntoventasAux;
	}
	
	public List<FacturaPuntoVenta> getfacturapuntoventasEliminados() {
		return this.facturapuntoventasEliminados;
	}

	public void setFacturaPuntoVentasEliminados(List<FacturaPuntoVenta> facturapuntoventasEliminados) {
		this.facturapuntoventasEliminados = facturapuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturaPuntoVenta() {
		return jComboBoxTiposSeleccionarFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturaPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarFacturaPuntoVenta) {
		this.jComboBoxTiposSeleccionarFacturaPuntoVenta = jComboBoxTiposSeleccionarFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturaPuntoVenta() {
		return jTextFieldValorCampoGeneralFacturaPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralFacturaPuntoVenta(
			JTextField jTextFieldValorCampoGeneralFacturaPuntoVenta) {
		this.jTextFieldValorCampoGeneralFacturaPuntoVenta = jTextFieldValorCampoGeneralFacturaPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturaPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosFacturaPuntoVenta) {
		this.jCheckBoxSeleccionarTodosFacturaPuntoVenta = jCheckBoxSeleccionarTodosFacturaPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionadosFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosFacturaPuntoVenta) {
		this.jCheckBoxSeleccionadosFacturaPuntoVenta = jCheckBoxSeleccionadosFacturaPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturaPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturaPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesFacturaPuntoVenta) {
		this.jComboBoxTiposArchivosReportesFacturaPuntoVenta = jComboBoxTiposArchivosReportesFacturaPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturaPuntoVenta() {
		return this.jComboBoxTiposReportesFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturaPuntoVenta(
			JComboBox jComboBoxTiposReportesFacturaPuntoVenta) {
		this.jComboBoxTiposReportesFacturaPuntoVenta = jComboBoxTiposReportesFacturaPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturaPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturaPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta = jComboBoxTiposReportesDinamicoFacturaPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta = jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturaPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturaPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesFacturaPuntoVenta) {
		this.jComboBoxTiposGraficosReportesFacturaPuntoVenta = jComboBoxTiposGraficosReportesFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturaPuntoVenta() {
		return this.jComboBoxTiposPaginacionFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturaPuntoVenta(
			JComboBox jComboBoxTiposPaginacionFacturaPuntoVenta) {
		this.jComboBoxTiposPaginacionFacturaPuntoVenta = jComboBoxTiposPaginacionFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturaPuntoVenta() {
		return this.jComboBoxTiposRelacionesFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesFacturaPuntoVenta = jComboBoxTiposRelacionesFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesFacturaPuntoVenta = jComboBoxTiposAccionesFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturaPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoFacturaPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturaPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturaPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta = jCheckBoxConGraficoDinamicoFacturaPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturaPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturaPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta .setBorder(borderResaltar);		
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
		this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		
		this.facturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturapuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 2850) {
			iWidth=2850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturaPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"copiar","copiar","Copiar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"ver_form","ver_form","Ver"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"recargar","recargar","Recargar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturaPuntoVenta,this.jTtoolBarFacturaPuntoVenta,
							"cerrar","cerrar","Salir"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturaPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturaPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarFacturaPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturaPuntoVenta;
				
		//protected JButton jButtonModificarToolBarFacturaPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturaPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturaPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosFacturaPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturaPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturaPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturaPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturaPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturaPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturaPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturaPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturaPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturaPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturaPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturaPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturaPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturaPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturaPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturaPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturaPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturaPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturaPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturaPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturaPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturaPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturaPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturaPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturaPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturaPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturaPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturaPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturaPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturaPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturaPuntoVenta.add(this.jMenuItemCerrarFacturaPuntoVenta);
			
			this.jmenuAccionesFacturaPuntoVenta.add(this.jMenuItemNuevoFacturaPuntoVenta);
			this.jmenuAccionesFacturaPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosFacturaPuntoVenta);
			this.jmenuAccionesFacturaPuntoVenta.add(this.jMenuItemNuevoRelacionesFacturaPuntoVenta);
			this.jmenuAccionesFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosTablaFacturaPuntoVenta);		
			this.jmenuAccionesFacturaPuntoVenta.add(this.jMenuItemDuplicarFacturaPuntoVenta);		
			this.jmenuAccionesFacturaPuntoVenta.add(this.jMenuItemCopiarFacturaPuntoVenta);		
			this.jmenuAccionesFacturaPuntoVenta.add(this.jMenuItemVerFormFacturaPuntoVenta);		
			
			this.jmenuDatosFacturaPuntoVenta.add(this.jMenuItemRecargarInformacionFacturaPuntoVenta);				
			this.jmenuDatosFacturaPuntoVenta.add(this.jMenuItemAnterioresFacturaPuntoVenta);				
			this.jmenuDatosFacturaPuntoVenta.add(this.jMenuItemSiguientesFacturaPuntoVenta);				
			this.jmenuDatosFacturaPuntoVenta.add(this.jMenuItemAbrirOrderByFacturaPuntoVenta);				
			this.jmenuDatosFacturaPuntoVenta.add(this.jMenuItemMostrarOcultarFacturaPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturaPuntoVenta.add(this.jmenuArchivoFacturaPuntoVenta);		
			this.jmenuBarFacturaPuntoVenta.add(this.jmenuAccionesFacturaPuntoVenta);		
			this.jmenuBarFacturaPuntoVenta.add(this.jmenuDatosFacturaPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturaPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturaPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableFacturaPuntoVenta.setToolTipText("Buscar Por Asiento C ");
		this.jButtonFK_IdAsientoContableFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdAsientoContableFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdAsientoContableFacturaPuntoVenta.setToolTipText("Buscar Por Asiento C ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableFacturaPuntoVenta,"buscar_button","Buscar Por Asiento C ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setText("Asiento C :");
		jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setToolTipText("Asiento C");
		jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta.setFocusable(false);

		this.jPanelFK_IdCajaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaFacturaPuntoVenta.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdCajaFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdCajaFacturaPuntoVenta.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaFacturaPuntoVenta,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaFacturaPuntoVenta = new JLabelMe();
		jLabelid_cajaFK_IdCajaFacturaPuntoVenta.setText("Caja :");
		jLabelid_cajaFK_IdCajaFacturaPuntoVenta.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteFacturaPuntoVenta.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdClienteFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdClienteFacturaPuntoVenta.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteFacturaPuntoVenta,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteFacturaPuntoVenta = new JLabelMe();
		jLabelid_clienteFK_IdClienteFacturaPuntoVenta.setText("Cliente :");
		jLabelid_clienteFK_IdClienteFacturaPuntoVenta.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta.setFocusable(false);

		this.jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta = new JLabelMe();
		jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setText("Estado :");
		jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setToolTipText("Estado");
		jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoFacturaPuntoVenta.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdFormatoFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdFormatoFacturaPuntoVenta.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoFacturaPuntoVenta,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoFacturaPuntoVenta = new JLabelMe();
		jLabelid_formatoFK_IdFormatoFacturaPuntoVenta.setText("Formato :");
		jLabelid_formatoFK_IdFormatoFacturaPuntoVenta.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesaFacturaPuntoVenta.setToolTipText("Buscar Por Mesa ");
		this.jButtonFK_IdMesaFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdMesaFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdMesaFacturaPuntoVenta.setToolTipText("Buscar Por Mesa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesaFacturaPuntoVenta,"buscar_button","Buscar Por Mesa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesaFK_IdMesaFacturaPuntoVenta = new JLabelMe();
		jLabelid_mesaFK_IdMesaFacturaPuntoVenta.setText("Mesa :");
		jLabelid_mesaFK_IdMesaFacturaPuntoVenta.setToolTipText("Mesa");
		jLabelid_mesaFK_IdMesaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesaFK_IdMesaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesaFK_IdMesaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_mesaFK_IdMesaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaFK_IdMesaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta = new JLabelMe();
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setText("Tipo :");
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setToolTipText("Tipo");
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioFacturaPuntoVenta.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoPrecioFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoPrecioFacturaPuntoVenta.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioFacturaPuntoVenta,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorFacturaPuntoVenta.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorFacturaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdVendedorFacturaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdVendedorFacturaPuntoVenta.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorFacturaPuntoVenta,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta.setFocusable(false);


		this.jTabbedPaneBusquedasFacturaPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFacturaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturaPuntoVenta = new FacturaPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factura Punto Venta DATOS");
			this.jInternalFrameDetalleFormFacturaPuntoVenta = new FacturaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.facturapuntoventaSessionBean.getConGuardarRelaciones(),this.facturapuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturaPuntoVenta = null;//new FacturaPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosFacturaPuntoVenta = new JTableMe();      
		
		String sToolTipFacturaPuntoVenta="";
		sToolTipFacturaPuntoVenta=FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaPuntoVenta+="(PuntoVenta.FacturaPuntoVenta)";
		}
		
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturaPuntoVenta.setToolTipText(sToolTipFacturaPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturaPuntoVenta);
		this.jTableDatosFacturaPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosFacturaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturaPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturaPuntoVenta = new JButtonMe();
		this.jButtonDuplicarFacturaPuntoVenta = new JButtonMe();
		this.jButtonCopiarFacturaPuntoVenta = new JButtonMe();
		this.jButtonVerFormFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesFacturaPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturaPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Factura Punto Venta";
		
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFacturaPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalFacturaPuntoVenta.setName("jPanelCamposFintotalFacturaPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoFacturaPuntoVenta=new ReporteDinamicoJInternalFrame(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturaPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturaPuntoVenta=new ImportacionJInternalFrame(FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturaPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturaPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturaPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaPuntoVenta,false,this);
			
			//this.cargarOrderByFacturaPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaPuntoVenta,true,this);
			
			//this.cargarOrderByFacturaPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));//2830
		this.jTableDatosFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));//2830
		this.jTableDatosFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));//2830
		
		this.jScrollPanelDatosFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturaPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarFacturaPuntoVenta.setText("Duplicar");
		this.jButtonCopiarFacturaPuntoVenta.setText("Copiar");
		this.jButtonVerFormFacturaPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesFacturaPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaPuntoVenta,"nuevo_button","Nuevo",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturaPuntoVenta,"duplicar_button","Duplicar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturaPuntoVenta,"copiar_button","Copiar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturaPuntoVenta,"ver_form","Ver",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaPuntoVenta,"cerrar_button","Salir",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturaPuntoVenta.setToolTipText("Nuevo"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturaPuntoVenta.setToolTipText("Duplicar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturaPuntoVenta.setToolTipText("Copiar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturaPuntoVenta.setToolTipText("Ver"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturaPuntoVenta.setToolTipText("Nuevo Rel"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta.setToolTipText("Guardar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaPuntoVenta.setToolTipText("Salir"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturaPuntoVenta";
		inputMap = this.jButtonDuplicarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturaPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarFacturaPuntoVenta";
		inputMap = this.jButtonCopiarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturaPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormFacturaPuntoVenta";
		inputMap = this.jButtonVerFormFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturaPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturaPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturaPuntoVenta";
		inputMap = this.jButtonModificarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturaPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturaPuntoVenta";
		inputMap = this.jButtonCerrarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturaPuntoVenta.setName("jPanelParametrosReportesFacturaPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturaPuntoVenta.setName("jPanelParametrosReportesAccionesFacturaPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturaPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionFacturaPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionFacturaPuntoVenta.setToolTipText("Recargar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturaPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFacturaPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionFacturaPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionFacturaPuntoVenta.setToolTipText("Procesar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturaPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionFacturaPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturaPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturaPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturaPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturaPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesFacturaPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturaPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturaPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturaPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturaPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturaPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturaPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturaPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturaPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturaPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresFacturaPuntoVenta.setText("<<");
        this.jButtonAnterioresFacturaPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturaPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturaPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesFacturaPuntoVenta.setText(">>");
        this.jButtonSiguientesFacturaPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturaPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturaPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturaPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturaPuntoVenta,"nuevoguardarcambios_button","Nue",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturaPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturaPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturaPuntoVenta";
		inputMap = this.jButtonRecargarInformacionFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturaPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturaPuntoVenta";
		inputMap = this.jButtonSiguientesFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturaPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturaPuntoVenta";
		inputMap = this.jButtonAnterioresFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturaPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturaPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),FacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),FacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),FacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturaPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionFacturaPuntoVenta.setLayout(gridaBagLayoutPaginacionFacturaPuntoVenta);						
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonAnterioresFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
					
						
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;//
			
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonNuevoGuardarCambiosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);//
						
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonSiguientesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 1;//
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonNuevoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturaPuntoVenta.gridy = 1;
				this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonNuevoRelacionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			}
			
			
			if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();//
				this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsFacturaPuntoVenta.gridy = 1;//
				this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonGuardarCambiosTablaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);//
			}
			
			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 1;//
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonDuplicarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);//
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 1;//
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonCopiarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);//
		
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 1;//
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonVerFormFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);//
		
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturaPuntoVenta.add(this.jButtonCerrarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionFacturaPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturaPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturaPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturaPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturaPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturaPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturaPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturaPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturaPuntoVenta.setLayout(gridaBagParametrosReportesFacturaPuntoVenta);
			this.jPanelParametrosReportesAccionesFacturaPuntoVenta.setLayout(gridaBagParametrosReportesAccionesFacturaPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1FacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar1FacturaPuntoVenta);
			this.jPanelParametrosAuxiliar2FacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2FacturaPuntoVenta);
			this.jPanelParametrosAuxiliar3FacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar3FacturaPuntoVenta);
			this.jPanelParametrosAuxiliar4FacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar4FacturaPuntoVenta);
			//this.jPanelParametrosAuxiliar5FacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2FacturaPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jButtonRecargarInformacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaPuntoVenta.add(this.jComboBoxTiposPaginacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar1FacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturaPuntoVenta.add(this.jComboBoxTiposReportesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);																		
			
			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturaPuntoVenta.add(this.jComboBoxTiposGraficosReportesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar4FacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jComboBoxTiposReportesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jCheckBoxGenerarReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar2FacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jLabelAccionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jButtonAbrirOrderByFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jComboBoxTiposSeleccionarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jCheckBoxConGraficoReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);															
				
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaPuntoVenta.add(this.jCheckBoxSeleccionadosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);															
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturaPuntoVenta.add(this.jCheckBoxConGraficoReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar3FacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jComboBoxTiposRelacionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
				
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jComboBoxTiposAccionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
	
				
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturaPuntoVenta.add(this.jTextFieldValorCampoGeneralFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalFacturaPuntoVenta= new GridBagLayout();
		this.jPanelCamposFintotalFacturaPuntoVenta.setLayout(gridaBagLayoutCamposFintotalFacturaPuntoVenta);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturaPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosFacturaPuntoVenta.setLayout(gridaBagLayoutDatosFacturaPuntoVenta);
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosFacturaPuntoVenta.add(this.jTableDatosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturaPuntoVenta.setViewportView(this.jTableDatosFacturaPuntoVenta);
		this.jTableDatosFacturaPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosFacturaPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesFacturaPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
			
		this.jPanelAccionesFacturaPuntoVenta.add(this.jButtonNuevoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdAsientoContableFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdAsientoContableFacturaPuntoVenta.add(jLabelid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdAsientoContableFacturaPuntoVenta.add(jComboBoxid_asiento_contableFK_IdAsientoContableFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);


		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdAsientoContableFacturaPuntoVenta.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdAsientoContableFacturaPuntoVenta.add(jButtonFK_IdAsientoContableFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("1.-Por Asiento C ", jPanelFK_IdAsientoContableFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCajaFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdCajaFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdCajaFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdCajaFacturaPuntoVenta.add(jLabelid_cajaFK_IdCajaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdCajaFacturaPuntoVenta.add(jComboBoxid_cajaFK_IdCajaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdCajaFacturaPuntoVenta.add(jButtonFK_IdCajaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("2.-Por Caja ", jPanelFK_IdCajaFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdClienteFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdClienteFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdClienteFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdClienteFacturaPuntoVenta.add(jLabelid_clienteFK_IdClienteFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdClienteFacturaPuntoVenta.add(jComboBoxid_clienteFK_IdClienteFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);


		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdClienteFacturaPuntoVenta.add(this.jButtonBuscarFK_IdClienteid_clienteFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdClienteFacturaPuntoVenta.add(jButtonFK_IdClienteFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("3.-Por Cliente ", jPanelFK_IdClienteFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.add(jLabelid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.add(jComboBoxid_estado_factura_punto_ventaFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta.add(jButtonFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("4.-Por Estado ", jPanelFK_IdEstadoFacturaPuntoVentaFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFormatoFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdFormatoFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdFormatoFacturaPuntoVenta.add(jLabelid_formatoFK_IdFormatoFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdFormatoFacturaPuntoVenta.add(jComboBoxid_formatoFK_IdFormatoFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdFormatoFacturaPuntoVenta.add(jButtonFK_IdFormatoFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("5.-Por Formato ", jPanelFK_IdFormatoFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdMesaFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdMesaFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesaFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesaFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesaFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesaFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdMesaFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdMesaFacturaPuntoVenta.add(jLabelid_mesaFK_IdMesaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdMesaFacturaPuntoVenta.add(jComboBoxid_mesaFK_IdMesaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdMesaFacturaPuntoVenta.add(jButtonFK_IdMesaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("6.-Por Mesa ", jPanelFK_IdMesaFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.add(jLabelid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.add(jComboBoxid_tipo_factura_punto_ventaFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta.add(jButtonFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("7.-Por Tipo ", jPanelFK_IdTipoFacturaPuntoVentaFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoPrecioFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdTipoPrecioFacturaPuntoVenta.add(jLabelid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdTipoPrecioFacturaPuntoVenta.add(jComboBoxid_tipo_precioFK_IdTipoPrecioFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdTipoPrecioFacturaPuntoVenta.add(jButtonFK_IdTipoPrecioFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("8.-Por Tipo Precio ", jPanelFK_IdTipoPrecioFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdVendedorFacturaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorFacturaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorFacturaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorFacturaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorFacturaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorFacturaPuntoVenta.setLayout(gridaBagLayoutFK_IdVendedorFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdVendedorFacturaPuntoVenta.add(jLabelid_vendedorFK_IdVendedorFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 1;
		jPanelFK_IdVendedorFacturaPuntoVenta.add(jComboBoxid_vendedorFK_IdVendedorFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);


		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		jPanelFK_IdVendedorFacturaPuntoVenta.add(this.jButtonBuscarFK_IdVendedorid_vendedorFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturaPuntoVenta.gridy = 1;
		gridBagConstraintsFacturaPuntoVenta.gridx =1;
		jPanelFK_IdVendedorFacturaPuntoVenta.add(jButtonFK_IdVendedorFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);

		jTabbedPaneBusquedasFacturaPuntoVenta.addTab("9.-Por Vendedor ", jPanelFK_IdVendedorFacturaPuntoVenta);
		jTabbedPaneBusquedasFacturaPuntoVenta.setMnemonicAt(8, KeyEvent.VK_9);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturaPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;		
			this.gridBagConstraintsFacturaPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturaPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		*/		
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
				
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturaPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosFacturaPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturaPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturaPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturaPuntoVenta.setName("jPanelReporteDinamicoFacturaPuntoVenta"); 
		
		this.jPanelReporteDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturaPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoFacturaPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoFacturaPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturaPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelColumnasSelectReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturaPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturaPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteFacturaPuntoVenta);
			
			this.jScrollColumnasSelectReporteFacturaPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturaPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jListColumnasSelectReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jScrollColumnasSelectReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturaPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturaPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelRelacionesSelectReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturaPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturaPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteFacturaPuntoVenta);
			
			this.jScrollRelacionesSelectReporteFacturaPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturaPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jListRelacionesSelectReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jScrollRelacionesSelectReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturaPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturaPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturaPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelConGraficoDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jCheckBoxConGraficoDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturaPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelColumnaCategoriaGraficoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturaPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelColumnaCategoriaValorFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturaPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jComboBoxColumnaCategoriaValorFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturaPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelColumnasValoresGraficoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturaPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturaPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturaPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoFacturaPuntoVenta);
			
			this.jScrollColumnasValoresGraficoFacturaPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturaPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jListColumnasSelectReporteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jScrollColumnasValoresGraficoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturaPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturaPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturaPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturaPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturaPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturaPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturaPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturaPuntoVenta.setToolTipText("Generar EXCEL"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jComboBoxTiposReportesDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturaPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturaPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturaPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturaPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturaPuntoVenta.setToolTipText("Generar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jButtonGenerarReporteDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturaPuntoVenta.add(this.jButtonCerrarReporteDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturaPuntoVenta= new JScrollPane(jPanelReporteDinamicoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturaPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturaPuntoVenta);
		this.jInternalFrameReporteDinamicoFacturaPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturaPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturaPuntoVenta.setName("jPanelImportacionFacturaPuntoVenta"); 
		
		this.jPanelImportacionFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturaPuntoVenta.setLayout(gridaBagLayoutImportacionFacturaPuntoVenta);
		
		
		this.jInternalFrameImportacionFacturaPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturaPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionFacturaPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturaPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionFacturaPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturaPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionFacturaPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaPuntoVenta.add(this.jLabelArchivoImportacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturaPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionFacturaPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturaPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionFacturaPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturaPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturaPuntoVenta.setToolTipText("Generar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaPuntoVenta.add(this.jButtonAbrirImportacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturaPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturaPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturaPuntoVenta.add(this.jLabelPathArchivoImportacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturaPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturaPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaPuntoVenta.add(this.jTextFieldPathArchivoImportacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionFacturaPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturaPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturaPuntoVenta.setToolTipText("Generar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaPuntoVenta.add(this.jButtonGenerarImportacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturaPuntoVenta.setToolTipText("Cancelar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturaPuntoVenta.add(this.jButtonCerrarImportacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturaPuntoVenta= new JScrollPane(jPanelImportacionFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturaPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturaPuntoVenta);
		this.jInternalFrameImportacionFacturaPuntoVenta.getContentPane().add(this.jScrollPanelImportacionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturaPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturaPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByFacturaPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturaPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturaPuntoVenta";
			inputMap = this.jButtonAbrirOrderByFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturaPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturaPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturaPuntoVenta.setName("jPanelOrderByFacturaPuntoVenta"); 
			
			this.jPanelOrderByFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturaPuntoVenta.setLayout(gridaBagLayoutOrderByFacturaPuntoVenta);
			
			
			this.jTableDatosFacturaPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosFacturaPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturaPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturaPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturaPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturaPuntoVentaOrderBy.setViewportView(this.jTableDatosFacturaPuntoVentaOrderBy);
			this.jTableDatosFacturaPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturaPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturaPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturaPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturaPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturaPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByFacturaPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturaPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByFacturaPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByFacturaPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturaPuntoVenta.ipady =150;
				
			this.jPanelOrderByFacturaPuntoVenta.add(jScrollPanelDatosFacturaPuntoVentaOrderBy, this.gridBagConstraintsFacturaPuntoVenta);//this.jTableDatosFacturaPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturaPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByFacturaPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturaPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturaPuntoVenta.setToolTipText("Cancelar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturaPuntoVenta.add(this.jButtonCerrarOrderByFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturaPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturaPuntoVenta= new JScrollPane(jPanelOrderByFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturaPuntoVenta);
			
			this.jInternalFrameOrderByFacturaPuntoVenta.getContentPane().add(this.jScrollPanelOrderByFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByFacturaPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//6130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.facturapuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturaPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturaPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFacturaPuntoVenta.getRowHeight();//FacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta.isSelected()) {
					iHeightTable=FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturaPuntoVenta.isSelected()) {
					iHeightTable=FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturaPuntoVenta!=null && this.jInternalFrameOrderByFacturaPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturaPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturaPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturaPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturaPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=facturapuntoventaLogic.getFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturapuntoventas.size();
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
	public static List<FacturaPuntoVenta> TraerFacturaPuntoVentaBeans(List<FacturaPuntoVenta> facturapuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturaPuntoVenta facturapuntoventa:facturapuntoventas) {
					
				if(!(FacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturapuntoventa.setsDetalleGeneralEntityReporte(FacturaPuntoVentaConstantesFunciones.getFacturaPuntoVentaDescripcion(facturapuntoventa));
										
						
					
					

					if(facturapuntoventa.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{facturapuntoventa.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(facturapuntoventa.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(facturapuntoventa.getDetalleFacturaPuntoVentas()!=null && Funciones.existeClass(classes,DetalleFacturaPuntoVenta.class)) {
						try{facturapuntoventa.setdetallefacturapuntoventasDescripcionReporte(new JRBeanCollectionDataSource(DetalleFacturaPuntoVentaJInternalFrame.TraerDetalleFacturaPuntoVentaBeans(facturapuntoventa.getDetalleFacturaPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//facturapuntoventa.setsDetalleGeneralEntityReporte(facturapuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturapuntoventabeans.add(facturapuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturapuntoventas;
    }
	//PARA REPORTES FIN
}
